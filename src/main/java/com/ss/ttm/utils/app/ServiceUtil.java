package com.ss.ttm.utils.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.os.UserHandle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Method;

public class ServiceUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static int getUserId() {
        int intValue;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91175, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91175, new Class[0], Integer.TYPE)).intValue();
        }
        int i = -1;
        try {
            Class<?> cls = Class.forName("android.os.Process");
            if (cls == null) {
                return -1;
            }
            Method declaredMethod = RefUtil.getDeclaredMethod((Class) cls, "myUserHandle", new Class[0]);
            if (declaredMethod != null) {
                intValue = ((Integer) RefUtil.invokeMethod((UserHandle) declaredMethod.invoke(null, new Object[0]), "getIdentifier")).intValue();
            } else {
                Class<?> cls2 = Class.forName("android.os.UserId");
                if (cls2 != null) {
                    Method declaredMethod2 = RefUtil.getDeclaredMethod((Class) cls2, "getUserId", Integer.TYPE);
                    if (declaredMethod2 != null) {
                        Integer num = (Integer) declaredMethod2.invoke(null, new Object[]{Integer.valueOf(Process.myUid())});
                        if (num != null) {
                            intValue = num.intValue();
                        }
                    }
                }
                return i;
            }
            i = intValue;
            return i;
        } catch (Exception unused) {
        }
    }

    static IBinder getActivityToken(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, changeQuickRedirect, true, 91172, new Class[]{Object.class}, IBinder.class)) {
            return (IBinder) RefUtil.invokeMethod(obj2, "getActivityToken");
        }
        return (IBinder) PatchProxy.accessDispatch(new Object[]{obj2}, null, changeQuickRedirect, true, 91172, new Class[]{Object.class}, IBinder.class);
    }

    static String getOpPackageName(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, changeQuickRedirect, true, 91173, new Class[]{Object.class}, String.class)) {
            return (String) RefUtil.invokeMethod(obj2, "getOpPackageName");
        }
        return (String) PatchProxy.accessDispatch(new Object[]{obj2}, null, changeQuickRedirect, true, 91173, new Class[]{Object.class}, String.class);
    }

    static Object getApplicatonThread(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, changeQuickRedirect, true, 91174, new Class[]{Object.class}, Object.class)) {
            return RefUtil.invokeMethod(RefUtil.getFieldValue(obj2, "mMainThread"), "getApplicationThread");
        }
        return PatchProxy.accessDispatch(new Object[]{obj2}, null, changeQuickRedirect, true, 91174, new Class[]{Object.class}, Object.class);
    }

    static Object getServiceDispatcher(Object obj, ServiceConnection serviceConnection, Context context, Handler handler, int i) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2, serviceConnection, context, handler, Integer.valueOf(i)}, null, changeQuickRedirect, true, 91171, new Class[]{Object.class, ServiceConnection.class, Context.class, Handler.class, Integer.TYPE}, Object.class)) {
            Object[] objArr = {obj2, serviceConnection, context, handler, Integer.valueOf(i)};
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 91171, new Class[]{Object.class, ServiceConnection.class, Context.class, Handler.class, Integer.TYPE}, Object.class);
        }
        Object[] objArr2 = {serviceConnection, context, handler, Integer.valueOf(i)};
        return RefUtil.invokeMethod(obj2, "getServiceDispatcher", new Class[]{ServiceConnection.class, Context.class, Handler.class, Integer.TYPE}, objArr2);
    }

    public static boolean bindService(ContextWrapper contextWrapper, Intent intent, ServiceConnection serviceConnection, int i, Handler handler) {
        Class[] clsArr;
        Method method;
        Integer num;
        ContextWrapper contextWrapper2 = contextWrapper;
        Intent intent2 = intent;
        ServiceConnection serviceConnection2 = serviceConnection;
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{contextWrapper2, intent2, serviceConnection2, Integer.valueOf(i), handler2}, null, changeQuickRedirect, true, 91176, new Class[]{ContextWrapper.class, Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class}, Boolean.TYPE)) {
            Object[] objArr = {contextWrapper2, intent2, serviceConnection2, Integer.valueOf(i), handler2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 91176, new Class[]{ContextWrapper.class, Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class}, Boolean.TYPE)).booleanValue();
        }
        Context baseContext = contextWrapper.getBaseContext();
        if (serviceConnection2 != null) {
            Object fieldValue = RefUtil.getFieldValue(baseContext, "mPackageInfo");
            if (fieldValue != null) {
                Object serviceDispatcher = getServiceDispatcher(fieldValue, serviceConnection2, contextWrapper2, handler2, i);
                try {
                    IBinder activityToken = getActivityToken(baseContext);
                    if (Build.VERSION.SDK_INT < 18) {
                        if (RefUtil.getDeclaredMethod((Object) intent2, "setAllowFds", Boolean.class) != null) {
                            RefUtil.invokeMethod(intent2, "setAllowFds", new Class[]{Boolean.class}, new Object[]{Boolean.FALSE});
                        }
                    } else if (RefUtil.getDeclaredMethod((Class) intent.getClass(), "prepareToLeaveProcess", new Class[0]) != null) {
                        RefUtil.invokeMethod(intent2, "prepareToLeaveProcess");
                    }
                    Object invoke = RefUtil.getDeclaredMethod((Class) Class.forName("android.app.ActivityManagerNative"), "getDefault", new Class[0]).invoke(null, new Object[0]);
                    if (invoke != null) {
                        Method[] declaredMethods = invoke.getClass().getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                clsArr = null;
                                method = null;
                                break;
                            }
                            method = declaredMethods[i2];
                            if (method.getName().equals("bindService")) {
                                clsArr = method.getParameterTypes();
                                break;
                            }
                            i2++;
                        }
                        if (method != null) {
                            Integer.valueOf(-1);
                            if (clsArr.length == 6) {
                                num = (Integer) method.invoke(invoke, new Object[]{getApplicatonThread(baseContext), activityToken, intent2, intent2.resolveTypeIfNeeded(baseContext.getContentResolver()), serviceDispatcher, Integer.valueOf(i)});
                            } else if (clsArr.length == 7) {
                                num = (Integer) method.invoke(invoke, new Object[]{getApplicatonThread(baseContext), activityToken, intent2, intent2.resolveTypeIfNeeded(baseContext.getContentResolver()), serviceDispatcher, Integer.valueOf(i), Integer.valueOf(getUserId())});
                            } else if (clsArr.length == 8) {
                                ContentResolver contentResolver = baseContext.getContentResolver();
                                num = (Integer) method.invoke(invoke, new Object[]{getApplicatonThread(baseContext), activityToken, intent2, intent2.resolveTypeIfNeeded(contentResolver), serviceDispatcher, Integer.valueOf(i), getOpPackageName(baseContext), Integer.valueOf(getUserId())});
                            } else {
                                throw new RuntimeException("bindService parameter is error.");
                            }
                            if (num.intValue() < 0) {
                                throw new RuntimeException("bindService is error.ret:" + num);
                            } else if (num.intValue() != 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else {
                            throw new RuntimeException("bindService method is null.");
                        }
                    } else {
                        throw new RuntimeException("avtivityManager object is null");
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(e2.getMessage());
                }
            } else {
                throw new RuntimeException("Not supported in system context");
            }
        } else {
            throw new IllegalArgumentException("connection is null");
        }
    }
}
