package edu.orangecoastcollege.capstone.model;

import javafx.scene.image.Image;

/**
 * God class is an entity class representing a God (character)
 * in the game SMITE.  The God class contains all info on
 * God, including its base stats and attributes
 *
 * @author ptang10
 *
 */
public class God
{
    private int mId;
    private String mName;
    private String mGodClass;
    private String mType;
    private Image mArt;
    private int mBaseHealth;
    private int mBasePProtection;
    private int mBaseMProtection;
    private int mBaseMana;
    private double mBaseAttackSpeed;
    private double mBaseHP5;
    private double mBaseMP5;
    private double mPhysicalProtectScaling;
    private double mMagicalProtectScaling;
    private int mBaseMovementSpeed;
    private int mBaseDamage;
    private double mDamageScaling;
    private String mPantheon;

    /**
     * Default no-arg constructor
     */
    public God() {}

    /**
     * Arg constructor for God
     *
     * @param id                - id
     * @param name              - name
     * @param godClass          - class ex: mage/hunter/guardian/assassin
     * @param type              - physical/magical
     * @param art               - picture of god
     * @param baseHealth        - base health
     * @param basePProtection   - base physical protection
     * @param baseMProtection   - base magical protection
     * @param baseMana          - base mana
     * @param baseAttackSpeed   - base attack speed
     * @param baseHP5           - base health regen
     * @param baseMP5           - base mana regen
     * @param physicalProtectScaling    - physical protection scaling
     * @param magicalProtectScaling     - magical protection scaling
     * @param baseMovementSpeed         - base movement speed
     * @param baseDamage                - base damage
     * @param damageScaling             - damage scaling
     * @param pantheon                  - race/ethnicity
     */
    public God(int id,
               String name,
               String godClass,
               String type,
               Image art,
               int baseHealth,
               int basePProtection,
               int baseMProtection,
               int baseMana,
               double baseAttackSpeed,
               double baseHP5,
               double baseMP5,
               double physicalProtectScaling,
               double magicalProtectScaling,
               int baseMovementSpeed,
               int baseDamage,
               double damageScaling,
               String pantheon
            )
    {
        this.mId = id;
        this.mName = name;
        this.mGodClass = godClass;
        this.mType = type;
        this.mArt = art;
        this.mBaseHealth = baseHealth;
        this.mBasePProtection = basePProtection;
        this.mBaseMProtection = baseMProtection;
        this.mBaseMana = baseMana;
        this.mBaseAttackSpeed = baseAttackSpeed;
        this.mBaseHP5 = baseHP5;
        this.mBaseMP5 = baseMP5;
        this.mPhysicalProtectScaling = physicalProtectScaling;
        this.mMagicalProtectScaling = magicalProtectScaling;
        this.mBaseMovementSpeed = baseMovementSpeed;
        this.mBaseDamage = baseDamage;
        this.mDamageScaling = damageScaling;
        this.mPantheon = pantheon;
    }

    /**
     * Get id of god
     * @return the id
     */
    public int getId()
    {
        return mId;
    }

    /**
     * Set id of god
     * @param the id to set
     */
    public void setId(int id)
    {
        this.mId = id;
    }
    /**
     * Get name of God
     * @return the name
     */
    public String getName()
    {
        return mName;
    }

    /**
     * Set Name of God
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.mName = name;
    }

    /**
     * Get class of god
     * @return the mClass
     */
    public String getGodClass()
    {
        return mGodClass;
    }

    /**
     * Set class of god
     * @param mClass the mClass to set
     */
    public void setClass(String godClass)
    {
        this.mGodClass = godClass;
    }

    /**
     * Get type of god
     * @return the type
     */
    public String getType()
    {
        return mType;
    }

    /**
     * Set type of god
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.mType = type;
    }

    /**
     * Get image of god
     * @return the art
     */
    public Image getArt()
    {
        return mArt;
    }

    /**
     * Set image of god
     * @param art the art to set
     */
    public void setArt(Image art)
    {
        this.mArt = art;
    }

    /**
     * Get base health of god
     * @return the baseHealth
     */
    public int getBaseHealth()
    {
        return mBaseHealth;
    }

    /**
     * Set base health of god
     * @param baseHealth the baseHealth to set
     */
    public void setBaseHealth(int baseHealth)
    {
        this.mBaseHealth = baseHealth;
    }

    /**
     * Get base physical protection of god
     * @return the basePProtection
     */
    public int getBasePProtection()
    {
        return mBasePProtection;
    }

    /**
     * Set base physical protection of god
     * @param basePProtection the basePProtection to set
     */
    public void setBasePProtection(int basePProtection)
    {
        this.mBasePProtection = basePProtection;
    }

    /**
     * Get base magical protection of god
     * @return the baseMProtection
     */
    public int getBaseMProtection()
    {
        return mBaseMProtection;
    }

    /**
     * Set base magical protection of god
     * @param baseMProtection the baseMProtection to set
     */
    public void setBaseMProtection(int baseMProtection)
    {
        this.mBaseMProtection = baseMProtection;
    }

    /**
     * Get base mana of god
     * @return the baseMana
     */
    public int getBaseMana()
    {
        return mBaseMana;
    }

    /**
     * Set base mana of god
     * @param baseMana the baseMana to set
     */
    public void setBaseMana(int baseMana)
    {
        this.mBaseMana = baseMana;
    }

    /**
     * Get base attack speed of god
     * @return the baseAttackSpeed
     */
    public double getBaseAttackSpeed()
    {
        return mBaseAttackSpeed;
    }

    /**
     * Set base attack speed of god
     * @param baseAttackSpeed the baseAttackSpeed to set
     */
    public void setBaseAttackSpeed(double baseAttackSpeed)
    {
        this.mBaseAttackSpeed = baseAttackSpeed;
    }

    /**
     * Get base health regen
     * @return the baseHP5
     */
    public double getBaseHP5()
    {
        return mBaseHP5;
    }

    /**
     * Set base health regen
     * @param baseHP5 the baseHP5 to set
     */
    public void setBaseHP5(double baseHP5)
    {
        this.mBaseHP5 = baseHP5;
    }

    /**
     * Get base mana regen
     * @return the baseMP5
     */
    public double getBaseMP5()
    {
        return mBaseMP5;
    }

    /**
     * Set base mana regen
     * @param baseMP5 the baseMP5 to set
     */
    public void setBaseMP5(double baseMP5)
    {
        this.mBaseMP5 = baseMP5;
    }

    /**
     * Get physical protection scaling
     * @return the physicalProtectScaling
     */
    public double getPhysicalProtectScaling()
    {
        return mPhysicalProtectScaling;
    }

    /**
     * Set physical protection scaling
     * @param physicalProtectScaling the physicalProtectScaling to set
     */
    public void setPhysicalProtectScaling(double physicalProtectScaling)
    {
        this.mPhysicalProtectScaling = physicalProtectScaling;
    }

    /**
     * Get magical protection scaling
     * @return the magicalProtectScaling
     */
    public double getMagicalProtectScaling()
    {
        return mMagicalProtectScaling;
    }

    /**
     * Set magical protection scaling
     * @param magicalProtectScaling the magicalProtectScaling to set
     */
    public void setMagicalProtectScaling(double magicalProtectScaling)
    {
        this.mMagicalProtectScaling = magicalProtectScaling;
    }

    /**
     * Get base movement speed
     * @return the baseMovementSpeed
     */
    public int getBaseMovementSpeed()
    {
        return mBaseMovementSpeed;
    }

    /**
     * Set base movement speed
     * @param baseMovementSpeed the baseMovementSpeed to set
     */
    public void setBaseMovementSpeed(int baseMovementSpeed)
    {
        this.mBaseMovementSpeed = baseMovementSpeed;
    }

    /**
     * Get base damage
     * @return the baseDamage
     */
    public int getBaseDamage()
    {
        return mBaseDamage;
    }

    /**
     * Set base damage
     * @param baseDamage the baseDamage to set
     */
    public void setBaseDamage(int baseDamage)
    {
        this.mBaseDamage = baseDamage;
    }

    /**
     * Get damage scaling
     * @return the damageScaling
     */
    public double getDamageScaling()
    {
        return mDamageScaling;
    }

    /**
     * Set damage scaling
     * @param damageScaling the damageScaling to set
     */
    public void setDamageScaling(double damageScaling)
    {
        this.mDamageScaling = damageScaling;
    }

    /**
     * Get ethnicity
     * @return the pantheon
     */
    public String getPantheon()
    {
        return mPantheon;
    }

    /**
     * Set ethnicity
     * @param pantheon the pantheon to set
     */
    public void setPantheon(String pantheon)
    {
        this.mPantheon = pantheon;
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
        temp = Double.doubleToLongBits(mBaseAttackSpeed);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mBaseDamage;
        temp = Double.doubleToLongBits(mBaseHP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mBaseHealth;
        temp = Double.doubleToLongBits(mBaseMP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + mBaseMProtection;
        result = prime * result + mBaseMana;
        result = prime * result + mBaseMovementSpeed;
        result = prime * result + mBasePProtection;
        temp = Double.doubleToLongBits(mDamageScaling);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((mGodClass == null) ? 0 : mGodClass.hashCode());
        temp = Double.doubleToLongBits(mMagicalProtectScaling);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((mName == null) ? 0 : mName.hashCode());
        result = prime * result + ((mPantheon == null) ? 0 : mPantheon.hashCode());
        temp = Double.doubleToLongBits(mPhysicalProtectScaling);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        God other = (God) obj;
        if (Double.doubleToLongBits(mBaseAttackSpeed) != Double.doubleToLongBits(other.mBaseAttackSpeed)) return false;
        if (mBaseDamage != other.mBaseDamage) return false;
        if (Double.doubleToLongBits(mBaseHP5) != Double.doubleToLongBits(other.mBaseHP5)) return false;
        if (mBaseHealth != other.mBaseHealth) return false;
        if (Double.doubleToLongBits(mBaseMP5) != Double.doubleToLongBits(other.mBaseMP5)) return false;
        if (mBaseMProtection != other.mBaseMProtection) return false;
        if (mBaseMana != other.mBaseMana) return false;
        if (mBaseMovementSpeed != other.mBaseMovementSpeed) return false;
        if (mBasePProtection != other.mBasePProtection) return false;
        if (Double.doubleToLongBits(mDamageScaling) != Double.doubleToLongBits(other.mDamageScaling)) return false;
        if (mGodClass == null)
        {
            if (other.mGodClass != null) return false;
        }
        else if (!mGodClass.equals(other.mGodClass)) return false;
        if (Double.doubleToLongBits(mMagicalProtectScaling) != Double.doubleToLongBits(other.mMagicalProtectScaling))
            return false;
        if (mName == null)
        {
            if (other.mName != null) return false;
        }
        else if (!mName.equals(other.mName)) return false;
        if (mPantheon == null)
        {
            if (other.mPantheon != null) return false;
        }
        else if (!mPantheon.equals(other.mPantheon)) return false;
        if (Double.doubleToLongBits(mPhysicalProtectScaling) != Double.doubleToLongBits(other.mPhysicalProtectScaling))
            return false;
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
        return "God [mName=" + mName + ", mGodClass=" + mGodClass + ", mType=" + mType + ", mBaseHealth=" + mBaseHealth
                + ", mBasePProtection=" + mBasePProtection + ", mBaseMProtection=" + mBaseMProtection + ", mBaseMana="
                + mBaseMana + ", mBaseAttackSpeed=" + mBaseAttackSpeed + ", mBaseHP5=" + mBaseHP5 + ", mBaseMP5="
                + mBaseMP5 + ", mPhysicalProtectScaling=" + mPhysicalProtectScaling + ", mMagicalProtectScaling="
                + mMagicalProtectScaling + ", mBaseMovementSpeed=" + mBaseMovementSpeed + ", mBaseDamage=" + mBaseDamage
                + ", mDamageScaling=" + mDamageScaling + ", mPantheon=" + mPantheon + "]";
    }




















}
