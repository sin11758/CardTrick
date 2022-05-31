/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        
        //step 1: genrating cards
        for( int i=0;i<magicHand.length;i++)
        {
            int value = genrateValue();
            int sute = genrateSuit();
            magicHand[i] = new Card(value,sute);
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuits());
        }
        
        //step 2: taking input 
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Enter the Value:");
        int inValue = keyIn.nextInt();
        System.out.print("Enter the Suit:");
        String inSuit = keyIn.next(); 
        
        //step 3: match with array 
        for(int i = 0; i < 7 ; i++){
            if(inValue == magicHand[i].getValue() && inSuit.equals(magicHand[i].getSuits())){
                System.out.println("Card found");
                break;
            }else if(i == 6){
                System.out.println("Card not found");
            }
        }
        Card luckyCard = new Card(4,"hearts");
    }
    
    
    public static int genrateValue(){
        return (int)(Math.random()*13) + 1;
    }
    
    public static int genrateSuit(){
        return (int)(Math.random()*4);
    }
    
}
