package com.ss.android.ugc.aweme.web.upload;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76904a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseUploadActivity f76905b;

    e(ImageChooseUploadActivity imageChooseUploadActivity) {
        this.f76905b = imageChooseUploadActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76904a, false, 90114, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76904a, false, 90114, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ImageChooseUploadActivity imageChooseUploadActivity = this.f76905b;
        if (ImageChooseUploadActivity.h != null) {
            ImageChooseUploadActivity.h.a();
        }
        imageChooseUploadActivity.finish();
        imageChooseUploadActivity.a("cancel_image_choose");
    }
}
