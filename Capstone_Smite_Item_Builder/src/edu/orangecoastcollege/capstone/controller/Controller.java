package edu.orangecoastcollege.capstone.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

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
	private static final String[] GOD_FIELD_NAMES = {"id", "name", "class", "type", "base_health",
													"base_p_prot", "base_m_prot", "base_mana", "base_as",
													"base_hp5", "base_mp5", "p_prot_scaling", "m_prot_scaling",
													"base_ms", "base_dmg", "dmg_scaling", "pantheon"};
	private static final String[] GOD_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "TEXT", "TEXT", "INTEGER",
													"INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "REAL", "REAL",
													"REAL", "INTEGER", "INTEGER", "REAL", "TEXT"};
	private static final String GOD_FILE_NAME = "gods.csv";
	
	private static final String ITEMS_TABLE_NAME = "items";
	private static final String[] ITEMS_FIELD_NAMES = {"id", "name", "cost", "type", "health", "mana", 
														"p_prot", "m_prot", "power", "attack_speed", "percent_pen", 
														"flat_pen", "crit_chance", "cooldown", "lifesteal", "passive",
														"hp5", "mp5", "crowd_control"};
	private static final String[] ITEMS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "INTEGER", "TEXT",
														"INTEGER", "INTEGER", "INTEGER", "INTEGER", "INTEGER",
														"REAL", "REAL", "INTEGER", "REAL", "INTEGER", "REAL",
														"TEXT", "REAL", "REAL", "INTEGER"};
	private static final String ITEMS_DATA_FILE = "items.csv";
	
	private static final String ABILITIES_TABLE_NAME = "abilities";
	private static final String[] ABILITIES_FIELD_NAMES = {"id", "god", "name1", "damage1", "scaling1", "passive1",
															"name2", "damage2", "scaling2", "passive2", 
															"name3", "damage3", "scaling3", "passive3", 
															"ult_name", "ult_damage", "ult_scaling", "ult_passive"};
	private static final String[] ABILITIES_FIELD_TYPES = {"INTEGER PRIMARY KEY", "INTEGER", "TEXT", "INTEGER", "DOUBLE", "INTEGER",
															"TEXT", "INTEGER", "DOUBLE", "INTEGER",
															"TEXT", "INTEGER", "DOUBLE", "INTEGER",
															"TEXT", "INTEGER", "DOUBLE", "INTEGER"};
	
	private static final String STEROIDS_DEBUFFS_TABLE_NAME = "steroids_debuffs";
	private static final String[] STEROIDS_DEBUFFS_FIELD_NAMES = {"id", "duration", "power", "movement_speed",
																"lifesteal", "protections", "hp5", "mp5", "penetration"};
	private static final String[] STEROIDS_DEBUFFS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "REAL", "INTEGER",
																	"REAL", "INTEGER", "INTEGER", "REAL", "REAL", "INTEGER"};
	private static final String STEROIDS_DATA_FILE = "steroidsdebuffs.csv";
	
	private static final String RELICS_TABLE_NAME = "relics";
	private static final String[] RELICS_FIELD_NAMES = {"id", "name", "ability", "upgraded"};
	private static final String[] RELICS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "TEXT", "INTEGER"};

	private static final String BUILDS_TABLE_NAME = "builds";
	private static final String[] BUILDS_FIELD_NAMES = {"id", "name", "god", "item1", "item2", "item3", "item4",
														"item4", "item5", "item6", "relic1", "relic2"};
	private static final String[] BUILDS_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "INTEGER", "INTEGER","INTEGER",
														"INTEGER", "INTEGER", "INTEGER", "INTEGER", "INTEGER",
														"INTEGER", "INTEGER"};
	
	private DBModel mGodsDB;
	private DBModel mItemdsDB;
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
				ResultSet rs = theOne.mGodsDB.getAllRecords();
				int id = rs.getInt(GOD_FIELD_NAMES[0]);
				String name = rs.getString(GOD_FIELD_NAMES[1]);
				String godClass = rs.getString(GOD_FIELD_NAMES[2]);
				String type = rs.getString(GOD_FIELD_NAMES[3]);
				int baseHealth = rs.getInt(GOD_FIELD_NAMES[4]);
				int basePProt = rs.getInt(GOD_FIELD_NAMES[5]);
				int baseMProt = rs.getInt(GOD_FIELD_NAMES[6]);
				int baseMana = rs.getInt(GOD_FIELD_NAMES[7]);
				int baseAttackSpeed = rs.getInt(GOD_FIELD_NAMES[8]);
				double baseHP5 = rs.getDouble(GOD_FIELD_NAMES[9]);
				double baseMP5 = rs.getDouble(GOD_FIELD_NAMES[10]);
				double PProtScaling = rs.getDouble(GOD_FIELD_NAMES[11]);
				double MProtScaling = rs.getDouble(GOD_FIELD_NAMES[12]);
				int baseMovementSpeed = rs.getInt(GOD_FIELD_NAMES[13]);
				int baseDamage = rs.getInt(GOD_FIELD_NAMES[14]);
				double damageScaling = rs.getDouble(GOD_FIELD_NAMES[15]);
				String pantheon = rs.getString(GOD_FIELD_NAMES[16]);
				God newGod = new God(id, name, godClass, type, baseHealth ,basePProt, baseMProt, baseMana,
									baseAttackSpeed, baseHP5, baseMP5, PProtScaling, MProtScaling, baseMovementSpeed,
									baseDamage, damageScaling, pantheon);
				theOne.mAllGodsList.add(newGod);
				
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
				values[1] = data[53];
				values[2] = data[1];
				values[3] = data[2];
				values[4] = data[4];
				values[5] = data[6];
				values[6] = data[12];
				values[7] = data[14];
				values[8] = data[51];
				values[9] = data[51];
				values[10] = data[5];
				values[11] = data[7];
				values[12] = data[54];
				values[13] = data[10];
				values[14] = data[11];
				values[15] = data[55];
				theOne.mGodsDB.createRecord(Arrays.copyOfRange(GOD_FIELD_NAMES, 1, GOD_FIELD_NAMES.length), values);
				recordsCreated++;
			}
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
}
