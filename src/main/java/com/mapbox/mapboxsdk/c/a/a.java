package com.mapbox.mapboxsdk.c.a;

import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.http.b;
import com.mapbox.mapboxsdk.http.c;
import com.mapbox.mapboxsdk.http.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26463a;

    /* renamed from: b  reason: collision with root package name */
    private static OkHttpClient f26464b;

    /* renamed from: c  reason: collision with root package name */
    private Call f26465c;

    /* renamed from: com.mapbox.mapboxsdk.c.a.a$a  reason: collision with other inner class name */
    static class C0305a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        private d f26466a;

        C0305a(d dVar) {
            this.f26466a = dVar;
        }

        private static int a(Exception exc) {
            if ((exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ProtocolException) || (exc instanceof SSLException)) {
                return 0;
            }
            if (exc instanceof InterruptedIOException) {
                return 1;
            }
            return 2;
        }

        public final void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            a(call, iOException);
        }

        public final void a(Call call, Exception exc) {
            String str;
            if (exc.getMessage() != null) {
                str = exc.getMessage();
            } else {
                str = "Error processing the request";
            }
            int a2 = a(exc);
            if (!(!b.f26497b || call == null || call.request() == null)) {
                b.a(a2, str, call.request().url().toString());
            }
            this.f26466a.handleFailure(a2, str);
        }

        public final void onResponse(@NonNull Call call, @NonNull Response response) {
            String str;
            if (response.isSuccessful()) {
                b.a(2, String.format("[HTTP] Request was successful (code = %s).", new Object[]{Integer.valueOf(response.code())}));
            } else {
                if (!TextUtils.isEmpty(response.message())) {
                    str = response.message();
                } else {
                    str = "No additional information";
                }
                b.a(3, String.format("[HTTP] Request with response = %s: %s", new Object[]{Integer.valueOf(response.code()), str}));
            }
            ResponseBody body = response.body();
            if (body == null) {
                b.a(6, "[HTTP] Received empty response body");
                return;
            }
            try {
                byte[] bytes = body.bytes();
                response.close();
                this.f26466a.onResponse(response.code(), response.header("ETag"), response.header("Last-Modified"), response.header("Cache-Control"), response.header("Expires"), response.header("Retry-After"), response.header("x-rate-limit-reset"), bytes);
            } catch (IOException e2) {
                onFailure(call, e2);
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f26465c != null) {
            this.f26465c.cancel();
        }
    }

    static {
        int i;
        String format = String.format("%s %s (%s) Android/%s (%s)", new Object[]{com.mapbox.mapboxsdk.http.a.a(com.mapbox.mapboxsdk.d.b()), "Mapbox/6.8.2", "3d0f578", Integer.valueOf(Build.VERSION.SDK_INT), Build.CPU_ABI});
        int length = format.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int codePointAt = format.codePointAt(i2);
            if (codePointAt <= 31 || codePointAt >= 127) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(format, 0, i2);
            } else {
                i2 += Character.charCount(codePointAt);
            }
        }
        Buffer buffer2 = new Buffer();
        buffer2.writeUtf8(format, 0, i2);
        while (i2 < length) {
            int codePointAt2 = format.codePointAt(i2);
            if (codePointAt2 <= 31 || codePointAt2 >= 127) {
                i = 63;
            } else {
                i = codePointAt2;
            }
            buffer2.writeUtf8CodePoint(i);
            i2 += Character.charCount(codePointAt2);
        }
        format = buffer2.readUtf8();
        f26463a = format;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(20);
        f26464b = builder.dispatcher(dispatcher).build();
    }

    public final void a(d dVar, String str, String str2, String str3) {
        String str4;
        C0305a aVar = new C0305a(dVar);
        try {
            HttpUrl parse = HttpUrl.parse(str);
            boolean z = false;
            if (parse == null) {
                b.a(6, String.format("[HTTP] Unable to parse resourceUrl %s", new Object[]{str}));
                return;
            }
            String lowerCase = parse.host().toLowerCase(com.mapbox.mapboxsdk.constants.a.f26480a);
            int querySize = parse.querySize();
            if (lowerCase.equals("mapbox.com") || lowerCase.endsWith(".mapbox.com") || lowerCase.equals("mapbox.cn") || lowerCase.endsWith(".mapbox.cn")) {
                z = true;
            }
            if (z) {
                if (querySize == 0) {
                    str4 = str + "?";
                } else {
                    str4 = str + "&";
                }
                str = str4 + "events=true";
            }
            Request.Builder addHeader = new Request.Builder().url(str).tag(str.toLowerCase(com.mapbox.mapboxsdk.constants.a.f26480a)).addHeader("User-Agent", f26463a);
            if (str2.length() > 0) {
                addHeader.addHeader("If-None-Match", str2);
            } else if (str3.length() > 0) {
                addHeader.addHeader("If-Modified-Since", str3);
            }
            this.f26465c = f26464b.newCall(addHeader.build());
            this.f26465c.enqueue(aVar);
        } catch (Exception e2) {
            aVar.a(this.f26465c, e2);
        }
    }
}
