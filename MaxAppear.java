public class MaxAppear {
        
    public static void main(String[] args) {
 
        String str="hi hello welcome to bitLabs hi hello hi";
        int max=0;
        String words[]=str.split(" ");
        int count=1;
        String word=null;
        for(int i=0;i<words.length;i++) {
            for(int j=i+1;j<words.length;j++) {
                
                if(words[i].equals(words[j])) {
                    count++;
                    words[j]=" ";
                }
            }
            if(max<count) {
                max=count;
                word=words[i];
            }
            count=1;
        }
        System.out.println(word);
    
    }
               
}