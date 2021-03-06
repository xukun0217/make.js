package com.bitwormhole.makejs.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bitwormhole.makejs.context.MjContext;
import com.bitwormhole.makejs.model.MjPOM;
import com.bitwormhole.makejs.utils.ContextBuilder;
import com.bitwormhole.makejs.utils.LogTools;
import com.bitwormhole.makejs.utils.PomBuilder;

public class MainRunner implements IRunner, Runnable {

	final static Logger log = LogManager.getLogger();

	private String[] param;

	public MainRunner(String[] args) {
		this.param = args;
		LogTools.logList("args", args);
	}

	@Override
	public void run(MjPOM pom) {

		// TODO Auto-generated method stub

		MjPOM p = pom;
		for (; p != null; p = p.getParent()) {
			log.debug("pom: " + p.getScript().getFile());
		}

	}

	@Override
	public void run() {

		final ContextBuilder cb = new ContextBuilder();
		cb.setParam(this.param);
		final MjContext context = cb.create();

		final PomBuilder pb = new PomBuilder();
		final MjPOM pom = pb.create(context);

		this.run(pom);
	}

}
