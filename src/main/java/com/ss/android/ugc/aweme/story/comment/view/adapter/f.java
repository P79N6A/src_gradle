package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.base.b.a;
import java.util.Map;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72294a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewerListViewHolder f72295b;

    f(ViewerListViewHolder viewerListViewHolder) {
        this.f72295b = viewerListViewHolder;
    }

    public final void onClick(View view) {
        String str;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f72294a, false, 83006, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72294a, false, 83006, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ViewerListViewHolder viewerListViewHolder = this.f72295b;
        if (!com.ss.android.ugc.aweme.story.base.utils.f.a(view) && !viewerListViewHolder.t.b()) {
            a a2 = new a().a("enter_from", "view_board").a("enter_method", "click_head").a("group_id", viewerListViewHolder.f72264b.o);
            if (viewerListViewHolder.o == null) {
                str = "";
            } else {
                str = viewerListViewHolder.o.getCurrentUserID();
            }
            a a3 = a2.a("author_id", str).a("to_user_id", viewerListViewHolder.n.getUid());
            int i = viewerListViewHolder.f72264b.q;
            if (PatchProxy.isSupport(new Object[]{"relation_type", Integer.valueOf(i)}, a3, a.f71924a, false, 82252, new Class[]{String.class, Integer.TYPE}, a.class)) {
                a aVar2 = a3;
                aVar = (a) PatchProxy.accessDispatch(new Object[]{"relation_type", Integer.valueOf(i)}, aVar2, a.f71924a, false, 82252, new Class[]{String.class, Integer.TYPE}, a.class);
            } else {
                aVar = a3.a("relation_type", String.valueOf(i), a.C0750a.f71926a);
            }
            r.a("enter_personal_detail", (Map) aVar.a("log_pb", viewerListViewHolder.f72264b.p).f71925b);
            viewerListViewHolder.s = (d) ServiceManager.get().getService(d.class);
            if (viewerListViewHolder.s != null && !TextUtils.isEmpty(viewerListViewHolder.n.getUid())) {
                viewerListViewHolder.s.a(view.getContext(), viewerListViewHolder.n.getUid(), viewerListViewHolder.n.getSecUid());
            }
        }
    }
}
