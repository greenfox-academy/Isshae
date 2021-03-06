import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class DecryptReversed {

  public static final String DECRYPTED_FILE = "DecryptReversed.txt";
  public static final String ENCRYPTED_FILE = "Decrypted2.txt";

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt


    Path filePath = Paths.get(DECRYPTED_FILE);
    Path reversedPath = Paths.get(ENCRYPTED_FILE);
    List<String> reversedList = new ArrayList<>();
    try {
      for (String currentLine : Files.readAllLines(filePath)) {
        reversedList.add(reverseLine(currentLine));
      }
      Files.write(reversedPath, reversedList);
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
  }

  public static String reverseLine(String toReverse) {
    String reversed = "";
    for (int index = toReverse.length() - 1; index > -1; index--) {
      reversed += toReverse.charAt(index);
    }
    return reversed;
  }


}

