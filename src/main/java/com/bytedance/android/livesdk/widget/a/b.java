package com.bytedance.android.livesdk.widget.a;

import android.text.TextUtils;
import com.bytedance.android.livesdk.widget.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18392a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18393b;

    b(String str) {
        this.f18393b = str;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18392a, false, 14818, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f18392a, false, 14818, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        return TextUtils.equals(((a.b) obj).f18391b, this.f18393b);
    }
}
