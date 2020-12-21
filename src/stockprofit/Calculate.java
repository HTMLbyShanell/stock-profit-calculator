/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockprofit;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Shanell A. Spann
 */
public class Calculate {
    String input;
    double numberOfShares;
    double purchasePrice;
    double purchaseCommission;
    double salesPrice;
    double salesCommission;
    double profit;
    DecimalFormat df = new DecimalFormat("0.00");
    
    public void calculateInput()
    {
        input = JOptionPane.showInputDialog("How many shares did you purchase?");
        numberOfShares = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("What was the price per share?");
        purchasePrice = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("What was the purchase commission fee?");
        purchaseCommission = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("How much did you sell each share for?");
        salesPrice = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("What was the selling commission fee?");
        salesCommission = Double.parseDouble(input);
        
        profit = ((numberOfShares * salesPrice) - salesCommission) - ((numberOfShares * purchasePrice) + purchaseCommission); 
        
        if(profit < 0 ){
            JOptionPane.showMessageDialog(null, "The sale of this stock resulted in a loss of $" + df.format(profit), "Stock Profit App", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "The sale of this stock resulted in a profit of $" + df.format(profit), "Stock Profit App", JOptionPane.INFORMATION_MESSAGE);
        }
        
        System.exit(0);
    }
    
    
    
}
