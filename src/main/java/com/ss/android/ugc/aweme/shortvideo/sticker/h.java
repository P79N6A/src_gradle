package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.app.Activity;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69527a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f69528b;

    /* renamed from: c  reason: collision with root package name */
    private final View f69529c;

    h(Activity activity, View view) {
        this.f69528b = activity;
        this.f69529c = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69527a, false, 78638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69527a, false, 78638, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.f69528b;
        new b.a(activity).b((int) C0906R.string.cdy).a(5000).a(true).a().a(this.f69529c, 48, 0.0f, -((int) UIUtils.dip2Px(activity, 10.0f)));
        a.L.a(e.a.BubbleFavoriteStickerShown, true);
    }
}
