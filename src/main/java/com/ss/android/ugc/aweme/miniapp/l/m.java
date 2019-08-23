package com.ss.android.ugc.aweme.miniapp.l;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.views.b;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55853a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55854b;

    public m(Activity activity) {
        this.f55854b = activity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55853a, false, 59582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55853a, false, 59582, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.f55854b;
        if (activity != null && !activity.isFinishing()) {
            new b(activity).show();
        }
    }
}
