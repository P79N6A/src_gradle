package com.ss.android.ugc.aweme.sdk;

import android.util.Pair;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63690a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.f.a.a f63691b;

    /* renamed from: c  reason: collision with root package name */
    String f63692c = "charge";

    /* renamed from: d  reason: collision with root package name */
    String f63693d = "walletAuth";

    /* renamed from: e  reason: collision with root package name */
    public Pair<String, d> f63694e;

    /* renamed from: f  reason: collision with root package name */
    public Pair<String, d> f63695f;
    public Map<String, d> g;

    /* renamed from: com.ss.android.ugc.aweme.sdk.a$a  reason: collision with other inner class name */
    public static class C0688a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63696a;

        /* renamed from: b  reason: collision with root package name */
        private com.bytedance.ies.f.a.a f63697b;

        /* renamed from: c  reason: collision with root package name */
        private d f63698c;

        /* renamed from: d  reason: collision with root package name */
        private d f63699d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, d> f63700e;

        public final a a() {
            if (PatchProxy.isSupport(new Object[0], this, f63696a, false, 71025, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f63696a, false, 71025, new Class[0], a.class);
            }
            a aVar = new a();
            d dVar = this.f63699d;
            if (PatchProxy.isSupport(new Object[]{dVar}, aVar, a.f63690a, false, 71021, new Class[]{d.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{dVar}, aVar2, a.f63690a, false, 71021, new Class[]{d.class}, Void.TYPE);
            } else {
                aVar.f63695f = new Pair<>(aVar.f63693d, dVar);
            }
            d dVar2 = this.f63698c;
            if (PatchProxy.isSupport(new Object[]{dVar2}, aVar, a.f63690a, false, 71020, new Class[]{d.class}, Void.TYPE)) {
                a aVar3 = aVar;
                PatchProxy.accessDispatch(new Object[]{dVar2}, aVar3, a.f63690a, false, 71020, new Class[]{d.class}, Void.TYPE);
            } else {
                aVar.f63694e = new Pair<>(aVar.f63692c, dVar2);
            }
            aVar.f63691b = this.f63697b;
            aVar.g = this.f63700e;
            return aVar;
        }

        public final C0688a a(com.bytedance.ies.f.a.a aVar) {
            this.f63697b = aVar;
            return this;
        }

        public final C0688a b(d dVar) {
            this.f63699d = dVar;
            return this;
        }

        public final C0688a a(d dVar) {
            this.f63698c = dVar;
            return this;
        }
    }

    public static C0688a a() {
        if (PatchProxy.isSupport(new Object[0], null, f63690a, true, 71019, new Class[0], C0688a.class)) {
            return (C0688a) PatchProxy.accessDispatch(new Object[0], null, f63690a, true, 71019, new Class[0], C0688a.class);
        }
        return new C0688a();
    }
}
