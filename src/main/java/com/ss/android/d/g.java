package com.ss.android.d;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.d.c.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static int f28403a;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f28404b = {"goldfish"};

    /* renamed from: c  reason: collision with root package name */
    private static String[] f28405c = {"/dev/socket/qemud", "/dev/qemu_pipe", "/dev/qemu_trace"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f28406d = {"000000000000000", "012345678912345"};

    private static Boolean a() {
        String str;
        File file = new File("/proc/tty/drivers");
        if (!file.exists() || !file.canRead()) {
            StringBuilder sb = new StringBuilder("can not read file /proc/tty/drivers ，because");
            if (file.exists()) {
                str = "not exist";
            } else {
                str = "not readable";
            }
            sb.append(str);
            Logger.e("EmulatorChecker", sb.toString());
        } else {
            byte[] bArr = new byte[1024];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception unused) {
            }
            String str2 = new String(bArr);
            for (String contains : f28404b) {
                if (str2.contains(contains)) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    private static boolean a(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        try {
            new FileInputStream(file);
            return true;
        } catch (FileNotFoundException e2) {
            if (!e2.getMessage().contains("No such file or directory")) {
                return true;
            }
            return false;
        }
    }

    private static int a(e eVar) {
        int i;
        int i2;
        String[] strArr = {"/system/bin/qemu_props", "/system/bin/androVM-prop", "/system/bin/microvirt-prop", "/system/lib/libdroid4x.so", "/system/bin/windroyed", "/system/bin/microvirtd", "/system/bin/nox-prop", "/system/bin/ttVM-prop", "/system/bin/droid4x-prop", "/data/.bluestacks.prop"};
        String[] strArr2 = {"init.svc.vbox86-setup", "init.svc.droid4x", "init.svc.qemud", "init.svc.su_kpbs_daemon", "init.svc.noxd", "init.svc.ttVM_x86-setup", "init.svc.xxkmsg", "init.svc.microvirtd", "ro.kernel.android.qemud", "androVM.vbox_dpi", "androVM.vbox_graph_mode"};
        int i3 = 0;
        for (int i4 = 0; i4 < 10; i4++) {
            if (a(strArr[i4])) {
                i2 = 1 << i4;
            } else {
                i2 = 0;
            }
            i3 |= i2;
            a(strArr[i4]);
        }
        int i5 = 10;
        for (int i6 = 0; i6 < 11; i6++) {
            String str = strArr2[i6];
            if (StringUtils.isEmpty(eVar.a(str))) {
                i = 0;
            } else {
                i = 1 << i5;
            }
            i3 |= i;
            StringUtils.isEmpty(eVar.a(str));
            i5++;
        }
        Pair pair = new Pair("ro.product.manufacturer", "Genymotion");
        String a2 = eVar.a((String) pair.first);
        if (StringUtils.isEmpty(a2) || !a2.contains((CharSequence) pair.second)) {
            return i3;
        }
        return i3 | (1 << i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r10, org.json.JSONObject r11) throws org.json.JSONException {
        /*
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = com.ss.android.d.c.c.f()     // Catch:{ Exception -> 0x0016 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0016 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "kernel"
            java.lang.String r1 = com.ss.android.d.c.c.f()     // Catch:{ Exception -> 0x0016 }
            r11.put(r0, r1)     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            java.lang.String r0 = "gravity"
            java.lang.String r1 = "sensor"
            java.lang.Object r1 = r10.getSystemService(r1)
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1
            r2 = -1
            java.util.List r1 = r1.getSensorList(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0029:
            boolean r3 = r1.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r1.next()
            android.hardware.Sensor r3 = (android.hardware.Sensor) r3
            int r3 = r3.getType()
            r6 = 9
            if (r3 != r6) goto L_0x0029
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            r11.put(r0, r1)
            java.lang.String r0 = "battery_temp"
            r1 = 0
            if (r10 == 0) goto L_0x007e
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r6)
            android.content.Intent r3 = r10.registerReceiver(r1, r3)
            if (r3 == 0) goto L_0x007e
            java.lang.String r6 = "temperature"
            int r3 = r3.getIntExtra(r6, r2)
            if (r3 <= 0) goto L_0x007e
            float r3 = (float) r3
            r6 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 / r6
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x006b
            java.lang.String r3 = ""
            goto L_0x007f
        L_0x006b:
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r7 = "%.1f°C"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r8[r5] = r3
            java.lang.String r3 = java.lang.String.format(r6, r7, r8)
            goto L_0x007f
        L_0x007e:
            r3 = r1
        L_0x007f:
            r11.put(r0, r3)
            java.lang.String r0 = "battery_volt"
            if (r10 == 0) goto L_0x009f
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r6)
            android.content.Intent r3 = r10.registerReceiver(r1, r3)
            if (r3 == 0) goto L_0x009f
            java.lang.String r6 = "voltage"
            int r2 = r3.getIntExtra(r6, r2)
            if (r2 <= 0) goto L_0x009f
            java.lang.String r1 = java.lang.String.valueOf(r2)
        L_0x009f:
            r11.put(r0, r1)
            java.lang.String r0 = "gps"
            java.lang.String r1 = "location"
            java.lang.Object r1 = r10.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 != 0) goto L_0x00b0
        L_0x00ae:
            r1 = 0
            goto L_0x00bd
        L_0x00b0:
            java.util.List r1 = r1.getAllProviders()
            if (r1 != 0) goto L_0x00b7
            goto L_0x00ae
        L_0x00b7:
            java.lang.String r2 = "gps"
            boolean r1 = r1.contains(r2)
        L_0x00bd:
            r11.put(r0, r1)
            int r0 = com.ss.android.d.c.c.e()
            java.lang.String r0 = com.ss.android.d.c.c.a((int) r0)
            java.lang.String r1 = "cpu_freq"
            r11.put(r1, r0)
            com.ss.android.d.c.e r0 = new com.ss.android.d.c.e
            r0.<init>()
            java.lang.Boolean r1 = a()
            boolean r1 = r1.booleanValue()
            int r2 = f28403a
            if (r1 == 0) goto L_0x00e0
            r3 = 2
            goto L_0x00e1
        L_0x00e0:
            r3 = 0
        L_0x00e1:
            r2 = r2 | r3
            f28403a = r2
            int r2 = a((com.ss.android.d.c.e) r0)
            int r3 = f28403a
            if (r2 <= 0) goto L_0x00ee
            r6 = 4
            goto L_0x00ef
        L_0x00ee:
            r6 = 0
        L_0x00ef:
            r3 = r3 | r6
            f28403a = r3
            com.ss.android.d.b.a.a r3 = com.ss.android.d.f.a(r10)
            java.lang.String r6 = r3.d()
            java.lang.String[] r3 = r3.c()
            java.lang.String r7 = com.ss.android.d.c.c.l(r10)
            boolean r10 = a(r10, r6, r3, r7)
            int r3 = f28403a
            if (r10 == 0) goto L_0x010d
            r6 = 8
            goto L_0x010e
        L_0x010d:
            r6 = 0
        L_0x010e:
            r3 = r3 | r6
            f28403a = r3
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r6 = android.os.Build.DEVICE
            java.lang.String r7 = android.os.Build.HARDWARE
            java.lang.String r8 = android.os.Build.HOST
            if (r3 == 0) goto L_0x0123
            java.lang.String r9 = "generic"
            boolean r3 = r3.contains(r9)
            if (r3 != 0) goto L_0x013f
        L_0x0123:
            if (r6 == 0) goto L_0x012d
            java.lang.String r3 = "generic"
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x013f
        L_0x012d:
            if (r7 == 0) goto L_0x0137
            java.lang.String r3 = "goldfish"
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x013f
        L_0x0137:
            java.lang.String r3 = "android-test"
            boolean r3 = com.bytedance.common.utility.StringUtils.equal(r8, r3)
            if (r3 == 0) goto L_0x0141
        L_0x013f:
            r3 = 1
            goto L_0x0142
        L_0x0141:
            r3 = 0
        L_0x0142:
            int r6 = f28403a
            if (r3 == 0) goto L_0x0149
            r7 = 16
            goto L_0x014a
        L_0x0149:
            r7 = 0
        L_0x014a:
            r6 = r6 | r7
            f28403a = r6
            java.util.HashMap r6 = new java.util.HashMap
            r7 = 6
            r6.<init>(r7)
            java.lang.String r7 = "ro.hardware"
            java.lang.String r8 = "goldfish"
            r6.put(r7, r8)
            java.lang.String r7 = "ro.product.device"
            java.lang.String r8 = "generic"
            r6.put(r7, r8)
            java.lang.String r7 = "ro.product.model"
            java.lang.String r8 = "sdk"
            r6.put(r7, r8)
            java.lang.String r7 = "ro.product.name"
            java.lang.String r8 = "sdk"
            r6.put(r7, r8)
            java.lang.String r7 = "init.svc.vbox86-setup"
            java.lang.String r8 = "stopped"
            r6.put(r7, r8)
            java.lang.String r7 = "init.svc.vbox86-setup"
            java.lang.String r8 = "running"
            r6.put(r7, r8)
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0185:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01a3
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r0.a(r8)
            java.lang.Object r8 = r6.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = com.bytedance.common.utility.StringUtils.equal(r9, r8)
            if (r8 == 0) goto L_0x0185
            r0 = 1
            goto L_0x01a4
        L_0x01a3:
            r0 = 0
        L_0x01a4:
            int r6 = f28403a
            if (r0 == 0) goto L_0x01ab
            r7 = 32
            goto L_0x01ac
        L_0x01ab:
            r7 = 0
        L_0x01ac:
            r6 = r6 | r7
            f28403a = r6
            boolean r6 = android.app.ActivityManager.isUserAMonkey()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 11
            if (r7 < r8) goto L_0x01c5
            if (r6 != 0) goto L_0x01c4
            boolean r6 = android.app.ActivityManager.isRunningInTestHarness()
            if (r6 == 0) goto L_0x01c2
            goto L_0x01c4
        L_0x01c2:
            r6 = 0
            goto L_0x01c5
        L_0x01c4:
            r6 = 1
        L_0x01c5:
            int r7 = f28403a
            if (r6 == 0) goto L_0x01cc
            r8 = 64
            goto L_0x01cd
        L_0x01cc:
            r8 = 0
        L_0x01cd:
            r7 = r7 | r8
            f28403a = r7
            java.lang.String r7 = "/sys/class/thermal/thermal_zone0"
            boolean r7 = a((java.lang.String) r7)
            int r8 = f28403a
            if (r7 == 0) goto L_0x01dc
            r9 = 0
            goto L_0x01de
        L_0x01dc:
            r9 = 128(0x80, float:1.794E-43)
        L_0x01de:
            r8 = r8 | r9
            f28403a = r8
            if (r1 != 0) goto L_0x01f1
            if (r2 > 0) goto L_0x01f1
            if (r10 != 0) goto L_0x01f1
            if (r3 != 0) goto L_0x01f1
            if (r0 != 0) goto L_0x01f1
            if (r6 != 0) goto L_0x01f1
            if (r7 != 0) goto L_0x01f0
            goto L_0x01f1
        L_0x01f0:
            r4 = 0
        L_0x01f1:
            int r10 = f28403a
            r10 = r10 | r4
            f28403a = r10
            java.lang.String r10 = "emulator"
            int r0 = f28403a
            r11.put(r10, r0)
            java.lang.String r10 = "emulator_file_flag"
            r11.put(r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.g.a(android.content.Context, org.json.JSONObject):void");
    }

    private static boolean a(Context context, String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = false;
            for (String str3 : f28406d) {
                if (z2 || StringUtils.equal(str3, str)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        if (strArr != null) {
            for (String equal : strArr) {
                if (StringUtils.equal(equal, "310260000000000") || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        }
        if (z2 || StringUtils.equal(str2, "15552175049")) {
            return true;
        }
        return false;
    }
}
