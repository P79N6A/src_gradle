package com.huawei.android.pushagent.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.android.pushagent.a.a;
import com.huawei.android.pushagent.b.a.b.b;
import com.huawei.android.pushagent.utils.a.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f25064a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static c f25065b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f25066c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Context f25067d = null;

    static {
        c();
    }

    private c(Context context) {
        this.f25067d = context;
        a();
    }

    public static int a(Context context, String str, int i) {
        int i2;
        try {
            Object b2 = b(context, str);
            if (b2 == null) {
                return i;
            }
            i2 = ((Integer) b2).intValue();
            return i2;
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
            i2 = i;
        }
    }

    public static long a(Context context, String str, long j) {
        try {
            Object b2 = b(context, str);
            if (b2 == null) {
                return j;
            }
            if (b2 instanceof Integer) {
                j = (long) ((Integer) b2).intValue();
            } else if (b2 instanceof Long) {
                j = ((Long) b2).longValue();
            }
            return j;
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
        }
    }

    public static a a(Context context, String str) {
        if (a(context) == null || str == null) {
            return null;
        }
        a aVar = (a) f25065b.f25066c.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar;
    }

    public static synchronized c a(Context context) {
        synchronized (c.class) {
            if (f25065b != null) {
                c cVar = f25065b;
                return cVar;
            } else if (context == null) {
                return null;
            } else {
                c cVar2 = new c(context);
                f25065b = cVar2;
                return cVar2;
            }
        }
    }

    public static String a(Context context, String str, String str2) {
        String str3;
        Object b2 = b(context, str);
        if (b2 == null) {
            return str2;
        }
        try {
            str3 = (String) b2;
        } catch (Exception unused) {
            e.a("PushLogAC2815", "getString from config failed!");
            str3 = str2;
        }
        return str3;
    }

    public static void a(Context context, a aVar) {
        if (aVar == null || aVar.f24940a == null) {
            e.d("PushLogAC2815", "set value err, cfg is null or itemName is null, cfg:" + aVar);
        } else if (a(context) == null) {
            e.d("PushLogAC2815", "System init failed in set Value");
        } else {
            f25065b.f25066c.put(aVar.f24940a, aVar);
            f25065b.b(context, aVar);
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        boolean z2;
        try {
            Object b2 = b(context, str);
            if (b2 == null) {
                return z;
            }
            z2 = ((Boolean) b2).booleanValue();
            return z2;
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
            z2 = z;
        }
    }

    public static b.a b(Context context) {
        a a2 = a(context, "USE_SSL");
        b.a aVar = b.a.ChannelType_SSL;
        if (a2 == null) {
            return aVar;
        }
        e.a("PushLogAC2815", " " + a2);
        Integer num = (Integer) a2.f24941b;
        if (num.intValue() >= 0 && num.intValue() < b.a.values().length) {
            return b.a.values()[num.intValue()];
        }
        e.d("PushLogAC2815", "useSSL:" + a2.f24941b + " is invalid cfg");
        return aVar;
    }

    private static Object b(Context context, String str) {
        if (a(context) == null) {
            return null;
        }
        a aVar = (a) f25065b.f25066c.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.f24941b;
    }

    private boolean b(Context context, a aVar) {
        if (context == null) {
            context = this.f25067d;
        }
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "pushConfig", 4).edit();
        if (Boolean.class == aVar.f24942c) {
            edit.putBoolean(aVar.f24940a, ((Boolean) aVar.f24941b).booleanValue());
        } else if (String.class == aVar.f24942c) {
            edit.putString(aVar.f24940a, (String) aVar.f24941b);
        } else if (Long.class == aVar.f24942c) {
            edit.putLong(aVar.f24940a, ((Long) aVar.f24941b).longValue());
        } else if (Integer.class == aVar.f24942c) {
            edit.putInt(aVar.f24940a, ((Integer) aVar.f24941b).intValue());
        } else if (Float.class == aVar.f24942c) {
            edit.putFloat(aVar.f24940a, ((Float) aVar.f24941b).floatValue());
        }
        return edit.commit();
    }

    private static void c() {
        f25064a.clear();
        f25064a.put("cloudpush_isLogLocal", new a("cloudpush_isLogLocal", Boolean.class, (Object) Boolean.FALSE));
        f25064a.put("cloudpush_pushLogLevel", new a("cloudpush_pushLogLevel", Integer.class, (Object) 4));
        f25064a.put("cloudpush_isReportLog", new a("cloudpush_isReportLog", Boolean.class, (Object) Boolean.FALSE));
        f25064a.put("cloudpush_isNoDelayConnect", new a("cloudpush_isNoDelayConnect", Boolean.class, (Object) Boolean.FALSE));
        f25064a.put("cloudpush_isSupportUpdate", new a("cloudpush_isSupportUpdate", Boolean.class, (Object) Boolean.FALSE));
        f25064a.put("cloudpush_isSupportCollectSocketInfo", new a("cloudpush_isSupportCollectSocketInfo", Boolean.class, (Object) Boolean.FALSE));
        f25064a.put("cloudpush_trsIp", new a("cloudpush_trsIp", String.class, "push.hicloud.com"));
        f25064a.put("cloudpush_fixHeatBeat", new a("cloudpush_fixHeatBeat", String.class, " unit sec"));
        f25064a.put("USE_SSL", new a("USE_SSL", Integer.class, (Object) Integer.valueOf(b.a.ChannelType_SSL.ordinal())));
    }

    private void d() {
        this.f25066c.clear();
        SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.f25067d, "pushConfig", 4);
        this.f25066c.putAll(f25064a);
        for (Map.Entry next : a2.getAll().entrySet()) {
            this.f25066c.put(next.getKey(), new a((String) next.getKey(), (Class) next.getValue().getClass(), next.getValue()));
        }
    }

    public void a() {
        c();
        d();
    }

    public void b() {
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(this.f25067d, "pushConfig", 4).edit();
        Set<String> keySet = this.f25066c.keySet();
        LinkedList linkedList = new LinkedList();
        for (String str : keySet) {
            if (!f25064a.containsKey(str) && !"NeedMyServiceRun".equals(str) && !"votedPackageName".equals(str) && !"forbiddenMultiChannel".equals(str) && !"version_config".equals(str)) {
                e.a("PushLogAC2815", "item " + str + " remove from pushConfig" + " in deleteNoSysCfg");
                linkedList.add(str);
                edit.remove(str);
            }
        }
        edit.commit();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            this.f25066c.remove((String) it2.next());
        }
    }
}
