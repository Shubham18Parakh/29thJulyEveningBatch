package commonlyusedmethods_study;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class UsingInfo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		String myData = TestingByFatching.readexcelsheet("coverfoxdata", 0, 0);
		System.out.println(myData);

	}

}
