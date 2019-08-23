package com.bytedance.frameworks.plugin.am;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.am.c;
import com.bytedance.frameworks.plugin.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class PluginActivityManagerProvider extends com.bytedance.frameworks.plugin.core.b {

    /* renamed from: a  reason: collision with root package name */
    final TreeMap<String, f> f19990a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    final TreeMap<String, f> f19991b = new TreeMap<>();

    /* renamed from: c  reason: collision with root package name */
    final b f19992c = new b();

    /* renamed from: d  reason: collision with root package name */
    final Object f19993d = new Object();

    /* renamed from: e  reason: collision with root package name */
    AtomicBoolean f19994e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    Handler f19995f = new Handler() {
        public final void handleMessage(Message message) {
            int i = message.what;
            if ((i >>> 24) == 1) {
                int i2 = i & -16777217;
                if (i2 > 0) {
                    try {
                        if (!Build.BRAND.toLowerCase().equals("oppo")) {
                            String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
                            if (!TextUtils.isEmpty(str) && str.startsWith("gray_")) {
                                if (ToolUtils.isMainProcess(GlobalContext.getContext())) {
                                    throw new RuntimeException("Process killed, pid is " + i2);
                                }
                            }
                            Process.killProcess(i2);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    };

    class a extends c.a {

        /* renamed from: com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider$a$a  reason: collision with other inner class name */
        final class C0164a implements IBinder.DeathRecipient {

            /* renamed from: b  reason: collision with root package name */
            private b f20000b;

            /* renamed from: c  reason: collision with root package name */
            private String f20001c;

            /* renamed from: d  reason: collision with root package name */
            private int f20002d;

            public final void binderDied() {
                synchronized (PluginActivityManagerProvider.this) {
                    Iterator<Map.Entry<String, f>> it2 = PluginActivityManagerProvider.this.f19991b.entrySet().iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        Map.Entry next = it2.next();
                        f fVar = (f) next.getValue();
                        if (fVar.f20006a != this.f20002d) {
                            if (!TextUtils.equals(fVar.f20007b, this.f20001c)) {
                                i += fVar.l.size();
                            }
                        }
                        fVar.a();
                        it2.remove();
                        PluginActivityManagerProvider.this.f19990a.put(next.getKey(), fVar);
                    }
                    if (i == 0) {
                        KeepAlive.a();
                    }
                }
            }

            public C0164a(b bVar, String str, int i) {
                this.f20000b = bVar;
                this.f20001c = str;
                this.f20002d = i;
            }
        }

        public final void a(List<String> list) {
            PluginActivityManagerProvider.this.f19992c.a(list);
        }

        public final synchronized ServiceInfo a(ServiceInfo serviceInfo) {
            PluginActivityManagerProvider.this.a();
            b();
            a();
            String a2 = PluginActivityManagerProvider.this.f19992c.a(serviceInfo.processName);
            if (TextUtils.isEmpty(a2)) {
                a2 = serviceInfo.processName;
            }
            if (!TextUtils.isEmpty(a2)) {
                f fVar = PluginActivityManagerProvider.this.f19991b.get(a2);
                if (fVar != null) {
                    ServiceInfo a3 = fVar.a(serviceInfo);
                    if (a3 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(fVar.f20006a | 16777216);
                        return a3;
                    }
                }
                f fVar2 = PluginActivityManagerProvider.this.f19990a.get(a2);
                if (fVar2 != null) {
                    ServiceInfo a4 = fVar2.a(serviceInfo);
                    a(fVar2);
                    PluginActivityManagerProvider.this.f19990a.remove(fVar2.f20007b);
                    PluginActivityManagerProvider.this.f19991b.put(fVar2.f20007b, fVar2);
                    return a4;
                }
            }
            for (f next : PluginActivityManagerProvider.this.f19991b.values()) {
                if (next.a((ComponentInfo) serviceInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ServiceInfo a5 = next.a(serviceInfo);
                    if (a5 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(next.f20006a | 16777216);
                        return a5;
                    }
                }
            }
            Iterator<Map.Entry<String, f>> it2 = PluginActivityManagerProvider.this.f19990a.entrySet().iterator();
            while (it2.hasNext()) {
                f fVar3 = (f) it2.next().getValue();
                if (fVar3.a((ComponentInfo) serviceInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ServiceInfo a6 = fVar3.a(serviceInfo);
                    a(fVar3);
                    it2.remove();
                    PluginActivityManagerProvider.this.f19991b.put(fVar3.f20007b, fVar3);
                    return a6;
                }
            }
            return null;
        }

        public final synchronized void a(ApplicationInfo applicationInfo, String str, int i, b bVar) {
            for (f next : PluginActivityManagerProvider.this.f19991b.values()) {
                if (next.g.contains(applicationInfo.packageName) && TextUtils.equals(str, next.f20007b)) {
                    next.f20006a = i;
                    if (!(bVar == null || i == Process.myPid() || next.f20010e != null)) {
                        try {
                            C0164a aVar = new C0164a(bVar, str, i);
                            bVar.asBinder().linkToDeath(aVar, 0);
                            next.f20010e = aVar;
                            return;
                        } catch (RemoteException unused) {
                            return;
                        }
                    }
                }
            }
            f fVar = PluginActivityManagerProvider.this.f19990a.get(str);
            if (fVar != null) {
                fVar.f20006a = i;
                PluginActivityManagerProvider.this.f19990a.remove(str);
                PluginActivityManagerProvider.this.f19991b.put(fVar.f20007b, fVar);
                if (!(bVar == null || i == Process.myPid() || fVar.f20010e != null)) {
                    try {
                        C0164a aVar2 = new C0164a(bVar, str, i);
                        bVar.asBinder().linkToDeath(aVar2, 0);
                        fVar.f20010e = aVar2;
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }

        private void b() {
            ActivityManager activityManager = (ActivityManager) PluginActivityManagerProvider.this.getContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                while (it2.hasNext()) {
                    ActivityManager.RunningAppProcessInfo next = it2.next();
                    Set<String> keySet = PluginActivityManagerProvider.this.f19991b.keySet();
                    if (next.uid != Process.myUid() || !keySet.contains(next.processName) || next.pid == Process.myPid()) {
                        it2.remove();
                    }
                }
                for (ActivityManager.RunningAppProcessInfo next2 : runningAppProcesses) {
                    if (next2.importance == 1000 || next2.importance == 500 || next2.importance == 400 || next2.importance == 300) {
                        a(next2);
                    }
                }
            }
        }

        private void a() {
            if (!PluginActivityManagerProvider.this.f19991b.isEmpty()) {
                ActivityManager activityManager = (ActivityManager) PluginActivityManagerProvider.this.getContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                if (activityManager != null) {
                    HashSet hashSet = new HashSet();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        hashSet.add(runningAppProcessInfo.processName);
                    }
                    Iterator<Map.Entry<String, f>> it2 = PluginActivityManagerProvider.this.f19991b.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry next = it2.next();
                        if (!hashSet.contains(next.getKey())) {
                            f fVar = (f) next.getValue();
                            fVar.a();
                            it2.remove();
                            PluginActivityManagerProvider.this.f19990a.put(next.getKey(), fVar);
                            if (PluginActivityManagerProvider.this.f19991b.size() == 0) {
                                KeepAlive.a();
                            }
                        }
                    }
                }
            }
        }

        private a() {
        }

        public final synchronized ServiceInfo c(ServiceInfo serviceInfo) {
            f fVar = PluginActivityManagerProvider.this.f19991b.get(serviceInfo.processName);
            if (fVar != null && fVar.m.containsKey(serviceInfo.name)) {
                List list = fVar.m.get(serviceInfo.name);
                if (list != null && list.size() > 0) {
                    return (ServiceInfo) list.get(0);
                }
            }
            return null;
        }

        private void a(f fVar) {
            ActivityManager activityManager = (ActivityManager) PluginActivityManagerProvider.this.getContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null && !fVar.f20009d) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (TextUtils.equals(next.processName, fVar.f20007b)) {
                        try {
                            if (!Build.BRAND.toLowerCase().equals("oppo")) {
                                e.a(next.pid);
                                Thread.sleep(50);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        public final synchronized boolean c(ActivityInfo activityInfo) {
            for (f fVar : PluginActivityManagerProvider.this.f19991b.values()) {
                if (fVar.h.get(activityInfo.name) != null) {
                    return true;
                }
            }
            for (f fVar2 : PluginActivityManagerProvider.this.f19990a.values()) {
                if (fVar2.h.get(activityInfo.name) != null) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(ActivityInfo activityInfo) {
            for (f fVar : PluginActivityManagerProvider.this.f19991b.values()) {
                if (fVar.i.get(activityInfo.name) != null) {
                    return true;
                }
            }
            for (f fVar2 : PluginActivityManagerProvider.this.f19990a.values()) {
                if (fVar2.i.get(activityInfo.name) != null) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized ActivityInfo b(ActivityInfo activityInfo) {
            PluginActivityManagerProvider.this.a();
            b();
            a();
            String a2 = PluginActivityManagerProvider.this.f19992c.a(activityInfo.processName);
            if (TextUtils.isEmpty(a2)) {
                a2 = activityInfo.processName;
            }
            if (!TextUtils.isEmpty(a2)) {
                f fVar = PluginActivityManagerProvider.this.f19991b.get(a2);
                if (fVar != null) {
                    ActivityInfo b2 = fVar.b(activityInfo);
                    if (b2 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(fVar.f20006a | 16777216);
                        return b2;
                    }
                }
                f fVar2 = PluginActivityManagerProvider.this.f19990a.get(a2);
                if (fVar2 != null) {
                    ActivityInfo b3 = fVar2.b(activityInfo);
                    a(fVar2);
                    PluginActivityManagerProvider.this.f19990a.remove(fVar2.f20007b);
                    PluginActivityManagerProvider.this.f19991b.put(fVar2.f20007b, fVar2);
                    return b3;
                }
            }
            for (f next : PluginActivityManagerProvider.this.f19991b.values()) {
                if (next.a((ComponentInfo) activityInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ActivityInfo b4 = next.b(activityInfo);
                    if (b4 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(next.f20006a | 16777216);
                        return b4;
                    }
                }
            }
            Iterator<Map.Entry<String, f>> it2 = PluginActivityManagerProvider.this.f19990a.entrySet().iterator();
            while (it2.hasNext()) {
                f fVar3 = (f) it2.next().getValue();
                if (fVar3.a((ComponentInfo) activityInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ActivityInfo b5 = fVar3.b(activityInfo);
                    a(fVar3);
                    it2.remove();
                    PluginActivityManagerProvider.this.f19991b.put(fVar3.f20007b, fVar3);
                    return b5;
                }
            }
            return null;
        }

        private void a(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
            int i;
            f fVar = PluginActivityManagerProvider.this.f19991b.get(runningAppProcessInfo.processName);
            if (fVar != null) {
                Iterator it2 = new HashSet(fVar.m.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (entry != null && ((ArrayList) entry.getValue()).size() == 0) {
                        it2.remove();
                        for (ServiceInfo next : fVar.j.values()) {
                            if (TextUtils.equals(next.name, (CharSequence) entry.getKey())) {
                                Intent intent = new Intent();
                                intent.setClassName(next.packageName, next.name);
                                PluginActivityManagerProvider.this.getContext().stopService(intent);
                            }
                        }
                    }
                }
                if (fVar.l.size() == 0 && fVar.m.size() == 0 && fVar.n.size() == 0 && fVar.o.size() == 0) {
                    Message obtain = Message.obtain();
                    if (fVar.f20006a != 0) {
                        i = fVar.f20006a;
                    } else {
                        i = runningAppProcessInfo.pid;
                    }
                    obtain.what = i | 16777216;
                    PluginActivityManagerProvider.this.f19995f.sendMessageDelayed(obtain, 30000);
                }
            }
        }

        public final synchronized ActivityInfo a(ActivityInfo activityInfo) {
            PluginActivityManagerProvider.this.a();
            b();
            a();
            String a2 = PluginActivityManagerProvider.this.f19992c.a(activityInfo.processName);
            if (TextUtils.isEmpty(a2)) {
                a2 = activityInfo.processName;
            }
            if (!TextUtils.isEmpty(a2)) {
                f fVar = PluginActivityManagerProvider.this.f19991b.get(a2);
                if (fVar != null) {
                    ActivityInfo a3 = fVar.a(activityInfo);
                    if (a3 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(fVar.f20006a | 16777216);
                        return a3;
                    }
                }
                f fVar2 = PluginActivityManagerProvider.this.f19990a.get(a2);
                if (fVar2 != null) {
                    ActivityInfo a4 = fVar2.a(activityInfo);
                    a(fVar2);
                    PluginActivityManagerProvider.this.f19990a.remove(fVar2.f20007b);
                    PluginActivityManagerProvider.this.f19991b.put(fVar2.f20007b, fVar2);
                    return a4;
                }
            }
            for (f next : PluginActivityManagerProvider.this.f19991b.values()) {
                if (next.a((ComponentInfo) activityInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ActivityInfo a5 = next.a(activityInfo);
                    if (a5 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(next.f20006a | 16777216);
                        return a5;
                    }
                }
            }
            Iterator<Map.Entry<String, f>> it2 = PluginActivityManagerProvider.this.f19990a.entrySet().iterator();
            while (it2.hasNext()) {
                f fVar3 = (f) it2.next().getValue();
                if (fVar3.a((ComponentInfo) activityInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ActivityInfo a6 = fVar3.a(activityInfo);
                    a(fVar3);
                    it2.remove();
                    PluginActivityManagerProvider.this.f19991b.put(fVar3.f20007b, fVar3);
                    return a6;
                }
            }
            return null;
        }

        public final boolean b(ProviderInfo providerInfo) {
            for (f fVar : PluginActivityManagerProvider.this.f19991b.values()) {
                if (fVar.k.get(providerInfo.name) != null) {
                    return true;
                }
            }
            for (f fVar2 : PluginActivityManagerProvider.this.f19990a.values()) {
                if (fVar2.k.get(providerInfo.name) != null) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized ProviderInfo a(ProviderInfo providerInfo) {
            PluginActivityManagerProvider.this.a();
            b();
            a();
            String a2 = PluginActivityManagerProvider.this.f19992c.a(providerInfo.processName);
            if (TextUtils.isEmpty(a2)) {
                a2 = providerInfo.processName;
            }
            if (!TextUtils.isEmpty(a2)) {
                f fVar = PluginActivityManagerProvider.this.f19991b.get(a2);
                if (fVar != null) {
                    ProviderInfo a3 = fVar.a(providerInfo);
                    if (a3 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(fVar.f20006a | 16777216);
                        return a3;
                    }
                }
                f fVar2 = PluginActivityManagerProvider.this.f19990a.get(a2);
                if (fVar2 != null) {
                    ProviderInfo a4 = fVar2.a(providerInfo);
                    a(fVar2);
                    PluginActivityManagerProvider.this.f19990a.remove(fVar2.f20007b);
                    PluginActivityManagerProvider.this.f19991b.put(fVar2.f20007b, fVar2);
                    return a4;
                }
            }
            for (f next : PluginActivityManagerProvider.this.f19991b.values()) {
                if (next.a((ComponentInfo) providerInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ProviderInfo a5 = next.a(providerInfo);
                    if (a5 != null) {
                        PluginActivityManagerProvider.this.f19995f.removeMessages(next.f20006a | 16777216);
                        return a5;
                    }
                }
            }
            Iterator<Map.Entry<String, f>> it2 = PluginActivityManagerProvider.this.f19990a.entrySet().iterator();
            while (it2.hasNext()) {
                f fVar3 = (f) it2.next().getValue();
                if (fVar3.a((ComponentInfo) providerInfo, PluginActivityManagerProvider.this.f19992c)) {
                    ProviderInfo a6 = fVar3.a(providerInfo);
                    a(fVar3);
                    it2.remove();
                    PluginActivityManagerProvider.this.f19991b.put(fVar3.f20007b, fVar3);
                    return a6;
                }
            }
            return null;
        }

        public final synchronized boolean b(ServiceInfo serviceInfo) {
            for (f fVar : PluginActivityManagerProvider.this.f19991b.values()) {
                if (fVar.j.get(serviceInfo.name) != null) {
                    return true;
                }
            }
            for (f fVar2 : PluginActivityManagerProvider.this.f19990a.values()) {
                if (fVar2.j.get(serviceInfo.name) != null) {
                    return true;
                }
            }
            return false;
        }

        /* synthetic */ a(PluginActivityManagerProvider pluginActivityManagerProvider, byte b2) {
            this();
        }

        public final synchronized void a(ProviderInfo providerInfo, ProviderInfo providerInfo2) {
        }

        public final void a(String str, String str2) {
            PluginActivityManagerProvider.this.f19992c.a(str, str2);
        }

        public final synchronized void a(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) {
            f fVar = PluginActivityManagerProvider.this.f19991b.get(serviceInfo.processName);
            if (fVar != null && !fVar.b(serviceInfo2)) {
                fVar.a(serviceInfo, serviceInfo2);
            }
        }

        public final synchronized void b(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) {
            f fVar = PluginActivityManagerProvider.this.f19991b.get(serviceInfo.processName);
            if (fVar != null) {
                fVar.b(serviceInfo, serviceInfo2);
            }
            b();
        }

        public final synchronized void c(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
            f fVar = PluginActivityManagerProvider.this.f19991b.get(activityInfo.processName);
            if (fVar != null) {
                fVar.b(activityInfo, activityInfo2);
            }
            b();
        }

        public final synchronized void a(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
            f fVar = PluginActivityManagerProvider.this.f19991b.get(activityInfo.processName);
            if (fVar != null && !fVar.c(activityInfo2)) {
                fVar.a(activityInfo, activityInfo2);
            }
            if (fVar != null && !fVar.f20009d) {
                e.a().startService(new Intent(e.a(), KeepAlive.class));
            }
        }

        public final synchronized void b(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
            f fVar = PluginActivityManagerProvider.this.f19991b.get(activityInfo.processName);
            if (fVar != null) {
                fVar.d(activityInfo);
            }
            int i = 0;
            for (f next : PluginActivityManagerProvider.this.f19991b.values()) {
                if (!next.f20009d) {
                    i += next.l.size();
                }
            }
            if (i == 0) {
                KeepAlive.a();
            }
            b();
        }

        public final synchronized void a(ActivityInfo activityInfo, ActivityInfo activityInfo2, Intent intent) {
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f20003a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private final List<Collection<String>> f20004b = new ArrayList();

        b() {
        }

        public final synchronized boolean a(String... strArr) {
            return b(Arrays.asList(strArr));
        }

        public final synchronized String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f20003a.get(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean b(java.util.List<java.lang.String> r6) {
            /*
                r5 = this;
                monitor-enter(r5)
                r0 = 0
                if (r6 == 0) goto L_0x003c
                int r1 = r6.size()     // Catch:{ all -> 0x0039 }
                r2 = 2
                if (r1 < r2) goto L_0x003c
                java.util.List<java.util.Collection<java.lang.String>> r1 = r5.f20004b     // Catch:{ all -> 0x0039 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0039 }
                if (r1 == 0) goto L_0x0014
                goto L_0x003c
            L_0x0014:
                java.util.List<java.util.Collection<java.lang.String>> r1 = r5.f20004b     // Catch:{ all -> 0x0039 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0039 }
            L_0x001a:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0039 }
                if (r3 == 0) goto L_0x0037
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0039 }
                java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0039 }
                if (r3 == 0) goto L_0x001a
                int r4 = r3.size()     // Catch:{ all -> 0x0039 }
                if (r4 < r2) goto L_0x001a
                boolean r3 = r3.containsAll(r6)     // Catch:{ all -> 0x0039 }
                if (r3 == 0) goto L_0x001a
                r6 = 1
                monitor-exit(r5)
                return r6
            L_0x0037:
                monitor-exit(r5)
                return r0
            L_0x0039:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            L_0x003c:
                monitor-exit(r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider.b.b(java.util.List):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(java.util.List<java.lang.String> r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                if (r3 == 0) goto L_0x0015
                int r0 = r3.size()     // Catch:{ all -> 0x0012 }
                r1 = 2
                if (r0 >= r1) goto L_0x000b
                goto L_0x0015
            L_0x000b:
                java.util.List<java.util.Collection<java.lang.String>> r0 = r2.f20004b     // Catch:{ all -> 0x0012 }
                r0.add(r3)     // Catch:{ all -> 0x0012 }
                monitor-exit(r2)
                return
            L_0x0012:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            L_0x0015:
                monitor-exit(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider.b.a(java.util.List):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(java.lang.String r2, java.lang.String r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x0015
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0017 }
                if (r0 == 0) goto L_0x000e
                goto L_0x0015
            L_0x000e:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.f20003a     // Catch:{ all -> 0x0017 }
                r0.put(r2, r3)     // Catch:{ all -> 0x0017 }
                monitor-exit(r1)
                return
            L_0x0015:
                monitor-exit(r1)
                return
            L_0x0017:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider.b.a(java.lang.String, java.lang.String):void");
        }
    }

    public final IBinder b() {
        return new a(this, (byte) 0);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f19994e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r2.f19993d
            monitor-enter(r0)
            java.lang.Object r1 = r2.f19993d     // Catch:{ InterruptedException -> 0x0013 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0013 }
            goto L_0x0013
        L_0x0011:
            r1 = move-exception
            goto L_0x0015
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider.a():void");
    }

    public boolean onCreate() {
        if (e.a() == null) {
            e.a(getContext());
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
                if (r6.authority.matches(java.lang.String.format("%s.stub.[_a-zA-Z0-9]+.STUB_AUTHORITY", new java.lang.Object[]{r0.getContext().getPackageName()})) == false) goto L_0x010d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r11 = this;
                    com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider r0 = com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider.this
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>()
                    java.lang.String r2 = "com.intent.action.ACTION_STUB_PLUGIN"
                    r1.setAction(r2)
                    java.lang.String r2 = "com.intent.category.PLUGIN_DEFAULT"
                    r1.addCategory(r2)
                    android.content.Context r2 = r0.getContext()
                    java.lang.String r2 = r2.getPackageName()
                    r1.setPackage(r2)
                    android.content.Context r2 = r0.getContext()
                    android.content.pm.PackageManager r2 = r2.getPackageManager()
                    r3 = 0
                    java.util.List r2 = r2.queryIntentActivities(r1, r3)
                    if (r2 == 0) goto L_0x006f
                    int r4 = r2.size()
                    if (r4 <= 0) goto L_0x006f
                    java.util.Iterator r2 = r2.iterator()
                L_0x0035:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x006f
                    java.lang.Object r4 = r2.next()
                    android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
                    android.content.pm.ActivityInfo r4 = r4.activityInfo
                    java.util.TreeMap<java.lang.String, com.bytedance.frameworks.plugin.am.f> r5 = r0.f19990a
                    java.lang.String r6 = r4.processName
                    java.lang.Object r5 = r5.get(r6)
                    com.bytedance.frameworks.plugin.am.f r5 = (com.bytedance.frameworks.plugin.am.f) r5
                    if (r5 != 0) goto L_0x005d
                    com.bytedance.frameworks.plugin.am.f r5 = new com.bytedance.frameworks.plugin.am.f
                    java.lang.String r6 = r4.processName
                    r5.<init>(r6)
                    java.util.TreeMap<java.lang.String, com.bytedance.frameworks.plugin.am.f> r6 = r0.f19990a
                    java.lang.String r7 = r4.processName
                    r6.put(r7, r5)
                L_0x005d:
                    java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r6 = r5.h
                    java.lang.String r7 = r4.name
                    boolean r6 = r6.containsKey(r7)
                    if (r6 != 0) goto L_0x0035
                    java.util.TreeMap<java.lang.String, android.content.pm.ActivityInfo> r5 = r5.h
                    java.lang.String r6 = r4.name
                    r5.put(r6, r4)
                    goto L_0x0035
                L_0x006f:
                    android.content.Context r2 = r0.getContext()
                    android.content.pm.PackageManager r2 = r2.getPackageManager()
                    java.util.List r1 = r2.queryIntentServices(r1, r3)
                    if (r1 == 0) goto L_0x00cb
                    int r2 = r1.size()
                    if (r2 <= 0) goto L_0x00cb
                    java.util.Iterator r1 = r1.iterator()
                L_0x0087:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x00cb
                    java.lang.Object r2 = r1.next()
                    android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
                    android.content.pm.ServiceInfo r2 = r2.serviceInfo
                    java.lang.String r4 = r2.name
                    java.lang.String r5 = "\\bcom.bytedance.frameworks.plugin.stub.p[0-9]+.StubService[0-9]+\\b"
                    boolean r4 = r4.matches(r5)
                    if (r4 == 0) goto L_0x0087
                    java.util.TreeMap<java.lang.String, com.bytedance.frameworks.plugin.am.f> r4 = r0.f19990a
                    java.lang.String r5 = r2.processName
                    java.lang.Object r4 = r4.get(r5)
                    com.bytedance.frameworks.plugin.am.f r4 = (com.bytedance.frameworks.plugin.am.f) r4
                    if (r4 != 0) goto L_0x00b9
                    com.bytedance.frameworks.plugin.am.f r4 = new com.bytedance.frameworks.plugin.am.f
                    java.lang.String r5 = r2.processName
                    r4.<init>(r5)
                    java.util.TreeMap<java.lang.String, com.bytedance.frameworks.plugin.am.f> r5 = r0.f19990a
                    java.lang.String r6 = r2.processName
                    r5.put(r6, r4)
                L_0x00b9:
                    java.util.TreeMap<java.lang.String, android.content.pm.ServiceInfo> r5 = r4.j
                    java.lang.String r6 = r2.name
                    boolean r5 = r5.containsKey(r6)
                    if (r5 != 0) goto L_0x0087
                    java.util.TreeMap<java.lang.String, android.content.pm.ServiceInfo> r4 = r4.j
                    java.lang.String r5 = r2.name
                    r4.put(r5, r2)
                    goto L_0x0087
                L_0x00cb:
                    r1 = 1
                    android.content.Context r2 = r0.getContext()     // Catch:{ NameNotFoundException -> 0x0151 }
                    android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0151 }
                    android.content.Context r4 = r0.getContext()     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0151 }
                    r5 = 8
                    android.content.pm.PackageInfo r2 = r2.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0151 }
                    android.content.pm.ProviderInfo[] r2 = r2.providers     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r2 == 0) goto L_0x0151
                    int r4 = r2.length     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r4 <= 0) goto L_0x0151
                    int r4 = r2.length     // Catch:{ NameNotFoundException -> 0x0151 }
                    r5 = 0
                L_0x00eb:
                    if (r5 >= r4) goto L_0x0151
                    r6 = r2[r5]     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r7 = r6.authority     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r7 == 0) goto L_0x010d
                    java.lang.String r7 = r6.authority     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r8 = "%s.stub.[_a-zA-Z0-9]+.STUB_AUTHORITY"
                    java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ NameNotFoundException -> 0x0151 }
                    android.content.Context r10 = r0.getContext()     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x0151 }
                    r9[r3] = r10     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r8 = java.lang.String.format(r8, r9)     // Catch:{ NameNotFoundException -> 0x0151 }
                    boolean r7 = r7.matches(r8)     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r7 != 0) goto L_0x0123
                L_0x010d:
                    int r7 = r6.descriptionRes     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r7 == 0) goto L_0x014e
                    android.content.Context r7 = r0.getContext()     // Catch:{ NameNotFoundException -> 0x0151 }
                    int r8 = r6.descriptionRes     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r7 = r7.getString(r8)     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r8 = "com.bytedance.frameworks.plugin.stub.StubContentProvider"
                    boolean r7 = android.text.TextUtils.equals(r7, r8)     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r7 == 0) goto L_0x014e
                L_0x0123:
                    java.util.TreeMap<java.lang.String, com.bytedance.frameworks.plugin.am.f> r7 = r0.f19990a     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r8 = r6.processName     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.Object r7 = r7.get(r8)     // Catch:{ NameNotFoundException -> 0x0151 }
                    com.bytedance.frameworks.plugin.am.f r7 = (com.bytedance.frameworks.plugin.am.f) r7     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r7 != 0) goto L_0x013d
                    com.bytedance.frameworks.plugin.am.f r7 = new com.bytedance.frameworks.plugin.am.f     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r8 = r6.processName     // Catch:{ NameNotFoundException -> 0x0151 }
                    r7.<init>(r8)     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.util.TreeMap<java.lang.String, com.bytedance.frameworks.plugin.am.f> r8 = r0.f19990a     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r9 = r6.processName     // Catch:{ NameNotFoundException -> 0x0151 }
                    r8.put(r9, r7)     // Catch:{ NameNotFoundException -> 0x0151 }
                L_0x013d:
                    java.util.TreeMap<java.lang.String, android.content.pm.ProviderInfo> r8 = r7.k     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r9 = r6.name     // Catch:{ NameNotFoundException -> 0x0151 }
                    boolean r8 = r8.containsKey(r9)     // Catch:{ NameNotFoundException -> 0x0151 }
                    if (r8 != 0) goto L_0x014e
                    java.util.TreeMap<java.lang.String, android.content.pm.ProviderInfo> r7 = r7.k     // Catch:{ NameNotFoundException -> 0x0151 }
                    java.lang.String r8 = r6.name     // Catch:{ NameNotFoundException -> 0x0151 }
                    r7.put(r8, r6)     // Catch:{ NameNotFoundException -> 0x0151 }
                L_0x014e:
                    int r5 = r5 + 1
                    goto L_0x00eb
                L_0x0151:
                    java.util.concurrent.atomic.AtomicBoolean r2 = r0.f19994e
                    r2.set(r1)
                    java.lang.Object r1 = r0.f19993d
                    monitor-enter(r1)
                    java.lang.Object r0 = r0.f19993d     // Catch:{ all -> 0x0160 }
                    r0.notifyAll()     // Catch:{ all -> 0x0160 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0160 }
                    return
                L_0x0160:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0160 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.PluginActivityManagerProvider.AnonymousClass2.run():void");
            }
        });
        return super.onCreate();
    }
}
