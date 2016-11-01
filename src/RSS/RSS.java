
package RSS;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RSS {
    public static String readRSS(String urlAddress){
        try {
            URL rssUrl = new URL(urlAddress);
            BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
            String sourceCode = "";
            String line;
            while((line = in.readLine()) != null){
                if(line.contains("<title>")){
                    int firstPos = line.indexOf("<title>");
                    String temp = line.substring(firstPos);
                    temp = temp.replace("<title>", "");
                    int lastPos = temp.indexOf("</title>");
                    temp = temp.substring(0,lastPos);
                    sourceCode += temp + "\n -->";
                   
                }
               
                if(line.contains("<description>")){
                            int firstPos1 = line.indexOf("<description>");
                            String temp1 = line.substring(firstPos1);
                            temp1 = temp1.replace("<description>", "");
                            int lastPos1 = temp1.indexOf("</description>");
                          //  temp1 = line.substring(firstPos1, lastPos1);
                          temp1 = temp1.replace("</description>", "");
                            sourceCode += temp1 + "\n";
                            
                        } 
            } 
            
            in.close();
            return sourceCode;
        } catch (IOException ex) {
            Logger.getLogger(RSS.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong reading the contents");
        } 
        return null;
}
    public static void main(String[] args){
   // System.out.println(readRSS("http://www.thedailystar.net/top-news/rss.xml"));
}
}

