package com.ss.android.ugc.aweme.crossplatform.business;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

public class OpenUrlHintBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40749a;

    @Keep
    public OpenUrlHintBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public final void a(OpenURLHintLayout openURLHintLayout, String str) {
        OpenURLHintLayout openURLHintLayout2 = openURLHintLayout;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{openURLHintLayout2, str2}, this, f40749a, false, 34269, new Class[]{OpenURLHintLayout.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{openURLHintLayout2, str2}, this, f40749a, false, 34269, new Class[]{OpenURLHintLayout.class, String.class}, Void.TYPE);
            return;
        }
        openURLHintLayout2.a(j.a().a(str2));
    }
}
