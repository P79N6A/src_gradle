package com.bytedance.android.livesdk.rank.fragment;

import com.bytedance.android.livesdk.rank.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class g implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16982a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f16983b = new g();

    private g() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f16982a, false, 13042, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((b) obj).f17025b != null;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f16982a, false, 13042, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
