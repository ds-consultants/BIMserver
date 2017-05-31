package org.bimserver.changes;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.util.List;
import java.util.Map;

import org.bimserver.BimServer;
import org.bimserver.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.emf.IdEObject;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.shared.HashMapVirtualObject;
import org.bimserver.shared.exceptions.UserException;

public class RemoveReferenceChange implements Change {

	private final long oid;
	private final String referenceName;
	private final int index;
	private final long referencedOid;

	public RemoveReferenceChange(long oid, String referenceName, int index) {
		this.oid = oid;
		this.referenceName = referenceName;
		this.index = index;
		this.referencedOid = -1;
	}

	public RemoveReferenceChange(long oid, String referenceName, long referencedOid) {
		this.oid = oid;
		this.referenceName = referenceName;
		this.referencedOid = referencedOid;
		this.index = -1;
	}
	
	private IdEObject getReferencedObject(List<?> list) {
		if (index != -1) {
			return (IdEObject) list.get(index);
		} else if (referencedOid != -1) {
			for (Object ref : list) {
				if (((IdEObject)ref).getOid() == referencedOid) {
					return (IdEObject) ref;
				}
			}
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void execute(BimServer bimServer, Revision previousRevision, Project project, ConcreteRevision concreteRevision, DatabaseSession databaseSession, Map<Long, HashMapVirtualObject> created, Map<Long, HashMapVirtualObject> deleted) throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		throw new UserException("Not implemented");
	}
}