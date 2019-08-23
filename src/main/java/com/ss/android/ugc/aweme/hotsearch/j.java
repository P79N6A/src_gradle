package com.ss.android.ugc.aweme.hotsearch;

import android.content.DialogInterface;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class j implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49783a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListIndependenceActivity f49784b;

    j(RankingListIndependenceActivity rankingListIndependenceActivity) {
        this.f49784b = rankingListIndependenceActivity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f49783a, false, 49568, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f49783a, false, 49568, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        RankingListIndependenceActivity rankingListIndependenceActivity = this.f49784b;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, rankingListIndependenceActivity, RankingListIndependenceActivity.f49635a, false, 49560, new Class[]{DialogInterface.class}, Void.TYPE)) {
            RankingListIndependenceActivity rankingListIndependenceActivity2 = rankingListIndependenceActivity;
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, rankingListIndependenceActivity2, RankingListIndependenceActivity.f49635a, false, 49560, new Class[]{DialogInterface.class}, Void.TYPE);
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
