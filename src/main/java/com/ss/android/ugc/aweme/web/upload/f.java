package com.ss.android.ugc.aweme.web.upload;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.utils.j;
import java.util.Collection;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76906a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseUploadActivity f76907b;

    f(ImageChooseUploadActivity imageChooseUploadActivity) {
        this.f76907b = imageChooseUploadActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76906a, false, 90115, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76906a, false, 90115, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ImageChooseUploadActivity imageChooseUploadActivity = this.f76907b;
        if (PatchProxy.isSupport(new Object[0], imageChooseUploadActivity, ImageChooseUploadActivity.f76884a, false, 90106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], imageChooseUploadActivity, ImageChooseUploadActivity.f76884a, false, 90106, new Class[0], Void.TYPE);
        } else if (!j.a((Collection<T>) imageChooseUploadActivity.g) && !imageChooseUploadActivity.f76889f.h) {
            imageChooseUploadActivity.f76889f.h = true;
            imageChooseUploadActivity.f76887d.setVisibility(0);
            a.a(new g(imageChooseUploadActivity));
            imageChooseUploadActivity.a("upload_image_choose");
        }
    }
}
