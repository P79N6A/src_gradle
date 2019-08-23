package com.mapbox.android.telemetry;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import okio.Sink;

public final class ac implements Interceptor {
    ac() {
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (request.body() == null || request.header("Content-Encoding") != null) {
            return chain.proceed(request);
        }
        Request.Builder header = request.newBuilder().header("Content-Encoding", "gzip");
        String method = request.method();
        final RequestBody body = request.body();
        return chain.proceed(header.method(method, new RequestBody() {
            public final long contentLength() {
                return -1;
            }

            public final MediaType contentType() {
                return body.contentType();
            }

            public final void writeTo(BufferedSink bufferedSink) throws IOException {
                BufferedSink buffer = Okio.buffer((Sink) new GzipSink(bufferedSink));
                body.writeTo(buffer);
                buffer.close();
            }
        }).build());
    }
}
