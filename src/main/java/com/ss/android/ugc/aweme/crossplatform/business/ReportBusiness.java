package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.utils.t;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.report.a;
import java.util.Map;

public class ReportBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40753a;

    @Keep
    ReportBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public final void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f40753a, false, 34276, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f40753a, false, 34276, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Aweme a2 = j.a().a(this.i.f40805a.k);
        a.a((Map<String, String>) t.a(a2, "homepage_hot"));
        a.a(activity2, t.a(a2, "landing_page", "ad"));
    }
}
