package com.bytedance.android.livesdk.feed.adapter;

import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class d implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13966a;

    /* renamed from: b  reason: collision with root package name */
    public static final Predicate f13967b = new d();

    private d() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f13966a, false, 8495, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Pair) obj) != null;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f13966a, false, 8495, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
