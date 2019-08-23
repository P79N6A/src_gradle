package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment;

public final /* synthetic */ class ce implements ProfileEditNicknameFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62573a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditFragment f62574b;

    ce(ProfileEditFragment profileEditFragment) {
        this.f62574b = profileEditFragment;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62573a, false, 68733, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62573a, false, 68733, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f62574b.b(str2);
    }
}
