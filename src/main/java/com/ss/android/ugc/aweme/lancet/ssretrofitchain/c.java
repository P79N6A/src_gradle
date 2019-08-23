package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public abstract class c {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f52970c;

    /* renamed from: d  reason: collision with root package name */
    c f52971d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f52972a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f52973b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f52974c;

        public a() {
            this(false, false);
        }

        public a(boolean z, boolean z2) {
            this.f52972a = z2;
            this.f52973b = z;
        }

        public a(boolean z, boolean z2, Map<String, String> map) {
            this.f52972a = true;
            this.f52973b = true;
            this.f52974c = map;
        }
    }

    /* access modifiers changed from: package-private */
    @NotNull
    public abstract a a(e eVar, Request request, SsResponse ssResponse);

    public c(c cVar) {
        this.f52971d = cVar;
    }

    public final a b(e eVar, Request request, SsResponse ssResponse) {
        a a2;
        c cVar = this;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{eVar, request, ssResponse}, cVar, f52970c, false, 55016, new Class[]{e.class, Request.class, SsResponse.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{eVar, request, ssResponse}, cVar, f52970c, false, 55016, new Class[]{e.class, Request.class, SsResponse.class}, a.class);
            }
            a2 = cVar.a(eVar, request, ssResponse);
            if (a2.f52973b || cVar.f52971d == null) {
                return a2;
            }
            cVar = cVar.f52971d;
        }
        return a2;
    }
}
