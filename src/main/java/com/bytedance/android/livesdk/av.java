package com.bytedance.android.livesdk;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.StartLiveBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class av implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9071a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveBaseFragment.AnonymousClass1 f9072b;

    av(StartLiveBaseFragment.AnonymousClass1 r1) {
        this.f9072b = r1;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9071a, false, 2799, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9071a, false, 2799, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9072b.a((Boolean) obj);
    }
}
