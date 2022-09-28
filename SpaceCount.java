package practice;

public class SpaceCount {
	public static void main(String[] args) {
		String s1="shashi kumar gupta";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
