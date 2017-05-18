
package edu.orangecoastcollege.capstone.model;


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
    private int mDuration;
    private int mPhysicalPower;
    private int mMagicalPower;
    private double mMovementSpeed;
    private int mProtections;
    private int mHP5;
    private int mMP5;
    private int mPenetration;
    

    /**
     * No-arg constructor
     */
    public SteroidDebuff(){}

    /**
     * arg constructor for steroiddebuff
     * @param id            - id
     * @param duration      - duraction in sec
     * @param physicalPower         - power inc
     * @param magicalPower
     * @param movementSpeed - movement inc
     * @param lifesteal     - life absorb
     * @param protections   - protection
     * @param HP5           - health regen
     * @param MP5           - mana regen
     * @param penetration   - penetration
     */
    public SteroidDebuff(int id,
                         int duration,
                         int physicalPower,
                         int magicalPower,
                         double movementSpeed,
                         int protections,
                         int HP5,
                         int MP5,
                         int penetration)
    {
        this.mId = id;
        this.mDuration = duration;
        this.mPhysicalPower = physicalPower;
        this.mMagicalPower = magicalPower;
        this.mMovementSpeed = movementSpeed;
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
    public int getDuration()
    {
        return mDuration;
    }

    /**
     * Set duraction of steroid/debuff
     * @param duration the duration to set
     */
    public void setDuration(int duration)
    {
        this.mDuration = duration;
    }

    /**
     * Get physical power
     * @return the power
     */
    public int getPhysicalPower()
    {
        return mPhysicalPower;
    }

    /**
     * Set physical power
     * @param power the physical power to set
     */
    public void setPhysicalPower(int power)
    {
        this.mPhysicalPower = power;
    }
    
    /**
     * Get magical power
     * @return the magical power
     */
    public int getMagicalPower()
    {
        return mMagicalPower;
    }

    /**
     * Set magical power
     * @param power the magical power to set
     */
    public void setMagicalPower(int power)
    {
        this.mMagicalPower = power;
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
    public int getHP5()
    {
        return mHP5;
    }

    /**
     * Set hp5 health regen
     * @param hP5 the hP5 to set
     */
    public void setHP5(int hP5)
    {
        mHP5 = hP5;
    }

    /**
     * Get MP5 mana regen
     * @return the mP5
     */
    public int getMP5()
    {
        return mMP5;
    }

    /**
     * Set MP5 mana regen
     * @param mP5 the mP5 to set
     */
    public void setMP5(int mP5)
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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + mDuration;
		long temp;
		temp = Double.doubleToLongBits(mHP5);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mId;
		temp = Double.doubleToLongBits(mMP5);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mMagicalPower;
		temp = Double.doubleToLongBits(mMovementSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mPenetration;
		result = prime * result + mPhysicalPower;
		result = prime * result + mProtections;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SteroidDebuff other = (SteroidDebuff) obj;
		if (mDuration != other.mDuration)
			return false;
		if (Double.doubleToLongBits(mHP5) != Double.doubleToLongBits(other.mHP5))
			return false;
		if (mId != other.mId)
			return false;
		if (Double.doubleToLongBits(mMP5) != Double.doubleToLongBits(other.mMP5))
			return false;
		if (mMagicalPower != other.mMagicalPower)
			return false;
		if (Double.doubleToLongBits(mMovementSpeed) != Double.doubleToLongBits(other.mMovementSpeed))
			return false;
		if (mPenetration != other.mPenetration)
			return false;
		if (mPhysicalPower != other.mPhysicalPower)
			return false;
		if (mProtections != other.mProtections)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "SteroidDebuff [mId=" + mId + ", mDuration=" + mDuration + ", mPhysicalPower=" + mPhysicalPower
				+ ", mMagicalPower=" + mMagicalPower + ", mMovementSpeed=" + mMovementSpeed + ", mProtections=" 
				+ mProtections + ", mHP5=" + mHP5 + ", mMP5=" + mMP5+ ", mPenetration=" + mPenetration + "]";
	}

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    




}
