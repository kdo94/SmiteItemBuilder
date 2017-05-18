
package edu.orangecoastcollege.capstone.model;


/**
 * Item class is an entity class representing an item in
 * the game SMITE. It boosts the stats/attributes of the
 * God who is currently using/equipping the item
 *
 * @author ptang10
 *
 */
public class Item
{
    private int mId;
    private String mName;
    private int mCost;
    private int mHealth;
    private int mMana;
    private int mPhysicalProtection;
    private int mMagicalProtection;
    private int mPhysicalPower;
    private int mMagicalPower;
    private double mAttackSpeed;
    private double mPercentPenetration;
    private int mFlatPenetration;
    private double mCriticalChance;
    private int mCooldownReduction;
    private double mPhysicalLifesteal;
    private double mMagicalLifesteal;
    private String mPassive;
    private int mHP5;
    private int mMP5;
    private int mCrowdControlReduction;

    /**
     * No Arg-constructor for item
     */
    public Item() {}

    /**
     * Arg constructor for item
     * @param id                    - id
     * @param name                  - name
     * @param cost                  - cost
     * @param type                  - type phys/mag
     * @param health                - health inc
     * @param mana                  - mana inc
     * @param physicalProtection    - physical protect
     * @param magicalProtection     - magical protect
     * @param power                 - increase in power
     * @param attackSpeed           - attack speed
     * @param percentPenetration    - relative negate armor
     * @param flatPenetration       - absolute negate armor
     * @param criticalChance        - extra damage
     * @param cooldownReduction     - ability cooldown
     * @param physcialLifesteal     - physical leech life
     * @param magicalLifesteam		- magical leech life
     * @param passive               - passive/active click
     * @param HP5                   - health regen
     * @param MP5                   - mana regen
     * @param crowdControlReduction - crowd control cooldown
     */
    public Item(int id,
                String name,
                int cost,
                int health,
                int mana,
                int physicalProtection,
                int magicalProtection,
                int physicalPower,
                int magicalPower,
                double attackSpeed,
                double percentPenetration,
                int flatPenetration,
                double criticalChance,
                int cooldownReduction,
                double physicalLifesteal,
                double magicalLifesteal,
                String passive,
                int HP5,
                int MP5,
                int crowdControlReduction
            )
    {
        this.mId = id;
        this.mName = name;
        this.mCost = cost;
        this.mHealth = health;
        this.mMana = mana;
        this.mPhysicalProtection = physicalProtection;
        this.mMagicalProtection = magicalProtection;
        this.mPhysicalPower = physicalPower;
        this.mMagicalPower = magicalPower;
        this.mAttackSpeed = attackSpeed;
        this.mPercentPenetration = percentPenetration;
        this.mFlatPenetration = flatPenetration;
        this.mCriticalChance = criticalChance;
        this.mCooldownReduction = cooldownReduction;
        this.mPhysicalLifesteal = physicalLifesteal;
        this.mMagicalLifesteal = magicalLifesteal;
        this.mPassive = passive;
        this.mHP5 = HP5;
        this.mMP5 = MP5;
        this.mCrowdControlReduction = crowdControlReduction;
    }

    /**
     * Get id of item
     * @return the id
     */
    public int getId()
    {
        return mId;
    }

    /**
     * Set id of item
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.mId = id;
    }

    /**
     * Get name of item
     * @return the name
     */
    public String getName()
    {
        return mName;
    }

    /**
     * Set name of item
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.mName = name;
    }

    /**
     * Get cost
     * @return the cost
     */
    public int getCost()
    {
        return mCost;
    }

    /**
     * Set cost
     * @param cost the cost to set
     */
    public void setCost(int cost)
    {
        this.mCost = cost;
    }

    /**
     * Get health
     * @return the health
     */
    public int getHealth()
    {
        return mHealth;
    }

    /**
     * Set health
     * @param health the health to set
     */
    public void setHealth(int health)
    {
        this.mHealth = health;
    }

    /**
     * Get mana
     * @return the mana
     */
    public int getMana()
    {
        return mMana;
    }

    /**
     * Set mana
     * @param mana the mana to set
     */
    public void setMana(int mana)
    {
        this.mMana = mana;
    }

    /**
     * Get physical protection
     * @return the physicalProtection
     */
    public int getPhysicalProtection()
    {
        return mPhysicalProtection;
    }

    /**
     * Set physical protection
     * @param physicalProtection the physicalProtection to set
     */
    public void setPhysicalProtection(int physicalProtection)
    {
        this.mPhysicalProtection = physicalProtection;
    }

    /**
     * Get magical protection
     * @return the magicalProtection
     */
    public int getMagicalProtection()
    {
        return mMagicalProtection;
    }

    /**
     * Set magical protection
     * @param magicalProtection the magicalProtection to set
     */
    public void setMagicalProtection(int magicalProtection)
    {
        this.mMagicalProtection = magicalProtection;
    }

    /**
     * Get Physical power
     * @return the physical power
     */
    public int getPhysicalPower()
    {
        return mPhysicalPower;
    }

    /**
     * Set Physical power
     * @param power the magical power to set
     */
    public void setPhyscialPower(int power)
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
     * Set Magical power
     * @param power the Magical power to set
     */
    public void setMagicalPower(int power)
    {
        this.mMagicalPower = power;
    }

    /**
     * Get attack speed
     * @return the attackSpeed
     */
    public double getAttackSpeed()
    {
        return mAttackSpeed;
    }

    /**
     * Set attack speed
     * @param attackSpeed the attackSpeed to set
     */
    public void setAttackSpeed(double attackSpeed)
    {
        this.mAttackSpeed = attackSpeed;
    }

    /**
     * Get percent pen
     * @return the percentPenetration
     */
    public double getPercentPenetration()
    {
        return mPercentPenetration;
    }

    /**
     * Set percent pen
     * @param percentPenetration the percentPenetration to set
     */
    public void setPercentPenetration(double percentPenetration)
    {
        this.mPercentPenetration = percentPenetration;
    }

    /**
     * Get flat pen
     * @return the flatPenetration
     */
    public int getFlatPenetration()
    {
        return mFlatPenetration;
    }

    /**
     * Set flat pen
     * @param flatPenetration the flatPenetration to set
     */
    public void setFlatPenetration(int flatPenetration)
    {
        this.mFlatPenetration = flatPenetration;
    }

    /**
     * Get crit chance
     * @return the criticalChance
     */
    public double getCriticalChance()
    {
        return mCriticalChance;
    }

    /**
     * Set crit chance
     * @param criticalChance the criticalChance to set
     */
    public void setCriticalChance(double criticalChance)
    {
        this.mCriticalChance = criticalChance;
    }

    /**
     * Get cooldown reduction
     * @return the cooldownReduction
     */
    public int getCooldownReduction()
    {
        return mCooldownReduction;
    }

    /**
     * Set cooldown reduction
     * @param cooldownReduction the cooldownReduction to set
     */
    public void setCooldownReduction(int cooldownReduction)
    {
        this.mCooldownReduction = cooldownReduction;
    }

    /**
     * Get physical lifesteal
     * @return the physical lifesteal
     */
    public double getPhysicalLifesteal()
    {
        return mPhysicalLifesteal;
    }

    /**
     * Set physical lifesteal
     * @param lifesteal the physical lifesteal to set
     */
    public void setPhysicalLifesteal(double lifesteal)
    {
        this.mPhysicalLifesteal = lifesteal;
    }
    
    /**
     * Get magical lifesteal
     * @return the magical lifesteal
     */
    public double getMagicalLifesteal()
    {
        return mMagicalLifesteal;
    }

    /**
     * Set lifesteal
     * @param lifesteal the lifesteal to set
     */
    public void setMagicalLifesteal(double lifesteal)
    {
        this.mMagicalLifesteal = lifesteal;
    }

    /**
     * Active/passive item status
     * @return the passive
     */
    public String getPassive()
    {
        return mPassive;
    }

    /**
     * Set item passive status
     * @param passive the passive to set
     */
    public void setPassive(String passive)
    {
        this.mPassive = passive;
    }

    /**
     * Get HP5
     * @return the hP5
     */
    public int getHP5()
    {
        return mHP5;
    }

    /**
     * Set HP5
     * @param hP5 the hP5 to set
     */
    public void setHP5(int hP5)
    {
        mHP5 = hP5;
    }

    /**
     * Get MP5
     * @return the mP5
     */
    public int getMP5()
    {
        return mMP5;
    }

    /**
     * Set MP5
     * @param mP5 the mP5 to set
     */
    public void setMP5(int mP5)
    {
        mMP5 = mP5;
    }

    /**
     * Get crowd control reduction
     * @return the crowdControlReduction
     */
    public int getCrowdControlReduction()
    {
        return mCrowdControlReduction;
    }

    /**
     * Set crowd control reduction
     * @param crowdControlReduction the crowdControlReduction to set
     */
    public void setCrowdControlReduction(int crowdControlReduction)
    {
        this.mCrowdControlReduction = crowdControlReduction;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
	

	@Override
	public String toString()
	{
		return "Item [mId=" + mId + ", mName=" + mName + ", mCost=" + mCost + ", mHealth="
				+ mHealth + ", mMana=" + mMana + ", mPhysicalProtection=" + mPhysicalProtection
				+ ", mMagicalProtection=" + mMagicalProtection + ", mPhysicalPower=" + mPhysicalPower
				+ ", mMagicalPower=" + mMagicalPower + ", mAttackSpeed=" + mAttackSpeed + ", mPercentPenetration="
				+ mPercentPenetration + ", mFlatPenetration=" + mFlatPenetration + ", mCriticalChance="
				+ mCriticalChance + ", mCooldownReduction=" + mCooldownReduction + ", mPhysicalLifesteal="
				+ mPhysicalLifesteal + ", mMagicalLifesteal=" + mMagicalLifesteal + ", mPassive=" + mPassive + ", mHP5="
				+ mHP5 + ", mMP5=" + mMP5 + ", mCrowdControlReduction=" + mCrowdControlReduction + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(mAttackSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mCooldownReduction;
		result = prime * result + mCost;
		temp = Double.doubleToLongBits(mCriticalChance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mCrowdControlReduction;
		result = prime * result + mFlatPenetration;
		result = prime * result + mHP5;
		result = prime * result + mHealth;
		result = prime * result + mId;
		result = prime * result + mMP5;
		temp = Double.doubleToLongBits(mMagicalLifesteal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mMagicalPower;
		result = prime * result + mMagicalProtection;
		result = prime * result + mMana;
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + ((mPassive == null) ? 0 : mPassive.hashCode());
		temp = Double.doubleToLongBits(mPercentPenetration);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mPhysicalLifesteal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mPhysicalPower;
		result = prime * result + mPhysicalProtection;
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
		Item other = (Item) obj;
		if (Double.doubleToLongBits(mAttackSpeed) != Double.doubleToLongBits(other.mAttackSpeed))
			return false;
		if (mCooldownReduction != other.mCooldownReduction)
			return false;
		if (mCost != other.mCost)
			return false;
		if (Double.doubleToLongBits(mCriticalChance) != Double.doubleToLongBits(other.mCriticalChance))
			return false;
		if (mCrowdControlReduction != other.mCrowdControlReduction)
			return false;
		if (mFlatPenetration != other.mFlatPenetration)
			return false;
		if (mHP5 != other.mHP5)
			return false;
		if (mHealth != other.mHealth)
			return false;
		if (mId != other.mId)
			return false;
		if (mMP5 != other.mMP5)
			return false;
		if (Double.doubleToLongBits(mMagicalLifesteal) != Double.doubleToLongBits(other.mMagicalLifesteal))
			return false;
		if (mMagicalPower != other.mMagicalPower)
			return false;
		if (mMagicalProtection != other.mMagicalProtection)
			return false;
		if (mMana != other.mMana)
			return false;
		if (mName == null)
		{
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (mPassive == null)
		{
			if (other.mPassive != null)
				return false;
		} else if (!mPassive.equals(other.mPassive))
			return false;
		if (Double.doubleToLongBits(mPercentPenetration) != Double.doubleToLongBits(other.mPercentPenetration))
			return false;
		if (Double.doubleToLongBits(mPhysicalLifesteal) != Double.doubleToLongBits(other.mPhysicalLifesteal))
			return false;
		if (mPhysicalPower != other.mPhysicalPower)
			return false;
		if (mPhysicalProtection != other.mPhysicalProtection)
			return false;
		return true;
	}
	
	
}
