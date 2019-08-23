package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.chooser.f;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50846a;

    /* renamed from: b  reason: collision with root package name */
    public f f50847b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f50848c;

    public final int a() {
        return this.f50847b.i;
    }

    public final int b() {
        return this.f50847b.j;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f50846a, false, 50995, new Class[0], Integer.TYPE)) {
            return this.f50847b.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50846a, false, 50995, new Class[0], Integer.TYPE)).intValue();
    }

    public static i a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, f50846a, true, 50996, new Class[]{f.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{fVar2}, null, f50846a, true, 50996, new Class[]{f.class}, i.class);
        }
        i iVar = new i();
        iVar.f50847b = fVar2;
        return iVar;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f50846a, false, 50994, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f50846a, false, 50994, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof i)) {
                return false;
            }
            return this.f50847b.equals(((i) obj).f50847b);
        }
    }
}
