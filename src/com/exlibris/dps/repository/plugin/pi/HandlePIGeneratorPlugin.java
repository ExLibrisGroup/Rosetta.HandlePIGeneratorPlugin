package com.exlibris.dps.repository.plugin.pi;

import com.exlibris.core.sdk.repository.TaskResults;
import com.exlibris.dps.sdk.plugin.PIGeneratorPlugin;

public class HandlePIGeneratorPlugin implements PIGeneratorPlugin {

	@Override
	public TaskResults getValue(String piValue, String prefix, String controlPid, TaskResults result) {
		// return the pi value as is
		result.setAdditionalData(piValue);
		return result;
	}

}
