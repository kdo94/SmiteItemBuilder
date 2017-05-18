
package edu.orangecoastcollege.capstone.model;


/**
 * Relic class is an entity class that represents
 * a relic in the game SMITE.  Relic/active item
 * is a special item a God can equip with an
 * active ability.
 *
 * @author ptang10
 *
 */
public class Relic
{
    private int mId;
    private String mName;
    private String mAbility;
    private boolean mUpgraded;

    /**
     * No-arg constructor for Relic
     */
    public Relic(){}

    /**
     * Arg constructor for Relic
     * @param id        - id of relic
     * @param name      - name of relic
     * @param art       - picture
     * @param ability   - ability description
     * @param upgraded  - upgraded status
     */
    public Relic(int id,
                 String name,
                 String ability,
                 boolean upgraded)
    {
        this.mId = id;
        this.mName = name;
        this.mAbility = ability;
        this.mUpgraded = upgraded;
    }
    /**
     * Get id of relic
     * @return the id
     */
    public int getId()
    {
        return mId;
    }

    /**
     * Set id of relic
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.mId = id;
    }

    /**
     * Get name of relic
     * @return the name
     */
    public String getName()
    {
        return mName;
    }

    /**
     * Set name of relic
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.mName = name;
    }

    /**
     * Get ability description
     * @return the ability
     */
    public String getAbility()
    {
        return mAbility;
    }

    /**
     * Set ability description
     * @param ability the ability to set
     */
    public void setAbility(String ability)
    {
        this.mAbility = ability;
    }

    /**
     * Get upgrade status
     * @return the upgraded
     */
    public boolean isUpgraded()
    {
        return mUpgraded;
    }

    /**
     * Set upgrade status
     * @param upgraded the upgraded to set
     */
    public void setUpgraded(boolean upgraded)
    {
        this.mUpgraded = upgraded;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mAbility == null) ? 0 : mAbility.hashCode());
        result = prime * result + mId;
        result = prime * result + ((mName == null) ? 0 : mName.hashCode());
        result = prime * result + (mUpgraded ? 1231 : 1237);
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
        Relic other = (Relic) obj;
        if (mAbility == null)
        {
            if (other.mAbility != null) return false;
        }
        else if (!mAbility.equals(other.mAbility)) return false;
        if (mId != other.mId) return false;
        if (mName == null)
        {
            if (other.mName != null) return false;
        }
        else if (!mName.equals(other.mName)) return false;
        if (mUpgraded != other.mUpgraded) return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Relic [id=" + mId + ", name=" + mName + ", ability=" + mAbility + ", upgraded=" + mUpgraded + "]";
    }







}
