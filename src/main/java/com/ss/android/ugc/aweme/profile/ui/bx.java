package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter;

public final /* synthetic */ class bx implements ProfileCoverAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62555a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverLibActivity f62556b;

    bx(ProfileCoverLibActivity profileCoverLibActivity) {
        this.f62556b = profileCoverLibActivity;
    }

    public final void a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f62555a, false, 68637, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, f62555a, false, 68637, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        ProfileCoverLibActivity profileCoverLibActivity = this.f62556b;
        if (!TextUtils.isEmpty(urlModel.getUri())) {
            profileCoverLibActivity.mStatusView.d();
            profileCoverLibActivity.f62106b.a(urlModel.getUri(), 3);
        }
    }
}
