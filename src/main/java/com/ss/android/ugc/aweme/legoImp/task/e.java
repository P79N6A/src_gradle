package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.c;

public final /* synthetic */ class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53151a;
    /* access modifiers changed from: package-private */

    /* renamed from: b  reason: collision with root package name */
    public static final c f53152b = new e();

    private e() {
    }

    public final void a(Context context, User user, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{context, user, bundle}, this, f53151a, false, 55271, new Class[]{Context.class, User.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, user, bundle}, this, f53151a, false, 55271, new Class[]{Context.class, User.class, Bundle.class}, Void.TYPE);
            return;
        }
        IndexServiceRouterTask.lambda$null$1$IndexServiceRouterTask(context, user, bundle);
    }
}
