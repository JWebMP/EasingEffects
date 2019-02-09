import com.jwebmp.plugins.easingeffects.JQEasingPageConfigurator;

module com.jwebmp.plugins.easingeffects {
	exports com.jwebmp.plugins.easingeffects;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with JQEasingPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.easingeffects.implementations.EasingEffectsExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.easingeffects.implementations.EasingEffectsExclusionsModule;

	opens com.jwebmp.plugins.easingeffects to com.fasterxml.jackson.databind, com.jwebmp.core;
}
