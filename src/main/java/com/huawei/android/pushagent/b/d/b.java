package com.huawei.android.pushagent.b.d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.android.pushagent.a.c;
import com.huawei.android.pushagent.b.b.c;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f25079e;

    /* renamed from: a  reason: collision with root package name */
    private int f25080a = 3;

    /* renamed from: b  reason: collision with root package name */
    private long f25081b = 600000;

    /* renamed from: c  reason: collision with root package name */
    private long f25082c = 300000;

    /* renamed from: d  reason: collision with root package name */
    private long f25083d = 300000;

    /* renamed from: f  reason: collision with root package name */
    private int f25084f;
    private ArrayList g = new ArrayList();

    static class a implements Comparable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f25086a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f25087b;

        a() {
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            return (int) ((a() - aVar.a()) / 1000);
        }

        public long a() {
            return this.f25086a;
        }

        public void a(long j) {
            this.f25086a = j;
        }

        public void a(boolean z) {
            this.f25087b = z;
        }

        public boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                String[] split = str.split(";");
                if (split.length < 2) {
                    e.d("PushLogAC2815", "load connectinfo " + str + " error");
                    return false;
                }
                this.f25086a = Long.parseLong(split[0]);
                this.f25087b = Boolean.parseBoolean(split[1]);
                return true;
            } catch (Exception e2) {
                e.c("PushLogAC2815", "load connectinfo " + str + " error:" + e2.toString(), e2);
                return false;
            }
        }

        public boolean b() {
            return this.f25087b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25087b == aVar.f25087b && this.f25086a == aVar.f25086a;
        }

        public int hashCode() {
            return ((((int) (this.f25086a ^ (this.f25086a >>> 32))) + 527) * 31) + (this.f25087b ? 1 : 0);
        }

        public String toString() {
            if (this.f25086a <= 0) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f25086a);
            stringBuffer.append(";");
            stringBuffer.append(this.f25087b);
            return stringBuffer.toString();
        }
    }

    /* renamed from: com.huawei.android.pushagent.b.d.b$b  reason: collision with other inner class name */
    public enum C0290b {
        SOCKET_CLOSE,
        SOCKET_CONNECTED,
        TRS_QUERIED,
        NETWORK_CHANGE
    }

    private b() {
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f25079e == null) {
                f25079e = new b();
            }
            if (f25079e.g.isEmpty()) {
                f25079e.c(context);
            }
            bVar = f25079e;
        }
        return bVar;
    }

    private void a(Context context, boolean z) {
        e.a("PushLogAC2815", "save connection info " + z);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (currentTimeMillis < aVar.a() || currentTimeMillis - aVar.a() > this.f25081b) {
                arrayList.add(aVar);
            }
        }
        if (!arrayList.isEmpty()) {
            e.a("PushLogAC2815", "some connection info is expired:" + arrayList.size());
            this.g.removeAll(arrayList);
        }
        a aVar2 = new a();
        aVar2.a(z);
        aVar2.a(System.currentTimeMillis());
        if (this.g.size() >= this.f25080a) {
            this.g.remove(0);
        }
        this.g.add(aVar2);
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it3 = this.g.iterator();
        while (it3.hasNext()) {
            stringBuffer.append(((a) it3.next()).toString());
            stringBuffer.append("|");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        new h(context, "PushConnectControl").a("connectPushSvrInfos", stringBuffer.toString());
    }

    private boolean a() {
        if (this.g.size() < this.f25080a) {
            e.a("PushLogAC2815", "total connect times is less than " + this.f25080a);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it2 = this.g.iterator();
        int i = 0;
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (currentTimeMillis > aVar.a() && currentTimeMillis - aVar.a() < this.f25081b) {
                i++;
            }
        }
        e.a("PushLogAC2815", "connect times in last " + this.f25081b + " is " + i + ", limits is " + this.f25080a);
        return i >= this.f25080a;
    }

    private void b() {
        this.f25084f = 0;
    }

    private void b(Context context, boolean z) {
        e.a("PushLogAC2815", "set bad network mode " + z);
        c.a(context, new com.huawei.android.pushagent.a.a("isBadNetworkMode", Boolean.class, (Object) Boolean.valueOf(z)));
    }

    private void c() {
        this.f25084f++;
    }

    private void c(Context context) {
        this.f25080a = com.huawei.android.pushagent.b.b.a.a(context).Z();
        this.f25081b = com.huawei.android.pushagent.b.b.a.a(context).Y();
        this.f25082c = com.huawei.android.pushagent.b.b.a.a(context).ab();
        this.f25083d = com.huawei.android.pushagent.b.b.a.a(context).aa();
        String b2 = new h(context, "PushConnectControl").b("connectPushSvrInfos");
        if (!TextUtils.isEmpty(b2)) {
            e.a("PushLogAC2815", "connectPushSvrInfos is " + b2);
            for (String str : b2.split("\\|")) {
                a aVar = new a();
                if (aVar.a(str)) {
                    this.g.add(aVar);
                }
            }
        }
        Collections.sort(this.g);
        if (this.g.size() > this.f25080a) {
            ArrayList arrayList = new ArrayList();
            int size = this.g.size() - this.f25080a;
            for (int i = 0; i < size; i++) {
                arrayList.add(this.g.get(i));
            }
            this.g.removeAll(arrayList);
        }
    }

    private void d(Context context) {
        String str;
        String str2;
        if (!g(context)) {
            str = "PushLogAC2815";
            str2 = "It is not bad network mode, do nothing";
        } else if (this.g.isEmpty()) {
            b(context, false);
            return;
        } else {
            a aVar = (a) this.g.get(this.g.size() - 1);
            if (aVar.b()) {
                e.a("PushLogAC2815", "last connection is success");
                long currentTimeMillis = System.currentTimeMillis();
                long a2 = aVar.a();
                if (currentTimeMillis - a2 > this.f25082c || currentTimeMillis < a2) {
                    e.a("PushLogAC2815", this.f25082c + " has passed since last connect");
                    b(context, false);
                } else {
                    str = "PushLogAC2815";
                    str2 = "connection keep too short , still in bad network mode";
                }
            } else {
                e.a("PushLogAC2815", "last connection result is false , still in bad network mode");
            }
            return;
        }
        e.a(str, str2);
    }

    private long e(Context context) {
        long k;
        long j = 0;
        if (this.g.isEmpty()) {
            e.a("PushLogAC2815", "first connection, return 0");
            return 0;
        }
        long j2 = 1000;
        if (!c.a(context, "cloudpush_isNoDelayConnect", false)) {
            if (((long) this.f25084f) != com.huawei.android.pushagent.b.b.a.a(context).s()) {
                switch (this.f25084f) {
                    case 0:
                        k = com.huawei.android.pushagent.b.b.a.a(context).k();
                        break;
                    case 1:
                        k = com.huawei.android.pushagent.b.b.a.a(context).l();
                        break;
                    case 2:
                        k = com.huawei.android.pushagent.b.b.a.a(context).m();
                        break;
                    case 3:
                        k = com.huawei.android.pushagent.b.b.a.a(context).n();
                        break;
                    default:
                        j2 = 1000 * com.huawei.android.pushagent.b.b.a.a(context).o();
                        com.huawei.android.pushagent.b.b.a.a(context).f25060a = true;
                        break;
                }
            } else {
                com.huawei.android.pushagent.b.b.a.a(context).f25060a = true;
                k = com.huawei.android.pushagent.b.b.a.a(context).o();
            }
            j2 = 1000 * k;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = ((a) this.g.get(this.g.size() - 1)).f25086a;
        if (currentTimeMillis < b2) {
            e.a("PushLogAC2815", "now is less than last connect time");
        } else {
            j = Math.max((b2 + j2) - currentTimeMillis, 0);
        }
        e.b("PushLogAC2815", "after getConnectPushSrvInterval:" + j + " ms, connectTimes:" + this.f25084f);
        return j;
    }

    private long f(Context context) {
        if (a()) {
            b(context, true);
        }
        boolean g2 = g(context);
        e.a("PushLogAC2815", "bad network mode is " + g2);
        long j = 0;
        if (g2 && !this.g.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            long b2 = ((a) this.g.get(this.g.size() - 1)).f25086a;
            if (currentTimeMillis < b2) {
                e.a("PushLogAC2815", "now is less than last connect time");
            } else {
                j = Math.max((b2 + this.f25083d) - currentTimeMillis, 0);
            }
            e.a("PushLogAC2815", "It is in bad network mode, connect limit interval is " + j);
        }
        return j;
    }

    private boolean g(Context context) {
        return c.a(context, "isBadNetworkMode", false);
    }

    public void a(Context context, C0290b bVar, Bundle bundle) {
        String str;
        String str2;
        e.a("PushLogAC2815", "receive reconnectevent:" + bVar);
        switch (bVar) {
            case NETWORK_CHANGE:
                b();
                break;
            case TRS_QUERIED:
                b();
                return;
            case SOCKET_CLOSE:
                d(context);
                if (bundle.containsKey("errorType")) {
                    if (c.a.Err_Connect == ((c.a) bundle.getSerializable("errorType"))) {
                        a(context, false);
                        c();
                        com.huawei.android.pushagent.b.a.a.a(context).a(b(context));
                        return;
                    }
                    str2 = "PushLogAC2815";
                    str = "socket close not caused by connect error, do not need save connection info";
                } else {
                    str2 = "PushLogAC2815";
                    str = "socket close not caused by pushException";
                }
                e.a(str2, str);
                c();
                com.huawei.android.pushagent.b.a.a.a(context).a(b(context));
                return;
            case SOCKET_CONNECTED:
                b();
                a(context, true);
                break;
        }
    }

    public long b(Context context) {
        return Math.max(e(context), f(context));
    }
}
