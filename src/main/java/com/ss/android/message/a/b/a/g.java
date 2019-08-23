package com.ss.android.message.a.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetSocketAddress;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29929a;

    /* renamed from: b  reason: collision with root package name */
    public final InetSocketAddress f29930b;

    /* renamed from: c  reason: collision with root package name */
    final int f29931c = 60000;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f29929a, false, 18064, new Class[0], Integer.TYPE)) {
            return this.f29930b.hashCode() ^ this.f29931c;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29929a, false, 18064, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f29929a, false, 18063, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f29929a, false, 18063, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (!(obj instanceof g)) {
            return false;
        } else {
            g gVar = (g) obj;
            if (!this.f29930b.equals(gVar.f29930b) || this.f29931c != gVar.f29931c) {
                return false;
            }
            return true;
        }
    }

    g(InetSocketAddress inetSocketAddress, int i) {
        this.f29930b = inetSocketAddress;
    }
}
