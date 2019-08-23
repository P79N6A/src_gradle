package com.douyin.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.douyin.baseshare.a;
import com.douyin.share.a.c.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class j extends a {
    public final void b(IShareService.ShareStruct shareStruct) {
    }

    public final boolean b() {
        return true;
    }

    public final String d() {
        return "more";
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839615);
    }

    public final String f() {
        return this.f23108a.getResources().getString(C0906R.string.chh);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839812);
    }

    public j(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return i.a((Context) this.f23108a, shareStruct);
    }
}
