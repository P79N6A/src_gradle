package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bb implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62506a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62507b;

    bb(MusUserProfileFragment musUserProfileFragment) {
        this.f62507b = musUserProfileFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f62506a, false, 68445, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f62506a, false, 68445, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62507b.a(dialogInterface2, i);
    }
}
