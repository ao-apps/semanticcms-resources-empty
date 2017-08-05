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

import com.semanticcms.core.resources.Resource;
import com.semanticcms.core.resources.ResourceConnection;
import com.semanticcms.core.resources.ResourceFile;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * An empty {@link ResourceConnection}
 */
public class EmptyResourceConnection extends ResourceConnection {

	public EmptyResourceConnection(Resource resource) {
		super(resource);
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public long getLength() throws FileNotFoundException {
		throw new FileNotFoundException(resource.toString());
	}

	@Override
	public long getLastModified() throws FileNotFoundException {
		throw new FileNotFoundException(resource.toString());
	}

	@Override
	public InputStream getInputStream() throws FileNotFoundException {
		throw new FileNotFoundException(resource.toString());
	}

	@Override
	public ResourceFile getResourceFile() throws FileNotFoundException {
		throw new FileNotFoundException(resource.toString());
	}

	@Override
	public void close() {
		// Nothing to close
	}
}
	