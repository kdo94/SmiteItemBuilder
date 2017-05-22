package edu.orangecoastcollege.capstone.model;

/**
 * Build class represents a user's profile of
 * items and relics for a particular god in the game
 * SMITE.  A build contains 6 items and 2 relics as well
 * as the associated God
 *
 * @author ptang10
 *
 */
public class Build
{
    private int mId; //0
    private String mName;// 1
    private God mGod; // 2
    private Item mItem1; // 3
    private Item mItem2; // 4
    private Item mItem3; // 5
    private Item mItem4; // 6
    private Item mItem5; // 7
    private Item mItem6; // 8
    private Relic mRelic1; // 9
    private Relic mRelic2; // 10

    /**
     * No-arg constructor for build
     */
    public Build(){}

    /**
     * Arg constructor for a build profile
     * @param id        - id of build
     * @param god       - assoc god
     * @param item1     - item 1 ...
     * @param item2
     * @param item3
     * @param item4
     * @param item5
     * @param item6     - item 6
     * @param relic1    - relic 1
     * @param relic2    - relic 2
     */
    public Build(int id,
    		String name,
                 God god,
                 Item item1,
                 Item item2,
                 Item item3,
                 Item item4,
                 Item item5,
                 Item item6,
                 Relic relic1,
                 Relic relic2)
    {
        this.mId = id;
        this.mGod = god;
        this.mItem1 = item1;
        this.mItem2 = item2;
        this.mItem3 = item3;
        this.mItem4 = item4;
        this.mItem5 = item5;
        this.mItem6 = item6;
        this.mRelic1 = relic1;
        this.mRelic2 = relic2;
    }

    /**
     * Get id of build
     * @return the id
     */
    public int getId()
    {
        return mId;
    }

    /**
     * Set id of build
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.mId = id;
    }
    /**
     * Get name of build
     * @return
     */
    public String getName()
    {
        return this.mName;
    }
    /**
     * Set name of build
     * @param name to set
     */
    public void setName(String name)
    {
        this.mName = name;
    }
    /**
     * Get god in build
     * @return the god
     */
    public God getGod()
    {
        return mGod;
    }

    /**
     * Set god in buil
     * @param god the god to set
     */
    public void setGod(God god)
    {
        this.mGod = god;
    }

    /**
     * Get item 1
     * @return the item1
     */
    public Item getItem1()
    {
        return mItem1;
    }

    /**
     * Set item 1
     * @param item1 the item1 to set
     */
    public void setItem1(Item item1)
    {
        this.mItem1 = item1;
    }

    /**
     * @return the item2
     */
    public Item getItem2()
    {
        return mItem2;
    }

    /**
     * @param item2 the item2 to set
     */
    public void setItem2(Item item2)
    {
        this.mItem2 = item2;
    }

    /**
     * @return the item3
     */
    public Item getItem3()
    {
        return mItem3;
    }

    /**
     * @param item3 the item3 to set
     */
    public void setItem3(Item item3)
    {
        this.mItem3 = item3;
    }

    /**
     * @return the item4
     */
    public Item getItem4()
    {
        return mItem4;
    }

    /**
     * @param item4 the item4 to set
     */
    public void setItem4(Item item4)
    {
        this.mItem4 = item4;
    }

    /**
     * @return the item5
     */
    public Item getItem5()
    {
        return mItem5;
    }

    /**
     * @param item5 the item5 to set
     */
    public void setItem5(Item item5)
    {
        this.mItem5 = item5;
    }

    /**
     * @return the item6
     */
    public Item getItem6()
    {
        return mItem6;
    }

    /**
     * @param item6 the item6 to set
     */
    public void setItem6(Item item6)
    {
        this.mItem6 = item6;
    }

    /**
     * Get relic 1
     * @return the relic1
     */
    public Relic getRelic1()
    {
        return mRelic1;
    }

    /**
     * Set relic 1
     * @param relic1 the relic1 to set
     */
    public void setRelic1(Relic relic1)
    {
        this.mRelic1 = relic1;
    }

    /**
     * @return the relic2
     */
    public Relic getRelic2()
    {
        return mRelic2;
    }

    /**
     * @param relic2 the relic2 to set
     */
    public void setRelic2(Relic relic2)
    {
        this.mRelic2 = relic2;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mGod == null) ? 0 : mGod.hashCode());
        result = prime * result + mId;
        result = prime * result + ((mItem1 == null) ? 0 : mItem1.hashCode());
        result = prime * result + ((mItem2 == null) ? 0 : mItem2.hashCode());
        result = prime * result + ((mItem3 == null) ? 0 : mItem3.hashCode());
        result = prime * result + ((mItem4 == null) ? 0 : mItem4.hashCode());
        result = prime * result + ((mItem5 == null) ? 0 : mItem5.hashCode());
        result = prime * result + ((mItem6 == null) ? 0 : mItem6.hashCode());
        result = prime * result + ((mName == null) ? 0 : mName.hashCode());
        result = prime * result + ((mRelic1 == null) ? 0 : mRelic1.hashCode());
        result = prime * result + ((mRelic2 == null) ? 0 : mRelic2.hashCode());
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
        Build other = (Build) obj;
        if (mGod == null)
        {
            if (other.mGod != null) return false;
        }
        else if (!mGod.equals(other.mGod)) return false;
        if (mId != other.mId) return false;
        if (mItem1 == null)
        {
            if (other.mItem1 != null) return false;
        }
        else if (!mItem1.equals(other.mItem1)) return false;
        if (mItem2 == null)
        {
            if (other.mItem2 != null) return false;
        }
        else if (!mItem2.equals(other.mItem2)) return false;
        if (mItem3 == null)
        {
            if (other.mItem3 != null) return false;
        }
        else if (!mItem3.equals(other.mItem3)) return false;
        if (mItem4 == null)
        {
            if (other.mItem4 != null) return false;
        }
        else if (!mItem4.equals(other.mItem4)) return false;
        if (mItem5 == null)
        {
            if (other.mItem5 != null) return false;
        }
        else if (!mItem5.equals(other.mItem5)) return false;
        if (mItem6 == null)
        {
            if (other.mItem6 != null) return false;
        }
        else if (!mItem6.equals(other.mItem6)) return false;
        if (mName == null)
        {
            if (other.mName != null) return false;
        }
        else if (!mName.equals(other.mName)) return false;
        if (mRelic1 == null)
        {
            if (other.mRelic1 != null) return false;
        }
        else if (!mRelic1.equals(other.mRelic1)) return false;
        if (mRelic2 == null)
        {
            if (other.mRelic2 != null) return false;
        }
        else if (!mRelic2.equals(other.mRelic2)) return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Build [id=" + mId + ", name=" + mName + ", god=" + mGod + ", item1=" + mItem1 + ", item2=" + mItem2
                + ", item3=" + mItem3 + ", item4=" + mItem4 + ", item5=" + mItem5 + ", item6=" + mItem6 + ", relic1="
                + mRelic1 + ", relic2=" + mRelic2 + "]";
    }




}
