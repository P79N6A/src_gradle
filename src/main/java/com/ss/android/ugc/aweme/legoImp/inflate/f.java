package com.ss.android.ugc.aweme.legoImp.inflate;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.ao;

public final /* synthetic */ class f implements ao.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53094a;

    /* renamed from: b  reason: collision with root package name */
    static final ao.a f53095b = new f();

    private f() {
    }

    public final View a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f53094a, false, 55184, new Class[]{View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view}, this, f53094a, false, 55184, new Class[]{View.class}, View.class);
        }
        c cVar = new c.a(view.getContext()).c(C0906R.string.aap).f20493a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(cVar);
        return dmtDefaultView;
    }
}
