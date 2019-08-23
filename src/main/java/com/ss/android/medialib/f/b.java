package com.ss.android.medialib.f;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import java.util.Locale;
import java.util.UUID;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29655a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f29656b;

    /* renamed from: c  reason: collision with root package name */
    private static String f29657c;

    /* renamed from: d  reason: collision with root package name */
    private static String f29658d;

    /* renamed from: e  reason: collision with root package name */
    private static String f29659e;

    /* renamed from: f  reason: collision with root package name */
    private static String f29660f;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;

    private static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f29655a, true, 17795, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f29655a, true, 17795, new Class[0], String.class);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    sb.append(strArr[i2]);
                    if (i2 != strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        return Build.CPU_ABI + "," + Build.CPU_ABI2;
    }

    public static void a(Context context) {
        String str;
        long j2;
        int i2;
        String str2;
        long blockCount;
        if (PatchProxy.isSupport(new Object[]{context}, null, f29655a, true, 17793, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f29655a, true, 17793, new Class[]{Context.class}, Void.TYPE);
        } else if (!f29656b) {
            synchronized (b.class) {
                if (!f29656b) {
                    Context applicationContext = context.getApplicationContext();
                    if (PatchProxy.isSupport(new Object[]{applicationContext}, null, f29655a, true, 17794, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{applicationContext}, null, f29655a, true, 17794, new Class[]{Context.class}, Void.TYPE);
                    } else {
                        String language = Locale.getDefault().getLanguage();
                        if (TextUtils.isEmpty(Locale.getDefault().getCountry())) {
                            str = "";
                        } else {
                            str = "_" + r4.toUpperCase();
                        }
                        f29657c = Build.MODEL;
                        f29658d = c.a();
                        f29659e = c.b();
                        f29660f = String.valueOf(c.c());
                        g = String.valueOf(c.d());
                        if (PatchProxy.isSupport(new Object[0], null, c.f29661a, true, 17802, new Class[0], Long.TYPE)) {
                            j2 = ((Long) PatchProxy.accessDispatch(new Object[0], null, c.f29661a, true, 17802, new Class[0], Long.TYPE)).longValue();
                        } else {
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                            if (Build.VERSION.SDK_INT >= 18) {
                                blockCount = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
                            } else {
                                blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
                            }
                            j2 = blockCount;
                        }
                        h = String.valueOf(j2);
                        i = String.valueOf(c.a(applicationContext));
                        l = String.valueOf(Build.VERSION.SDK_INT);
                        if (PatchProxy.isSupport(new Object[]{applicationContext}, null, c.f29661a, true, 17805, new Class[]{Context.class}, Integer.TYPE)) {
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{applicationContext}, null, c.f29661a, true, 17805, new Class[]{Context.class}, Integer.TYPE)).intValue();
                        } else if (applicationContext == null) {
                            i2 = 0;
                        } else {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                            i2 = displayMetrics.widthPixels;
                        }
                        j = String.valueOf(i2);
                        k = String.valueOf(c.b(applicationContext));
                        if (PatchProxy.isSupport(new Object[]{applicationContext}, null, a.f29654a, true, 17792, new Class[]{Context.class}, String.class)) {
                            str2 = (String) PatchProxy.accessDispatch(new Object[]{applicationContext}, null, a.f29654a, true, 17792, new Class[]{Context.class}, String.class);
                        } else {
                            if (PatchProxy.isSupport(new Object[]{applicationContext}, null, com.ss.android.medialib.e.b.f29649a, true, 17781, new Class[]{Context.class}, String.class)) {
                                str2 = (String) PatchProxy.accessDispatch(new Object[]{applicationContext}, null, com.ss.android.medialib.e.b.f29649a, true, 17781, new Class[]{Context.class}, String.class);
                            } else {
                                str2 = c.a(applicationContext, "ShortVideo", 0).getString("DeviceId", null);
                            }
                            if (str2 == null) {
                                str2 = UUID.randomUUID().toString();
                                if (PatchProxy.isSupport(new Object[]{applicationContext, str2}, null, com.ss.android.medialib.e.b.f29649a, true, 17782, new Class[]{Context.class, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{applicationContext, str2}, null, com.ss.android.medialib.e.b.f29649a, true, 17782, new Class[]{Context.class, String.class}, Void.TYPE);
                                } else {
                                    c.a(applicationContext, "ShortVideo", 0).edit().putString("DeviceId", str2).apply();
                                }
                            }
                        }
                        m = str2;
                        n = applicationContext.getPackageName();
                        o = a();
                        p = language + str;
                        q = c.c(applicationContext);
                    }
                    f29656b = true;
                }
            }
        }
    }
}
