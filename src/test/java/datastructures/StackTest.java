package datastructures;

import com.mihailstoica.datastructures.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<String> stringStack;

    private Stack<Integer> integerStack;

    @Before
    public void SetUp() {
        stringStack = new Stack<>();
        integerStack = new Stack<>();
    }

    @Test
    public void Push() {
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");

        Assert.assertEquals(3, stringStack.size());
        Assert.assertEquals("c", stringStack.peek());
        Assert.assertFalse(stringStack.isEmpty());

        integerStack.push(15);
        integerStack.push(25);
        integerStack.push(75);

        Assert.assertEquals(3, integerStack.size());
        Assert.assertEquals(75, integerStack.peek().intValue());
        Assert.assertFalse(integerStack.isEmpty());
    }

    @Test
    public void Pop() {
        stringStack.push("a");
        stringStack.push("b");
        stringStack.pop();
        stringStack.push("c");
        stringStack.pop();

        Assert.assertEquals("a", stringStack.peek());
        Assert.assertEquals(1, stringStack.size());
        Assert.assertFalse(stringStack.isEmpty());
        Assert.assertEquals("a", stringStack.pop());

        integerStack.push(15);
        integerStack.push(25);
        integerStack.pop();
        integerStack.push(35);
        integerStack.pop();

        Assert.assertEquals(15, integerStack.peek().intValue());
        Assert.assertEquals(1, integerStack.size());
        Assert.assertFalse(integerStack.isEmpty());
        Assert.assertEquals(15, integerStack.pop().intValue());
    }
}
