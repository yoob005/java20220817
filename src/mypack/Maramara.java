package mypack;

import java.util.*;

public class Maramara {
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
	
		 List<String> listC = new ArrayList<String>(Arrays.asList(completion)); 
		 List<String> listP = new ArrayList<String>(Arrays.asList(participant));
		 Collections.sort(listC);
		 Collections.sort(listP);
		 String answer = "";	
			for(int i = 0; i < listC.size(); i++) {
				if(!listP.get(i).equals(listC.get(i))) {
					answer = listP.get(i);
					return answer;
				}
			}
			answer = listP.get(listP.size()-1);
			
		
			System.out.println(answer);

		
	}
}
