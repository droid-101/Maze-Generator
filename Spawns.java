import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

class Spawns
{
    public static void mobSpawns() throws IOException
    {
        String commands = null;
        FileWriter spawnWrite = null;
        double random = 0;
        int x = 0;
        int z = 0;

        spawnWrite = new FileWriter("C:\\Users\\The Pintos\\Documents\\My Games\\Minecraft\\New Minecraft\\data\\.minecraft\\saves\\Maze\\datapacks\\MazeRunner\\data\\maze\\functions\\mob_spawns.mcfunction");
        File coordinates = new File("spawnpoints.txt");
        Scanner reader = new Scanner(coordinates);

        while(reader.hasNext())
        {
            x = Integer.parseInt(reader.next());
            z = Integer.parseInt(reader.next());

            for (int i = 0; i < 3; i++)
            {
                do
                {
                    random = (Math.abs(10 * Math.random()));
                }
                while (random > 4);

                switch ((int) random)
                {
                    case 0:
                        commands = String.format("summon minecraft:%s %d 4 %d {PersistenceRequired:1}\n", "zombie", x, z);
                        spawnWrite.write(commands);
                        spawnWrite.flush();
                        continue;

                    case 1:
                        commands = String.format("summon minecraft:%s %d 4 %d {PersistenceRequired:1}\n", "creeper", x, z);
                        spawnWrite.write(commands);
                        spawnWrite.flush();
                        continue;

                    case 2:
                        commands = String.format("summon minecraft:%s %d 4 %d {PersistenceRequired:1, HandItems:[{id:\"minecraft:bow\",Count:1b}]}\n", "stray", x, z);
                        spawnWrite.write(commands);
                        spawnWrite.flush();
                        continue;

                    case 3:
                        commands = String.format("summon minecraft:%s %d 4 %d {PersistenceRequired:1, HandItems:[{id:\"minecraft:stone_sword\",Count:1b}]}\n", "wither_skeleton", x, z);
                        spawnWrite.write(commands);
                        spawnWrite.flush();
                        continue;
                }

                if (random < 0.1)
                {
                    commands = String.format("summon minecraft:blaze %d 4 %d {PersistenceRequired:1}\n", x, z);
                    spawnWrite.write(commands);
                    spawnWrite.flush();
                }

                if (random < 0.0005)
                {
                    commands = String.format("summon minecraft:mooshroom %d 4 %d {PersistenceRequired:1}\n", x, z);
                    spawnWrite.write(commands);
                    spawnWrite.flush();
                }

                if (random < 0.05)
                {
                    commands = String.format("summon minecraft:vindicator %d 4 %d {PersistenceRequired:1, ActiveEffects:[{Id:14,Amplifier:0,Duration:100000,Ambient:0,ShowParticles:1}]}\n", x, z);
                    spawnWrite.write(commands);
                    spawnWrite.flush();
                }
            }
        }
        spawnWrite.close();
    }
}

