package com.bitwormhole.makejs.utils;

import java.io.File;

import com.bitwormhole.makejs.context.MjContext;

public class ContextBuilder {

	private String[] param;

	public MjContext create() {
		CurrentWorkingPathFinder finder = new CurrentWorkingPathFinder();
		File base = finder.findWorkingPath();
		return this.create(base);
	}

	public MjContext create(File base) {
		return new MjContext(base);
	}

	public String[] getParam() {
		return param;
	}

	public void setParam(String[] param) {
		this.param = param;
	}

}
