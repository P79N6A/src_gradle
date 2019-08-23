package com.ss.android.ttve.monitor;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.ttve.monitor.GPUModelDetector;
import com.ss.android.ttve.nativePort.TEGPUInfoReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f31238a = new ArrayList<String>() {
        {
            add("os_sdk_int");
            add("external_storage");
            add("screen_height");
            add("screen_width");
            add("storage");
            add("memory");
            add("cpu_core");
            add("cpu_freq");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static boolean f31239b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f31240c;

    /* renamed from: d  reason: collision with root package name */
    private static String f31241d;

    /* renamed from: e  reason: collision with root package name */
    private static String f31242e;

    /* renamed from: f  reason: collision with root package name */
    private static String f31243f;
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
    private static String r;
    private static String s;
    private static String t;
    private static String u;
    private static String v;

    private static String b() {
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

    public static Map<String, String> a() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("model", f31241d);
        hashMap.put("cpu", f31242e);
        hashMap.put("cpu_freq", f31243f);
        hashMap.put("cpu_core", g);
        hashMap.put("memory", h);
        hashMap.put("storage", i);
        hashMap.put("external_storage", j);
        hashMap.put("screen_width", k);
        hashMap.put("screen_height", l);
        hashMap.put("os_sdk_int", m);
        hashMap.put("appid", n);
        hashMap.put("abi", o);
        hashMap.put("locale", p);
        hashMap.put("sim_operator", q);
        hashMap.put("brand", r);
        if (!f31240c) {
            GPUModelDetector gPUModelDetector = GPUModelDetector.f31230a;
            String nativeGetGPURenderer = TEGPUInfoReader.nativeGetGPURenderer();
            if (nativeGetGPURenderer != null && nativeGetGPURenderer.trim().length() > 0) {
                gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.Unknown;
                gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Unknown;
                gPUModelDetector.f31233d = 0;
                String[] split = nativeGetGPURenderer.split("[-\\s+]");
                if (split.length > 0) {
                    String trim = split[0].trim();
                    if (trim.equalsIgnoreCase("Adreno")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.Adreno;
                        int length = split.length;
                        if (length >= 2) {
                            if (split[1].equalsIgnoreCase("(TM)")) {
                                if (length == 3 && GPUModelDetector.a(split[2])) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Adreno;
                                    gPUModelDetector.f31233d = GPUModelDetector.c(split[2]);
                                }
                            } else if (GPUModelDetector.a(split[1])) {
                                gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Adreno;
                                gPUModelDetector.f31233d = GPUModelDetector.c(split[1]);
                            }
                        }
                    } else if (trim.equalsIgnoreCase("Mali")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.Mali;
                        int length2 = split.length;
                        if (length2 >= 2) {
                            if (GPUModelDetector.a(split[1])) {
                                if (length2 == 2) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Mali;
                                } else if (length2 == 3 && split[2].equalsIgnoreCase("MP")) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Mali_MP;
                                }
                                gPUModelDetector.f31233d = GPUModelDetector.c(split[1]);
                            } else if (length2 == 2 && split[1] != null && split[1].trim().length() > 0 && split[1].charAt(0) == 'T') {
                                String substring = split[1].substring(1);
                                if (GPUModelDetector.a(substring)) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Mali_T;
                                    gPUModelDetector.f31233d = GPUModelDetector.c(substring);
                                }
                            }
                        }
                    } else if (trim.equalsIgnoreCase("PowerVR")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.PowerVR;
                        int length3 = split.length;
                        if (length3 >= 2) {
                            if (split[1].equalsIgnoreCase("SGX")) {
                                if (length3 == 3) {
                                    if (split[2].substring(split[2].length() - 2).equalsIgnoreCase("MP")) {
                                        String substring2 = split[2].substring(0, split[2].length() - 2);
                                        if (GPUModelDetector.a(substring2)) {
                                            gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.PowerVR_SGX_MP;
                                            gPUModelDetector.f31233d = GPUModelDetector.c(substring2);
                                        }
                                    } else if (split[2].substring(split[2].length() - 3).equalsIgnoreCase("MP2")) {
                                        String substring3 = split[2].substring(0, split[2].length() - 3);
                                        if (GPUModelDetector.a(substring3)) {
                                            gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.PowerVR_SGX_MP2;
                                            gPUModelDetector.f31233d = GPUModelDetector.c(substring3);
                                        }
                                    } else if (GPUModelDetector.a(split[2])) {
                                        gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.PowerVR_SGX;
                                        gPUModelDetector.f31233d = GPUModelDetector.c(split[2]);
                                    }
                                }
                            } else if (split[1].equalsIgnoreCase("Rogue") && length3 == 3) {
                                if (split[2].equalsIgnoreCase("Han")) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.PowerVR_Rogue_Han;
                                } else if (split[2].equalsIgnoreCase("Hood")) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.PowerVR_Rogue_Hood;
                                } else if (split[2].equalsIgnoreCase("Marlowe")) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.PowerVR_Rogue_Marlowe;
                                } else if (split[2].startsWith("G")) {
                                    String substring4 = split[2].substring(1);
                                    if (GPUModelDetector.a(substring4)) {
                                        gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.PowerVR_Rogue_G;
                                        gPUModelDetector.f31233d = GPUModelDetector.c(substring4);
                                    }
                                }
                            }
                        }
                    } else if (trim.equalsIgnoreCase("Intel") || trim.equalsIgnoreCase("Intel(R)")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.Intel;
                        int length4 = split.length;
                        if (length4 >= 3 && split[1].equalsIgnoreCase("HD") && split[2].equalsIgnoreCase("Graphics")) {
                            gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Intel_HD_Graphics;
                            if (length4 == 4 && GPUModelDetector.a(split[3])) {
                                gPUModelDetector.f31233d = GPUModelDetector.c(split[3]);
                            }
                        }
                    } else if (trim.equalsIgnoreCase("NVIDIA")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.Intel;
                        int length5 = split.length;
                        if (length5 >= 2) {
                            if (split[1].equalsIgnoreCase("Tegra")) {
                                if (length5 < 3 || !split[2].equalsIgnoreCase("X1")) {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.NVIDIA_Tegra;
                                } else {
                                    gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.NVIDIA_Tegra_X1;
                                }
                            } else if (split[1].equalsIgnoreCase("AP")) {
                                gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.NVIDIA_AP;
                            }
                        }
                    } else if (trim.equalsIgnoreCase("Vivante")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.Vivante;
                        if (split.length >= 2 && !split[1].equalsIgnoreCase("GC")) {
                            gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Vivante_GC;
                            gPUModelDetector.f31233d = GPUModelDetector.c(gPUModelDetector.b(split[1]));
                        }
                    } else if (trim.equalsIgnoreCase("GC1000")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.Vivante;
                        if (split.length >= 2) {
                            gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.Vivante_GC;
                            gPUModelDetector.f31233d = GPUModelDetector.c(gPUModelDetector.b(split[0]));
                        }
                    } else if (trim.equalsIgnoreCase("VideoCore")) {
                        gPUModelDetector.f31231b = GPUModelDetector.ENvGpuModel.VideoCore;
                        if (split.length >= 3 && split[1].equalsIgnoreCase("IV") && split[2].equalsIgnoreCase("HW")) {
                            gPUModelDetector.f31232c = GPUModelDetector.ENvGpuSubModel.VideoCore_IV_HW;
                        }
                    }
                }
            }
            GPUModelDetector.a aVar = new GPUModelDetector.a(gPUModelDetector.f31231b, gPUModelDetector.f31232c, gPUModelDetector.f31233d);
            GPUModelDetector.ENvGpuSubModel eNvGpuSubModel = aVar.f31235b;
            int i2 = aVar.f31236c;
            if (eNvGpuSubModel == null) {
                str = "";
            } else {
                str = eNvGpuSubModel.name();
            }
            s = str;
            t = String.valueOf(i2);
            u = TEGPUInfoReader.nativeGetGLVersion();
            v = "4.9.0.55";
            f31240c = true;
        }
        hashMap.put("gpu", s);
        hashMap.put("gpu_ver", t);
        hashMap.put("opengl_version", u);
        hashMap.put("ve_version", v);
        return hashMap;
    }

    public static void a(Context context) {
        String str;
        long j2;
        int i2;
        if (!f31239b) {
            synchronized (a.class) {
                if (!f31239b) {
                    Context applicationContext = context.getApplicationContext();
                    String language = Locale.getDefault().getLanguage();
                    if (TextUtils.isEmpty(Locale.getDefault().getCountry())) {
                        str = "";
                    } else {
                        str = "_" + r2.toUpperCase();
                    }
                    f31241d = Build.MODEL;
                    f31242e = b.a();
                    f31243f = b.b();
                    g = String.valueOf(b.c());
                    h = String.valueOf(b.d());
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    if (Build.VERSION.SDK_INT >= 18) {
                        j2 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
                    } else {
                        j2 = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
                    }
                    i = String.valueOf(j2);
                    j = String.valueOf(b.e());
                    m = String.valueOf(Build.VERSION.SDK_INT);
                    if (applicationContext == null) {
                        i2 = 0;
                    } else {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                        i2 = displayMetrics.widthPixels;
                    }
                    k = String.valueOf(i2);
                    l = String.valueOf(b.a(applicationContext));
                    n = applicationContext.getPackageName();
                    o = b();
                    p = language + str;
                    q = b.b(applicationContext);
                    r = Build.BRAND;
                    f31239b = true;
                }
            }
        }
    }
}
