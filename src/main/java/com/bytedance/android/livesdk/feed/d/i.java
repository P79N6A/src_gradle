package com.bytedance.android.livesdk.feed.d;

import com.bytedance.android.live.base.model.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14087a;

    /* renamed from: b  reason: collision with root package name */
    public List<g> f14088b;

    public final long getId() {
        return 2131170540;
    }

    public final String getMixId() {
        if (!PatchProxy.isSupport(new Object[0], this, f14087a, false, 8604, new Class[0], String.class)) {
            return String.valueOf(getId());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f14087a, false, 8604, new Class[0], String.class);
    }
}
