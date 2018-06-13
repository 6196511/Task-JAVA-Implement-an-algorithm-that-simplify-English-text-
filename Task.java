public class Task {
       public static String Change1(String text){ //ce=>se
       String newtext = "";
       if(text.indexOf("ce") != -1){
       newtext = text.replace("ce","se"); 
       }else{
       newtext = text;}
       System.out.println(newtext);
       String result = newtext;
       return result;}        
       
       public static String Change2(String text){ //ci=>si
       String newtext = "";
       if(text.indexOf("ci") != -1){
       newtext=text.replace("ci","si"); 
       }else{
       newtext=text;}
       String result = newtext;
       return result;}

      public static String Change3(String text){//ck=>k 
       String newtext = "";
       if(text.indexOf("ck") != -1){
       newtext=text.replace("ck","k"); 
       }else{
       newtext=text;}
       String result = newtext;
       return result;}
         
       public static String Change4(String text){//c=>k
       String newtext = "";
       if (text.indexOf("c") != -1){
       newtext=text.replace("c","k");
       }else{
       newtext=text;}
       String result = newtext;
       return result;}
        
      public static String Change5(String text){//ee=>i
       String newtext = "";
       if (text.indexOf("ee") != -1){
       newtext=text.replace("ee","i");
       }else{
       newtext=text;}
       String result = newtext;
       return result;}

       public static String Change6(String text){//oo=>u
       String newtext = "";
        if (text.indexOf("oo") != -1){
       newtext=text.replace("oo","u");
       }else{
       newtext=text;}
       String result = newtext;
       return result;}
       
       public static String Change7(String text){//double letter
       String newtext = "";
       newtext = text.replaceAll("([A-Za-z])\\1","$1");
       String result = newtext;
       return result;}

       public static String Change8(String text){//remove e from the end of the word>1 length
       String newtext = "";
       String[] parts = text.split(" ");
       String part1 = "";
       for (String part : parts) 
       {if (part.length()>1){
       part1 = part.replaceAll("e(?!\\S)","");
       newtext = newtext.concat(part1+' ');
        }else{
       part1=part;
       newtext = newtext.concat(part1+' ');}}
       String result = newtext;
       return result;}

       public static String Change9(String text){//remove 'a' article
       String newtext = "";
       newtext = text.replaceAll("\\ba\\b|\\bA\\b","");
       String result = newtext;
       return result;}

       public static String Change10(String text){//remove 'an' article
       String newtext = "";
       newtext = text.replaceAll("\\ban\\b|\\bAn\\b","");
       String result = newtext;
       return result;}

       public static String Change11(String text){//remove 'th (the)' article
       String newtext = "";
       newtext = text.replaceAll("\\bth\\b|\\bTh\\b","");
       String result = newtext;
       return result;}

       public static void main(String args[]) {
 

       String text0 = "A The An cacao and coffee success a an the e me be";//original text
       System.out.println("ORIGINAL TEXT: " +text0);
       String text1 = "";//ce=>se
       String text2 = "";//ci=>si
       String text3 = "";//ck=>k 
       String text4 = "";//c=>k
       String text5 = "";//ee=>i
       String text6 = "";//oo=>u
       String text7 = "";//double letter
       String text8 = "";//remove e from the end of the word 
       String text9 = "";//remove 'a' article
       String text10 = "";//remove 'an' article
       String text11 = "";//remove 'th (the)' article
 
       text1=Change1(text0); 
       System.out.println(text1);
       text2=Change2(text1);
       System.out.println(text2);
       text3=Change3(text2); 
       System.out.println(text3);
       text4=Change4(text3);
       System.out.println(text4);
       text5=Change5(text4);  
       System.out.println(text5);
       text6=Change6(text5); 
       System.out.println(text6);
       text7=Change7(text6);  
       System.out.println(text7);
       text8=Change8(text7);  
       System.out.println(text8);
       text9=Change9(text8); 
       System.out.println(text9); 
       text10=Change10(text9);  
       System.out.println(text10);
       text11 = Change11(text10);
       System.out.println(text11);
       System.out.println("FINAL RESULT: " +text11); }}