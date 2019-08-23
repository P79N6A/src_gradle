package com.ss.android.ugc.aweme.web.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;

public final /* synthetic */ class h implements a.C0801a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76910a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseUploadActivity f76911b;

    h(ImageChooseUploadActivity imageChooseUploadActivity) {
        this.f76911b = imageChooseUploadActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76910a, false, 90117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76910a, false, 90117, new Class[0], Void.TYPE);
            return;
        }
        ImageChooseUploadActivity imageChooseUploadActivity = this.f76911b;
        if (imageChooseUploadActivity.f76887d != null) {
            imageChooseUploadActivity.f76887d.setVisibility(8);
        }
        imageChooseUploadActivity.finish();
    }
}
