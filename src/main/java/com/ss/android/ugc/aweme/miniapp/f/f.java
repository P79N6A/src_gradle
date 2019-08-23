package com.ss.android.ugc.aweme.miniapp.f;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.preview.b.b;
import com.ss.android.ugc.aweme.poi.preview.b.b.a;
import com.ss.android.ugc.aweme.poi.preview.b.c;
import com.ss.android.ugc.aweme.poi.preview.transfer.g;
import com.ss.android.ugc.aweme.poi.preview.transfer.j;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55754a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55755b;

    /* renamed from: c  reason: collision with root package name */
    private final List f55756c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55757d;

    f(Activity activity, List list, int i) {
        this.f55755b = activity;
        this.f55756c = list;
        this.f55757d = i;
    }

    public final Object call() {
        j jVar;
        if (PatchProxy.isSupport(new Object[0], this, f55754a, false, 59445, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55754a, false, 59445, new Class[0], Object.class);
        }
        Activity activity = this.f55755b;
        List list = this.f55756c;
        int i = this.f55757d;
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(C0906R.style.mq)}, null, j.f60215a, true, 65484, new Class[]{Context.class, Integer.TYPE}, j.class)) {
            jVar = (j) PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(C0906R.style.mq)}, null, j.f60215a, true, 65484, new Class[]{Context.class, Integer.TYPE}, j.class);
        } else {
            jVar = new j(activity, C0906R.style.mq);
        }
        g.a a2 = g.a().b(list).a(list).a((int) C0906R.color.xv);
        a2.f60186b = C0906R.color.xv;
        g.a a3 = a2.a((c) new a()).a((b) new com.ss.android.ugc.aweme.poi.preview.b.a.a()).a(true);
        a3.g = i.f55767b;
        g a4 = a3.a();
        a4.f60180b = i;
        jVar.a(a4).b();
        return null;
    }
}
