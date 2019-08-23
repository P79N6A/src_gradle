package com.ss.android.ugc.aweme.account.shortvideo.a;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32760a;

    private a(Context context, int i) {
        super(context);
        this.f32763c = false;
    }

    public static a a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f32760a, true, 20918, new Class[]{Context.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f32760a, true, 20918, new Class[]{Context.class, String.class}, a.class);
        } else if (context2 == null || !(context2 instanceof Activity) || ((Activity) context2).isFinishing()) {
            return null;
        } else {
            a aVar = new a(context2, 3);
            aVar.setCancelable(false);
            aVar.setIndeterminate(false);
            aVar.setMax(100);
            aVar.show();
            aVar.setContentView(C0906R.layout.a2w);
            aVar.setMessage(str2);
            aVar.a();
            return aVar;
        }
    }
}
