package com.ss.android.ugc.aweme.poi.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.adapter.RecommendImageAdapter;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59484a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendImageAdapter.CoverViewHolder f59485b;

    /* renamed from: c  reason: collision with root package name */
    private final int f59486c;

    e(RecommendImageAdapter.CoverViewHolder coverViewHolder, int i) {
        this.f59485b = coverViewHolder;
        this.f59486c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59484a, false, 64782, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59484a, false, 64782, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        RecommendImageAdapter.CoverViewHolder coverViewHolder = this.f59485b;
        int i = this.f59486c;
        if (coverViewHolder.f59453e != null) {
            coverViewHolder.f59453e.a(i);
        }
    }
}
