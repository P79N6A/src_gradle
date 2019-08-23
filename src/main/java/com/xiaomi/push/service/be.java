package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.az;
import com.xiaomi.push.in;
import com.xiaomi.push.io;
import com.xiaomi.push.iu;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import com.xiaomi.push.u;
import com.xiaomi.push.z;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class be {

    /* renamed from: a  reason: collision with root package name */
    private static String f82542a;

    /* renamed from: a  reason: collision with other field name */
    private static SimpleDateFormat f974a;

    /* renamed from: a  reason: collision with other field name */
    private static AtomicLong f975a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f974a = simpleDateFormat;
        f82542a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static String a() {
        String str;
        synchronized (be.class) {
            try {
                String format = f974a.format(Long.valueOf(System.currentTimeMillis()));
                if (!TextUtils.equals(f82542a, format)) {
                    f975a.set(0);
                    f82542a = format;
                }
                str = format + "-" + f975a.incrementAndGet();
            } catch (Throwable th) {
                Class<be> cls = be.class;
                throw th;
            }
        }
        return str;
    }

    public static ArrayList<jj> a(List<io> list, String str, String str2, int i) {
        String str3;
        ArrayList<jj> arrayList = null;
        if (list == null) {
            str3 = "requests can not be null in TinyDataHelper.transToThriftObj().";
        } else if (list.size() == 0) {
            str3 = "requests.length is 0 in TinyDataHelper.transToThriftObj().";
        } else {
            arrayList = new ArrayList<>();
            in inVar = new in();
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                io ioVar = list.get(i3);
                if (ioVar != null) {
                    int length = ju.a(ioVar).length;
                    if (length > i) {
                        b.d("TinyData is too big, ignore upload request item:" + ioVar.d());
                    } else {
                        if (i2 + length > i) {
                            jj jjVar = new jj("-1", false);
                            jjVar.d(str);
                            jjVar.b(str2);
                            jjVar.c(iu.UploadTinyData.f570a);
                            jjVar.a(z.a(ju.a(inVar)));
                            arrayList.add(jjVar);
                            inVar = new in();
                            i2 = 0;
                        }
                        inVar.a(ioVar);
                        i2 += length;
                    }
                }
            }
            if (inVar.a() != 0) {
                jj jjVar2 = new jj("-1", false);
                jjVar2.d(str);
                jjVar2.b(str2);
                jjVar2.c(iu.UploadTinyData.f570a);
                jjVar2.a(z.a(ju.a(inVar)));
                arrayList.add(jjVar2);
            }
            return arrayList;
        }
        b.d(str3);
        return arrayList;
    }

    public static void a(Context context, String str, String str2, long j, String str3) {
        io ioVar = new io();
        ioVar.d(str);
        ioVar.c(str2);
        ioVar.a(j);
        ioVar.b(str3);
        ioVar.a("push_sdk_channel");
        ioVar.g(context.getPackageName());
        ioVar.e(context.getPackageName());
        ioVar.a(true);
        ioVar.b(System.currentTimeMillis());
        ioVar.f(a());
        bf.a(context, ioVar);
    }

    public static boolean a(io ioVar, boolean z) {
        String str;
        if (ioVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z && TextUtils.isEmpty(ioVar.f542a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(ioVar.f549d)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(ioVar.f548c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!az.a(ioVar.f549d)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (!az.a(ioVar.f548c)) {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (ioVar.f547b == null || ioVar.f547b.length() <= 10240) {
            return false;
        } else {
            str = "item.data is too large(" + ioVar.f547b.length() + "), max size for data is 10240" + " , verfiy ClientUploadDataItem failed.";
        }
        b.a(str);
        return true;
    }

    public static boolean a(String str) {
        return !u.b() || "com.miui.hybrid".equals(str);
    }
}
