//////////////////////////////////////////////////////////////////// 
 // [Davide] [Lorenzon] [2 101 075] 
 // [Christian] [Libralato] [ 2 101 047] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;  
  
 import static org.junit.Assert.assertTrue;
 import static org.junit.Assert.assertEquals;
 import org.junit.Test; 
  
 /** 
  * Unit test for simple App. 
  */ 
import static org.junit.Assert.assertTrue;
import org.junit.Test; 
 public class IntegerToRomanTest  
 { 
     /** 
      * Rigorous Test :-) 
      */ 
     @Test 
     public void shouldAnswerWithTrue() 
     { 

         assertTrue( true ); 
     } 

     @Test
     public void test1To3(){
        int[] numbers = {1,2,3};
        String[] romanN = {"I","II","III"};
        for(int i = 0; i < 3; i++)
            assertEquals(romanN[i],ITR.convert(numbers[i]));
     }

     @Test
     public void test4To8(){
        int[] numbers = {4,5,6,7,8};
        String[] romanN = {"IV","V","VI","VII","VIII"};
        for(int i = 0; i < 5; i++)
            assertEquals(romanN[i],ITR.convert(numbers[i]));
     }
    
     @Test
     public void test9To20(){
        int[] numbers = {9,10,11,12,13,14,15,16,17,18,19,20};
        String[] romanN = {"IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        for(int i = 0; i < 12; i++)
            assertEquals(romanN[i],ITR.convert(numbers[i]));
     }

     @Test
     public void  testInRange21To49(){
        int[] numbers = {21,25,29,30,35,37,41,44,46,49};
        String[] romanN = {"XXI","XXV","XXIX","XXX","XXXV","XXXVII","XLI","XLIV","XLVI","XLIX"};
        for(int i = 0; i < 10; i++)
            assertEquals(romanN[i],ITR.convert(numbers[i]));
     }

     @Test
     public void  testInRange50To99(){
        int[] numbers = {50,57,60,63,69,72,78,84,90,99};
        String[] romanN = {"L","LVII","LX","LXIII","LXIX","LXXII","LXXVIII","LXXXIV","XC","XCIX"};
        for(int i = 0; i < 10; i++)
            assertEquals(romanN[i],ITR.convert(numbers[i]));
     }


     @Test
     public void  testInRange100To499(){
        int[] numbers = {100,107,158,212,269,340,398,432,471,499};
        String[] romanN = {"C","CVII","CLVIII","CCXII","CCLXIX","CCCXL","CCCXCVIII","CDXXXII","CDLXXI","CDXCIX"};
        for(int i = 0; i < 10; i++)
            assertEquals(romanN[i],ITR.convert(numbers[i]));
     }

     @Test
     public void  testInRange500To999(){
        int[] numbers = {500,539,596,643,677,711,767,843,945,999};
        String[] romanN = {"D","DXXXIX","DXCVI","DCXLIII","DCLXXVII","DCCXI","DCCLXVII","DCCCXLIII","CMXLV","CMXCIX"};
        for(int i = 0; i < 10; i++)
            assertEquals(romanN[i],ITR.convert(numbers[i]));
     }

     @Test
     public void test1000(){
        assertEquals("M",ITR.convert(1000));
     }


         assertTrue( true); 
     }



  
 
