package com.bytedance.android.livesdk.feed.dislike;

import com.bytedance.android.live.base.model.live.DislikeResult;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class b implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14091a;

    /* renamed from: b  reason: collision with root package name */
    public static final Function f14092b = new b();

    private b() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f14091a, false, 8585, new Class[]{Object.class}, Object.class)) {
            return (DislikeResult) ((d) obj).f7871b;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f14091a, false, 8585, new Class[]{Object.class}, Object.class);
    }
}
