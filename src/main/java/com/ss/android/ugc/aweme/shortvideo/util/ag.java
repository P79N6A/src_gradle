package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.medialib.f.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.au;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.lang.reflect.Field;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71103a;

    @MeasureFunction
    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f71103a, true, 81035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f71103a, true, 81035, new Class[0], Void.TYPE);
            return;
        }
        au.a(ff.f67717f, ff.s, ff.w, ff.f67713b, ff.f67714c);
        if (TextUtils.equals(Build.BRAND, "Xiaomi") && !a("android.content.res.MiuiResourcesImpl", "sMiuiThemeEnabled", false)) {
            a("android.content.res.MiuiResources", "sMiuiThemeEnabled", false);
        }
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f71103a, true, 81038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f71103a, true, 81038, new Class[0], Void.TYPE);
            return;
        }
        a();
        e eVar = new e();
        Context context = GlobalContext.getContext();
        for (int a2 : ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getZipBeautyFaceResIds()) {
            eVar.a(context, a2, ff.w);
        }
        eVar.a(context, (int) C0906R.raw.facereshape_v2, ff.w);
    }

    private static boolean a(String str, String str2, boolean z) {
        String str3 = str2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{str, str3, (byte) 0}, null, f71103a, true, 81036, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3, (byte) 0}, null, f71103a, true, 81036, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            try {
                Field declaredField = Class.forName(str).getDeclaredField(str3);
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(null, false);
                    z2 = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            }
            return z2;
        }
    }
}
