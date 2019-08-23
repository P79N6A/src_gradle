package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74361a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorSelectLayout f74362b;

    /* renamed from: c  reason: collision with root package name */
    private final b f74363c;

    c(ColorSelectLayout colorSelectLayout, b bVar) {
        this.f74362b = colorSelectLayout;
        this.f74363c = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74361a, false, 86333, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74361a, false, 86333, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ColorSelectLayout colorSelectLayout = this.f74362b;
        b bVar = this.f74363c;
        colorSelectLayout.a();
        colorSelectLayout.a(view, false);
        ((b) view).f74358d = true;
        if (colorSelectLayout.f74306b != null) {
            colorSelectLayout.f74306b.a(((Integer) view.getTag()).intValue());
        }
        colorSelectLayout.f74307c.a(bVar);
    }
}
