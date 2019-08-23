package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.bytedance.android.livesdk.popup.d;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class dd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13148a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget.a f13149b;

    /* renamed from: c  reason: collision with root package name */
    private final View f13150c;

    dd(LiveShareWidget.a aVar, View view) {
        this.f13149b = aVar;
        this.f13150c = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13148a, false, 7257, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13148a, false, 7257, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveShareWidget.a aVar = this.f13149b;
        View view = this.f13150c;
        b.V.a(Boolean.FALSE);
        aVar.f12667b = (d) ((d) ((d) ((d) d.a(LiveShareWidget.this.getContext()).a((int) C0906R.layout.anv)).b(ac.a(38.0f))).b(true)).a((d.a) new df(aVar, view)).b();
        aVar.f12667b.a(view, 1, 4, ac.a(16.0f), ac.a(-4.0f));
        LiveShareWidget.this.f12658b.add(Observable.timer(3, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new dg(aVar), new dh(aVar)));
    }
}
