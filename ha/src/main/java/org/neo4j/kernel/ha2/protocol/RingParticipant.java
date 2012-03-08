/**
 * Copyright (c) 2002-2012 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
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
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.neo4j.kernel.ha2.protocol;

import java.io.Serializable;

/**
 * TODO
 */
public class RingParticipant
    implements Serializable, Comparable<RingParticipant>
{
    private String serverId;

    public RingParticipant(String serverId)
    {
        this.serverId = serverId;
    }

    public String getServerId()
    {
        return serverId;
    }

    @Override
    public int compareTo( RingParticipant o )
    {
        return serverId.compareTo( o.serverId );
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RingParticipant that = (RingParticipant) o;

        if (serverId != null ? !serverId.equals(that.serverId) : that.serverId != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return serverId != null ? serverId.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return serverId;
    }
}
