package com.ss.android.http.a.b;

import com.ss.android.http.a.a;
import java.util.ArrayList;
import java.util.List;

public class f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public List f2464a = new ArrayList(16);

    public Object clone() throws CloneNotSupportedException {
        f fVar = (f) super.clone();
        fVar.f2464a = new ArrayList(this.f2464a);
        return fVar;
    }

    public final void a(a aVar) {
        this.f2464a.add(aVar);
    }

    public final a a(String str) {
        for (int i = 0; i < this.f2464a.size(); i++) {
            a aVar = (a) this.f2464a.get(i);
            if (aVar.a().equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }
}
