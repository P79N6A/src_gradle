package com.ss.android.ugc.aweme.legoImp.inflate;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.ao;

public final /* synthetic */ class e implements ao.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53092a;

    /* renamed from: b  reason: collision with root package name */
    static final ao.a f53093b = new e();

    private e() {
    }

    public final View a(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, f53092a, false, 55183, new Class[]{View.class}, View.class)) {
            return new DmtLoadingLayout(view.getContext());
        }
        return (View) PatchProxy.accessDispatch(new Object[]{view}, this, f53092a, false, 55183, new Class[]{View.class}, View.class);
    }
}
