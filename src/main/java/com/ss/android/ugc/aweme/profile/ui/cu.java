package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditLocationFragment;

public final /* synthetic */ class cu implements ProfileEditLocationFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62609a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditLocationFragment f62610b;

    cu(ProfileEditLocationFragment profileEditLocationFragment) {
        this.f62610b = profileEditLocationFragment;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f62609a, false, 68790, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f62609a, false, 68790, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ProfileEditLocationFragment profileEditLocationFragment = this.f62610b;
        if (profileEditLocationFragment.h != null) {
            profileEditLocationFragment.h.a(profileEditLocationFragment.f62203e);
        }
        profileEditLocationFragment.dismiss();
    }
}
