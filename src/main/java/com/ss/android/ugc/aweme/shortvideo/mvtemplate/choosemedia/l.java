package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68610a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChoosePhotoActivity f68611b;

    l(MvChoosePhotoActivity mvChoosePhotoActivity) {
        this.f68611b = mvChoosePhotoActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f68610a, false, 77968, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f68610a, false, 77968, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MvChoosePhotoActivity mvChoosePhotoActivity = this.f68611b;
        mvChoosePhotoActivity.b(true ^ mvChoosePhotoActivity.f68530e.f68523f);
    }
}
