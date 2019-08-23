package com.bytedance.android.livesdk.fansclub;

import android.text.TextUtils;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13902a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveFansClubEntryWidget f13903b;

    p(LiveFansClubEntryWidget liveFansClubEntryWidget) {
        this.f13903b = liveFansClubEntryWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13902a, false, 8346, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13902a, false, 8346, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveFansClubEntryWidget liveFansClubEntryWidget = this.f13903b;
        m mVar = (m) obj;
        if (PatchProxy.isSupport(new Object[]{mVar}, liveFansClubEntryWidget, LiveFansClubEntryWidget.f13864a, false, 8335, new Class[]{m.class}, Void.TYPE)) {
            LiveFansClubEntryWidget liveFansClubEntryWidget2 = liveFansClubEntryWidget;
            PatchProxy.accessDispatch(new Object[]{mVar}, liveFansClubEntryWidget2, LiveFansClubEntryWidget.f13864a, false, 8335, new Class[]{m.class}, Void.TYPE);
        } else if (mVar == null || mVar.f13897b != 0) {
            UIUtils.setViewVisibility(liveFansClubEntryWidget.contentView, 8);
        } else {
            s sVar = mVar.f13896a;
            if (sVar != null) {
                if (!TextUtils.isEmpty(sVar.f13909a)) {
                    liveFansClubEntryWidget.f13869f = sVar.f13909a;
                }
                if (sVar.f13910b >= 0) {
                    liveFansClubEntryWidget.g = (long) sVar.f13910b;
                }
                liveFansClubEntryWidget.h = sVar.f13911c;
                UIUtils.setViewVisibility(liveFansClubEntryWidget.contentView, 0);
                if (!TextUtils.isEmpty(sVar.f13909a) && sVar.f13910b >= 0) {
                    liveFansClubEntryWidget.f13865b.setText(liveFansClubEntryWidget.getContext().getResources().getString(C0906R.string.cwg, new Object[]{liveFansClubEntryWidget.f13869f, a.a(liveFansClubEntryWidget.g, "w")}));
                } else if (liveFansClubEntryWidget.j) {
                    liveFansClubEntryWidget.f13865b.setText(liveFansClubEntryWidget.getContext().getResources().getString(C0906R.string.cwd));
                } else {
                    liveFansClubEntryWidget.f13865b.setText(liveFansClubEntryWidget.getContext().getResources().getString(C0906R.string.cwc));
                }
                liveFansClubEntryWidget.i = sVar.f13912d;
            }
        }
    }
}
