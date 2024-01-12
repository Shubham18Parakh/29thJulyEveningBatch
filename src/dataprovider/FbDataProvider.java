package dataprovider;

import org.testng.annotations.DataProvider;

public class FbDataProvider {
  
	  
	  //method ---->>> data provider
	  //firstName LastName MobNum
	  
	 @DataProvider (name="FBRegression")
	 public static String[][] FbDataSetTest() 
	 {
		 String data [][]= {{"Shubham","Jain","7987208816"},{"Arman","Rawal","7689012453"},{"Aditi","Jain","8978564732"}};
		return data;
	 }
	 @DataProvider (name="FBSanity")
	 public static String[][] FbDataSetTest1() 
	 {
		 String data [][]= {{"shreya","Jain","7987208814"},{"Amisha","Rawal","7689012653"},{"nilam","Jain","8978564632"}};
		return data;
	 }
	  
  }

