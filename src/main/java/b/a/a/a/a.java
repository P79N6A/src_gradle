package b.a.a.a;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<C0003a> f1606a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private int f1607b = 100;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1608c;

    /* renamed from: b.a.a.a.a$a  reason: collision with other inner class name */
    static class C0003a {

        /* renamed from: a  reason: collision with root package name */
        String f1611a;

        /* renamed from: b  reason: collision with root package name */
        int f1612b;

        /* renamed from: c  reason: collision with root package name */
        JSONObject f1613c;

        /* renamed from: d  reason: collision with root package name */
        JSONObject f1614d;

        public C0003a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f1611a = str;
            this.f1612b = i;
            this.f1613c = jSONObject;
            this.f1614d = jSONObject2;
        }
    }

    public final void a(C0003a aVar) {
        synchronized (this.f1606a) {
            if (this.f1606a.size() > this.f1607b) {
                this.f1606a.poll();
            }
            this.f1606a.add(aVar);
        }
    }

    public final void a(final e eVar) {
        if (!this.f1608c) {
            this.f1608c = true;
            new Thread("handle_cache_monitor_data") {
                public final void run() {
                    LinkedList linkedList;
                    try {
                        synchronized (a.this.f1606a) {
                            linkedList = new LinkedList(a.this.f1606a);
                            a.this.f1606a.clear();
                        }
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            C0003a aVar = (C0003a) it2.next();
                            e eVar = eVar;
                            if (aVar != null) {
                                if (!TextUtils.isEmpty(aVar.f1611a)) {
                                    eVar.a(aVar.f1611a, aVar.f1612b, aVar.f1613c, aVar.f1614d);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }.start();
        }
    }
}
