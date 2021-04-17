/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhquestion;

/**
 *
 * @author S541997
 */
public enum Icecream {
    
     
     
    CHOCOLATE,VANILLA,STRAWBERRY;
    
    
    public String getFlavour()
    {
        switch(this)
        {
            case CHOCOLATE:
                    return "I ordered chocolate";
             case VANILLA:
        return "I ordered Vanilla";

      case STRAWBERRY:
        return "I ordered Strawberry";  
        
      default:
          return null;
        }
    }
    
    public static void main(String[] args) {

   System.out.println("Answer to 7th Question is:Shital Nasam");
    
    System.out.println(Icecream.CHOCOLATE.getFlavour());
  }
}
