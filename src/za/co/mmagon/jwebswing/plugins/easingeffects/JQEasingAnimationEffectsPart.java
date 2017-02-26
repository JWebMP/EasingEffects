package za.co.mmagon.jwebswing.plugins.easingeffects;

import za.co.mmagon.jwebswing.generics.Direction;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * This is the universal easing animation object JavaScript part
 * <p>
 * @since 2014 07 29
 * @version 1.0
 * @author MMagon
 *
 * <p>
 */
public class JQEasingAnimationEffectsPart extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;

    /**
     * The easing object
     */
    private JQEasingEffects easing;
    /**
     * The duration object
     */
    private Integer duration;
    /**
     * The direction object
     */
    private Direction direction;

    /**
     * Creates a new instance of the easing javascript options
     */
    public JQEasingAnimationEffectsPart()
    {
    }

    /**
     * Construct a new animation effects part using the supplies parameters
     * <p>
     * @param easing The actual animation to apply
     * @param duration The duration in ms to apply
     * @param direction The direction in which to apply it
     */
    public JQEasingAnimationEffectsPart(JQEasingEffects easing, Integer duration, Direction direction)
    {
        this.easing = easing;
        this.duration = duration;
        this.direction = direction;
    }

    /**
     * Construct a new animation effects part using the supplies parameters
     * <p>
     * @param easing The actual animation to apply
     */
    public JQEasingAnimationEffectsPart(JQEasingEffects easing)
    {
        this.easing = easing;
    }

    /**
     * Construct a new animation effects part using the supplies parameters
     * <p>
     * @param easing The actual animation to apply
     * @param duration The duration in ms to apply
     */
    public JQEasingAnimationEffectsPart(JQEasingEffects easing, Integer duration)
    {
        this.easing = easing;
        this.duration = duration;
    }

    /**
     * Returns the animation effect applied
     * <p>
     * @return
     */
    public JQEasingEffects getEasing()
    {
        return easing;
    }

    /**
     * Sets the animation effect to apply
     * <p>
     * @param easing
     */
    public void setEasing(JQEasingEffects easing)
    {
        this.easing = easing;
    }

    /**
     * Gets the duration in ms applied
     * <p>
     * @return
     */
    public Integer getDuration()
    {
        return duration;
    }

    /**
     * Sets the duration in ms to apply
     * <p>
     * @param duration
     */
    public void setDuration(Integer duration)
    {
        this.duration = duration;
    }

    /**
     * Gets the direction for the animation to perform
     * <p>
     * @return
     */
    public Direction getDirection()
    {
        return direction;
    }

    /**
     * Sets the direction of the animation to perform
     * <p>
     * @param direction
     */
    public void setDirection(Direction direction)
    {
        this.direction = direction;
    }
}
