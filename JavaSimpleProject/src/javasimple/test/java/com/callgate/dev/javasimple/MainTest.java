/**
 * 
 */
package com.callgate.dev.javasimple;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author CallGate (전호철)
 *
 */
public class MainTest {

	/**
	 * Test method for {@link com.callgate.dev.javasimple.Main#action1()}.
	 */
	@Test
	public void testAction1() {
		Main obj = new Main();
		assertNotNull("action1() is null", obj.action1());
	}

	/**
	 * Test method for {@link com.callgate.dev.javasimple.Main#action2()}.
	 */
	@Test
	public void testAction2() {
		Main obj = new Main();
		assertNull("action2() is not null", obj.action2());
	}

}
