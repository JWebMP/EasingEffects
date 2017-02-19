package za.co.mmagon.jwebswing.plugins.easingeffects;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.servlets.interfaces.IFeature;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author Marc Magon
 */
public class JQAnimationsFeature extends Feature<JavaScriptPart, JQAnimationsFeature> implements IFeature
{

    private JQEasingEffects openingEffect;
    private JQEasingEffects closingEffect;
    private int movementSpeed = 2500;

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
        getJavascriptReferences().add(new JQEasingJavascriptReference());
    }

    /**
     * Creates an animation with a closing and opening effect at 2500 milliseconds
     *
     * @param openingEffect The effect to use on opening
     * @param closingEffect The effect to use on closing
     *
     */
    public JQAnimationsFeature(JQEasingEffects openingEffect, JQEasingEffects closingEffect)
    {
        this(openingEffect, closingEffect, 2500);
    }

    /**
     * Creates an animation with a closing and opening effect at 2500 milliseconds
     *
     * @param effect Adds an effect to closing and opening with 2500 milliseconds
     *
     */
    public JQAnimationsFeature(JQEasingEffects effect)
    {
        this(effect, effect, 2500);
    }

    public JQEasingEffects getOpeningEffect()
    {
        return openingEffect;
    }

    public void setOpeningEffect(JQEasingEffects openingEffect)
    {
        this.openingEffect = openingEffect;
    }

    public JQEasingEffects getClosingEffect()
    {
        return closingEffect;
    }

    public void setClosingEffect(JQEasingEffects closingEffect)
    {
        this.closingEffect = closingEffect;
    }

    public int getMovementSpeed()
    {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed)
    {
        this.movementSpeed = movementSpeed;
    }
}
