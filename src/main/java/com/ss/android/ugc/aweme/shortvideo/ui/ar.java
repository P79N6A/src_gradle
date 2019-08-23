package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;

public final /* synthetic */ class ar implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70778a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70779b;

    ar(VideoPublishFragment videoPublishFragment) {
        this.f70779b = videoPublishFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70778a, false, 80482, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70778a, false, 80482, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoPublishFragment videoPublishFragment = this.f70779b;
        if (!((Boolean) a.o.c().a()).booleanValue()) {
            a.o.c().a(Boolean.TRUE);
            new a.C0185a(videoPublishFragment.getContext()).a((int) C0906R.string.aij).b((int) C0906R.string.sj).a((int) C0906R.string.b4b, (DialogInterface.OnClickListener) null).a().a();
            return;
        }
        videoPublishFragment.a(true);
    }
}
