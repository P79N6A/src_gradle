package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39799a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f39800b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f39801c;

    public m(Context context, Aweme aweme) {
        this.f39800b = context;
        this.f39801c = aweme;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f39799a, false, 32382, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f39799a, false, 32382, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f39800b;
        Aweme aweme = this.f39801c;
        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31548, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31548, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else {
            g.b(context, "click_open_url_window_cancel", aweme, g.f(context, aweme, "raw click_open_url_window_cancel"));
        }
        dialogInterface.dismiss();
    }
}
