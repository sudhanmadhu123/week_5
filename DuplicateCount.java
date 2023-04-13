class DuplicateCount{
  public static void main(String args[]){
    String str = "mmndhjsm";
    char ch[] = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    int dupcount = 1,otcount=0;
    for (int i = 0; i < ch.length; i++) {
      dupcount=1;
      otcount=1;
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          dupcount++;
          ch[j] = ' ';
        }
        else{
          otcount++;
          ch[j]=' ';
        }
      }
     if (ch[i] !=' ' && dupcount > 1) {
 
       System.out.println("Duplicate count:"+dupcount);
       System.out.println("Other count:"+otcount);
     }
    if(dupcount==otcount){
      System.out.println("yes");
      break;
    }
    else{
      System.out.println("No");
      break;
    }
    }
  }
}