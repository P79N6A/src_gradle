package com.ss.android.ugc.aweme.shortvideo.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;
import kotlin.Pair;

public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71407a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71408b;

    b(int i) {
        this.f71408b = i;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71407a, false, 81276, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f71407a, false, 81276, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        return ((Integer) ((Pair) obj).getFirst()).equals(Integer.valueOf(this.f71408b));
    }
}
