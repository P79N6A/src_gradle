package com.toutiao.proxyserver.net;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80157a;

    /* renamed from: b  reason: collision with root package name */
    public final d f80158b;

    /* renamed from: c  reason: collision with root package name */
    public final int f80159c;

    /* renamed from: d  reason: collision with root package name */
    public final List<c> f80160d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final SsResponse<?> f80161e;

    /* renamed from: f  reason: collision with root package name */
    public final Response f80162f;

    public final boolean a() {
        if (this.f80159c < 200 || this.f80159c >= 300) {
            return false;
        }
        return true;
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f80157a, false, 91822, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80157a, false, 91822, new Class[0], String.class);
        } else if (this.f80161e != null) {
            return "HTTP/1.1";
        } else {
            return this.f80162f.protocol().toString();
        }
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f80157a, false, 91823, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80157a, false, 91823, new Class[0], String.class);
        } else if (this.f80161e != null) {
            return this.f80161e.raw().getReason();
        } else {
            return this.f80162f.message();
        }
    }

    public final void close() throws IOException {
        InputStream inputStream;
        if (PatchProxy.isSupport(new Object[0], this, f80157a, false, 91827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80157a, false, 91827, new Class[0], Void.TYPE);
        } else if (this.f80161e != null) {
            TypedInput body = this.f80161e.raw().getBody();
            if (body == null) {
                inputStream = null;
            } else {
                inputStream = body.in();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } else {
            if (this.f80162f != null) {
                this.f80162f.close();
            }
        }
    }

    public final InputStream d() {
        if (PatchProxy.isSupport(new Object[0], this, f80157a, false, 91826, new Class[0], InputStream.class)) {
            return (InputStream) PatchProxy.accessDispatch(new Object[0], this, f80157a, false, 91826, new Class[0], InputStream.class);
        } else if (this.f80161e != null) {
            TypedInput body = this.f80161e.raw().getBody();
            if (body == null) {
                return null;
            }
            try {
                return body.in();
            } catch (IOException unused) {
                return null;
            }
        } else {
            ResponseBody body2 = this.f80162f.body();
            if (body2 == null) {
                return null;
            }
            return body2.byteStream();
        }
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f80157a, false, 91828, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80157a, false, 91828, new Class[0], String.class);
        }
        return "HttpResponse{request=" + this.f80158b + ", code=" + this.f80159c + ", headers=" + this.f80160d + '}';
    }

    public final String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f80157a, false, 91824, new Class[]{String.class}, String.class)) {
            return a(str2, null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f80157a, false, 91824, new Class[]{String.class}, String.class);
    }

    e(SsResponse<?> ssResponse, d dVar) {
        this.f80158b = dVar;
        this.f80161e = ssResponse;
        this.f80162f = null;
        this.f80159c = ssResponse.code();
        List<Header> headers = ssResponse.raw().getHeaders();
        if (headers != null) {
            for (Header next : headers) {
                if (!(next.getName().length() == 0 || next.getValue().length() == 0)) {
                    this.f80160d.add(new c(next.getName(), next.getValue()));
                }
            }
        }
    }

    e(Response response, d dVar) {
        this.f80158b = dVar;
        this.f80162f = response;
        this.f80161e = null;
        this.f80159c = response.code();
        Headers headers = response.headers();
        if (headers != null) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                if (!(headers.name(i).length() == 0 || headers.value(i).length() == 0)) {
                    this.f80160d.add(new c(headers.name(i), headers.value(i)));
                }
            }
        }
    }

    public final String a(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, this, f80157a, false, 91825, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str2}, this, f80157a, false, 91825, new Class[]{String.class, String.class}, String.class);
        }
        for (c next : this.f80160d) {
            if (next.f80143b.equalsIgnoreCase(str3)) {
                return next.f80144c;
            }
        }
        return str2;
    }
}
