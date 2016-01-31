package topCoder;
import java.util.*;
//https://community.topcoder.com/stat?c=problem_statement&pm=2911&rd=5849
public class MatchMaking{
	public static void main(String args[]){
		String namesWomen[]={"F", "M", "S", "h", "q", "g", "r", "N", "U", "x", "H", "P", "o", "E", "R", "z", "L", "m", "e", "u", "K", "A", "w", "Q", "O", "v", "j", "a", "t", "p", "C", "G", "k", "c", "V", "B", "D", "s", "n", "i", "f", "T", "I", "l", "d", "J", "y", "b"};
		String ansWomen[]= {"abaabbbb", "bbaabbbb", "aaabaaab", "aabbaaaa", "baabbaab", "aaababba", "bbabbbbb", "bbbabbba", "aaabbbba", "aabbbaaa", "abbabaaa", "babbabbb", "aaaaabba", "aaaabbaa", "abbbabaa", "babababa", "abbaaaaa", "bbababba", "baaaaaba", "baaaaabb", "bbbbabba", "ababbaaa", "abbbabab", "baabbbaa", "bbbaabbb", "aababbab", "ababbabb", "abbaabba", "baabbabb", "aaabaaab", "aabbbaba", "aabaaabb", "abababba", "aabbaaaa", "aabbabaa", "bababaaa", "aabaaaab", "bbbbaabb", "baaababb", "abaabbab", "aabbbaaa", "baabbaba", "bbabbbaa", "aabbbbaa", "abbbaaab", "abababbb", "ababaaba", "bababaaa"};
		String namesMen[]=  {"f", "C", "v", "g", "Q", "z", "n", "c", "B", "o", "M", "F", "u", "x", "I", "T", "K", "L", "E", "U", "w", "A", "d", "t", "e", "R", "D", "s", "p", "q", "m", "r", "H", "j", "J", "V", "l", "a", "k", "h", "G", "y", "i", "P", "O", "N", "b", "S"};
		String ansMen[]= {"bbbaabab", "bbabaabb", "ababbbbb", "bbbababb", "baababaa", "bbaaabab", "abbabbaa", "bbbabbbb", "aabbabab", "abbababa", "aababbbb", "bababaab", "aaababbb", "baabbaba", "abaaaaab", "bbaababa", "babaabab", "abbabbba", "ababbbab", "baabbbab", "babbaaab", "abbbbaba", "bbabbbba", "baaabaab", "ababbabb", "abbbaabb", "bbbbaabb", "bbbaaabb", "baabbaba", "bbabaaab", "aabbbaab", "abbbbabb", "bbaaaaba", "bbbababa", "abbaabba", "bababbbb", "aabaaabb", "babbabab", "baaaabaa", "ababbaba", "aaabaabb", "bbaaabaa", "baaaaabb", "bbaabaab", "bbababab", "aabaaaab", "aaaaabab", "aabbaaba"};
		String queryWoman="U";
		System.out.println(makeMatch(namesWomen,ansWomen,namesMen,ansMen,queryWoman));
	}

	public static String  makeMatch(String[] namesWomen, String[] answersWomen, String[] namesMen, String[] answersMen, String queryWoman){
		Person men[]=new Person[namesMen.length];
		Person women[]=new Person[namesWomen.length];
		for (int i=0; i < women.length; ++i) {
      		women[i] = new Person(namesWomen[i],answersWomen[i]);
      		men[i] = new Person(namesMen[i],answersMen[i]);
    	}
		Arrays.sort(men);
		Arrays.sort(women);
		
		for (int i=0; i < women.length; ++i) {
      		int bestMan = -1;
      		int best = -1;
      		for (int j=0; j < men.length; ++j) {
        		if (!men[j].isActive) continue;
        			int matches = women[i].countMatch(men[j]);
        		if (matches > best) {
          			best = matches;
          			bestMan = j;
        		}
      		}
      		men[bestMan].isActive = false;
      		if (women[i].name.equals(queryWoman)) return men[bestMan].name;
    	}
    return null;
	}
}
class Person implements Comparable{
	String name;
	String answer;
	boolean isActive=true;

	Person(String name,String ans){
		this.name=name;
		this.answer=ans;
	}

	public int countMatch(Object obj){
		int count=0;
		Person p=(Person)obj;
		for(int i=0;i<answer.length();i++){
			char c1=this.answer.charAt(i);
			char c2=p.answer.charAt(i);
			if(c1==c2)
				count++;
		}
		return count;
	}


	public int compareTo(Object obj){
		Person p=(Person)obj;
		return(this.name.compareTo(p.name));
	}

	public String toString(){
		return name;
	}
	
}