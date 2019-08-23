package com.ss.android.ugc.aweme.ag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33242a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f33243b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f33244c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f33245d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f33246e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f33247f;
    public ArrayList<String> g;
    public ArrayList<String> h;
    public ArrayList<String> i;
    public ArrayList<String> j;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f33242a, false, 70939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33242a, false, 70939, new Class[0], Void.TYPE);
            return;
        }
        a(this.f33245d);
        a(this.h);
        a(this.i);
        a(this.g);
        a(this.f33247f);
        a(this.f33243b);
        a(this.f33244c);
        a(this.f33246e);
        a(this.f33245d);
    }

    private void a(ArrayList<String> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, this, f33242a, false, 70940, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList}, this, f33242a, false, 70940, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.clear();
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f33242a, false, 70929, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f33242a, false, 70929, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f33243b == null) {
            this.f33243b = new ArrayList<>();
        }
        this.f33243b.add(str);
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f33242a, false, 70931, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f33242a, false, 70931, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f33245d == null) {
            this.f33245d = new ArrayList<>();
        }
        this.f33245d.add(str);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f33242a, false, 70928, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f33242a, false, 70928, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(str);
    }

    static boolean a(ArrayList<String> arrayList, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{arrayList, str2}, null, f33242a, true, 70938, new Class[]{ArrayList.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{arrayList, str2}, null, f33242a, true, 70938, new Class[]{ArrayList.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (arrayList == null) {
            return false;
        } else {
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(str2)) {
                    return true;
                }
            }
            return false;
        }
    }
}
