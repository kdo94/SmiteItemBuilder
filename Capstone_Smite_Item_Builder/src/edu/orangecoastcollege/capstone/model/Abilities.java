package edu.orangecoastcollege.capstone.model;

/**
 * Abilities class represents all four abilities
 * used by a God in the game SMITE.  This includes
 * 3 abilities an an ultimate ability. Info
 * on each ability such as name, damage, scaling,
 * overtime, passive are attributes of the class
 * @author ptang10
 *
 */
public class Abilities
{
    private int mId;
    private God mGod;
    private String mName1;
    private int mDamage1;
    private double mScaling1;
    private String mName2;
    private int mDamage2;
    private double mScaling2;
    private String mName3;
    private int mDamage3;
    private double mScaling3;
    private String mUltimateName;
    private int mUltimateDamage;
    private double mUltimateScaling;

    /**
     * No-arg constructor
     */
    public Abilities(){}

    /**
     * Arg constructor for abilities
     * @param id                - id of abilities
     * @param god               - god of abilities
     * @param name1             - ability 1 name
     * @param damage1           - ability 1 damage
     * @param scaling1          - ability 1 scaling
     * @param passive1          - ability 1 passive
     * @param name2             - ability 2 name
     * @param damage2           - ability 2 damage
     * @param scaling2          - ability 2 scaling
     * @param passive2          - ability 2 passive
     * @param name1             - ability 1 name
     * @param damage1           - ability 1 damage
     * @param scaling1          - ability 1 scaling
     * @param passive1          - ability 1 passive
     * @param ultimateName      - ultimate name
     * @param ultimateDamage    - ult damage
     * @param ultimateScaling   - ult scaling
     * @param ultimatePassive
     */
    public Abilities(int id,
                     God god,
                     String name1,
                     int damage1,
                     double scaling1,
                     String name2,
                     int damage2,
                     double scaling2,
                     String name3,
                     int damage3,
                     double scaling3,
                     String ultimateName,
                     int ultimateDamage,
                     double ultimateScaling)
    {
        this.mId = id;
        this.mGod = god;
        this.mName1 = name1;
        this.mDamage1 = damage1;
        this.mScaling1 = scaling1;
        this.mName2 = name2;
        this.mDamage2 = damage2;
        this.mScaling2 = scaling2;
        this.mName3 = name3;
        this.mDamage3 = damage3;
        this.mScaling3 = scaling3;
        this.mUltimateName = ultimateName;
        this.mUltimateDamage = ultimateDamage;
        this.mUltimateScaling = ultimateScaling;
    }

    /**
     * Get id of abilities
     * @return the id
     */
    public int getId()
    {
        return mId;
    }

    /**
     * Set id of abilities
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.mId = id;
    }

    /**
     * Get god of abilities
     * @return the god
     */
    public God getGod()
    {
        return mGod;
    }

    /**
     * Set god of abilities
     * @param god the god to set
     */
    public void setGod(God god)
    {
        this.mGod = god;
    }

    /**
     * Get ability name 1
     * @return the name1
     */
    public String getName1()
    {
        return mName1;
    }

    /**
     * Set ability 1 name
     * @param name1 the name1 to set
     */
    public void setName1(String name1)
    {
        this.mName1 = name1;
    }

    /**
     * Get ability 1 damage
     * @return the damage1
     */
    public int getDamage1()
    {
        return mDamage1;
    }

    /**
     * Set ability 1 damage
     * @param damage1 the damage1 to set
     */
    public void setDamage1(int damage1)
    {
        this.mDamage1 = damage1;
    }

    /**
     * Get ability 1 scaling
     * @return the scaling1
     */
    public double getScaling1()
    {
        return mScaling1;
    }

    /**
     * Set ability 1 scaling
     * @param scaling1 the scaling1 to set
     */
    public void setScaling1(double scaling1)
    {
        this.mScaling1 = scaling1;
    }

    /**
     * @return the name2
     */
    public String getName2()
    {
        return mName2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2)
    {
        this.mName2 = name2;
    }

    /**
     * @return the damage2
     */
    public int getDamage2()
    {
        return mDamage2;
    }

    /**
     * @param damage2 the damage2 to set
     */
    public void setDamage2(int damage2)
    {
        this.mDamage2 = damage2;
    }

    /**
     * @return the scaling2
     */
    public double getScaling2()
    {
        return mScaling2;
    }

    /**
     * @param scaling2 the scaling2 to set
     */
    public void setScaling2(double scaling2)
    {
        this.mScaling2 = scaling2;
    }

    /**
     * @return the name3
     */
    public String getName3()
    {
        return mName3;
    }

    /**
     * @param name3 the name3 to set
     */
    public void setName3(String name3)
    {
        this.mName3 = name3;
    }

    /**
     * @return the damage3
     */
    public int getDamage3()
    {
        return mDamage3;
    }

    /**
     * @param damage3 the damage3 to set
     */
    public void setDamage3(int damage3)
    {
        this.mDamage3 = damage3;
    }

    /**
     * @return the scaling3
     */
    public double getScaling3()
    {
        return mScaling3;
    }

    /**
     * @param scaling3 the scaling3 to set
     */
    public void setScaling3(double scaling3)
    {
        this.mScaling3 = scaling3;
    }

    /**
     * @return the ultimateName
     */
    public String getUltimateName()
    {
        return mUltimateName;
    }

    /**
     * @param ultimateName the ultimateName to set
     */
    public void setUltimateName(String ultimateName)
    {
        this.mUltimateName = ultimateName;
    }

    /**
     * @return the ultimateDamage
     */
    public int getUltimateDamage()
    {
        return mUltimateDamage;
    }

    /**
     * @param ultimateDamage the ultimateDamage to set
     */
    public void setUltimateDamage(int ultimateDamage)
    {
        this.mUltimateDamage = ultimateDamage;
    }

    /**
     * @return the ultimateScaling
     */
    public double getUltimateScaling()
    {
        return mUltimateScaling;
    }

    /**
     * @param ultimateScaling the ultimateScaling to set
     */
    public void setUltimateScaling(double ultimateScaling)
    {
        this.mUltimateScaling = ultimateScaling;
    }
    

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString()
	{
		return "Abilities [mId=" + mId + ", mGod=" + mGod + ", mName1=" + mName1 + ", mDamage1=" + mDamage1
				+ ", mScaling1=" + mScaling1 + ", mName2=" + mName2 + ", mDamage2=" + mDamage2 + ", mScaling2="
				+ mScaling2 + ", mName3=" + mName3 + ", mDamage3=" + mDamage3 + ", mScaling3=" + mScaling3
				+ ", mUltimateName=" + mUltimateName + ", mUltimateDamage=" + mUltimateDamage + ", mUltimateScaling="
				+ mUltimateScaling + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + mDamage1;
		result = prime * result + mDamage2;
		result = prime * result + mDamage3;
		result = prime * result + ((mGod == null) ? 0 : mGod.hashCode());
		result = prime * result + mId;
		result = prime * result + ((mName1 == null) ? 0 : mName1.hashCode());
		result = prime * result + ((mName2 == null) ? 0 : mName2.hashCode());
		result = prime * result + ((mName3 == null) ? 0 : mName3.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mScaling1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mScaling2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mScaling3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mUltimateDamage;
		result = prime * result + ((mUltimateName == null) ? 0 : mUltimateName.hashCode());
		temp = Double.doubleToLongBits(mUltimateScaling);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Abilities other = (Abilities) obj;
		if (mDamage1 != other.mDamage1)
			return false;
		if (mDamage2 != other.mDamage2)
			return false;
		if (mDamage3 != other.mDamage3)
			return false;
		if (mGod == null)
		{
			if (other.mGod != null)
				return false;
		} else if (!mGod.equals(other.mGod))
			return false;
		if (mId != other.mId)
			return false;
		if (mName1 == null)
		{
			if (other.mName1 != null)
				return false;
		} else if (!mName1.equals(other.mName1))
			return false;
		if (mName2 == null)
		{
			if (other.mName2 != null)
				return false;
		} else if (!mName2.equals(other.mName2))
			return false;
		if (mName3 == null)
		{
			if (other.mName3 != null)
				return false;
		} else if (!mName3.equals(other.mName3))
			return false;
		if (Double.doubleToLongBits(mScaling1) != Double.doubleToLongBits(other.mScaling1))
			return false;
		if (Double.doubleToLongBits(mScaling2) != Double.doubleToLongBits(other.mScaling2))
			return false;
		if (Double.doubleToLongBits(mScaling3) != Double.doubleToLongBits(other.mScaling3))
			return false;
		if (mUltimateDamage != other.mUltimateDamage)
			return false;
		if (mUltimateName == null)
		{
			if (other.mUltimateName != null)
				return false;
		} else if (!mUltimateName.equals(other.mUltimateName))
			return false;
		if (Double.doubleToLongBits(mUltimateScaling) != Double.doubleToLongBits(other.mUltimateScaling))
			return false;
		return true;
	}
   
}
