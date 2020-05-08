package com.company;
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {

    private int tonerLevel;
    private boolean isDuplex;
    private int numPagesPrinted;
    private String printerName;
    private int tonerPerPage=5;



    public Printer(int tonerLevel, boolean isDuplex, int numPagesPrinted, String printerName) {

        if (tonerLevel >0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.numPagesPrinted = numPagesPrinted;
        this.printerName = printerName;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }

    public int printPage(int numberOfPages){
    if(tonerLevel>0){
        numPagesPrinted += numberOfPages;
        System.out.println (numberOfPages+" Page(s) Printed" );

//        tonerPerPage = tonerPerPage * numberOfPages;
        tonerLevel = tonerLevel-(tonerPerPage*numberOfPages);
        System.out.println ("Remaing toner is " + tonerLevel+"%" );
        return getNumPagesPrinted ();
    }
        System.out.println ("Not enough Toner to print the page" );
        return tonerLevel;
    }


    public int getTonerPerPage() {
        return tonerPerPage;
    }
}
