/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package jakarta.xml.ws.soap;

import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;

public final class MTOMFeature extends WebServiceFeature {
    public static final String ID = "http://www.w3.org/2004/08/soap/features/http-optimization";
    
    protected int threshold;
    
    public MTOMFeature() {
        this(true, 0);
    }
    
    public MTOMFeature(boolean enabled) {
        this(enabled, 0);
    }
    
    public MTOMFeature(int threshold) {
        this(true, threshold);
    }
    
    public MTOMFeature(boolean enabled, int threshold) {
        super();
        
        //TODO NLS enable
        if (threshold < 0)
            throw new WebServiceException("MTOM threshold size cannot be less than zero. It was " + threshold);
        
        this.enabled   = enabled;
        this.threshold = threshold;
    }

    public int getThreshold() {
        return threshold;
    }
    
    @Override
    public String getID() {
        return ID;
    }
}