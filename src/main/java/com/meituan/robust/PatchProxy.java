package com.meituan.robust;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class PatchProxy {
    private static CopyOnWriteArrayList<RobustExtension> registerExtensionList = new CopyOnWriteArrayList<>();
    private static ThreadLocal<RobustExtension> robustExtensionThreadLocal = new ThreadLocal<>();

    public static void reset() {
        registerExtensionList = new CopyOnWriteArrayList<>();
        robustExtensionThreadLocal = new ThreadLocal<>();
    }

    private static String[] getClassMethodName() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return new String[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName()};
    }

    private static void notify(String str) {
        if (registerExtensionList != null) {
            Iterator<RobustExtension> it2 = registerExtensionList.iterator();
            while (it2.hasNext()) {
                it2.next().notifyListner(str);
            }
        }
    }

    public static synchronized boolean register(RobustExtension robustExtension) {
        boolean addIfAbsent;
        synchronized (PatchProxy.class) {
            if (registerExtensionList == null) {
                registerExtensionList = new CopyOnWriteArrayList<>();
            }
            addIfAbsent = registerExtensionList.addIfAbsent(robustExtension);
        }
        return addIfAbsent;
    }

    public static synchronized boolean unregister(RobustExtension robustExtension) {
        synchronized (PatchProxy.class) {
            if (registerExtensionList == null) {
                return false;
            }
            boolean remove = registerExtensionList.remove(robustExtension);
            return remove;
        }
    }

    private static String getClassMethod(boolean z, int i) {
        try {
            return "" + ":" + "" + ":" + z + ":" + i;
        } catch (Exception unused) {
            return "";
        }
    }

    private static Object[] getObjects(Object[] objArr, Object obj, boolean z) {
        Object[] objArr2;
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (z) {
            objArr2 = new Object[length];
        } else {
            objArr2 = new Object[(length + 1)];
        }
        int i = 0;
        while (i < length) {
            objArr2[i] = objArr[i];
            i++;
        }
        if (!z) {
            objArr2[i] = obj;
        }
        return objArr2;
    }

    public static void accessDispatchVoid(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, int i, Class[] clsArr, Class cls) {
        if (changeQuickRedirect == null) {
            RobustExtension robustExtension = robustExtensionThreadLocal.get();
            robustExtensionThreadLocal.remove();
            if (robustExtension != null) {
                notify(robustExtension.describeSelfFunction());
                RobustArguments robustArguments = new RobustArguments(objArr, obj, z, i, clsArr, cls);
                robustExtension.accessDispatch(robustArguments);
            }
            return;
        }
        notify("patch execute ,other extension will be ignore ");
        String classMethod = getClassMethod(z, i);
        if (!TextUtils.isEmpty(classMethod)) {
            changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z));
        }
    }

    public static Object accessDispatch(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, int i, Class[] clsArr, Class cls) {
        if (changeQuickRedirect == null) {
            RobustExtension robustExtension = robustExtensionThreadLocal.get();
            robustExtensionThreadLocal.remove();
            if (robustExtension == null) {
                return null;
            }
            notify(robustExtension.describeSelfFunction());
            RobustArguments robustArguments = new RobustArguments(objArr, obj, z, i, clsArr, cls);
            return robustExtension.accessDispatch(robustArguments);
        }
        String classMethod = getClassMethod(z, i);
        if (TextUtils.isEmpty(classMethod)) {
            return null;
        }
        notify("patch execute ,other extension will be ignore ");
        return changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z));
    }

    public static boolean isSupport(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, int i, Class[] clsArr, Class cls) {
        if (changeQuickRedirect != null) {
            String classMethod = getClassMethod(z, i);
            if (TextUtils.isEmpty(classMethod)) {
                return false;
            }
            Object[] objArr2 = objArr;
            Object obj2 = obj;
            boolean z2 = z;
            try {
                return changeQuickRedirect.isSupport(classMethod, getObjects(objArr, obj, z));
            } catch (Throwable unused) {
                return false;
            }
        } else if (registerExtensionList == null || registerExtensionList.isEmpty()) {
            return false;
        } else {
            Iterator<RobustExtension> it2 = registerExtensionList.iterator();
            while (it2.hasNext()) {
                RobustExtension next = it2.next();
                RobustArguments robustArguments = new RobustArguments(objArr, obj, z, i, clsArr, cls);
                if (next.isSupport(robustArguments)) {
                    robustExtensionThreadLocal.set(next);
                    return true;
                }
            }
            return false;
        }
    }
}
