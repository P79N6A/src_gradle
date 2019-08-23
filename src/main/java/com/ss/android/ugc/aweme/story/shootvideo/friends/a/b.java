package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public final class b extends a<List<k>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73526a;

    /* renamed from: b  reason: collision with root package name */
    private a f73527b;

    /* renamed from: c  reason: collision with root package name */
    private int f73528c;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean b() {
        if (this.f73527b != null) {
            return this.f73527b.f73524e;
        }
        return false;
    }

    public final List<k> a() {
        if (PatchProxy.isSupport(new Object[0], this, f73526a, false, 85319, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f73526a, false, 85319, new Class[0], List.class);
        }
        try {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            ((List) this.mData).clear();
            if (com.ss.android.ugc.aweme.port.in.a.x.c()) {
                this.f73527b = j.a(10, this.f73528c);
                if (this.f73527b != null) {
                    a(this.f73527b);
                    a(this.f73527b.a(), this.f73527b.g);
                }
            }
            return (List) this.mData;
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<k> c() {
        if (PatchProxy.isSupport(new Object[0], this, f73526a, false, 85320, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f73526a, false, 85320, new Class[0], List.class);
        }
        try {
            if (!com.ss.android.ugc.aweme.port.in.a.x.c()) {
                return null;
            }
            this.f73527b = j.a(10, this.f73528c);
            if (this.f73527b != null) {
                a(this.f73527b.a(), this.f73527b.g);
                a(this.f73527b);
                return (List) this.mData;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private void a(a aVar) {
        if (aVar != null) {
            this.f73528c = aVar.f73523d;
        }
    }

    private void a(List<User> list, List<String> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, this, f73526a, false, 85321, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2}, this, f73526a, false, 85321, new Class[]{List.class, List.class}, Void.TYPE);
        } else if (this.mData != null && !com.bytedance.framwork.core.c.a.a(list)) {
            for (User user : list) {
                k kVar = new k();
                kVar.f73551a = user;
                ((List) this.mData).add(kVar);
            }
            if (!com.bytedance.framwork.core.c.a.a(list2)) {
                for (String next : list2) {
                    for (k kVar2 : (List) this.mData) {
                        if (kVar2.f73551a.getUid().equals(next)) {
                            kVar2.f73553c = true;
                        }
                    }
                }
            }
        }
    }
}
