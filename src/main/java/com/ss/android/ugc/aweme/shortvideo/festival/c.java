package com.ss.android.ugc.aweme.shortvideo.festival;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67687a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f67688b;

    c(ImageView imageView) {
        this.f67688b = imageView;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67687a, false, 77211, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67687a, false, 77211, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f67688b.performClick();
    }
}
