package com.jwebmp.plugins.easingeffects.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class EasingEffectsExclusionsModule
		implements IGuiceScanModuleExclusions<EasingEffectsExclusionsModule>,
				           IGuiceScanJarExclusions<EasingEffectsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-easing-effects-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.easingeffects");
		return strings;
	}
}
