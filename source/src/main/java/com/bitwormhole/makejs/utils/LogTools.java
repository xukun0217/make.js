package com.bitwormhole.makejs.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LogTools {

	public static void logList(String tag, Properties kv) {

		System.out.println(tag);

		List<String> keys = new ArrayList<String>();
		for (Enumeration<Object> keyset = kv.keys(); keyset.hasMoreElements();) {
			String key = "" + keyset.nextElement();
			keys.add(key);
		}

		Collections.sort(keys);

		for (String key : keys) {
			String value = kv.getProperty(key);
			System.out.println("  " + key + " = " + value);
		}

	}

	public static void logList(String tag, Map<String, String> kv) {

		System.out.println(tag);

		List<String> keys = new ArrayList<String>(kv.keySet());
		Collections.sort(keys);

		for (String key : keys) {
			String value = kv.get(key);
			System.out.println("  " + key + " = " + value);
		}

	}

	public static void logList(String tag, String[] args) {
		System.out.println(tag);
		for (String v : args) {
			System.out.println("  " + v);
		}
	}

}
