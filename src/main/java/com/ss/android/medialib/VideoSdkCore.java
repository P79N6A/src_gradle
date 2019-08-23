package com.ss.android.medialib;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.bef.effectsdk.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.LogInvoker;
import com.ss.android.medialib.common.c;
import com.ss.android.medialib.config.a;
import com.ss.android.vesdk.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@Keep
public final class VideoSdkCore {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Context APPLICATION_CONTEXT = null;
    public static final String TAG = "VideoSdkCore";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean inited;
    private static b sFinder;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
    }

    private static native void nativeEnableGLES3(boolean z);

    private static native String nativeGetVersionCode();

    private static native String nativeGetVersionName();

    private static native void nativeSetAmazingShareDir(String str);

    private static native void nativeSetAssertManagerEnable(boolean z);

    private static native void nativeSetAssertManagerFromJava(AssetManager assetManager);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetProduct(int i);

    private static native void nativeSetResourceFinderEnable(boolean z);

    static {
        com.ss.android.ttve.nativePort.b.a();
    }

    public static String getSdkVersionCode() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 16610, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 16610, new Class[0], String.class);
        }
        return nativeGetVersionCode();
    }

    public static String getSdkVersionName() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 16609, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 16609, new Class[0], String.class);
        }
        return nativeGetVersionName();
    }

    public static void enableGLES3(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16603, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 16603, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        nativeEnableGLES3(z);
    }

    public static void setAmazingShareDir(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 16605, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 16605, new Class[]{String.class}, Void.TYPE);
            return;
        }
        nativeSetAmazingShareDir(str);
    }

    public static void setEffectLogLevel(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 16606, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 16606, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        nativeSetEffectLogLevel(i);
    }

    public static void setEnableAssetManager(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16607, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 16607, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        nativeSetAssertManagerEnable(z);
    }

    public static void setProduct(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 16602, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 16602, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        nativeSetProduct(i);
    }

    public static void setResourceFinder(@NonNull b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, null, changeQuickRedirect, true, 16604, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, null, changeQuickRedirect, true, 16604, new Class[]{b.class}, Void.TYPE);
            return;
        }
        sFinder = bVar;
        nativeSetResourceFinderEnable(true);
    }

    public static long getNativeFinder(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 16611, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 16611, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        } else if (j2 == 0) {
            y.d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        } else if (sFinder != null) {
            return sFinder.createNativeResourceFinder(j2);
        } else {
            y.d(TAG, "错误调用finder相关接口");
            return 0;
        }
    }

    public static void init(Context context) {
        final Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16601, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16601, new Class[]{Context.class}, Void.TYPE);
        } else if (!inited) {
            synchronized (VideoSdkCore.class) {
                if (!inited) {
                    APPLICATION_CONTEXT = context.getApplicationContext();
                    nativeSetAssertManagerFromJava(context.getAssets());
                    new Thread() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f29332a;

                        public final void run() {
                            int i = 0;
                            if (PatchProxy.isSupport(new Object[0], this, f29332a, false, 16613, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f29332a, false, 16613, new Class[0], Void.TYPE);
                                return;
                            }
                            try {
                                com.ss.android.medialib.f.b.a(context2);
                                if (PatchProxy.isSupport(new Object[0], null, a.f29645a, true, 17337, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], null, a.f29645a, true, 17337, new Class[0], Void.TYPE);
                                } else if (VideoSdkCore.APPLICATION_CONTEXT != null) {
                                    Map a2 = com.ss.android.medialib.e.b.a(VideoSdkCore.APPLICATION_CONTEXT);
                                    if (PatchProxy.isSupport(new Object[]{a2}, null, a.f29645a, true, 17339, new Class[]{Map.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{a2}, null, a.f29645a, true, 17339, new Class[]{Map.class}, Void.TYPE);
                                    } else {
                                        if (PatchProxy.isSupport(new Object[]{a2, "use_opensl"}, null, a.f29645a, true, 17340, new Class[]{Map.class, String.class}, Integer.TYPE)) {
                                            i = ((Integer) PatchProxy.accessDispatch(new Object[]{a2, "use_opensl"}, null, a.f29645a, true, 17340, new Class[]{Map.class, String.class}, Integer.TYPE)).intValue();
                                        } else if (a2 != null) {
                                            Integer num = (Integer) a2.get("use_opensl");
                                            if (num != null) {
                                                i = num.intValue();
                                            }
                                        }
                                        if (i == 0) {
                                            i = 2;
                                        }
                                        a.f29646b = i;
                                    }
                                } else {
                                    throw new IllegalStateException("Must call VideoSdkCore.init() before.");
                                }
                            } catch (Exception e2) {
                                String str = VideoSdkCore.TAG;
                                y.d(str, "VideoSdkCore init failed: " + e2.toString());
                            }
                        }
                    }.start();
                    inited = true;
                }
            }
        }
    }

    public static void releaseNativeFinder(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 16612, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 16612, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (j2 == 0) {
            y.d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder == null) {
            y.d(TAG, "错误调用finder相关接口");
        } else {
            sFinder.release(j2);
        }
    }

    public static void setLogLevel(int i) {
        byte b2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 16608, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 16608, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{null, Integer.valueOf(i)}, null, c.f29624a, true, 17074, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null, Integer.valueOf(i)}, null, c.f29624a, true, 17074, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else {
            switch (i) {
                case 2:
                    b2 = 31;
                    break;
                case 3:
                    b2 = 15;
                    break;
                case 4:
                    b2 = 7;
                    break;
                case 5:
                    b2 = 3;
                    break;
                case 6:
                    b2 = 1;
                    break;
                default:
                    b2 = 0;
                    break;
            }
            if (PatchProxy.isSupport(new Object[]{null, Byte.valueOf(b2)}, null, c.f29624a, true, 17073, new Class[]{String.class, Byte.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null, Byte.valueOf(b2)}, null, c.f29624a, true, 17073, new Class[]{String.class, Byte.TYPE}, Void.TYPE);
            } else {
                c.f29627d = b2;
            }
        }
        LogInvoker.setLogLevel(i);
    }
}
