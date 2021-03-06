/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.availability.management;

import java.util.Map;


/**
 * @version $Rev$ $Date$
 */
public interface AvailabilityContainerController extends AvailabilityUnitController {

    void activate(ActivationReason reason, Map<String, String> attributes) throws AvailabilityException;

    void checkHealth() throws AvailabilityException;

    void deactivate(DeactivationReason reason) throws AvailabilityException;

    void init(AvailabilityAgentService service) throws AvailabilityException;

    AvailabilityUnitController instantiateAvailabilityUnit(String name, AvailabilityAgentService service) throws AvailabilityException;

    void terminate() throws AvailabilityException;
}
