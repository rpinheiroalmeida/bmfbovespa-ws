package br.com.bmf.bovespa.load;

import br.com.bmf.processing.file.ExtractData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
//    	TweetRepository personService = new TweetRepository();
    	
    	try {
//			ExtractData.instance().loadData("/home/rodrigo/workspace/bmfbovespa-ws/src/main/resources/COTAHIST_A2014.TXT");
    		System.out.println(new QuotationLoader().findByIndex("ABEV3"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
