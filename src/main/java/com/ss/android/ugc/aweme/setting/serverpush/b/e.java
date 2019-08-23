package com.ss.android.ugc.aweme.setting.serverpush.b;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

public class e extends b<a<c>, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64048a;

    public e() {
        if (PatchProxy.isSupport(new Object[0], this, f64048a, false, 72317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64048a, false, 72317, new Class[0], Void.TYPE);
            return;
        }
        a(new a<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64049a;

            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f64049a, false, 72320, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f64049a, false, 72320, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    m.a().a(this.mHandler, new Callable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f64051a;

                        public final Object call() throws Exception {
                            if (!PatchProxy.isSupport(new Object[0], this, f64051a, false, 72321, new Class[0], Object.class)) {
                                return PushSettingsApiManager.b();
                            }
                            return PatchProxy.accessDispatch(new Object[0], this, f64051a, false, 72321, new Class[0], Object.class);
                        }
                    }, 0);
                    return true;
                }
            }
        });
    }

    public final void b() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f64048a, false, 72319, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64048a, false, 72319, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null) {
            cVar = null;
        } else {
            cVar = (c) this.f2978e.getData();
        }
        if (!(cVar == null || this.f2979f == null)) {
            com.ss.android.ugc.aweme.aj.b.b().a((Context) k.a(), "last_user_setting_version", cVar.u);
            ((b) this.f2979f).a(cVar);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f64048a, false, 72318, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f64048a, false, 72318, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((b) this.f2979f).d_(exc);
        }
    }
}
