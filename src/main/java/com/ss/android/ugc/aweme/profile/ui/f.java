package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62744a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeListFragment f62745b;

    /* renamed from: c  reason: collision with root package name */
    private final IDraftService f62746c;

    f(AwemeListFragment awemeListFragment, IDraftService iDraftService) {
        this.f62745b = awemeListFragment;
        this.f62746c = iDraftService;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f62744a, false, 67809, new Class[0], Object.class)) {
            return this.f62745b.a(this.f62746c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f62744a, false, 67809, new Class[0], Object.class);
    }
}
