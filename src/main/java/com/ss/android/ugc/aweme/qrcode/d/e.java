package com.ss.android.ugc.aweme.qrcode.d;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.qrcode.c.a;
import com.ss.android.ugc.aweme.w.a.b;
import java.io.File;

public class e extends b<com.ss.android.ugc.aweme.qrcode.c.b, a> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63406a;

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f63406a, false, 70450, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63406a, false, 70450, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f76546d != null) {
            return ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).a();
        } else {
            return false;
        }
    }

    @Nullable
    public final File d() {
        if (PatchProxy.isSupport(new Object[0], this, f63406a, false, 70451, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f63406a, false, 70451, new Class[0], File.class);
        } else if (this.f76546d != null) {
            return ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).b();
        } else {
            return null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63406a, false, 70449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63406a, false, 70449, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            if (((a) ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).mData) == null) {
                ((a) this.f76547e).a(new Exception());
                return;
            }
            ((a) this.f76547e).a((a) ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).mData);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63406a, false, 70448, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63406a, false, 70448, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((a) this.f76547e).a(exc);
        }
    }

    public final void a(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f63406a, false, 70452, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f63406a, false, 70452, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f76546d != null) {
            ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).a(str);
        }
    }

    public e(com.ss.android.ugc.aweme.qrcode.c.b bVar, a aVar) {
        super(bVar, aVar);
        bVar.addNotifyListener(this);
    }

    public final void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f63406a, false, 70445, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f63406a, false, 70445, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).a(i, str2, null);
    }

    public final void b(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f63406a, false, 70447, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f63406a, false, 70447, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).a(i, str2);
    }

    public final void a(int i, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{10, str3, str4}, this, f63406a, false, 70446, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{10, str3, str4}, this, f63406a, false, 70446, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        ((com.ss.android.ugc.aweme.qrcode.c.b) this.f76546d).a(10, str3, str4);
    }
}
