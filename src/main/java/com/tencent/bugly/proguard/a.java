package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    protected HashMap<String, HashMap<String, byte[]>> f79400a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    protected String f79401b;

    /* renamed from: c  reason: collision with root package name */
    i f79402c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Object> f79403d;

    public <T> void a(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        } else if (!(t instanceof Set)) {
            j jVar = new j();
            jVar.a(this.f79401b);
            jVar.a((Object) t, 0);
            byte[] a2 = l.a(jVar.a());
            HashMap hashMap = new HashMap(1);
            ArrayList arrayList = new ArrayList(1);
            a(arrayList, (Object) t);
            hashMap.put(a(arrayList), a2);
            this.f79403d.remove(str);
            this.f79400a.put(str, hashMap);
        } else {
            throw new IllegalArgumentException("can not support Set");
        }
    }

    public byte[] a() {
        j jVar = new j(0);
        jVar.a(this.f79401b);
        jVar.a((Map<K, V>) this.f79400a, 0);
        return l.a(jVar.a());
    }

    public void a(byte[] bArr) {
        this.f79402c.a(bArr);
        this.f79402c.a(this.f79401b);
        HashMap hashMap = new HashMap(1);
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.f79400a = this.f79402c.a((Map<K, V>) hashMap, 0, false);
    }

    public static byte[] a(Object obj) {
        try {
            d dVar = new d();
            dVar.b();
            dVar.a("utf-8");
            dVar.b(1);
            dVar.b("RqdServer");
            dVar.c("sync");
            dVar.a("detail", obj);
            return dVar.a();
        } catch (Throwable th) {
            x.b(th);
            return null;
        }
    }

    public static byte[] a(k kVar) {
        try {
            j jVar = new j();
            jVar.a("utf-8");
            kVar.a(jVar);
            return jVar.b();
        } catch (Throwable th) {
            x.b(th);
            return null;
        }
    }

    a() {
        new HashMap();
        this.f79403d = new HashMap<>();
        this.f79401b = "GBK";
        this.f79402c = new i();
    }

    public void a(String str) {
        this.f79401b = str;
    }

    public static ag a(int i) {
        if (i == 1) {
            return new af();
        }
        if (i == 3) {
            return new ae();
        }
        return null;
    }

    public static aq a(UserInfoBean userInfoBean) {
        boolean z;
        if (userInfoBean == null) {
            return null;
        }
        aq aqVar = new aq();
        aqVar.f79446a = userInfoBean.f79247e;
        aqVar.f79450e = userInfoBean.j;
        aqVar.f79449d = userInfoBean.f79245c;
        aqVar.f79448c = userInfoBean.f79246d;
        aqVar.g = com.tencent.bugly.crashreport.common.info.a.b().i();
        if (userInfoBean.o == 1) {
            z = true;
        } else {
            z = false;
        }
        aqVar.h = z;
        switch (userInfoBean.f79244b) {
            case 1:
                aqVar.f79447b = 1;
                break;
            case 2:
                aqVar.f79447b = 4;
                break;
            case 3:
                aqVar.f79447b = 2;
                break;
            case 4:
                aqVar.f79447b = 3;
                break;
            default:
                if (userInfoBean.f79244b >= 10 && userInfoBean.f79244b < 20) {
                    aqVar.f79447b = (byte) userInfoBean.f79244b;
                    break;
                } else {
                    x.e("unknown uinfo type %d ", Integer.valueOf(userInfoBean.f79244b));
                    return null;
                }
        }
        aqVar.f79451f = new HashMap();
        if (userInfoBean.p >= 0) {
            Map<String, String> map = aqVar.f79451f;
            map.put("C01", userInfoBean.p);
        }
        if (userInfoBean.q >= 0) {
            Map<String, String> map2 = aqVar.f79451f;
            map2.put("C02", userInfoBean.q);
        }
        if (userInfoBean.r != null && userInfoBean.r.size() > 0) {
            for (Map.Entry next : userInfoBean.r.entrySet()) {
                Map<String, String> map3 = aqVar.f79451f;
                map3.put("C03_" + ((String) next.getKey()), next.getValue());
            }
        }
        if (userInfoBean.s != null && userInfoBean.s.size() > 0) {
            for (Map.Entry next2 : userInfoBean.s.entrySet()) {
                Map<String, String> map4 = aqVar.f79451f;
                map4.put("C04_" + ((String) next2.getKey()), next2.getValue());
            }
        }
        Map<String, String> map5 = aqVar.f79451f;
        map5.put("A36", (!userInfoBean.l));
        Map<String, String> map6 = aqVar.f79451f;
        map6.put("F02", userInfoBean.g);
        Map<String, String> map7 = aqVar.f79451f;
        map7.put("F03", userInfoBean.h);
        Map<String, String> map8 = aqVar.f79451f;
        map8.put("F04", userInfoBean.j);
        Map<String, String> map9 = aqVar.f79451f;
        map9.put("F05", userInfoBean.i);
        Map<String, String> map10 = aqVar.f79451f;
        map10.put("F06", userInfoBean.m);
        Map<String, String> map11 = aqVar.f79451f;
        map11.put("F10", userInfoBean.k);
        x.c("summary type %d vm:%d", Byte.valueOf(aqVar.f79447b), Integer.valueOf(aqVar.f79451f.size()));
        return aqVar;
    }

    public static String a(ArrayList<String> arrayList) {
        int i;
        int i2;
        int i3;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String str = arrayList.get(i4);
            if (str.equals("java.lang.Integer") || str.equals("int")) {
                str = "int32";
            } else if (str.equals("java.lang.Boolean") || str.equals("boolean")) {
                str = "bool";
            } else if (str.equals("java.lang.Byte") || str.equals("byte")) {
                str = "char";
            } else if (str.equals("java.lang.Double") || str.equals("double")) {
                str = "double";
            } else if (str.equals("java.lang.Float") || str.equals("float")) {
                str = "float";
            } else if (str.equals("java.lang.Long") || str.equals("long")) {
                str = "int64";
            } else if (str.equals("java.lang.Short") || str.equals("short")) {
                str = "short";
            } else if (str.equals("java.lang.Character")) {
                throw new IllegalArgumentException("can not support java.lang.Character");
            } else if (str.equals("java.lang.String")) {
                str = "string";
            } else if (str.equals("java.util.List")) {
                str = "list";
            } else if (str.equals("java.util.Map")) {
                str = "map";
            }
            arrayList.set(i4, str);
        }
        Collections.reverse(arrayList);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            String str2 = arrayList.get(i5);
            if (str2.equals("list")) {
                arrayList.set(i3, "<" + arrayList.get(i5 - 1));
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str2.equals("map")) {
                arrayList.set(i2, "<" + arrayList.get(i5 - 1) + ",");
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str2.equals("Array")) {
                arrayList.set(i, "<" + arrayList.get(i5 - 1));
                arrayList.set(0, arrayList.get(0) + ">");
            }
        }
        Collections.reverse(arrayList);
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(it2.next());
        }
        return stringBuffer.toString();
    }

    public static <T extends k> T a(byte[] bArr, Class<T> cls) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            T t = (k) cls.newInstance();
            i iVar = new i(bArr);
            iVar.a("utf-8");
            t.a(iVar);
            return t;
        } catch (Throwable th) {
            x.b(th);
            return null;
        }
    }

    public static an a(byte[] bArr, boolean z) {
        an anVar;
        if (bArr != null) {
            try {
                d dVar = new d();
                dVar.b();
                dVar.a("utf-8");
                dVar.a(bArr);
                Object b2 = dVar.b("detail", new an());
                if (an.class.isInstance(b2)) {
                    anVar = an.class.cast(b2);
                } else {
                    anVar = null;
                }
                if (!z && anVar != null && anVar.f79434c != null && anVar.f79434c.length > 0) {
                    x.c("resp buf %d", Integer.valueOf(anVar.f79434c.length));
                    anVar.f79434c = z.b(anVar.f79434c, 2, 1, StrategyBean.f79285d);
                    if (anVar.f79434c == null) {
                        x.e("resp sbuffer error!", new Object[0]);
                        return null;
                    }
                }
                return anVar;
            } catch (Throwable th) {
                x.b(th);
            }
        }
        return null;
    }

    private void a(ArrayList<String> arrayList, Object obj) {
        while (obj.getClass().isArray()) {
            if (!obj.getClass().getComponentType().toString().equals("byte")) {
                throw new IllegalArgumentException("only byte[] is supported");
            } else if (Array.getLength(obj) > 0) {
                arrayList.add("java.util.List");
                obj = Array.get(obj, 0);
            } else {
                arrayList.add("Array");
                arrayList.add("?");
                return;
            }
        }
        if (obj instanceof Array) {
            throw new IllegalArgumentException("can not support Array, please use List");
        } else if (obj instanceof List) {
            arrayList.add("java.util.List");
            List list = (List) obj;
            if (list.size() > 0) {
                a(arrayList, list.get(0));
            } else {
                arrayList.add("?");
            }
        } else if (obj instanceof Map) {
            arrayList.add("java.util.Map");
            Map map = (Map) obj;
            if (map.size() > 0) {
                Object next = map.keySet().iterator().next();
                Object obj2 = map.get(next);
                arrayList.add(next.getClass().getName());
                a(arrayList, obj2);
                return;
            }
            arrayList.add("?");
            arrayList.add("?");
        } else {
            arrayList.add(obj.getClass().getName());
        }
    }

    public static ar a(List<UserInfoBean> list, int i) {
        if (list == null || list.size() == 0) {
            return null;
        }
        com.tencent.bugly.crashreport.common.info.a b2 = com.tencent.bugly.crashreport.common.info.a.b();
        if (b2 == null) {
            return null;
        }
        b2.t();
        ar arVar = new ar();
        arVar.f79454b = b2.f79277d;
        arVar.f79455c = b2.h();
        ArrayList<aq> arrayList = new ArrayList<>();
        for (UserInfoBean a2 : list) {
            aq a3 = a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        arVar.f79456d = arrayList;
        arVar.f79457e = new HashMap();
        Map<String, String> map = arVar.f79457e;
        map.put("A7", b2.f79279f);
        Map<String, String> map2 = arVar.f79457e;
        map2.put("A6", b2.s());
        Map<String, String> map3 = arVar.f79457e;
        map3.put("A5", b2.r());
        Map<String, String> map4 = arVar.f79457e;
        map4.put("A2", b2.p());
        Map<String, String> map5 = arVar.f79457e;
        map5.put("A1", b2.p());
        Map<String, String> map6 = arVar.f79457e;
        map6.put("A24", b2.h);
        Map<String, String> map7 = arVar.f79457e;
        map7.put("A17", b2.q());
        Map<String, String> map8 = arVar.f79457e;
        map8.put("A15", b2.w());
        Map<String, String> map9 = arVar.f79457e;
        map9.put("A13", b2.x());
        Map<String, String> map10 = arVar.f79457e;
        map10.put("F08", b2.v);
        Map<String, String> map11 = arVar.f79457e;
        map11.put("F09", b2.w);
        Map<String, String> G = b2.G();
        if (G != null && G.size() > 0) {
            for (Map.Entry next : G.entrySet()) {
                Map<String, String> map12 = arVar.f79457e;
                map12.put("C04_" + ((String) next.getKey()), next.getValue());
            }
        }
        switch (i) {
            case 1:
                arVar.f79453a = 1;
                break;
            case 2:
                arVar.f79453a = 2;
                break;
            default:
                x.e("unknown up type %d ", Integer.valueOf(i));
                return null;
        }
        return arVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x027f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0280, code lost:
        com.tencent.bugly.proguard.x.b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0283, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.bugly.proguard.am a(android.content.Context r9, int r10, byte[] r11) {
        /*
            com.tencent.bugly.crashreport.common.info.a r0 = com.tencent.bugly.crashreport.common.info.a.b()
            com.tencent.bugly.crashreport.common.strategy.a r1 = com.tencent.bugly.crashreport.common.strategy.a.a()
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r1 = r1.c()
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0284
            if (r1 != 0) goto L_0x0014
            goto L_0x0284
        L_0x0014:
            com.tencent.bugly.proguard.am r4 = new com.tencent.bugly.proguard.am     // Catch:{ Throwable -> 0x027f }
            r4.<init>()     // Catch:{ Throwable -> 0x027f }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x027f }
            r5 = 1
            r4.f79426a = r5     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r0.f()     // Catch:{ all -> 0x027c }
            r4.f79427b = r6     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r0.f79276c     // Catch:{ all -> 0x027c }
            r4.f79428c = r6     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r0.j     // Catch:{ all -> 0x027c }
            r4.f79429d = r6     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r0.l     // Catch:{ all -> 0x027c }
            r4.f79430e = r6     // Catch:{ all -> 0x027c }
            r0.getClass()     // Catch:{ all -> 0x027c }
            java.lang.String r6 = "2.6.6"
            r4.f79431f = r6     // Catch:{ all -> 0x027c }
            r4.g = r10     // Catch:{ all -> 0x027c }
            if (r11 != 0) goto L_0x0041
            java.lang.String r10 = ""
            byte[] r10 = r10.getBytes()     // Catch:{ all -> 0x027c }
            goto L_0x0042
        L_0x0041:
            r10 = r11
        L_0x0042:
            r4.h = r10     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r0.g     // Catch:{ all -> 0x027c }
            r4.i = r10     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r0.h     // Catch:{ all -> 0x027c }
            r4.j = r10     // Catch:{ all -> 0x027c }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x027c }
            r10.<init>()     // Catch:{ all -> 0x027c }
            r4.k = r10     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r0.e()     // Catch:{ all -> 0x027c }
            r4.l = r10     // Catch:{ all -> 0x027c }
            long r6 = r1.p     // Catch:{ all -> 0x027c }
            r4.m = r6     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r0.h()     // Catch:{ all -> 0x027c }
            r4.o = r10     // Catch:{ all -> 0x027c }
            java.lang.String r9 = com.tencent.bugly.crashreport.common.info.b.f(r9)     // Catch:{ all -> 0x027c }
            r4.p = r9     // Catch:{ all -> 0x027c }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x027c }
            r4.q = r9     // Catch:{ all -> 0x027c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r9.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r0.k()     // Catch:{ all -> 0x027c }
            r9.append(r10)     // Catch:{ all -> 0x027c }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x027c }
            r4.r = r9     // Catch:{ all -> 0x027c }
            java.lang.String r9 = r0.j()     // Catch:{ all -> 0x027c }
            r4.s = r9     // Catch:{ all -> 0x027c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r9.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r0.m()     // Catch:{ all -> 0x027c }
            r9.append(r10)     // Catch:{ all -> 0x027c }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x027c }
            r4.t = r9     // Catch:{ all -> 0x027c }
            java.lang.String r9 = r0.l()     // Catch:{ all -> 0x027c }
            r4.u = r9     // Catch:{ all -> 0x027c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r9.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r0.n()     // Catch:{ all -> 0x027c }
            r9.append(r10)     // Catch:{ all -> 0x027c }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x027c }
            r4.v = r9     // Catch:{ all -> 0x027c }
            java.lang.String r9 = r4.p     // Catch:{ all -> 0x027c }
            r4.w = r9     // Catch:{ all -> 0x027c }
            r0.getClass()     // Catch:{ all -> 0x027c }
            java.lang.String r9 = "com.tencent.bugly"
            r4.n = r9     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "A26"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.y()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "A60"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.z()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "A61"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.A()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "F11"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            boolean r7 = r0.z     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "F12"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            boolean r7 = r0.y     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G1"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.u()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            boolean r9 = r0.B     // Catch:{ all -> 0x027c }
            if (r9 == 0) goto L_0x01d4
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G2"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.M()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G3"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.N()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G4"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.O()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G5"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.P()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G6"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.Q()     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G7"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            long r7 = r0.R()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
        L_0x01d4:
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "D3"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027c }
            r6.<init>()     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r0.k     // Catch:{ all -> 0x027c }
            r6.append(r7)     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.List<com.tencent.bugly.a> r9 = com.tencent.bugly.b.f79236b     // Catch:{ all -> 0x027c }
            if (r9 == 0) goto L_0x0211
            java.util.List<com.tencent.bugly.a> r9 = com.tencent.bugly.b.f79236b     // Catch:{ all -> 0x027c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x027c }
        L_0x01f3:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x027c }
            if (r10 == 0) goto L_0x0211
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x027c }
            com.tencent.bugly.a r10 = (com.tencent.bugly.a) r10     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r10.versionKey     // Catch:{ all -> 0x027c }
            if (r6 == 0) goto L_0x01f3
            java.lang.String r6 = r10.version     // Catch:{ all -> 0x027c }
            if (r6 == 0) goto L_0x01f3
            java.util.Map<java.lang.String, java.lang.String> r6 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r10.versionKey     // Catch:{ all -> 0x027c }
            java.lang.String r10 = r10.version     // Catch:{ all -> 0x027c }
            r6.put(r7, r10)     // Catch:{ all -> 0x027c }
            goto L_0x01f3
        L_0x0211:
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "G15"
            java.lang.String r6 = "G15"
            java.lang.String r7 = ""
            java.lang.String r6 = com.tencent.bugly.proguard.z.b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.k     // Catch:{ all -> 0x027c }
            java.lang.String r10 = "D4"
            java.lang.String r6 = "D4"
            java.lang.String r7 = "0"
            java.lang.String r6 = com.tencent.bugly.proguard.z.b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x027c }
            r9.put(r10, r6)     // Catch:{ all -> 0x027c }
            monitor-exit(r0)     // Catch:{ all -> 0x027c }
            com.tencent.bugly.proguard.u r9 = com.tencent.bugly.proguard.u.a()     // Catch:{ Throwable -> 0x027f }
            if (r9 == 0) goto L_0x0253
            boolean r9 = r9.f79518a     // Catch:{ Throwable -> 0x027f }
            if (r9 != 0) goto L_0x0253
            if (r11 == 0) goto L_0x0253
            byte[] r9 = r4.h     // Catch:{ Throwable -> 0x027f }
            r10 = 2
            java.lang.String r11 = r1.u     // Catch:{ Throwable -> 0x027f }
            byte[] r9 = com.tencent.bugly.proguard.z.a((byte[]) r9, (int) r10, (int) r5, (java.lang.String) r11)     // Catch:{ Throwable -> 0x027f }
            r4.h = r9     // Catch:{ Throwable -> 0x027f }
            byte[] r9 = r4.h     // Catch:{ Throwable -> 0x027f }
            if (r9 != 0) goto L_0x0253
            java.lang.String r9 = "reqPkg sbuffer error!"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x027f }
            com.tencent.bugly.proguard.x.e(r9, r10)     // Catch:{ Throwable -> 0x027f }
            return r3
        L_0x0253:
            java.util.Map r9 = r0.F()     // Catch:{ Throwable -> 0x027f }
            if (r9 == 0) goto L_0x027b
            java.util.Set r9 = r9.entrySet()     // Catch:{ Throwable -> 0x027f }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Throwable -> 0x027f }
        L_0x0261:
            boolean r10 = r9.hasNext()     // Catch:{ Throwable -> 0x027f }
            if (r10 == 0) goto L_0x027b
            java.lang.Object r10 = r9.next()     // Catch:{ Throwable -> 0x027f }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ Throwable -> 0x027f }
            java.util.Map<java.lang.String, java.lang.String> r11 = r4.k     // Catch:{ Throwable -> 0x027f }
            java.lang.Object r0 = r10.getKey()     // Catch:{ Throwable -> 0x027f }
            java.lang.Object r10 = r10.getValue()     // Catch:{ Throwable -> 0x027f }
            r11.put(r0, r10)     // Catch:{ Throwable -> 0x027f }
            goto L_0x0261
        L_0x027b:
            return r4
        L_0x027c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ Throwable -> 0x027f }
            throw r9     // Catch:{ Throwable -> 0x027f }
        L_0x027f:
            r9 = move-exception
            com.tencent.bugly.proguard.x.b(r9)
            return r3
        L_0x0284:
            java.lang.String r9 = "Can not create request pkg for parameters is invalid."
            java.lang.Object[] r10 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.x.e(r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.a.a(android.content.Context, int, byte[]):com.tencent.bugly.proguard.am");
    }
}
