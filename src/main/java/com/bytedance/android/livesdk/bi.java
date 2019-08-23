package com.bytedance.android.livesdk;

import android.view.View;
import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.livesdkapi.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bi implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9255a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9256b;

    bi(StartLiveFragmentD startLiveFragmentD) {
        this.f9256b = startLiveFragmentD;
    }

    public final void a(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9255a, false, 2857, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9255a, false, 2857, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentD startLiveFragmentD = this.f9256b;
        a aVar = (a) obj;
        if (aVar != null) {
            startLiveFragmentD.E = aVar;
            if (startLiveFragmentD.b_()) {
                View view = startLiveFragmentD.x;
                if (!startLiveFragmentD.E.hasDouPlusEntry) {
                    i = 8;
                }
                view.setVisibility(i);
                startLiveFragmentD.o();
            }
        }
    }
}
