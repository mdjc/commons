package com.github.mdjc.commons.files;

public class Files {
	public static String getExtension(String filename) {
		return filename.substring(filename.lastIndexOf(".") + 1);
	}
}
