package com.bytedance.scene.group;

import android.view.View;
import com.bytedance.scene.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    List<a> f22111a = new ArrayList();

    public final List<a> b() {
        return Collections.unmodifiableList(this.f22111a);
    }

    b() {
    }

    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f22111a) {
            arrayList.add(aVar.f22106b);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final a a(View view) {
        for (a next : this.f22111a) {
            if (view.equals(next.f22106b.f22094b)) {
                return next;
            }
        }
        return null;
    }

    public final a a(e eVar) {
        for (a next : this.f22111a) {
            if (next.f22106b == eVar) {
                return next;
            }
        }
        return null;
    }

    public final a a(String str) {
        for (a next : this.f22111a) {
            if (str.equals(next.f22107c)) {
                return next;
            }
        }
        return null;
    }
}
