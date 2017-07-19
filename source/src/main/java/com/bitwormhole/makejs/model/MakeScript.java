package com.bitwormhole.makejs.model;

import java.io.File;

public class MakeScript {

	private final File file;

	public MakeScript(File file) {
		this.file = file;
	}

	public File getFile() {
		return file;
	}

}
