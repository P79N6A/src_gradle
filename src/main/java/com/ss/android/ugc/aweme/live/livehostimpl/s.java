package com.ss.android.ugc.aweme.live.livehostimpl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdkapi.host.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a.g;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.challenge.a.d;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public final class s implements l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53478a;

    /* renamed from: b  reason: collision with root package name */
    private b f53479b;

    /* renamed from: c  reason: collision with root package name */
    private a f53480c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f3436a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.android.livesdkapi.depend.i.a f3437b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Subscribe
        public final void onEvent(d dVar) {
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f3436a, false, 55845, new Class[]{d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f3436a, false, 55845, new Class[]{d.class}, Void.TYPE);
                return;
            }
            if (this.f3437b != null && (dVar.f35319b instanceof User)) {
                com.bytedance.android.livesdkapi.depend.model.b.a aVar = new com.bytedance.android.livesdkapi.depend.model.b.a();
                aVar.f18692d = dVar.f35318a;
                String uid = ((User) dVar.f35319b).getUid();
                if (uid != null) {
                    aVar.f18689a = Long.parseLong(uid);
                }
                this.f3437b.a(aVar);
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f3438a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.android.livesdkapi.depend.i.b f3439b;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Subscribe
        public final void onEvent(g gVar) {
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f3438a, false, 55849, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f3438a, false, 55849, new Class[]{g.class}, Void.TYPE);
                return;
            }
            if (this.f3439b != null) {
                this.f3439b.a(false);
            }
        }

        @Subscribe
        public final void onEvent(com.ss.android.ugc.aweme.base.a.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f3438a, false, 55848, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f3438a, false, 55848, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.live.base.model.user.User a2 = g.a(bVar.f34476a);
            if (!(this.f3439b == null || a2 == null)) {
                this.f3439b.a(true);
            }
        }
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53478a, false, 55830, new Class[0], Boolean.TYPE)) {
            return ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53478a, false, 55830, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final i b() {
        if (!PatchProxy.isSupport(new Object[0], this, f53478a, false, 55834, new Class[0], i.class)) {
            return g.a(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser());
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, f53478a, false, 55834, new Class[0], i.class);
    }

    public final long c() {
        if (!PatchProxy.isSupport(new Object[0], this, f53478a, false, 55835, new Class[0], Long.TYPE)) {
            return Long.parseLong(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f53478a, false, 55835, new Class[0], Long.TYPE)).longValue();
    }

    public final void a(@NonNull com.bytedance.android.livesdkapi.depend.i.a aVar) {
        com.bytedance.android.livesdkapi.depend.i.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f53478a, false, 55836, new Class[]{com.bytedance.android.livesdkapi.depend.i.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f53478a, false, 55836, new Class[]{com.bytedance.android.livesdkapi.depend.i.a.class}, Void.TYPE);
            return;
        }
        if (this.f53480c == null) {
            this.f53480c = new a((byte) 0);
        }
        this.f53480c.f3437b = aVar2;
        a aVar3 = this.f53480c;
        if (PatchProxy.isSupport(new Object[0], aVar3, a.f3436a, false, 55843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar3, a.f3436a, false, 55843, new Class[0], Void.TYPE);
            return;
        }
        bg.c(aVar3);
    }

    public final void a(@NonNull com.bytedance.android.livesdkapi.depend.i.b bVar) {
        com.bytedance.android.livesdkapi.depend.i.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f53478a, false, 55838, new Class[]{com.bytedance.android.livesdkapi.depend.i.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f53478a, false, 55838, new Class[]{com.bytedance.android.livesdkapi.depend.i.b.class}, Void.TYPE);
            return;
        }
        if (this.f53479b == null) {
            this.f53479b = new b((byte) 0);
        }
        this.f53479b.f3439b = bVar2;
        b bVar3 = this.f53479b;
        if (PatchProxy.isSupport(new Object[0], bVar3, b.f3438a, false, 55846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar3, b.f3438a, false, 55846, new Class[0], Void.TYPE);
            return;
        }
        bg.c(bVar3);
    }

    public final void a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f53478a, false, 55832, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f53478a, false, 55832, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        FollowStatus followStatus = new FollowStatus();
        followStatus.userId = String.valueOf(j);
        followStatus.followStatus = i;
        bg.a(followStatus);
    }

    public final void a(@Nullable Activity activity, int i, long j, com.bytedance.android.livesdkapi.host.a.b bVar) {
        Activity activity2 = activity;
        long j2 = j;
        com.bytedance.android.livesdkapi.host.a.b bVar2 = bVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), new Long(j2), bVar2}, this, f53478a, false, 55833, new Class[]{Activity.class, Integer.TYPE, Long.TYPE, com.bytedance.android.livesdkapi.host.a.b.class}, Void.TYPE)) {
            Object[] objArr = {activity2, Integer.valueOf(i), new Long(j2), bVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f53478a, false, 55833, new Class[]{Activity.class, Integer.TYPE, Long.TYPE, com.bytedance.android.livesdkapi.host.a.b.class}, Void.TYPE);
        } else if (activity2 != null) {
            IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
            if (i == 2) {
                z = true;
            }
            a2.wrapperSyncXAlert(activity2, 2, z, new u(bVar2));
        }
    }

    @SuppressLint({"AnonymousInnerClass"})
    public final void a(FragmentActivity fragmentActivity, com.bytedance.android.livesdkapi.host.a.a aVar, String str, String str2, int i, String str3, String str4, String str5) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        com.bytedance.android.livesdkapi.host.a.a aVar2 = aVar;
        String str6 = str4;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, aVar2, str, str2, Integer.valueOf(i), str3, str6, str5}, this, f53478a, false, 55831, new Class[]{FragmentActivity.class, com.bytedance.android.livesdkapi.host.a.a.class, String.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, aVar2, str, str2, Integer.valueOf(i), str3, str6, str5}, this, f53478a, false, 55831, new Class[]{FragmentActivity.class, com.bytedance.android.livesdkapi.host.a.a.class, String.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        e.a((Activity) fragmentActivity2, str6, "live_room", (Bundle) null, (f) new t(aVar2));
    }
}
