import java.io.File;
import java.io.IOException;
import java.util.*;

import com.juulis.codeaid.FindSimilarStrings;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner user_input = new Scanner(System.in);
		System.out.print("Directory: ");
		File dir = new File(user_input.next());
		
		
		
		List<String> contentList = DirContent.getContent(dir);
		
//		Collections.sort(contentList);
//		contentList.forEach(System.out::println);
//		System.out.println();
		
		
		//iterates all list objects with each other, sending them to FindSimilarStrings one by one, no strings compares twice.
		for (int i=0; i<contentList.size()-1; i++) {
		    for (int j=i+1; j<contentList.size(); j++) {
		    	String x = FindSimilarStrings.getSimilarity(contentList.get(i),contentList.get(j));
		    	if(x!=null)
		    		System.out.println(x);
		    }
		}
//		System.out.println(contentList.size()+" files.");
		
//		for(String a : contentList){
//			for(String b : contentList){
//				String x = FindSimilarStrings.getSimilarity(a, b);
//				if(a != b && x != null){
//				System.out.println(x);
//				}
//			}
//		}
		
		user_input.close();
	}

	
}
