package edu.orangecoastcollege.capstone.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import edu.orangecoastcollege.capstone.model.Abilities;
import edu.orangecoastcollege.capstone.model.Build;
import edu.orangecoastcollege.capstone.model.DBModel;
import edu.orangecoastcollege.capstone.model.God;
import edu.orangecoastcollege.capstone.model.Item;
import edu.orangecoastcollege.capstone.model.Relic;
import edu.orangecoastcollege.capstone.model.SteroidDebuff;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

public class Controller
{
	private static Controller theOne;
	
	private static final String DB_NAME = "smite.db";
	
	private static final String GOD_TABLE_NAME = "gods";
	private static final String[] GOD_FIELD_NAMES = {"id", "name", "god_class", "type", "base_health", "health_scaling",
													"base_p_prot", "base_m_prot", "base_mana", "base_as",
													"base_hp5", "base_mp5", "p_prot_scaling", "m_prot_scaling",
													"base_ms", "base_dmg", "dmg_scaling", "pantheon", "lore"};
	private static final String[] GOD_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "TEXT", "TEXT", "INTEGER", "INTEGER",
													"INTEGER", "INTEGER", "INTEGER", "REAL", "INTEGER", "INTEGER", 
													"REAL", "REAL", "INTEGER", "INTEGER", "REAL", "TEXT", "TEXT"};
	private static final String GOD_FILE_NAME = "gods.csv";
	
	private static final String ITEMS_TABLE_NAME = "items";
	private static final String[] ITEMS_FIELD_NAMES = {"id", "name", "cost", "health", "mana", 
														"p_prot", "m_prot", "p_power", "m_power", "attack_speed", 
														"percent_pen", "flat_pen", "crit_chance", "cooldown", 
														"p_lifesteal", "m_lifesteal", "passive",
														"hp5", "mp5", "crowd_control"};
	private static final String[] ITEMS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "INTEGER",
														"INTEGER", "INTEGER", "INTEGER", "INTEGER", "INTEGER",
														"INTEGER", "REAL", "REAL", "INTEGER", "REAL", "INTEGER", 
														"REAL", "REAL", "TEXT", "INTEGER", "INTEGER", "INTEGER"};
	private static final String ITEMS_DATA_FILE = "items.csv";
	
	private static final String ABILITIES_TABLE_NAME = "abilities";
	private static final String[] ABILITIES_FIELD_NAMES = {"id", "god", "name1", "damage1", "scaling1",
															"name2", "damage2", "scaling2", 
															"name3", "damage3", "scaling3",
															"ult_name", "ult_damage", "ult_scaling"};
	private static final String[] ABILITIES_FIELD_TYPES = {"INTEGER PRIMARY KEY", "INTEGER", "TEXT", "INTEGER", "DOUBLE", 
															"TEXT", "INTEGER", "DOUBLE",
															"TEXT", "INTEGER", "DOUBLE",
															"TEXT", "INTEGER", "DOUBLE"};
	private static final String ABILITIES_DATA_FILE = "abilities.csv";
	
	private static final String STEROIDS_DEBUFFS_TABLE_NAME = "steroids_debuffs";
	private static final String[] STEROIDS_DEBUFFS_FIELD_NAMES = {"id", "duration", "p_power", "m_power",
																	"movement_speed", "protections", 
																	"hp5", "mp5", "penetration"};
	private static final String[] STEROIDS_DEBUFFS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "INTEGER", "INTEGER", "INTEGER",
																	"REAL", "INTEGER", "INTEGER", "INTEGER", "INTEGER"};
	private static final String STEROIDS_DATA_FILE = "steroidsdebuffs.csv";
	
	private static final String RELICS_TABLE_NAME = "relics";
	private static final String[] RELICS_FIELD_NAMES = {"id", "name", "ability", "upgraded"};
	private static final String[] RELICS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "TEXT", "INTEGER"};
	private static final String RELICS_DATA_FILE = "relics.csv";

	private static final String BUILDS_TABLE_NAME = "builds";
	private static final String[] BUILDS_FIELD_NAMES = {"id", "name", "god", "item1", "item2", "item3",
														"item4", "item5", "item6", "relic1", "relic2"};
	private static final String[] BUILDS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "INTEGER", "INTEGER","INTEGER",
														"INTEGER", "INTEGER", "INTEGER", "INTEGER",
														"INTEGER", "INTEGER"};
	
	private DBModel mGodsDB;
	private DBModel mItemsDB;
	private DBModel mAbilitiesDB;
	private DBModel mRelicsDB;
	private DBModel mSteroidsDebuffsDB;
	private DBModel mBuildsDB;
	
	private ObservableList<God> mAllGodsList;
	private ObservableList<Item> mAllItemsList;
	private ObservableList<Relic> mAllRelicsList;
	private ObservableList<SteroidDebuff> mAllSteroidsDebuffsList;
	private ObservableList<Build> mAllBuildsList;
	
	private Controller()
	{
	}
	
	public static Controller getInstance()
	{
		if(theOne == null)
		{
			theOne = new Controller();
			theOne.mAllGodsList = FXCollections.observableArrayList();
			theOne.mAllItemsList = FXCollections.observableArrayList();
			theOne.mAllRelicsList = FXCollections.observableArrayList();
			theOne.mAllSteroidsDebuffsList = FXCollections.observableArrayList();
			theOne.mAllBuildsList = FXCollections.observableArrayList();
			
			try
			{
				theOne.mGodsDB = new DBModel(DB_NAME, GOD_TABLE_NAME, GOD_FIELD_NAMES, GOD_FIELD_TYPES);
				theOne.initializeGodsFromFile();
				ArrayList<ArrayList<String>> rs = theOne.mGodsDB.getAllRecords();
				for(ArrayList<String> value : rs)
				{
					int id = Integer.parseInt(value.get(0));
					String name = value.get(1);
					String godClass = value.get(2);
					String type = value.get(3);
					int baseHealth = Integer.parseInt(value.get(4));
					int healthScaling = Integer.parseInt(value.get(5));
					int basePProt = Integer.parseInt(value.get(6));
					int baseMProt = Integer.parseInt(value.get(7));
					int baseMana = Integer.parseInt(value.get(8));
					double baseAttackSpeed = Double.parseDouble(value.get(9));
					int baseHP5 = Integer.parseInt(value.get(10));
					int baseMP5 = Integer.parseInt(value.get(11));
					double PProtScaling = Double.parseDouble(value.get(12));
					double MProtScaling = Double.parseDouble(value.get(13));
					int baseMovementSpeed = Integer.parseInt(value.get(14));
					int baseDamage = Integer.parseInt(value.get(15));
					double damageScaling = Double.parseDouble(value.get(16));
					String pantheon = value.get(17);
					String lore = value.get(18);
					God newGod = new God(id, name, godClass, type, baseHealth, healthScaling, basePProt, baseMProt, baseMana,
										baseAttackSpeed, baseHP5, baseMP5, PProtScaling, MProtScaling, baseMovementSpeed,
										baseDamage, damageScaling, pantheon, lore);
					theOne.mAllGodsList.add(newGod);
				}
				
				theOne.mItemsDB = new DBModel(DB_NAME, ITEMS_TABLE_NAME, ITEMS_FIELD_NAMES, ITEMS_FIELD_TYPES);
				theOne.initializeItemsFromFile();
				rs = theOne.mItemsDB.getAllRecords();
				for(ArrayList<String> value : rs)
				{
					int id = Integer.parseInt(value.get(0));
	                String name = value.get(1);
	                int cost = Integer.parseInt(value.get(2));
	                int health = Integer.parseInt(value.get(3));
	                int mana = Integer.parseInt(value.get(4));
	                int physicalProtection = Integer.parseInt(value.get(5));
	                int magicalProtection = Integer.parseInt(value.get(6));
	                int physicalPower = Integer.parseInt(value.get(7));
	                int magicalPower = Integer.parseInt(value.get(8));
	                double attackSpeed = Double.parseDouble(value.get(9));
	                double percentPenetration = Double.parseDouble(value.get(10));
	                int flatPenetration = Integer.parseInt(value.get(11));
	                double criticalChance = Double.parseDouble(value.get(12));
	                int cooldownReduction = Integer.parseInt(value.get(13));
	                double physicalLifesteal = Double.parseDouble(value.get(14));
	                double magicalLifesteal = Double.parseDouble(value.get(15));
	                String passive = value.get(16);
	                int HP5 = Integer.parseInt(value.get(17));
	                int MP5 = Integer.parseInt(value.get(18));
	                int crowdControlReduction = Integer.parseInt(value.get(19));
	                Item newItem = new Item(id, name, cost, health, mana, physicalProtection, magicalProtection,
	                						physicalPower, magicalPower, attackSpeed, percentPenetration,
	                						flatPenetration, criticalChance, cooldownReduction, physicalLifesteal, 
	                						magicalLifesteal, passive, HP5, MP5, crowdControlReduction);
	                theOne.mAllItemsList.add(newItem);
				}
				
				theOne.mRelicsDB = new DBModel(DB_NAME, RELICS_TABLE_NAME, RELICS_FIELD_NAMES, RELICS_FIELD_TYPES);
				theOne.initializeRelicsFromFile();
				rs = theOne.mRelicsDB.getAllRecords();
				for(ArrayList<String> value : rs)
				{
					int id = Integer.parseInt(value.get(0));
					String name = value.get(1);
	                String ability = value.get(2);
	                boolean upgraded = "1".equals(value.get(3));
	                Relic newRelic = new Relic(id, name, ability, upgraded);
	                theOne.mAllRelicsList.add(newRelic);
				}
				
				theOne.mSteroidsDebuffsDB = new DBModel(DB_NAME, STEROIDS_DEBUFFS_TABLE_NAME, STEROIDS_DEBUFFS_FIELD_NAMES, STEROIDS_DEBUFFS_FIELD_TYPES);
				theOne.initializeSteroidsDebuffsFromFile();
				rs = theOne.mSteroidsDebuffsDB.getAllRecords();
				for(ArrayList<String> value : rs)
				{
					int id = Integer.parseInt(value.get(0));
                    int duration = Integer.parseInt(value.get(1));
                    int physicalPower = Integer.parseInt(value.get(2));
                    int magicalPower = Integer.parseInt(value.get(3));
                    double movementSpeed = Double.parseDouble(value.get(4));
                    int protections = Integer.parseInt(value.get(5));
                    int HP5 = Integer.parseInt(value.get(6));
                    int MP5 = Integer.parseInt(value.get(7));
                    int penetration = Integer.parseInt(value.get(8));
	                SteroidDebuff newSteroid = new SteroidDebuff(id, duration, physicalPower, magicalPower,
	                											movementSpeed, protections, HP5, MP5, penetration);
	                theOne.mAllSteroidsDebuffsList.add(newSteroid);
				}
				
				theOne.mAbilitiesDB = new DBModel(DB_NAME, ABILITIES_TABLE_NAME, ABILITIES_FIELD_NAMES, ABILITIES_FIELD_TYPES);
				theOne.initializeAbilitiesFromFile();
				
				theOne.mBuildsDB = new DBModel(DB_NAME, BUILDS_TABLE_NAME, BUILDS_FIELD_NAMES, BUILDS_FIELD_TYPES);
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return theOne;
	}
	
	public int initializeGodsFromFile()
	{
		int recordsCreated = 0;
		try
		{
			if(theOne.mGodsDB.getRecordCount() > 0)
				return 0;
			Scanner fileScanner = new Scanner(new File(GOD_FILE_NAME));
			fileScanner.nextLine();
			while(fileScanner.hasNextLine())
			{
				String[] data = fileScanner.nextLine().split(",");
				String[] values = new String[GOD_FIELD_NAMES.length - 1];
				values[0] = data[0];
				values[1] = data[2];
				values[2] = data[3];
				values[3] = data[4];
				values[4] = data[5];
				values[5] = data[17];
				values[6] = data[19];
				values[7] = data[6];
				values[8] = data[12];
				values[9] = data[21];
				values[10] = data[23];
				values[11] = data[18];
				values[12] = data[20];
				values[13] = data[8];
				values[14] = data[14];
				values[15] = data[15];
				values[16] = data[1];
				values[17] = data[25];
				theOne.mGodsDB.createRecord(Arrays.copyOfRange(GOD_FIELD_NAMES, 1, GOD_FIELD_NAMES.length), values);
				recordsCreated++;
			}
			fileScanner.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsCreated;
	}
	
	public int initializeItemsFromFile()
	{
		int recordsCreated = 0;
		try
		{
			if(theOne.mItemsDB.getRecordCount() > 0)
				return 0;
			Scanner fileScanner = new Scanner(new File(ITEMS_DATA_FILE));
			fileScanner.nextLine();
			while(fileScanner.hasNextLine())
			{
				String[] data = fileScanner.nextLine().split(",");
				String[] values = new String[ITEMS_FIELD_NAMES.length - 1];
				values[0] = data[2];
				values[1] = data[21];
				values[2] = data[14];
				values[3] = data[19];
				values[4] = data[12];
				values[5] = data[13];
				values[6] = data[6];
				values[7] = data[9];
				values[8] = data[5];
				values[9] = data[4];
				values[10] = data[11];
				values[11] = data[8];
				values[12] = data[18];
				values[13] = data[7];
				values[14] = data[10];
				values[15] = data[22];
				values[16] = data[15];
				values[17] = data[20];
				values[18] = data[16];
				theOne.mItemsDB.createRecord(Arrays.copyOfRange(ITEMS_FIELD_NAMES, 1, ITEMS_FIELD_NAMES.length), values);
				recordsCreated++;
			}
			fileScanner.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsCreated;
	}
	
	public int initializeRelicsFromFile()
	{
		int recordsCreated = 0;
		try
		{
			if(theOne.mRelicsDB.getRecordCount() > 0)
				return 0;
			Scanner fileScanner = new Scanner(new File(RELICS_DATA_FILE));
			fileScanner.nextLine();
			while(fileScanner.hasNextLine())
			{
				String[] data = fileScanner.nextLine().split(",");
				String[] values = new String[RELICS_FIELD_NAMES.length - 1];
				values[0] = data[0];
				values[1] = data[1];
				values[2] = data[2];
				theOne.mRelicsDB.createRecord(Arrays.copyOfRange(RELICS_FIELD_NAMES, 1, RELICS_FIELD_NAMES.length), values);
				recordsCreated++;
			}
			fileScanner.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsCreated;
	}
	
	public int initializeAbilitiesFromFile()
	{
		int recordsCreated = 0;
		try
		{
			if(theOne.mAbilitiesDB.getRecordCount() > 0)
				return 0;
			Scanner fileScanner = new Scanner(new File(ABILITIES_DATA_FILE));
			fileScanner.nextLine();
			while(fileScanner.hasNextLine())
			{
				String[] data = fileScanner.nextLine().split(",");
				String[] values = new String[ABILITIES_FIELD_NAMES.length - 1];
				for(God god : theOne.mAllGodsList)
					if(data[0].equals(god.getName()))
						values[0] = String.valueOf(god.getId());
				values[1] = data[14];
				values[2] = data[15];
				values[3] = data[17];
				values[4] = data[23];
				values[5] = data[25];
				values[6] = data[26];
				values[7] = data[32];
				values[8] = data[33];
				values[9] = data[35];
				values[10] = data[41];
				values[11] = data[42];
				values[12] = data[44];
				theOne.mAbilitiesDB.createRecord(Arrays.copyOfRange(ABILITIES_FIELD_NAMES, 1, ABILITIES_FIELD_NAMES.length), values);
				recordsCreated++;
			}
			fileScanner.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsCreated;
	}
	
	public int initializeSteroidsDebuffsFromFile()
	{
		int recordsCreated = 0;
		try
		{
			if(theOne.mSteroidsDebuffsDB.getRecordCount() > 0)
				return 0;
			Scanner fileScanner = new Scanner(new File(STEROIDS_DATA_FILE));
			fileScanner.nextLine();
			while(fileScanner.hasNextLine())
			{
				String[] data = fileScanner.nextLine().split(",");
				String[] values = new String[STEROIDS_DEBUFFS_FIELD_NAMES.length - 1];
				values[0] = data[3];
				values[1] = data[5];
				values[2] = data[8];
				values[3] = data[16];
				values[4] = data[13];
				values[5] = data[14];
				values[6] = data[19];
				values[7] = data[10];
				theOne.mSteroidsDebuffsDB.createRecord(Arrays.copyOfRange(STEROIDS_DEBUFFS_FIELD_NAMES, 1, STEROIDS_DEBUFFS_FIELD_NAMES.length), values);
				recordsCreated++;
			}
			fileScanner.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsCreated;
	}
	
	public ObservableList<God> getAllGods()
	{
		return theOne.mAllGodsList;
	}
	
	public ObservableList<Item> getAllItems()
	{
		return theOne.mAllItemsList;
	}
	
	public ObservableList<Relic> getAllRelics()
	{
		return theOne.mAllRelicsList;
	}
	
	public ObservableList<Build> getAllBuilds()
	{
		return theOne.mAllBuildsList;
	}
}
