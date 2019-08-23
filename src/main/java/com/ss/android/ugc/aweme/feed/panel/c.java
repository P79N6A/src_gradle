package com.ss.android.ugc.aweme.feed.panel;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45715a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseListFragmentPanel f45716b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45717c;

    /* renamed from: d  reason: collision with root package name */
    private final String f45718d;

    /* renamed from: e  reason: collision with root package name */
    private final String f45719e;

    /* renamed from: f  reason: collision with root package name */
    private final ar f45720f;

    c(BaseListFragmentPanel baseListFragmentPanel, Aweme aweme, String str, String str2, ar arVar) {
        this.f45716b = baseListFragmentPanel;
        this.f45717c = aweme;
        this.f45718d = str;
        this.f45719e = str2;
        this.f45720f = arVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45715a, false, 41734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45715a, false, 41734, new Class[0], Void.TYPE);
            return;
        }
        this.f45716b.a(this.f45717c, this.f45718d, this.f45719e, this.f45720f);
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f45715a, false, 41735, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f45715a, false, 41735, new Class[]{Bundle.class}, Void.TYPE);
        }
    }
}
