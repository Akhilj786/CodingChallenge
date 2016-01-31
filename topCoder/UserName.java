package topCoder;
import java.util.*;
public class UserName{
	public static void main(String args[]){

		String existingNames[]={"Bart4", "Bart5", "Bart6", "Bart7", "Bart8", "Bart9", "Bart10",
 "Lisa", "Marge", "Homer", "Bart", "Bart1", "Bart2", "Bart3",
 "Bart11", "Bart12"};
		String newName="Bart";
		System.out.println(newMember(existingNames,newName));
		System.out.println(newMember1(existingNames,newName));



	}
	
	public static  String newMember(String[] existingNames, String newName){
		boolean flag=false;
		int arr[]=new int[existingNames.length];
		int i=0;
		for(String s:existingNames){
			if(s.contains(newName)){
				int temp=extractNumber(s,newName);
				if(temp>0){
					arr[i]=temp;
					flag=true;
					i++;
				}
			}			
		}
		if(flag==false)
			return newName;
		
		return newName+firstPositive(arr,i);

	}

	public static int extractNumber(String s,String newName){
		String temp=s.substring(newName.length(),s.length());
		int num=0;
		if(!temp.equals(""))
			num=Integer.parseInt(temp);
		return num;
		
	}

	public static int firstPositive(int arr[],int size){
		
		for(int i = 0; i < size; i++){
    	if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
      	arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
  		}
 
  // Return the first index value at which is positive
  		for(int i = 0; i < size; i++)
    		if (arr[i] > 0)
      			return i+1;  // 1 is added becuase indexes start from 0
 
  		return size+1;
	}
	public static String  newMember1(String[] existingNames, String newName)  
  { 
        int number = 0; 
        String name = newName; 

        boolean found = false; 
        do 
        { 
            found = false; 
            for (int i=0; i < existingNames.length; i++) 
            { 
                if (existingNames[i].equals(name)) 
                { 
                    found = true; 
                    break; 
                } 
            } 

            if (found) 
            { 
                number++; 
                name = newName + number; 
            } 

        } while(found); 

        return name; 

  } 
}