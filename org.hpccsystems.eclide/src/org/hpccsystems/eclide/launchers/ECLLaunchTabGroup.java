/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.eclide.launchers;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class ECLLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {
	
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
//		ECLMainLaunchConfigurationTab main = new ECLMainLaunchConfigurationTab(mode);
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
//				main,
				//new OctaveInterpreterTab(main),
				new ECLLaunchServerTab(),
//				new AppletMainTab()
//				new AppletParametersTab(),
//				new JavaArgumentsTab(),
//				new JavaJRETab(),
//				new JavaClasspathTab(), 
//				new CommonTab()
				//new WorkingDirectoryBlock()
		};
		setTabs(tabs);
	}

}
