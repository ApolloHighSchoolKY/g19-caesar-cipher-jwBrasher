/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    //whatever the shift number is, use mod for bigger numbers

    public CaesarCipher() {
        //give shift a default value that isnt 0 or over 25
        shift = 2;
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    }

    public CaesarCipher(int num){
        //populated shifted array with alphabet shifted
        num = shift;
        //shifted = {'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b'};
        for(int i=0; i<alphabet.length; i++)
        {
            shifted[i] = alphabet[i+num];
        }
       
    }

    public String encrypt(String message){
        //call to shifter
        //look through the alphabet
        int apos=0;
        int cry=0;
        for(int i=0; i <message.length(); i++)
        {
            apos = message.indexOf(i);
        }
        cry = apos + 2;

        for(int i=0; i<message.length(); i++)
        {
            message.charAt(i) = alphabet[cry];
        }

        //concatonate
        //going through each character in array until
        //if it isnt found it is just concatenated in its original state, booleans.
        return ""+;
    }

    public String decrypt(String message){
        //call to shifter
        //look through the shifted
        message.charAt() = 
        return ""+;
    }

    public void shifter(int num){
        //shift over num spaces
    }


}
