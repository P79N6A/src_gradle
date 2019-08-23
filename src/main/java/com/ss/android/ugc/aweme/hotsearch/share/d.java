package com.ss.android.ugc.aweme.hotsearch.share;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49821a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchRankingShareDialog f49822b;

    d(HotSearchRankingShareDialog hotSearchRankingShareDialog) {
        this.f49822b = hotSearchRankingShareDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49821a, false, 49766, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49821a, false, 49766, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        HotSearchRankingShareDialog hotSearchRankingShareDialog = this.f49822b;
        if (!hotSearchRankingShareDialog.mActionHandler.checkStatus("copy")) {
            hotSearchRankingShareDialog.cancel();
        }
        if (!TextUtils.isEmpty("copy")) {
            hotSearchRankingShareDialog.mActionHandler.onAction(hotSearchRankingShareDialog.mShareStruct, "copy");
        }
        hotSearchRankingShareDialog.cancel();
    }
}
