package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.share.MyHorizontalScrollView;
import java.util.Map;

public final /* synthetic */ class u implements MyHorizontalScrollView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46068a;

    /* renamed from: b  reason: collision with root package name */
    private final d f46069b;

    /* renamed from: c  reason: collision with root package name */
    private final IShareService.ShareStruct f46070c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f46071d;

    u(d dVar, IShareService.ShareStruct shareStruct, Aweme aweme) {
        this.f46069b = dVar;
        this.f46070c = shareStruct;
        this.f46071d = aweme;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46068a, false, 40037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46068a, false, 40037, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f46069b;
        IShareService.ShareStruct shareStruct = this.f46070c;
        Aweme aweme = this.f46071d;
        if (!dVar.n) {
            dVar.n = true;
            r.a("show_dou_plus", (Map) d.a().a("enter_from", shareStruct.enterFrom).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).f34114b);
        }
    }
}
