import java.util.*;
public class HackerRank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
        int n = in.nextInt();
        String number = in.next();
        int count = 0,s;
        List<String> arr = new ArrayList<String>();
        int size;
        for(int i = n-1; i >= 0;i--){
        	arr.add(0,number.charAt(i)+"");
        	if(Integer.parseInt(number.charAt(i)+"") % 8 == 0)
        		count++;
        	 System.out.println(arr);
        	size = arr.size();
        	int k = 0;
        	for(int j = 1; j < size; j++){
        			 String st = number.charAt(i)+arr.get(j+k);
                     arr.add(0,st);
                     k++;
                     s = Integer.parseInt(st);
                     if(s % 8 == 0)
                    	 count++;
        	}
        }
        System.out.println(arr);
        int m = (1000000000+7);
        System.out.println((count%m));
	}

}