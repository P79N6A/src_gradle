package com.ss.android.ugc.aweme.profile.ui;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;

public class ProfileDetailEditFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62133a;

    /* renamed from: b  reason: collision with root package name */
    public ProfileEditActivity.a f62134b;

    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f62133a, false, 68661, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f62133a, false, 68661, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
        }
    }
}
