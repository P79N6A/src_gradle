package com.ss.android.ugc.aweme.main;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.legoImp.service.DouDouService;
import com.ss.android.ugc.aweme.main.page.PageManager;

public final /* synthetic */ class n implements PageManager.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54857a;

    /* renamed from: b  reason: collision with root package name */
    private final DouDouService f54858b;

    n(DouDouService douDouService) {
        this.f54858b = douDouService;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54857a, false, 57204, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54857a, false, 57204, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f54858b.enableDouDetection(!TextUtils.equals(str2, "page_profile"));
    }
}
