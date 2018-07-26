import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.easingeffects.EasingPageConfigurator;

module com.jwebmp.plugins.easingeffects {
	exports com.jwebmp.plugins.easingeffects;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with EasingPageConfigurator;
	opens com.jwebmp.plugins.easingeffects to com.fasterxml.jackson.databind,com.jwebmp.core;
}
