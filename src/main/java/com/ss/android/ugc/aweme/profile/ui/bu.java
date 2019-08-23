package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bu implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62549a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverCropActivity f62550b;

    bu(ProfileCoverCropActivity profileCoverCropActivity) {
        this.f62550b = profileCoverCropActivity;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f62549a, false, 68617, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f62549a, false, 68617, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ProfileCoverCropActivity profileCoverCropActivity = this.f62550b;
        if (profileCoverCropActivity.f62087c == null) {
            profileCoverCropActivity.f62087c = profileCoverCropActivity.mCoverWindow.getVisibleRect();
            profileCoverCropActivity.mCoverImage.setDisplayWindowRect(profileCoverCropActivity.f62087c);
        }
    }
}
