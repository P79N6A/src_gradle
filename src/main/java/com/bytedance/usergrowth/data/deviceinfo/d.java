package com.bytedance.usergrowth.data.deviceinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

public final class d {
    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static long b(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                try {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
                    return memoryInfo.availMem;
                } catch (Exception unused) {
                }
            } else {
                long j = -1;
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream("/proc/meminfo");
                    try {
                        j = ((long) a("MemTotal", fileInputStream2)) * 1024;
                        return j;
                    } catch (Throwable th) {
                        FileInputStream fileInputStream3 = fileInputStream2;
                        th = th;
                        fileInputStream = fileInputStream3;
                        a((Closeable) fileInputStream);
                        throw th;
                    }
                    try {
                        a((Closeable) fileInputStream2);
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) fileInputStream);
                    throw th;
                }
            }
        }
        return 0;
    }

    public static long a(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                try {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
                    return memoryInfo.totalMem;
                } catch (Exception unused) {
                }
            } else {
                long j = -1;
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream("/proc/meminfo");
                    try {
                        j = ((long) a("MemTotal", fileInputStream2)) * 1024;
                        return j;
                    } catch (Throwable th) {
                        FileInputStream fileInputStream3 = fileInputStream2;
                        th = th;
                        fileInputStream = fileInputStream3;
                        a((Closeable) fileInputStream);
                        throw th;
                    }
                    try {
                        a((Closeable) fileInputStream2);
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) fileInputStream);
                    throw th;
                }
            }
        }
        return 0;
    }

    private static int a(String str, FileInputStream fileInputStream) {
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
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
                                i2++;
                            }
                            return -1;
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
