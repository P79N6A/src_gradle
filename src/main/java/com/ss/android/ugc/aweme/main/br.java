package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.a;

public final /* synthetic */ class br implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54643a;

    /* renamed from: b  reason: collision with root package name */
    private final bq f54644b;

    br(bq bqVar) {
        this.f54644b = bqVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54643a, false, 57624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54643a, false, 57624, new Class[0], Void.TYPE);
            return;
        }
        bq bqVar = this.f54644b;
        if (bqVar.isShowing()) {
            if (!o.v()) {
                if (o.b().a()) {
                    o.b().h();
                    bqVar.f54633c = true;
                    return;
                }
                bqVar.a();
            } else if (a.a().b()) {
                a.a().T();
                bqVar.f54633c = true;
            } else {
                bqVar.a();
            }
        }
    }
}
