package com.ss.android.ugc.aweme.discover.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/DefaultLoadMoreViewCreator;", "Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper$LoadMoreViewCreator;", "()V", "mStatusVIew", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "onCreateView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "wrapper", "Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper;", "setState", "", "state", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends LoadMoreAdapterWrapper.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42137a;

    /* renamed from: b  reason: collision with root package name */
    private DmtStatusView f42138b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.base.a$a  reason: collision with other inner class name */
    static final class C0534a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoadMoreAdapterWrapper f42140b;

        C0534a(LoadMoreAdapterWrapper loadMoreAdapterWrapper) {
            this.f42140b = loadMoreAdapterWrapper;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42139a, false, 36080, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42139a, false, 36080, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            LoadMoreAdapterWrapper loadMoreAdapterWrapper = this.f42140b;
            if (PatchProxy.isSupport(new Object[0], loadMoreAdapterWrapper, LoadMoreAdapterWrapper.g, false, 36130, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], loadMoreAdapterWrapper, LoadMoreAdapterWrapper.g, false, 36130, new Class[0], Void.TYPE);
                return;
            }
            loadMoreAdapterWrapper.c(1);
            loadMoreAdapterWrapper.d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/discover/base/DefaultLoadMoreViewCreator$onCreateView$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtStatusView f42142b;

        public final void onViewDetachedFromWindow(@Nullable View view) {
        }

        b(DmtStatusView dmtStatusView) {
            this.f42142b = dmtStatusView;
        }

        public final void onViewAttachedToWindow(@Nullable View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f42141a, false, 36081, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f42141a, false, 36081, new Class[]{View.class}, Void.TYPE);
            } else if (this.f42142b.g() && view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42137a, false, 36079, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42137a, false, 36079, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                DmtStatusView dmtStatusView = this.f42138b;
                if (dmtStatusView != null) {
                    dmtStatusView.setStatus(-1);
                    break;
                } else {
                    return;
                }
            case 1:
                DmtStatusView dmtStatusView2 = this.f42138b;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.setStatus(0);
                    break;
                } else {
                    return;
                }
            case 2:
                DmtStatusView dmtStatusView3 = this.f42138b;
                if (dmtStatusView3 != null) {
                    dmtStatusView3.setStatus(1);
                    break;
                } else {
                    return;
                }
            case 3:
                DmtStatusView dmtStatusView4 = this.f42138b;
                if (dmtStatusView4 != null) {
                    dmtStatusView4.setStatus(2);
                    return;
                }
                break;
        }
    }

    @NotNull
    public final View a(@NotNull ViewGroup viewGroup, @NotNull LoadMoreAdapterWrapper loadMoreAdapterWrapper) {
        ViewGroup viewGroup2 = viewGroup;
        LoadMoreAdapterWrapper loadMoreAdapterWrapper2 = loadMoreAdapterWrapper;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, loadMoreAdapterWrapper2}, this, f42137a, false, 36078, new Class[]{ViewGroup.class, LoadMoreAdapterWrapper.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewGroup2, loadMoreAdapterWrapper2}, this, f42137a, false, 36078, new Class[]{ViewGroup.class, LoadMoreAdapterWrapper.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        Intrinsics.checkParameterIsNotNull(loadMoreAdapterWrapper2, "wrapper");
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        dmtStatusView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) UIUtils.dip2Px(viewGroup.getContext(), 60.0f)));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqm, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setGravity(17);
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqm, null);
            if (inflate2 != null) {
                TextView textView2 = (TextView) inflate2;
                textView2.setText(C0906R.string.b6x);
                textView2.setOnClickListener(new C0534a(loadMoreAdapterWrapper2));
                textView2.setGravity(17);
                DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(viewGroup.getContext());
                dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                dmtLoadingLayout.addOnAttachStateChangeListener(new b(dmtStatusView));
                dmtStatusView.setBuilder(new DmtStatusView.a(viewGroup.getContext()).a((View) dmtLoadingLayout).b((View) textView).c((View) textView2));
                this.f42138b = dmtStatusView;
                return dmtStatusView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
