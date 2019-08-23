package com.bytedance.android.livesdk.feed.a;

import android.content.Context;
import com.bytedance.android.livesdk.feed.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements com.bytedance.android.live.core.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13936a;

    public final Context a() {
        if (!PatchProxy.isSupport(new Object[0], this, f13936a, false, 8515, new Class[0], Context.class)) {
            return b.c().a().a();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f13936a, false, 8515, new Class[0], Context.class);
    }
}
