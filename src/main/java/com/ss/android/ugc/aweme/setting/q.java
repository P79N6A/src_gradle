package com.ss.android.ugc.aweme.setting;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64005a;

    /* renamed from: b  reason: collision with root package name */
    private final o f64006b;

    /* renamed from: c  reason: collision with root package name */
    private final AwemeSettings f64007c;

    q(o oVar, AwemeSettings awemeSettings) {
        this.f64006b = oVar;
        this.f64007c = awemeSettings;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f64005a, false, 72072, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f64005a, false, 72072, new Class[0], Object.class);
        }
        o oVar = this.f64006b;
        AwemeSettings awemeSettings = this.f64007c;
        oVar.h = new Gson().toJson((Object) awemeSettings);
        boolean z = awemeSettings.enableTwitterNewKeySecret;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, n.f33102a, true, 21387, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, n.f33102a, true, 21387, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            n.e().edit().putBoolean("enable_twitter_new_key", z).commit();
        }
        return null;
    }
}
