package com.ss.android.ugc.aweme.app.accountsdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.a.c;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.a;

public class d implements IAccountService.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33719a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f33720b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f33721c = false;

    /* renamed from: d  reason: collision with root package name */
    Activity f33722d = null;

    /* renamed from: e  reason: collision with root package name */
    private Handler f33723e = new Handler(Looper.getMainLooper());

    public d() {
    }

    public d(boolean z) {
        this.f33721c = z;
    }

    public void a(int i, int i2, @Nullable String str) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f33719a, false, 22991, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f33719a, false, 22991, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (i3 == 8 && i4 == 4) {
            bg.a(new c(2));
        } else if (i3 == 9 && i4 == 1) {
            if (!o.v()) {
                o.b().h();
            } else {
                a.a().T();
            }
        }
        if (i3 == 1) {
            if (i4 == 1) {
                if (o.b().a()) {
                    this.f33723e.postDelayed(e.f33725b, 500);
                    this.f33720b = true;
                }
            } else if (i4 == 4 && (this.f33720b || this.f33721c)) {
                this.f33723e.postDelayed(new f(this), 500);
            }
        }
        if ((i3 == 1 || i3 == 7) && i4 == 4) {
            new Handler().postDelayed(g.f33729b, 200);
        }
    }
}
