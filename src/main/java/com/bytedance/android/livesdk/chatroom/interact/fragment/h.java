package com.bytedance.android.livesdk.chatroom.interact.fragment;

import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class h implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10945a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f10946b = new h();

    private h() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f10945a, false, 4575, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) b.m.a()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f10945a, false, 4575, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
