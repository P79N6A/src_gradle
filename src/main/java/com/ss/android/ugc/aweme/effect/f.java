package com.ss.android.ugc.aweme.effect;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.f.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.ff;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43742a;

    /* renamed from: b  reason: collision with root package name */
    public static final Callable f43743b = new f();

    private f() {
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f43742a, false, 38559, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f43742a, false, 38559, new Class[0], Object.class);
        }
        Application application = a.f61119b;
        e eVar = new e();
        eVar.a((Context) application, (int) C0906R.raw.fake3d, ff.s);
        eVar.a((Context) application, (int) C0906R.raw.soul_scale, ff.s);
        return null;
    }
}
