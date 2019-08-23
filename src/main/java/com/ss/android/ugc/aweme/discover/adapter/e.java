package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41939a;

    /* renamed from: b  reason: collision with root package name */
    private final CoverViewHolder f41940b;

    /* renamed from: c  reason: collision with root package name */
    private final d f41941c;

    e(CoverViewHolder coverViewHolder, d dVar) {
        this.f41940b = coverViewHolder;
        this.f41941c = dVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41939a, false, 35543, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41939a, false, 35543, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CoverViewHolder coverViewHolder = this.f41940b;
        d dVar = this.f41941c;
        if (dVar != null) {
            dVar.a(view, (Aweme) coverViewHolder.g, null);
        }
    }
}
