package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cb implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11989a;

    /* renamed from: b  reason: collision with root package name */
    private final CompoundButton f11990b;

    cb(CompoundButton compoundButton) {
        this.f11990b = compoundButton;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11989a, false, 5904, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11989a, false, 5904, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        CompoundButton compoundButton = this.f11990b;
        dialogInterface.dismiss();
        compoundButton.setChecked(true);
    }
}
