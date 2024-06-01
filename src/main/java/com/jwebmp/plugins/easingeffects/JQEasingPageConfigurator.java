/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.easingeffects;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
@PluginInformation(pluginName = "Easing Animations",
                   pluginUniqueName = "easing",
                   pluginDescription =
                           "Animations are a huge part of making compelling web applications and sites. Users have come to expect highly responsive and interactive user interfaces. Animating your interface, however, is not necessarily straightforward. What should be animated, when, and what kind of feel should the animation have?" +
                                   "<br/>In classic animation, the term for motion that starts slowly and accelerates is \"slow in,\" and for motion that starts quickly and decelerates is \"slow out.\" The terminology most commonly used on the web for these are “ease in? and “ease out,? respectively. Sometimes the two are combined, which is called \"ease in out.\" Easing, then, is really the process of making the animation less severe or pronounced.",
                   pluginVersion = "1.4.1",
                   pluginDependancyUniqueIDs = "jquery",
                   pluginCategories = "animation, jquery,easing",
                   pluginSubtitle = "A jQuery plugin from GSGD to give advanced easing options.",
                   pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQEasingEffects",
                   pluginSourceUrl = "https://github.com/ai/easings.net",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQEasingEffects/wiki",
                   pluginOriginalHomepage = "http://easings.net/",
                   pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.javascript/jwebmp-easing-effects",
                   pluginIconUrl = "bower_components/jquery-easing/icon.png",
                   pluginIconImageUrl = "bower_components/jquery-easing/example.png",
                   pluginLastUpdatedDate = "2017/03/04",
                   pluginGroupId = "com.jwebmp.plugins.javascript",
                   pluginArtifactId = "jwebmp-easing-effects",
                   pluginModuleName = "com.jwebmp.plugins.easingeffects",
                   pluginStatus = PluginStatus.Released
)
@TsDependency(value = "easing", version = "*")
@NgScript(value = "easing/browser-easing.js", sortOrder = 4)
public class JQEasingPageConfigurator
        implements IPageConfigurator<JQEasingPageConfigurator>
{
    /**
     * If this configurator is enabled
     */
    private static boolean enabled = true;

    /**
     * A new instance of the page configurator
     */
    public JQEasingPageConfigurator()
    {
        //No config needed
    }

    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    /**
     * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
     */
    public static boolean isEnabled()
    {
        return JQEasingPageConfigurator.enabled;
    }

    /**
     * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
     */
    public static void setEnabled(boolean mustEnable)
    {
        JQEasingPageConfigurator.enabled = mustEnable;
    }

    @Override
    public boolean enabled()
    {
        return JQEasingPageConfigurator.enabled;
    }

}
