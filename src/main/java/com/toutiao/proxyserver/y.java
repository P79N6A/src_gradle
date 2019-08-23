package com.toutiao.proxyserver;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.f.c;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80271a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f80272b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<a> f80273c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<a> f80274d;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80275a;

        /* renamed from: b  reason: collision with root package name */
        final String f80276b;

        /* renamed from: c  reason: collision with root package name */
        boolean f80277c = true;

        /* access modifiers changed from: package-private */
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f80275a, false, 91772, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f80275a, false, 91772, new Class[0], Void.TYPE);
                return;
            }
            if (this.f80277c) {
                y.this.f80273c.addLast(this);
                this.f80277c = false;
            }
        }

        a(String str) {
            this.f80276b = str;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f80271a, false, 91770, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f80271a, false, 91770, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.f80274d.isEmpty() || !this.f80273c.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final a b() {
        if (PatchProxy.isSupport(new Object[0], this, f80271a, false, 91771, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f80271a, false, 91771, new Class[0], a.class);
        } else if (!this.f80274d.isEmpty()) {
            return this.f80274d.removeFirst();
        } else {
            if (!this.f80273c.isEmpty()) {
                return this.f80273c.removeFirst();
            }
            throw new NoSuchElementException();
        }
    }

    y(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("urls is empty");
        }
        int size = list.size();
        this.f80272b = list;
        this.f80274d = new ArrayDeque<>(size);
        this.f80273c = new ArrayDeque<>(size);
        for (String next : list) {
            if (c.a(next)) {
                this.f80274d.add(new a(next));
            }
        }
    }
}
