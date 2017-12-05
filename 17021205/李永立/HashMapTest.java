package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.print.attribute.HashAttributeSet;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年12月5日 上午8:33:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class HashMapTest {
	public static void main(String[] args) {
		
		//HashMap集合类存储对象
		//HashMap<K,V> hashmap = new HashMap<K,V>();
		HashMap<Country,String> hashMap = new HashMap<Country, String>();
		
		Country  China = new Country("China", 16);
		Country  japan = new Country("japan", 2);
		Country  India = new Country("India", 11);
		
		hashMap.put(China, "Beijing");
		hashMap.put(japan, "Beijing");
		hashMap.put(India, "Beijing");
		
		//迭代器
		
		 Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		 while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString()+"首都"+value);
		}
		
		
		
	}

}
