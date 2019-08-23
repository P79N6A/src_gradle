package com.bytedance.android.livesdk;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class cf implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9686a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9687b;

    cf(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9687b = startLiveFragmentDefault;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9686a, false, 2955, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9686a, false, 2955, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f9687b;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            if (startLiveFragmentDefault.y > 3) {
                if (startLiveFragmentDefault.b_()) {
                    ai.a((int) C0906R.string.dco);
                }
                if (startLiveFragmentDefault.m != null && startLiveFragmentDefault.m.isShowing()) {
                    startLiveFragmentDefault.m.dismiss();
                }
            } else {
                s.INST.loadResources();
                startLiveFragmentDefault.y++;
            }
        } else if (startLiveFragmentDefault.m != null && startLiveFragmentDefault.m.isShowing()) {
            startLiveFragmentDefault.m.dismiss();
        }
    }
}
