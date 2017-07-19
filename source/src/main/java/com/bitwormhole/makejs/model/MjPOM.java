package com.bitwormhole.makejs.model;

import com.bitwormhole.makejs.context.MjContext;

public class MjPOM {

	private final MjContext context;
	private final MjPOM parent;
	private final MakeScript script;

	public MjPOM(MjContext context, MakeScript script) {
		this.context = context;
		this.parent = null;
		this.script = script;
	}

	public MjPOM(MjPOM parent, MakeScript script) {
		this.context = parent.getContext();
		this.parent = parent;
		this.script = script;
	}

	public MjContext getContext() {
		return context;
	}

	public MjPOM getParent() {
		return parent;
	}

	public MakeScript getScript() {
		return script;
	}

}
