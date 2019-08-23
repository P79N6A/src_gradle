package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.friends.adapter.DouyinInviteMoreAdapter;
import com.ss.android.ugc.aweme.friends.model.InviteMoreUnregisteredFriendsModel;
import com.ss.android.ugc.aweme.friends.model.UnRegisteredUser;
import com.ss.android.ugc.aweme.friends.ui.ag;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class i extends b<InviteMoreUnregisteredFriendsModel> implements DouyinInviteMoreAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48860a;

    /* renamed from: b  reason: collision with root package name */
    public Set<UnRegisteredUser> f48861b = new HashSet();
    public ag g;

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f48860a, false, 46692, new Class[0], Integer.TYPE)) {
            return this.f48861b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48860a, false, 46692, new Class[0], Integer.TYPE)).intValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48860a, false, 46693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48860a, false, 46693, new Class[0], Void.TYPE);
            return;
        }
        List<UnRegisteredUser> g2 = this.g.g();
        this.f48861b.clear();
        if (g2 != null) {
            for (UnRegisteredUser unRegisteredUser : g2) {
                if (unRegisteredUser != null && unRegisteredUser.inviteStatus <= 0) {
                    this.f48861b.add(unRegisteredUser);
                }
            }
        }
        this.g.a(true);
        this.g.b();
    }

    public final void a(ag agVar) {
        ag agVar2 = agVar;
        if (PatchProxy.isSupport(new Object[]{agVar2}, this, f48860a, false, 46689, new Class[]{ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{agVar2}, this, f48860a, false, 46689, new Class[]{ag.class}, Void.TYPE);
            return;
        }
        super.a(agVar);
        this.g = agVar2;
    }

    public final void a(UnRegisteredUser unRegisteredUser, boolean z) {
        if (PatchProxy.isSupport(new Object[]{unRegisteredUser, Byte.valueOf(z ? (byte) 1 : 0)}, this, f48860a, false, 46691, new Class[]{UnRegisteredUser.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{unRegisteredUser, Byte.valueOf(z)}, this, f48860a, false, 46691, new Class[]{UnRegisteredUser.class, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f48861b.add(unRegisteredUser);
            this.g.f();
        } else if (this.f48861b.contains(unRegisteredUser)) {
            this.f48861b.remove(unRegisteredUser);
            this.g.f();
        }
    }
}
