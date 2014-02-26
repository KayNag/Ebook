package ky.god.pdf;

import ky.god.pdf.R;

abstract public class LinkInfoVisitor {
	public abstract void visitInternal(LinkInfoInternal li);
	public abstract void visitExternal(LinkInfoExternal li);
	public abstract void visitRemote(LinkInfoRemote li);
}
