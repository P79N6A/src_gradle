package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32154a;

    public enum a {
        SUCCESS,
        FAILURE,
        CANCEL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static void a(a aVar, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{aVar, str3, str4}, null, f32154a, true, 20177, new Class[]{a.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, str3, str4}, null, f32154a, true, 20177, new Class[]{a.class, String.class, String.class}, Void.TYPE);
            return;
        }
        switch (aVar) {
            case FAILURE:
                i = 0;
                break;
            case CANCEL:
                break;
            default:
                i = 1;
                break;
        }
        r.a("token_response", (Map) new b().a("enter_method", i.f32241a).a("enter_from", i.f32242b).a("platform", str4).a("status", i).a("fail_info", str3).a("_perf_monitor", 1).f31599b);
    }
}
