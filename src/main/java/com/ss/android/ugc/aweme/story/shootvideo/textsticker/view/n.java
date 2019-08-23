package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.j;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74397a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStickerInputLayout f74398b;

    n(TextStickerInputLayout textStickerInputLayout) {
        this.f74398b = textStickerInputLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74397a, false, 86403, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74397a, false, 86403, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TextStickerInputLayout textStickerInputLayout = this.f74398b;
        j.a().b();
        textStickerInputLayout.l.setBackground(bc.a(j.a().c().f74253a));
        if (textStickerInputLayout.j != null) {
            textStickerInputLayout.j.a(false);
        }
    }
}
