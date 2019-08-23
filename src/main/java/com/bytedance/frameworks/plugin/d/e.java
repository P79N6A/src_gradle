package com.bytedance.frameworks.plugin.d;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.pm.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<ResolveInfo> f20025b = new Comparator<ResolveInfo>() {
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[PHI: r3 
          PHI: (r3v1 int) = (r3v2 int), (r3v0 int), (r3v0 int), (r3v0 int), (r3v0 int) binds: [B:17:0x0030, B:15:0x002c, B:11:0x0022, B:6:0x0016, B:2:0x000c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
                android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
                int r0 = r5.priority
                int r1 = r6.priority
                r2 = 1
                r3 = -1
                if (r0 == r1) goto L_0x0010
                if (r0 <= r1) goto L_0x000f
                goto L_0x0031
            L_0x000f:
                return r2
            L_0x0010:
                int r0 = r5.preferredOrder
                int r1 = r6.preferredOrder
                if (r0 == r1) goto L_0x001a
                if (r0 <= r1) goto L_0x0019
                goto L_0x0031
            L_0x0019:
                return r2
            L_0x001a:
                boolean r0 = r5.isDefault
                boolean r1 = r6.isDefault
                if (r0 == r1) goto L_0x0026
                boolean r5 = r5.isDefault
                if (r5 == 0) goto L_0x0025
                goto L_0x0031
            L_0x0025:
                return r2
            L_0x0026:
                int r5 = r5.match
                int r6 = r6.match
                if (r5 == r6) goto L_0x0030
                if (r5 <= r6) goto L_0x002f
                goto L_0x0031
            L_0x002f:
                return r2
            L_0x0030:
                r3 = 0
            L_0x0031:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.d.e.AnonymousClass1.compare(java.lang.Object, java.lang.Object):int");
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static e f20026c = new e();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, d.e> f20027a = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final a f20028d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final a f20029e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final c f20030f = new c();
    private final b g = new b();

    public static final class a extends com.bytedance.frameworks.plugin.pm.b<d.b, ResolveInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<ComponentName, d.a> f20031a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<ComponentName, d.a> f20032b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        private int f20033c;

        public final /* bridge */ /* synthetic */ IntentFilter[] a(int i) {
            return new d.b[i];
        }

        public final void a(List<ResolveInfo> list) {
            Collections.sort(list, e.f20025b);
        }

        public final void a(d.a aVar) {
            this.f20031a.remove(new ComponentName(aVar.f20053a.packageName, aVar.f20053a.name));
            com.bytedance.frameworks.plugin.a.b a2 = b.a().a(aVar.f20055b.h);
            if (a2 != null && !a2.h) {
                this.f20032b.remove(new ComponentName(com.bytedance.frameworks.plugin.e.a().getPackageName(), aVar.f20053a.name));
            }
            ArrayList arrayList = aVar.f20056c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    b((d.b) arrayList.get(i));
                }
            }
        }

        public final /* synthetic */ boolean a(String str, IntentFilter intentFilter) {
            return TextUtils.equals(str, ((d.b) intentFilter).f20054a.f20053a.packageName);
        }

        public final /* synthetic */ boolean a(IntentFilter intentFilter, List list) {
            d.b bVar = (d.b) intentFilter;
            for (int size = list.size() - 1; size >= 0; size--) {
                ActivityInfo activityInfo = ((ResolveInfo) list.get(size)).activityInfo;
                if (activityInfo.name == bVar.f20054a.f20053a.name && activityInfo.packageName == bVar.f20054a.f20053a.packageName) {
                    return false;
                }
            }
            return true;
        }

        public final void a(d.a aVar, String str) {
            this.f20031a.put(new ComponentName(aVar.f20053a.packageName, aVar.f20053a.name), aVar);
            com.bytedance.frameworks.plugin.a.b a2 = b.a().a(aVar.f20055b.h);
            if (a2 != null && !a2.h) {
                this.f20032b.put(new ComponentName(com.bytedance.frameworks.plugin.e.a().getPackageName(), aVar.f20053a.name), aVar);
            }
            ArrayList arrayList = aVar.f20056c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    d.b bVar = (d.b) arrayList.get(i);
                    if (bVar.getPriority() > 0 && PushConstants.INTENT_ACTIVITY_NAME.equals(str)) {
                        bVar.setPriority(0);
                    }
                    a(bVar);
                }
            }
        }

        public final List<ResolveInfo> a(Intent intent, String str, int i) {
            boolean z;
            this.f20033c = i;
            if ((i & 65536) != 0) {
                z = true;
            } else {
                z = false;
            }
            return super.a(intent, str, z, 0);
        }

        public final /* synthetic */ Object a(IntentFilter intentFilter, int i, int i2) {
            boolean z;
            d.b bVar = (d.b) intentFilter;
            ActivityInfo a2 = d.a(bVar.f20054a, 0);
            if (a2 == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.activityInfo = a2;
            if ((this.f20033c & 64) != 0) {
                resolveInfo.filter = bVar;
            }
            if ((this.f20033c & 65536) != 0) {
                z = bVar.hasCategory("android.intent.category.DEFAULT");
            } else {
                z = false;
            }
            resolveInfo.isDefault = z;
            resolveInfo.resolvePackageName = a2.packageName;
            resolveInfo.labelRes = a2.labelRes;
            resolveInfo.icon = a2.icon;
            resolveInfo.specificIndex = 1;
            resolveInfo.preferredOrder = 0;
            resolveInfo.priority = bVar.getPriority();
            resolveInfo.match = i;
            return resolveInfo;
        }

        public final List<ResolveInfo> a(Intent intent, String str, List<d.a> list, int i) {
            boolean z;
            if (list == null) {
                return null;
            }
            this.f20033c = i;
            if ((i & 65536) != 0) {
                z = true;
            } else {
                z = false;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList2 = list.get(i2).f20056c;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    d.b[] bVarArr = new d.b[arrayList2.size()];
                    arrayList2.toArray(bVarArr);
                    arrayList.add(bVarArr);
                }
            }
            return super.a(intent, str, z, arrayList, 0);
        }
    }

    public static final class b extends com.bytedance.frameworks.plugin.pm.b<d.j, ResolveInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<ComponentName, d.i> f20034a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<ComponentName, d.i> f20035b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        private int f20036c;

        public final /* bridge */ /* synthetic */ IntentFilter[] a(int i) {
            return new d.j[i];
        }

        public final void a(List<ResolveInfo> list) {
            Collections.sort(list, e.f20025b);
        }

        public final void b(d.i iVar) {
            this.f20034a.remove(new ComponentName(iVar.f20073a.packageName, iVar.f20073a.name));
            com.bytedance.frameworks.plugin.a.b a2 = b.a().a(iVar.f20055b.h);
            if (a2 != null && !a2.h) {
                this.f20035b.put(new ComponentName(com.bytedance.frameworks.plugin.e.a().getPackageName(), iVar.f20073a.name), iVar);
            }
            ArrayList arrayList = iVar.f20056c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    b((d.j) arrayList.get(i));
                }
            }
        }

        public final void a(d.i iVar) {
            this.f20034a.put(new ComponentName(iVar.f20073a.packageName, iVar.f20073a.name), iVar);
            com.bytedance.frameworks.plugin.a.b a2 = b.a().a(iVar.f20055b.h);
            if (a2 != null && !a2.h) {
                this.f20035b.put(new ComponentName(com.bytedance.frameworks.plugin.e.a().getPackageName(), iVar.f20073a.name), iVar);
            }
            ArrayList arrayList = iVar.f20056c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    a((d.j) arrayList.get(i));
                }
            }
        }

        public final /* synthetic */ boolean a(String str, IntentFilter intentFilter) {
            return TextUtils.equals(str, ((d.j) intentFilter).f20074a.f20073a.packageName);
        }

        @TargetApi(19)
        public final /* synthetic */ boolean a(IntentFilter intentFilter, List list) {
            d.j jVar = (d.j) intentFilter;
            for (int size = list.size() - 1; size >= 0; size--) {
                ProviderInfo providerInfo = ((ResolveInfo) list.get(size)).providerInfo;
                if (providerInfo.name == jVar.f20074a.f20073a.name && providerInfo.packageName == jVar.f20074a.f20073a.packageName) {
                    return false;
                }
            }
            return true;
        }

        public final List<ResolveInfo> a(Intent intent, String str, int i) {
            boolean z;
            this.f20036c = i;
            if ((i & 65536) != 0) {
                z = true;
            } else {
                z = false;
            }
            return super.a(intent, str, z, 0);
        }

        @TargetApi(19)
        public final /* synthetic */ Object a(IntentFilter intentFilter, int i, int i2) {
            boolean z;
            d.j jVar = (d.j) intentFilter;
            ProviderInfo a2 = d.a(jVar.f20074a, 0);
            if (a2 == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.providerInfo = a2;
            if ((this.f20036c & 64) != 0) {
                resolveInfo.filter = jVar;
            }
            if ((this.f20036c & 65536) != 0) {
                z = jVar.hasCategory("android.intent.category.DEFAULT");
            } else {
                z = false;
            }
            resolveInfo.isDefault = z;
            resolveInfo.preferredOrder = 0;
            resolveInfo.resolvePackageName = a2.packageName;
            resolveInfo.icon = a2.icon;
            resolveInfo.specificIndex = 1;
            resolveInfo.labelRes = a2.labelRes;
            resolveInfo.priority = jVar.getPriority();
            resolveInfo.match = i;
            return resolveInfo;
        }

        public final List<ResolveInfo> a(Intent intent, String str, List<d.i> list, int i) {
            boolean z;
            if (list == null) {
                return null;
            }
            this.f20036c = i;
            if ((i & 65536) != 0) {
                z = true;
            } else {
                z = false;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList2 = list.get(i2).f20056c;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    d.j[] jVarArr = new d.j[arrayList2.size()];
                    arrayList2.toArray(jVarArr);
                    arrayList.add(jVarArr);
                }
            }
            return super.a(intent, str, z, arrayList, 0);
        }
    }

    public static final class c extends com.bytedance.frameworks.plugin.pm.b<d.l, ResolveInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<ComponentName, d.k> f20037a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<ComponentName, d.k> f20038b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        private int f20039c;

        public final /* bridge */ /* synthetic */ IntentFilter[] a(int i) {
            return new d.l[i];
        }

        public final void a(List<ResolveInfo> list) {
            Collections.sort(list, e.f20025b);
        }

        public final void b(d.k kVar) {
            this.f20037a.remove(new ComponentName(kVar.f20075a.packageName, kVar.f20075a.name));
            com.bytedance.frameworks.plugin.a.b a2 = b.a().a(kVar.f20055b.h);
            if (a2 != null && !a2.h) {
                this.f20038b.put(new ComponentName(com.bytedance.frameworks.plugin.e.a().getPackageName(), kVar.f20075a.name), kVar);
            }
            ArrayList arrayList = kVar.f20056c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    b((d.l) arrayList.get(i));
                }
            }
        }

        public final void a(d.k kVar) {
            this.f20037a.put(new ComponentName(kVar.f20075a.packageName, kVar.f20075a.name), kVar);
            com.bytedance.frameworks.plugin.a.b a2 = b.a().a(kVar.f20055b.h);
            if (a2 != null && !a2.h) {
                this.f20038b.put(new ComponentName(com.bytedance.frameworks.plugin.e.a().getPackageName(), kVar.f20075a.name), kVar);
            }
            ArrayList arrayList = kVar.f20056c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    a((d.l) arrayList.get(i));
                }
            }
        }

        public final /* synthetic */ boolean a(String str, IntentFilter intentFilter) {
            return TextUtils.equals(str, ((d.l) intentFilter).f20076a.f20075a.packageName);
        }

        public final /* synthetic */ boolean a(IntentFilter intentFilter, List list) {
            d.l lVar = (d.l) intentFilter;
            for (int size = list.size() - 1; size >= 0; size--) {
                ServiceInfo serviceInfo = ((ResolveInfo) list.get(size)).serviceInfo;
                if (serviceInfo.name == lVar.f20076a.f20075a.name && serviceInfo.packageName == lVar.f20076a.f20075a.packageName) {
                    return false;
                }
            }
            return true;
        }

        public final List<ResolveInfo> a(Intent intent, String str, int i) {
            boolean z;
            this.f20039c = i;
            if ((i & 65536) != 0) {
                z = true;
            } else {
                z = false;
            }
            return super.a(intent, str, z, 0);
        }

        public final /* synthetic */ Object a(IntentFilter intentFilter, int i, int i2) {
            boolean z;
            d.l lVar = (d.l) intentFilter;
            ServiceInfo a2 = d.a(lVar.f20076a, 0);
            if (a2 == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.serviceInfo = a2;
            if ((this.f20039c & 64) != 0) {
                resolveInfo.filter = lVar;
            }
            if ((this.f20039c & 65536) != 0) {
                z = lVar.hasCategory("android.intent.category.DEFAULT");
            } else {
                z = false;
            }
            resolveInfo.isDefault = z;
            resolveInfo.preferredOrder = 0;
            resolveInfo.resolvePackageName = a2.packageName;
            resolveInfo.icon = a2.icon;
            resolveInfo.specificIndex = 1;
            resolveInfo.labelRes = a2.labelRes;
            resolveInfo.priority = lVar.getPriority();
            resolveInfo.match = i;
            return resolveInfo;
        }

        public final List<ResolveInfo> a(Intent intent, String str, List<d.k> list, int i) {
            boolean z;
            if (list == null) {
                return null;
            }
            this.f20039c = i;
            if ((i & 65536) != 0) {
                z = true;
            } else {
                z = false;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList2 = list.get(i2).f20056c;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    d.l[] lVarArr = new d.l[arrayList2.size()];
                    arrayList2.toArray(lVarArr);
                    arrayList.add(lVarArr);
                }
            }
            return super.a(intent, str, z, arrayList, 0);
        }
    }

    public static e a() {
        return f20026c;
    }

    private void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f20027a) {
                d.e eVar = this.f20027a.get(str);
                if (eVar != null) {
                    ArrayList<d.a> arrayList = eVar.f20062c;
                    if (arrayList != null && arrayList.size() > 0) {
                        for (d.a next : arrayList) {
                            if (next != null) {
                                this.f20028d.a(next);
                            }
                        }
                    }
                    ArrayList<d.a> arrayList2 = eVar.f20063d;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        for (d.a next2 : arrayList2) {
                            if (next2 != null) {
                                this.f20029e.a(next2);
                            }
                        }
                    }
                    ArrayList<d.k> arrayList3 = eVar.f20065f;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        for (d.k next3 : arrayList3) {
                            if (next3 != null) {
                                this.f20030f.b(next3);
                            }
                        }
                    }
                    ArrayList<d.i> arrayList4 = eVar.f20064e;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        for (d.i next4 : arrayList4) {
                            if (next4 != null) {
                                this.g.b(next4);
                            }
                        }
                    }
                    this.f20027a.remove(str);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        return java.util.Collections.EMPTY_LIST;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.frameworks.plugin.component.broadcast.c> a(java.lang.String r8) {
        /*
            r7 = this;
            java.util.HashMap<java.lang.String, com.bytedance.frameworks.plugin.pm.d$e> r0 = r7.f20027a
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, com.bytedance.frameworks.plugin.pm.d$e> r1 = r7.f20027a     // Catch:{ all -> 0x005d }
            java.lang.Object r8 = r1.get(r8)     // Catch:{ all -> 0x005d }
            com.bytedance.frameworks.plugin.pm.d$e r8 = (com.bytedance.frameworks.plugin.pm.d.e) r8     // Catch:{ all -> 0x005d }
            if (r8 == 0) goto L_0x0059
            java.util.ArrayList<com.bytedance.frameworks.plugin.pm.d$a> r8 = r8.f20063d     // Catch:{ all -> 0x005d }
            if (r8 == 0) goto L_0x0059
            int r1 = r8.size()     // Catch:{ all -> 0x005d }
            if (r1 <= 0) goto L_0x0059
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
            r1.<init>()     // Catch:{ all -> 0x005d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x005d }
        L_0x0020:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x005d }
            com.bytedance.frameworks.plugin.pm.d$a r2 = (com.bytedance.frameworks.plugin.pm.d.a) r2     // Catch:{ all -> 0x005d }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
            r3.<init>()     // Catch:{ all -> 0x005d }
            java.util.ArrayList r4 = r2.f20056c     // Catch:{ all -> 0x005d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x005d }
        L_0x0037:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x004c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x005d }
            android.content.IntentFilter r5 = (android.content.IntentFilter) r5     // Catch:{ all -> 0x005d }
            android.content.IntentFilter r6 = new android.content.IntentFilter     // Catch:{ all -> 0x005d }
            r6.<init>(r5)     // Catch:{ all -> 0x005d }
            r3.add(r6)     // Catch:{ all -> 0x005d }
            goto L_0x0037
        L_0x004c:
            com.bytedance.frameworks.plugin.component.broadcast.c r4 = new com.bytedance.frameworks.plugin.component.broadcast.c     // Catch:{ all -> 0x005d }
            java.lang.String r2 = r2.f20057d     // Catch:{ all -> 0x005d }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x005d }
            r1.add(r4)     // Catch:{ all -> 0x005d }
            goto L_0x0020
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return r1
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L_0x005d:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.d.e.a(java.lang.String):java.util.List");
    }

    public final boolean a(com.bytedance.frameworks.plugin.a.b bVar) {
        try {
            b(bVar.f2145a);
            d(com.bytedance.frameworks.plugin.b.e.a(bVar.f2145a, bVar.f2146b), 0);
            g.a("Resolve plugin " + bVar.f2145a + " success");
            return true;
        } catch (Exception e2) {
            b(bVar.f2145a);
            g.a("Resolve plugin " + bVar.f2145a + " failed", (Throwable) e2);
            return false;
        }
    }

    public final PackageInfo a(String str, int i) {
        synchronized (this.f20027a) {
            d.e eVar = this.f20027a.get(str);
            if (eVar == null) {
                return null;
            }
            PackageInfo a2 = d.a(eVar, i);
            return a2;
        }
    }

    public final ActivityInfo a(ComponentName componentName, int i) {
        synchronized (this.f20027a) {
            d.a aVar = this.f20028d.f20031a.get(componentName);
            if (aVar == null) {
                aVar = this.f20028d.f20032b.get(componentName);
            }
            if (aVar == null) {
                return null;
            }
            ActivityInfo a2 = d.a(aVar, i);
            return a2;
        }
    }

    public final ActivityInfo b(ComponentName componentName, int i) {
        synchronized (this.f20027a) {
            d.a aVar = this.f20029e.f20031a.get(componentName);
            if (aVar == null) {
                aVar = this.f20029e.f20032b.get(componentName);
            }
            if (aVar == null) {
                return null;
            }
            ActivityInfo a2 = d.a(aVar, i);
            return a2;
        }
    }

    public final ServiceInfo c(ComponentName componentName, int i) {
        synchronized (this.f20027a) {
            d.k kVar = this.f20030f.f20037a.get(componentName);
            if (kVar == null) {
                kVar = this.f20030f.f20038b.get(componentName);
            }
            if (kVar == null) {
                return null;
            }
            ServiceInfo a2 = d.a(kVar, i);
            return a2;
        }
    }

    public final ProviderInfo d(ComponentName componentName, int i) {
        synchronized (this.f20027a) {
            d.i iVar = this.g.f20034a.get(componentName);
            if (iVar == null) {
                iVar = this.g.f20035b.get(componentName);
            }
            if (iVar == null) {
                return null;
            }
            ProviderInfo a2 = d.a(iVar, i);
            return a2;
        }
    }

    public final ProviderInfo b(String str, int i) {
        synchronized (this.f20027a) {
            for (d.e eVar : this.f20027a.values()) {
                ArrayList<d.i> arrayList = eVar.f20064e;
                if (arrayList != null && arrayList.size() > 0) {
                    for (d.i a2 : arrayList) {
                        ProviderInfo a3 = d.a(a2, i);
                        if (a3 != null && TextUtils.equals(str, a3.authority)) {
                            return a3;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    public final ApplicationInfo c(String str, int i) {
        synchronized (this.f20027a) {
            d.e eVar = this.f20027a.get(str);
            if (eVar != null) {
                ApplicationInfo b2 = d.b(eVar, i);
                return b2;
            } else if ((i & SearchJediMixFeedAdapter.f42517f) == 0) {
                return null;
            } else {
                ApplicationInfo applicationInfo = new ApplicationInfo(com.bytedance.frameworks.plugin.e.a().getApplicationInfo());
                if (applicationInfo.metaData == null) {
                    applicationInfo.metaData = new Bundle();
                }
                for (d.e next : this.f20027a.values()) {
                    com.bytedance.frameworks.plugin.a.b a2 = b.a().a(str);
                    if (a2 != null && !a2.h && next.i != null && !next.i.isEmpty()) {
                        applicationInfo.metaData.putAll(next.i);
                    }
                }
                return applicationInfo;
            }
        }
    }

    private void d(String str, int i) throws Exception {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            d.e a2 = new d().a(new File(str), 0);
            if (a2 != null) {
                synchronized (this.f20027a) {
                    ArrayList<d.a> arrayList = a2.f20062c;
                    if (arrayList != null && arrayList.size() > 0) {
                        for (d.a next : arrayList) {
                            if (next != null) {
                                this.f20028d.a(next, PushConstants.INTENT_ACTIVITY_NAME);
                            }
                        }
                    }
                    ArrayList<d.a> arrayList2 = a2.f20063d;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        for (d.a next2 : arrayList2) {
                            if (next2 != null) {
                                this.f20029e.a(next2, "receiver");
                            }
                        }
                    }
                    ArrayList<d.k> arrayList3 = a2.f20065f;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        for (d.k next3 : arrayList3) {
                            if (next3 != null) {
                                this.f20030f.a(next3);
                            }
                        }
                    }
                    ArrayList<d.i> arrayList4 = a2.f20064e;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        for (d.i next4 : arrayList4) {
                            if (next4 != null) {
                                this.g.a(next4);
                            }
                        }
                    }
                    this.f20027a.put(a2.h, a2);
                }
            }
        }
    }

    public final List<ResolveInfo> a(Intent intent, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component == null && Build.VERSION.SDK_INT >= 15 && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo a2 = a(component, i);
            if (a2 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = a2;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.f20027a) {
            String str2 = intent.getPackage();
            if (!TextUtils.isEmpty(str2)) {
                d.e eVar = this.f20027a.get(str2);
                if (eVar != null) {
                    List<ResolveInfo> a3 = this.f20028d.a(intent, str, eVar.f20062c, i);
                    return a3;
                }
            }
            List<ResolveInfo> a4 = this.f20028d.a(intent, str, i);
            return a4;
        }
    }

    @TargetApi(19)
    public final List<ResolveInfo> d(Intent intent, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ProviderInfo d2 = d(component, i);
            if (d2 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.providerInfo = d2;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.f20027a) {
            String str2 = intent.getPackage();
            if (!TextUtils.isEmpty(str2)) {
                d.e eVar = this.f20027a.get(str2);
                if (eVar != null) {
                    List<ResolveInfo> a2 = this.g.a(intent, str, eVar.f20064e, i);
                    return a2;
                }
            }
            List<ResolveInfo> a3 = this.g.a(intent, str, i);
            return a3;
        }
    }

    public final List<ResolveInfo> c(Intent intent, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component == null && Build.VERSION.SDK_INT >= 15 && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ServiceInfo c2 = c(component, i);
            if (c2 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.serviceInfo = c2;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.f20027a) {
            String str2 = intent.getPackage();
            if (!TextUtils.isEmpty(str2)) {
                d.e eVar = this.f20027a.get(str2);
                if (eVar != null) {
                    List<ResolveInfo> a2 = this.f20030f.a(intent, str, eVar.f20065f, i);
                    return a2;
                }
            }
            List<ResolveInfo> a3 = this.f20030f.a(intent, str, i);
            return a3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return java.util.Collections.EMPTY_LIST;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.content.pm.ProviderInfo> a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, com.bytedance.frameworks.plugin.pm.d$e> r0 = r4.f20027a
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, com.bytedance.frameworks.plugin.pm.d$e> r1 = r4.f20027a     // Catch:{ all -> 0x004a }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x004a }
            com.bytedance.frameworks.plugin.pm.d$e r5 = (com.bytedance.frameworks.plugin.pm.d.e) r5     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0046
            java.util.ArrayList<com.bytedance.frameworks.plugin.pm.d$i> r5 = r5.f20064e     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0046
            int r1 = r5.size()     // Catch:{ all -> 0x004a }
            if (r1 <= 0) goto L_0x0046
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            r1.<init>()     // Catch:{ all -> 0x004a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x004a }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x004a }
            com.bytedance.frameworks.plugin.pm.d$i r2 = (com.bytedance.frameworks.plugin.pm.d.i) r2     // Catch:{ all -> 0x004a }
            android.content.pm.ProviderInfo r2 = com.bytedance.frameworks.plugin.pm.d.a((com.bytedance.frameworks.plugin.pm.d.i) r2, (int) r7)     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0020
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0040
            java.lang.String r3 = r2.processName     // Catch:{ all -> 0x004a }
            boolean r3 = android.text.TextUtils.equals(r6, r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0020
        L_0x0040:
            r1.add(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0020
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            return r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.d.e.a(java.lang.String, java.lang.String, int):java.util.List");
    }

    public final List<ResolveInfo> b(Intent intent, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component == null && Build.VERSION.SDK_INT >= 15 && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo b2 = b(component, i);
            if (b2 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = b2;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.f20027a) {
            String str2 = intent.getPackage();
            if (!TextUtils.isEmpty(str2)) {
                d.e eVar = this.f20027a.get(str2);
                if (eVar != null) {
                    List<ResolveInfo> a2 = this.f20029e.a(intent, str, eVar.f20063d, i);
                    return a2;
                }
            }
            List<ResolveInfo> a3 = this.f20029e.a(intent, str, i);
            return a3;
        }
    }
}
