
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
    private int id;
    private String name;
    private Image art;
    private int cost;
    private String type;
    private int health;
    private int mana;
    private int physicalProtection;
    private int magicalProtection;
    private int power;
    private double attackSpeed;
    private double percentPenetration;
    private int flatPenetration;
    private double criticalChance;
    private int cooldownReduction;
    private double lifesteal;
    private boolean passive;
    private double HP5;
    private double MP5;
    private int crowdControlReduction;

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
        this.id = id;
        this.name = name;
        this.art = art;
        this.cost = cost;
        this.type = type;
        this.health = health;
        this.mana = mana;
        this.physicalProtection = physicalProtection;
        this.magicalProtection = magicalProtection;
        this.power = power;
        this.attackSpeed = attackSpeed;
        this.percentPenetration = percentPenetration;
        this.flatPenetration = flatPenetration;
        this.criticalChance = criticalChance;
        this.cooldownReduction = cooldownReduction;
        this.lifesteal = lifesteal;
        this.passive = passive;
        this.HP5 = HP5;
        this.MP5 = MP5;
        this.crowdControlReduction = crowdControlReduction;
    }

    /**
     * Get id of item
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Set id of item
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Get name of item
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set name of item
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Get cost
     * @return the cost
     */
    public int getCost()
    {
        return cost;
    }

    /**
     * Set cost
     * @param cost the cost to set
     */
    public void setCost(int cost)
    {
        this.cost = cost;
    }

    /**
     * Get item type (physical/magical)
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Set type
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Get health
     * @return the health
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * Set health
     * @param health the health to set
     */
    public void setHealth(int health)
    {
        this.health = health;
    }

    /**
     * Get mana
     * @return the mana
     */
    public int getMana()
    {
        return mana;
    }

    /**
     * Set mana
     * @param mana the mana to set
     */
    public void setMana(int mana)
    {
        this.mana = mana;
    }

    /**
     * Get physical protection
     * @return the physicalProtection
     */
    public int getPhysicalProtection()
    {
        return physicalProtection;
    }

    /**
     * Set physical protection
     * @param physicalProtection the physicalProtection to set
     */
    public void setPhysicalProtection(int physicalProtection)
    {
        this.physicalProtection = physicalProtection;
    }

    /**
     * Get magical protection
     * @return the magicalProtection
     */
    public int getMagicalProtection()
    {
        return magicalProtection;
    }

    /**
     * Set magical protection
     * @param magicalProtection the magicalProtection to set
     */
    public void setMagicalProtection(int magicalProtection)
    {
        this.magicalProtection = magicalProtection;
    }

    /**
     * Get power
     * @return the power
     */
    public int getPower()
    {
        return power;
    }

    /**
     * Set power
     * @param power the power to set
     */
    public void setPower(int power)
    {
        this.power = power;
    }

    /**
     * Get attack speed
     * @return the attackSpeed
     */
    public double getAttackSpeed()
    {
        return attackSpeed;
    }

    /**
     * Set attack speed
     * @param attackSpeed the attackSpeed to set
     */
    public void setAttackSpeed(double attackSpeed)
    {
        this.attackSpeed = attackSpeed;
    }

    /**
     * Get percent pen
     * @return the percentPenetration
     */
    public double getPercentPenetration()
    {
        return percentPenetration;
    }

    /**
     * Set percent pen
     * @param percentPenetration the percentPenetration to set
     */
    public void setPercentPenetration(double percentPenetration)
    {
        this.percentPenetration = percentPenetration;
    }

    /**
     * Get flat pen
     * @return the flatPenetration
     */
    public int getFlatPenetration()
    {
        return flatPenetration;
    }

    /**
     * Set flat pen
     * @param flatPenetration the flatPenetration to set
     */
    public void setFlatPenetration(int flatPenetration)
    {
        this.flatPenetration = flatPenetration;
    }

    /**
     * Get crit chance
     * @return the criticalChance
     */
    public double getCriticalChance()
    {
        return criticalChance;
    }

    /**
     * Set crit chance
     * @param criticalChance the criticalChance to set
     */
    public void setCriticalChance(double criticalChance)
    {
        this.criticalChance = criticalChance;
    }

    /**
     * Get cooldown reduction
     * @return the cooldownReduction
     */
    public int getCooldownReduction()
    {
        return cooldownReduction;
    }

    /**
     * Set cooldown reduction
     * @param cooldownReduction the cooldownReduction to set
     */
    public void setCooldownReduction(int cooldownReduction)
    {
        this.cooldownReduction = cooldownReduction;
    }

    /**
     * Get lifesteal
     * @return the lifesteal
     */
    public double getLifesteal()
    {
        return lifesteal;
    }

    /**
     * Set lifesteal
     * @param lifesteal the lifesteal to set
     */
    public void setLifesteal(double lifesteal)
    {
        this.lifesteal = lifesteal;
    }

    /**
     * Active/passive item status
     * @return the passive
     */
    public boolean isPassive()
    {
        return passive;
    }

    /**
     * Set item passive status
     * @param passive the passive to set
     */
    public void setPassive(boolean passive)
    {
        this.passive = passive;
    }

    /**
     * Get HP5
     * @return the hP5
     */
    public double getHP5()
    {
        return HP5;
    }

    /**
     * Set HP5
     * @param hP5 the hP5 to set
     */
    public void setHP5(double hP5)
    {
        HP5 = hP5;
    }

    /**
     * Get MP5
     * @return the mP5
     */
    public double getMP5()
    {
        return MP5;
    }

    /**
     * Set MP5
     * @param mP5 the mP5 to set
     */
    public void setMP5(double mP5)
    {
        MP5 = mP5;
    }

    /**
     * Get crowd control reduction
     * @return the crowdControlReduction
     */
    public int getCrowdControlReduction()
    {
        return crowdControlReduction;
    }

    /**
     * Set crowd control reduction
     * @param crowdControlReduction the crowdControlReduction to set
     */
    public void setCrowdControlReduction(int crowdControlReduction)
    {
        this.crowdControlReduction = crowdControlReduction;
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
        temp = Double.doubleToLongBits(HP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MP5);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(attackSpeed);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + cooldownReduction;
        result = prime * result + cost;
        temp = Double.doubleToLongBits(criticalChance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + crowdControlReduction;
        result = prime * result + flatPenetration;
        result = prime * result + health;
        result = prime * result + id;
        temp = Double.doubleToLongBits(lifesteal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + magicalProtection;
        result = prime * result + mana;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (passive ? 1231 : 1237);
        temp = Double.doubleToLongBits(percentPenetration);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + physicalProtection;
        result = prime * result + power;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        if (Double.doubleToLongBits(HP5) != Double.doubleToLongBits(other.HP5)) return false;
        if (Double.doubleToLongBits(MP5) != Double.doubleToLongBits(other.MP5)) return false;
        if (Double.doubleToLongBits(attackSpeed) != Double.doubleToLongBits(other.attackSpeed)) return false;
        if (cooldownReduction != other.cooldownReduction) return false;
        if (cost != other.cost) return false;
        if (Double.doubleToLongBits(criticalChance) != Double.doubleToLongBits(other.criticalChance)) return false;
        if (crowdControlReduction != other.crowdControlReduction) return false;
        if (flatPenetration != other.flatPenetration) return false;
        if (health != other.health) return false;
        if (id != other.id) return false;
        if (Double.doubleToLongBits(lifesteal) != Double.doubleToLongBits(other.lifesteal)) return false;
        if (magicalProtection != other.magicalProtection) return false;
        if (mana != other.mana) return false;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (passive != other.passive) return false;
        if (Double.doubleToLongBits(percentPenetration) != Double.doubleToLongBits(other.percentPenetration))
            return false;
        if (physicalProtection != other.physicalProtection) return false;
        if (power != other.power) return false;
        if (type == null)
        {
            if (other.type != null) return false;
        }
        else if (!type.equals(other.type)) return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Item [id=" + id + ", name=" + name + ", cost=" + cost + ", type=" + type + ", health=" + health
                + ", mana=" + mana + ", physicalProtection=" + physicalProtection + ", magicalProtection="
                + magicalProtection + ", power=" + power + ", attackSpeed=" + attackSpeed + ", percentPenetration="
                + percentPenetration + ", flatPenetration=" + flatPenetration + ", criticalChance=" + criticalChance
                + ", cooldownReduction=" + cooldownReduction + ", lifesteal=" + lifesteal + ", passive=" + passive
                + ", HP5=" + HP5 + ", MP5=" + MP5 + ", crowdControlReduction=" + crowdControlReduction + "]";
    }

}
