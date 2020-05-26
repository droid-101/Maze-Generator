import java.io.FileWriter;
import java.io.IOException;

class Routines
{
    public static String [] wallBlocks = MasterClass.wallBlocks;
    public static int random = MasterClass.random;

    public static void dayTimeRoutine() throws IOException
    {
        String dayCommands = null;
        FileWriter dayTimeWrite = null;

        dayTimeWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\daytime_routine.mcfunction");

        dayCommands = String.format("difficulty peaceful\n");
        dayTimeWrite.write(dayCommands);
        dayTimeWrite.flush();
        dayTimeWrite.close();
    }

    public static void nightTimeRoutine() throws IOException
    {
        String nightCommands = null;
        FileWriter nightTimeWrite = null;

        nightTimeWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\nighttime_routine.mcfunction");

        nightCommands = String.format("difficulty hard\n");
        nightTimeWrite.write(nightCommands);
        nightTimeWrite.flush();
        nightTimeWrite.close();
    }

    public static void wallsClosing() throws IOException
    {
        String wallCommands = null;
        FileWriter wallsWrite = null;

        wallsWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\closing.mcfunction");

        //NORTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 213, i, 252);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 213, i, 255);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 211, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }


        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 206, i, 252);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 206, i, 255);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 208, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //SOUTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 213, i, 164);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 213, i, 167);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 211, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }


        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 206, i, 164);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 206, i, 167);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 208, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //EAST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 164, i, 213);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 167, i, 213);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 211, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }


        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 164, i, 206);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 167, i, 206);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 208, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //WEST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 255, i, 206);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 252, i, 206);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 208, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }


        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 252, i, 213);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 255, i, 213);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 211, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }
        wallsWrite.close();
    }


    public static void wallsOpen() throws IOException
    {
        String wallCommands = null;
        FileWriter wallsWrite = null;

        wallsWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\open.mcfunction");

        //NORTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 213, i, 252, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 213, i, 255, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 211, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 206, i, 252, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 206, i, 255, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 208, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //SOUTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 213, i, 164, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 213, i, 167, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 211, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 206, i, 164, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 206, i, 167, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 208, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //EAST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 164, i, 213, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 167, i, 213, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 211);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 164, i, 206, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 167, i, 206, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 208);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //WEST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 255, i, 206, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 252, i, 206, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 208);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 255, i, 213, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 252, i, 213, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 211);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }
        wallsWrite.close();
    }


    public static void wallsClosed() throws IOException
    {
        String wallCommands = null;
        FileWriter wallsWrite = null;

        wallsWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\closed.mcfunction");

        //NORTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 212, i, 252);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 212, i, 255);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 210, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }


        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 207, i, 252);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 207, i, 255);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 209, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //SOUTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 207, i, 164);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 207, i, 167);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 209, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }


        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 212, i, 164);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 212, i, 167);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 210, i, j, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //EAST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 164, i, 212);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 167, i, 212);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 210, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }


        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 164, i, 207);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 167, i, 207);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 209, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //WEST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 255, i, 207);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 252, i, 207);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 209, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 252, i, 212);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            wallCommands = String.format("setblock %d %d %d minecraft:air\n", 255, i, 212);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                do
                {
                    random = (int)(Math.abs(10 * Math.random()));
                }
                while (random > 3);

                wallCommands = String.format("setblock %d %d %d minecraft:%s\n", j, i, 210, wallBlocks[random]);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }
        wallsWrite.close();
    }


    public static void wallsOpening() throws IOException
    {
        String wallCommands = null;
        FileWriter wallsWrite = null;

        wallsWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\opening.mcfunction");

        //NORTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 212, i, 252, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 212, i, 255, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 210, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 207, i, 252, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 207, i, 255, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 209, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //SOUTH ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 212, i, 164, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 212, i, 167, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 210, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 207, i, 164, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 207, i, 167, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", 209, i, j);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //EAST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 164, i, 212, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 167, i, 212, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 210);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 164, i, 207, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 167, i, 207, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 164; j <= 167; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 209);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

        //WEST ENTRANCE
        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 255, i, 207, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 252, i, 207, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 209);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }

         for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 255, i, 212, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            do
            {
                random = (int)(Math.abs(10 * Math.random()));
            }
            while (random > 3);

            wallCommands = String.format("setblock %d %d %d minecraft:%s\n", 252, i, 212, wallBlocks[random]);
            wallsWrite.write(wallCommands);
        }

        for (int i = MasterClass.wallHeight + 9; i >= 4; i--)
        {
            for (int j = 252; j <= 255; j++)
            {
                wallCommands = String.format("setblock %d %d %d minecraft:air\n", j, i, 210);
                wallsWrite.write(wallCommands);
                wallsWrite.flush();
            }
        }
        wallsWrite.close();
    }
}