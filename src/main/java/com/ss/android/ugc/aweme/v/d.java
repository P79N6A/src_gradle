package com.ss.android.ugc.aweme.v;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.services.IMicroAppService;
import com.ttnet.org.chromium.base.ContextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75988a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f75989b = {"X-Gorgon", "X-Khronos"};

    /* renamed from: c  reason: collision with root package name */
    static boolean f75990c;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f75991d = {"iid", "device_id", "channel", "aid", "app_name", "version_code", "version_name", "device_platform", "language", "openudid", "update_version_code", "_rticket"};

    /* renamed from: e  reason: collision with root package name */
    private static boolean f75992e;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicBoolean f75993f = new AtomicBoolean(false);
    private static Handler g = new Handler(Looper.getMainLooper());
    private static int h = -1;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f75988a, true, 59765, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75988a, true, 59765, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a.a();
    }

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f75988a, true, 59762, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75988a, true, 59762, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (f75992e || f75990c) {
            return true;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        synchronized (d.class) {
            if (h < 0 && NetworkUtils.isNetworkAvailable(applicationContext)) {
                SharedPreferences a2 = c.a(applicationContext, "ttnet_lancet", 0);
                int i = a2.getInt("ttnet_lancet_check_first_user", 0);
                h = i;
                if (i <= 0) {
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putInt("ttnet_lancet_check_first_user", 1);
                    edit.commit();
                }
            }
        }
        if (h <= 0) {
            return f75990c;
        }
        f75992e = true;
        return true;
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75988a, true, 59764, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f75988a, true, 59764, new Class[]{String.class}, Void.TYPE);
        } else if (ContextUtils.getApplicationContext() != null) {
            g.post(new f(str2));
        }
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75988a, true, 59760, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f75988a, true, 59760, new Class[]{String.class}, Void.TYPE);
        } else if (a()) {
            if (PatchProxy.isSupport(new Object[0], null, f75988a, true, 59761, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f75988a, true, 59761, new Class[0], Void.TYPE);
            } else if (f75993f.compareAndSet(false, true)) {
                g.postDelayed(e.f75995b, 250000);
            }
            HttpUrl parse = HttpUrl.parse(str);
            for (String queryParameter : f75991d) {
                if (StringUtils.isEmpty(parse.queryParameter(queryParameter))) {
                    if (b()) {
                        b(f75990c + "," + f75992e + "," + h + ",url通用参数" + queryParameter + "不能为空,如果有疑问请联系易进，url=" + str2);
                    }
                    return;
                }
            }
            if (!com.ss.android.ugc.aweme.i18n.c.a() && StringUtils.isEmpty(parse.queryParameter("js_sdk_version"))) {
                IMicroAppService iMicroAppService = (IMicroAppService) ServiceManager.get().getService(IMicroAppService.class);
                boolean isMiniAppPluginInstalled = iMicroAppService.isMiniAppPluginInstalled();
                if (iMicroAppService.enableJssdkCheck() && isMiniAppPluginInstalled) {
                    b(f75990c + "," + f75992e + "," + h + ",js_sdk_versionjs_sdk_version不能为空,如果有疑问请联系赵若雷，url=" + str2);
                }
            }
        }
    }
}
