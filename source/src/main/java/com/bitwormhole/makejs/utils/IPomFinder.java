package com.bitwormhole.makejs.utils;

import java.io.File;
import java.util.Enumeration;

public interface IPomFinder {

	String pom_file_name = "make.js";

	Enumeration<File> find();

}
