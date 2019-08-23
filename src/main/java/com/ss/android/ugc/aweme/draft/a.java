package com.ss.android.ugc.aweme.draft;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.services.IAVService;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43420a;

    /* renamed from: b  reason: collision with root package name */
    private final IAVService f43421b;

    /* renamed from: c  reason: collision with root package name */
    private final c f43422c;

    a(IAVService iAVService, c cVar) {
        this.f43421b = iAVService;
        this.f43422c = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43420a, false, 38351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43420a, false, 38351, new Class[0], Void.TYPE);
            return;
        }
        IAVService iAVService = this.f43421b;
        iAVService.draftService().notifyDraftDelete(this.f43422c);
    }
}
