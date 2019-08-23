package com.ss.android.ugc.aweme.main;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class aj implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54332a;

    /* renamed from: b  reason: collision with root package name */
    private final View f54333b;

    /* renamed from: c  reason: collision with root package name */
    private final DataCenter f54334c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f54335d;

    public aj(View view, DataCenter dataCenter, Aweme aweme) {
        this.f54333b = view;
        this.f54334c = dataCenter;
        this.f54335d = aweme;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54332a, false, 57399, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54332a, false, 57399, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f54333b;
        DataCenter dataCenter = this.f54334c;
        Aweme aweme = this.f54335d;
        if (!m.a().c()) {
            a.b(view.getContext(), (int) C0906R.string.bgf).a();
            dialogInterface.dismiss();
            return;
        }
        if (dataCenter != null) {
            ar arVar = new ar(38, aweme);
            arVar.f45295e = "head_icon";
            dataCenter.a("feed_internal_event", (Object) arVar);
        }
        com.ss.android.ugc.aweme.main.d.a.b(true);
        dialogInterface.dismiss();
    }
}
