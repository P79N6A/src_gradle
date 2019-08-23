package com.ss.android.ugc.aweme.commercialize.im;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.im.a;
import java.util.concurrent.Executor;

public final /* synthetic */ class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38905a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0506a f38906b;

    b(a.C0506a aVar) {
        this.f38906b = aVar;
    }

    public final void execute(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f38905a, false, 30813, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f38905a, false, 30813, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        a.C0506a aVar = this.f38906b;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            aVar.f38886c.a().post(runnable2);
        }
    }
}
