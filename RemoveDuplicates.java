package Assignment.week3;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java session in java week1";
		int count =0;
		
		String[] str = text.split(" ");
		System.out.println(str.length);
		for(int i=0;i<str.length; i++){
			 
			for(int j=i+1; j<str.length-1; j++) {
				
				if(str[i].equals(str[j])) {
					
					count++;
				}
			}
			
		}
		System.out.println("No of times java repeated "+count+" times");
		if(count>1) {
			String trim = text.trim();
			String replace = trim.replace("java", "");
			System.out.println(replace);
			
		}
		
	}

}
