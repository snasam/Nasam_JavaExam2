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
public class ElectronicDevice {
    private int cost;
        private String name;

        public ElectronicDevice(int cost, String name) {
            this.cost = cost;
            this.name = name;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "ElectronicDevice{" + "cost=" + cost + ", name=" + name + '}';
        }

    void calCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public double caluCost()
          {
              return cost;
          }
    
}
