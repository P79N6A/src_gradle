package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cp implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62599a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditInputFragment f62600b;

    cp(ProfileEditInputFragment profileEditInputFragment) {
        this.f62600b = profileEditInputFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62599a, false, 68779, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62599a, false, 68779, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ProfileEditInputFragment profileEditInputFragment = this.f62600b;
        if (profileEditInputFragment.a()) {
            profileEditInputFragment.b();
            profileEditInputFragment.dismiss();
            return;
        }
        dialogInterface.dismiss();
    }
}
