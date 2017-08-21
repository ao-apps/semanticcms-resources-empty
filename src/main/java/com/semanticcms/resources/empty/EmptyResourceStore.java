/*
 * semanticcms-resources-empty - Empty sets of SemanticCMS resources.
 * Copyright (C) 2017  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-resources-empty.
 *
 * semanticcms-resources-empty is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-resources-empty is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-resources-empty.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.resources.empty;

import com.aoindustries.net.Path;
import com.semanticcms.core.resources.Resource;
import com.semanticcms.core.resources.ResourceStore;

/**
 * An empty {@link ResourceStore}
 */
public class EmptyResourceStore implements ResourceStore {

	private static final EmptyResourceStore instance = new EmptyResourceStore();

	public static EmptyResourceStore getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "empty:";
	}

	/**
	 * @implSpec  The resource will never {@link Resource#exists() exist}.
	 */
	@Override
	public EmptyResource getResource(Path path) {
		return new EmptyResource(this, path);
	}
}
