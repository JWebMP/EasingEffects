/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
@PluginInformation(pluginName = "Easing Animations",
		pluginUniqueName = "easing",
		pluginDescription =
				"Animations are a huge part of making compelling web applications and sites. Users have come to expect highly responsive and interactive user interfaces. Animating your interface, however, is not necessarily straightforward. What should be animated, when, and what kind of feel should the animation have?" +
				"<br/>In classic animation, the term for motion that starts slowly and accelerates is \"slow in,\" and for motion that starts quickly and decelerates is \"slow out.\" The terminology most commonly used on the web for these are “ease in” and “ease out,” respectively. Sometimes the two are combined, which is called \"ease in out.\" Easing, then, is really the process of making the animation less severe or pronounced.",
		pluginVersion = "1.4.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "animation, jquery,easing",
		pluginSubtitle = "A jQuery plugin from GSGD to give advanced easing options.",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQEasingEffects",
		pluginSourceUrl = "http://gsgd.co.uk/sandbox/jquery/easing/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQEasingEffects/wiki",
		pluginOriginalHomepage = "http://easings.net/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQEasingEffects.jar/download",
		pluginIconUrl = "bower_components/jquery-easing/icon.png",
		pluginIconImageUrl = "bower_components/jquery-easing/example.png",
		pluginLastUpdatedDate = "2017/03/04")
public class EasingPageConfigurator
		implements IPageConfigurator<EasingPageConfigurator>
{
	private static final JQEasingJavascriptReference reference = new JQEasingJavascriptReference();
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * A new instance of the page configurator
	 */
	public EasingPageConfigurator()
	{
		//No config needed
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
		return EasingPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		EasingPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Get the reference
	 *
	 * @return
	 */
	public static JQEasingJavascriptReference getReference()
	{
		return EasingPageConfigurator.reference;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .addJavaScriptReference(EasingPageConfigurator.reference);
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return EasingPageConfigurator.enabled;
	}

}
