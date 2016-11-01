
package news;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RSS {
    public static ArrayList<News> readRSS(String urlAddress){
        try {
            URL rssUrl = new URL(urlAddress);
            BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
            ArrayList<String> titles = new ArrayList<>();
            ArrayList<String> descs = new ArrayList<>();
            ArrayList<String> links = new ArrayList<>();
            String line;
            while((line = in.readLine()) != null){
                if(line.contains("<title>")){
                    int firstPos = line.indexOf("<title>");
                    String temp = line.substring(firstPos);
                    temp = temp.replace("<title>", "");
                    int lastPos = temp.indexOf("</title>");
                    temp = temp.substring(0,lastPos);
                    titles.add(temp);
                   
                }
                if(line.contains("<description>")){
                    int firstPos1 = line.indexOf("<description>");
                    String temp1 = line.substring(firstPos1);
                    temp1 = temp1.replace("<description>", "");
                    int lastPos1 = temp1.indexOf("</description>");
                  //  temp1 = line.substring(firstPos1, lastPos1);
                    temp1 = temp1.replace("</description>", "");
                    descs.add(temp1);
                } 
                if(line.contains("<link>")){
                    int firstPos1 = line.indexOf("<link>");
                    String temp1 = line.substring(firstPos1);
                    temp1 = temp1.replace("<link>", "");
                    int lastPos1 = temp1.indexOf("</link>");
                  //  temp1 = line.substring(firstPos1, lastPos1);
                    temp1 = temp1.replace("</link>", "");
                    links.add(temp1);
                } 
            } 
            
            in.close();
            
            ArrayList<News> news = new ArrayList<>();
            for(int i=0; i<titles.size() && i<descs.size(); i++){
                News n = new News(titles.get(i), descs.get(i), links.get(i));
                news.add(n);
            }
            return news;
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

