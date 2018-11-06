import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.easingeffects.EasingPageConfigurator;
import com.jwebmp.plugins.easingeffects.implementations.EasingEffectsExclusionsModule;

module com.jwebmp.plugins.easingeffects {
	exports com.jwebmp.plugins.easingeffects;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with EasingPageConfigurator;

	provides IGuiceScanJarExclusions with EasingEffectsExclusionsModule;
	provides IGuiceScanModuleExclusions with EasingEffectsExclusionsModule;

	opens com.jwebmp.plugins.easingeffects to com.fasterxml.jackson.databind, com.jwebmp.core;
}
