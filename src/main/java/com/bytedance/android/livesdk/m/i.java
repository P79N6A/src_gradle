package com.bytedance.android.livesdk.m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16379a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnKeyListener f16380b = new i();

    private i() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f16379a, false, 12630, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f16379a, false, 12630, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (i != 4) {
            return false;
        } else {
            if (keyEvent.getAction() == 1) {
                dialogInterface.cancel();
            }
            return true;
        }
    }
}
