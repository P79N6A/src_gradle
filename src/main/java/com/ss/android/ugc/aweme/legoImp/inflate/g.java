package com.ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.ao;

public final /* synthetic */ class g implements ao.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53096a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f53097b;

    /* renamed from: c  reason: collision with root package name */
    private final View.OnClickListener f53098c;

    g(Context context, View.OnClickListener onClickListener) {
        this.f53097b = context;
        this.f53098c = onClickListener;
    }

    public final View a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f53096a, false, 55185, new Class[]{View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view}, this, f53096a, false, 55185, new Class[]{View.class}, View.class);
        }
        Context context = this.f53097b;
        c cVar = new c.a(context).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(a.BORDER, C0906R.string.dms, this.f53098c).f20493a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(cVar);
        return dmtDefaultView;
    }
}
