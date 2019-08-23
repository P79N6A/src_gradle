package com.ss.android.ugc.aweme.follow.widet;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47863a;

    /* renamed from: b  reason: collision with root package name */
    private final a f47864b;

    /* renamed from: c  reason: collision with root package name */
    private final User f47865c;

    b(a aVar, User user) {
        this.f47864b = aVar;
        this.f47865c = user;
    }

    public final void run() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f47863a, false, 44767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47863a, false, 44767, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f47864b;
        User user = this.f47865c;
        if (PatchProxy.isSupport(new Object[]{user}, aVar, a.f47848a, false, 44763, new Class[]{User.class}, Void.TYPE)) {
            Object[] objArr = {user};
            a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr, aVar2, a.f47848a, false, 44763, new Class[]{User.class}, Void.TYPE);
            return;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 4) {
            switch (followStatus) {
                case 0:
                    if (!user.isSecret()) {
                        if (user.getFollowerStatus() != 1) {
                            i = 1;
                            break;
                        } else {
                            i = 2;
                            break;
                        }
                    } else {
                        i = 4;
                        break;
                    }
            }
        }
        i = 0;
        if (user.getFollowStatus() == 4 || i != 4) {
            aVar.a(i, user);
            return;
        }
        FragmentActivity fragmentActivity = aVar.f47849b;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity}, aVar, a.f47848a, false, 44764, new Class[]{Activity.class}, Void.TYPE)) {
            Object[] objArr2 = {fragmentActivity};
            a aVar3 = aVar;
            PatchProxy.accessDispatch(objArr2, aVar3, a.f47848a, false, 44764, new Class[]{Activity.class}, Void.TYPE);
        } else {
            an<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
            int intValue = ((Integer) privacyAccountFollowCount.c()).intValue();
            if (intValue == 0) {
                new a.C0185a(fragmentActivity).b((int) C0906R.string.br4).a((int) C0906R.string.anv, (DialogInterface.OnClickListener) null).a().a();
            } else if (intValue > 0 && intValue < 4) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) fragmentActivity, (int) C0906R.string.br5).a();
            }
            privacyAccountFollowCount.a(Integer.valueOf(intValue + 1));
        }
        aVar.a(i, user);
    }
}
