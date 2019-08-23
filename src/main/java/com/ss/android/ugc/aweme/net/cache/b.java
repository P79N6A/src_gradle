package com.ss.android.ugc.aweme.net.cache;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.a.j;
import com.ss.android.ugc.aweme.net.aa;
import com.ttnet.org.chromium.base.ContextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.io.FileSystem;
import okio.Buffer;
import okio.Sink;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56933a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f56934b;

    /* renamed from: c  reason: collision with root package name */
    private final DiskLruCache f56935c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<String, Long> f56936d = new ConcurrentHashMap<>();

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f56933a, true, 60846, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f56933a, true, 60846, new Class[0], b.class);
        }
        if (f56934b == null) {
            synchronized (b.class) {
                if (f56934b == null) {
                    f56934b = new b();
                }
            }
        }
        return f56934b;
    }

    private b() {
        File file;
        String str;
        FileSystem fileSystem = FileSystem.SYSTEM;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (PatchProxy.isSupport(new Object[]{applicationContext}, this, f56933a, false, 60833, new Class[]{Context.class}, File.class)) {
            file = (File) PatchProxy.accessDispatch(new Object[]{applicationContext}, this, f56933a, false, 60833, new Class[]{Context.class}, File.class);
        } else {
            File file2 = null;
            file2 = applicationContext != null ? applicationContext.getCacheDir() : file2;
            if (file2 == null) {
                if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
                    str = applicationContext.getCacheDir().getPath();
                } else if (applicationContext.getExternalCacheDir() != null) {
                    str = applicationContext.getExternalCacheDir().getPath();
                } else {
                    str = "";
                }
                file2 = new File(str + File.separator + "net");
            }
            file = new File(file2.getPath() + File.separator + "net");
        }
        this.f56935c = DiskLruCache.create(fileSystem, file, 20190214, 1, 2097152);
    }

    public static boolean a(Request request) {
        if (PatchProxy.isSupport(new Object[]{request}, null, f56933a, true, 60834, new Class[]{Request.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{request}, null, f56933a, true, 60834, new Class[]{Request.class}, Boolean.TYPE)).booleanValue();
        }
        if (j.a() != null && j.a().m && request != null && !TextUtils.isEmpty(request.getUrl()) && !com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) request.getHeaders())) {
            for (Header next : request.getHeaders()) {
                if (next != null && "cache".equalsIgnoreCase(next.getName())) {
                    request.getHeaders().remove(next);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(Response response, Sink sink) {
        Sink sink2 = sink;
        if (PatchProxy.isSupport(new Object[]{response, sink2}, this, f56933a, false, 60843, new Class[]{Response.class, Sink.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{response, sink2}, this, f56933a, false, 60843, new Class[]{Response.class, Sink.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            byte[] bArr = new byte[4096];
            Buffer buffer = new Buffer();
            InputStream in = response.getBody().in();
            buffer.writeLong(SystemClock.elapsedRealtime());
            while (true) {
                int read = in.read(bArr);
                if (read == -1) {
                    break;
                }
                buffer.write(bArr, 0, read);
                sink2.write(buffer, (long) read);
                buffer.clear();
            }
            buffer.clear();
            buffer.close();
            in.close();
            if (sink2 != null) {
                sink.flush();
                sink.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void a(Request request, SsResponse ssResponse) {
        if (PatchProxy.isSupport(new Object[]{request, ssResponse}, this, f56933a, false, 60844, new Class[]{Request.class, SsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{request, ssResponse}, this, f56933a, false, 60844, new Class[]{Request.class, SsResponse.class}, Void.TYPE);
        } else if (request != null && !TextUtils.isEmpty(request.getUrl()) && ssResponse != null && ssResponse.code() == 200 && ssResponse.raw() != null) {
            String str = "";
            if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) request.getHeaders())) {
                List<Header> headers = request.headers("cache-key");
                if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) headers)) {
                    str = headers.get(0).getValue();
                    request.getHeaders().removeAll(headers);
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = aa.a(request.getUrl());
            }
            if (!TextUtils.isEmpty(str)) {
                new StringBuilder("CacheManager.put.key:").append(str);
                try {
                    DiskLruCache.Editor edit = this.f56935c.edit(str);
                    if (edit != null) {
                        if (a(ssResponse.raw(), edit.newSink(0))) {
                            edit.commit();
                            return;
                        }
                        edit.abort();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
