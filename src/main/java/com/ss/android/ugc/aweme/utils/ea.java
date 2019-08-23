package com.ss.android.ugc.aweme.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J$\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/StatusBarFontTool;", "", "()V", "setMiuiStatusBarDarkMode", "", "darkmode", "", "window", "Landroid/view/Window;", "trySetStatusBar", "activity", "Landroid/app/Activity;", "useDarkMode", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ea {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75805a;

    /* renamed from: b  reason: collision with root package name */
    public static final ea f75806b = new ea();

    private ea() {
    }

    @SuppressLint({"PrivateApi"})
    private final void a(boolean z, Window window) {
        int i;
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), window2}, this, f75805a, false, 88563, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), window2}, this, f75805a, false, 88563, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE);
            return;
        }
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window2, objArr);
        } catch (Throwable unused) {
        }
    }

    @TargetApi(23)
    public final void a(@Nullable Activity activity, @Nullable Window window, boolean z) {
        Activity activity2 = activity;
        Window window2 = window;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{activity2, window2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f75805a, false, 88562, new Class[]{Activity.class, Window.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, window2, Byte.valueOf(z)}, this, f75805a, false, 88562, new Class[]{Activity.class, Window.class, Boolean.TYPE}, Void.TYPE);
        } else if (activity2 == null || window2 == null) {
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    Intrinsics.checkExpressionValueIsNotNull(decorView, "decorView");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (!z2) {
                        decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                    }
                    window2.clearFlags(67108864);
                    window2.addFlags(Integer.MIN_VALUE);
                }
                if (OSUtils.isMIUI6Later()) {
                    try {
                        a(z2, window2);
                    } catch (Throwable unused) {
                    }
                }
                if (OSUtils.isFlymeOS4Later()) {
                    FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(activity2, z2);
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
