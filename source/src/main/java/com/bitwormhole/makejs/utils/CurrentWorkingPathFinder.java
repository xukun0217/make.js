package com.bitwormhole.makejs.utils;

import java.io.File;
import java.util.Map;
import java.util.Properties;

public class CurrentWorkingPathFinder {

	public CurrentWorkingPathFinder() {
	}

	public File findWorkingPath() {
		// TODO Auto-generated method stub

		Map<String, String> kv1 = System.getenv();

		Properties kv2 = System.getProperties();

		LogTools.logList("env", kv1);
		LogTools.logList("prop", kv2);

		String path = "";

		return new File(path);
	}

}
