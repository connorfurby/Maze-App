public class MyStackTest
{
    public static void main(String[] args)
    {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1); // adds element 1 to stack
        stack.push(2); // adds element 2 to stack
        System.out.println(stack.size()); // prints size (2)
        System.out.println(stack.pop()); // prints element on top and removes (2)
        System.out.println(stack.top()); // prints element on top (1)
        System.out.println(stack.pop()); // prints element on top and removes (1)
        System.out.println(stack.size()); // prints size (0)
        System.out.println(stack.isEmpty()); // returns true if empty false if not (true)
        stack.push(5); // adds element 5 to stack
        System.out.println(stack.isEmpty()); // returns true if empty false if not (false)
        System.out.println(stack.pop()); // prints element on top and removes (5)
        stack.push(1); // adds element 1 to stack
        stack.push(2); // adds element 2 to stack
        stack.push(5); // adds element 5 to stack
        stack.push(9); // adds element 9 to stack
        System.out.println(stack.size()); // prints size (4)
    }
}
