package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.dr;
import com.xiaomi.push.fh;
import com.xiaomi.push.ic;
import com.xiaomi.push.z;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class ac {

    /* renamed from: a  reason: collision with root package name */
    private static long f82486a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static ThreadPoolExecutor f920a;

    /* renamed from: a  reason: collision with other field name */
    private static final Pattern f921a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f920a = threadPoolExecutor;
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append("\n");
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        z.a((Closeable) bufferedReader);
                        return sb2;
                    }
                }
            } catch (Exception unused) {
                z.a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                z.a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
            z.a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            z.a((Closeable) bufferedReader2);
            throw th;
        }
    }

    public static void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if ((f920a.getActiveCount() <= 0 || currentTimeMillis - f82486a >= 1800000) && ic.a().a()) {
            fh.a a2 = ba.a().a();
            if (a2 != null && a2.e() > 0) {
                f82486a = currentTimeMillis;
                a(a2.a(), true);
            }
        }
    }

    public static void a(List<String> list, boolean z) {
        f920a.execute(new ad(list, z));
    }

    public static void b() {
        String a2 = a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(a2)) {
            b.a("dump tcp for uid = " + Process.myUid());
            b.a(a2);
        }
        String a3 = a("/proc/self/net/tcp6");
        if (!TextUtils.isEmpty(a3)) {
            b.a("dump tcp6 for uid = " + Process.myUid());
            b.a(a3);
        }
    }

    private static boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            b.a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(dr.a(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            long currentTimeMillis2 = System.currentTimeMillis();
            b.a("ConnectivityTest: connect to " + str + " in " + (currentTimeMillis2 - currentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th) {
            b.d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }
}
