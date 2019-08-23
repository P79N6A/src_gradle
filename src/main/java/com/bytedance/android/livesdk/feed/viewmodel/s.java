package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;
import java.util.List;

public final /* synthetic */ class s implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14509a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f14510b = new s();

    private s() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f14509a, false, 9020, new Class[]{Object.class}, Boolean.TYPE)) {
            return !Lists.isEmpty((List) obj);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f14509a, false, 9020, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
