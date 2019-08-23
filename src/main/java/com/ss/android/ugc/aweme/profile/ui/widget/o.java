package com.ss.android.ugc.aweme.profile.ui.widget;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63162a;

    /* renamed from: b  reason: collision with root package name */
    private final RemarkEditDialog f63163b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63164c;

    o(RemarkEditDialog remarkEditDialog, String str) {
        this.f63163b = remarkEditDialog;
        this.f63164c = str;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f63162a, false, 69862, new Class[]{i.class}, Object.class)) {
            return this.f63163b.a(this.f63164c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f63162a, false, 69862, new Class[]{i.class}, Object.class);
    }
}
