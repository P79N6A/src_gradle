package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.model.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class ai implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11217a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f11218b = new ai();

    private ai() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f11217a, false, 5234, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((m.a) obj).f11140a != null;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f11217a, false, 5234, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
