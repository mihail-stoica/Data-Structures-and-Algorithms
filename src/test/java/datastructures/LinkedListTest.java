package datastructures;

import com.mihailstoica.datastructures.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList<String> linkedList;

    @Before
    public void SetUp() {
        linkedList = new LinkedList<>();
    }


    @Test
    public void AddFront() {
        linkedList.addFront("a");
        linkedList.addFront("b");
        linkedList.addFront("c");

        Assert.assertEquals("c", linkedList.getFirst());
        Assert.assertEquals("a", linkedList.getLast());
    }

    @Test
    public void GetFirst() {
        linkedList.addFront("a");
        Assert.assertEquals("a", linkedList.getFirst());
    }

    @Test
    public void GetLast() {
        linkedList.addFront("a");
        linkedList.addFront("b");
        linkedList.addFront("c");

        Assert.assertEquals("a", linkedList.getLast());
    }

    @Test
    public void AddBack() {
        linkedList.addBack("a");
        linkedList.addBack("b");
        linkedList.addBack("c");

        Assert.assertEquals("a", linkedList.getFirst());
        Assert.assertEquals("c", linkedList.getLast());
    }

    @Test
    public void Size() {
        Assert.assertEquals(0, linkedList.size());
        linkedList.addBack("a");
        Assert.assertEquals(1, linkedList.size());
        linkedList.addBack("b");
        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void Clear() {
        linkedList.addBack("a");
        linkedList.addBack("b");
        linkedList.addBack("c");

        linkedList.clear();

        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void DeleteValue() {
        linkedList.addBack("a");
        linkedList.addBack("b");
        linkedList.addBack("c");

        linkedList.deleteValue("b");

        Assert.assertEquals(2, linkedList.size());
        Assert.assertEquals("a", linkedList.getFirst());
        Assert.assertEquals("c", linkedList.getLast());
    }


    @Test
    public void DeleteLastValue() {
        linkedList.addBack("a");
        linkedList.addBack("b");
        linkedList.addBack("c");
        linkedList.addBack("d");

        linkedList.deleteValue("d");

        Assert.assertEquals(3, linkedList.size());
        Assert.assertEquals("a", linkedList.getFirst());
        Assert.assertEquals("c", linkedList.getLast());

        linkedList.print();
    }

}
