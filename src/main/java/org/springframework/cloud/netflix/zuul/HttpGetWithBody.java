/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.zuul;

import java.net.URI;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/**
 * Send body with http get method.
 *
 * @author Kundan Kumar
 *
 */

public class HttpGetWithBody extends HttpEntityEnclosingRequestBase {

	/**
	 * Method name.
	 */
	public static final String METHOD_NAME = "GET";

	public HttpGetWithBody() {
	}

	public HttpGetWithBody(URI uri) {
		this.setURI(uri);
	}

	public HttpGetWithBody(String uri) {
		this.setURI(URI.create(uri));
	}

	public String getMethod() {
		return METHOD_NAME;
	}

}
