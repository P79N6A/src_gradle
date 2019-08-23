package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ba implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62503a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62504b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62505c;

    ba(MusUserProfileFragment musUserProfileFragment, View view) {
        this.f62504b = musUserProfileFragment;
        this.f62505c = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62503a, false, 68444, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62503a, false, 68444, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62504b.f(this.f62505c);
    }
}
