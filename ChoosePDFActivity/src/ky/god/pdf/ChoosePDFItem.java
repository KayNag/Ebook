package ky.god.pdf;

import ky.god.pdf.R;

public class ChoosePDFItem {
	enum Type {
		PARENT, DIR, DOC
	}

	final public Type type;
	final public String name;

	public ChoosePDFItem (Type t, String n) {
		type = t;
		name = n;
	}
}
