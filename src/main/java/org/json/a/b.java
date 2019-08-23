package org.json.a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f84172a;

    public b() {
        this.f84172a = new ArrayList();
    }

    public b(Object obj) {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f84172a.add(Array.get(obj, i));
            }
            return;
        }
        throw new a("JSONArray initial value should be a string or collection or array.");
    }

    public b(String str) {
        this(new d(str));
    }

    public b(Collection collection) {
        this.f84172a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public b(d dVar) {
        this();
        char c2;
        ArrayList arrayList;
        Object d2;
        char c3 = dVar.c();
        if (c3 == '[') {
            c2 = ']';
        } else if (c3 == '(') {
            c2 = ')';
        } else {
            throw dVar.a("A JSONArray text must start with '['");
        }
        if (dVar.c() != ']') {
            do {
                dVar.a();
                if (dVar.c() == ',') {
                    dVar.a();
                    arrayList = this.f84172a;
                    d2 = null;
                } else {
                    dVar.a();
                    arrayList = this.f84172a;
                    d2 = dVar.d();
                }
                arrayList.add(d2);
                char c4 = dVar.c();
                if (c4 != ')') {
                    if (c4 != ',' && c4 != ';') {
                        if (c4 != ']') {
                            throw dVar.a("Expected a ',' or ']'");
                        }
                    }
                }
                if (c2 != c4) {
                    throw dVar.a("Expected a '" + Character.valueOf(c2) + "'");
                }
                return;
            } while (dVar.c() != ']');
        }
    }

    private String a(String str) {
        int size = this.f84172a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(c.a(this.f84172a.get(i)));
        }
        return stringBuffer.toString();
    }

    public final int a() {
        return this.f84172a.size();
    }

    public final Object a(int i) {
        Object obj = (i < 0 || i >= this.f84172a.size()) ? null : this.f84172a.get(i);
        if (obj != null) {
            return obj;
        }
        throw new a("JSONArray[" + i + "] not found.");
    }

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
