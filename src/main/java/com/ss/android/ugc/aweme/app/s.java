package com.ss.android.ugc.aweme.app;

import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.a.a;

public final /* synthetic */ class s implements AlertDialog.NightMode {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2677a;

    /* renamed from: b  reason: collision with root package name */
    static final AlertDialog.NightMode f2678b = new s();

    private s() {
    }

    public final boolean isToggled() {
        if (!PatchProxy.isSupport(new Object[0], this, f2677a, false, 22344, new Class[0], Boolean.TYPE)) {
            return a.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2677a, false, 22344, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
