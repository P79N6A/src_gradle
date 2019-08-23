package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.Point;
import com.bytedance.ies.dmt.ui.base.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dw implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66800a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f66801b;

    dw(int[] iArr) {
        this.f66801b = iArr;
    }

    public final Object a() {
        if (!PatchProxy.isSupport(new Object[0], this, f66800a, false, 74350, new Class[0], Object.class)) {
            return new Point(0, this.f66801b[1]);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f66800a, false, 74350, new Class[0], Object.class);
    }
}
