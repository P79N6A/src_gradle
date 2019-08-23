package com.bytedance.android.livesdk.j;

import com.bytedance.android.livesdk.j.b.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public interface d {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15711a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f15712b = new HashMap();

        public static a a() {
            if (PatchProxy.isSupport(new Object[0], null, f15711a, true, 10871, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], null, f15711a, true, 10871, new Class[0], a.class);
            }
            return new a();
        }

        public final a a(Map<String, String> map) {
            if (PatchProxy.isSupport(new Object[]{map}, this, f15711a, false, 10873, new Class[]{Map.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{map}, this, f15711a, false, 10873, new Class[]{Map.class}, a.class);
            } else if (map == null || map.isEmpty()) {
                return this;
            } else {
                this.f15712b.putAll(map);
                return this;
            }
        }

        public final a a(g gVar, String... strArr) {
            if (PatchProxy.isSupport(new Object[]{gVar, strArr}, this, f15711a, false, 10875, new Class[]{g.class, String[].class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{gVar, strArr}, this, f15711a, false, 10875, new Class[]{g.class, String[].class}, a.class);
            } else if (strArr.length <= 0) {
                return this;
            } else {
                for (String a2 : strArr) {
                    a(a2, gVar);
                }
                return this;
            }
        }

        private a a(String str, g gVar) {
            String str2;
            String str3 = str;
            if (PatchProxy.isSupport(new Object[]{str3, gVar}, this, f15711a, false, 10874, new Class[]{String.class, g.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str3, gVar}, this, f15711a, false, 10874, new Class[]{String.class, g.class}, a.class);
            }
            Map<String, String> map = this.f15712b;
            if (PatchProxy.isSupport(new Object[]{str3, gVar}, null, e.f15713a, true, 10870, new Class[]{String.class, g.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{str3, gVar}, null, e.f15713a, true, 10870, new Class[]{String.class, g.class}, String.class);
            } else if (gVar == null) {
                str2 = "";
            } else {
                str2 = gVar.a().get(str3);
                if (str2 == null) {
                    str2 = "";
                }
            }
            map.put(str3, str2);
            return this;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f15711a, false, 10872, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f15711a, false, 10872, new Class[]{String.class, String.class}, a.class);
            }
            this.f15712b.put(str, str2);
            return this;
        }
    }
}
