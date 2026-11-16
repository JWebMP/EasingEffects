package com.jwebmp.plugins.easingeffects.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class EasingEffectsExclusionModule implements IGuiceScanModuleExclusions<EasingEffectsExclusionModule>, IGuiceScanJarExclusions<EasingEffectsExclusionModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.easingeffects"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("easing-effects.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("easing-effects-" + digit + "*.jar");
        return jars;
    }
}
