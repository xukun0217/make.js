package com.bitwormhole.makejs.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.bitwormhole.makejs.context.MjContext;
import com.bitwormhole.makejs.model.MakeScript;
import com.bitwormhole.makejs.model.MjPOM;

public class PomBuilder {

	final static Logger log = LogManager.getLogger(PomBuilder.class);

	/***********************
	 * create a root pom
	 * */

	public MjPOM create(MjContext context, File file) {
		MakeScript ms = new MakeScript(file);
		return new MjPOM(context, ms);
	}

	/***********************
	 * create a child pom
	 * */

	public MjPOM create(MjPOM parent, File file) {
		MakeScript ms = new MakeScript(file);
		return new MjPOM(parent, ms);
	}

	/***********************
	 * create a pom tree
	 * */

	public MjPOM create(MjContext context) {

		final File base = context.getBase();
		final ParentPomFinder finder = new ParentPomFinder(base);
		final Enumeration<File> parents = finder.find();
		final List<File> plist = new ArrayList<File>();

		for (; parents.hasMoreElements();) {
			plist.add(parents.nextElement());
		}

		if (plist.size() == 0) {
			String msg = "cannot find make.js in path of " + base;
			// throw new RuntimeException(msg);
			log.error(msg);
		}

		MjPOM pom = null;

		for (int i = plist.size() - 1; i >= 0; --i) {
			File file = plist.get(i);
			if (pom == null) {
				pom = this.create(context, file);
			} else {
				pom = this.create(pom, file);
			}
		}

		return pom;
	}

}
