package NewPackage;

public class ReverseString  {
	public static void reverse(char[] arr) {
		int left=0;
		int right=arr.length-1;
		while(left < right) {
			//stop characters
			char temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			
			right--;
			
			
		}
	}
   public static void main(String args[]) {
	   char[] letters= {'h','e','l','l','o'};
	   reverse(letters);
	   System.out.println("Reversed:");
	   System.out.println(letters);
   }

}
