package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import java.util.List;

public final /* synthetic */ class e implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14413a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14414b;

    e(a aVar) {
        this.f14414b = aVar;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14413a, false, 8919, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f14413a, false, 8919, new Class[]{Object.class}, Object.class);
        }
        List list = (List) obj;
        if (this.f14414b.f14405b.a(list)) {
            return list;
        }
        return null;
    }
}
