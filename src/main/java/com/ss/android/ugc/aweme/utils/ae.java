package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75488a;

    /* renamed from: b  reason: collision with root package name */
    Context f75489b;

    /* renamed from: c  reason: collision with root package name */
    String f75490c;

    /* renamed from: d  reason: collision with root package name */
    String f75491d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75488a, false, 88056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75488a, false, 88056, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + this.f75490c));
        this.f75489b.startActivity(intent);
    }

    public ae(Context context, String str, String str2) {
        this.f75490c = str;
        this.f75491d = str2;
        this.f75489b = context;
    }
}
