package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class h implements Function3 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55298a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaAdapterB f55299b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f55300c;

    h(MediaAdapterB mediaAdapterB, Context context) {
        this.f55299b = mediaAdapterB;
        this.f55300c = context;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2, obj3}, this, f55298a, false, 58537, new Class[]{Object.class, Object.class, Object.class}, Object.class)) {
            return this.f55299b.a(this.f55300c, (String) obj, (Long) obj2, (Integer) obj3);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3}, this, f55298a, false, 58537, new Class[]{Object.class, Object.class, Object.class}, Object.class);
    }
}
