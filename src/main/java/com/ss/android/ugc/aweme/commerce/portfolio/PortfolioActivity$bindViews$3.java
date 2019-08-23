package com.ss.android.ugc.aweme.commerce.portfolio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.utils.ea;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/PortfolioActivity$bindViews$3", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioActivity$bindViews$3 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36980a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PortfolioActivity f36981b;

    PortfolioActivity$bindViews$3(PortfolioActivity portfolioActivity) {
        this.f36981b = portfolioActivity;
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        float f2;
        boolean z;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36980a, false, 28380, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36980a, false, 28380, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        PortfolioActivity portfolioActivity = this.f36981b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, portfolioActivity, PortfolioActivity.f2884a, false, 28331, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, portfolioActivity, PortfolioActivity.f2884a, false, 28331, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        portfolioActivity.v += i2;
        portfolioActivity.v = Math.max(0, portfolioActivity.v);
        if (portfolioActivity.v >= portfolioActivity.w) {
            f2 = 1.0f;
        } else if (portfolioActivity.v <= 0) {
            f2 = 0.0f;
        } else {
            f2 = (((float) portfolioActivity.v) * 1.0f) / ((float) portfolioActivity.w);
        }
        float f3 = 1.0f - f2;
        FrameLayout frameLayout = portfolioActivity.f2886c;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.dpq);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.user_info_area");
        linearLayout.setAlpha(f3);
        RemoteImageView remoteImageView = (RemoteImageView) portfolioActivity.a((int) C0906R.id.lr);
        Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "blur_glass_area");
        remoteImageView.setAlpha(f3);
        FrameLayout frameLayout2 = portfolioActivity.f2886c;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout2 = (LinearLayout) frameLayout2.findViewById(C0906R.id.dpq);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.user_info_area");
        Context context = portfolioActivity;
        linearLayout2.setTranslationY(((float) ((int) UIUtils.dip2Px(context, 35.0f))) * f2);
        RemoteImageView remoteImageView2 = (RemoteImageView) portfolioActivity.a((int) C0906R.id.lr);
        Intrinsics.checkExpressionValueIsNotNull(remoteImageView2, "blur_glass_area");
        remoteImageView2.setTranslationY(((float) (-((int) UIUtils.dip2Px(context, 50.0f)))) * f2);
        View a2 = portfolioActivity.a((int) C0906R.id.k5);
        Intrinsics.checkExpressionValueIsNotNull(a2, "bg_alpha");
        a2.setAlpha(f2);
        DmtTextView dmtTextView = (DmtTextView) portfolioActivity.a((int) C0906R.id.cqz);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "shop_title_area");
        dmtTextView.setAlpha(f2);
        ImageView imageView = (ImageView) portfolioActivity.a((int) C0906R.id.ix);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "back_btn");
        imageView.setAlpha(f3);
        ImageView imageView2 = (ImageView) portfolioActivity.a((int) C0906R.id.j2);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "back_btn_white");
        imageView2.setAlpha(f2);
        View a3 = portfolioActivity.a((int) C0906R.id.d6s);
        Intrinsics.checkExpressionValueIsNotNull(a3, "trick_mask");
        a3.setTranslationY(-((float) portfolioActivity.v));
        RemoteImageView remoteImageView3 = (RemoteImageView) portfolioActivity.a((int) C0906R.id.cr1);
        Intrinsics.checkExpressionValueIsNotNull(remoteImageView3, "shopping_guide");
        remoteImageView3.setAlpha(f3);
        if (f2 < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, portfolioActivity, PortfolioActivity.f2884a, false, 28332, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, portfolioActivity, PortfolioActivity.f2884a, false, 28332, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (portfolioActivity.h != z) {
            ea.f75806b.a(portfolioActivity, portfolioActivity.getWindow(), portfolioActivity.h);
            portfolioActivity.h = z;
        }
        DmtTextView dmtTextView2 = (DmtTextView) portfolioActivity.a((int) C0906R.id.xn);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "commerce_title_right");
        if (dmtTextView2.getVisibility() == 0) {
            DmtTextView dmtTextView3 = (DmtTextView) portfolioActivity.a((int) C0906R.id.xn);
            Object evaluate = portfolioActivity.q.evaluate(f2, -1, Integer.valueOf(portfolioActivity.s));
            if (evaluate != null) {
                dmtTextView3.setTextColor(((Integer) evaluate).intValue());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        ImageView imageView3 = (ImageView) portfolioActivity.a((int) C0906R.id.cp5);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "shareBtnWhite");
        imageView3.setAlpha(f3);
        ImageView imageView4 = (ImageView) portfolioActivity.a((int) C0906R.id.cp4);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "shareBtnBlack");
        imageView4.setAlpha(f2);
        View view = portfolioActivity.k;
        if (view != null && view.getVisibility() == 0 && portfolioActivity.v >= portfolioActivity.w) {
            FrameLayout frameLayout3 = portfolioActivity.f2886c;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout3 = (LinearLayout) frameLayout3.findViewById(C0906R.id.bgs);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "headerView.ll_head_sort_container");
            if (linearLayout3.getChildCount() == 1) {
                LinearLayout linearLayout4 = (LinearLayout) portfolioActivity.a((int) C0906R.id.bi3);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "ll_sort_container");
                if (linearLayout4.getChildCount() == 0) {
                    FrameLayout frameLayout4 = portfolioActivity.f2886c;
                    if (frameLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    ((LinearLayout) frameLayout4.findViewById(C0906R.id.bgs)).removeView(portfolioActivity.k);
                    ((LinearLayout) portfolioActivity.a((int) C0906R.id.bi3)).addView(portfolioActivity.k);
                }
            }
        }
        View view2 = portfolioActivity.k;
        if (view2 != null && view2.getVisibility() == 0 && portfolioActivity.v < portfolioActivity.w) {
            FrameLayout frameLayout5 = portfolioActivity.f2886c;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout5 = (LinearLayout) frameLayout5.findViewById(C0906R.id.bgs);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "headerView.ll_head_sort_container");
            if (linearLayout5.getChildCount() == 0) {
                LinearLayout linearLayout6 = (LinearLayout) portfolioActivity.a((int) C0906R.id.bi3);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "ll_sort_container");
                if (linearLayout6.getChildCount() == 1) {
                    ((LinearLayout) portfolioActivity.a((int) C0906R.id.bi3)).removeView(portfolioActivity.k);
                    FrameLayout frameLayout6 = portfolioActivity.f2886c;
                    if (frameLayout6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    ((LinearLayout) frameLayout6.findViewById(C0906R.id.bgs)).addView(portfolioActivity.k);
                }
            }
        }
    }
}
