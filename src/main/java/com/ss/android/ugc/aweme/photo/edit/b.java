package com.ss.android.ugc.aweme.photo.edit;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58532a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoEditActivity f58533b;

    b(PhotoEditActivity photoEditActivity) {
        this.f58533b = photoEditActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58532a, false, 63630, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58532a, false, 63630, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f58533b.f();
    }
}
