package com.bytedance.frameworks.plugin.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import com.bytedance.frameworks.plugin.a.b;
import com.bytedance.frameworks.plugin.b.e;
import com.bytedance.frameworks.plugin.component.broadcast.c;
import com.bytedance.frameworks.plugin.core.b;
import com.bytedance.frameworks.plugin.d.d;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.pm.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PluginPackageManagerProvider extends b {

    class a extends a.C0172a {
        @Deprecated
        public final boolean c() {
            return true;
        }

        @Deprecated
        public final void d() {
        }

        @Deprecated
        public final String g() {
            return null;
        }

        @Deprecated
        public final void g(String str) {
        }

        public final List<String> b() {
            List<com.bytedance.frameworks.plugin.a.b> c2 = com.bytedance.frameworks.plugin.d.b.a().c();
            ArrayList arrayList = new ArrayList();
            if (c2.size() > 0) {
                for (com.bytedance.frameworks.plugin.a.b next : c2) {
                    if (next.h) {
                        arrayList.add(next.f2145a);
                    }
                }
            }
            return arrayList;
        }

        public final List<String> e() {
            ArrayList arrayList = new ArrayList();
            for (com.bytedance.frameworks.plugin.a.b bVar : com.bytedance.frameworks.plugin.d.b.a().c()) {
                arrayList.add(bVar.f2145a);
            }
            return arrayList;
        }

        public final List<com.bytedance.frameworks.plugin.a.a> f() {
            ArrayList arrayList = new ArrayList();
            for (com.bytedance.frameworks.plugin.a.b add : com.bytedance.frameworks.plugin.d.b.a().c()) {
                arrayList.add(add);
            }
            return arrayList;
        }

        public final List<com.bytedance.frameworks.plugin.a.b> h() {
            ArrayList arrayList = new ArrayList();
            for (com.bytedance.frameworks.plugin.a.b add : com.bytedance.frameworks.plugin.d.b.a().c()) {
                arrayList.add(add);
            }
            return arrayList;
        }

        private void i() {
            ArrayList<String> arrayList = new ArrayList<>();
            for (com.bytedance.frameworks.plugin.a.b next : com.bytedance.frameworks.plugin.d.b.a().c()) {
                if (next != null && next.o.getIndex() >= b.a.INSTALLED.getIndex() && !new File(e.a(next.f2145a, next.f2146b)).exists()) {
                    arrayList.add(next.f2145a);
                }
            }
            for (String str : arrayList) {
                g.c(str + " is broken!!! deleting...");
                d(str, 0);
            }
        }

        public final List<String> a() {
            i();
            ArrayList arrayList = new ArrayList();
            for (com.bytedance.frameworks.plugin.a.b next : com.bytedance.frameworks.plugin.d.b.a().c()) {
                if (next != null && next.o.getIndex() >= b.a.INSTALLED.getIndex()) {
                    arrayList.add(next.f2145a);
                }
            }
            return arrayList;
        }

        private a() {
        }

        public final com.bytedance.frameworks.plugin.a.a f(String str) {
            return com.bytedance.frameworks.plugin.d.b.a().a(str);
        }

        public final String h(String str) {
            if (i(str)) {
                return str;
            }
            return com.bytedance.frameworks.plugin.e.a().getPackageName();
        }

        public final com.bytedance.frameworks.plugin.a.b k(String str) {
            return com.bytedance.frameworks.plugin.d.b.a().a(str);
        }

        public final int c(String str) {
            i();
            com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str);
            if (a2 == null || a2.o.getIndex() < b.a.INSTALLED.getIndex()) {
                return -1;
            }
            return a2.f2146b;
        }

        public final boolean i(String str) {
            com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str);
            if (a2 == null || !a2.h) {
                return false;
            }
            return true;
        }

        public final int j(String str) {
            com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str);
            if (a2 != null) {
                return a2.o.getIndex();
            }
            return 0;
        }

        public final boolean d(String str) {
            if (i(str)) {
                return false;
            }
            com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str);
            if (a2 != null) {
                return a2.g;
            }
            return false;
        }

        public final boolean e(String str) {
            d.a().b(str);
            return true;
        }

        public final boolean b(String str) {
            boolean z = true;
            if (com.bytedance.frameworks.plugin.d.b.a().f2219a.contains(str)) {
                return true;
            }
            i();
            com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str);
            if (a2 == null || a2.o.getIndex() < b.a.INSTALLED.getIndex()) {
                z = false;
            }
            return z;
        }

        public final boolean a(com.bytedance.frameworks.plugin.a.b bVar) {
            return com.bytedance.frameworks.plugin.d.e.a().a(bVar);
        }

        public final boolean a(String str) {
            if (com.bytedance.frameworks.plugin.d.b.a().a(str) != null) {
                return true;
            }
            return false;
        }

        /* synthetic */ a(PluginPackageManagerProvider pluginPackageManagerProvider, byte b2) {
            this();
        }

        public final ActivityInfo b(ComponentName componentName, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().b(componentName, i);
        }

        public final ApplicationInfo c(String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().c(str, i);
        }

        public final ProviderInfo d(ComponentName componentName, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().d(componentName, i);
        }

        public final ActivityInfo a(ComponentName componentName, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().a(componentName, i);
        }

        public final ProviderInfo b(String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().b(str, i);
        }

        public final List<c> e(String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().a(str);
        }

        public final PackageInfo a(String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().a(str, i);
        }

        public final ServiceInfo c(ComponentName componentName, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().c(componentName, i);
        }

        public final int d(String str, int i) {
            d.a();
            if (com.bytedance.frameworks.plugin.d.b.a().a(str) != null) {
                SharedPreferences.Editor edit = com.bytedance.frameworks.plugin.core.d.a().f2195a.edit();
                edit.putBoolean("DELETED_" + str, true);
                edit.apply();
            }
            return 0;
        }

        public final int a(String str, boolean z, int i) {
            d.a().a(new File(str));
            return 0;
        }

        public final List<ResolveInfo> e(Intent intent, String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().c(intent, str, i);
        }

        public final ResolveInfo d(Intent intent, String str, int i) {
            i();
            List<ResolveInfo> c2 = com.bytedance.frameworks.plugin.d.e.a().c(intent, str, i);
            if (c2 == null || c2.size() <= 0) {
                return null;
            }
            return c2.get(0);
        }

        public final List<ResolveInfo> f(Intent intent, String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().d(intent, str, i);
        }

        public final ResolveInfo a(Intent intent, String str, int i) {
            i();
            List<ResolveInfo> a2 = com.bytedance.frameworks.plugin.d.e.a().a(intent, str, i);
            if (a2 == null || a2.size() <= 0) {
                return null;
            }
            return a2.get(0);
        }

        public final List<ResolveInfo> b(Intent intent, String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().a(intent, str, i);
        }

        public final List<ResolveInfo> c(Intent intent, String str, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().b(intent, str, i);
        }

        public final List<ProviderInfo> a(String str, String str2, int i) {
            i();
            return com.bytedance.frameworks.plugin.d.e.a().a(str, str2, i);
        }
    }

    public final IBinder b() {
        return new a(this, (byte) 0);
    }

    public boolean onCreate() {
        g.a("PluginPackageManagerProvider onCreate.");
        if (com.bytedance.frameworks.plugin.e.a() == null) {
            com.bytedance.frameworks.plugin.e.a(getContext());
        }
        return true;
    }
}
