package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class az implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62498a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62499b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62500c;

    az(MusUserProfileFragment musUserProfileFragment, View view) {
        this.f62499b = musUserProfileFragment;
        this.f62500c = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62498a, false, 68443, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62498a, false, 68443, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62499b.g(this.f62500c);
    }
}
