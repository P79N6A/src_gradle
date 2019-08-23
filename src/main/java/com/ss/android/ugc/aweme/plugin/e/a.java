package com.ss.android.ugc.aweme.plugin.e;

import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59306a;

    /* renamed from: b  reason: collision with root package name */
    public String f59307b;

    /* renamed from: c  reason: collision with root package name */
    public String f59308c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f59309d;

    /* renamed from: e  reason: collision with root package name */
    public c f59310e;

    /* renamed from: f  reason: collision with root package name */
    private String f59311f;
    private int g;
    private List<String> h = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.plugin.e.a$a  reason: collision with other inner class name */
    public static class C0666a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59312a;

        /* renamed from: b  reason: collision with root package name */
        public String f59313b;

        /* renamed from: c  reason: collision with root package name */
        public String f59314c;

        /* renamed from: d  reason: collision with root package name */
        public String f59315d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f59316e;

        /* renamed from: f  reason: collision with root package name */
        public c f59317f;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f59306a, false, 64642, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59306a, false, 64642, new Class[0], String.class);
        } else if (Lists.isEmpty(this.h)) {
            return this.f59311f;
        } else {
            String str = this.h.get(this.g);
            this.g = (this.g + 1) % this.h.size();
            return str;
        }
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59306a, false, 64644, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59306a, false, 64644, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f59311f != null) {
            i = this.f59311f.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f59308c != null) {
            i2 = this.f59308c.hashCode();
        }
        return i3 + i2;
    }

    public a(C0666a aVar) {
        this.f59311f = aVar.f59313b;
        this.f59307b = aVar.f59314c;
        this.f59308c = aVar.f59315d;
        this.f59309d = aVar.f59316e;
        this.f59310e = aVar.f59317f;
        this.h.add(this.f59311f);
        if (this.f59310e != null && !Lists.isEmpty(this.f59310e.f59327d)) {
            this.h.addAll(this.f59310e.f59327d);
        }
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f59306a, false, 64643, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f59306a, false, 64643, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f59311f == null ? aVar.f59311f != null : !this.f59311f.equals(aVar.f59311f)) {
                return false;
            }
            if (this.f59308c != null) {
                return this.f59308c.equals(aVar.f59308c);
            }
            if (aVar.f59308c == null) {
                return true;
            }
            return false;
        }
    }
}
