package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.benchmark.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final /* synthetic */ class ba implements l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75583a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f75584b;

    public ba(Context context) {
        this.f75584b = context;
    }

    public final void a(Map map) {
        Map map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f75583a, false, 88211, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, this, f75583a, false, 88211, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        az.a(this.f75584b, map2);
    }
}
