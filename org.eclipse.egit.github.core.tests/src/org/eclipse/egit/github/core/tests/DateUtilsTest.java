/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.eclipse.egit.github.core.util.DateUtils;
import org.junit.Test;

/**
 * Unit tests of {@link DateUtils}
 */
public class DateUtilsTest {

	/**
	 * Test cloning date
	 */
	@Test
	public void cloneDate() {
		assertNull(DateUtils.clone(null));
		assertEquals(new Date(1000), DateUtils.clone(new Date(1000)));
		Date date = new Date(25000);
		assertNotSame(date, DateUtils.clone(date));
	}

}
