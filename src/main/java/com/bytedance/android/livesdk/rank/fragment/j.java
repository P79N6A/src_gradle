package com.bytedance.android.livesdk.rank.fragment;

import com.bytedance.android.livesdk.rank.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.drakeet.multitype.d;

public final /* synthetic */ class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16988a;

    /* renamed from: b  reason: collision with root package name */
    static final d f16989b = new j();

    private j() {
    }

    public final int a(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f16988a, false, 13045, new Class[]{Object.class}, Integer.TYPE)) {
            return ((b) obj).g ? 0 : 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f16988a, false, 13045, new Class[]{Object.class}, Integer.TYPE)).intValue();
    }
}
