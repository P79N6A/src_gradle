package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.popup.d;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class y implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12309a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment.g f12310b;

    /* renamed from: c  reason: collision with root package name */
    private final View f12311c;

    y(AbsInteractionFragment.g gVar, View view) {
        this.f12310b = gVar;
        this.f12311c = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12309a, false, 5630, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12309a, false, 5630, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment.g gVar = this.f12310b;
        View view = this.f12311c;
        b.V.a(Boolean.FALSE);
        gVar.f11487b = (d) ((d) ((d) ((d) d.a(AbsInteractionFragment.this.getContext()).a((int) C0906R.layout.anv)).b(ac.a(38.0f))).b(true)).a((d.a) new ab(gVar, view)).b();
        gVar.f11487b.a(view, 1, 4, ac.a(16.0f), ac.a(-4.0f));
        AbsInteractionFragment.this.p.add(Observable.timer(3, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new ac(gVar), new ad(gVar)));
    }
}
