////////////////////////////////////////////////////////////////////
 // [Davide] [Lorenzon] [2 101 075] 
 // [Christian] [Libralato] [ 2 101 047] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;  
  
 import static org.junit.Assert.assertEquals;
 import static org.junit.Assert.assertTrue;
 import org.junit.Test; 

 public class RomanPrinterTest  
 {
     @Test 
     public void shouldAnswerWithTrue() 
     { 
         assertTrue( true ); 
     }  
     @Test 
     public void test_56(){
        String expected=
        " _       __      __  _____  \n"+
        "| |      \\ \\    / / |_   _| \n"+
        "| |       \\ \\  / /    | |   \n"+
        "| |        \\ \\/ /     | |   \n"+
        "| |____     \\  /     _| |_  \n"+
        "|______|     \\/     |_____| \n";
        assertEquals(expected,RomanPrinter.print(56));
    }
    @Test 
    public void stringa_vuota(){
       String expected="";

       assertEquals(expected,RomanPrinter.printAsciiArt(""));
    }
    public void carattere_non_valido(){
        String expected="";
        assertEquals(expected,RomanPrinter.printAsciiArt("AAA"));
     }
     @Test
public void testPrintInputNegativo() {
    String expected = "";
    assertEquals(expected, RomanPrinter.print(-1));
}
 } 
 
  
 
