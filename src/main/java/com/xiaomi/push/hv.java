package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.am;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hv {

    /* renamed from: a  reason: collision with root package name */
    private static int f82205a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static long f501a = System.currentTimeMillis();

    /* renamed from: a  reason: collision with other field name */
    private static am f502a = new am(true);

    /* renamed from: a  reason: collision with other field name */
    private static com.xiaomi.push.providers.a f503a = null;

    /* renamed from: a  reason: collision with other field name */
    private static final Object f504a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static String f505a = "";

    /* renamed from: a  reason: collision with other field name */
    private static List<a> f506a = Collections.synchronizedList(new ArrayList());

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f82206a = -1;

        /* renamed from: a  reason: collision with other field name */
        public long f507a;

        /* renamed from: a  reason: collision with other field name */
        public String f508a = "";

        /* renamed from: b  reason: collision with root package name */
        public int f82207b = -1;

        /* renamed from: b  reason: collision with other field name */
        public long f509b;

        /* renamed from: b  reason: collision with other field name */
        public String f510b = "";

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.f508a = str;
            this.f507a = j;
            this.f82206a = i;
            this.f82207b = i2;
            this.f510b = str2;
            this.f509b = j2;
        }

        public boolean a(a aVar) {
            return TextUtils.equals(aVar.f508a, this.f508a) && TextUtils.equals(aVar.f510b, this.f510b) && aVar.f82206a == this.f82206a && aVar.f82207b == this.f82207b && Math.abs(aVar.f507a - this.f507a) <= 5000;
        }
    }

    public static int a(Context context) {
        if (f82205a == -1) {
            f82205a = b(context);
        }
        return f82205a;
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    private static long a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f501a;
            f501a = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (((long) (i == 0 ? 13 : 11)) * j) / 10;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static com.xiaomi.push.providers.a m379a(Context context) {
        if (f503a != null) {
            return f503a;
        }
        com.xiaomi.push.providers.a aVar = new com.xiaomi.push.providers.a(context);
        f503a = aVar;
        return aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String m380a(Context context) {
        String str;
        synchronized (hv.class) {
            try {
                if (m.d()) {
                    str = "";
                } else {
                    if (TextUtils.isEmpty(f505a)) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager != null) {
                                f505a = telephonyManager.getSubscriberId();
                            }
                        } catch (Exception unused) {
                        }
                    }
                    str = f505a;
                }
            } catch (Throwable th) {
                Class<hv> cls = hv.class;
                throw th;
            }
        }
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m381a(Context context) {
        f82205a = b(context);
    }

    private static void a(Context context, String str, long j, boolean z, long j2) {
        boolean isEmpty;
        if (context != null && !TextUtils.isEmpty(str) && "com.xiaomi.xmsf".equals(context.getPackageName())) {
            String str2 = str;
            if (!"com.xiaomi.xmsf".equals(str)) {
                int a2 = a(context);
                if (-1 != a2) {
                    synchronized (f504a) {
                        isEmpty = f506a.isEmpty();
                        r2 = r2;
                        a aVar = new a(str, j2, a2, z ? 1 : 0, a2 == 0 ? a(context) : "", j);
                        a(aVar);
                    }
                    if (isEmpty) {
                        f502a.a((am.b) new hw(context), 5000);
                    }
                }
            }
        }
    }

    public static void a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        a(context, str, a(a(context), j, z, j2, z2), z, j2);
    }

    private static void a(a aVar) {
        for (a next : f506a) {
            if (next.a(aVar)) {
                next.f509b += aVar.f509b;
                return;
            }
        }
        f506a.add(aVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m382a(String str) {
        synchronized (hv.class) {
            try {
                if (!m.d() && !TextUtils.isEmpty(str)) {
                    f505a = str;
                }
            } catch (Throwable th) {
                Class<hv> cls = hv.class;
                throw th;
            }
        }
    }

    private static int b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public static void b(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.f882a) {
                SQLiteDatabase writableDatabase = a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (a next : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package_name", next.f508a);
                        contentValues.put("message_ts", Long.valueOf(next.f507a));
                        contentValues.put("network_type", Integer.valueOf(next.f82206a));
                        contentValues.put("bytes", Long.valueOf(next.f509b));
                        contentValues.put("rcv", Integer.valueOf(next.f82207b));
                        contentValues.put("imsi", next.f510b);
                        writableDatabase.insert("traffic", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLiteException e2) {
            b.a((Throwable) e2);
        }
    }
}
