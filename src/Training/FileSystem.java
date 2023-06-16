package Training;

import java.io.FileReader;
import java.io.IOException;

public class FileSystem {
	public static void main(String[] args) {

		final String filePath = "hello.txt";
		// --> File basics
//		File file = new File(filePath);
//		if (file.exists()) {
//			System.out.println(file.getAbsolutePath());
//			System.out.println(file.canRead());
//			System.out.println(file.getAbsoluteFile().getParent());
//		} else {
//			System.out.println("File does not exists");
//		}

		// --> Read a file via Files class
//		try {
//			byte[] words = Files.readAllBytes(Paths.get(filePath));
//
//			for (byte word: words) {
//				System.out.println((char) word);
//			}
//		} catch (IOException ioe) {
//			System.out.println(ioe);
//		}

		// --> Read a file via scanner
//		File file = new File(filePath);
//		try (Scanner scanner = new Scanner(file)){
//			while (scanner.hasNext()) {
//				System.out.println(scanner.nextLine());
//			}
//		} catch (FileNotFoundException fnfe) {
//			System.out.println(fnfe);
//		}

		// --> Read a file via FileReader
		try (FileReader fileReader = new FileReader(filePath)) {
			while (fileReader.ready()) {
				int word = fileReader.read();
				System.out.println(word + ": " + (char) word);
			}
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}