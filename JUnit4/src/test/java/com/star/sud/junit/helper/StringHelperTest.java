package com.star.sud.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions2_AinfirstPositions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateFirst2Position3_AisNotInAnyPosition() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void testTruncateFirst2Position4_Ainlast2Poistions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Same() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Same2() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NotSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

}
