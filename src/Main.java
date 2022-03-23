import java.io.File;
import java.io.FileWriter;
import  java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File temp = new File("D:\\GAMES\\temp");
        if (temp.mkdir()) {
            directMessage(temp);
        }

        File tempFile = new File("D:\\GAMES\\temp", "temp.txt");
        try {
            if (tempFile.createNewFile()) {
                System.out.println("Файл temp создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File saveGames = new File("D:\\GAMES\\saveGames");
        if (saveGames.mkdir()) {
            directMessage(saveGames);
        }
        File src = new File("D:\\GAMES\\src");
        if (src.mkdir()) {
            directMessage(src);
        }

        File res = new File("D:\\GAMES\\res");
        if (res.mkdir()) {
            directMessage(res);
        }

        File main = new File("D:\\GAMES\\src\\main");
        if (main.mkdir()) {
            directMessage(main);
        }

        File test = new File("D:\\GAMES\\src\\test");
        if (test.mkdir()) {
            directMessage(test);
        }

        File mainFile = new File("D:\\GAMES\\src\\main", "main.java");
        try {
            if (mainFile.createNewFile())
                fileMessage(mainFile);
        } catch (IOException ex) {
            System.out.println((ex.getMessage()));
        }

        File utilsFile = new File("D:\\GAMES\\src\\main", "utils.java");
        try {
            if (utilsFile.createNewFile()) {
                fileMessage(utilsFile);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("D:\\GAMES\\res\\drawables");
        if (drawables.mkdir()) {
            directMessage(drawables);
        }

        File vectors = new File("D:\\GAMES\\res\\vectors");
        if (vectors.mkdir()) {
            directMessage(vectors);
        }

        File icons = new File("D:\\GAMES\\res\\icons");
        if (icons.mkdir()) {
            directMessage(icons);
        }
    }

    public static void directMessage(File file) {
        try (FileWriter writer = new FileWriter("D:\\GAMES\\temp\\temp.txt", true)) {
            writer.write("Директория " + file.getName() + " успешно создана");
            writer.write('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void fileMessage(File file) {
        try (FileWriter writer = new FileWriter("D:\\GAMES\\temp\\temp.txt", true)) {
            writer.write("Файл " + file.getName() + " успешно создан");
            writer.write('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
