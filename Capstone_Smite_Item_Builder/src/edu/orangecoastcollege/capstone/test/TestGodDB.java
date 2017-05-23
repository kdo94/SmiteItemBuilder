package edu.orangecoastcollege.capstone.test;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.orangecoastcollege.capstone.model.DBModel;

public class TestGodDB
{

	private static final String DB_NAME = "smite.db";
	private static final String GOD_TABLE_NAME = "gods";
	private static final String[] GOD_FIELD_NAMES = {"id", "name", "god_class", "type", "base_health", "health_scaling",
													"base_p_prot", "base_m_prot", "base_mana", "base_as",
													"base_hp5", "base_mp5", "p_prot_scaling", "m_prot_scaling",
													"base_ms", "base_dmg", "dmg_scaling", "pantheon", "lore"};
	private static final String[] GOD_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "TEXT", "TEXT", "INTEGER", "INTEGER",
													"INTEGER", "INTEGER", "INTEGER", "REAL", "INTEGER", "INTEGER", 
													"REAL", "REAL", "INTEGER", "INTEGER", "REAL", "TEXT", "TEXT"};
	private static DBModel db;
	private String[] values;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		db = new DBModel(DB_NAME, GOD_TABLE_NAME, GOD_FIELD_NAMES, GOD_FIELD_TYPES);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		
	}

	@Before
	public void setUp() throws Exception
	{
		
		values = new String[] {"1", "Ymir", "Guardian", "Magical", "400", "50",
			"45", "45", "150", "1",
			"5", "5", "15", "15",
			"350", "100", "12", "Norse", "lore"};
	}

	@After
	public void tearDown() throws Exception
	{
		db.deleteAllRecords();
	}

	@Test
	public void test()
	{
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetRecord()
	{
		try
		{
			db.createRecord(GOD_FIELD_NAMES, values);
			assertEquals("Testing getRecord after one is added.", "Ymir", db.getRecord("1").get(0).get(1));
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			fail("Creation of records should not generate SQLException.");
		}
	}
	
	@Test
	public void testGetAllRecords()
	{
		try
		{
			ArrayList<ArrayList<String>> rs = db.getAllRecords();
		} 
		catch (SQLException e)
		{
			fail("Getting all records on empty database should not generate SQLException");
		}
		
	}

	@Test
	public void testGetRecordCount()
	{
		try
		{
			db.createRecord(GOD_FIELD_NAMES, values);
			assertEquals("Testing getRecord after one is added.", 1, db.getRecordCount());
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			fail("Creation of records should not generate SQLException.");
		}
		try
		{
			db.deleteRecord("1");
			assertEquals("Testing getRecord after one is added.", 0, db.getRecordCount());
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			fail("Deletion of record should not result in SQLException");
		}
		
	}

	@Test
	public void testCreateRecord()
	{
		try
		{
			assertEquals("Testing creation of God with id provided", 1, db.createRecord(GOD_FIELD_NAMES, values));
			assertEquals("Testing count of records", 1, db.getRecordCount());
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			fail("Creation of records should not generate an SQLException");
		}
		
		try
		{
			db.createRecord(GOD_FIELD_NAMES, values);
			fail("Creating record with duplicate id should generate SQLException");
		}
		catch (SQLException e)
		{
			// Expected
			
		}
	}


	@Test
	public void testUpdateRecord()
	{
		String[] newValues = new String[]{"1", "Athena", "Guardian", "Magical", "400", "50",
											"45", "45", "150", "1",
											"5", "5", "15", "15",
											"350", "100", "12", "Norse", "lore"};
		try
		{
			db.createRecord(GOD_FIELD_NAMES, values);
			db.updateRecord("1", GOD_FIELD_NAMES, newValues);
			//System.out.println(db.getRecord("1").getString(2));
			assertEquals("Testing to see if record was updated", "Athena", db.getRecord("1").get(0).get(1));
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			fail("Updating of records should not generate SQLException.");
		}
	}

	@Test
	public void testDeleteAllRecords()
	{
		try
		{
			db.createRecord(Arrays.copyOfRange(GOD_FIELD_NAMES, 1, GOD_FIELD_NAMES.length), 
							Arrays.copyOfRange(values, 1, values.length));
			assertTrue("Before deletion, count should be positive", db.getRecordCount() > 0);
			db.deleteAllRecords();
			assertEquals("Count after deletion should be 0.", 0, db.getRecordCount());
		}
		catch (SQLException e)
		{
			fail("Deleting all records should not generate an SQLException.");
		}
	}

	@Test
	public void testDeleteRecord()
	{
		try
		{
			db.createRecord(GOD_FIELD_NAMES, values);
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			fail("Creation of records should not generate SQLException.");
		}
		try
		{
			db.deleteRecord("1");
			assertEquals("Testing getRecord after one is added.", 0, db.getRecordCount());
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			fail("Deletion of record should not result in SQLException");
		}
	}

}
