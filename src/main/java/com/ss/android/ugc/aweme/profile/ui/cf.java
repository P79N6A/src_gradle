package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditIdFragment;
import com.ss.android.ugc.aweme.utils.cc;

public final /* synthetic */ class cf implements ProfileEditIdFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62575a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditFragment f62576b;

    cf(ProfileEditFragment profileEditFragment) {
        this.f62576b = profileEditFragment;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62575a, false, 68734, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62575a, false, 68734, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ProfileEditFragment profileEditFragment = this.f62576b;
        if (PatchProxy.isSupport(new Object[]{str2}, profileEditFragment, ProfileEditFragment.f62137a, false, 68697, new Class[]{String.class}, Integer.TYPE)) {
            ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, profileEditFragment, ProfileEditFragment.f62137a, false, 68697, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else {
            User curUser = d.a().getCurUser();
            if (str2.equals(TextUtils.isEmpty(curUser.getUniqueId()) ? curUser.getShortId() : curUser.getUniqueId())) {
                profileEditFragment.g.g = "";
            } else if (cc.a(str2, profileEditFragment.getContext())) {
                ad adVar = profileEditFragment.f62141e;
                if (PatchProxy.isSupport(new Object[]{str2}, adVar, ad.f61573a, false, 67635, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, adVar, ad.f61573a, false, 67635, new Class[]{String.class}, Void.TYPE);
                } else if (!adVar.f61576d) {
                    adVar.f61576d = true;
                    d.a().updateId(adVar.g, str2);
                }
                profileEditFragment.mDmtStatusView.d();
                profileEditFragment.j.setUniqueId(str2);
            } else {
                profileEditFragment.c();
                profileEditFragment.g.g = "";
            }
        }
    }
}
