package com.bytedance.frameworks.baselib.network.http.b;

import com.bytedance.frameworks.baselib.network.http.b.e;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class a extends CookieManager {

    /* renamed from: a  reason: collision with root package name */
    private c f19742a;

    /* renamed from: b  reason: collision with root package name */
    private b f19743b;

    public a() {
        this(null, null);
    }

    private static List<e> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (str != null && (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2"))) {
                for (String aVar : (List) next.getValue()) {
                    try {
                        for (e add : new e.a(aVar).a()) {
                            arrayList.add(add);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    private static Map<String, List<String>> a(List<e> list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (e eVar : list) {
            i = Math.min(i, eVar.l);
        }
        if (i == 1) {
            sb.append("$Version=\"1\"; ");
        }
        sb.append(list.get(0).toString());
        for (int i2 = 1; i2 < list.size(); i2++) {
            sb.append("; ");
            sb.append(list.get(i2).toString());
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
    }

    public a(c cVar, b bVar) {
        this.f19742a = cVar == null ? new d() : cVar;
        this.f19743b = bVar == null ? b.f19746c : bVar;
    }

    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        boolean z;
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f19742a.a(uri)) {
            if (e.a(eVar, uri)) {
                if (!eVar.i || "https".equalsIgnoreCase(uri.getScheme())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && e.b(eVar, uri)) {
                    arrayList.add(eVar);
                }
            }
        }
        return a((List<e>) arrayList);
    }

    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String str;
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        for (e next : a(map)) {
            if (next.f19751d == null) {
                next.a(uri.getHost());
            }
            if (next.g == null) {
                String path = uri.getPath();
                if (path == null) {
                    str = "/";
                } else {
                    str = path.substring(0, path.lastIndexOf(47) + 1);
                }
                next.g = str;
            } else if (!e.a(next, uri)) {
            }
            if ("".equals(next.h)) {
                next.h = Integer.toString(h.getEffectivePort(uri.getScheme(), uri.getPort()));
            } else if (next.h != null && !e.b(next, uri)) {
            }
            if (this.f19743b.a(uri, next)) {
                this.f19742a.a(uri, next);
            }
        }
    }
}
