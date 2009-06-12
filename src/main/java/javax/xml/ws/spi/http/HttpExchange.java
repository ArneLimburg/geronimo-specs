/**
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

package javax.xml.ws.spi.http;

/**
 * @since 2.2
 */
public abstract class HttpExchange {

            public HttpExchange()
            {
            }

            public abstract Map getRequestHeaders();

            public abstract String getRequestHeader(String name);

            public abstract Map getResponseHeaders();

            public abstract void addResponseHeader(String name, String value);

            public abstract String getRequestURI();

            public abstract String getContextPath();

            public abstract String getRequestMethod();

            public abstract HttpContext getHttpContext();

            public abstract void close()
                throws IOException;

            public abstract InputStream getRequestBody()
                throws IOException;

            public abstract OutputStream getResponseBody()
                throws IOException;

            public abstract void setStatus(int status);

            public abstract InetSocketAddress getRemoteAddress();

            public abstract InetSocketAddress getLocalAddress();

            public abstract String getProtocol();

            public abstract String getScheme();

            public abstract String getPathInfo();

            public abstract String getQueryString();

            public abstract Object getAttribute(String name);

            public abstract Set getAttributeNames();

            public abstract Principal getUserPrincipal();

            public abstract boolean isUserInRole(String role);

            public static final String REQUEST_CIPHER_SUITE = "javax.xml.ws.spi.http.request.cipher.suite";
            public static final String REQUEST_KEY_SIZE = "javax.xml.ws.spi.http.request.key.size";
            public static final String REQUEST_X509CERTIFICATE = "javax.xml.ws.spi.http.request.cert.X509Certificate";
}
