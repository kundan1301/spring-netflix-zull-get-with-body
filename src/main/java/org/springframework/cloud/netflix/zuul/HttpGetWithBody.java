package org.springframework.cloud.netflix.zuul;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import java.net.URI;

public class HttpGetWithBody extends HttpEntityEnclosingRequestBase {
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
