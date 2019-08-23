package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8355a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseDialogFragment f8356b;

    a(BaseDialogFragment baseDialogFragment) {
        this.f8356b = baseDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f8355a, false, 1492, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f8355a, false, 1492, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        BaseDialogFragment baseDialogFragment = this.f8356b;
        if (4 == i) {
            keyEvent.getAction();
        }
        return false;
    }
}
