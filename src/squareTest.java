public class squareTest {
    
    public static void main(String[] args)
    {
        Square square1 = new Square(2, 3, 1);
        System.out.println("getRow: " + square1.getRow());
        System.out.println("getCol: " + square1.getCol());
        System.out.println("getType: " + square1.getType());
        System.out.println("toString: " + square1);
    }
}
