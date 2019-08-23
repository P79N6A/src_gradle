package com.ss.android.ugc.aweme.im.sdk.i;

import android.app.Activity;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.service.c;
import java.util.List;
import java.util.Vector;
import org.jetbrains.annotations.NotNull;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51688a;

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f51689d;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f51690b;

    /* renamed from: c  reason: collision with root package name */
    public List<n> f51691c = new Vector();

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f51688a, true, 53853, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f51688a, true, 53853, new Class[0], a.class);
        }
        if (f51689d == null) {
            synchronized (a.class) {
                if (f51689d == null) {
                    f51689d = new a();
                }
            }
        }
        return f51689d;
    }

    public static boolean a(BaseExtra baseExtra) {
        if (PatchProxy.isSupport(new Object[]{baseExtra}, null, f51688a, true, 53855, new Class[]{BaseExtra.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{baseExtra}, null, f51688a, true, 53855, new Class[]{BaseExtra.class}, Boolean.TYPE)).booleanValue();
        } else if (baseExtra == null || (baseExtra.getStatusCode() != 7188 && baseExtra.getStatusCode() != 7187)) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(n nVar, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{nVar, Integer.valueOf(i)}, this, f51688a, false, 53854, new Class[]{n.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, Integer.valueOf(i)}, this, f51688a, false, 53854, new Class[]{n.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!this.f51691c.contains(nVar)) {
            this.f51691c.add(nVar);
        }
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.bgf);
            return;
        }
        if (!this.f51690b) {
            Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
            if (a2 != null) {
                this.f51690b = true;
                c e2 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e();
                if (e2 != null) {
                    if (i == 7188) {
                        i2 = 3059;
                    } else {
                        i2 = 3058;
                    }
                    e2.popCaptcha(a2, i2, new com.ss.android.ugc.aweme.im.service.a.c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f51692a;

                        public final void a() {
                            a.this.f51690b = false;
                        }

                        public final void a(boolean z, @NotNull String str) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f51692a, false, 53856, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f51692a, false, 53856, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
                                return;
                            }
                            if (z) {
                                for (n c2 : a.this.f51691c) {
                                    ad.c(c2);
                                }
                            }
                            a.this.f51691c.clear();
                        }
                    });
                }
            }
        }
    }
}
