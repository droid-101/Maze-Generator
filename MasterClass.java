import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class MasterClass
{
    public static int x = 10000;
    public static int z = 10000;
    public static int wallHeight = 16;
    public static int scaleFactor = 4;
    public static String [] wallBlocks = {"stone_bricks", "mossy_cobblestone", "mossy_stone_bricks", "cracked_stone_bricks"};
    public static String [] floorBlocks = {"stone_bricks", "chiseled_stone_bricks", "mossy_stone_bricks", "cracked_stone_bricks"};
    public static int block = 0;
    public static int random = 0;

    public static void main(String [] arg)
    {
        boolean perfectGeneration = false;

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the X coordinate.");
        // x = input.nextInt();
        // System.out.println("Enter the Z coordinate.");
        // z = input.nextInt();

        int [][] maze = Generator.generateMaze(21, 21, false);

        while (perfectGeneration == false)
        {
            if (maze[Maze.numRows(maze) - 2][Maze.numColumns(maze) / 2] != 0 && maze[1][Maze.numColumns(maze) / 2] != 0 && maze[Maze.numRows(maze) / 2][Maze.numColumns(maze) - 2] != 0 && maze[Maze.numRows(maze) / 2][1] != 0)
            {
                maze[Maze.numRows(maze) - 1][Maze.numColumns(maze) / 2] = 1;
                maze[0][Maze.numColumns(maze) / 2] = 1;
                maze[Maze.numRows(maze) / 2][Maze.numColumns(maze) - 1] = 1;
                maze[Maze.numRows(maze) / 2][0] = 1;
                perfectGeneration = true;
            }
            else
            maze = Generator.generateMaze(21, 21, false);
        }

        int [][] finalMaze = new int [Maze.numRows(maze) * scaleFactor][Maze.numColumns(maze) * scaleFactor];
        finalMaze = scale(maze, scaleFactor);

        try
        {
            writeGenerate(finalMaze, wallHeight);
            clear(finalMaze, wallHeight);
            clearAll(finalMaze, wallHeight);
            Routines.dayTimeRoutine();
            Routines.nightTimeRoutine();
            Routines.wallsClosing();
            Routines.wallsOpen();
            Routines.wallsClosed();
            Routines.wallsOpening();
            Routines.dayStart();
            Routines.nightStart();
            Spawns.mobSpawns();
            Routines.setup();
            Routines.lateGame();
        }
        catch (IOException e)
        {
            System.out.println("ERROR");
        }
    }


    public static void writeGenerate(int [][] maze, int wallHeight) throws IOException
    {
        String genData = null;
        String floorData = null;
        FileWriter genWrite = null;
        FileWriter floorWrite = null;

        genWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\generate.mcfunction");
        floorWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\floor.mcfunction");

        for (int k = -1; k < wallHeight; k++)
        {
             for (int j = x; j < Maze.numColumns(maze) + x; j++)
            {
                for (int i = z; i < Maze.numRows(maze) + z; i++)
                {
                    if (maze[i - z][j - x] == 0)
                    {
                        do
                        {
                            random = (int)(Math.abs(10 * Math.random()));
                        }
                        while (random > 3);

                        genData = String.format("setblock %d %d %d minecraft:%s\n", j, k + 4, i, wallBlocks[random]);
                        genWrite.write(genData);
                        genWrite.flush();
                    }
                    do
                    {
                        random = (int)(Math.abs(10 * Math.random()));
                    }
                    while (random > 3);

                    floorData = String.format("setblock %d %d %d minecraft:%s  \n", j, 3, i, floorBlocks[random]);
                    floorWrite.write(floorData);
                    floorWrite.flush();
                }
            }
        }
        floorWrite.close();
        genWrite.close();
    }

    public static void clear(int [][] maze, int wallHeight) throws IOException
    {
        String clearData = null;
        FileWriter clearWrite = null;

        clearWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\clear.mcfunction");

        for (int k = -1; k < wallHeight; k++)
        {
            for (int j = x; j < Maze.numColumns(maze) + x; j++)
            {
                for (int i = z; i < Maze.numRows(maze) + z; i++)
                {
                    if (maze[i - z][j - x] == 0)
                    {
                        clearData = String.format("setblock %d %d %d minecraft:air\n", j, k + 4, i);
                        clearWrite.write(clearData);
                        clearWrite.flush();
                    }
                }
            }
        }
        clearWrite.close();
    }

    public static void clearAll(int [][] maze, int wallHeight) throws IOException
    {
        String clearAllData = null;
        String clearTopData = null;
        FileWriter clearAllWrite = null;
        FileWriter clearTopWrite = null;

        clearAllWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\clear_all.mcfunction");
        clearTopWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\clear_top.mcfunction");

        for (int k = -1; k < wallHeight + 4; k++)
        {
            for (int j = x; j < Maze.numColumns(maze) + x; j++)
            {
                for (int i = z; i < Maze.numRows(maze) + z; i++)
                {
                    if (k < 8)
                    {
                        if (k == -1)
                        {
                            clearAllData = String.format("setblock %d %d %d minecraft:grass_block\n", j, k + 4, i);
                            clearAllWrite.write(clearAllData);
                            clearAllWrite.flush();
                        }
                        else
                        {
                            clearAllData = String.format("setblock %d %d %d minecraft:air\n", j, k + 4, i);
                            clearAllWrite.write(clearAllData);
                            clearAllWrite.flush();
                        }
                    }
                    else
                    {
                        clearTopData = String.format("setblock %d %d %d minecraft:air\n", j, k + 4, i);
                        clearTopWrite.write(clearTopData);
                        clearTopWrite.flush();
                    }
                }
            }
        }
        clearTopWrite.close();
        clearAllWrite.close();
    }

    public static int [][] scale(int [][] oldMaze, int scaleFactor)
    {
        int [][] scaledMaze = new int [Maze.numRows(oldMaze) * scaleFactor][Maze.numColumns(oldMaze) * scaleFactor];

        for (int i = 0; i < Maze.numRows(scaledMaze); i++)
        {
            for (int j = 0; j < Maze.numColumns(scaledMaze); j++)
            {
                for (int k = 0; k < scaleFactor; k++)
                {
                    scaledMaze[i][j] = oldMaze[i / scaleFactor][j / scaleFactor];
                }
            }
        }
        return scaledMaze;
    }
}