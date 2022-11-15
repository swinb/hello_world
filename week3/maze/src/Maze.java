import java.util.Stack;

public class Maze {
    public int[][] myMaze = {
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}
    };
    Stack<Index> stack = new Stack<Index>();

    public Maze() {
    }

    public void playMaze() {
        Index temp = new Index(0, 0);
        myMaze[0][0] = 1;


        while (true) {
            temp = findExit(temp);
            if (temp.getX() == myMaze.length - 1 && temp.getY() == myMaze.length - 1) break;
        }
        int stackConut = stack.size();

        for (int i = 0; i < stackConut; i++) {
            System.out.print(stack.pop());
        }
    }

    public Index findExit(Index a) {
        int x = a.getX();
        int y = a.getY();
        if (y > 0) {
            if (myMaze[x][y - 1] != 1) {
                myMaze[x][y - 1] = 1;
                Index b = new Index(x, y - 1);
                stack.push(b);
                return b;
            }
        }
        if (x > 0) {
            if (myMaze[x - 1][y] != 1) {
                myMaze[x - 1][y] = 1;
                Index b = new Index(x - 1, y);
                stack.push(b);
                return b;
            }
        }
        if (y < myMaze.length - 1) {
            if (myMaze[x][y + 1] != 1) {
                myMaze[x][y + 1] = 1;
                Index b = new Index(x, y + 1);
                stack.push(b);
                return b;
            }
        }
        if (x < myMaze.length - 1) {
            if (myMaze[x + 1][y] != 1) {
                myMaze[x + 1][y] = 1;
                Index b = new Index(x + 1, y);
                stack.push(b);
                return b;
            }
        }
        return stack.pop();
    }
}

class Index {
    int x;
    int y;

    public Index(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return ("<" + Integer.toString(x) + "," + Integer.toString(y) + ">");
    }
}

class Test2 {
    public static void main(String[] args) {
        Maze maze = new Maze();
        maze.playMaze();

    }
}

