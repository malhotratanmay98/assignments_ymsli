package q2_find_frequency_of_each_word;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class FindFrequency {

	public static void main(String[] args) {
		
Map<String, Integer> map=new HashMap<String, Integer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("story.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				
				String tokens[] = line.split(" ");
				
				for (String token : tokens) {
					 token= token.toLowerCase();
					 
						Integer freq=map.get(token);
						if(freq==null) {
							map.put(token, 1);
						}else {
							map.put(token, ++freq);
						}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("Frequency of each word in story.txt is: ");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" appears "+ entry.getValue()+" times.");
		}
		
		
	}
	
}
