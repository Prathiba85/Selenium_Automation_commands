package Selenium_commands;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "mightandmagic";
		String s2 = "andmagicmigth";
		Solution obj = new Solution();
		System.out.println(obj.areRotations(s1,s2 ));

	}

}
class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
    	if(s1.length()!=s2.length())
    		return false;
    	
    	String s3 = s1+s1;
    	
    	if(s3.indexOf(s2)!=-1)
    	return true;
    	else
		return false;
        // Your code here
    }
    
}