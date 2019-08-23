package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/AdDebugUtils;", "", "()V", "IS_DEBUG", "", "IS_DEBUG$annotations", "getIS_DEBUG", "()Z", "openAppLogVerifyClient", "activity", "Landroid/app/Activity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39775a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f39776b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f39777c = a.a();

    private d() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f39775a, true, 32317, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, null, f39775a, true, 32317, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (!f39777c || activity == null) {
            return false;
        } else {
            try {
                Class<?> cls = Class.forName("com.ss.android.module.verify_applog.AppLogVerifyClient");
                Method declaredMethod = cls.getDeclaredMethod("init", new Class[]{String.class, String.class, Boolean.TYPE});
                Method declaredMethod2 = cls.getDeclaredMethod("getUserOrNull", new Class[]{Context.class});
                Method declaredMethod3 = cls.getDeclaredMethod("beginVerifyAppLog", new Class[]{Activity.class, String.class});
                Method declaredMethod4 = cls.getDeclaredMethod("inst", new Class[0]);
                Method declaredMethod5 = cls.getDeclaredMethod("tryInit", new Class[]{Context.class, String.class, String.class});
                declaredMethod.invoke(null, new Object[]{"1128", "", Boolean.TRUE});
                declaredMethod3.invoke(null, new Object[]{activity, (String) declaredMethod2.invoke(null, new Object[]{activity})});
                declaredMethod5.invoke(declaredMethod4.invoke(null, new Object[0]), new Object[]{activity, "1128", ""});
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
