package com.ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class c extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71292a;

    private c(Context context, int i) {
        super(context, (byte) 0);
        this.f71295c = false;
    }

    public static c a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f71292a, true, 81210, new Class[]{Context.class, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f71292a, true, 81210, new Class[]{Context.class, String.class}, c.class);
        } else if (context2 == null || !(context2 instanceof Activity) || ((Activity) context2).isFinishing()) {
            return null;
        } else {
            c cVar = new c(context2, 3);
            cVar.setCancelable(false);
            cVar.setIndeterminate(false);
            cVar.setMax(100);
            cVar.show();
            cVar.setContentView(C0906R.layout.a2v);
            cVar.setMessage(str2);
            cVar.a();
            return cVar;
        }
    }
}
