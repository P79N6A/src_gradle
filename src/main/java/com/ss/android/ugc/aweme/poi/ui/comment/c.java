package com.ss.android.ugc.aweme.poi.ui.comment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.o;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60615a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCommentPresenter f60616b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.poi.c f60617c;

    /* renamed from: d  reason: collision with root package name */
    private final o f60618d;

    public c(PoiCommentPresenter poiCommentPresenter, com.ss.android.ugc.aweme.poi.c cVar, o oVar) {
        this.f60616b = poiCommentPresenter;
        this.f60617c = cVar;
        this.f60618d = oVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60615a, false, 66287, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60615a, false, 66287, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiCommentPresenter poiCommentPresenter = this.f60616b;
        com.ss.android.ugc.aweme.poi.c cVar = this.f60617c;
        o oVar = this.f60618d;
        h.a(cVar, "outer_section_click", d.a().a("enter_from", "poi_page").a("previous_page", cVar.getPreviousPage()).a("poi_id", cVar.getPoiId()).a("poi_channel", cVar.getPoiChannel()));
        oVar.setPoiId(cVar.getPoiId());
        PoiCommentDetailActivity.a(poiCommentPresenter.f60581c, oVar, cVar);
    }
}
