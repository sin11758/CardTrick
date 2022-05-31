/*
    Name Navjot Singh 
    Student Id 991654429
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
        System.out.println("Please choose the Value (1 to 13):");
        int inValue = keyIn.nextInt();
        System.out.println("Please choose the Suit:");
        System.out.println("1: diamonds");
        System.out.println("2: clubs");
        System.out.println("3: spades");
        System.out.println("4: hearts");
        int inSuit = keyIn.nextInt(); 
        
        //step 3: match with array 
        for(int i = 0; i < 7 ; i++){
            if(inValue == magicHand[i].getValue() && Card.SUITS[inSuit-1].equals(magicHand[i].getSuits())){
                System.out.println("Card found");
                break;
            }else if(i == 6){
                System.out.println("Sorry, Card not found");
            }
        }
        Card luckyCard = new Card(4,3);
    }
    
    
    public static int genrateValue(){
        return (int)(Math.random()*13) + 1;
    }
    
    public static int genrateSuit(){
        return (int)(Math.random()*4);
    }
    
}
