package com.bytedance.frameworks.plugin.am;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f20006a;

    /* renamed from: b  reason: collision with root package name */
    public String f20007b;

    /* renamed from: c  reason: collision with root package name */
    public String f20008c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20009d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder.DeathRecipient f20010e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f20011f = new ArrayList();
    public List<String> g = new ArrayList();
    public TreeMap<String, ActivityInfo> h = new TreeMap<>();
    public TreeMap<String, ActivityInfo> i = new TreeMap<>();
    public TreeMap<String, ServiceInfo> j = new TreeMap<>();
    public TreeMap<String, ProviderInfo> k = new TreeMap<>();
    public HashMap<String, ActivityInfo> l = new HashMap<>();
    public HashMap<String, ArrayList<ServiceInfo>> m = new HashMap<>();
    public HashMap<String, ArrayList<ActivityInfo>> n = new HashMap<>();
    public HashMap<String, ArrayList<ProviderInfo>> o = new HashMap<>();
    private Map<String, ServiceInfo> p = new HashMap();

    public final synchronized void a(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
        if (!this.g.contains(activityInfo2.packageName)) {
            this.g.add(activityInfo2.packageName);
        }
        if (!this.f20011f.contains(activityInfo2.processName)) {
            this.f20011f.add(activityInfo2.processName);
        }
        if (this.l.get(activityInfo.name) == null) {
            this.l.put(activityInfo.name, activityInfo2);
        }
    }

    public final synchronized void a(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) {
        if (!this.g.contains(serviceInfo2.packageName)) {
            this.g.add(serviceInfo2.packageName);
        }
        if (!this.f20011f.contains(serviceInfo2.processName)) {
            this.f20011f.add(serviceInfo2.processName);
        }
        if (!this.p.containsKey(serviceInfo2.name)) {
            this.p.put(serviceInfo2.name, serviceInfo);
        }
        ArrayList arrayList = this.m.get(serviceInfo.name);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.m.put(serviceInfo.name, arrayList);
        }
        boolean z = false;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ServiceInfo serviceInfo3 = (ServiceInfo) it2.next();
            if (TextUtils.equals(serviceInfo3.packageName, serviceInfo2.packageName) && TextUtils.equals(serviceInfo3.name, serviceInfo2.name)) {
                z = true;
                break;
            }
        }
        if (!z) {
            arrayList.add(serviceInfo2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(android.content.pm.ComponentInfo r5, com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider.b r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 == 0) goto L_0x0069
            java.lang.String r1 = r5.processName     // Catch:{ all -> 0x0066 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0069
            if (r6 != 0) goto L_0x000f
            goto L_0x0069
        L_0x000f:
            java.util.List<java.lang.String> r1 = r4.g     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0066 }
            r2 = 1
            if (r1 == 0) goto L_0x0037
            java.util.List<java.lang.String> r1 = r4.f20011f     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0037
            boolean r1 = r4.f20009d     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0035
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = r4.f20007b     // Catch:{ all -> 0x0066 }
            r1[r0] = r3     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = r5.processName     // Catch:{ all -> 0x0066 }
            r1[r2] = r5     // Catch:{ all -> 0x0066 }
            boolean r5 = r6.a((java.lang.String[]) r1)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            return r5
        L_0x0035:
            monitor-exit(r4)
            return r2
        L_0x0037:
            java.util.List<java.lang.String> r1 = r4.g     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = r5.packageName     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x004d
            java.util.List<java.lang.String> r1 = r4.f20011f     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = r5.processName     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x004d
            monitor-exit(r4)
            return r2
        L_0x004d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = r5.processName     // Catch:{ all -> 0x0066 }
            r1.add(r5)     // Catch:{ all -> 0x0066 }
            java.util.List<java.lang.String> r5 = r4.f20011f     // Catch:{ all -> 0x0066 }
            r1.addAll(r5)     // Catch:{ all -> 0x0066 }
            boolean r5 = r6.b(r1)     // Catch:{ all -> 0x0066 }
            if (r5 == 0) goto L_0x0064
            monitor-exit(r4)
            return r2
        L_0x0064:
            monitor-exit(r4)
            return r0
        L_0x0066:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0069:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.f.a(android.content.pm.ComponentInfo, com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider$b):boolean");
    }

    public final synchronized void a() {
        this.f20006a = 0;
        this.f20011f.clear();
        this.g.clear();
        this.l.clear();
        this.m.clear();
        this.o.clear();
        this.n.clear();
        this.f20010e = null;
    }

    public f() {
    }

    public final synchronized void d(ActivityInfo activityInfo) {
        if (this.l.get(activityInfo.name) != null) {
            this.l.remove(activityInfo.name);
        }
    }

    public final synchronized boolean c(ActivityInfo activityInfo) {
        if (this.l == null) {
            return false;
        }
        for (ActivityInfo next : this.l.values()) {
            if (next != null && TextUtils.equals(next.packageName, activityInfo.packageName) && TextUtils.equals(next.name, activityInfo.name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.pm.ActivityInfo b(android.content.pm.ActivityInfo r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0050
            java.lang.String r1 = r6.packageName     // Catch:{ all -> 0x004d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = r6.name     // Catch:{ all -> 0x004d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0015
            goto L_0x0050
        L_0x0015:
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r1 = r5.i     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r6.name     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x004d }
            android.content.pm.ActivityInfo r1 = (android.content.pm.ActivityInfo) r1     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0026
            r5.c(r1, r6)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r1
        L_0x0026:
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r1 = r5.h     // Catch:{ all -> 0x004d }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x004d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004d }
        L_0x0030:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x004d }
            android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r2.name     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "com.bytedance.frameworks.plugin.stub.[_a-zA-Z0-9]+.StubReceiver"
            boolean r3 = r3.matches(r4)     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0030
            r5.c(r2, r6)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r2
        L_0x004b:
            monitor-exit(r5)
            return r0
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0050:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.f.b(android.content.pm.ActivityInfo):android.content.pm.ActivityInfo");
    }

    public f(String str) {
        this.f20007b = str;
        this.f20009d = TextUtils.equals(str, e.a().getApplicationInfo().processName);
        if (this.f20007b.matches(".+:plugin[0-9]+")) {
            this.f20008c = "p" + this.f20007b.substring(this.f20007b.lastIndexOf(":plugin") + 7);
            return;
        }
        this.f20008c = "p0";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.pm.ActivityInfo a(android.content.pm.ActivityInfo r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            if (r7 == 0) goto L_0x010a
            java.lang.String r1 = r7.packageName     // Catch:{ all -> 0x0107 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x010a
            java.lang.String r1 = r7.name     // Catch:{ all -> 0x0107 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x0016
            goto L_0x010a
        L_0x0016:
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r1 = r6.h     // Catch:{ all -> 0x0107 }
            int r1 = r1.size()     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "AAAAAAAA mStubActivities=0 mStubProcessName="
            r1.<init>(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = r6.f20007b     // Catch:{ all -> 0x0107 }
            r1.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            com.bytedance.frameworks.plugin.f.g.c(r1)     // Catch:{ all -> 0x0107 }
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r1 = r6.h     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = r6.f20007b     // Catch:{ all -> 0x0107 }
            a((java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo>) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0107 }
        L_0x0038:
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r1 = r6.h     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = r7.name     // Catch:{ all -> 0x0107 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0107 }
            android.content.pm.ActivityInfo r1 = (android.content.pm.ActivityInfo) r1     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x0049
            r6.a((android.content.pm.ActivityInfo) r1, (android.content.pm.ActivityInfo) r7)     // Catch:{ all -> 0x0107 }
            monitor-exit(r6)
            return r1
        L_0x0049:
            java.util.HashMap<java.lang.String, android.content.pm.ActivityInfo> r1 = r6.l     // Catch:{ all -> 0x0107 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0107 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0107 }
        L_0x0053:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x0089
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0107 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x0053
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x0107 }
            android.content.pm.ActivityInfo r3 = (android.content.pm.ActivityInfo) r3     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = r3.packageName     // Catch:{ all -> 0x0107 }
            java.lang.String r5 = r7.packageName     // Catch:{ all -> 0x0107 }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0053
            java.lang.String r3 = r3.name     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = r7.name     // Catch:{ all -> 0x0107 }
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ all -> 0x0107 }
            if (r3 == 0) goto L_0x0053
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r7 = r6.h     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x0107 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0107 }
            android.content.pm.ActivityInfo r7 = (android.content.pm.ActivityInfo) r7     // Catch:{ all -> 0x0107 }
            monitor-exit(r6)
            return r7
        L_0x0089:
            android.os.Bundle r1 = r7.metaData     // Catch:{ all -> 0x0107 }
            r2 = 0
            if (r1 == 0) goto L_0x0098
            android.os.Bundle r1 = r7.metaData     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = "isTranslucent"
            boolean r1 = r1.getBoolean(r3, r2)     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x00b3
        L_0x0098:
            int r1 = r7.getThemeResource()     // Catch:{ all -> 0x0107 }
            r3 = 16973839(0x103000f, float:2.4060942E-38)
            if (r1 == r3) goto L_0x00b3
            int r1 = r7.getThemeResource()     // Catch:{ all -> 0x0107 }
            r3 = 16973840(0x1030010, float:2.4060945E-38)
            if (r1 == r3) goto L_0x00b3
            int r1 = r7.getThemeResource()     // Catch:{ all -> 0x0107 }
            r3 = 16973841(0x1030011, float:2.4060948E-38)
            if (r1 != r3) goto L_0x00d4
        L_0x00b3:
            java.lang.String r1 = "com.bytedance.frameworks.plugin.stub.%s.StubTranslucentActivity"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = r6.f20008c     // Catch:{ all -> 0x0107 }
            r3[r2] = r4     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ all -> 0x0107 }
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r2 = r6.h     // Catch:{ all -> 0x0107 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0107 }
            android.content.pm.ActivityInfo r1 = (android.content.pm.ActivityInfo) r1     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x00d4
            java.lang.String r0 = "Select translucent activity for this activity"
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r0)     // Catch:{ all -> 0x0107 }
            r6.a((android.content.pm.ActivityInfo) r1, (android.content.pm.ActivityInfo) r7)     // Catch:{ all -> 0x0107 }
            monitor-exit(r6)
            return r1
        L_0x00d4:
            java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r1 = r6.h     // Catch:{ all -> 0x0107 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0107 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0107 }
        L_0x00de:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x0105
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0107 }
            android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r2.name     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = "com.bytedance.frameworks.plugin.stub.[_a-zA-Z0-9]+.Stub[a-zA-Z]+Activity[0-9]+"
            boolean r3 = r3.matches(r4)     // Catch:{ all -> 0x0107 }
            if (r3 == 0) goto L_0x00de
            int r3 = r2.launchMode     // Catch:{ all -> 0x0107 }
            int r4 = r7.launchMode     // Catch:{ all -> 0x0107 }
            if (r3 != r4) goto L_0x00de
            boolean r3 = r6.d(r2, r7)     // Catch:{ all -> 0x0107 }
            if (r3 == 0) goto L_0x00de
            r6.a((android.content.pm.ActivityInfo) r2, (android.content.pm.ActivityInfo) r7)     // Catch:{ all -> 0x0107 }
            monitor-exit(r6)
            return r2
        L_0x0105:
            monitor-exit(r6)
            return r0
        L_0x0107:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x010a:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.f.a(android.content.pm.ActivityInfo):android.content.pm.ActivityInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.pm.ProviderInfo a(android.content.pm.ProviderInfo r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0050
            java.lang.String r1 = r6.packageName     // Catch:{ all -> 0x004d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = r6.name     // Catch:{ all -> 0x004d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0015
            goto L_0x0050
        L_0x0015:
            java.util.TreeMap<java.lang.String, android.content.pm.ProviderInfo> r1 = r5.k     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r6.name     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x004d }
            android.content.pm.ProviderInfo r1 = (android.content.pm.ProviderInfo) r1     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0026
            r5.a((android.content.pm.ProviderInfo) r1, (android.content.pm.ProviderInfo) r6)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r1
        L_0x0026:
            java.util.TreeMap<java.lang.String, android.content.pm.ProviderInfo> r1 = r5.k     // Catch:{ all -> 0x004d }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x004d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004d }
        L_0x0030:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x004d }
            android.content.pm.ProviderInfo r2 = (android.content.pm.ProviderInfo) r2     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r2.name     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "com.bytedance.frameworks.plugin.stub.[_a-zA-Z0-9]+.StubContentProvider"
            boolean r3 = r3.matches(r4)     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0030
            r5.a((android.content.pm.ProviderInfo) r2, (android.content.pm.ProviderInfo) r6)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r2
        L_0x004b:
            monitor-exit(r5)
            return r0
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0050:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.f.a(android.content.pm.ProviderInfo):android.content.pm.ProviderInfo");
    }

    public final synchronized boolean b(ServiceInfo serviceInfo) {
        if (this.m == null) {
            return false;
        }
        Iterator<ArrayList<ServiceInfo>> it2 = this.m.values().iterator();
        while (it2.hasNext()) {
            ArrayList next = it2.next();
            int i2 = 0;
            while (next != null && i2 < next.size()) {
                ServiceInfo serviceInfo2 = (ServiceInfo) next.get(i2);
                if (serviceInfo2 != null && TextUtils.equals(serviceInfo2.packageName, serviceInfo.packageName) && TextUtils.equals(serviceInfo2.name, serviceInfo.name)) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.pm.ServiceInfo a(android.content.pm.ServiceInfo r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0055
            java.lang.String r1 = r6.packageName     // Catch:{ all -> 0x0052 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = r6.name     // Catch:{ all -> 0x0052 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0015
            goto L_0x0055
        L_0x0015:
            java.util.Map<java.lang.String, android.content.pm.ServiceInfo> r1 = r5.p     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = r6.name     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x002b
            java.util.Map<java.lang.String, android.content.pm.ServiceInfo> r0 = r5.p     // Catch:{ all -> 0x0052 }
            java.lang.String r6 = r6.name     // Catch:{ all -> 0x0052 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0052 }
            android.content.pm.ServiceInfo r6 = (android.content.pm.ServiceInfo) r6     // Catch:{ all -> 0x0052 }
            monitor-exit(r5)
            return r6
        L_0x002b:
            java.util.TreeMap<java.lang.String, android.content.pm.ServiceInfo> r1 = r5.j     // Catch:{ all -> 0x0052 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0052 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0052 }
        L_0x0035:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0052 }
            android.content.pm.ServiceInfo r2 = (android.content.pm.ServiceInfo) r2     // Catch:{ all -> 0x0052 }
            java.util.HashMap<java.lang.String, java.util.ArrayList<android.content.pm.ServiceInfo>> r3 = r5.m     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r2.name     // Catch:{ all -> 0x0052 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x0052 }
            if (r3 != 0) goto L_0x0035
            r5.a((android.content.pm.ServiceInfo) r2, (android.content.pm.ServiceInfo) r6)     // Catch:{ all -> 0x0052 }
            monitor-exit(r5)
            return r2
        L_0x0050:
            monitor-exit(r5)
            return r0
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0055:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.f.a(android.content.pm.ServiceInfo):android.content.pm.ServiceInfo");
    }

    private synchronized boolean d(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
        ActivityInfo activityInfo3 = this.l.get(activityInfo.name);
        if (activityInfo3 == null || (TextUtils.equals(activityInfo3.packageName, activityInfo2.packageName) && TextUtils.equals(activityInfo3.name, activityInfo2.name))) {
            return true;
        }
        return false;
    }

    private synchronized void a(ProviderInfo providerInfo, ProviderInfo providerInfo2) {
        if (!this.g.contains(providerInfo2.packageName)) {
            this.g.add(providerInfo2.packageName);
        }
        if (!this.f20011f.contains(providerInfo2.processName)) {
            this.f20011f.add(providerInfo2.processName);
        }
        ArrayList arrayList = this.o.get(providerInfo2.name);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o.put(providerInfo.name, arrayList);
        }
        boolean z = false;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ProviderInfo providerInfo3 = (ProviderInfo) it2.next();
            if (TextUtils.equals(providerInfo3.packageName, providerInfo2.packageName) && TextUtils.equals(providerInfo3.name, providerInfo2.name)) {
                z = true;
                break;
            }
        }
        if (!z) {
            arrayList.add(providerInfo2);
        }
    }

    private synchronized void c(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
        if (!this.g.contains(activityInfo2.packageName)) {
            this.g.add(activityInfo2.packageName);
        }
        if (!this.f20011f.contains(activityInfo2.processName)) {
            this.f20011f.add(activityInfo2.processName);
        }
        ArrayList arrayList = this.n.get(activityInfo.name);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.n.put(activityInfo.name, arrayList);
        }
        boolean z = false;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ActivityInfo activityInfo3 = (ActivityInfo) it2.next();
            if (TextUtils.equals(activityInfo3.packageName, activityInfo2.packageName) && TextUtils.equals(activityInfo3.name, activityInfo2.name)) {
                z = true;
                break;
            }
        }
        if (!z) {
            arrayList.add(activityInfo2);
        }
    }

    private static void a(TreeMap<String, ActivityInfo> treeMap, String str) {
        Intent intent = new Intent();
        intent.setAction("com.intent.action.ACTION_STUB_PLUGIN");
        intent.addCategory("com.intent.category.PLUGIN_DEFAULT");
        intent.setPackage(e.a().getPackageName());
        List<ResolveInfo> queryIntentActivities = e.a().getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo.processName.equals(str)) {
                    treeMap.put(activityInfo.name, activityInfo);
                }
            }
        }
    }

    public final synchronized void b(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
        ArrayList arrayList = this.n.get(activityInfo.name);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ActivityInfo activityInfo3 = (ActivityInfo) it2.next();
                if (TextUtils.equals(activityInfo3.packageName, activityInfo2.packageName) && TextUtils.equals(activityInfo3.name, activityInfo2.name)) {
                    it2.remove();
                }
            }
        }
        if (arrayList != null && arrayList.size() == 0) {
            this.n.remove(activityInfo.name);
        }
    }

    public final synchronized void b(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) {
        ArrayList arrayList = this.m.get(serviceInfo.name);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ServiceInfo serviceInfo3 = (ServiceInfo) it2.next();
                if (TextUtils.equals(serviceInfo3.packageName, serviceInfo2.packageName) && TextUtils.equals(serviceInfo3.name, serviceInfo2.name)) {
                    it2.remove();
                }
            }
        }
        if (arrayList != null && arrayList.size() == 0) {
            this.m.remove(serviceInfo.name);
        }
        if (this.p.containsKey(serviceInfo2.name)) {
            this.p.remove(serviceInfo2.name);
        }
    }
}
