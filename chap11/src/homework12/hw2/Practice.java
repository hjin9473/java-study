package homework12.hw2;

public class Practice {
	 public void takeState(String[] str) {
		 for (int i = 0; i < str.length; i++) {
			 String array = str[i];
			 int point1 = (array.indexOf(" "));
			 int point2 = (array.indexOf("구")); 
			

		 if (point2 == -1) {
	            System.out.println("null");
	        } else {
	            System.out.println(array.substring(point1 + 1, point2 + 1));
	        }

		 if (point2 != -1 && point2 == point1 + 1) {
			 System.out.println("null");
            } else {
            	System.out.println(array.substring(point1 + 1 , point2 + 1));
            }
 
			 
		}
	 }
	 
	 

}
