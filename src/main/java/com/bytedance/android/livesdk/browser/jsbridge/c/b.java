package com.bytedance.android.livesdk.browser.jsbridge.c;

import android.content.Context;
import com.bytedance.android.live.core.utils.c;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9449a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9450b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9451c;

    b(a aVar, String str) {
        this.f9450b = aVar;
        this.f9451c = str;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9449a, false, 3619, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9449a, false, 3619, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9450b;
        String str = this.f9451c;
        String str2 = (String) obj;
        Context context = aVar.f9446b;
        if (PatchProxy.isSupport(new Object[]{context, str2, str}, aVar, a.f9445a, false, 3617, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str2, str};
            a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr, aVar2, a.f9445a, false, 3617, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            try {
                if (str.isEmpty()) {
                }
                c.a(str + str2);
                ai.a((int) C0906R.string.cp4);
            } catch (Exception e2) {
                a.class.getSimpleName();
                e2.getMessage();
                return;
            }
        }
        str = context.getString(C0906R.string.cr3);
        c.a(str + str2);
        ai.a((int) C0906R.string.cp4);
    }
}
