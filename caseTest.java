import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class caseTest {

	@Test
	void test() throws FileNotFoundException {
		WordOccurancesTest upperCase = new WordOccurancesTest();
		String output = upperCase.caseCheck1("theRaven.txt");
		assertEquals(w, output);
		
		WordOccurancesTest array = new WordOccurancesTest();
		Integer arrayOut = array.arrayOrder(and, arrayOut);		
	}

	
	
}
