package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ck implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13570a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13571b;

    ck(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13571b = startLiveFragmentDefault;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13570a, false, 2960, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13570a, false, 2960, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f13571b;
        Boolean bool = (Boolean) obj;
        startLiveFragmentDefault.l.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !startLiveFragmentDefault.F) {
            startLiveFragmentDefault.F = true;
            startLiveFragmentDefault.l.postDelayed(new cp(startLiveFragmentDefault), 300);
        }
    }
}
