package com.bitwormhole.makejs.utils;

import java.io.File;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CurrentWorkingPathFinder {

	final static Logger log = LogManager.getLogger();

	public CurrentWorkingPathFinder() {
	}

	public File findWorkingPath() {

		// TODO Auto-generated method stub

		Map<String, String> kv1 = System.getenv();
		Properties kv2 = System.getProperties();

		// LogTools.logList("env", kv1);
		// LogTools.logList("prop", kv2);

		String path = kv2.getProperty("pwd.path");
		if (path == null) {
			log.error("set system.properties with '-Dpwd.path'");
			path = ".";
		}

		return new File(path);
	}
}
