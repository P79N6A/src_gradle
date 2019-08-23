package com.toutiao.proxyserver.net;

import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.d.c;
import java.io.IOException;
import okhttp3.Response;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80126a;

    /* renamed from: b  reason: collision with root package name */
    public final Call<?> f80127b;

    /* renamed from: c  reason: collision with root package name */
    public final d f80128c;

    /* renamed from: d  reason: collision with root package name */
    public e f80129d;

    /* renamed from: e  reason: collision with root package name */
    public long f80130e;

    /* renamed from: f  reason: collision with root package name */
    public long f80131f;
    public boolean g;
    private final okhttp3.Call h;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f80126a, false, 91800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80126a, false, 91800, new Class[0], Void.TYPE);
        } else if (this.f80127b != null) {
            this.f80127b.cancel();
        } else {
            if (this.h != null) {
                this.h.cancel();
            }
        }
    }

    public final e a() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f80126a, false, 91799, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f80126a, false, 91799, new Class[0], e.class);
        } else if (this.f80127b != null) {
            this.f80130e = System.currentTimeMillis();
            try {
                SsResponse execute = this.f80127b.execute();
                this.f80131f = System.currentTimeMillis();
                e eVar = new e(execute, this.f80128c);
                this.f80129d = eVar;
                return eVar;
            } catch (IOException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        } else if (this.h == null) {
            return null;
        } else {
            try {
                this.f80130e = System.currentTimeMillis();
                Response execute2 = this.h.execute();
                this.f80131f = System.currentTimeMillis();
                e eVar2 = new e(execute2, this.f80128c);
                this.f80129d = eVar2;
                return eVar2;
            } catch (Exception e4) {
                if (!"Canceled".equalsIgnoreCase(e4.getMessage())) {
                    if (PatchProxy.isSupport(new Object[]{e4}, this, f80126a, false, 91801, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{e4}, this, f80126a, false, 91801, new Class[]{Throwable.class}, Void.TYPE);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        f fVar = new f();
                        fVar.f19734e = this.f80130e;
                        fVar.h = currentTimeMillis;
                        e.a(currentTimeMillis - this.f80130e, this.f80130e, this.f80128c.f80146b, "", fVar, e4);
                        c.d("HttpCall", "api_error, from okhttp connect: , netInfo: " + fVar + ", url: " + this.f80128c.f80146b + ", error: " + e4.getMessage());
                    }
                }
                throw e4;
            }
        }
    }

    public a(Call<?> call, d dVar) {
        this.f80127b = call;
        this.f80128c = dVar;
    }

    public a(okhttp3.Call call, d dVar) {
        this.h = call;
        this.f80128c = dVar;
    }
}
