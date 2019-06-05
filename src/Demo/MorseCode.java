package Demo;
//============MorseCode,BinaryValue and ASCII value===========//
public class MorseCode {
	 static String morseEncode(char x)  
	    { 
	      
	        // refer to the Morse table 
	        // image attached in the article 
	        switch (x)  
	        { 
	            case 'a': 
	                return ".-"; 
	            case 'b': 
	                return "-..."; 
	            case 'c': 
	                return "-.-."; 
	            case 'd': 
	                return "-.."; 
	            case 'e': 
	                return "."; 
	            case 'f': 
	                return "..-."; 
	            case 'g': 
	                return "--."; 
	            case 'h': 
	                return "...."; 
	            case 'i': 
	                return ".."; 
	            case 'j': 
	                return ".---"; 
	            case 'k': 
	                return "-.-"; 
	            case 'l': 
	                return ".-.."; 
	            case 'm': 
	                return "--"; 
	            case 'n': 
	                return "-."; 
	            case 'o': 
	                return "---"; 
	            case 'p': 
	                return ".--."; 
	            case 'q': 
	                return "--.-"; 
	            case 'r': 
	                return ".-."; 
	            case 's': 
	                return "..."; 
	            case 't': 
	                return "-"; 
	            case 'u': 
	                return "..-"; 
	            case 'v': 
	                return "...-"; 
	            case 'w': 
	                return ".--"; 
	            case 'x': 
	                return "-..-"; 
	            case 'y': 
	                return "-.--"; 
	            // for space 
	            case 'z': 
	                return "--.."; 
	        } 
	        return ""; 
	    } 
	      
	    static void morseCode(String s)  
	    { 
	        // character by character print  
	        // Morse code 
	    	System.out.println("MorseCode:");
	        for (int i = 0;i<s.length(); i++) 
	        	//System.out.println("MorseCode="+morseEncode(s.charAt(i)));
	            System.out.print(morseEncode(s.charAt(i))); 
	            System.out.println(); 
	    } 
	      
	    // Driver code  
	    public static void main (String[] args) 
	    { 
	        String s = "Shivdarshan"; 
	        //System.out.println(s.getBytes());
	        //System.out.println(s.hashCode());
	       char []ch = {'S','h','i','v','d','a','r','s','h','a','n'};
	        
	       for(int j:ch) {
	    	   System.out.println("Binary value:"+Integer.toBinaryString(j));
	    	   int ascii=j;
	    	   System.out.println("ASCII Value:"+ascii);}
	       
	//	Integer.toBinaryString(j);
	       
	        
	        
	        morseCode(s); 
	    } 

}
