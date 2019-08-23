package com.ss.ttm.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.StatFs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HardWareInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int[] mArmArchitecture = new int[3];
    private static int mCpuType;
    private BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{context, intent2}, this, changeQuickRedirect, false, 91154, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, intent2}, this, changeQuickRedirect, false, 91154, new Class[]{Context.class, Intent.class}, Void.TYPE);
                return;
            }
            intent2.getIntExtra("level", 0);
        }
    };

    public static int getCpuFamily() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91153, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91153, new Class[0], Integer.TYPE)).intValue();
        }
        if (mCpuType == 0) {
            getCpuInfo();
            mCpuType = mArmArchitecture[0];
        }
        return mCpuType;
    }

    public static long[] getSDCardSize() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91150, new Class[0], long[].class)) {
            return (long[]) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91150, new Class[0], long[].class);
        }
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = (long) statFs.getBlockSize();
            jArr[0] = ((long) statFs.getBlockCount()) * blockSize;
            jArr[1] = blockSize * ((long) statFs.getAvailableBlocks());
        }
        return jArr;
    }

    public static int[] getCpuInfo() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91148, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91148, new Class[0], int[].class);
        }
        FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.replaceAll("\t", "").toLowerCase().split(":");
                    if (split.length == 2) {
                        String trim = split[0].trim();
                        String trim2 = split[1].trim();
                        if (!(trim2 == null || trim == null)) {
                            if (trim.compareTo("processor") == 0) {
                                if (trim2.contains("armv")) {
                                    break;
                                } else if (trim2.contains("aarch64")) {
                                    break;
                                } else if (trim2.contains("intel")) {
                                    mArmArchitecture[0] = 2;
                                    break;
                                }
                            } else if (trim.compareToIgnoreCase("features") == 0) {
                                if (trim2.contains("neon") || trim2.contains("thumb") || trim2.contains("vfpv") || trim2.contains("asimd") || trim2.contains("simd")) {
                                    mArmArchitecture[0] = 1;
                                }
                            } else if (trim.compareToIgnoreCase("model name") != 0) {
                                continue;
                            } else if (trim2.contains("intel")) {
                                mArmArchitecture[0] = 2;
                                break;
                            } else if (trim2.contains("arm")) {
                                mArmArchitecture[0] = 1;
                                break;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                bufferedReader.close();
                inputStreamReader.close();
                fileInputStream.close();
                throw th;
            }
        }
        mArmArchitecture[0] = 1;
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
        return mArmArchitecture;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x009a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getProcessCpuInfo() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Long.TYPE
            r2 = 0
            r4 = 1
            r5 = 91152(0x16410, float:1.27731E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 91152(0x16410, float:1.27731E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x002c:
            r0 = 0
            r1 = 0
            int r3 = android.os.Process.myPid()     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.lang.String r8 = "/proc/"
            r7.<init>(r8)     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            r7.append(r3)     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.lang.String r3 = "/stat"
            r7.append(r3)     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.lang.String r3 = r7.toString()     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r4.<init>(r5, r3)     // Catch:{ IOException -> 0x009a, all -> 0x0095 }
            java.lang.String r0 = r4.readLine()     // Catch:{ IOException -> 0x0093, all -> 0x008f }
            r4.close()     // Catch:{ IOException -> 0x0093, all -> 0x008f }
            java.lang.String r3 = " "
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ IOException -> 0x0093, all -> 0x008f }
            r4.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r3 = 13
            r3 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r5 = 14
            r5 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r7 = 0
            long r3 = r3 + r5
            r5 = 15
            r5 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r7 = 0
            long r3 = r3 + r5
            r5 = 16
            r0 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x008e }
            r0 = 0
            long r3 = r3 + r5
            return r3
        L_0x008e:
            return r1
        L_0x008f:
            r0 = move-exception
            r1 = r0
            r0 = r4
            goto L_0x0096
        L_0x0093:
            r0 = r4
            goto L_0x009a
        L_0x0095:
            r1 = move-exception
        L_0x0096:
            r0.close()     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            throw r1
        L_0x009a:
            r0.close()     // Catch:{ Exception -> 0x009d }
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.HardWareInfo.getProcessCpuInfo():long");
    }

    public static int[] getCpuArchitecture() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91149, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91149, new Class[0], int[].class);
        }
        try {
            fileInputStream = new FileInputStream("/proc/cpuinfo");
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.replace("\t", "").split(":");
                if (split.length == 2) {
                    String trim = split[0].trim();
                    String trim2 = split[1].trim();
                    if (trim.compareTo("Processor") == 0) {
                        String str = "";
                        for (int indexOf = trim2.indexOf("ARMv") + 4; indexOf < trim2.length(); indexOf++) {
                            if (!(trim2.charAt(indexOf)).matches("\\d")) {
                                break;
                            }
                            str = str + r12;
                        }
                        mArmArchitecture[0] = 1;
                        mArmArchitecture[1] = Integer.parseInt(str);
                    } else if (trim.compareToIgnoreCase("Features") == 0) {
                        if (trim2.contains("neon")) {
                            mArmArchitecture[2] = 0;
                        }
                    } else if (trim.compareToIgnoreCase("model name") == 0) {
                        if (trim2.contains("Intel")) {
                            mArmArchitecture[0] = 2;
                            mArmArchitecture[2] = 1;
                        }
                    } else if (trim.compareToIgnoreCase("cpu family") == 0) {
                        mArmArchitecture[1] = Integer.parseInt(trim2);
                    }
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception unused) {
        } catch (Throwable th) {
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            throw th;
        }
        return mArmArchitecture;
    }

    public String[] getOtherInfo(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 91151, new Class[]{Context.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 91151, new Class[]{Context.class}, String[].class);
        }
        String[] strArr = {"null", "null"};
        WifiInfo connectionInfo = ((WifiManager) context2.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo.getMacAddress() != null) {
            strArr[0] = connectionInfo.getMacAddress();
        } else {
            strArr[0] = "Fail";
        }
        return strArr;
    }
}
