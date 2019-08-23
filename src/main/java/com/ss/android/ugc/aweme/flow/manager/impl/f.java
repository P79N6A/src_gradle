package com.ss.android.ugc.aweme.flow.manager.impl;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47700a;

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f47701b = Pattern.compile("[0-9]*");

    private static String b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f47700a, true, 44503, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f47700a, true, 44503, new Class[]{Context.class}, String.class);
        }
        try {
            return ((TelephonyManager) context2.getSystemService("phone")).getSubscriberId();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Context context) {
        String str;
        Method method;
        boolean z;
        boolean z2;
        TelephonyManager telephonyManager;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f47700a, true, 44502, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f47700a, true, 44502, new Class[]{Context.class}, String.class);
        }
        String str2 = "";
        int i = Build.VERSION.SDK_INT;
        try {
            Class<?> cls = Class.forName("android.telephony.SubscriptionManager");
            if (i >= 24) {
                method = cls.getMethod("getDefaultDataSubscriptionId", new Class[0]);
            } else {
                method = cls.getMethod("getDefaultDataSubId", new Class[0]);
            }
            method.setAccessible(true);
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke instanceof Long) {
                z = true;
            } else if (!(invoke instanceof Integer)) {
                return b(context);
            } else {
                z = false;
            }
            Object obj = null;
            TelephonyManager telephonyManager2 = (TelephonyManager) context2.getSystemService("phone");
            if (i >= 24) {
                if (!z) {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("createForSubscriptionId", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    telephonyManager = (TelephonyManager) declaredMethod.invoke(telephonyManager2, new Object[]{(Integer) invoke});
                } else {
                    Method declaredMethod2 = TelephonyManager.class.getDeclaredMethod("createForSubscriptionId", new Class[]{Long.TYPE});
                    declaredMethod2.setAccessible(true);
                    telephonyManager = (TelephonyManager) declaredMethod2.invoke(telephonyManager2, new Object[]{(Long) invoke});
                }
                str2 = telephonyManager.getSubscriberId();
            } else if (!z) {
                Method declaredMethod3 = TelephonyManager.class.getDeclaredMethod("getSubscriberId", new Class[]{Integer.TYPE});
                declaredMethod3.setAccessible(true);
                obj = declaredMethod3.invoke(telephonyManager2, new Object[]{(Integer) invoke});
            } else {
                Method declaredMethod4 = TelephonyManager.class.getDeclaredMethod("getSubscriberId", new Class[]{Long.TYPE});
                declaredMethod4.setAccessible(true);
                obj = declaredMethod4.invoke(telephonyManager2, new Object[]{(Long) invoke});
            }
            if (obj != null) {
                str2 = obj.toString();
            }
            if (PatchProxy.isSupport(new Object[]{str2}, null, f47700a, true, 44504, new Class[]{String.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f47700a, true, 44504, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (str2 != null) {
                    if (!"".equals(str2)) {
                        z2 = f47701b.matcher(str2).matches();
                    }
                }
                z2 = false;
            }
            if (!z2 || str2 == null) {
                str2 = "";
            }
            if (str2.length() > 15) {
                str = str2.substring(0, 15);
            } else {
                if (str2.length() > 0 && str2.length() < 15) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i2 = 0; i2 < 15 - str2.length(); i2++) {
                        stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    str = str2 + stringBuffer.toString();
                }
                str = str2;
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            return b(context);
        }
        return str;
    }
}
