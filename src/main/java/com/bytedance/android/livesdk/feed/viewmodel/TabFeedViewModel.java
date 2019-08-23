package com.bytedance.android.livesdk.feed.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.e.a;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.o;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TabFeedViewModel extends FragmentFeedViewModel {
    public static ChangeQuickRedirect C;
    protected k D;
    private long E;
    private o F;

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, C, false, 9038, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, C, false, 9038, new Class[0], Boolean.TYPE)).booleanValue();
        }
        d();
        return false;
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, C, false, 9033, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, C, false, 9033, new Class[0], String.class);
        } else if (!StringUtils.isEmpty(this.u) || this.D.a(this.E) == null) {
            return this.u;
        } else {
            return this.D.a(this.E).f14083e;
        }
    }

    public final c e() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, C, false, 9036, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, C, false, 9036, new Class[0], c.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, C, false, 9035, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, C, false, 9035, new Class[0], String.class);
        } else {
            if (TextUtils.isEmpty(this.x) && this.D.a(this.E) != null) {
                this.x = this.D.a(this.E).h;
            }
            if (TextUtils.isEmpty(this.x)) {
                this.x = "video";
            }
            str = this.x;
        }
        return c.a(str, c(), this.E);
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, C, false, 9034, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, C, false, 9034, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Uri parse = Uri.parse(str);
        this.u = parse.getPath() + "?" + parse.getQuery();
    }

    public TabFeedViewModel(IFeedRepository iFeedRepository, h hVar, k kVar, a aVar, o oVar, long j) {
        super(iFeedRepository, hVar, aVar);
        this.D = kVar;
        this.E = j;
        this.F = oVar;
    }
}
