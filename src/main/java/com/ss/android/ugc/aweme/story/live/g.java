package com.ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.story.live.c;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73135a;

    /* renamed from: b  reason: collision with root package name */
    public Context f73136b;

    public g(Context context) {
        this.f73136b = context;
    }

    public final void a(User user, m mVar) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2, mVar}, this, f73135a, false, 84749, new Class[]{User.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, mVar}, this, f73135a, false, 84749, new Class[]{User.class, m.class}, Void.TYPE);
            return;
        }
        c.a().a(this.f73136b, user2, (Rect) null, "others_homepage");
    }

    public final void a(User user, String str) {
        User user2 = user;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{user2, str2}, this, f73135a, false, 84751, new Class[]{User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, str2}, this, f73135a, false, 84751, new Class[]{User.class, String.class}, Void.TYPE);
            return;
        }
        c.a().a(new c.a(this.f73136b, user2).a("previous_page", str2).b(str2).c("others_photo"));
    }
}
