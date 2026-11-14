module com.jwebmp.plugins.easingeffects {
    exports com.jwebmp.plugins.easingeffects;

    requires com.jwebmp.core.base.angular.client;
    requires com.jwebmp.client;
    requires com.jwebmp.core;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.easingeffects.JQEasingPageConfigurator;

    opens com.jwebmp.plugins.easingeffects to tools.jackson.databind, com.jwebmp.core;

    provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.easingeffects.implementations.EasingEffectsExclusionModule;

    provides com.guicedee.client.services.config.IGuiceScanJarExclusions with com.jwebmp.plugins.easingeffects.implementations.EasingEffectsExclusionModule;
}
