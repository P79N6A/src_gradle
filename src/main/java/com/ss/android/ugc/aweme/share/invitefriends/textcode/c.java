package com.ss.android.ugc.aweme.share.invitefriends.textcode;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.basic.texttoken.b;
import com.ss.android.ugc.aweme.share.invitefriends.textcode.a;

public class c implements a.C0703a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65193a;

    /* renamed from: b  reason: collision with root package name */
    private b f65194b;

    /* renamed from: c  reason: collision with root package name */
    private a.b f65195c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65193a, false, 73619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65193a, false, 73619, new Class[0], Void.TYPE);
            return;
        }
        this.f65194b.a();
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f65193a, false, 73622, new Class[0], String.class)) {
            return this.f65194b.c();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f65193a, false, 73622, new Class[0], String.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f65193a, false, 73623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65193a, false, 73623, new Class[0], Void.TYPE);
            return;
        }
        this.f65194b.d();
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f65193a, false, 73621, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65193a, false, 73621, new Class[0], Boolean.TYPE)).booleanValue();
        }
        b bVar = this.f65194b;
        if (PatchProxy.isSupport(new Object[0], bVar, b.f64733a, false, 73439, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, b.f64733a, false, 73439, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(bVar.f64737e)) {
            return true;
        } else {
            return false;
        }
    }

    public c(a.b bVar) {
        this.f65195c = bVar;
        this.f65194b = new b(bVar);
    }
}
