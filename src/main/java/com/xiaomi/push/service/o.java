package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<Pair<String, byte[]>> f82590a = new ArrayList<>();

    /* renamed from: a  reason: collision with other field name */
    private static final Map<String, byte[]> f1001a = new HashMap();

    public static void a(Context context, int i, String str) {
        synchronized (f1001a) {
            for (String next : f1001a.keySet()) {
                a(context, next, f1001a.get(next), i, str);
            }
            f1001a.clear();
        }
    }

    public static void a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, w.a(str));
    }

    public static void a(XMPushService xMPushService) {
        try {
            synchronized (f1001a) {
                for (String next : f1001a.keySet()) {
                    w.a(xMPushService, next, f1001a.get(next));
                }
                f1001a.clear();
            }
        } catch (hb e2) {
            b.a((Throwable) e2);
            xMPushService.a(10, (Exception) e2);
        }
    }

    public static void a(String str, byte[] bArr) {
        synchronized (f1001a) {
            f1001a.put(str, bArr);
        }
    }

    public static void b(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f82590a) {
                arrayList = f82590a;
                f82590a = new ArrayList<>();
            }
            Iterator<Pair<String, byte[]>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair next = it2.next();
                w.a(xMPushService, (String) next.first, (byte[]) next.second);
            }
        } catch (hb e2) {
            b.a((Throwable) e2);
            xMPushService.a(10, (Exception) e2);
        }
    }

    public static void b(String str, byte[] bArr) {
        synchronized (f82590a) {
            f82590a.add(new Pair(str, bArr));
            if (f82590a.size() > 50) {
                f82590a.remove(0);
            }
        }
    }
}
