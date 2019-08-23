package com.huawei.android.pushagent.b.d;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.b.b.c;
import com.huawei.android.pushagent.utils.a.b;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class a {
    private static a h;

    /* renamed from: a  reason: collision with root package name */
    Context f25069a;

    /* renamed from: b  reason: collision with root package name */
    List f25070b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    List f25071c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    List f25072d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    List f25073e = new LinkedList();

    /* renamed from: f  reason: collision with root package name */
    List f25074f = new LinkedList();
    List g = new LinkedList();

    private a(Context context) {
        this.f25069a = context;
        f();
        if (this.f25070b.size() == 0 && this.f25071c.size() == 0 && this.f25072d.size() == 0 && this.f25073e.size() == 0 && this.f25074f.size() == 0 && this.g.size() == 0) {
            e.a("PushLogAC2815", "Connect Control is not set, begin to config it");
            c();
        }
    }

    private boolean a(int i) {
        return a(1 == b.a(this.f25069a) ? this.g : this.f25072d);
    }

    public static synchronized boolean a(Context context) {
        synchronized (a.class) {
            b(context);
            if (h == null) {
                e.d("PushLogAC2815", "cannot get ConnectControlMgr instance, may be system err!!");
                return false;
            }
            boolean d2 = h.d();
            return d2;
        }
    }

    public static synchronized boolean a(Context context, int i) {
        synchronized (a.class) {
            b(context);
            if (h == null) {
                e.d("PushLogAC2815", "cannot get ConnectControlMgr instance, may be system err!!");
                return false;
            }
            boolean a2 = h.a(i);
            return a2;
        }
    }

    private boolean a(h hVar, List list, String str) throws Exception {
        list.clear();
        String b2 = hVar.b(str);
        if (TextUtils.isEmpty(b2)) {
            e.a("PushLogAC2815", str + " is not set");
        } else {
            e.a("PushLogAC2815", str + "=" + b2);
            for (String str2 : b2.split("\\|")) {
                com.huawei.android.pushagent.b.d.a.a aVar = new com.huawei.android.pushagent.b.d.a.a();
                if (aVar.a(str2)) {
                    list.add(aVar);
                }
            }
        }
        return true;
    }

    private boolean a(List list) {
        if (!a(list, 1)) {
            e.b("PushLogAC2815", "volumeControl not allow to pass!!");
            return false;
        }
        b(list, 1);
        e();
        return true;
    }

    private boolean a(List list, long j) {
        if (list == null || list.size() == 0) {
            e.a("PushLogAC2815", "there is no volome control");
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.huawei.android.pushagent.b.d.a.b bVar = (com.huawei.android.pushagent.b.d.a.b) it2.next();
            if (!bVar.a(j)) {
                e.b("PushLogAC2815", " not pass:" + bVar);
                return false;
            }
            e.a("PushLogAC2815", " pass:" + bVar);
        }
        return true;
    }

    private boolean a(List list, List list2) {
        boolean z;
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.huawei.android.pushagent.b.d.a.b bVar = (com.huawei.android.pushagent.b.d.a.b) it2.next();
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (bVar.a((com.huawei.android.pushagent.b.d.a.b) it3.next())) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static synchronized a b(Context context) {
        a aVar;
        synchronized (a.class) {
            if (h == null) {
                h = new a(context);
            }
            aVar = h;
        }
        return aVar;
    }

    private boolean b() {
        String str;
        String str2;
        LinkedList linkedList = new LinkedList();
        linkedList.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).G()));
        linkedList.add(new com.huawei.android.pushagent.b.d.a.a(3600000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).H()));
        if (!a((List) linkedList, this.f25070b)) {
            str = "PushLogAC2815";
            str2 = "trsFirstFlowControl cfg is change!";
        } else {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).I()));
            if (!a((List) linkedList2, this.f25071c)) {
                str = "PushLogAC2815";
                str2 = "trsFlowControl cfg is change!!";
            } else {
                LinkedList linkedList3 = new LinkedList();
                for (Map.Entry entry : com.huawei.android.pushagent.b.b.a.a(this.f25069a).J().entrySet()) {
                    linkedList3.add(new com.huawei.android.pushagent.b.d.a.a(((Long) entry.getKey()).longValue() * 1000, ((Long) entry.getValue()).longValue()));
                }
                if (!a((List) linkedList3, this.f25072d)) {
                    str = "PushLogAC2815";
                    str2 = "flowcControl cfg is change!!";
                } else {
                    LinkedList linkedList4 = new LinkedList();
                    linkedList4.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).K()));
                    linkedList4.add(new com.huawei.android.pushagent.b.d.a.a(3600000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).L()));
                    if (!a((List) linkedList4, this.f25073e)) {
                        str = "PushLogAC2815";
                        str2 = "wifiTrsFirstFlowControl cfg is change!";
                    } else {
                        LinkedList linkedList5 = new LinkedList();
                        linkedList5.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).M()));
                        if (!a((List) linkedList5, this.f25074f)) {
                            str = "PushLogAC2815";
                            str2 = "wifiTrsFlowControl cfg is change!!";
                        } else {
                            LinkedList linkedList6 = new LinkedList();
                            for (Map.Entry entry2 : com.huawei.android.pushagent.b.b.a.a(this.f25069a).R().entrySet()) {
                                linkedList6.add(new com.huawei.android.pushagent.b.d.a.a(((Long) entry2.getKey()).longValue() * 1000, ((Long) entry2.getValue()).longValue()));
                            }
                            if (!a((List) linkedList6, this.g)) {
                                str = "PushLogAC2815";
                                str2 = "wifiVolumeControl cfg is change!!";
                            } else {
                                e.a("PushLogAC2815", "cur control is equal trs cfg");
                                return true;
                            }
                        }
                    }
                }
            }
        }
        e.a(str, str2);
        return false;
    }

    private boolean b(h hVar, List list, String str) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(((com.huawei.android.pushagent.b.d.a.b) it2.next()).a());
            stringBuffer.append("|");
        }
        if (hVar.a(str, stringBuffer.toString())) {
            return true;
        }
        e.d("PushLogAC2815", "save " + str + " failed!!");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean b(java.util.List r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x003c
            int r1 = r4.size()     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0039 }
        L_0x000f:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0039 }
            com.huawei.android.pushagent.b.d.a.b r1 = (com.huawei.android.pushagent.b.d.a.b) r1     // Catch:{ all -> 0x0039 }
            boolean r2 = r1.b(r5)     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x000f
            java.lang.String r4 = "PushLogAC2815"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = " control info:"
            r5.<init>(r6)     // Catch:{ all -> 0x0039 }
            r5.append(r1)     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0039 }
            com.huawei.android.pushagent.utils.a.e.b(r4, r5)     // Catch:{ all -> 0x0039 }
            r4 = 0
            monitor-exit(r3)
            return r4
        L_0x0037:
            monitor-exit(r3)
            return r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x003c:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.d.a.b(java.util.List, long):boolean");
    }

    private boolean b(List list, List list2) {
        String str;
        String str2;
        if (0 == c.a(this.f25069a, "lastQueryTRSsucc_time", 0)) {
            if (!a(list, 1)) {
                str = "PushLogAC2815";
                str2 = "trsFirstFlowControl not allowed to pass!!";
            } else {
                b(list, 1);
                e();
                return true;
            }
        } else if (!a(list2, 1)) {
            str = "PushLogAC2815";
            str2 = "trsFlowControl not allowed to pass!!";
        } else {
            b(list2, 1);
            e();
            return true;
        }
        e.d(str, str2);
        return false;
    }

    public static synchronized void c(Context context) {
        synchronized (a.class) {
            b(context);
            if (h != null && !h.b()) {
                e.a("PushLogAC2815", "TRS cfg change, need reload");
                h.c();
            }
        }
    }

    private boolean c() {
        this.f25070b.clear();
        this.f25070b.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).G()));
        this.f25070b.add(new com.huawei.android.pushagent.b.d.a.a(3600000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).H()));
        this.f25071c.clear();
        this.f25071c.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).I()));
        this.f25072d.clear();
        for (Map.Entry entry : com.huawei.android.pushagent.b.b.a.a(this.f25069a).J().entrySet()) {
            this.f25072d.add(new com.huawei.android.pushagent.b.d.a.a(((Long) entry.getKey()).longValue() * 1000, ((Long) entry.getValue()).longValue()));
        }
        this.f25073e.clear();
        this.f25073e.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).K()));
        this.f25073e.add(new com.huawei.android.pushagent.b.d.a.a(3600000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).L()));
        this.f25074f.clear();
        this.f25074f.add(new com.huawei.android.pushagent.b.d.a.a(86400000, com.huawei.android.pushagent.b.b.a.a(this.f25069a).M()));
        this.g.clear();
        for (Map.Entry entry2 : com.huawei.android.pushagent.b.b.a.a(this.f25069a).R().entrySet()) {
            this.g.add(new com.huawei.android.pushagent.b.d.a.a(((Long) entry2.getKey()).longValue() * 1000, ((Long) entry2.getValue()).longValue()));
        }
        e();
        return true;
    }

    private boolean d() {
        List list;
        List list2;
        if (1 == b.a(this.f25069a)) {
            list = this.f25073e;
            list2 = this.f25074f;
        } else {
            list = this.f25070b;
            list2 = this.f25071c;
        }
        return b(list, list2);
    }

    private boolean e() {
        try {
            h hVar = new h(this.f25069a, "PushConnectControl");
            return b(hVar, this.f25073e, "wifiTrsFirstFlowControlData") && b(hVar, this.f25074f, "wifiTrsFlowControlData") && b(hVar, this.g, "wifiVolumeControlData") && b(hVar, this.f25070b, "trsFirstFlowControlData") && b(hVar, this.f25071c, "trsFlowControlData") && b(hVar, this.f25072d, "volumeControlData");
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
            return false;
        }
    }

    private boolean f() {
        try {
            h hVar = new h(this.f25069a, "PushConnectControl");
            a(hVar, this.f25070b, "trsFirstFlowControlData");
            a(hVar, this.f25071c, "trsFlowControlData");
            a(hVar, this.f25072d, "volumeControlData");
            a(hVar, this.f25073e, "wifiTrsFirstFlowControlData");
            a(hVar, this.f25074f, "wifiTrsFlowControlData");
            a(hVar, this.g, "wifiVolumeControlData");
            return true;
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
            return false;
        }
    }

    public void a() {
        this.f25070b.clear();
        this.f25071c.clear();
        this.f25072d.clear();
        this.f25073e.clear();
        this.f25074f.clear();
        this.g.clear();
    }
}
