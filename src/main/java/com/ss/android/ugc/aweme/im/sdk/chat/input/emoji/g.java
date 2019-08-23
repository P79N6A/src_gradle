package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.a;
import com.ss.android.ugc.aweme.im.sdk.resources.model.e;
import java.util.ArrayList;
import java.util.List;

public class g extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f50578d;

    /* renamed from: e  reason: collision with root package name */
    public e f50579e;

    /* renamed from: f  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> f50580f;

    public int a() {
        return 2130838905;
    }

    public int h() {
        return 2;
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f50578d, false, 50854, new Class[0], String.class)) {
            return this.f50579e.getIconUrl();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f50578d, false, 50854, new Class[0], String.class);
    }

    public String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f50578d, false, 50856, new Class[0], String.class)) {
            return this.f50579e.getDisplayName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f50578d, false, 50856, new Class[0], String.class);
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f50578d, false, 50858, new Class[0], Integer.TYPE)) {
            return super.d();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50578d, false, 50858, new Class[0], Integer.TYPE)).intValue();
    }

    public int e() {
        if (PatchProxy.isSupport(new Object[0], this, f50578d, false, 50860, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50578d, false, 50860, new Class[0], Integer.TYPE)).intValue();
        } else if (!g()) {
            return 1;
        } else {
            return ((this.f50580f.size() - 1) / 8) + 1;
        }
    }

    public final int f() {
        if (PatchProxy.isSupport(new Object[0], this, f50578d, false, 50862, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50578d, false, 50862, new Class[0], Integer.TYPE)).intValue();
        } else if (g()) {
            return 8;
        } else {
            return 1;
        }
    }

    public boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f50578d, false, 50863, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50578d, false, 50863, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f50580f != null && this.f50580f.size() > 0) {
            z = true;
        }
        return z;
    }

    public final int i() {
        if (PatchProxy.isSupport(new Object[0], this, f50578d, false, 50861, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50578d, false, 50861, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f50580f == null) {
            return 0;
        } else {
            return this.f50580f.size();
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50578d, false, 50857, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50578d, false, 50857, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i);
    }

    public List<c> b(int i) {
        com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50578d, false, 50859, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50578d, false, 50859, new Class[]{Integer.TYPE}, List.class);
        }
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = i * 8; i2 < (i + 1) * 8; i2++) {
            c cVar = new c();
            if (i2 < 0 || i2 >= this.f50580f.size()) {
                aVar = null;
            } else {
                aVar = this.f50580f.get(i2);
            }
            if (aVar != null) {
                cVar.f50558b = aVar.getRealDisplayName();
                cVar.f50557a = aVar;
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
