package com.ss.android.ugc.aweme.shortvideo.cut;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VEMultiCutVideoFragment$initVideoSegmentRecyclerView$3", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VEMultiCutVideoFragment$initVideoSegmentRecyclerView$3 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66306a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VEMultiCutVideoFragment f66307b;

    VEMultiCutVideoFragment$initVideoSegmentRecyclerView$3(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
        this.f66307b = vEMultiCutVideoFragment;
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66306a, false, 75726, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66306a, false, 75726, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (i != 0) {
            VideoSegmentAdapter videoSegmentAdapter = this.f66307b.s;
            if (videoSegmentAdapter != null) {
                AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) this.f66307b.a((int) C0906R.id.dro);
                VideoSegmentAdapter videoSegmentAdapter2 = this.f66307b.s;
                if (videoSegmentAdapter2 != null) {
                    i4 = videoSegmentAdapter2.f66328c;
                } else {
                    i4 = 0;
                }
                i3 = videoSegmentAdapter.a((RecyclerView) aVDmtPanelRecyleView, i4);
            } else {
                i3 = -1;
            }
            if (i3 == -1) {
                AVDmtView aVDmtView = (AVDmtView) this.f66307b.a((int) C0906R.id.f8);
                Intrinsics.checkExpressionValueIsNotNull(aVDmtView, "animTabDot");
                aVDmtView.setVisibility(4);
                return;
            }
            AVDmtView aVDmtView2 = (AVDmtView) this.f66307b.a((int) C0906R.id.f8);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtView2, "animTabDot");
            aVDmtView2.setVisibility(0);
            AVDmtView aVDmtView3 = (AVDmtView) this.f66307b.a((int) C0906R.id.f8);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtView3, "animTabDot");
            aVDmtView3.setX((float) i3);
        }
    }
}
