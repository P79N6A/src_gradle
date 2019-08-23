package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.b.a.e;
import com.ss.android.ugc.aweme.base.e.c;

public final class cw<Result> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75701a;

    /* renamed from: b  reason: collision with root package name */
    public e<Result> f75702b;

    /* renamed from: c  reason: collision with root package name */
    c<Result> f75703c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f75704d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75701a, false, 88434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75701a, false, 88434, new Class[0], Void.TYPE);
            return;
        }
        a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75705a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f75705a, false, 88435, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f75705a, false, 88435, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    final Object a2 = cw.this.f75702b.a();
                    if (cw.this.f75703c != null) {
                        a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f75710a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f75710a, false, 88437, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f75710a, false, 88437, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (!cw.this.f75704d) {
                                    cw.this.f75703c.a(a2);
                                }
                            }
                        });
                    }
                } catch (Exception e2) {
                    if (cw.this.f75703c != null) {
                        a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f75707a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f75707a, false, 88436, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f75707a, false, 88436, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (!cw.this.f75704d) {
                                    cw.this.f75703c.a(e2);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public cw(e<Result> eVar, c<Result> cVar) {
        this.f75702b = eVar;
        this.f75703c = cVar;
    }
}
