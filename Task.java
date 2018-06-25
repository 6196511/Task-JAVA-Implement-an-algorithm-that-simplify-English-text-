public class Task {
       
       
       public static String removeC (String text){ 
       String newtextRemoveC = "";
       if (text.contains("ce")){
       newtextRemoveC = text.replace("ce","se"); 
       }else{
       newtextRemoveC = text;
       }
       if (newtextRemoveC.contains("ci")){
       newtextRemoveC=newtextRemoveC.replace("ci","si");
       }else{
       ;
       }
       if (newtextRemoveC.contains("ck")){
       newtextRemoveC=newtextRemoveC.replace("ck","k"); 
       }else{
       ;
       }
       if (newtextRemoveC.contains("c")){
       newtextRemoveC=newtextRemoveC.replace("c","k");         
       }else{
       ;
       }
       String result = newtextRemoveC;
       return result;
       }        
      
           
       public static String removeDoubles(String text){
       String newtextRemoveDoubles = "";
       if (text.contains("ee")){
       newtextRemoveDoubles=text.replace("ee","i");
       }else{
       newtextRemoveDoubles=text;
       }
       if (newtextRemoveDoubles.contains("oo")){
       newtextRemoveDoubles=newtextRemoveDoubles.replace("oo","u");
       }else{
       ;
       }
       newtextRemoveDoubles = newtextRemoveDoubles.replaceAll("([A-Za-z])\\1+","$1");
       String result = newtextRemoveDoubles;
       return result;
       }

       
       public static String removeEInTheEnd(String text){//remove e from the end of the word>1 length
       String newtextRemoveE = "";
       String[] parts = text.split(" ");
       String partRemoveE = "";
       for (String part : parts) {
            if (part.length()>1){
            partRemoveE = part.replaceAll("e(?!\\S)","");
            newtextRemoveE = newtextRemoveE.concat(partRemoveE+' ');
            }else{
            partRemoveE=part;
            newtextRemoveE = newtextRemoveE.concat(partRemoveE+' ');
            }
       }
       String result = newtextRemoveE;
       return result;
       }
       
       
       public static String removeArticles(String textOriginal, String textEdited){
       String newtextRemoveArt = "";
       String partRemoveArt = "";
       String[] partsOriginal = textOriginal.split(" ");
       String[] partsEdited = textEdited.split(" ");
       for (int i = 0; i < partsOriginal.length; i++)
            if (partsOriginal[i].equals("a")||partsOriginal[i].equals("A")){;
            }else if(partsOriginal[i].equals("the")||partsOriginal[i].equals("The")){
            ;
            }else if(partsOriginal[i].equals("an")||partsOriginal[i].equals("An")){
            ;
            }else{
            partRemoveArt = partsEdited[i];
            newtextRemoveArt = newtextRemoveArt.concat(partRemoveArt+' ');
       }
       String result = newtextRemoveArt;
       return result;
       }


       public static void main(String args[]){
       String TEXT_ORIGINAL = "Bob Thuuuuu aa a AA A The An cacao and coffee success a an the e me be thhe Ann";
       System.out.println("ORIGINAL TEXT: " +TEXT_ORIGINAL);
       String textEdited = "";
       textEdited=removeC(TEXT_ORIGINAL); 
       System.out.println(textEdited);
       textEdited=removeDoubles(textEdited); 
       System.out.println(textEdited); 
       textEdited=removeEInTheEnd(textEdited);  
       System.out.println(textEdited);
       textEdited=removeArticles(TEXT_ORIGINAL, textEdited); 
       System.out.println("FINAL RESULT: " +textEdited); 
       }
}
