package com.bytedance.im.core.b.b;

import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.b.a.i;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.b.a.q;
import com.bytedance.im.core.b.c.e;
import com.bytedance.im.core.proto.MessageBody;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Integer> f20946a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f20947b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    public static final Set<Integer> f20948c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    public static final Set<Integer> f20949d = new CopyOnWriteArraySet();

    /* renamed from: e  reason: collision with root package name */
    public static final Set<String> f20950e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public static final Map<Integer, Map<String, MessageBody>> f20951f = new ConcurrentHashMap();
    public static final Set<String> g = new CopyOnWriteArraySet();

    public static void a() {
        HashMap hashMap;
        if (!f20951f.isEmpty()) {
            for (Integer next : f20951f.keySet()) {
                m.a();
                int intValue = next.intValue();
                Map map = f20951f.get(next);
                if (map != null && !map.isEmpty()) {
                    while (true) {
                        hashMap = null;
                        for (String str : map.keySet()) {
                            MessageBody messageBody = (MessageBody) map.get(str);
                            if (messageBody != null) {
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                hashMap.put(str, messageBody);
                                if (hashMap.size() == 100) {
                                    new i().a(intValue, (Map<String, MessageBody>) hashMap);
                                }
                            }
                        }
                        break;
                    }
                    new i().a(intValue, (Map<String, MessageBody>) hashMap);
                }
            }
            f20951f.clear();
        }
        if (!g.isEmpty()) {
            for (String a2 : g) {
                m.a();
                new q().a(a2, (e) null);
            }
            g.clear();
        }
    }

    public static boolean a(String str) {
        return f20947b.contains(str);
    }

    public static void b(String str) {
        f20947b.add(str);
    }

    public static boolean c(String str) {
        return f20950e.contains(str);
    }

    public static void d(String str) {
        f20950e.add(str);
    }

    public static boolean b(int i) {
        return f20948c.contains(Integer.valueOf(i));
    }

    public static void c(int i) {
        f20948c.add(Integer.valueOf(i));
    }

    public static void d(int i) {
        f20948c.remove(Integer.valueOf(i));
    }

    public static boolean e(int i) {
        return f20949d.contains(Integer.valueOf(i));
    }

    public static void f(int i) {
        f20949d.remove(Integer.valueOf(i));
    }

    public static boolean a(int i) {
        if (!f20951f.containsKey(Integer.valueOf(i)) || f20951f.get(Integer.valueOf(i)).isEmpty()) {
            return false;
        }
        return true;
    }

    public static void a(int i, int i2) {
        if (f20946a.contains(Integer.valueOf(i))) {
            f20946a.remove(Integer.valueOf(i));
            c.a();
        }
    }

    public static void a(int i, MessageBody messageBody) {
        if (!(messageBody.conversation_id == null || messageBody.conversation_short_id == null || messageBody.conversation_type == null)) {
            if (f20951f.get(Integer.valueOf(i)) == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(messageBody.conversation_id, messageBody);
                f20951f.put(Integer.valueOf(i), concurrentHashMap);
                return;
            }
            f20951f.get(Integer.valueOf(i)).put(messageBody.conversation_id, messageBody);
        }
    }

    public static void a(int i, String str) {
        if (f20951f.containsKey(Integer.valueOf(i))) {
            f20951f.get(Integer.valueOf(i)).remove(str);
        }
    }

    public static void a(int i, String str, long j, int i2, long j2) {
        a(i, new MessageBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).create_time(Long.valueOf(j2)).build());
    }
}
