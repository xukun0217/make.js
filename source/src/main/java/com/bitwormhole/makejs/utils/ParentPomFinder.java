package com.bitwormhole.makejs.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ParentPomFinder implements IPomFinder {

	private final File path;

	public ParentPomFinder(File file) {
		this.path = file;
	}

	@Override
	public Enumeration<File> find() {
		List<File> list = new ArrayList<File>();
		File p = this.path;
		for (; p != null; p = p.getParentFile()) {
			File file = new File(p, IPomFinder.pom_file_name);
			if (file.exists() && file.isFile()) {
				list.add(file);
			}
		}
		return new MyResult(list.iterator());
	}

	private class MyResult implements Enumeration<File> {

		private final Iterator<File> it;

		public MyResult(Iterator<File> iterator) {
			this.it = iterator;
		}

		@Override
		public boolean hasMoreElements() {
			return it.hasNext();
		}

		@Override
		public File nextElement() {
			return it.next();
		}

	}

}
