public class mazeTest {
    public static void main(String[] args)
    {
        Square testSq = new Square(1, 1, 0);
        Maze testMaze = new Maze();
        testMaze.loadMaze("src/maze-2");
        
        System.out.println(testMaze.getNeighbors(testSq));
        System.out.println("Start Position: " + testMaze.getStart().getRow() + ", " + testMaze.getStart().getCol());
        System.out.println("Finish Position: " + testMaze.getFinish().getRow() + "," + testMaze.getFinish().getCol());
        
        testMaze.reset();

        System.out.println(testMaze.toString());
    }
}
