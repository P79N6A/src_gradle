package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class f implements Function3 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55290a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaAdapter f55291b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f55292c;

    f(MediaAdapter mediaAdapter, Context context) {
        this.f55291b = mediaAdapter;
        this.f55292c = context;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2, obj3}, this, f55290a, false, 58507, new Class[]{Object.class, Object.class, Object.class}, Object.class)) {
            return this.f55291b.a(this.f55292c, (String) obj, (Long) obj2, (Integer) obj3);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3}, this, f55290a, false, 58507, new Class[]{Object.class, Object.class, Object.class}, Object.class);
    }
}
