package com.bytedance.ies.net.b;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

public final class d extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    RequestBody f20858a;

    public final MediaType contentType() {
        return this.f20858a.contentType();
    }

    public d(RequestBody requestBody) {
        if (requestBody != null) {
            this.f20858a = requestBody;
            return;
        }
        throw new NullPointerException("requestBody == null");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        this.f20858a.writeTo(bufferedSink);
        bufferedSink.flush();
    }
}
