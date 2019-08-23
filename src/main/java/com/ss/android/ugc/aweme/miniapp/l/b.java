package com.ss.android.ugc.aweme.miniapp.l;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55817a;

    public static int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f55817a, true, 59533, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f55817a, true, 59533, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).isMicroAppSchema(str2)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean a(Context context, Aweme aweme) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, f55817a, true, 59528, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, f55817a, true, 59528, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        } else {
            String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
            if (TextUtils.isEmpty(microAppUrl)) {
                return false;
            }
            ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(context2, microAppUrl, new b.a().c("025002").a());
            return true;
        }
    }
}
