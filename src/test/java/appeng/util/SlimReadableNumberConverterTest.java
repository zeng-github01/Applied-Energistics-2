
package appeng.util;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;


/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

/**
 * Test for {@link ISlimReadableNumberConverter}
 *
 * @author thatsIch
 * @version rv2
 * @since rv2
 */
public final class SlimReadableNumberConverterTest
{
	private static final long NUMBER_NEG_999999 = -999999L;
	private static final String RESULT_NEG_999999 = "-0M";

	private static final long NUMBER_NEG_9999 = -9999L;
	private static final String RESULT_NEG_9999 = "-9K";

	private static final long NUMBER_NEG_999 = -999L;
	private static final String RESULT_NEG_999 = "-0K";

	private static final long NUMBER_0 = 0L;
	private static final String RESULT_0 = "0";

	private static final long NUMBER_999 = 999L;
	private static final String RESULT_999 = "999";

	private static final long NUMBER_9999 = 9999L;
	private static final String RESULT_9999 = "9K";

	private static final long NUMBER_10000 = 10000L;
	private static final String RESULT_10000 = "10K";

	private static final long NUMBER_10500 = 10500L;
	private static final String RESULT_10500 = "10K";

	private static final long NUMBER_155555 = 155555L;
	private static final String RESULT_155555 = ".1M";

	private static final long NUMBER_9999999 = 9999999L;
	private static final String RESULT_9999999 = "9M";

	private static final long NUMBER_10000000 = 10000000L;
	private static final String RESULT_10000000 = "10M";

	private static final long NUMBER_155555555 = 155555555L;
	private static final String RESULT_155555555 = ".1G";

	private final ISlimReadableNumberConverter converter = ReadableNumberConverter.INSTANCE;

	@Test
	public void testConvertNeg999999()
	{
		assertThrows(AssertionError.class, () -> this.converter.toSlimReadableForm( NUMBER_NEG_999999 ) );
	}

	@Test
	public void testConvertNeg9999()
	{
		assertThrows(AssertionError.class, () -> this.converter.toSlimReadableForm( NUMBER_NEG_9999 ) );
	}

	@Test
	public void testConvertNeg999()
	{
		assertThrows(AssertionError.class, () -> this.converter.toSlimReadableForm( NUMBER_NEG_999 ) );
	}

	@Test
	public void testConvert0()
	{
		assertThat( RESULT_0, is( this.converter.toSlimReadableForm( NUMBER_0 ) ) );
	}

	@Test
	public void testConvert999()
	{
		assertThat( RESULT_999, is( this.converter.toSlimReadableForm( NUMBER_999 ) ) );
	}

	@Test
	public void testConvert9999()
	{
		assertThat( RESULT_9999, is( this.converter.toSlimReadableForm( NUMBER_9999 ) ) );
	}

	@Test
	public void testConvert10000()
	{
		assertThat( RESULT_10000, is( this.converter.toSlimReadableForm( NUMBER_10000 ) ) );
	}

	@Test
	public void testConvert10500()
	{
		assertThat( RESULT_10500, is( this.converter.toSlimReadableForm( NUMBER_10500 ) ) );
	}

	@Test
	public void testConvert155555()
	{
		assertThat( RESULT_155555, is( this.converter.toSlimReadableForm( NUMBER_155555 ) ) );
	}

	@Test
	public void testConvert9999999()
	{
		assertThat( RESULT_9999999, is( this.converter.toSlimReadableForm( NUMBER_9999999 ) ) );
	}

	@Test
	public void testConvert10000000()
	{
		assertThat( RESULT_10000000, is( this.converter.toSlimReadableForm( NUMBER_10000000 ) ) );
	}

	@Test
	public void testConvert155555555()
	{
		assertThat( RESULT_155555555, is( this.converter.toSlimReadableForm( NUMBER_155555555 ) ) );
	}
}
