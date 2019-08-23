package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ik;
import com.xiaomi.push.io;
import com.xiaomi.push.ix;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.aj;
import com.xiaomi.push.service.be;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MiTinyDataClient {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static a f81739a;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with other field name */
        public Context f80a;

        /* renamed from: a  reason: collision with other field name */
        private C0870a f81a = new C0870a();

        /* renamed from: a  reason: collision with other field name */
        private Boolean f82a;

        /* renamed from: a  reason: collision with other field name */
        private String f83a;

        /* renamed from: a  reason: collision with other field name */
        private final ArrayList<io> f84a = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a  reason: collision with other inner class name */
        public class C0870a {

            /* renamed from: a  reason: collision with other field name */
            private final Runnable f85a = new am(this);

            /* renamed from: a  reason: collision with other field name */
            public final ArrayList<io> f86a = new ArrayList<>();
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with other field name */
            public ScheduledFuture<?> f87a;

            /* renamed from: a  reason: collision with other field name */
            private ScheduledThreadPoolExecutor f88a = new ScheduledThreadPoolExecutor(1);

            public C0870a() {
            }

            private void a() {
                if (this.f87a == null) {
                    this.f87a = this.f88a.scheduleAtFixedRate(this.f85a, 1000, 1000, TimeUnit.MILLISECONDS);
                }
            }

            /* access modifiers changed from: private */
            public void b() {
                io remove = this.f86a.remove(0);
                for (jj a2 : be.a(Arrays.asList(new io[]{remove}), a.this.f80a.getPackageName(), d.a(a.this.f80a).a(), 30720)) {
                    b.c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.d());
                    ay.a(a.this.f80a).a(a2, ik.Notification, true, (ix) null);
                }
            }

            public void a(io ioVar) {
                this.f88a.execute(new al(this, ioVar));
            }
        }

        public static a a() {
            if (f81739a == null) {
                synchronized (a.class) {
                    try {
                        if (f81739a == null) {
                            f81739a = new a();
                        }
                    } catch (Throwable th) {
                        Class<a> cls = a.class;
                        throw th;
                    }
                }
            }
            return f81739a;
        }

        private void a(io ioVar) {
            synchronized (this.f84a) {
                if (!this.f84a.contains(ioVar)) {
                    this.f84a.add(ioVar);
                    if (this.f84a.size() > 100) {
                        this.f84a.remove(0);
                    }
                }
            }
        }

        private boolean a(Context context) {
            if (ay.a(context).a()) {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                    if (packageInfo == null) {
                        return false;
                    }
                    if (packageInfo.versionCode < 108) {
                        return false;
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        }

        private boolean b(Context context) {
            return d.a(context).a() == null && !a(this.f80a);
        }

        private boolean b(io ioVar) {
            if (be.a(ioVar, false)) {
                return false;
            }
            if (this.f82a.booleanValue()) {
                b.c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + ioVar.d());
                ay.a(this.f80a).a(ioVar);
            } else {
                this.f81a.a(ioVar);
            }
            return true;
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m32a(Context context) {
            if (context == null) {
                b.a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f80a = context;
            this.f82a = Boolean.valueOf(a(context));
            b("com.xiaomi.xmpushsdk.tinydataPending.init");
        }

        public void a(String str) {
            synchronized (this) {
                if (TextUtils.isEmpty(str)) {
                    b.a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
                } else {
                    this.f83a = str;
                    b("com.xiaomi.xmpushsdk.tinydataPending.channel");
                }
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m33a() {
            return this.f80a != null;
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m34a(io ioVar) {
            boolean z;
            String str;
            synchronized (this) {
                z = false;
                if (ioVar != null) {
                    if (!be.a(ioVar, true)) {
                        boolean z2 = TextUtils.isEmpty(ioVar.a()) && TextUtils.isEmpty(this.f83a);
                        boolean z3 = !a();
                        if (this.f80a == null || b(this.f80a)) {
                            z = true;
                        }
                        if (!z3 && !z2) {
                            if (!z) {
                                b.c("MiTinyDataClient Send item immediately." + ioVar.d());
                                if (TextUtils.isEmpty(ioVar.d())) {
                                    ioVar.f(aj.a());
                                }
                                if (TextUtils.isEmpty(ioVar.a())) {
                                    ioVar.a(this.f83a);
                                }
                                if (TextUtils.isEmpty(ioVar.c())) {
                                    ioVar.e(this.f80a.getPackageName());
                                }
                                if (ioVar.a() <= 0) {
                                    ioVar.b(System.currentTimeMillis());
                                }
                                z = b(ioVar);
                            }
                        }
                        if (z2) {
                            str = "MiTinyDataClient Pending " + ioVar.b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.channel";
                        } else if (z3) {
                            str = "MiTinyDataClient Pending " + ioVar.b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.init";
                        } else {
                            if (z) {
                                str = "MiTinyDataClient Pending " + ioVar.b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.appId";
                            }
                            a(ioVar);
                            z = true;
                        }
                        b.c(str);
                        a(ioVar);
                        z = true;
                    }
                }
            }
            return z;
        }

        public void b(String str) {
            b.c("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f84a) {
                arrayList.addAll(this.f84a);
                this.f84a.clear();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a((io) it2.next());
            }
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            b.a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        a.a().a(context);
        if (TextUtils.isEmpty(str)) {
            b.a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            a.a().a(str);
        }
    }

    public static boolean upload(Context context, io ioVar) {
        b.c("MiTinyDataClient.upload " + ioVar.d());
        if (!a.a().a()) {
            a.a().a(context);
        }
        return a.a().a(ioVar);
    }

    public static boolean upload(Context context, String str, String str2, long j, String str3) {
        io ioVar = new io();
        ioVar.d(str);
        ioVar.c(str2);
        ioVar.a(j);
        ioVar.b(str3);
        ioVar.a(true);
        ioVar.a("push_sdk_channel");
        return upload(context, ioVar);
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        io ioVar = new io();
        ioVar.d(str);
        ioVar.c(str2);
        ioVar.a(j);
        ioVar.b(str3);
        return a.a().a(ioVar);
    }
}
