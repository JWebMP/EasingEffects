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

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.servlets.interfaces.IFeature;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * @author Marc Magon
 */
@ComponentInformation(name = "Easing Animations ",
		description = "Specify an easing animation for a component",
		url = "http://gsgd.co.uk/sandbox/jquery/easing/")
public class JQAnimationsFeature
		extends Feature<JavaScriptPart, JQAnimationsFeature>
		implements IFeature
{

	private static final long serialVersionUID = 1L;
	/**
	 * The opening effect
	 */
	private JQEasingEffects openingEffect;
	/**
	 * The closing effect
	 */
	private JQEasingEffects closingEffect;
	/**
	 * The movement speed (default 200)
	 */
	private int movementSpeed = 2500;

	/**
	 * Creates an animation with a closing and opening effect at 2500 milliseconds
	 *
	 * @param openingEffect
	 * 		The effect to use on opening
	 * @param closingEffect
	 * 		The effect to use on closing
	 */
	public JQAnimationsFeature(JQEasingEffects openingEffect, JQEasingEffects closingEffect)
	{
		this(openingEffect, closingEffect, 2500);
	}

	/**
	 * Creates an animation with a closing and opening effect at the movement speed in milliseconds
	 *
	 * @param openingEffect
	 * 		The effect to use on opening
	 * @param closingEffect
	 * 		The effect to use on closing
	 * @param movementSpeed
	 * 		The speed in ms
	 */
	public JQAnimationsFeature(JQEasingEffects openingEffect, JQEasingEffects closingEffect, int movementSpeed)
	{
		super("animations");
		this.openingEffect = openingEffect;
		this.closingEffect = closingEffect;
		this.movementSpeed = movementSpeed;
	}

	/**
	 * Creates an animation with a closing and opening effect at 2500 milliseconds
	 *
	 * @param effect
	 * 		Adds an effect to closing and opening with 2500 milliseconds
	 */
	public JQAnimationsFeature(JQEasingEffects effect)
	{
		this(effect, effect, 2500);
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getOpeningEffect() != null ? getOpeningEffect().hashCode() : 0);
		result = 31 * result + (getClosingEffect() != null ? getClosingEffect().hashCode() : 0);
		result = 31 * result + getMovementSpeed();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQAnimationsFeature that = (JQAnimationsFeature) o;

		if (getMovementSpeed() != that.getMovementSpeed())
		{
			return false;
		}
		if (getOpeningEffect() != that.getOpeningEffect())
		{
			return false;
		}
		return getClosingEffect() == that.getClosingEffect();
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		//No config required
	}

	/**
	 * Returns the opening effect
	 *
	 * @return
	 */
	public JQEasingEffects getOpeningEffect()
	{
		return openingEffect;
	}

	/**
	 * Sets the opening effect
	 *
	 * @param openingEffect
	 */
	public void setOpeningEffect(JQEasingEffects openingEffect)
	{
		this.openingEffect = openingEffect;
	}

	/**
	 * Gets the closing effect
	 *
	 * @return
	 */
	public JQEasingEffects getClosingEffect()
	{
		return closingEffect;
	}

	/**
	 * Gets the movement speed
	 *
	 * @return
	 */
	public int getMovementSpeed()
	{
		return movementSpeed;
	}

	/**
	 * Sets the movement speed
	 *
	 * @param movementSpeed
	 */
	public void setMovementSpeed(int movementSpeed)
	{
		this.movementSpeed = movementSpeed;
	}

	/**
	 * Sets the closing effect
	 *
	 * @param closingEffect
	 */
	public void setClosingEffect(JQEasingEffects closingEffect)
	{
		this.closingEffect = closingEffect;
	}
}
