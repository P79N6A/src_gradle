package com.ss.android.message.a.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29948a;

    /* renamed from: b  reason: collision with root package name */
    public final b f29949b;

    /* renamed from: c  reason: collision with root package name */
    public final b f29950c;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f29948a, false, 17993, new Class[0], Integer.TYPE)) {
            return this.f29949b.hashCode() + this.f29950c.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29948a, false, 17993, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f29950c == cVar.f29950c && this.f29949b == cVar.f29949b) {
            return true;
        }
        return false;
    }

    public c(b bVar, b bVar2) throws IllegalArgumentException {
        if (bVar != bVar2) {
            this.f29949b = bVar;
            this.f29950c = bVar2;
            return;
        }
        throw new IllegalArgumentException("Attempted to create an connection state update where both previous and current state are: " + bVar2);
    }
}
