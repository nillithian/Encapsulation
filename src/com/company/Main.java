package com.company;

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer ( 100,true,0,"Canon" );
        System.out.println ( "Toner level is: " +printer.getTonerLevel ()+"%." );
        System.out.println ("this printer uses "+printer.getTonerPerPage ()+"% toner / page." );


        printer.printPage (2);
//        System.out.println ("Reminaing toner is "+ printer.getTonerLevel ()+"%." );
        printer.printPage ( 1 );
        System.out.println ("Number of TOTAL Pages printed so far : "+ printer.getNumPagesPrinted ()+" \nWe have "+printer.getTonerLevel ()+"% toner left in the Printer" );
    }


}
