public class Task {
       
       
       public static String removeC (String text){ 
       String newtextRemoveCe = "";//ce=>se
       String newtextRemoveCi = "";//ci=>si
       String newtextRemoveCk = "";//ck=>k 
       String newtextRemoveC = "";//c=>k
       if(text.indexOf("ce") != -1){
       newtextRemoveCe = text.replace("ce","se"); 
       }else{
       newtextRemoveCe = text;
       }
       if (newtextRemoveCe.indexOf("ci") != -1){
       newtextRemoveCi=newtextRemoveCe.replace("ci","si");
       }else{
       newtextRemoveCi = newtextRemoveCe;
       }
       if (newtextRemoveCi.indexOf("ck") != -1){
       newtextRemoveCk=newtextRemoveCi.replace("ck","k"); 
       }else{
       newtextRemoveCk = newtextRemoveCi;
       }
       if (newtextRemoveCk.indexOf("c") != -1){
       newtextRemoveC=newtextRemoveCk.replace("c","k");         
       }else{
       newtextRemoveC = newtextRemoveCk;
       }
       String result = newtextRemoveC;
       return result;
       }        
       
        
       public static String removeDoubles(String text){
       String newtextRemoveEe = "";//ee=>i
       String newtextRemoveOo = "";//oo=>u
       String newtextRemoveDoubles = "";//other double lettert
       if (text.indexOf("ee") != -1){
       newtextRemoveEe=text.replace("ee","i");
       }else{
       newtextRemoveEe=text;
       }
       if (newtextRemoveEe.indexOf("oo") != -1){
       newtextRemoveOo=newtextRemoveEe.replace("oo","u");
       }else{
       newtextRemoveOo=newtextRemoveEe;
       }
       newtextRemoveEe = newtextRemoveOo.replaceAll("([A-Za-z])\\1","$1");
       String result = newtextRemoveEe;
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
 
       String TEXT_ORIGINAL = "aa a AA A The An cacao and coffee success a an the e me be thhe Ann";
       System.out.println("ORIGINAL TEXT: " +TEXT_ORIGINAL);
       String text1 = "";
       String text2 = "";
       String text3 = "";
       String text4 = "";

       text1=removeC(TEXT_ORIGINAL); 
       System.out.println(text1);
       text2=removeDoubles(text1); 
       System.out.println(text2); 
       text3=removeEInTheEnd(text2);  
       System.out.println(text3);
       text4=removeArticles(TEXT_ORIGINAL, text3); 
       System.out.println("FINAL RESULT: " +text4); 
       }
}