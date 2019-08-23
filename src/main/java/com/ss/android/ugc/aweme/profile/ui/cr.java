package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cr implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62603a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditInputFragment f62604b;

    cr(ProfileEditInputFragment profileEditInputFragment) {
        this.f62604b = profileEditInputFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f62603a, false, 68781, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f62603a, false, 68781, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        ProfileEditInputFragment profileEditInputFragment = this.f62604b;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        profileEditInputFragment.f();
        return true;
    }
}
