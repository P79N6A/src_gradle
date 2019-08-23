package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import org.jetbrains.annotations.NotNull;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52967a;

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f52968b = new c.a();

    /* renamed from: e  reason: collision with root package name */
    private static volatile b f52969e;

    public static b a() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], null, f52967a, true, 55014, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f52967a, true, 55014, new Class[0], b.class);
        }
        if (f52969e == null) {
            synchronized (b.class) {
                if (f52969e == null) {
                    if (PatchProxy.isSupport(new Object[0], null, f52967a, true, 55015, new Class[0], c.class)) {
                        cVar = (c) PatchProxy.accessDispatch(new Object[0], null, f52967a, true, 55015, new Class[0], c.class);
                    } else {
                        c hVar = new h(null);
                        if (!a.a()) {
                            hVar = new a(d.a(hVar));
                        }
                        cVar = new f(hVar);
                    }
                    f52969e = new b(cVar);
                }
            }
        }
        return f52969e;
    }

    private b(c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: package-private */
    @NotNull
    public final c.a a(e eVar, Request request, SsResponse ssResponse) {
        return f52968b;
    }
}
