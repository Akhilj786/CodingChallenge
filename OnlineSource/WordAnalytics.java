package OnlineSource;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordAnalytics{
	TreeMap<String,Integer> wordMap=null;
	TreeMap<Character,Integer> letterMap=null;
	static StringBuilder text = new StringBuilder();
	private static final Pattern WORD_PATTERN = Pattern.compile("\\w+");
    private static final Pattern LETTER_PATTERN = Pattern.compile("\\w");
    private static final Pattern SYMBOL_PATTERN = Pattern.compile("[^\\w\\s]");

    public WordAnalytics(){
    	wordMap=new TreeMap<String,Integer>();
    	letterMap=new TreeMap<Character,Integer>();
    }

	public static void main(String args[]){
		String file="Input2.txt";
		processFile(file);
		StringBuilder sb = new StringBuilder();
		sb.append(processWord()+" words\n");
		sb.append(processLetter()+" letters\n");
		sb.append(processSymbol()+" symbols\n");

		String[] topWords = getTopWords();
		String[] topLetter = getTopLetters();
		StringBuilder un_used= getUnUsedLetters();
        sb.append("Top three most common words: ")
            .append(topWords[0]).append(", ")
            .append(topWords[1]).append(", ")
            .append(topWords[2]).append("\n");
        sb.append("Top three most common Letters: ")
            .append(topLetter[0]).append(", ")
            .append(topLetter[1]).append(", ")
            .append(topLetter[2]).append("\n");
        sb.append("Letters not used in the document:");
        sb.append(un_used);
        System.out.println(sb);
	}

	public static void processFile(String fileName){
		try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{

			String sCurrentLine;
			StringBuilder sb = new StringBuilder();
			while ((sCurrentLine = br.readLine()) != null) {
				text.append(sCurrentLine);
			}


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int processWord(){
		return count(WORD_PATTERN);
	}

	public static int processLetter(){
		return count(LETTER_PATTERN);
	}

	public static int  processSymbol(){
		return count(SYMBOL_PATTERN);	
	}

	private static int count(Pattern pattern) {
        Matcher matcher = pattern.matcher(text);
        int occurences = 0;
        while (matcher.find()) {
            occurences++;
        }
        return occurences;
    }

    public static String [] getTopWords(){
    	return(getTopOccurences(WORD_PATTERN));
    }
    public static String [] getTopLetters(){
    	return(getTopOccurences(LETTER_PATTERN));
    }

   private static String[] getTopOccurences(Pattern pattern) {
        Matcher matcher = pattern.matcher(text);
        Map<String, Integer> counts = new HashMap<String, Integer>();
        while (matcher.find()) {
            String occurence = matcher.group().toLowerCase();
            int count = counts.containsKey(occurence) ? counts.get(occurence) + 1 : 1;
            counts.put(occurence, count);
        }
        String[] topOccurences = new String[3];
        for (int i = 0; i < 3; i++) {
            String[] occurences = counts.keySet().toArray(new String[0]);
            String topOccurence = occurences[0];
            for (String occurence : occurences) {
                if (counts.get(occurence) > counts.get(topOccurence)) {
                    topOccurence = occurence;
                }
            }
            topOccurences[i] = topOccurence;
            counts.remove(topOccurence);
        }
        return topOccurences;
    }

    public static StringBuilder getUnUsedLetters(){
    	return(getUnUsed(LETTER_PATTERN));
    }

    public static StringBuilder getUnUsed(Pattern pattern){
    	Matcher matcher = pattern.matcher(text);
    	boolean checkString[]=new boolean[26];
    	StringBuilder un_used=new StringBuilder();
    	

    	while (matcher.find()) {
    		 String occurence = matcher.group().toLowerCase();
    		 char c=occurence.charAt(0);
    		 if(c>='a' && c<='z'){
    			int k=(int)c-97;
    			checkString[k]=true;
    		}
    	}
    	for(int i=0;i<26;i++){
    		if(!checkString[i]){
    			char temp=(char)(i+97);
    			un_used.append(temp+",");

    		}
    	}
    	un_used.setLength(un_used.length() - 1);
    	return un_used;
    }
}