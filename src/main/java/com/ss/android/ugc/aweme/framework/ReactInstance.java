package com.ss.android.ugc.aweme.framework;

import android.app.Application;
import android.text.TextUtils;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.b.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReactInstance {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static boolean isDev = false;
    private static Application mApplication;
    private static a mConfig;
    private static Map<String, a> mDevReactNativeHostMap = new HashMap();
    private static a mPreparedReactNativeHost;
    private static d mProxy;
    private static Map<String, a> mReactNativeHostMap = new HashMap();
    private static Set<com.ss.android.ugc.aweme.framework.activity.a> mReactViews = new HashSet();

    private ReactInstance() {
    }

    public static a getConfig() {
        return mConfig;
    }

    public static d getProxy() {
        return mProxy;
    }

    public static Map<String, a> getHostMap() {
        if (isDev) {
            return mDevReactNativeHostMap;
        }
        return mReactNativeHostMap;
    }

    public static void rePrepareReactContext() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 45834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 45834, new Class[0], Void.TYPE);
            return;
        }
        mPreparedReactNativeHost = null;
        invokePreparedReactContext();
    }

    public static void invokePreparedReactContext() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 45835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 45835, new Class[0], Void.TYPE);
        } else if (mConfig.b() && !TextUtils.isEmpty(mProxy.a())) {
            if (mPreparedReactNativeHost == null) {
                if (isDev) {
                    aVar = new b(mApplication);
                } else {
                    aVar = new a(mApplication);
                }
                mPreparedReactNativeHost = aVar;
            }
            ReactInstanceManager reactInstanceManager = mPreparedReactNativeHost.getReactInstanceManager();
            if (reactInstanceManager.getCurrentReactContext() == null && !reactInstanceManager.hasStartedCreatingInitialContext()) {
                reactInstanceManager.createReactContextInBackground();
            }
        }
    }

    public static void attachReactView(com.ss.android.ugc.aweme.framework.activity.a aVar) {
        com.ss.android.ugc.aweme.framework.activity.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, changeQuickRedirect, true, 45841, new Class[]{com.ss.android.ugc.aweme.framework.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, changeQuickRedirect, true, 45841, new Class[]{com.ss.android.ugc.aweme.framework.activity.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            mReactViews.add(aVar2);
        }
    }

    public static ReactInstanceManager getReactInstanceManager(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 45838, new Class[]{String.class}, ReactInstanceManager.class)) {
            return getReactNativeHost(str).getReactInstanceManager();
        }
        return (ReactInstanceManager) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 45838, new Class[]{String.class}, ReactInstanceManager.class);
    }

    public static com.ss.android.ugc.aweme.framework.activity.a getReactViewById(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 45843, new Class[]{String.class}, com.ss.android.ugc.aweme.framework.activity.a.class)) {
            return (com.ss.android.ugc.aweme.framework.activity.a) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 45843, new Class[]{String.class}, com.ss.android.ugc.aweme.framework.activity.a.class);
        }
        for (com.ss.android.ugc.aweme.framework.activity.a next : mReactViews) {
            if (next.a(str2)) {
                return next;
            }
        }
        return null;
    }

    private static void recycleReactNativeHost(String str) {
        Map<String, a> map;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 45840, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 45840, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (isDev) {
            map = mDevReactNativeHostMap;
        } else {
            map = mReactNativeHostMap;
        }
        a aVar = map.get(str2);
        if (aVar != null) {
            aVar.clear();
            map.remove(str2);
        }
    }

    public static a getReactNativeHost(String str) {
        Map<String, a> map;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 45839, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 45839, new Class[]{String.class}, a.class);
        }
        if (isDev) {
            map = mDevReactNativeHostMap;
        } else {
            map = mReactNativeHostMap;
        }
        a aVar = map.get(str2);
        if (aVar == null) {
            if (mConfig.b()) {
                aVar = mPreparedReactNativeHost;
                if (aVar != null) {
                    mPreparedReactNativeHost = null;
                } else if (isDev) {
                    aVar = new b(mApplication);
                } else {
                    aVar = new a(mApplication);
                }
            } else if (isDev) {
                aVar = new b(mApplication);
            } else {
                aVar = new a(mApplication);
            }
            map.put(str2, aVar);
            aVar.f48453d = str2;
        }
        return aVar;
    }

    public static void detachReactView(com.ss.android.ugc.aweme.framework.activity.a aVar, String str) {
        com.ss.android.ugc.aweme.framework.activity.a aVar2 = aVar;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, null, changeQuickRedirect, true, 45842, new Class[]{com.ss.android.ugc.aweme.framework.activity.a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2}, null, changeQuickRedirect, true, 45842, new Class[]{com.ss.android.ugc.aweme.framework.activity.a.class, String.class}, Void.TYPE);
        } else if (aVar2 != null) {
            mReactViews.remove(aVar2);
            Iterator<com.ss.android.ugc.aweme.framework.activity.a> it2 = mReactViews.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (TextUtils.equals(it2.next().getReactId(), str2)) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!TextUtils.isEmpty(str) && z) {
                recycleReactNativeHost(str);
            }
        }
    }

    public static ReactInstanceManager getReactInstanceManager(String str, RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        if (!PatchProxy.isSupport(new Object[]{str, rNDegradeExceptionHandler}, null, changeQuickRedirect, true, 45836, new Class[]{String.class, RNDegradeExceptionHandler.class}, ReactInstanceManager.class)) {
            return getReactNativeHost(str, rNDegradeExceptionHandler).getReactInstanceManager();
        }
        return (ReactInstanceManager) PatchProxy.accessDispatch(new Object[]{str, rNDegradeExceptionHandler}, null, changeQuickRedirect, true, 45836, new Class[]{String.class, RNDegradeExceptionHandler.class}, ReactInstanceManager.class);
    }

    public static a getReactNativeHost(String str, RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        Map<String, a> map;
        String str2 = str;
        RNDegradeExceptionHandler rNDegradeExceptionHandler2 = rNDegradeExceptionHandler;
        if (PatchProxy.isSupport(new Object[]{str2, rNDegradeExceptionHandler2}, null, changeQuickRedirect, true, 45837, new Class[]{String.class, RNDegradeExceptionHandler.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2, rNDegradeExceptionHandler2}, null, changeQuickRedirect, true, 45837, new Class[]{String.class, RNDegradeExceptionHandler.class}, a.class);
        }
        if (isDev) {
            map = mDevReactNativeHostMap;
        } else {
            map = mReactNativeHostMap;
        }
        a aVar = map.get(str2);
        if (aVar == null) {
            if (mConfig.b()) {
                aVar = mPreparedReactNativeHost;
                if (aVar != null) {
                    mPreparedReactNativeHost = null;
                } else if (isDev) {
                    aVar = new b(mApplication);
                } else {
                    aVar = new a(mApplication);
                }
            } else if (isDev) {
                aVar = new b(mApplication);
            } else {
                aVar = new a(mApplication);
            }
            map.put(str2, aVar);
            aVar.f48453d = str2;
            aVar.f48452c = rNDegradeExceptionHandler2;
        }
        return aVar;
    }

    public static void initReactInstanceManager(Application application, a aVar, d dVar) {
        mApplication = application;
        mConfig = aVar;
        mProxy = dVar;
    }
}
