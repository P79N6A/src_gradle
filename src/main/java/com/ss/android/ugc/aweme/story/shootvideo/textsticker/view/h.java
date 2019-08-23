package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74385a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStickerInputLayout f74386b;

    h(TextStickerInputLayout textStickerInputLayout) {
        this.f74386b = textStickerInputLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74385a, false, 86397, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74385a, false, 86397, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TextStickerInputLayout textStickerInputLayout = this.f74386b;
        if (PatchProxy.isSupport(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86375, new Class[0], Void.TYPE);
            return;
        }
        if (textStickerInputLayout.f74323f == 2) {
            textStickerInputLayout.f74323f = 1;
        } else if (textStickerInputLayout.f74323f == 1) {
            textStickerInputLayout.f74323f = 3;
        } else if (textStickerInputLayout.f74323f == 3) {
            textStickerInputLayout.f74323f = 2;
        }
        textStickerInputLayout.a();
        textStickerInputLayout.f74320c.setAligin(textStickerInputLayout.f74323f);
        if (PatchProxy.isSupport(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86394, new Class[0], Void.TYPE);
            return;
        }
        String str = "center";
        if (textStickerInputLayout.f74323f == 2) {
            str = "center";
        } else if (textStickerInputLayout.f74323f == 1) {
            str = "left";
        } else if (textStickerInputLayout.f74323f == 3) {
            str = "right";
        }
        if (textStickerInputLayout.r != null) {
            textStickerInputLayout.r.a(str);
        }
    }
}
