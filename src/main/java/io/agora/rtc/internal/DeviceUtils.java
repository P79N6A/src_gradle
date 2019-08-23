package io.agora.rtc.internal;

import android.os.Build;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeviceUtils {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };
    private static final String[] H264_HW_BLACKLIST = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "P6-C00", "HM 2A", "XT105", "XT109", "XT1060"};

    public static String getCpuABI() {
        return Build.CPU_ABI;
    }

    private static int getCoresFromCPUFileList() {
        return new File("/sys/devices/system/cpu").listFiles(CPU_FILTER).length;
    }

    public static int getNumberOfCPUCores() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i = -1;
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromCPUFileList();
            }
            i = coresFromFileInfo;
        } catch (NullPointerException | SecurityException unused) {
        }
        return i;
    }

    public static int getRecommendedEncoderType() {
        if (Arrays.asList(H264_HW_BLACKLIST).contains(Build.MODEL)) {
            Logging.w("DeviceUtils", "Model: " + Build.MODEL + " has black listed H.264 encoder.");
            return 1;
        } else if (Build.VERSION.SDK_INT <= 18) {
            return 1;
        } else {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[SYNTHETIC, Splitter:B:20:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e A[SYNTHETIC, Splitter:B:28:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e A[SYNTHETIC, Splitter:B:35:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCpuName() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0034, all -> 0x002f }
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0034, all -> 0x002f }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x002b }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x002b }
            java.lang.String r2 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x002b }
            java.lang.String r3 = ":\\s+"
            r4 = 2
            java.lang.String[] r2 = r2.split(r3, r4)     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x002b }
            r1.close()     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x002b }
            r3 = 1
            r2 = r2[r3]     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x002b }
            r1.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            java.lang.String r1 = "DeviceUtils"
            java.lang.String r3 = "failed to close proc file"
            io.agora.rtc.internal.Logging.e(r1, r3, r0)
        L_0x002a:
            return r2
        L_0x002b:
            r2 = move-exception
            goto L_0x0036
        L_0x002d:
            r2 = move-exception
            goto L_0x0045
        L_0x002f:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x005c
        L_0x0034:
            r2 = move-exception
            r1 = r0
        L_0x0036:
            java.lang.String r3 = "DeviceUtils"
            java.lang.String r4 = "getCpuName failed,"
            io.agora.rtc.internal.Logging.e(r3, r4, r2)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x005a
        L_0x0043:
            r2 = move-exception
            r1 = r0
        L_0x0045:
            java.lang.String r3 = "DeviceUtils"
            java.lang.String r4 = "getCpuName failed, no /proc/cpuinfo found in system"
            io.agora.rtc.internal.Logging.e(r3, r4, r2)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x005a
        L_0x0052:
            r1 = move-exception
            java.lang.String r2 = "DeviceUtils"
            java.lang.String r3 = "failed to close proc file"
            io.agora.rtc.internal.Logging.e(r2, r3, r1)
        L_0x005a:
            return r0
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x006a
        L_0x0062:
            r1 = move-exception
            java.lang.String r2 = "DeviceUtils"
            java.lang.String r3 = "failed to close proc file"
            io.agora.rtc.internal.Logging.e(r2, r3, r1)
        L_0x006a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.DeviceUtils.getCpuName():java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getCPUMaxFreqKHz() {
        /*
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x0004:
            int r4 = getNumberOfCPUCores()     // Catch:{ IOException -> 0x0086 }
            if (r2 >= r4) goto L_0x0066
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0086 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0086 }
            r4.append(r2)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0086 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0086 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0086 }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x0086 }
            if (r4 == 0) goto L_0x0063
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x0086 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0086 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0086 }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r5 = 0
        L_0x0035:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r8 == 0) goto L_0x0042
            if (r5 >= r4) goto L_0x0042
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0042:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r5 <= r3) goto L_0x005a
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r3 = r4
        L_0x005a:
            r7.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0063
        L_0x005e:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0086 }
            throw r0     // Catch:{ IOException -> 0x0086 }
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0066:
            if (r3 != r1) goto L_0x0085
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0086 }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r2 = "cpu MHz"
            int r2 = parseFileForValue(r2, r0)     // Catch:{ all -> 0x0080 }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r2 = r3
        L_0x007b:
            r0.close()     // Catch:{ IOException -> 0x0086 }
            r1 = r2
            goto L_0x0086
        L_0x0080:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0086 }
            throw r2     // Catch:{ IOException -> 0x0086 }
        L_0x0085:
            r1 = r3
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.DeviceUtils.getCPUMaxFreqKHz():int");
    }

    public static String getDeviceId() {
        String str = Build.MANUFACTURER + "/" + Build.MODEL + "/" + Build.PRODUCT + "/" + Build.DEVICE + "/" + Build.VERSION.SDK_INT + "/" + System.getProperty("os.version");
        if (str != null) {
            str = str.toLowerCase();
        }
        Matcher matcher = Pattern.compile(".*[A-Z][A-M][0-9]$").matcher(Build.ID);
        if (!Build.BRAND.toLowerCase().equals("samsung") || !Build.DEVICE.toLowerCase().startsWith("cs02") || matcher.find() || Build.VERSION.SDK_INT != 19) {
            return str;
        }
        return "yeshen/simulator/" + Build.MODEL + "/" + Build.PRODUCT + "/" + Build.DEVICE + "/" + Build.VERSION.SDK_INT + "/" + System.getProperty("os.version");
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC, Splitter:B:16:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f A[SYNTHETIC, Splitter:B:23:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCoresFromFileInfo(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003d, all -> 0x002c }
            r1.<init>(r3)     // Catch:{ IOException -> 0x003d, all -> 0x002c }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            java.lang.String r3 = r3.readLine()     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r1.close()     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            int r3 = getCoresFromFileString(r3)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r1.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "DeviceUtils"
            java.lang.String r2 = "close file stream"
            io.agora.rtc.internal.Logging.e(r1, r2, r0)
        L_0x0027:
            return r3
        L_0x0028:
            r3 = move-exception
            goto L_0x002e
        L_0x002a:
            r0 = r1
            goto L_0x003d
        L_0x002c:
            r3 = move-exception
            r1 = r0
        L_0x002e:
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x003c
        L_0x0034:
            r0 = move-exception
            java.lang.String r1 = "DeviceUtils"
            java.lang.String r2 = "close file stream"
            io.agora.rtc.internal.Logging.e(r1, r2, r0)
        L_0x003c:
            throw r3
        L_0x003d:
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x004b
        L_0x0043:
            r3 = move-exception
            java.lang.String r0 = "DeviceUtils"
            java.lang.String r1 = "close file stream"
            io.agora.rtc.internal.Logging.e(r0, r1, r3)
        L_0x004b:
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.DeviceUtils.getCoresFromFileInfo(java.lang.String):int");
    }

    private static int extractValue(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            return extractValue(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
