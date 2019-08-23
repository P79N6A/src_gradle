package com.ss.android.ugc.aweme.app.accountsdk;

import android.support.annotation.Nullable;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.utils.bg;

public class h implements IAccountService.h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33730a;

    /* renamed from: b  reason: collision with root package name */
    private f f33731b;

    public h(f fVar) {
        this.f33731b = fVar;
    }

    public void a(int i, int i2, @Nullable Object obj) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f33730a, false, 22995, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f33730a, false, 22995, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (i3 == 50) {
            bg.a(new ar(23, new Pair(Boolean.valueOf(d.a().isOldUser()), "点击取消按钮")));
        } else if (i3 == 7 && i4 == 1) {
            d.a().queryUser();
        }
        if (this.f33731b != null && a.a(i)) {
            if (i4 == 1) {
                this.f33731b.a();
                return;
            }
            this.f33731b.a(null);
        }
    }
}
