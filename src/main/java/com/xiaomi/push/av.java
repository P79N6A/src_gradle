package com.xiaomi.push;

import java.util.LinkedList;

public class av {

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<a> f81845a = new LinkedList<>();

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final av f81846a = new av();

        /* renamed from: a  reason: collision with other field name */
        public int f162a;

        /* renamed from: a  reason: collision with other field name */
        public Object f163a;

        /* renamed from: a  reason: collision with other field name */
        public String f164a;

        a(int i, Object obj) {
            this.f162a = i;
            this.f163a = obj;
        }
    }

    public static av a() {
        return a.f81846a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m90a() {
        if (this.f81845a.size() > 100) {
            this.f81845a.removeFirst();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m91a() {
        int size;
        synchronized (this) {
            size = this.f81845a.size();
        }
        return size;
    }

    /* renamed from: a  reason: collision with other method in class */
    public LinkedList<a> m92a() {
        LinkedList<a> linkedList;
        synchronized (this) {
            linkedList = this.f81845a;
            this.f81845a = new LinkedList<>();
        }
        return linkedList;
    }

    public void a(Object obj) {
        synchronized (this) {
            this.f81845a.add(new a(0, obj));
            a();
        }
    }
}
