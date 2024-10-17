public class RatInMaze {
    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        System.out.println(solveMaze(maze));
    }

    private static boolean solveMaze(int[][] maze) {
        int sol[][] = new int[maze.length][maze.length];

        if (findPath(maze, 0, 0, sol)) {
            printPath(sol);
            return true;
        } else {
            return false;
        }
    }

    private static boolean findPath(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length - 1 && y == maze.length - 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;
            // forward
            if (findPath(maze, x, y + 1, sol)) {
                return true;
            }
            // downwards
            if (findPath(maze, x + 1, y, sol)) {
                return true;
            }
            // undo
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    private static void printPath(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }

    }
}