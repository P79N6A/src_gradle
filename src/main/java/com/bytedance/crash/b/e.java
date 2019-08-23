package com.bytedance.crash.b;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.crash.runtime.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19365a = true;

    /* renamed from: b  reason: collision with root package name */
    static int f19366b;

    /* renamed from: c  reason: collision with root package name */
    static List<a> f19367c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile AtomicLong f19368d = new AtomicLong(-1);

    /* renamed from: e  reason: collision with root package name */
    public static long f19369e = 100;

    /* renamed from: f  reason: collision with root package name */
    public static long f19370f;
    static HandlerThread g;
    public static long h;
    public static long i;
    public static Handler j;
    public static int k;
    public static boolean l;
    public static volatile String m = null;
    public static volatile boolean n = false;
    public static int o = -1;
    public static long p = -1;
    public static long q = -1;
    private static int r = -1;
    private static MessageQueue s = null;
    private static Field t = null;
    private static Field u = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f19371a;

        /* renamed from: b  reason: collision with root package name */
        public int f19372b;

        /* renamed from: c  reason: collision with root package name */
        public long f19373c;

        /* renamed from: d  reason: collision with root package name */
        public long f19374d;

        /* renamed from: e  reason: collision with root package name */
        public long f19375e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19376f;
        public String g;

        public final String toString() {
            if (this.f19372b == 0) {
                return "[[[ IDLE  ]]] cost " + this.f19373c + " tick , mDuration：" + this.f19374d + ",cpuTime:" + this.f19375e;
            } else if (this.f19372b == 1) {
                return "[[[ Long IDLE  ]]] cost " + this.f19373c + " tick , mDuration：" + this.f19374d + ",cpuTime:" + this.f19375e;
            } else if (this.f19372b == 2) {
                return "[[[  1 msg  ]]] cost " + this.f19373c + " tick , mDuration：" + this.f19374d + ",cpuTime:" + this.f19375e + ", msg:" + this.g;
            } else if (this.f19372b == 3) {
                return "[[[ 1 msg + IDLE  ]]] cost " + this.f19373c + " tick , mDuration：" + this.f19374d + ",cpuTime:" + this.f19375e;
            } else if (this.f19372b == 4) {
                return "[[[ " + (this.f19371a - 1) + " msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than " + (this.f19373c - 1) + "tick ,, mDuration：" + this.f19374d + "cpuTime:" + this.f19375e + " msg:" + this.g;
            } else if (this.f19372b == 5) {
                return "[[[ " + this.f19371a + " msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than" + (this.f19373c - 1) + " ticks, , mDuration：" + this.f19374d + "cpuTime:" + this.f19375e;
            } else if (this.f19372b == 6) {
                return "[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than" + (this.f19373c - 1) + ", , mDuration：" + this.f19374d + "cpuTime:" + this.f19375e;
            } else if (this.f19372b == 7) {
                return "[[[ " + this.f19371a + " msgs + IDLE  ]]] cost 1 tick , mDuration：" + this.f19374d + " cost cpuTime:" + this.f19375e;
            } else if (this.f19372b == 8) {
                return "[[[ 1 msgs ]]] cost " + this.f19373c + " ticks , mDuration：" + this.f19374d + " cost cpuTime:" + this.f19375e + " msg:" + this.g;
            } else if (this.f19372b == 9) {
                return "[[[ " + this.f19371a + " msgs ]]] cost 1 tick , mDuration：" + this.f19374d + " cost cpuTime:" + this.f19375e;
            } else {
                return "=========   UNKNOW =========  Type:" + this.f19372b + " cost ticks " + this.f19373c + " msgs:" + this.f19371a;
            }
        }
    }

    public static long d() {
        return c.a(o);
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        List<a> f2 = f();
        if (f2 == null) {
            return jSONArray;
        }
        int i2 = 0;
        for (a next : f2) {
            if (next != null) {
                i2++;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("msg", next.g);
                    jSONObject.put("cpuDuration", next.f19375e);
                    jSONObject.put("duration", next.f19374d);
                    jSONObject.put("tick", next.f19373c);
                    jSONObject.put("type", next.f19372b);
                    jSONObject.put("count", next.f19371a);
                    jSONObject.put("id", i2);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public static MessageQueue c() {
        if (s == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                s = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                s = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    s = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return s;
    }

    public static JSONObject e() {
        long j2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", m);
            if (p < 0) {
                j2 = (SystemClock.uptimeMillis() - f19370f) - (q * f19369e);
            } else {
                j2 = (SystemClock.uptimeMillis() - f19370f) - (p * f19369e);
            }
            jSONObject.put("currentMessageCost", j2);
            jSONObject.put("currentMessageCpu", d() - h);
            jSONObject.put("currentTick", f19368d.get());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static List<a> f() {
        if (f19367c == null) {
            return null;
        }
        n = true;
        ArrayList arrayList = new ArrayList();
        if (f19367c.size() == f19366b) {
            for (int i2 = r; i2 < f19367c.size(); i2++) {
                arrayList.add(f19367c.get(i2));
            }
            for (int i3 = 0; i3 < r; i3++) {
                arrayList.add(f19367c.get(i3));
            }
        } else {
            arrayList.addAll(f19367c);
        }
        n = false;
        return arrayList;
    }

    public static a a() {
        if (f19367c.size() == f19366b) {
            r = (r + 1) % f19366b;
            return f19367c.get(r);
        }
        a aVar = new a();
        f19367c.add(aVar);
        r++;
        return aVar;
    }

    private static Message a(Message message) {
        if (u == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                u = declaredField;
                declaredField.setAccessible(true);
                return (Message) u.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) u.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    static Message a(MessageQueue messageQueue) {
        if (t == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                t = declaredField;
                declaredField.setAccessible(true);
                return (Message) t.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) t.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray a(int r6, long r7) {
        /*
            android.os.MessageQueue r6 = c()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r6 != 0) goto L_0x000c
            return r0
        L_0x000c:
            monitor-enter(r6)
            android.os.Message r1 = a((android.os.MessageQueue) r6)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return r0
        L_0x0015:
            r2 = 0
            r3 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x0032
            r4 = 100
            if (r2 >= r4) goto L_0x0032
            int r2 = r2 + 1
            int r3 = r3 + 1
            org.json.JSONObject r4 = a((android.os.Message) r1, (long) r7)     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = "id"
            r4.put(r5, r3)     // Catch:{ JSONException -> 0x002a }
        L_0x002a:
            r0.put(r4)     // Catch:{ all -> 0x0034 }
            android.os.Message r1 = a((android.os.Message) r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0017
        L_0x0032:
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return r0
        L_0x0034:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.e.a(int, long):org.json.JSONArray");
    }

    private static JSONObject a(Message message, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j2);
            if (message.getCallback() != null) {
                jSONObject.put("callback", message.getCallback());
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", message.getTarget());
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a(a aVar, long j2, long j3, long j4, int i2, int i3, String str) {
        aVar.f19375e = j2;
        aVar.f19373c = j4;
        aVar.f19374d = j3;
        aVar.f19376f = false;
        aVar.f19371a = i3;
        if (str != null) {
            aVar.g = str;
        }
        aVar.f19372b = i2;
    }
}
