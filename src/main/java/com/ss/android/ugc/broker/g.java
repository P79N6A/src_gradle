package com.ss.android.ugc.broker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    protected List<String> f77187a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    protected Map<Class, List<String>> f77188b = new HashMap();

    public abstract <T> T a(String str, Object... objArr);

    public abstract <T> List<T> a(Class<T> cls, Object... objArr);

    public g a(Class cls) {
        if (this.f77188b.get(cls) != null) {
            return this;
        }
        return null;
    }

    public g a(String str) {
        if (this.f77187a.contains(str)) {
            return this;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final <T> List<T> a(List<String> list, Object... objArr) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String a2 : list) {
            try {
                Object a3 = a(a2, objArr);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void a(Class cls, String... strArr) {
        List list = this.f77188b.get(cls);
        if (list == null) {
            list = new ArrayList();
        }
        list.addAll(Arrays.asList(strArr));
        this.f77188b.put(cls, list);
    }
}
