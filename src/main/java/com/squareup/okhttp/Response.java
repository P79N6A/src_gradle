package com.squareup.okhttp;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.Collections;
import java.util.List;

public final class Response {
    public final ResponseBody body;
    private volatile CacheControl cacheControl;
    public Response cacheResponse;
    public final int code;
    public final Handshake handshake;
    public final Headers headers;
    public final String message;
    public Response networkResponse;
    public final Response priorResponse;
    public final Protocol protocol;
    public final Request request;

    public static class Builder {
        public ResponseBody body;
        public Response cacheResponse;
        public int code;
        public Handshake handshake;
        public Headers.Builder headers;
        public String message;
        public Response networkResponse;
        public Response priorResponse;
        public Protocol protocol;
        public Request request;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Response build() {
            if (this.request == null) {
                throw new IllegalStateException("request == null");
            } else if (this.protocol == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.code >= 0) {
                return new Response(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.code);
            }
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public Builder handshake(Handshake handshake2) {
            this.handshake = handshake2;
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder protocol(Protocol protocol2) {
            this.protocol = protocol2;
            return this;
        }

        public Builder request(Request request2) {
            this.request = request2;
            return this;
        }

        public Builder headers(Headers headers2) {
            this.headers = headers2.newBuilder();
            return this;
        }

        public Builder priorResponse(Response response) {
            if (response != null) {
                checkPriorResponse(response);
            }
            this.priorResponse = response;
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        private void checkPriorResponse(Response response) {
            if (response.body != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public Builder cacheResponse(Response response) {
            if (response != null) {
                checkSupportResponse("cacheResponse", response);
            }
            this.cacheResponse = response;
            return this;
        }

        public Builder networkResponse(Response response) {
            if (response != null) {
                checkSupportResponse("networkResponse", response);
            }
            this.networkResponse = response;
            return this;
        }

        private Builder(Response response) {
            this.code = -1;
            this.request = response.request;
            this.protocol = response.protocol;
            this.code = response.code;
            this.message = response.message;
            this.handshake = response.handshake;
            this.headers = response.headers.newBuilder();
            this.body = response.body;
            this.networkResponse = response.networkResponse;
            this.cacheResponse = response.cacheResponse;
            this.priorResponse = response.priorResponse;
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        private void checkSupportResponse(String str, Response response) {
            if (response.body != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (response.networkResponse != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (response.cacheResponse != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (response.priorResponse != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final int code() {
        return this.code;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final Request request() {
        return this.request;
    }

    public final Builder newBuilder() {
        return new Builder();
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl2 = this.cacheControl;
        if (cacheControl2 != null) {
            return cacheControl2;
        }
        CacheControl parse = CacheControl.parse(this.headers);
        this.cacheControl = parse;
        return parse;
    }

    public final boolean isSuccessful() {
        if (this.code < 200 || this.code >= 300) {
            return false;
        }
        return true;
    }

    public final List<Challenge> challenges() {
        String str;
        if (this.code == 401) {
            str = "WWW-Authenticate";
        } else if (this.code != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return OkHeaders.parseChallenges(headers(), str);
    }

    public final boolean isRedirect() {
        switch (this.code) {
            case c.f69428f /*?: ONE_ARG  (wrap: ?
  ?: SGET   com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f int)*/:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308:
                return true;
            default:
                return false;
        }
    }

    public final String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.urlString() + '}';
    }

    public final String header(String str) {
        return header(str, null);
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    private Response(Builder builder) {
        this.request = builder.request;
        this.protocol = builder.protocol;
        this.code = builder.code;
        this.message = builder.message;
        this.handshake = builder.handshake;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.networkResponse = builder.networkResponse;
        this.cacheResponse = builder.cacheResponse;
        this.priorResponse = builder.priorResponse;
    }

    public final String header(String str, String str2) {
        String str3 = this.headers.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }
}
