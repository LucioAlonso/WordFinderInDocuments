package util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

public class UtilFile {

	public static HashSet<String> listExtensionInFiles(File filePath) {
		HashSet<String> extensions = new HashSet<String>();

		for (final File ficheroEntrada : filePath.listFiles()) {
			if (ficheroEntrada.isDirectory()) {
				extensions.addAll(listExtensionInFiles(ficheroEntrada));

			}

			if (!ficheroEntrada.isDirectory()) {
//				String[] nameParts = ficheroEntrada.getAbsolutePath().split("\\.");
//				String extension = nameParts[nameParts.length - 1];
				String extension = FilenameUtils.getExtension(ficheroEntrada.getAbsolutePath());

				if (!extensions.contains(extension)) {
					extensions.add(extension);

				}
			}
		}

		return extensions;
	}
}
