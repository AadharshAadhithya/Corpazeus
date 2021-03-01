package Preprocessing ;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;



public class Stopwords 
{
    
	
    public Stopwords(final String filename) throws Exception {
        stopwords = new HashSet<String>();
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                stopwords.add(line.trim());
            }
        } catch (IOException e) {
            throw new Exception("Error reading stopword file " + filename, e);
        }
    }

   
    public boolean isStopword(final String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        return stopwords.contains(word.toLowerCase());
    }
    
    
    public Stopwords() {
        stopwords = new HashSet<String>();
    }
    
   
    public void add(final String stopword) {
        stopwords.add(stopword);
    }
    
    private HashSet<String> stopwords;
}