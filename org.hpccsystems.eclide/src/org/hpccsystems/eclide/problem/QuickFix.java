/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.problem;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IMarkerResolution;

public class QuickFix implements IMarkerResolution {
	String label;
	
	QuickFix(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void run(IMarker marker) {
		MessageDialog.openInformation(null, "QuickFix Demo",
				"This quick-fix is not yet implemented");
	}
}
