package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class y implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17517a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17518b;

    y(long j) {
        this.f17518b = j;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17517a, false, 13583, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f17517a, false, 13583, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        i iVar = (i) obj;
        return iVar != null && iVar.getId() == this.f17518b;
    }
}
