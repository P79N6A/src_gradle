package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditSignatureFragment;

public final /* synthetic */ class ck implements ProfileEditSignatureFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62590a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditFragment f62591b;

    ck(ProfileEditFragment profileEditFragment) {
        this.f62591b = profileEditFragment;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62590a, false, 68739, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62590a, false, 68739, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ProfileEditFragment profileEditFragment = this.f62591b;
        if (PatchProxy.isSupport(new Object[]{str2}, profileEditFragment, ProfileEditFragment.f62137a, false, 68685, new Class[]{String.class}, Boolean.TYPE)) {
            ProfileEditFragment profileEditFragment2 = profileEditFragment;
            ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, profileEditFragment2, ProfileEditFragment.f62137a, false, 68685, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.equals(str2, d.a().getCurUser().getSignature())) {
            if (PatchProxy.isSupport(new Object[]{str2}, profileEditFragment, ProfileEditFragment.f62137a, false, 68686, new Class[]{String.class}, String.class)) {
                ProfileEditFragment profileEditFragment3 = profileEditFragment;
                str2 = (String) PatchProxy.accessDispatch(new Object[]{str2}, profileEditFragment3, ProfileEditFragment.f62137a, false, 68686, new Class[]{String.class}, String.class);
            } else {
                while (str2.contains("\n\n")) {
                    str2 = str2.replaceAll("\n\n", "\n");
                }
            }
            int length = str2.length() - 1;
            if (length >= 0 && str2.charAt(length) == 10) {
                str2 = str2.substring(0, length);
            }
            profileEditFragment.j.setSignature(str2);
            profileEditFragment.f62141e.b(str2);
            profileEditFragment.mDmtStatusView.d();
        } else {
            profileEditFragment.g.f61676f = null;
        }
    }
}
