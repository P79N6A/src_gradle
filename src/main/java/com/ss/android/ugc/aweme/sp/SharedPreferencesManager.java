package com.ss.android.ugc.aweme.sp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Instrumentation;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.v4.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Keep
public class SharedPreferencesManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Constructor constructor;
    private File mPreferencesDir;
    private ArrayMap<String, File> mSharedPrefsPaths;
    private ArrayMap<File, SharedPreferences> sSharedPrefsCache;
    private Class<?> sharedPreferencesImplClass;

    static class a {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a  reason: collision with root package name */
        public static SharedPreferencesManager f4050a = new SharedPreferencesManager();
    }

    private SharedPreferencesManager() {
    }

    public static SharedPreferencesManager getInstance() {
        return a.f4050a;
    }

    private ArrayMap<File, SharedPreferences> getSharedPreferencesCacheLocked() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81765, new Class[0], ArrayMap.class)) {
            return (ArrayMap) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81765, new Class[0], ArrayMap.class);
        }
        if (this.sSharedPrefsCache == null) {
            this.sSharedPrefsCache = new ArrayMap<>();
        }
        return this.sSharedPrefsCache;
    }

    public static void hookInstrumentation() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 81766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 81766, new Class[0], Void.TYPE);
            return;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null) {
                    Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                        Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
                        if (instrumentation != null && !(instrumentation instanceof h)) {
                            declaredField.set(invoke, new h(instrumentation));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static File ensurePrivateDirExists(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, changeQuickRedirect, true, 81762, new Class[]{File.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{file}, null, changeQuickRedirect, true, 81762, new Class[]{File.class}, File.class);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @TargetApi(24)
    private File getDataDirAbove24(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 81760, new Class[]{Context.class}, File.class)) {
            return context.getDataDir();
        }
        return (File) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 81760, new Class[]{Context.class}, File.class);
    }

    private File getDataDir(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 81759, new Class[]{Context.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 81759, new Class[]{Context.class}, File.class);
        } else if (Build.VERSION.SDK_INT >= 24) {
            return getDataDirAbove24(context);
        } else {
            return context.getFilesDir().getParentFile();
        }
    }

    private File getPreferencesDir(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 81761, new Class[]{Context.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 81761, new Class[]{Context.class}, File.class);
        }
        if (this.mPreferencesDir == null) {
            this.mPreferencesDir = new File(getDataDir(context), "shared_prefs");
        }
        return ensurePrivateDirExists(this.mPreferencesDir);
    }

    private File getSharedPreferencesPath(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, changeQuickRedirect, false, 81758, new Class[]{Context.class, String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context, str2}, this, changeQuickRedirect, false, 81758, new Class[]{Context.class, String.class}, File.class);
        }
        File preferencesDir = getPreferencesDir(context);
        return makeFilename(preferencesDir, str2 + ".xml");
    }

    private File makeFilename(File file, String str) {
        File file2 = file;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{file2, str2}, this, changeQuickRedirect, false, 81757, new Class[]{File.class, String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{file2, str2}, this, changeQuickRedirect, false, 81757, new Class[]{File.class, String.class}, File.class);
        } else if (str2.indexOf(File.separatorChar) < 0) {
            return new File(file2, str2);
        } else {
            throw new IllegalArgumentException("File " + str2 + " contains a path separator");
        }
    }

    public SharedPreferences getSharedPreferences(Context context, String str) {
        String str2;
        File file;
        if (PatchProxy.isSupport(new Object[]{context, str}, this, changeQuickRedirect, false, 81763, new Class[]{Context.class, String.class}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context, str}, this, changeQuickRedirect, false, 81763, new Class[]{Context.class, String.class}, SharedPreferences.class);
        }
        if (context.getApplicationInfo().targetSdkVersion >= 19 || str != null) {
            str2 = str;
        } else {
            str2 = "null";
        }
        synchronized (SharedPreferencesManager.class) {
            if (this.mSharedPrefsPaths == null) {
                this.mSharedPrefsPaths = new ArrayMap<>();
            }
            file = (File) this.mSharedPrefsPaths.get(str2);
            if (file == null) {
                file = getSharedPreferencesPath(context, str2);
                this.mSharedPrefsPaths.put(str2, file);
            }
        }
        return getSharedPreferences(str2, file);
    }

    public SharedPreferences getSharedPreferences(String str, File file) {
        String str2 = str;
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{str2, file2}, this, changeQuickRedirect, false, 81764, new Class[]{String.class, File.class}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{str2, file2}, this, changeQuickRedirect, false, 81764, new Class[]{String.class, File.class}, SharedPreferences.class);
        }
        synchronized (SharedPreferencesManager.class) {
            ArrayMap<File, SharedPreferences> sharedPreferencesCacheLocked = getSharedPreferencesCacheLocked();
            SharedPreferences sharedPreferences = (SharedPreferences) sharedPreferencesCacheLocked.get(file2);
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            e eVar = new e(str2, file2);
            sharedPreferencesCacheLocked.put(file2, eVar);
            return eVar;
        }
    }
}
