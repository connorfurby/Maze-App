public class mazeTest {
    public static void Main(String[] args)
    {
        Square testSq = new Square(1, 1, 0);
        Maze testMaze = new Maze();
        testMaze.loadMaze("src/maze-1");
        
        System.out.println(testMaze.getNeighbors(testSq));
        System.out.println("Start Position: " +testMaze.getStart());
        System.out.println("Finish Position: " +testMaze.getFinish());
        
        testMaze.reset();

        testMaze.toString();
    }
}
