/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Motivational extends Book {
    private final double discountRate=0.10;
    //-------------------------------------
    public Motivational()
    {
        
    }
    //--------------------------------------
    public Motivational(String Tittle,double purchasesCost)
    {
        super(Tittle,purchasesCost);
    }
    //---------------------------------------

//override getPurchasesCost as requested

    public double getPurchasesCost()
    { double price= super.getPurchasesCost();
        price -= price*discountRate;
        return  price; 
    }
    //---------------------------------------

//override toString()as requested
    public String toString()
    {
    return super.toString()+ "  , cost after discount=  "+ getPurchasesCost();
    }
}
