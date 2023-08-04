package ArchitectureSWHW3.Task5_DIP;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        Printer myPrinter = new Printer();
        myPrinter.print(myText);
    }
}
