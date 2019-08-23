package com.bytedance.android.livesdk.s;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.model.ab;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17115a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17116b;

    /* renamed from: c  reason: collision with root package name */
    private final AppCompatActivity f17117c;

    c(b bVar, AppCompatActivity appCompatActivity) {
        this.f17116b = bVar;
        this.f17117c = appCompatActivity;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17115a, false, 12861, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17115a, false, 12861, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f17116b;
        AppCompatActivity appCompatActivity = this.f17117c;
        d dVar = (d) obj;
        if (!(bVar.f17106c == null || bVar.f17106c.get() == null || dVar.f7871b == null || TextUtils.isEmpty(((ab) dVar.f7871b).f11079a))) {
            Uri parse = Uri.parse(((ab) dVar.f7871b).f11079a);
            int e2 = (int) ac.e((int) (((float) ac.c()) * 0.8f));
            bVar.f17107d = j.q().f().a(com.bytedance.android.livesdk.browser.c.c.a(parse.buildUpon().appendQueryParameter("event_page", "live").build().toString()).a(e2).b((e2 * 4) / 3).d(5).e(17).a(true));
            bVar.f17107d.show(appCompatActivity.getSupportFragmentManager(), "PackagePurchase");
            b.am.a(Boolean.TRUE);
        }
    }
}
