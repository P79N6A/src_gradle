package com.ss.android.ugc.aweme.story.live;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class e implements IAccountService.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73132a;

    /* renamed from: b  reason: collision with root package name */
    static final IAccountService.a f73133b = new e();

    private e() {
    }

    public final void a(int i, boolean z, int i2, User user) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), user}, this, f73132a, false, 84718, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2), user}, this, f73132a, false, 84718, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE);
            return;
        }
        c.f73122b = false;
    }
}
