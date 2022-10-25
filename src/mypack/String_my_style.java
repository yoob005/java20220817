package mypack;

import java.util.*;

public class String_my_style {
	public static void main(String[] args) {
//			String[] strings = { "abce", "abcd", "cdx", "aacd", "arcd", "adcd", "azcd", "ahcd", "affcd" };
			String[] strings = {"acahfdah","bdasdgadsfg","cdasdgfadh","deadfhdfh","etafdhfdhd","fdafhfd","fadfhadfhc","gadfhadra","hdafhadfhd","jgadfhfg"}; 
			int n = 6 ;
			String[] answer = new String[strings.length];
			String[] back = new String[strings.length];
			String[] front = new String[strings.length];
			
			for(int i = 0; i < strings.length; i++) {
				back[i] = strings[i].substring(n);
			}
			List<String> backList = new ArrayList<>(Arrays.asList(back));
			Collections.sort(backList);
			System.out.println(backList);
			List<String> strsList = new ArrayList<>(Arrays.asList(strings));
			Collections.sort(strsList);
			System.out.println(strsList);
			for(int i = 0; i < strings.length; i++) {
				for(int j = 0; j < strsList.size(); j++) {
					if(backList.get(i).equals(strsList.get(j).substring(n))) {
						answer[i] = strsList.get(j);
						strsList.remove(j);	
						break;
					}
				}
			}
			List<String> testList = Arrays.asList(answer);
			System.out.println(testList);
			
			
			
			
			
			
			
	}
}
