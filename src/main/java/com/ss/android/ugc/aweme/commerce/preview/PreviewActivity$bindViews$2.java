package com.ss.android.ugc.aweme.commerce.preview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout;
import com.ss.android.ugc.aweme.commerce.widget.PreviewTitle;
import com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$bindViews$2", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewActivity$bindViews$2 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37209a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PreviewActivity f37210b;

    PreviewActivity$bindViews$2(PreviewActivity previewActivity) {
        this.f37210b = previewActivity;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f37209a, false, 28664, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f37209a, false, 28664, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f37210b.V = true;
            this.f37210b.Q = true;
            this.f37210b.S = false;
            this.f37210b.b();
            PreviewActivity previewActivity = this.f37210b;
            if (PatchProxy.isSupport(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28585, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28585, new Class[0], Void.TYPE);
            } else if (!previewActivity.p) {
                int[] iArr = new int[2];
                StaggeredGridLayoutManager staggeredGridLayoutManager = previewActivity.h;
                if (staggeredGridLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staggeredLayoutManager");
                }
                staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
                int max = Math.max(iArr[0], iArr[1]);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = previewActivity.h;
                if (staggeredGridLayoutManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staggeredLayoutManager");
                }
                staggeredGridLayoutManager2.findLastCompletelyVisibleItemPositions(iArr);
                previewActivity.a((Math.max(max, 0) + Math.max(Math.min(iArr[0], iArr[1]), 0)) / 2, false);
            }
            int[] iArr2 = new int[2];
            PreviewActivity.e(this.f37210b).findLastVisibleItemPositions(iArr2);
            if (Math.max(iArr2[0], iArr2[1]) == PreviewActivity.e(this.f37210b).getItemCount() - 1) {
                this.f37210b.a(4);
            }
        } else {
            this.f37210b.S = true;
        }
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37209a, false, 28663, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37209a, false, 28663, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f37210b.O += i2;
        PreviewActivity previewActivity = this.f37210b;
        if (PatchProxy.isSupport(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28600, new Class[0], Void.TYPE);
        } else if (previewActivity.n != 0.0f) {
            if (((float) previewActivity.O) / previewActivity.n < 1.0f) {
                f2 = ((float) previewActivity.O) / previewActivity.n;
            } else {
                f2 = 1.0f;
            }
            PreviewTitle previewTitle = (PreviewTitle) previewActivity.e((int) C0906R.id.c5h);
            Activity activity = previewActivity;
            if (PatchProxy.isSupport(new Object[]{activity, Float.valueOf(f2)}, previewTitle, PreviewTitle.f38376a, false, 30212, new Class[]{Activity.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, Float.valueOf(f2)}, previewTitle, PreviewTitle.f38376a, false, 30212, new Class[]{Activity.class, Float.TYPE}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
                double d2 = (double) f2;
                if (d2 < 0.8d) {
                    Double.isNaN(d2);
                    f3 = (float) (1.25d * d2);
                } else {
                    f3 = 1.0f;
                }
                ImageView imageView = (ImageView) previewTitle.a((int) C0906R.id.iw);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "backBtnWhite");
                float f5 = 1.0f - f3;
                imageView.setAlpha(f5);
                ImageView imageView2 = (ImageView) previewTitle.a((int) C0906R.id.iv);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "backBtnBlack");
                imageView2.setAlpha(f3);
                ImageView imageView3 = (ImageView) previewTitle.a((int) C0906R.id.cp5);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "shareBtnWhite");
                imageView3.setAlpha(f5);
                ImageView imageView4 = (ImageView) previewTitle.a((int) C0906R.id.cp4);
                Intrinsics.checkExpressionValueIsNotNull(imageView4, "shareBtnBlack");
                imageView4.setAlpha(f3);
                if (!previewTitle.f38381e) {
                    ImageView imageView5 = (ImageView) previewTitle.a((int) C0906R.id.qv);
                    Intrinsics.checkExpressionValueIsNotNull(imageView5, "cartBtnWhite");
                    imageView5.setAlpha(f5);
                    ImageView imageView6 = (ImageView) previewTitle.a((int) C0906R.id.qu);
                    Intrinsics.checkExpressionValueIsNotNull(imageView6, "cartBtnBlack");
                    imageView6.setAlpha(f3);
                }
                View a2 = previewTitle.a((int) C0906R.id.d3c);
                Intrinsics.checkExpressionValueIsNotNull(a2, "titleBg");
                a2.setAlpha(f3);
                if (d2 > 0.4d || d2 < 0.8d) {
                    Double.isNaN(d2);
                    f4 = (float) (2.5d * (d2 - 0.4d));
                } else {
                    f4 = 1.0f;
                }
                RemoteImageView remoteImageView = (RemoteImageView) previewTitle.a((int) C0906R.id.cs3);
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "smallIconIV");
                remoteImageView.setAlpha(f4);
                if (d2 > 0.4d) {
                    FrameLayout frameLayout = (FrameLayout) previewTitle.a((int) C0906R.id.d3h);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout, "titleNavContainer");
                    frameLayout.setVisibility(0);
                    LinearLayout linearLayout = (LinearLayout) previewTitle.a((int) C0906R.id.d3g);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "titleNav");
                    linearLayout.setAlpha(f3);
                } else {
                    FrameLayout frameLayout2 = (FrameLayout) previewTitle.a((int) C0906R.id.d3h);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "titleNavContainer");
                    frameLayout2.setVisibility(8);
                }
                if (d2 > 0.4d && previewTitle.f38378b < f2) {
                    if (PatchProxy.isSupport(new Object[0], previewTitle, PreviewTitle.f38376a, false, 30210, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], previewTitle, PreviewTitle.f38376a, false, 30210, new Class[0], Void.TYPE);
                    } else if (!previewTitle.f38380d) {
                        previewTitle.f38380d = true;
                        if (previewTitle.f38379c.isRunning()) {
                            previewTitle.f38379c.reverse();
                        } else {
                            previewTitle.f38379c.start();
                        }
                    }
                }
                if (f2 < 1.0f && previewTitle.f38378b > f2) {
                    if (PatchProxy.isSupport(new Object[0], previewTitle, PreviewTitle.f38376a, false, 30211, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], previewTitle, PreviewTitle.f38376a, false, 30211, new Class[0], Void.TYPE);
                    } else if (previewTitle.f38380d) {
                        previewTitle.f38380d = false;
                        previewTitle.f38379c.reverse();
                    }
                }
                previewTitle.f38378b = f2;
            }
            int i5 = previewActivity.O;
            if (((PreviewTitle) previewActivity.e((int) C0906R.id.c5h)).getShowCommentCard()) {
                i3 = previewActivity.m;
            } else {
                i3 = previewActivity.l;
            }
            if (i5 < i3) {
                previewActivity.d(0);
            } else if (previewActivity.O < previewActivity.k) {
                if (((PreviewTitle) previewActivity.e((int) C0906R.id.c5h)).getShowCommentCard()) {
                    i4 = PreviewTitle.a.d();
                } else {
                    i4 = PreviewTitle.a.a();
                }
                previewActivity.d(i4);
            } else if (previewActivity.O < previewActivity.j) {
                previewActivity.d(PreviewTitle.a.b());
            } else {
                previewActivity.d(PreviewTitle.a.c());
            }
        }
        PreviewActivity previewActivity2 = this.f37210b;
        if (PatchProxy.isSupport(new Object[0], previewActivity2, PreviewActivity.f2890a, false, 28602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], previewActivity2, PreviewActivity.f2890a, false, 28602, new Class[0], Void.TYPE);
        } else if (previewActivity2.n > 0.0f && ((float) previewActivity2.O) <= previewActivity2.n) {
            FrameLayout frameLayout3 = previewActivity2.g;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            double d3 = (double) previewActivity2.O;
            Double.isNaN(d3);
            ((SquareSlidesLayout) frameLayout3.findViewById(C0906R.id.ctr)).setContentTranslationY((float) (d3 / 1.5d));
        }
        this.f37210b.o();
        this.f37210b.p();
        PreviewActivity previewActivity3 = this.f37210b;
        if (PatchProxy.isSupport(new Object[0], previewActivity3, PreviewActivity.f2890a, false, 28603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], previewActivity3, PreviewActivity.f2890a, false, 28603, new Class[0], Void.TYPE);
        } else if (previewActivity3.Q) {
            int i6 = previewActivity3.O;
            int i7 = previewActivity3.j;
            if (1 <= i7 && i6 >= i7) {
                ((RoundSelectorBtn) previewActivity3.e((int) C0906R.id.am1)).setState(true);
            } else {
                ((RoundSelectorBtn) previewActivity3.e((int) C0906R.id.am1)).setState(false);
            }
        }
        this.f37210b.t();
        if (this.f37210b.O >= 40) {
            this.f37210b.A();
        }
    }
}
