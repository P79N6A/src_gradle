package com.ss.android.ugc.aweme.web.upload;

import android.view.View;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter;

public final /* synthetic */ class c implements ImageChooseAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76900a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseUploadActivity f76901b;

    c(ImageChooseUploadActivity imageChooseUploadActivity) {
        this.f76901b = imageChooseUploadActivity;
    }

    public final void a(View view, String str) {
        if (PatchProxy.isSupport(new Object[]{view, str}, this, f76900a, false, 90112, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, str}, this, f76900a, false, 90112, new Class[]{View.class, String.class}, Void.TYPE);
            return;
        }
        ImageChooseUploadActivity imageChooseUploadActivity = this.f76901b;
        if (!StringUtils.isEmpty(str)) {
            HeaderDetailActivity.a(imageChooseUploadActivity, view, (((float) UIUtils.getScreenWidth(imageChooseUploadActivity)) * 1.0f) / ((float) UIUtils.getScreenHeight(imageChooseUploadActivity)), null, false, null, str);
        }
    }
}
