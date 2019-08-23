package com.ss.android.ugc.aweme.qrcode.b;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.qrcode.b.a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

public final class d extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63352c;

    public d(a.C0684a aVar) {
        super(aVar);
    }

    public final boolean a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f63352c, false, 70406, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f63352c, false, 70406, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Activity e2 = p.a().e();
        try {
            str2 = URLDecoder.decode(str2, "UTF8");
        } catch (UnsupportedEncodingException unused) {
        }
        if (e2 == null) {
            return false;
        }
        boolean openMiniApp = ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(e2, str2, new b.a().b("scan").c("021002").a());
        if (openMiniApp) {
            r.a("enter_microapp", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "scan").a("enter_method", "scan_cam").a("microapp_id", k.b(str2, "app_id")).f34114b);
        }
        return openMiniApp;
    }
}
