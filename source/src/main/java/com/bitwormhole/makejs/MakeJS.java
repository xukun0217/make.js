package com.bitwormhole.makejs;

import com.bitwormhole.makejs.controller.MainRunner;

public final class MakeJS {

	public static void main(String[] args) {
		MainRunner runner = new MainRunner(args);
		runner.run();
	}

	private MakeJS() {
		// anti make instance
	}

}
