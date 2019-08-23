package com.ss.android.websocket.a;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final MediaType f78142a = MediaType.parse("application/vnd.okhttp.websocket+text; charset=utf-8");

    /* renamed from: b  reason: collision with root package name */
    public static final MediaType f78143b = MediaType.parse("application/vnd.okhttp.websocket+binary");

    void a(int i, String str) throws IOException;

    void a(RequestBody requestBody) throws IOException;

    void a(Buffer buffer) throws IOException;
}
