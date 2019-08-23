package com.ss.android.ugc.aweme.comment.ui;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36596a;

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardDialogFragment f36597b;

    j(KeyboardDialogFragment keyboardDialogFragment) {
        this.f36597b = keyboardDialogFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36596a, false, 27567, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f36596a, false, 27567, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f36597b.d(z);
    }
}
