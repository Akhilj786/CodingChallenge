package topCoder;
import java.util.*;
public class GroceryBagger{
	public static void main(String args[]){
		int strength=2;
		String itemType[]={	"DAIRY",
							"DAIRY",
							"PRODUCE",
							"PRODUCE",
							"PRODUCE",
							"MEAT"};
		System.out.println(minimumBags(strength,itemType));
	}
	public static 	int minimumBags(int strength, String[] itemType){
		Hashtable<String,Integer> hash=new Hashtable<String,Integer>();
		int noBags=0;
		for(String s:itemType){
			if(hash.containsKey(s))
				hash.put(s,hash.get(s)+1);
			else
				hash.put(s,1);
		}
		Set<String> keys = hash.keySet();
        for(String key: keys){
            int bags=(int)Math.ceil(hash.get(key)/(strength*1.0));
            noBags+=bags;
        }
        return noBags;

	}
}