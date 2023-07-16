package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void TestStack2() {
        String expected = "Hello World";
        Stack<String> stack = new Stack<>();
        stack.push(expected);
        String actual = stack.pop();
        assertEquals(expected, actual); // should be equal
    }
    // LIFO
    @Test
    public void TestStack3() {
        String expected = "Hello World";
        String firstElement = "ewwww";
        Stack<String> stack = new Stack<>();
        stack.push(firstElement);
        stack.push(expected);
        String actual = stack.peek();
        assertEquals(expected, actual); // should be equal
    }

    // Make a bigger test exercising more Stack methods.....
    // TESTING SETS
    @Test
    public void TestSet1(){
        Set set = new HashSet<String>();
        set.add("Hello world");
        assertEquals(false, set.isEmpty()); // false
    }
    @Test
    public void TestSet2(){
        Set set = new HashSet<String>();
        set.add("Hello world");
        boolean actual = set.add("Hello world");
        assertEquals(false, actual); // false
    }
    // TESTING LISTS
    @Test
    public void TestList1(){
        List list = new ArrayList<String>();
        list.add("Hello world");
        assertEquals(false, list.isEmpty()); // false
    }
    @Test
    public void TestList2(){
        String expected = "Hello World";
        String firstElement = "ewwww";
        List list = new ArrayList<String>();
        list.add(firstElement);
        list.add(expected);
        assertEquals(expected, list.get(1)); // should contain the value
        assertEquals(firstElement, list.get(0));
    }
    // TESTING MAPS
    @Test
    public void TestMap1(){
        Map map = new HashMap<String, Person>();
        String personName = "yourname";
        Person p = new Person(personName, 0);
        map.put(personName, p);
        assertEquals(p, map.get(personName));
    }
    @Test
    public void TestMap2(){
        Map map = new HashMap<String, Person>();
        String personName = "yourname";
        Person p = new Person(personName, 0);
        map.put(personName, p);
        assertEquals(true, map.containsKey(personName));
        assertEquals(true, map.containsValue(p));
    }
    // TESTING QUEUES
    @Test
    public void TestQueue1() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Hello world");
        assertEquals(false, queue.isEmpty()); // false
    }
    // FIFO
    @Test
    public void TestQueue2() {
        String secondElement = "Hello World";
        String firstElement = "ewwww";
        LinkedList<String> queue = new LinkedList<>();
        queue.add(firstElement);
        queue.add(secondElement);
        String actual = queue.peek();
        assertEquals(firstElement, actual); // should be equal
    }
    // TESTING QUEUES
    @Test
    public void TestDeque1() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Hello world");
        assertEquals(false, deque.isEmpty()); // false
    }
    @Test
    public void TestDeque2() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addLast("Hello world");
        assertEquals(false, deque.isEmpty()); // false
    }
    @Test
    public void TestDeque3() {
        String firstElement = "ewwww";
        String secondElement = "Hello World";
        LinkedList<String> deque = new LinkedList<>();
        deque.addFirst(firstElement);
        deque.addFirst(secondElement);
        String actual = deque.peekFirst();
        assertEquals(secondElement, actual); // should be equal
        assertEquals(firstElement, deque.peekLast());
    }
    @Test
    public void TestDeque4() {
        String firstElement = "ewwww";
        String secondElement = "Hello World";
        LinkedList<String> deque = new LinkedList<>();
        deque.addLast(firstElement);
        deque.addLast(secondElement);
        String actual = deque.peekLast();
        assertEquals(secondElement, actual); // should be equal
        assertEquals(firstElement, deque.peekFirst());
    }
    @Test
    public void TestDeque5() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Hello world");
        String expected = "ewwww";
        deque.addFirst(expected);
        String actual = deque.removeFirst();
        assertEquals(expected, actual);
    }
    @Test
    public void TestDeque6() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addLast("Hello world");
        String expected = "ewwww";
        deque.addLast(expected);
        String actual = deque.removeLast();
        assertEquals(expected, actual);
    }
}
