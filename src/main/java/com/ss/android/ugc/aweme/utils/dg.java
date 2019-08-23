package com.ss.android.ugc.aweme.utils;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import com.bytedance.apm.trace.fps.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/RealFpsMonitor;", "Lcom/ss/android/ugc/aweme/utils/FpsMonitor;", "type", "", "debug", "", "(Ljava/lang/String;Z)V", "getDebug", "()Z", "fpsTracer", "Lcom/bytedance/apm/trace/fps/FpsTracer;", "getType", "()Ljava/lang/String;", "start", "", "startRecyclerView", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "startVerticalViewPager", "verticalViewPager", "Lcom/ss/android/ugc/aweme/common/widget/VerticalViewPager;", "startViewPager", "viewPager", "Landroid/support/v4/view/ViewPager;", "stop", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class dg implements bq {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75744a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f75745e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final c f75746b = new c(this.f75747c);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f75747c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f75748d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/RealFpsMonitor$Companion;", "", "()V", "TAG", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f75744a, false, 88509, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f75744a, false, 88509, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new RealFpsMonitor$startRecyclerView$1(this));
        }
    }

    public final void a(@Nullable VerticalViewPager verticalViewPager) {
        VerticalViewPager verticalViewPager2 = verticalViewPager;
        if (PatchProxy.isSupport(new Object[]{verticalViewPager2}, this, f75744a, false, 88510, new Class[]{VerticalViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{verticalViewPager2}, this, f75744a, false, 88510, new Class[]{VerticalViewPager.class}, Void.TYPE);
        } else if (verticalViewPager2 != null) {
            verticalViewPager2.a((ViewPager.OnPageChangeListener) new RealFpsMonitor$startVerticalViewPager$1(this));
        }
    }

    public dg(@NotNull String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "type");
        this.f75747c = str;
        this.f75748d = z;
    }
}
