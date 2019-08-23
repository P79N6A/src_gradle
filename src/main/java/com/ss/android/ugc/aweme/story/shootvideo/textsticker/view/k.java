package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74391a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStickerInputLayout f74392b;

    k(TextStickerInputLayout textStickerInputLayout) {
        this.f74392b = textStickerInputLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74391a, false, 86400, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74391a, false, 86400, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TextStickerInputLayout textStickerInputLayout = this.f74392b;
        if (textStickerInputLayout.s != null) {
            textStickerInputLayout.s.a(true);
        }
        if (textStickerInputLayout.r != null) {
            textStickerInputLayout.r.a();
        }
    }
}
