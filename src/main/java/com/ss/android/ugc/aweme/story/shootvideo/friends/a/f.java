package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public final class f extends a<List<k>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73537a;

    /* renamed from: b  reason: collision with root package name */
    private l f73538b;

    /* renamed from: c  reason: collision with root package name */
    private int f73539c;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean b() {
        if (this.f73538b != null) {
            return this.f73538b.f73558d;
        }
        return false;
    }

    public final List<k> a() {
        if (PatchProxy.isSupport(new Object[0], this, f73537a, false, 85325, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f73537a, false, 85325, new Class[0], List.class);
        }
        try {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            ((List) this.mData).clear();
            if (com.ss.android.ugc.aweme.port.in.a.x.c()) {
                this.f73538b = j.a(10, this.f73539c, com.ss.android.ugc.aweme.port.in.a.x.d());
                if (this.f73538b != null) {
                    a(this.f73538b);
                    a(this.f73538b.a(), this.f73538b.f73559e);
                }
            }
            return (List) this.mData;
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<k> c() {
        if (PatchProxy.isSupport(new Object[0], this, f73537a, false, 85326, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f73537a, false, 85326, new Class[0], List.class);
        }
        try {
            if (!com.ss.android.ugc.aweme.port.in.a.x.c()) {
                return null;
            }
            this.f73538b = j.a(10, this.f73539c, com.ss.android.ugc.aweme.port.in.a.x.d());
            if (this.f73538b != null) {
                a(this.f73538b.a(), this.f73538b.f73559e);
                a(this.f73538b);
                return (List) this.mData;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private void a(l lVar) {
        if (lVar != null) {
            this.f73539c = lVar.f73557c;
        }
    }

    private void a(List<User> list, List<String> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, this, f73537a, false, 85327, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2}, this, f73537a, false, 85327, new Class[]{List.class, List.class}, Void.TYPE);
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
