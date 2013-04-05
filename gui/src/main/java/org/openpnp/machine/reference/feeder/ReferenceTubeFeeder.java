/*
 	Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 	
 	This file is part of OpenPnP.
 	
	OpenPnP is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    OpenPnP is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with OpenPnP.  If not, see <http://www.gnu.org/licenses/>.
 	
 	For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp.machine.reference.feeder;

import org.openpnp.gui.support.Wizard;
import org.openpnp.model.Location;
import org.openpnp.spi.Head;
import org.openpnp.spi.base.AbstractFeeder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of Feeder that always picks from the same location. This
 * can be used with a gravity feed or vibratory tube feeder.
 */
public class ReferenceTubeFeeder extends AbstractFeeder {
	private final static Logger logger = LoggerFactory.getLogger(ReferenceTubeFeeder.class);
	
	@Override
	public boolean canFeedForHead(Head head) {
		return true;
	}

	public Location feed(Head head_, Location pickLocation)
			throws Exception {
		return pickLocation;
	}

	@Override
	public Wizard getConfigurationWizard() {
		return null;
	}
}