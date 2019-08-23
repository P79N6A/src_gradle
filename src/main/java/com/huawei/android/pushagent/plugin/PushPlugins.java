package com.huawei.android.pushagent.plugin;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.plugin.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PushPlugins {

    /* renamed from: a  reason: collision with root package name */
    private static String f25111a = "PushLogSC2815";

    /* renamed from: d  reason: collision with root package name */
    private static ExecutorService f25112d;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f25113b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f25114c;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue(50));
        f25112d = threadPoolExecutor;
    }

    public PushPlugins(Context context, String str) {
        this.f25113b = context;
        this.f25114c = str;
    }

    private void a(String str, long j, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            new Thread(new a(this, str, str2, str3)).start();
        } else {
            e.b(f25111a, "tagInfo is empty, cannot report");
        }
    }

    private int b(String str, long j, String str2, String str3) {
        String str4;
        StringBuilder sb;
        String message;
        if (!TextUtils.isEmpty(str)) {
            try {
                return ((Integer) f25112d.submit(new b(this, str, str2, str3)).get()).intValue();
            } catch (InterruptedException e2) {
                str4 = f25111a;
                sb = new StringBuilder("report tags excepiton, error:");
                message = e2.getMessage();
                sb.append(message);
                e.d(str4, sb.toString());
                return 907122002;
            } catch (ExecutionException e3) {
                str4 = f25111a;
                sb = new StringBuilder("report tags excepiton, error:");
                message = e3.getMessage();
                sb.append(message);
                e.d(str4, sb.toString());
                return 907122002;
            }
        } else {
            e.b(f25111a, "tagInfo is empty, cannot report");
            return 907122003;
        }
    }

    public b getPluginType(int i) {
        if (b.LBS.a() == i) {
            return b.LBS;
        }
        if (b.TAG.a() == i) {
            return b.TAG;
        }
        return null;
    }

    public void reportPlus(int i, String str, long j, String str2, String str3) {
        if (b.TAG.a() == i) {
            a(str, j, str2, str3);
        } else {
            e.b(f25111a, "plusType is error, cannot match any plugin");
        }
    }

    public int syncReportPlus(int i, String str, long j, String str2, String str3) {
        if (b.TAG.a() == i) {
            return b(str, j, str2, str3);
        }
        e.b(f25111a, "plusType is error:[907122003], cannot match any plugin");
        return 907122003;
    }
}
