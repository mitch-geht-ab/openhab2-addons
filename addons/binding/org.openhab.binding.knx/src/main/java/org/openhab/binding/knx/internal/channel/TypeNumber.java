/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.knx.internal.channel;

import static org.openhab.binding.knx.KNXBindingConstants.*;

import java.util.Set;

import org.eclipse.smarthome.config.core.Configuration;
import org.eclipse.smarthome.core.types.Type;

import tuwien.auto.calimero.GroupAddress;

public class TypeNumber extends KNXChannelType {

    TypeNumber() {
        super(CHANNEL_NUMBER);
    }

    @Override
    public String getDPT(GroupAddress groupAddress, Configuration configuration) {

        // TODO : decide whether it is opportunistic to check the compatbility between the choosen DPT and
        // the supposedly Number Item linked to this channel. The alternative would be to forego this
        // check and let it up to the ThingManager to do this and log an error

        // Class<?> classType = KNXCoreTypeMapper.toTypeClass((String) configuration.get(DPT));
        // NumberItem someNumber = new NumberItem("");
        // if (!someNumber.getAcceptedDataTypes().contains(classType)) {
        // logger.warn("The DPT '{}' yields a '{}', which is not compatible with Number Items", (String)
        // configuration.get(DPT),classType.getSimpleName());
        // return null;
        // }

        return (String) configuration.get(DPT);
    }

    @Override
    protected Set<String> getReadAddressKeys() {
        return asSet(GROUPADDRESS);
    }

    @Override
    protected Set<String> getWriteAddressKeys(Type type) {
        return asSet(GROUPADDRESS);
    }

}