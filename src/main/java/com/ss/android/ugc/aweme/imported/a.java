package com.ss.android.ugc.aweme.imported;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52909a;

    /* renamed from: b  reason: collision with root package name */
    private final AVHashTagListAdapter f52910b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52911c;

    a(AVHashTagListAdapter aVHashTagListAdapter, int i) {
        this.f52910b = aVHashTagListAdapter;
        this.f52911c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f52909a, false, 54442, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f52909a, false, 54442, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AVHashTagListAdapter aVHashTagListAdapter = this.f52910b;
        int i = this.f52911c;
        if (aVHashTagListAdapter.f52897c != null && i >= 0 && i < aVHashTagListAdapter.f52896b.size()) {
            if (aVHashTagListAdapter.f52899e != null) {
                r.a("add_tag", new t().a("search_keyword", aVHashTagListAdapter.f52899e.keyword).a("tag_id", aVHashTagListAdapter.f52896b.get(i).f66727a.getCid()).a("log_pb", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) aVHashTagListAdapter.f52899e.logPb)).a());
            }
            aVHashTagListAdapter.f52896b.get(i);
        }
    }
}
