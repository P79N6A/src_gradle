package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.core.setting.SettingFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8178a;

    /* renamed from: b  reason: collision with root package name */
    private final SettingFragment.AnonymousClass1 f8179b;

    k(SettingFragment.AnonymousClass1 r1) {
        this.f8179b = r1;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8178a, false, 926, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8178a, false, 926, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8179b.notifyItemChanged(((Integer) obj).intValue());
    }
}
