import com.guicedee.client.services.config.IGuiceScanModuleInclusions;
import com.jwebmp.plugins.easingeffects.implementations.EasingEffectsInclusionModule;

module com.jwebmp.plugins.easingeffects {
    exports com.jwebmp.plugins.easingeffects;

    requires com.jwebmp.core.base.angular.client;
    requires com.jwebmp.client;
    requires com.jwebmp.core;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.easingeffects.JQEasingPageConfigurator;
    provides IGuiceScanModuleInclusions with EasingEffectsInclusionModule;

    opens com.jwebmp.plugins.easingeffects to com.fasterxml.jackson.databind, com.jwebmp.core;
}
