package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class h implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Map<List<String>, i> f80638b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private long f80639c = 0;

    public long b() {
        return this.f80639c;
    }

    public boolean a(List<String> list, List<String> list2) {
        if (list == null || list.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size() - 1; i++) {
            arrayList.add(d.b(list.get(i)));
        }
        if (list == null || list.size() == 0) {
            return false;
        }
        return arrayList.contains(list2);
    }

    public Map<List<String>, i> a() {
        return this.f80638b;
    }

    public void d() {
        this.f80638b.clear();
    }

    public int c() {
        if (this.f80638b != null) {
            return this.f80638b.size();
        }
        return 0;
    }

    public void a(long j) {
        this.f80639c = j;
    }

    private void b(Map<List<String>, i> map) {
        new ArrayList();
        new ArrayList();
        Iterator<Map.Entry<List<String>, i>> it2 = this.f80638b.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            List list = (List) next.getKey();
            Iterator<Map.Entry<List<String>, i>> it3 = this.f80638b.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry next2 = it3.next();
                List list2 = (List) next.getKey();
                if (!list.equals(list2)) {
                    this.f80638b.put(list2, next2.getValue());
                } else {
                    i iVar = (i) next2.getValue();
                    a((i) next.getValue(), iVar);
                    this.f80638b.remove(list);
                    this.f80638b.put(list, iVar);
                }
            }
        }
    }

    public void a(f fVar) {
        for (List next : this.f80638b.keySet()) {
            if (!fVar.a()) {
                fVar.a(this.f80638b.get(next), false);
            } else {
                return;
            }
        }
    }

    public void a(Map<List<String>, i> map) {
        if (this.f80638b.size() <= 0) {
            this.f80638b = map;
        } else {
            b(map);
        }
    }

    public boolean a(List<?> list) {
        if (this.f80638b == null || !this.f80638b.containsKey(list)) {
            return false;
        }
        return true;
    }

    private void a(i iVar, i iVar2) {
        iVar2.c(iVar2.g() + iVar.g());
        iVar2.b(iVar2.f() + iVar.f());
        iVar2.a(iVar2.e() + iVar.e());
        for (int i = 0; i < iVar.d().size(); i++) {
            iVar2.a(iVar.d().get(i));
        }
    }

    public void a(final f fVar, l lVar) {
        try {
            if (a(lVar.a())) {
                i iVar = this.f80638b.get(lVar.a());
                if (iVar != null) {
                    iVar.a(new f() {
                        public void a(Object obj, boolean z) {
                            i iVar = (i) obj;
                            h.this.f80638b.remove(iVar.a());
                            h.this.f80638b.put(iVar.b(), iVar);
                            fVar.a(this, false);
                        }
                    }, lVar);
                } else {
                    a(fVar, lVar.a(), lVar);
                }
            } else {
                a(fVar, lVar.a(), lVar);
            }
        } catch (Exception unused) {
            by.e("aggregated faild!");
        }
    }

    private void a(f fVar, l lVar, List<String> list) {
        if (a(list)) {
            a(fVar, lVar);
        } else {
            a(fVar, list, lVar);
        }
    }

    public void a(f fVar, List<String> list, l lVar) {
        i iVar = new i();
        iVar.a(lVar);
        this.f80638b.put(list, iVar);
        fVar.a(this, false);
    }

    public void a(f fVar, l lVar, List<String> list, List<String> list2) {
        while (list.size() > 0) {
            try {
                if (list.size() == 1) {
                    if (!a(list2, list)) {
                        fVar.a(Boolean.FALSE, false);
                        return;
                    } else {
                        a(fVar, lVar, list);
                        return;
                    }
                } else if (a(list2, list)) {
                    a(fVar, lVar, list);
                    return;
                } else {
                    list.remove(list.size() - 1);
                }
            } catch (Exception unused) {
                by.e("overFlowAggregated faild");
                return;
            }
        }
    }
}
