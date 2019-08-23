package com.bytedance.android.livesdk.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class l implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14497a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f14498b = new l();

    private l() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f14497a, false, 9015, new Class[]{Object.class}, Object.class)) {
            return ((com.bytedance.android.live.base.model.user.l) obj).f7776a;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f14497a, false, 9015, new Class[]{Object.class}, Object.class);
    }
}
