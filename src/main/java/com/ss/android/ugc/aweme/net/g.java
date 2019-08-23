package com.ss.android.ugc.aweme.net;

import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.retrofit.a;
import com.bytedance.lighten.core.b.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;

public abstract class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56943a;

    /* renamed from: b  reason: collision with root package name */
    protected Executor f56944b;

    /* renamed from: c  reason: collision with root package name */
    protected r f56945c;

    /* renamed from: d  reason: collision with root package name */
    protected s f56946d;

    public g() {
        this(new a());
        this.f56946d = new s();
    }

    public void a(r rVar) {
        this.f56945c = rVar;
    }

    private g(Executor executor) {
        this.f56944b = executor;
    }

    public static String a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, null, f56943a, true, 60688, new Class[]{Throwable.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{th}, null, f56943a, true, 60688, new Class[]{Throwable.class}, String.class);
        } else if (th == null) {
            return "";
        } else {
            try {
                String[] split = th.getMessage().split("\\|");
                if (split != null && split.length >= 2) {
                    Logger.debug();
                    return split[0];
                }
            } catch (Throwable unused) {
            }
            return "";
        }
    }
}
