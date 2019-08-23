package com.bytedance.android.livesdk;

import android.content.Context;
import com.bytedance.android.live.uikit.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class cp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13648a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13649b;

    cp(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13649b = startLiveFragmentDefault;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13648a, false, 2965, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13648a, false, 2965, new Class[0], Void.TYPE);
            return;
        }
        a.a((Context) this.f13649b.f8846c, (int) C0906R.string.dcc);
    }
}
