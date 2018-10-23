import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	static PrintWriter writer;


	/**
	 * cherche tous les fichiers dans le repertoire @param dirName et applique sur chaque fichier trouvé la méthode process
	 * @param dirName
	 * @param recursive : pour faire un parcours recursif
	 */
	public static void list(File dirName, boolean recursive) {
		File[] fileArray = dirName.listFiles();
		Arrays.sort(fileArray, new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		for (File f : fileArray)  {
			process(dirName.getName(), f);

			if (recursive && f.isDirectory()&& !f.getName().startsWith(".")) {
				list(f, true);
			}

			System.out.println(f.getName());
		}

	}

	public static void process(String dirName, File f) {
		if (f.isDirectory()&& !f.getName().startsWith(".")) {
			writer.println("# "+f.getName());
		}
		else if(f.getName().endsWith(".java")) {
//		f.renameTo(new File(f.getAbsolutePath().replaceAll("Copie de ", "")));
			writer.println("["+f.getName()+"](./"+dirName+"/"+ f.getName()+")\n");
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		writer =  new PrintWriter("README.md", "UTF-8");
		list(new File("./"), true);
		writer.close();


	}

}
