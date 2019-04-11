import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
       Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int freq[] = new int[70]; 
        for(int idx = 0; idx < 70; idx++){
            freq[idx] = 0;
        }
      for(int idx = 0; idx < str_len; idx++)
        {
            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
            {
              freq[sb.charAt(idx)-'A']++;
            }
        if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
            {
        freq[sb.charAt(idx)-'a']++;
    }
}
      for(int i=0;i<=25;i++)
      {
        if(freq[i]==0)
        {
          char Alpha=(char)(i+'a');
          System.out.print(Alpha+" ");
        }
      }
    }
}
