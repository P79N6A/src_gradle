package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import java.util.Locale;

public final class cf {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75678a;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f75678a, true, 88365, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75678a, true, 88365, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String appLanguage = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage();
        if (!TextUtils.isEmpty(appLanguage) && appLanguage.startsWith("zh")) {
            z = true;
        }
        return z;
    }

    public static Locale b() {
        Locale locale;
        if (PatchProxy.isSupport(new Object[0], null, f75678a, true, 88366, new Class[0], Locale.class)) {
            return (Locale) PatchProxy.accessDispatch(new Object[0], null, f75678a, true, 88366, new Class[0], Locale.class);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locale = GlobalContext.getContext().getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = GlobalContext.getContext().getResources().getConfiguration().locale;
        }
        return locale;
    }
}
