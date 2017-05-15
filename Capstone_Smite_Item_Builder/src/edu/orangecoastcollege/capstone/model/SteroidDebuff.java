
package edu.orangecoastcollege.capstone.model;

import javafx.scene.image.Image;

/**
 * SteroidDebuff represents a beneficial or
 * negative status effect applied to a God in
 * the game SMITE
 *
 * @author ptang10
 *
 */
public class SteroidDebuff
{
    private int mId;
    private Image mArt;
    private double mDuration;
    private int mPower;
    private double mMovementSpeed;
    private int mLifesteal;
    private int mProtections;
    private double mHP5;
    private double mMP5;
    private int mPenetration;

    /**
     * No-arg constructor
     */
    public SteroidDebuff(){}

    /**
     * arg constructor for steroiddebuff
     * @param id            - id
     * @param art           - image
     * @param duration      - duraction in sec
     * @param power         - power inc
     * @param movementSpeed - movement inc
     * @param lifesteal     - life absorb
     * @param protections   - protection
     * @param HP5           - health regen
     * @param MP5           - mana regen
     * @param penetration   - penetration
     */
    public SteroidDebuff(int id,
                         Image art,
                         double duration,
                         int power,
                         double movementSpeed,
                         int lifesteal,
                         int protections,
                         double HP5,
                         double MP5,
                         int penetration)
    {
        this.mId = id;
        this.mArt = art;
        this.mDuration = duration;
        this.mPower = power;
        this.mMovementSpeed = movementSpeed;
        this.mLifesteal = lifesteal;
        this.mProtections = protections;
        this.mHP5 = HP5;
        this.mMP5 = MP5;
        this.mPenetration = penetration;
    }

    /**
     * Get id of steroid/debuff
     * @return the id
     */
    public int getId()
    {
        return mId;
    }

    /**
     * Set id of steroid/debuff
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.mId = id;
    }

    /**
     * Get duration of steroid/debuff
     * @return the duration
     */
    public double getDuration()
    {
        return mDuration;
    }

    /**
     * Set duraction of steroid/debuff
     * @param duration the duration to set
     */
    public void setDuration(double duration)
    {
        this.mDuration = duration;
    }

    /**
     * Get power
     * @return the power
     */
    public int getPower()
    {
        return mPower;
    }

    /**
     * Set power
     * @param power the power to set
     */
    public void setPower(int power)
    {
        this.mPower = power;
    }

    /**
     * Get movement speed
     * @return the movementSpeed
     */
    public double getMovementSpeed()
    {
        return mMovementSpeed;
    }

    /**
     * Set movement speed
     * @param movementSpeed the movementSpeed to set
     */
    public void setMovementSpeed(double movementSpeed)
    {
        this.mMovementSpeed = movementSpeed;
    }

    /**
     * Get lifesteal
     * @return the lifesteal
     */
    public int getLifesteal()
    {
        return mLifesteal;
    }

    /**
     * Set lifesteal
     * @param lifesteal the lifesteal to set
     */
    public void setLifesteal(int lifesteal)
    {
        this.mLifesteal = lifesteal;
    }

    /**
     * Get protections
     * @return the protections
     */
    public int getProtections()
    {
        return mProtections;
    }

    /**
     * Set protections
     * @param protections the protections to set
     */
    public void setProtections(int protections)
    {
        this.mProtections = protections;
    }

    /**
     * Get HP5 health regen
     * @return the hP5
     */
    public double getHP5()
    {
        return mHP5;
    }

    /**
     * Set hp5 health regen
     * @param hP5 the hP5 to set
     */
    public void setHP5(double hP5)
    {
        mHP5 = hP5;
    }

    /**
     * Get MP5 mana regen
     * @return the mP5
     */
    public double getMP5()
    {
        return mMP5;
    }

    /**
     * Set MP5 mana regen
     * @param mP5 the mP5 to set
     */
    public void setMP5(double mP5)
    {
        mMP5 = mP5;
    }

    /**
     * Get penetration
     * @return the penetration
     */
    public int getPenetration()
    {
        return mPenetration;
    }

    /**
     * Set penetration
     * @param penetration the penetration to set
     */
    public void setPenetration(int penetration)
    {
        this.mPenetration = penetration;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(mHP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mMP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mDuration);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mId;
        result = prime * result + mLifesteal;
        temp = Double.doubleToLongBits(mMovementSpeed);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mPenetration;
        result = prime * result + mPower;
        result = prime * result + mProtections;
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        SteroidDebuff other = (SteroidDebuff) obj;
        if (Double.doubleToLongBits(mHP5) != Double.doubleToLongBits(other.mHP5)) return false;
        if (Double.doubleToLongBits(mMP5) != Double.doubleToLongBits(other.mMP5)) return false;
        if (Double.doubleToLongBits(mDuration) != Double.doubleToLongBits(other.mDuration)) return false;
        if (mId != other.mId) return false;
        if (mLifesteal != other.mLifesteal) return false;
        if (Double.doubleToLongBits(mMovementSpeed) != Double.doubleToLongBits(other.mMovementSpeed)) return false;
        if (mPenetration != other.mPenetration) return false;
        if (mPower != other.mPower) return false;
        if (mProtections != other.mProtections) return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "SteroidDebuff [id=" + mId + ", duration=" + mDuration + ", power=" + mPower + ", movementSpeed="
                + mMovementSpeed + ", lifesteal=" + mLifesteal + ", protections=" + mProtections + ", HP5=" + mHP5
                + ", MP5=" + mMP5 + ", penetration=" + mPenetration + "]";
    }




}
