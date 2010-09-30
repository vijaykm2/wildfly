/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.domain.controller;

import org.jboss.as.model.DomainModel;

/**
 * Contract for a domain controller client.  Each client is registered with the domain controller and provides the
 * domain controller an interface to communicate with the client.
 *
 *  @author John Bailey
 */
public interface DomainControllerClient {
    /**
     * Get the identifier for the client.
     *
     * @return The identifier
     */
    String getId();

    /**
     * Update the client with a new version of the domain.
     *
     * @param domain The domain configuration
     */
    void updateDomain(DomainModel domain);

    /**
     * Check the server manager client to verify it is still active.
     *
     * @return true if the client is active, false if not.
     */
    boolean isActive();

    // TODO:  Add calls for updates/events
}
