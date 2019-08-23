package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class z implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17519a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17520b;

    z(long j) {
        this.f17520b = j;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17519a, false, 13584, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f17519a, false, 13584, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        return ((a) obj).f18689a == this.f17520b;
    }
}
