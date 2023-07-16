package rocks.zipcode;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestCollections2 {
    /*
     * From what I currently understand, Vectors are very similar to ArrayLists
     * The biggest difference is the synchronicity between threads?
     * and some resizing stuff
     */
    @Test
    public void TestVector1(){
        Vector vector = new Vector<String>();
        vector.add("Hello world");
        assertEquals(false, vector.isEmpty()); // false
    }
    @Test
    public void TestList2(){
        String expected = "Hello World";
        String firstElement = "ewwww";
        Vector vector = new Vector<String>();
        vector.add(firstElement);
        vector.add(expected);
        assertEquals(expected, vector.get(1)); // should contain the value
        assertEquals(firstElement, vector.get(0));
    }
    // TESTING TREE MAP
    @Test
    public void TestTreeMap1(){
        TreeMap map = new TreeMap<Integer, Person>();
        Integer birthYear = 0;
        Person p = new Person("yourname", birthYear);
        map.put(birthYear, p);
        assertEquals(p, map.get(birthYear));
    }
    @Test
    public void TestTreeMap2(){
        TreeMap map = new TreeMap<Integer, Person>();
        Integer birthYear = 1;
        Person p = new Person("personName", birthYear);
        Integer olderYear = 13;
        Person p1 = new Person("yournamebro", olderYear);
        map.put(olderYear, p1);
        map.put(birthYear, p);
        assertEquals(birthYear, map.firstKey());
        assertEquals(olderYear, map.lastKey());
    }

    // TESTING TREESETS
    @Test
    public void TestTreeSet1(){
        TreeSet<String> set = new TreeSet();
        set.add("Hello world");
        assertEquals(false, set.isEmpty()); // false
    }
    @Test
    public void TestTreeSet2(){
        TreeSet<String> set = new TreeSet();
        set.add("Hello world");
        boolean actual = set.add("Hello world");
        assertEquals(false, actual); // false
    }
    @Test
    public void TestTreeSet3(){
        TreeSet<String> set = new TreeSet();
        String firstVal = "AHOY MATEYS";
        String secondVal = "Hello world";
        set.add(secondVal);
        set.add(firstVal);
        assertEquals(firstVal, set.first());
        assertEquals(secondVal, set.last());
    }
    // TEST ITERATOR
    // TEST PRIORITY QUEUE
    // TEST COMPARABLE
}
