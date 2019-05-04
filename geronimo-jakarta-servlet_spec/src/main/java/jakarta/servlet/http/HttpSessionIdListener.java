/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package javax.servlet.http;

import java.util.EventListener;

/**
 * Interface for receiving notification events about HttpSession id changes.
 * <p/>
 * In order to receive these notification events, the implementation class must be either declared in the deployment
 * descriptor of the web application, annotated with WebListener, or registered via one of the addListener methods
 * defined on ServletContext.
 * <p/>
 * The order in which implementations of this interface are invoked is unspecified.
 * 
 * @since Servlet 3.1
 */
public interface HttpSessionIdListener extends EventListener {

    /**
     * Receives notification that session id has been changed in a session.
     * 
     * @param event
     *            the HttpSessionBindingEvent containing the session and the name and (old) value of the attribute that
     *            was replaced
     * @param oldSessionId
     *            the old session id
     */
    void sessionIdChanged(HttpSessionEvent event, String oldSessionId);
}
