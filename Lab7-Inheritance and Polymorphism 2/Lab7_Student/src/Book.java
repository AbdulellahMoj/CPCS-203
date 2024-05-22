/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Book {
//    private String name="";
//    private double purchasesCost=0;
    private String Tittle;
    private double purchasesCost;
    //------------------------------
    public Book ()
    {
        
    }
    //-------------------------------
    public Book (String Tittle,double purchasesCost)
    {
        this.Tittle=Tittle;
        this.purchasesCost=purchasesCost;
    }
    //--------------------------------
    public String getTittle()
    {
        return Tittle;
    }
    //--------------------------------
    public void setName(String n)
    {
        Tittle=n;
    }
    //--------------------------------
    public double getPurchasesCost()
    {
        return purchasesCost;
    }
    //--------------------------------
    public void setPurchasesCost(double c)
    {
        purchasesCost=c;
    }
    //--------------------------------
    public String toString()
    {
        return "Book Tittle:"+ Tittle+" ,  purchase' Cost:"+purchasesCost;
    }        
}
