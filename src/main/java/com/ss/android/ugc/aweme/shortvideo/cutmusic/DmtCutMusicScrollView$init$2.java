package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicScrollView$init$2", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DmtCutMusicScrollView$init$2 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66636a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DmtCutMusicScrollView f66637b;

    DmtCutMusicScrollView$init$2(DmtCutMusicScrollView dmtCutMusicScrollView) {
        this.f66637b = dmtCutMusicScrollView;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66636a, false, 76085, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66636a, false, 76085, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        if (i == 0 && this.f66637b.f66627c != null && this.f66637b.f66628d) {
            DmtCutMusicScrollView.a aVar = this.f66637b.f66627c;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            float scrollDx = this.f66637b.getScrollDx() * 1.0f;
            a a2 = DmtCutMusicScrollView.a(this.f66637b);
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            aVar.a(scrollDx / ((float) a2.getMeasuredWidth()));
            this.f66637b.f66628d = false;
            this.f66637b.f66629e = false;
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66636a, false, 76086, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66636a, false, 76086, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f66637b;
        dmtCutMusicScrollView.setScrollDx(dmtCutMusicScrollView.getScrollDx() + ((float) i));
        if (this.f66637b.f66627c != null && this.f66637b.f66629e) {
            float scrollDx = this.f66637b.getScrollDx() * 1.0f;
            a a2 = DmtCutMusicScrollView.a(this.f66637b);
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            float measuredWidth = scrollDx / ((float) a2.getMeasuredWidth());
            DmtCutMusicScrollView.a aVar = this.f66637b.f66627c;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.b(measuredWidth);
        }
    }
}
