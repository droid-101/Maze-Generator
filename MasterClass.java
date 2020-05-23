import java.io.FileWriter;
import java.io.IOException;

class MasterClass
{
    public static void main(String [] arg)
    {
        int wallHeight = 2;

        int [][] maze = Generator.generateMaze(20, 20, false);

        for (int i = Maze.numColumns(maze) - 1; i > 0; i--)
        {
            if (maze[Maze.numRows(maze) - 2][i] != 0)
            {
                maze[Maze.numRows(maze) - 1][i] = 1;
                i = 0;
            }
        }

        Solver.check(maze);

        try
        {
            writeGenerate(maze, wallHeight);
        }
        catch (IOException e)
        {
            System.out.println("ERROR");
        }

        try
        {
            clear(maze, wallHeight);
        }
        catch (IOException e)
        {
            System.out.println("ERROR");
        }
    }


    public static void writeGenerate(int [][] maze, int wallHeight) throws IOException
    {
        String genData = null;
        FileWriter genWrite = null;

        genWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze Runner\\datapacks\\MazeRunner\\data\\maze\\functions\\generate.mcfunction");

        for (int k = 0; k < wallHeight; k++)
        {
             for (int j = 0; j < Maze.numColumns(maze); j++)
            {
                for (int i = 0; i < Maze.numRows(maze); i++)
                {
                    if (maze[i][j] == 0)
                    {
                        genData = String.format("setblock %d %d %d minecraft:stone_bricks\n", j, k + 4, i);
                        genWrite.write(genData);
                    }
                }
            }
        }

        genWrite.close();
    }

    public static void clear(int [][] maze, int wallHeight) throws IOException
    {
        String clearData = null;
        FileWriter clearWrite = null;

        clearWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze Runner\\datapacks\\MazeRunner\\data\\maze\\functions\\clear.mcfunction");

        for (int k = 0; k < wallHeight; k++)
        {
            for (int j = 0; j < Maze.numColumns(maze); j++)
            {
                for (int i = 0; i < Maze.numRows(maze); i++)
                {
                    clearData = String.format("setblock %d %d %d minecraft:air\n", j, k + 4, i);
                    clearWrite.write(clearData);
                }
            }
        }
        clearWrite.close();
    }
}