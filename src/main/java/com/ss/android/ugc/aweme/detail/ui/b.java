package com.ss.android.ugc.aweme.detail.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.f;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class b implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41366a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailActivity f41367b;

    b(DetailActivity detailActivity) {
        this.f41367b = detailActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41366a, false, 35054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41366a, false, 35054, new Class[0], Void.TYPE);
            return;
        }
        DetailActivity detailActivity = this.f41367b;
        detailActivity.f41336f = AwemeChangeCallBack.a(detailActivity);
        if (detailActivity.f41336f != null) {
            bg.a(new ar(21, detailActivity.f41336f));
        }
    }
}
