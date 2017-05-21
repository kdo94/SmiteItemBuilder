/**
 * 
 */
package edu.orangecoastcollege.capstone.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.orangecoastcollege.capstone.model.God;

/**
 * This tests the god model class and all of its methods
 * @author ptang10
 *
 */
public class TestGodModel {

	private static God god;
	/**
	 * Create an instance of the class before testing
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		god = new God(272, "name", "class", "type", 3, 4, 5, 6, 7, 8, 9, 
			10, 11, 12, 13, 14, 15, "pantheon", "lore");
	}

	/**
	 * We will rely on garbage colelction, end of all testing
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		god = null; // not really needed
	}

	/**
	 * Set up before each individual test
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//relying on garbage collection
		god = new God(272, "name", "class", "type", 3, 4, 5, 6, 7, 8, 9, 
				10, 11, 12, 13, 14, 15, "pantheon", "lore");
	}

	/**
	 * Tear down after each individual test
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		god = null; // not really needed due to garbage collection
	}

	/**
	 * Test get method id
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getId()}.
	 */
	@Test
	public final void testGetId() {
		assertEquals(272, god.getId());
	}

	/**
	 * Test set id method
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setId(int)}.
	 */
	@Test
	public final void testSetId() {
		god.setId(45);
		assertEquals(45, god.getId());
	}

	/**
	 * Test get name god
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getName()}.
	 */
	@Test
	public final void testGetName() {
		assertEquals("name", god.getName());
	}

	/**
	 * Test set name god
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setName(java.lang.String)}.
	 */
	@Test
	public final void testSetName() {
		god.setName("testingsohard");
		assertEquals("testingsohard", god.getName());
	}

	/**
	 * Test get god class
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getGodClass()}.
	 */
	@Test
	public final void testGetGodClass() {
		assertEquals("class", god.getGodClass());
	}

	/**
	 * Teset set class
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setClass(java.lang.String)}.
	 */
	@Test
	public final void testSetClass() {
		god.setClass("godClass");
		assertEquals("godClass", god.getGodClass());
	}

	/**
	 * Test get type god
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getType()}.
	 */
	@Test
	public final void testGetType() {
		assertEquals("type", god.getType());
	}

	/**
	 * Test set type
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setType(java.lang.String)}.
	 */
	@Test
	public final void testSetType() {
		god.setType("godType");
		assertEquals("godType", god.getType());
	}

	/**
	 * Test get basehealth
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseHealth()}.
	 */
	@Test
	public final void testGetBaseHealth() {
		assertEquals(3, god.getBaseHealth());
	}

	/**
	 * Test set base health
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseHealth(int)}.
	 */
	@Test
	public final void testSetBaseHealth() {
		god.setBaseHealth(1030);
		assertEquals(1030, god.getBaseHealth());
		
	}

	/**
	 * Test get health scaling
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getHealthScaling()}.
	 */
	@Test
	public final void testGetHealthScaling() {
		assertEquals(4, god.getHealthScaling());
	}

	/**
	 * Test health scaling set
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setHealthScaling(int)}.
	 */
	@Test
	public final void testSetHealthScaling() {
		god.setHealthScaling(56);
		assertEquals(56, god.getHealthScaling());
	}

	/**
	 * Test get base protection
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBasePProtection()}.
	 */
	@Test
	public final void testGetBasePProtection() {
		assertEquals(5, god.getBasePProtection());
	}

	/**
	 * Test set base protection
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBasePProtection(int)}.
	 */
	@Test
	public final void testSetBasePProtection() {
		god.setBasePProtection(90);
		assertEquals(90, god.getBasePProtection());
	}

	/**
	 * Test get base mprotection
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseMProtection()}.
	 */
	@Test
	public final void testGetBaseMProtection() {
		assertEquals(6, god.getBaseMProtection());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseMProtection(int)}.
	 */
	@Test
	public final void testSetBaseMProtection() {
		god.setBaseMProtection(52);
		assertEquals(52, god.getBaseMProtection());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseMana()}.
	 */
	@Test
	public final void testGetBaseMana() {
		assertEquals(7, god.getBaseMana());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseMana(int)}.
	 */
	@Test
	public final void testSetBaseMana() {
		god.setBaseMana(90);
		assertEquals(90, god.getBaseMana());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseAttackSpeed()}.
	 */
	@Test
	public final void testGetBaseAttackSpeed() {
		assertEquals(8, god.getBaseAttackSpeed(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseAttackSpeed(double)}.
	 */
	@Test
	public final void testSetBaseAttackSpeed() {
		god.setBaseAttackSpeed(13);
		assertEquals(13, god.getBaseAttackSpeed(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseHP5()}.
	 */
	@Test
	public final void testGetBaseHP5() {
		assertEquals(9, god.getBaseHP5());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseHP5(int)}.
	 */
	@Test
	public final void testSetBaseHP5() {
		god.setBaseHP5(3);
		assertEquals(3,  god.getBaseHP5());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseMP5()}.
	 */
	@Test
	public final void testGetBaseMP5() {
		assertEquals(10, god.getBaseMP5());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseMP5(int)}.
	 */
	@Test
	public final void testSetBaseMP5() {
		god.setBaseMP5(5);
		assertEquals(5, god.getBaseMP5());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getPhysicalProtectScaling()}.
	 */
	@Test
	public final void testGetPhysicalProtectScaling() {
		assertEquals(11, god.getPhysicalProtectScaling(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setPhysicalProtectScaling(double)}.
	 */
	@Test
	public final void testSetPhysicalProtectScaling() {
		god.setPhysicalProtectScaling(45);
		assertEquals(45, god.getPhysicalProtectScaling(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getMagicalProtectScaling()}.
	 */
	@Test
	public final void testGetMagicalProtectScaling() {
		assertEquals(12, god.getMagicalProtectScaling(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setMagicalProtectScaling(double)}.
	 */
	@Test
	public final void testSetMagicalProtectScaling() {
		god.setMagicalProtectScaling(432);
		assertEquals(432, god.getMagicalProtectScaling(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseMovementSpeed()}.
	 */
	@Test
	public final void testGetBaseMovementSpeed() {
		assertEquals(13, god.getBaseMovementSpeed());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseMovementSpeed(int)}.
	 */
	@Test
	public final void testSetBaseMovementSpeed() {
		god.setBaseMovementSpeed(34);
		assertEquals(34, god.getBaseMovementSpeed());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getBaseDamage()}.
	 */
	@Test
	public final void testGetBaseDamage() {
		assertEquals(14, god.getBaseDamage());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setBaseDamage(int)}.
	 */
	@Test
	public final void testSetBaseDamage() {
		god.setBaseDamage(272);
		assertEquals(272, god.getBaseDamage());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getDamageScaling()}.
	 */
	@Test
	public final void testGetDamageScaling() {
		assertEquals(15, god.getDamageScaling(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setDamageScaling(double)}.
	 */
	@Test
	public final void testSetDamageScaling() {
		god.setDamageScaling(90);
		assertEquals(90, god.getDamageScaling(), .1);
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getPantheon()}.
	 */
	@Test
	public final void testGetPantheon() {
		assertEquals("pantheon", god.getPantheon());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setPantheon(java.lang.String)}.
	 */
	@Test
	public final void testSetPantheon() {
		god.setPantheon("almost done");
		assertEquals("almost done", god.getPantheon());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#getLore()}.
	 */
	@Test
	public final void testGetLore() {
		assertEquals("lore", god.getLore());
	}

	/**
	 * Test method for {@link edu.orangecoastcollege.capstone.model.God#setLore(java.lang.String)}.
	 */
	@Test
	public final void testSetLore() {
		god.setLore("done testing");
		assertEquals("done testing", god.getLore());
	}

}
