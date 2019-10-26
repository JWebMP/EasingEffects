module com.jwebmp.plugins.easingeffects {
	exports com.jwebmp.plugins.easingeffects;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.easingeffects.JQEasingPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.easingeffects.implementations.EasingEffectsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.easingeffects.implementations.EasingEffectsExclusionsModule;

	opens com.jwebmp.plugins.easingeffects to com.fasterxml.jackson.databind, com.jwebmp.core;
}
