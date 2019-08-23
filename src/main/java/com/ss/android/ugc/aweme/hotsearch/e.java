package com.ss.android.ugc.aweme.hotsearch;

import android.content.DialogInterface;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class e implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49748a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListActivity f49749b;

    e(RankingListActivity rankingListActivity) {
        this.f49749b = rankingListActivity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f49748a, false, 49540, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f49748a, false, 49540, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        RankingListActivity rankingListActivity = this.f49749b;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, rankingListActivity, RankingListActivity.f3354a, false, 49531, new Class[]{DialogInterface.class}, Void.TYPE)) {
            RankingListActivity rankingListActivity2 = rankingListActivity;
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, rankingListActivity2, RankingListActivity.f3354a, false, 49531, new Class[]{DialogInterface.class}, Void.TYPE);
        } else {
            FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
            if (frameLayout != null) {
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                from.setPeekHeight(frameLayout.getHeight());
                from.setSkipCollapsed(true);
            }
        }
        FrameLayout frameLayout2 = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
        if (frameLayout2 != null) {
            BottomSheetBehavior from2 = BottomSheetBehavior.from(frameLayout2);
            from2.setPeekHeight(frameLayout2.getHeight());
            from2.setSkipCollapsed(true);
        }
    }
}
