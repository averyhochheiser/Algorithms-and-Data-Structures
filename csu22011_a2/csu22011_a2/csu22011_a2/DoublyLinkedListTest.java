package csu22011_a2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for Doubly Linked List
 *
 *  @author  Avery Hochheiser 
 *  @version 13/10/16 18:15
 */
@RunWith(JUnit4.class)
public class DoublyLinkedListTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
      new DoublyLinkedList<Integer>();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check if the insertBefore works
     */
    @Test
    public void testInsertBefore()
    {
        // test non-empty list
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(0,1);
        testDLL.insertBefore(1,2);
        testDLL.insertBefore(2,3);

        testDLL.insertBefore(0,4);
        assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", "4,1,2,3", testDLL.toString() );
        testDLL.insertBefore(1,5);
        assertEquals( "Checking insertBefore to a list containing 4 elements at position 1", "4,5,1,2,3", testDLL.toString() );
        testDLL.insertBefore(2,6);       
        assertEquals( "Checking insertBefore to a list containing 5 elements at position 2", "4,5,6,1,2,3", testDLL.toString() );
        testDLL.insertBefore(-1,7);        
        assertEquals( "Checking insertBefore to a list containing 6 elements at position -1 - expected the element at the head of the list", "7,4,5,6,1,2,3", testDLL.toString() );
        testDLL.insertBefore(7,8);        
        assertEquals( "Checking insertBefore to a list containing 7 elemenets at position 8 - expected the element at the tail of the list", "7,4,5,6,1,2,3,8", testDLL.toString() );
        testDLL.insertBefore(700,9);        
        assertEquals( "Checking insertBefore to a list containing 8 elements at position 700 - expected the element at the tail of the list", "7,4,5,6,1,2,3,8,9", testDLL.toString() );

        // test empty list
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(0,1);        
        assertEquals( "Checking insertBefore to an empty list at position 0 - expected the element at the head of the list", "1", testDLL.toString() );
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(10,1);        
        assertEquals( "Checking insertBefore to an empty list at position 10 - expected the element at the head of the list", "1", testDLL.toString() );
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(-10,1);        
        assertEquals( "Checking insertBefore to an empty list at position -10 - expected the element at the head of the list", "1", testDLL.toString() );
     }

    // TODO: add more tests here. Each line of code in DoublyLinkedList.java should
    // be executed at least once from at least one test.

    @ Test
    public void testLength () {
      DoublyLinkedList<String> myStringList = new DoublyLinkedList<String>();
      
      myStringList.insertBefore(0, "A");
      myStringList.insertBefore(1, "B");

      assertEquals(2, myStringList.getLength());
    }

    @ Test
    public void testIsEmpty() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      assertEquals(true, myIntList.isEmpty());
    }

    @ Test
    public void testIsEmptyNot() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      assertEquals(false, myIntList.isEmpty());
    }

    @ Test
    public void testGet() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      int test = myIntList.get(1);

      assertEquals(2, test);
    }

    @ Test
    public void testDeleteAt() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      myIntList.deleteAt(1);

      assertEquals("1,3", myIntList.toString());
    }

    @ Test
    public void testDeleteAtZero() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      myIntList.deleteAt(0);

      assertEquals("2,3", myIntList.toString());
    }

    @ Test
    public void testDeleteAtTail() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      myIntList.deleteAt(2);

      assertEquals("1,2", myIntList.toString());
    }

    @ Test
    public void testDeleteAtNeg() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      boolean test = myIntList.deleteAt(-1);

      assertEquals(false, test);
    }

    @ Test 
    public void testReverse() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      myIntList.reverse();

      assertEquals("3,2,1", myIntList.toString());
    }

    @ Test
    public void testReverseNull() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();
      myIntList.reverse();

      assertEquals(null, null);
    }

    @ Test

    public void testNullString() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();
      String myIntListString = myIntList.toString();

      assertEquals("","");
    }

    @ Test
    public void testLengthNull() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      assertEquals(0, myIntList.getLength());
    }

    @ Test 
    public void testGetNull() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      myIntList.get(-1);
      assertEquals(null, null);
    }

    @ Test
    public void testMakeUnique() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);
      myIntList.insertBefore(3,2);
      myIntList.insertBefore(4,4);

      myIntList.makeUnique();

      assertEquals("1,2,3,4", myIntList.toString());
    }

    @ Test
    public void testGetZero() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      int test = myIntList.get(0);
      
      assertEquals(1, test);
    }

    @ Test
    public void testMakeUniqueTwoElements() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,1);

      myIntList.makeUnique();

      assertEquals("1", myIntList.toString());
    }

    @ Test 
    public void testMakeUniqueDouble() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,1);
      myIntList.insertBefore(2,1);
      myIntList.insertBefore(3,2);
      myIntList.insertBefore(4,2);
      myIntList.insertBefore(5,2);

      myIntList.makeUnique();

      assertEquals("1,2", myIntList.toString());
    }

    @ Test 
    public void makeUniqueThenDelete() {
      DoublyLinkedList<String> myIntList = new DoublyLinkedList<String>();

      myIntList.insertBefore(0, "test");
      myIntList.insertBefore(1, "test");

      myIntList.makeUnique();

      assertEquals(false, myIntList.deleteAt(1));
    }

    @ Test
    public void testGetNullTH() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.get(1);
      assertEquals(null, null);
    }

    @ Test
    public void testDeleteNull() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.deleteAt(1);
      assertEquals(false, false);
    }

    @ Test
    public void testDeleteLargePos() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);
      myIntList.insertBefore(3,2);
      myIntList.insertBefore(4,4);

      myIntList.deleteAt(7);
      assertEquals(false, false);
    }

    @ Test
    public void testGetL2() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);

      int test = myIntList.get(1);
      assertEquals(2, test);
    }

    @ Test
    public void testUniqueGet() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,2);
      myIntList.insertBefore(1,1);
      myIntList.insertBefore(2,2);
      myIntList.insertBefore(3,1);
      myIntList.insertBefore(4,1);
      myIntList.insertBefore(5,2);
      myIntList.insertBefore(6,1);

      myIntList.makeUnique();

      int test = myIntList.get(1);
      assertEquals(1, test);
    }

    @ Test
    public void testGet3() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      int test = myIntList.get(0);

      assertEquals(1, test);
    }

    @ Test
    public void testGet2() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,2);
      myIntList.insertBefore(1,1);
      myIntList.insertBefore(2,2);
      myIntList.insertBefore(3,1);
      myIntList.insertBefore(4,1);
      myIntList.insertBefore(5,2);
      myIntList.insertBefore(6,1);

      int test = myIntList.get(4);
      assertEquals(1, test);
    }

    @ Test 
    public void testDelete1() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,2);

      myIntList.deleteAt(0);
      assertEquals(null, null);
    }

    @ Test 
    public void testGet1() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,2);

      int test = myIntList.get(0);
      assertEquals(2, test);
    }

    @ Test
    public void testGetL2P1() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);
      myIntList.insertBefore(1,2);
      myIntList.insertBefore(2,3);

      int test = myIntList.get(1);

      assertEquals(2, test);
    }

    @ Test
    public void testDeleteAtNull() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);

      myIntList.deleteAt(0);

      assertEquals("", myIntList.toString());
    }

    @ Test
    public void testDeleteAtNullHead() {
      DoublyLinkedList<Integer> myIntList = new DoublyLinkedList<Integer>();

      myIntList.insertBefore(0,1);

      assertEquals(false, myIntList.deleteAt(1));
    }
}

