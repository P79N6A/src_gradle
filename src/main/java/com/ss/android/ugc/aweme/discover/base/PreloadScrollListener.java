package com.ss.android.ugc.aweme.discover.base;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/PreloadScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "()V", "checkPreloadDistance", "", "isPreloadEnable", "", "()Z", "setPreloadEnable", "(Z)V", "mDy", "mLastTriggerPreloadPosition", "mOnPreloadListener", "Lcom/ss/android/ugc/aweme/discover/base/PreloadScrollListener$OnPreloadListener;", "rowNumberInAdvanceToPreload", "calculateIsToPreLoadMore", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "findMax", "lastPositions", "", "onScrollStateChanged", "newState", "onScrolled", "dx", "dy", "setOnPreloadListener", "listener", "OnPreloadListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreloadScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42130a;

    /* renamed from: b  reason: collision with root package name */
    a f42131b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42132c = true;

    /* renamed from: d  reason: collision with root package name */
    private int f42133d = 3;

    /* renamed from: e  reason: collision with root package name */
    private int f42134e;

    /* renamed from: f  reason: collision with root package name */
    private int f42135f;
    private int g = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/PreloadScrollListener$OnPreloadListener;", "", "onPreload", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f42130a, false, 36167, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f42130a, false, 36167, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
    }

    private final void a(RecyclerView recyclerView) {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f42130a, false, 36169, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f42130a, false, 36169, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return");
            int i3 = Integer.MAX_VALUE;
            int itemCount = layoutManager.getItemCount() - 1;
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int spanCount = this.f42133d * gridLayoutManager.getSpanCount();
                int i4 = itemCount - 1;
                while (true) {
                    if (i4 < 0) {
                        break;
                    }
                    i2 += gridLayoutManager.getSpanSizeLookup().getSpanSize(i4);
                    if (i2 >= spanCount) {
                        i3 = i4;
                        break;
                    }
                    i4--;
                }
                i = gridLayoutManager.findLastVisibleItemPosition();
            } else if (layoutManager instanceof LinearLayoutManager) {
                i3 = (itemCount - 1) - (this.f42133d * 1);
                i = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
                int i5 = iArr[0];
                int length = iArr.length;
                while (i2 < length) {
                    int i6 = iArr[i2];
                    if (i6 > i5) {
                        i5 = i6;
                    }
                    i2++;
                }
                i3 = itemCount - (staggeredGridLayoutManager.getSpanCount() * this.f42133d);
                i = i5;
            } else {
                return;
            }
            if (layoutManager.getChildCount() > 0 && i >= i3 && this.g != i3) {
                this.g = i3;
                a aVar = this.f42131b;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42130a, false, 36168, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42130a, false, 36168, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        if (this.f42132c && i2 >= 0 && i >= 0) {
            if (this.f42135f == 0) {
                Context context = recyclerView.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
                Resources resources = context.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources, "recyclerView.context.resources");
                this.f42135f = (int) (resources.getDisplayMetrics().density * 40.0f);
            }
            this.f42134e += i2;
            if (this.f42134e > this.f42135f) {
                a(recyclerView);
                this.f42134e = 0;
            }
        }
    }
}
