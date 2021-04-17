/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthquestion;

/**
 *
 * @author S541997
 */

      public class Mobile extends ElectronicDevice
        {
             private String model;
             private double discount;
             
            public Mobile(int cost, String name) {
                super(cost, name);
            }

            public Mobile(String model, double discount, int cost, String name) {
                super(cost, name);
                this.model = model;
                this.discount = discount;
            }

            
          public double caluCost()
          {
              return super.getCost()-discount;
          }
}
