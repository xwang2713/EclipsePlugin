package org.hpccsystems.internal.data;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;

public class Data {
	private static Data singletonFactory;
	
	private Collection<Platform> platforms;	
	
	//  Singleton Pattern
	private Data() {
		this.platforms = new ArrayList<Platform>();
	}

	public static synchronized Data get() {
		if (singletonFactory == null) {
			singletonFactory = new Data();
		}
		return singletonFactory;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	//  Platform  ---
	public Platform GetPlatform(ILaunchConfiguration launchConfiguration) {
		return Platform.get(this, launchConfiguration);
	}

	public Collection<Platform> GetPlatforms() {
		platforms.clear();
		ILaunchConfiguration[] configs;
		try {
			configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
			for(int i = 0; i < configs.length; ++i) {
				Platform p = GetPlatform(configs[i]);
				if (!platforms.contains(p))
					platforms.add(p);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return platforms;
	}
}
