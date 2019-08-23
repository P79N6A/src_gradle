package com.ss.android.ugc.aweme.profile.ui.widget;

import a.g;
import a.i;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63165a;

    /* renamed from: b  reason: collision with root package name */
    private final RemarkEditDialog f63166b;

    p(RemarkEditDialog remarkEditDialog) {
        this.f63166b = remarkEditDialog;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f63165a, false, 69863, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f63165a, false, 69863, new Class[]{i.class}, Object.class);
        }
        RemarkEditDialog remarkEditDialog = this.f63166b;
        if (remarkEditDialog.f63092c != null) {
            remarkEditDialog.f63092c.requestFocus();
            if (PatchProxy.isSupport(new Object[0], remarkEditDialog, RemarkEditDialog.f63090a, false, 69855, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], remarkEditDialog, RemarkEditDialog.f63090a, false, 69855, new Class[0], Void.TYPE);
            } else {
                InputMethodManager inputMethodManager = (InputMethodManager) remarkEditDialog.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(remarkEditDialog.f63092c, 1);
                }
            }
        }
        return null;
    }
}
