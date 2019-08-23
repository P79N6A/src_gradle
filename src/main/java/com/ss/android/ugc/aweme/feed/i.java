package com.ss.android.ugc.aweme.feed;

import android.support.design.widget.BottomSheetDialog;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.cg;

public final /* synthetic */ class i implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45552a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45553b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45554c;

    /* renamed from: d  reason: collision with root package name */
    private final BottomSheetDialog f45555d;

    i(d dVar, Aweme aweme, BottomSheetDialog bottomSheetDialog) {
        this.f45553b = dVar;
        this.f45554c = aweme;
        this.f45555d = bottomSheetDialog;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45552a, false, 40025, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45552a, false, 40025, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f45553b.a(this.f45554c, this.f45555d, aVar);
    }
}
