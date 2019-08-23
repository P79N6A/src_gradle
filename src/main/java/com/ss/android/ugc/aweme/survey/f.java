package com.ss.android.ugc.aweme.survey;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@SuppressLint({"LogNotTimber"})
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74508a;

    /* renamed from: b  reason: collision with root package name */
    static final boolean f74509b = com.ss.android.ugc.aweme.g.a.a();

    /* renamed from: d  reason: collision with root package name */
    private static volatile f f74510d;

    /* renamed from: c  reason: collision with root package name */
    public a f74511c;

    public interface a {
        void a(e eVar);
    }

    public final void c() {
        this.f74511c = null;
    }

    private f() {
        if (f74510d != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74508a, false, 86697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74508a, false, 86697, new Class[0], Void.TYPE);
            return;
        }
        i a2 = SurveyApi.a();
        if (a2 != null) {
            a2.a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(this));
        }
    }

    public static f a() {
        if (PatchProxy.isSupport(new Object[0], null, f74508a, true, 86696, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f74508a, true, 86696, new Class[0], f.class);
        }
        if (f74510d == null) {
            synchronized (f.class) {
                if (f74510d == null) {
                    f74510d = new f();
                }
            }
        }
        return f74510d;
    }

    public final void a(@NonNull c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f74508a, false, 86698, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f74508a, false, 86698, new Class[]{c.class}, Void.TYPE);
            return;
        }
        i a2 = SurveyApi.a(cVar);
        if (a2 != null) {
            a2.a(h.f74515b);
        }
    }
}
