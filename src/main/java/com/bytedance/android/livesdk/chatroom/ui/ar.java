package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.FansClubMedalAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ar implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11857a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubMedalAdapter.FansClubMedalViewModel f11858b;

    ar(FansClubMedalAdapter.FansClubMedalViewModel fansClubMedalViewModel) {
        this.f11858b = fansClubMedalViewModel;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11857a, false, 5685, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11857a, false, 5685, new Class[]{View.class}, Void.TYPE);
            return;
        }
        FansClubMedalAdapter.FansClubMedalViewModel fansClubMedalViewModel = this.f11858b;
        if (FansClubMedalAdapter.this.f11509d != null) {
            FansClubMedalAdapter.this.f11509d.a(null);
        }
        FansClubMedalAdapter.this.a(fansClubMedalViewModel.h);
    }
}
