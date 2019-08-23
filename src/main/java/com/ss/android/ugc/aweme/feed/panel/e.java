package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45723a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f45724b;

    /* renamed from: c  reason: collision with root package name */
    private final p f45725c;

    e(Aweme aweme, p pVar) {
        this.f45724b = aweme;
        this.f45725c = pVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f45723a, false, 41737, new Class[0], Object.class)) {
            return BaseListFragmentPanel.a(this.f45724b, this.f45725c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f45723a, false, 41737, new Class[0], Object.class);
    }
}
