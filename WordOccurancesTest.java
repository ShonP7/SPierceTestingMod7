import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class WordOccurancesTest {
	

	public String caseCheck1(String w) throws FileNotFoundException {
		Scanner theRaven = new Scanner(new File ("theRaven.txt"));
		
		while(theRaven.hasNext()) {
			String words = theRaven.next();
			String lowerCaseWords = words.toLowerCase();
			lowerCaseWords = lowerCaseWords.replace("," , " ");
			lowerCaseWords = lowerCaseWords.replace("." , " ");
			lowerCaseWords = lowerCaseWords.replace(";" , " ");
			lowerCaseWords = lowerCaseWords.replace(":" , " ");
			lowerCaseWords = lowerCaseWords.replace("?" , " ");
			lowerCaseWords = lowerCaseWords.replace("!" , " ");
			lowerCaseWords = lowerCaseWords.replace("'" , " ");
			lowerCaseWords = lowerCaseWords.replace("-" , " ");
			lowerCaseWords = lowerCaseWords.replace("_" , " ");
			lowerCaseWords = lowerCaseWords.replace("--" , " ");
			lowerCaseWords = lowerCaseWords.replaceAll(" ", "");
			lowerCaseWords = lowerCaseWords.replaceAll("-", "");
			
		
}		
		return w;
	}
		public void arrayOrder (String h, Integer k) {
			try (Scanner theRaven = new Scanner(new File ("theRaven.txt")); {
				TreeMap<String, Integer> arrayInput = new TreeMap<String, Integer>();
				 
				while(theRaven.hasNext()) {
					String words = theRaven.next();
					String lowerCaseWords = words.toLowerCase();
					lowerCaseWords = lowerCaseWords.replace("," , " ");
					lowerCaseWords = lowerCaseWords.replace("." , " ");
					lowerCaseWords = lowerCaseWords.replace(";" , " ");
					lowerCaseWords = lowerCaseWords.replace(":" , " ");
					lowerCaseWords = lowerCaseWords.replace("?" , " ");
					lowerCaseWords = lowerCaseWords.replace("!" , " ");
					lowerCaseWords = lowerCaseWords.replace("'" , " ");
					lowerCaseWords = lowerCaseWords.replace("-" , " ");
					lowerCaseWords = lowerCaseWords.replace("_" , " ");
					lowerCaseWords = lowerCaseWords.replace("--" , " ");
					lowerCaseWords = lowerCaseWords.replaceAll(" ", "");
					lowerCaseWords = lowerCaseWords.replaceAll("-", "");
					
					
					if(arrayInput.containsKey(lowerCaseWords)) {
						int count = arrayInput.get(lowerCaseWords) + 1;
						arrayInput.put(lowerCaseWords, count);
					}
					else {
						arrayInput.put(lowerCaseWords, +1);	
						
						}
					} 	
				
				LinkedHashMap<String, Integer> entryOutput = arrayInput.entrySet().stream().sorted(Entry.comparingByValue())
						.collect(
								Collectors.toMap(Entry::getKey,  Entry::getValue, (x,y) -> x, LinkedHashMap::new));
						
					for(HashMap.Entry<String, Integer> sortedEntryOutput:entryOutput.entrySet()) {	
					 System.out.println(sortedEntryOutput);
					 
				}
			
		}
		}
		

}
	


	

	

