package anet.channel.strategy;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static File f1415a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f1416b;

    /* renamed from: c  reason: collision with root package name */
    private static Comparator<File> f1417c = new n();

    m() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized java.io.File[] b() {
        /*
            java.lang.Class<anet.channel.strategy.m> r0 = anet.channel.strategy.m.class
            monitor-enter(r0)
            java.io.File r1 = f1415a     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x000a
            r1 = 0
            monitor-exit(r0)
            return r1
        L_0x000a:
            java.io.File r1 = f1415a     // Catch:{ all -> 0x0019 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            java.util.Comparator<java.io.File> r2 = f1417c     // Catch:{ all -> 0x0019 }
            java.util.Arrays.sort(r1, r2)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)
            return r1
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.m.b():java.io.File[]");
    }

    static synchronized void a() {
        synchronized (m.class) {
            ALog.i("awcn.StrategySerializeHelper", "clear start.", null, new Object[0]);
            if (f1415a == null) {
                ALog.w("awcn.StrategySerializeHelper", "folder path not initialized, wait to clear", null, new Object[0]);
                f1416b = true;
                return;
            }
            File[] listFiles = f1415a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
                ALog.i("awcn.StrategySerializeHelper", "clear end.", null, new Object[0]);
            }
        }
    }

    static synchronized void c() {
        synchronized (m.class) {
            File[] b2 = b();
            if (b2 != null) {
                int i = 0;
                for (File file : b2) {
                    if (!file.isDirectory()) {
                        if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                            file.delete();
                        } else if (file.getName().startsWith("WIFI")) {
                            int i2 = i + 1;
                            if (((long) i) > 10) {
                                file.delete();
                            }
                            i = i2;
                        }
                    }
                }
            }
        }
    }

    public static File a(String str) {
        a(f1415a);
        return new File(f1415a, str);
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir(), "awcn_strategy");
                f1415a = file;
                if (!a(file)) {
                    ALog.e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f1415a.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(f1415a, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    f1415a = file2;
                    if (!a(file2)) {
                        ALog.e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f1415a.getAbsolutePath());
                    }
                }
                ALog.i("awcn.StrategySerializeHelper", "StrateyFolder", null, "path", f1415a.getAbsolutePath());
                if (f1416b) {
                    a();
                    f1416b = false;
                    return;
                }
                c();
            } catch (Throwable th) {
                ALog.e("awcn.StrategySerializeHelper", "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    private static boolean a(File file) {
        if (file == null || file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    static synchronized <T> T a(String str, StrategyStatObject strategyStatObject) {
        T restore;
        synchronized (m.class) {
            restore = SerializeHelper.restore(a(str), strategyStatObject);
        }
        return restore;
    }

    static synchronized void a(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        synchronized (m.class) {
            SerializeHelper.persist(serializable, a(str), strategyStatObject);
        }
    }
}
