package com.ss.android.ugc.aweme.web.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76908a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseUploadActivity f76909b;

    g(ImageChooseUploadActivity imageChooseUploadActivity) {
        this.f76909b = imageChooseUploadActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f76908a, false, 90116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76908a, false, 90116, new Class[0], Void.TYPE);
            return;
        }
        ImageChooseUploadActivity imageChooseUploadActivity = this.f76909b;
        if (ImageChooseUploadActivity.h != null) {
            ImageChooseUploadActivity.h.a(imageChooseUploadActivity.g, new h(imageChooseUploadActivity));
        }
    }
}
