package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f64869b;

    public final String d() {
        return "chat_merge";
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f64869b, false, 72916, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64869b, false, 72916, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (b.a(false) != null) {
            z = true;
        }
        return z;
    }

    public final Drawable e() {
        if (!PatchProxy.isSupport(new Object[0], this, f64869b, false, 72919, new Class[0], Drawable.class)) {
            return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839610);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f64869b, false, 72919, new Class[0], Drawable.class);
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f64869b, false, 72920, new Class[0], String.class)) {
            return this.f23108a.getResources().getString(C0906R.string.c6r);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f64869b, false, 72920, new Class[0], String.class);
    }

    public final Drawable g() {
        if (!PatchProxy.isSupport(new Object[0], this, f64869b, false, 72921, new Class[0], Drawable.class)) {
            return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839811);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f64869b, false, 72921, new Class[0], Drawable.class);
    }

    public c(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        if (PatchProxy.isSupport(new Object[]{shareStruct}, this, f64869b, false, 72917, new Class[]{IShareService.ShareStruct.class}, IShareService.ShareResult.class)) {
            return (IShareService.ShareResult) PatchProxy.accessDispatch(new Object[]{shareStruct}, this, f64869b, false, 72917, new Class[]{IShareService.ShareStruct.class}, IShareService.ShareResult.class);
        }
        b(shareStruct);
        return null;
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, f64869b, false, 72918, new Class[]{IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, f64869b, false, 72918, new Class[]{IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("share_struct", shareStruct2);
        if (b.d() && b.f() == 1) {
            bundle.putInt("key_share_type", 8);
        }
        IIMService a2 = b.a(false);
        if (a2 != null) {
            a2.enterChooseContact(this.f23108a, bundle, null);
        }
    }
}
