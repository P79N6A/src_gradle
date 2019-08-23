package com.ss.android.d.c;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.io.FileFilter;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;

public final class c {
    public static String g() {
        return "";
    }

    public static String f() {
        return a("/proc/version");
    }

    private static String h() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{"wifi.interface", "wlan0"});
        } catch (Exception unused) {
            return "wlan0";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        if (r3 != null) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A[SYNTHETIC, Splitter:B:30:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0056 A[Catch:{ IOException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005e A[SYNTHETIC, Splitter:B:40:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = ":"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x005a, all -> 0x004c }
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch:{ IOException -> 0x005a, all -> 0x004c }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
        L_0x000f:
            java.lang.String r4 = r3.readLine()     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            if (r4 == 0) goto L_0x003e
            boolean r5 = r4.contains(r0)     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            if (r5 == 0) goto L_0x000f
            java.lang.String[] r4 = r4.split(r0)     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            r5 = 0
            r6 = r4[r5]     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            java.lang.String r7 = "Hardware"
            boolean r6 = r6.contains(r7)     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            if (r6 != 0) goto L_0x0034
            r5 = r4[r5]     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            java.lang.String r6 = "model name"
            boolean r5 = r5.contains(r6)     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            if (r5 == 0) goto L_0x000f
        L_0x0034:
            r0 = 1
            r0 = r4[r0]     // Catch:{ IOException -> 0x005c, all -> 0x0045 }
            r2.close()     // Catch:{ IOException -> 0x003d }
            r3.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            return r0
        L_0x003e:
            r2.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0041:
            r3.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0064
        L_0x0045:
            r0 = move-exception
            goto L_0x004f
        L_0x0047:
            r0 = move-exception
            r3 = r1
            goto L_0x004f
        L_0x004a:
            r3 = r1
            goto L_0x005c
        L_0x004c:
            r0 = move-exception
            r2 = r1
            r3 = r2
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0054:
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            throw r0
        L_0x005a:
            r2 = r1
            r3 = r2
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0061:
            if (r3 == 0) goto L_0x0064
            goto L_0x0041
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.c.a():java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:54|12|13|14|15|16|17|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0049 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[SYNTHETIC, Splitter:B:33:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065 A[SYNTHETIC, Splitter:B:37:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006c A[SYNTHETIC, Splitter:B:44:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0073 A[SYNTHETIC, Splitter:B:48:0x0073] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long b() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0069, all -> 0x0058 }
            java.lang.String r2 = "/proc/meminfo"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0069, all -> 0x0058 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0056, all -> 0x0051 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0056, all -> 0x0051 }
        L_0x000f:
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            if (r0 == 0) goto L_0x0046
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            if (r3 != 0) goto L_0x000f
            java.lang.String r3 = "MemTotal"
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            if (r3 == 0) goto L_0x000f
            java.lang.String r3 = "[^0-9]"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            java.util.regex.Matcher r0 = r3.matcher(r0)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replaceAll(r3)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            r5 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r5
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            return r3
        L_0x0046:
            r1.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            r2.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x0076
        L_0x004d:
            r0 = move-exception
            goto L_0x005c
        L_0x004f:
            r0 = r2
            goto L_0x006a
        L_0x0051:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x005c
        L_0x0056:
            goto L_0x006a
        L_0x0058:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x005c:
            if (r1 == 0) goto L_0x0063
            r1.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            throw r0
        L_0x0069:
            r1 = r0
        L_0x006a:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.c.b():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[SYNTHETIC, Splitter:B:16:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c() {
        /*
            java.lang.String r0 = ""
            r1 = 2
            r2 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3 = 0
            java.lang.String r4 = "/system/bin/cat"
            r1[r3] = r4     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3 = 1
            java.lang.String r4 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"
            r1[r3] = r4     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.lang.Process r1 = r3.start()     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r2 = 24
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
        L_0x0021:
            int r3 = r1.read(r2)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r4 = -1
            if (r3 == r4) goto L_0x003d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.<init>()     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            goto L_0x0021
        L_0x003d:
            if (r1 == 0) goto L_0x0053
        L_0x003f:
            r1.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            goto L_0x0047
        L_0x0045:
            r0 = move-exception
            r1 = r2
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r1 = r2
        L_0x004e:
            java.lang.String r0 = "N/A"
            if (r1 == 0) goto L_0x0053
            goto L_0x003f
        L_0x0053:
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.c.c():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[SYNTHETIC, Splitter:B:16:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d() {
        /*
            java.lang.String r0 = ""
            r1 = 2
            r2 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3 = 0
            java.lang.String r4 = "/system/bin/cat"
            r1[r3] = r4     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3 = 1
            java.lang.String r4 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r1[r3] = r4     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.lang.Process r1 = r3.start()     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r2 = 24
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
        L_0x0021:
            int r3 = r1.read(r2)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r4 = -1
            if (r3 == r4) goto L_0x003d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.<init>()     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            goto L_0x0021
        L_0x003d:
            if (r1 == 0) goto L_0x0053
        L_0x003f:
            r1.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            goto L_0x0047
        L_0x0045:
            r0 = move-exception
            r1 = r2
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r1 = r2
        L_0x004e:
            java.lang.String r0 = "N/A"
            if (r1 == 0) goto L_0x0053
            goto L_0x003f
        L_0x0053:
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.c.d():java.lang.String");
    }

    public static int e() {
        File file = new File("/sys/devices/system/cpu");
        if (!file.exists()) {
            return 0;
        }
        File[] listFiles = file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                return Pattern.matches("cpu[0-9]", file.getName());
            }
        });
        if (listFiles == null || listFiles.length <= 0) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (File absolutePath : listFiles) {
            String absolutePath2 = absolutePath.getAbsolutePath();
            try {
                int max = Math.max(Math.max(Integer.parseInt(a(absolutePath2 + "/cpufreq/cpuinfo_max_freq")), Integer.parseInt(a(absolutePath2 + "/cpufreq/scaling_cur_freq"))), Integer.parseInt(a(absolutePath2 + "/cpufreq/cpuinfo_min_freq")));
                if (max > 0) {
                    arrayList.add(Integer.valueOf(max));
                }
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        Collections.sort(arrayList);
        return ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
    }

    @SuppressLint({"HardwareIds"})
    public static String b(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String c(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONArray e(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return a.f28393a.a(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String g(Context context) {
        try {
            WifiInfo f2 = f(context);
            if (f2 == null) {
                return null;
            }
            return f2.getBSSID();
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<ScanResult> d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getScanResults();
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String i(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSubscriberId();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String l(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        try {
            return telephonyManager.getVoiceMailNumber();
        } catch (Exception unused) {
            return null;
        }
    }

    public static WifiInfo f(Context context) {
        if (context == null) {
            return null;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            if (((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getNetworkInfo(1).getState() != NetworkInfo.State.CONNECTED || connectionInfo.getSSID() == null) {
                return null;
            }
            return connectionInfo;
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String j(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                Logger.debug();
            } else if (defaultAdapter.isEnabled()) {
                String address = defaultAdapter.getAddress();
                if ("02:00:00:00:00:00".equals(address)) {
                    str = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
                } else {
                    str = address;
                }
                return str;
            } else {
                boolean debug = Logger.debug();
            }
            str = null;
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String k(Context context) {
        if (context == null) {
            return null;
        }
        String str = "";
        try {
            int myPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = ((ActivityManager) context.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                if (next.pid == myPid) {
                    str = next.processName;
                    break;
                }
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String h(Context context) {
        String str;
        WifiInfo f2 = f(context);
        if (f2 != null) {
            str = f2.getMacAddress();
        } else {
            str = null;
        }
        if (!"02:00:00:00:00:00".equals(str) && !TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            String h = h();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                byte[] hardwareAddress = nextElement.getHardwareAddress();
                if (!(hardwareAddress == null || hardwareAddress.length == 0)) {
                    StringBuilder sb = new StringBuilder();
                    for (byte valueOf : hardwareAddress) {
                        sb.append(String.format("%02X:", new Object[]{Byte.valueOf(valueOf)}));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    String sb2 = sb.toString();
                    if (nextElement.getName().equals(h)) {
                        return sb2;
                    }
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static String a(int i) {
        int i2 = i / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        if (i2 > 360 && i2 < 440) {
            return "400M";
        }
        if (i2 > 460 && i2 < 540) {
            return "500M";
        }
        if (i2 > 560 && i2 < 640) {
            return "600M";
        }
        if (i2 > 660 && i2 < 740) {
            return "700M";
        }
        if (i2 > 760 && i2 < 840) {
            return "800M";
        }
        if (i2 > 860 && i2 < 940) {
            return "900M";
        }
        if (i2 > 960 && i2 < 1040) {
            return "1G";
        }
        if (i2 < 1000) {
            try {
                return String.format(Locale.getDefault(), "%dM", new Object[]{Integer.valueOf(i2)});
            } catch (Exception unused) {
                return "0M";
            }
        } else {
            return String.format(Locale.getDefault(), "%.1fG", new Object[]{Float.valueOf(((float) i2) / 1000.0f)});
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|4|5|6|(3:7|8|(1:10)(1:47))|11|12|13|14|15|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0031 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0042 A[SYNTHETIC, Splitter:B:27:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC, Splitter:B:31:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0050 A[SYNTHETIC, Splitter:B:38:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0057 A[SYNTHETIC, Splitter:B:42:0x0057] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x005a
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004d, all -> 0x003e }
            r2.<init>(r0)     // Catch:{ IOException -> 0x004d, all -> 0x003e }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            r3.<init>(r2)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            r0.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
        L_0x0020:
            java.lang.String r1 = r0.readLine()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r1 == 0) goto L_0x002a
            r4.append(r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            goto L_0x0020
        L_0x002a:
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            r0.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r2.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r4
        L_0x0035:
            r4 = move-exception
            r1 = r0
            goto L_0x0040
        L_0x0038:
            r1 = r0
            goto L_0x004e
        L_0x003a:
            r4 = move-exception
            goto L_0x0040
        L_0x003c:
            goto L_0x004e
        L_0x003e:
            r4 = move-exception
            r2 = r1
        L_0x0040:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r4
        L_0x004d:
            r2 = r1
        L_0x004e:
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0055
        L_0x0054:
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.c.a(java.lang.String):java.lang.String");
    }

    @SuppressLint({"HardwareIds"})
    public static String[] a(Context context) {
        String[] strArr;
        if (context == null) {
            return null;
        }
        try {
            int i = 0;
            if (Build.VERSION.SDK_INT >= 22) {
                List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null) {
                    if (!activeSubscriptionInfoList.isEmpty()) {
                        strArr = new String[activeSubscriptionInfoList.size()];
                        while (i < activeSubscriptionInfoList.size()) {
                            try {
                                strArr[i] = activeSubscriptionInfoList.get(i).getIccId();
                                i++;
                            } catch (Throwable unused) {
                            }
                        }
                        return strArr;
                    }
                }
                return null;
            }
            strArr = new String[1];
            strArr[0] = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
            return strArr;
        } catch (Throwable unused2) {
            strArr = null;
        }
    }
}
