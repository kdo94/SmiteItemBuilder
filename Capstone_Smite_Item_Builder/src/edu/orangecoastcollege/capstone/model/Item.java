
package edu.orangecoastcollege.capstone.model;

import javafx.scene.image.Image;

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
    private Image mArt;
    private int mCost;
    private String mType;
    private int mHealth;
    private int mMana;
    private int mPhysicalProtection;
    private int mMagicalProtection;
    private int mPower;
    private double mAttackSpeed;
    private double mPercentPenetration;
    private int mFlatPenetration;
    private double mCriticalChance;
    private int mCooldownReduction;
    private double mLifesteal;
    private boolean mPassive;
    private double mHP5;
    private double mMP5;
    private int mCrowdControlReduction;

    /**
     * No Arg-constructor for item
     */
    public Item() {}

    /**
     * Arg constructor for item
     * @param id                    - id
     * @param name                  - name
     * @param art                   - image
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
     * @param lifesteal             - leech life
     * @param passive               - passive/active click
     * @param HP5                   - health regen
     * @param MP5                   - mana regen
     * @param crowdControlReduction - diminishing return?
     */
    public Item(int id,
                String name,
                Image art,
                int cost,
                String type,
                int health,
                int mana,
                int physicalProtection,
                int magicalProtection,
                int power,
                double attackSpeed,
                double percentPenetration,
                int flatPenetration,
                double criticalChance,
                int cooldownReduction,
                double lifesteal,
                boolean passive,
                double HP5,
                double MP5,
                int crowdControlReduction
            )
    {
        this.mId = id;
        this.mName = name;
        this.mArt = art;
        this.mCost = cost;
        this.mType = type;
        this.mHealth = health;
        this.mMana = mana;
        this.mPhysicalProtection = physicalProtection;
        this.mMagicalProtection = magicalProtection;
        this.mPower = power;
        this.mAttackSpeed = attackSpeed;
        this.mPercentPenetration = percentPenetration;
        this.mFlatPenetration = flatPenetration;
        this.mCriticalChance = criticalChance;
        this.mCooldownReduction = cooldownReduction;
        this.mLifesteal = lifesteal;
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
     * Get item type (physical/magical)
     * @return the type
     */
    public String getType()
    {
        return mType;
    }

    /**
     * Set type
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.mType = type;
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
     * Get lifesteal
     * @return the lifesteal
     */
    public double getLifesteal()
    {
        return mLifesteal;
    }

    /**
     * Set lifesteal
     * @param lifesteal the lifesteal to set
     */
    public void setLifesteal(double lifesteal)
    {
        this.mLifesteal = lifesteal;
    }

    /**
     * Active/passive item status
     * @return the passive
     */
    public boolean isPassive()
    {
        return mPassive;
    }

    /**
     * Set item passive status
     * @param passive the passive to set
     */
    public void setPassive(boolean passive)
    {
        this.mPassive = passive;
    }

    /**
     * Get HP5
     * @return the hP5
     */
    public double getHP5()
    {
        return mHP5;
    }

    /**
     * Set HP5
     * @param hP5 the hP5 to set
     */
    public void setHP5(double hP5)
    {
        mHP5 = hP5;
    }

    /**
     * Get MP5
     * @return the mP5
     */
    public double getMP5()
    {
        return mMP5;
    }

    /**
     * Set MP5
     * @param mP5 the mP5 to set
     */
    public void setMP5(double mP5)
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
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(mHP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mMP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mAttackSpeed);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mCooldownReduction;
        result = prime * result + mCost;
        temp = Double.doubleToLongBits(mCriticalChance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mCrowdControlReduction;
        result = prime * result + mFlatPenetration;
        result = prime * result + mHealth;
        result = prime * result + mId;
        temp = Double.doubleToLongBits(mLifesteal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mMagicalProtection;
        result = prime * result + mMana;
        result = prime * result + ((mName == null) ? 0 : mName.hashCode());
        result = prime * result + (mPassive ? 1231 : 1237);
        temp = Double.doubleToLongBits(mPercentPenetration);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mPhysicalProtection;
        result = prime * result + mPower;
        result = prime * result + ((mType == null) ? 0 : mType.hashCode());
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
        Item other = (Item) obj;
        if (Double.doubleToLongBits(mHP5) != Double.doubleToLongBits(other.mHP5)) return false;
        if (Double.doubleToLongBits(mMP5) != Double.doubleToLongBits(other.mMP5)) return false;
        if (Double.doubleToLongBits(mAttackSpeed) != Double.doubleToLongBits(other.mAttackSpeed)) return false;
        if (mCooldownReduction != other.mCooldownReduction) return false;
        if (mCost != other.mCost) return false;
        if (Double.doubleToLongBits(mCriticalChance) != Double.doubleToLongBits(other.mCriticalChance)) return false;
        if (mCrowdControlReduction != other.mCrowdControlReduction) return false;
        if (mFlatPenetration != other.mFlatPenetration) return false;
        if (mHealth != other.mHealth) return false;
        if (mId != other.mId) return false;
        if (Double.doubleToLongBits(mLifesteal) != Double.doubleToLongBits(other.mLifesteal)) return false;
        if (mMagicalProtection != other.mMagicalProtection) return false;
        if (mMana != other.mMana) return false;
        if (mName == null)
        {
            if (other.mName != null) return false;
        }
        else if (!mName.equals(other.mName)) return false;
        if (mPassive != other.mPassive) return false;
        if (Double.doubleToLongBits(mPercentPenetration) != Double.doubleToLongBits(other.mPercentPenetration))
            return false;
        if (mPhysicalProtection != other.mPhysicalProtection) return false;
        if (mPower != other.mPower) return false;
        if (mType == null)
        {
            if (other.mType != null) return false;
        }
        else if (!mType.equals(other.mType)) return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Item [id=" + mId + ", name=" + mName + ", cost=" + mCost + ", type=" + mType + ", health=" + mHealth
                + ", mana=" + mMana + ", physicalProtection=" + mPhysicalProtection + ", magicalProtection="
                + mMagicalProtection + ", power=" + mPower + ", attackSpeed=" + mAttackSpeed + ", percentPenetration="
                + mPercentPenetration + ", flatPenetration=" + mFlatPenetration + ", criticalChance=" + mCriticalChance
                + ", cooldownReduction=" + mCooldownReduction + ", lifesteal=" + mLifesteal + ", passive=" + mPassive
                + ", HP5=" + mHP5 + ", MP5=" + mMP5 + ", crowdControlReduction=" + mCrowdControlReduction + "]";
    }

}
