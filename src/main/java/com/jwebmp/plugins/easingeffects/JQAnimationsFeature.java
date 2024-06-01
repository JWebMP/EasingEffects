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

import com.jwebmp.core.Feature;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * @author GedMarc
 */
@ComponentInformation(name = "Easing Animations ",
                      description = "Specifies an easing animation for a component",
                      url = "http://easings.net/")
public class JQAnimationsFeature
        extends Feature<JQAnimationsFeature, JavaScriptPart<?>, JQAnimationsFeature>
{

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
     * @param openingEffect The effect to use on opening
     * @param closingEffect The effect to use on closing
     */
    public JQAnimationsFeature(JQEasingEffects openingEffect, JQEasingEffects closingEffect)
    {
        this(openingEffect, closingEffect, 2500);
    }

    /**
     * Creates an animation with a closing and opening effect at the movement speed in milliseconds
     *
     * @param openingEffect The effect to use on opening
     * @param closingEffect The effect to use on closing
     * @param movementSpeed The speed in ms
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
     * @param effect Adds an effect to closing and opening with 2500 milliseconds
     */
    public JQAnimationsFeature(JQEasingEffects effect)
    {
        this(effect, effect, 2500);
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
    public JQAnimationsFeature setOpeningEffect(JQEasingEffects openingEffect)
    {
        this.openingEffect = openingEffect;
        return this;
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
     * Sets the closing effect
     *
     * @param closingEffect
     */
    public JQAnimationsFeature setClosingEffect(JQEasingEffects closingEffect)
    {
        this.closingEffect = closingEffect;
        return this;
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
    public JQAnimationsFeature setMovementSpeed(int movementSpeed)
    {
        this.movementSpeed = movementSpeed;
        return this;
    }
}
