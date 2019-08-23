package com.ss.android.ugc.aweme.story.shootvideo.publish.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import java.util.concurrent.Callable;

public final class b extends com.ss.android.ugc.aweme.common.b<a<f>, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73636a;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f73636a, false, 85436, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f73636a, false, 85436, new Class[]{Exception.class}, Void.TYPE);
        }
    }

    public b() {
        a(new a<f>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73637a;

            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f73637a, false, 85438, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f73637a, false, 85438, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                }
                m.a().a(this.mHandler, new Callable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73639a;

                    public final Object call() throws Exception {
                        if (!PatchProxy.isSupport(new Object[0], this, f73639a, false, 85439, new Class[0], Object.class)) {
                            return com.ss.android.ugc.aweme.port.in.a.B.a();
                        }
                        return PatchProxy.accessDispatch(new Object[0], this, f73639a, false, 85439, new Class[0], Object.class);
                    }
                }, 0);
                return true;
            }
        });
    }

    public final void b() {
        f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f73636a, false, 85437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73636a, false, 85437, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null) {
            fVar = null;
        } else {
            fVar = (f) this.f2978e.getData();
        }
        if (!(fVar == null || this.f2979f == null)) {
            ((c) this.f2979f).a(fVar);
        }
    }
}
