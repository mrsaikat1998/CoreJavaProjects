package com.nt.cursorobjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorTestMap {

	public static void main(String[] args) {
		//create HashMap Objects
		Map<Integer,String> map=new HashMap<>();
		//put elements into HashMap
		map.put(1, "WB");
		map.put(2, "UP");
		map.put(3, "MP");
		map.put(4, "KP");
		map.put(5, "DP");
		//create Iterator Object by Type Map.Entry<Integer,String> and calling entrySet() method
		Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
		//iterate the value 
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entryMap=itr.next();
			System.out.print(entryMap.getKey()+"-"+entryMap.getValue()+"   ");
		}

	}

}
