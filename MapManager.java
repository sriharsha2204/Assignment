package collectionexamples;


import java.util.*;
public class MapManager {

	static Set getKeys(HashMap<Integer,String> map)
	{
		Set keyset=map.keySet();
		return keyset;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes"); 
		   System.out.println(getKeys(map));

	}

}