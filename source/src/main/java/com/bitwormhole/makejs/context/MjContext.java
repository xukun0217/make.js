package com.bitwormhole.makejs.context;

import java.io.File;

public class MjContext {

	private final File base;

	public MjContext(File basePath) {
		this.base = basePath;
	}

	public File getBase() {
		return base;
	}

}
