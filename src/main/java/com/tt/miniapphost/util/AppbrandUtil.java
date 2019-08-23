package com.tt.miniapphost.util;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@AnyProcess
public class AppbrandUtil {

    public interface GetUidByOpenIdListener {
        void onFail(int i, String str);

        void onSuccess(String str);
    }

    public static class GetUidListenerHandler implements InvocationHandler {
        private GetUidByOpenIdListener mListener;

        public GetUidListenerHandler(GetUidByOpenIdListener getUidByOpenIdListener) {
            this.mListener = getUidByOpenIdListener;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("onSuccess".equals(method.getName())) {
                this.mListener.onSuccess(objArr[0]);
            } else {
                this.mListener.onFail(objArr[0].intValue(), objArr[1]);
            }
            return null;
        }
    }

    public static String getCurrentDeviceFlag() {
        return Build.BRAND + "-" + Build.MODEL;
    }

    @AnyProcess
    public static File getAppServiceDir(Context context) {
        return new File(getAppbrandBaseFile(context), "__dev__/");
    }

    @AnyProcess
    public static File getAppbrandBaseFile(Context context) {
        return new File(context.getFilesDir(), "appbrand");
    }

    public static int getIntFromStr(String[] strArr) {
        int i = 0;
        if (strArr == null || strArr.length <= 0) {
            return 0;
        }
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArr.length) {
            try {
                i3 += (Integer.parseInt(strArr[i2]) * ((int) Math.pow(100.0d, (double) (length - 1)))) / ((int) Math.pow(100.0d, (double) i2));
                i2++;
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "AppbrandUtil", e2.getStackTrace());
            }
        }
        i = i3;
        return i;
    }

    public static void handleAppbrandDisableState(@NonNull Context context, @NonNull DisableStateEntity disableStateEntity) {
        if (TextUtils.isEmpty(disableStateEntity.getHintUrl())) {
            HostDependManager.getInst().showToast(context, null, disableStateEntity.getHintMessage(), 1, null);
        } else {
            HostDependManager.getInst().jumpToWebView(context, disableStateEntity.getHintUrl(), "", true);
        }
        AppBrandLogger.e("AppbrandUtil", "handleAppbrandDisableState: " + disableStateEntity.getHintMessage());
    }

    public static void sdkVersionIntToStr(@NonNull StringBuilder sb, long j, int i) {
        while (i >= 0) {
            double d2 = (double) i;
            sb.append(String.valueOf(j / ((long) ((int) Math.pow(100.0d, d2)))));
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            j %= (long) ((int) Math.pow(100.0d, d2));
            i--;
        }
    }

    public static void getUidByOpenId(Context context, String str, String str2, GetUidByOpenIdListener getUidByOpenIdListener) {
        try {
            GetUidListenerHandler getUidListenerHandler = new GetUidListenerHandler(getUidByOpenIdListener);
            Class<?> cls = Class.forName("com.tt.miniapp.util.UserInfoUtil");
            Class<?> cls2 = Class.forName("com.tt.miniapp.util.UserInfoUtil$GetUidListener");
            Object newProxyInstance = Proxy.newProxyInstance(GetUidListenerHandler.class.getClassLoader(), new Class[]{cls2}, getUidListenerHandler);
            cls.getDeclaredMethod("getUid", new Class[]{Context.class, String.class, String.class, cls2}).invoke(null, new Object[]{context, str, str2, newProxyInstance});
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "AppbrandUtil", e2.getStackTrace());
        }
    }
}
