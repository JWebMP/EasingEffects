package com.jwebmp.plugins.easingeffects.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class EasingEffectsInclusionModule implements IGuiceScanModuleInclusions<EasingEffectsInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.easingeffects");
		return set;
	}
}
