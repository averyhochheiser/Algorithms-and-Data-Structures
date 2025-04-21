package csu22011_a1;

import static org.junit.Assert.*;

import org.junit.Test;
import csu22011_a1.Stopwatch;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


//-------------------------------------------------------------------------
/**
 *  Test class for Collinear.java
 *
 *  @author  
 *  @version 03/10/22 22:33:19
 */
@RunWith(JUnit4.class)
public class CollinearTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
      new Collinear();
    }

    //~ Public Methods ........................................................
    public static void main(String[] args) {
      In ina = new In("input-files/r01000-1.txt");
      In inb = new In("input-files/r01000-2.txt");
      In inc = new In("input-files/r01000-3.txt");

      int [] a = ina.readAllInts();
      int [] b = inb.readAllInts();
      int [] c = inc.readAllInts();

      Stopwatch stopwatch = new Stopwatch();
      StdOut.println(Collinear.countCollinear(a, b, c));
      double time = stopwatch.elapsedTime();
      StdOut.println("elapsed time is " + time);
    }
    // ----------------------------------------------------------
    /**
     * Check that the two methods work for empty arrays
     */

    @Test 
    public void testEmpty()
    {
        int expectedResult = 0;

        assertEquals("countCollinear with 3 empty arrays should return zero",     expectedResult, Collinear.countCollinear(new int[0], new int[0], new int[0]));
        assertEquals("countCollinearFast with 3 empty arrays should return zero", expectedResult, Collinear.countCollinearFast(new int[0], new int[0], new int[0]));
    }

    // TODO: write more tests here to cover 100% of the instructions and the branches of Collinear.java
    @Test
    public void sortPos()
    {
      Collinear sortTest = new Collinear();
      int [] testArraySort = {5, 3, 2, 1, 4};
      sortTest.sort(testArraySort);

      int [] sortedArray = {1, 2, 3, 4, 5};
      assertArrayEquals( sortedArray, testArraySort);
    }

    @Test
    public void sortPosNeg()
    {
      Collinear sortTest = new Collinear();
      int [] testArraySort = {-5, 3, 2, -1, -6};
      sortTest.sort(testArraySort);

      int [] sortedArray = {-6, -5, -1, 2, 3};
      assertArrayEquals( sortedArray, testArraySort);
    }
    
    @ Test
    public void binarySearchPos()
    {
      Collinear bsTest = new Collinear();
      int [] bsArrayTest = {5, 10, 15, 20, 27};
      assertTrue(bsTest.binarySearch(bsArrayTest, 10));
    }

    @ Test
    public void binarySearchNeg()
    {
      Collinear bsTest = new Collinear();
      int [] bsArrayTest = {-25, -18, -5, 3, 4};
      assertTrue(bsTest.binarySearch(bsArrayTest, -25));
    }

    @ Test
    public void binarySearchUnsorted()
    {
      Collinear bsTest = new Collinear();
      int [] bsArrayTest = {-25, 3, 4, -5, -18};
      assertFalse(bsTest.binarySearch(bsArrayTest, -5));
    }

    @ Test
    public void binarySearchNotThere()
    {
      Collinear bsTest = new Collinear();
      int [] bsArrayTest = {-25, -18, -5, 3, 4};
      assertFalse(bsTest.binarySearch(bsArrayTest, 1));
    }

    @ Test
    public void countCollinearSingleElementArray () 
    {
      Collinear countCollinearTest = new Collinear();
      int [] a1 = {1};
      int [] a2 = {1};
      int [] a3 = {1};

      int tested = countCollinearTest.countCollinear(a1, a2, a3);

      assertEquals(tested, 1);
    }

    @ Test
    public void countCollinearFastSingleElementArray () 
    {
      Collinear countCollinearFastTest = new Collinear();
      int [] a1 = {15};
      int [] a2 = {10};
      int [] a3 = {5};

      int tested = countCollinearFastTest.countCollinearFast(a1, a2, a3);

      assertEquals(tested, 1);
    }

    @ Test
    public void countCollinearFastSingleElementArrayTwo () 
    {
      Collinear countCollinearFastTest = new Collinear();
      int [] a1 = {1};
      int [] a2 = {1};
      int [] a3 = {1};

      int tested = countCollinearFastTest.countCollinearFast(a1, a2, a3);

      assertEquals(tested, 1);
    }

    @ Test
    public void countCollinearSingleElementArrayFalse () 
    {
      Collinear countCollinearTest = new Collinear();
      int [] a1 = {1};
      int [] a2 = {1};
      int [] a3 = {0};

      int tested = countCollinearTest.countCollinear(a1, a2, a3);

      assertNotEquals(tested, 1);
    }

    @ Test
    public void countCollinearFastSingleElementArrayFalse () 
    {
      Collinear countCollinearFastTest = new Collinear();
      int [] a1 = {1};
      int [] a2 = {1};
      int [] a3 = {0};

      int tested = countCollinearFastTest.countCollinearFast(a1, a2, a3);

      assertNotEquals(tested, 1);
    }

    @ Test
    public void countCollinearTwoElementArray () 
    {
      Collinear countCollinearTest = new Collinear();
      int [] a1 = {1, 6};
      int [] a2 = {1, 6};
      int [] a3 = {1, 6};

      int tested = countCollinearTest.countCollinear(a1, a2, a3);

      assertEquals(tested, 2);
    }

    @ Test
    public void countCollinearFastDoubleElementArray () 
    {
      Collinear countCollinearFastTest = new Collinear();
      int [] a1 = {1, 6};
      int [] a2 = {1, 6};
      int [] a3 = {1, 6};

      int tested = countCollinearFastTest.countCollinearFast(a1, a2, a3);

      assertEquals(tested, 2);
    }

    @ Test
    public void countCollinearDoubleElementArrayFalse () 
    {
      Collinear countCollinearTest = new Collinear();
      int [] a1 = {1, 1};
      int [] a2 = {1, 5};
      int [] a3 = {0, 3};

      int tested = countCollinearTest.countCollinear(a1, a2, a3);

      assertEquals(tested, 0);
    }

    @ Test
    public void countCollinearFastDoubleElementArrayFalse () 
    {
      Collinear countCollinearFastTest = new Collinear();
      int [] a1 = {1, 1};
      int [] a2 = {1, 5};
      int [] a3 = {0, 3};

      int tested = countCollinearFastTest.countCollinearFast(a1, a2, a3);

      assertEquals(tested, 0);
    }



}
