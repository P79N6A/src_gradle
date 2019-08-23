package com.bytedance.frameworks.baselib.network.http.b;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<URI, List<e>> f19747a = new HashMap();

    private static URI b(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URI("http", uri.getHost(), null, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    public final synchronized List<e> a(URI uri) {
        ArrayList arrayList;
        if (uri != null) {
            arrayList = new ArrayList();
            List list = this.f19747a.get(uri);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (eVar.a()) {
                        it2.remove();
                    } else {
                        arrayList.add(eVar);
                    }
                }
            }
            for (Map.Entry next : this.f19747a.entrySet()) {
                if (!uri.equals(next.getKey())) {
                    Iterator it3 = ((List) next.getValue()).iterator();
                    while (it3.hasNext()) {
                        e eVar2 = (e) it3.next();
                        if (e.a(eVar2.f19751d, uri.getHost())) {
                            if (eVar2.a()) {
                                it3.remove();
                            } else if (!arrayList.contains(eVar2)) {
                                arrayList.add(eVar2);
                            }
                        }
                    }
                }
            }
        } else {
            throw new NullPointerException("uri == null");
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized void a(URI uri, e eVar) {
        if (eVar != null) {
            URI b2 = b(uri);
            List list = this.f19747a.get(b2);
            if (list == null) {
                list = new ArrayList();
                this.f19747a.put(b2, list);
            } else {
                list.remove(eVar);
            }
            list.add(eVar);
        } else {
            throw new NullPointerException("cookie == null");
        }
    }
}
