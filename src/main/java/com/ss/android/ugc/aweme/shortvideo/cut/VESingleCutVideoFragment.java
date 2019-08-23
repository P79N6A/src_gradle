package com.ss.android.ugc.aweme.shortvideo.cut;

import android.annotation.SuppressLint;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.record.n;
import com.ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0017J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VESingleCutVideoFragment;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment;", "()V", "cornersBottom", "Landroid/widget/RelativeLayout;", "cornersTop", "videoEditViewWrapper", "addClickListener", "", "getLayoutRes", "", "ivNext", "Landroid/view/View;", "ivPlay", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onClick", "v", "onViewCreated", "view", "relayoutBottomLayout", "b", "", "setTopMargin", "speedBarStub", "Landroid/view/ViewStub;", "surfaceView", "Landroid/view/SurfaceView;", "tvTimeSelected", "Landroid/widget/TextView;", "updateNextBtnStyle", "backgroundDrawable", "textColor", "videoEditView", "Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VEVideoEditView;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VESingleCutVideoFragment extends VECutVideoFragment {
    public static ChangeQuickRedirect r;
    private RelativeLayout s;
    private RelativeLayout t;
    private RelativeLayout u;
    private HashMap v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VESingleCutVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VESingleCutVideoFragment vESingleCutVideoFragment) {
            super(1);
            this.this$0 = vESingleCutVideoFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 75750, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 75750, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            fb.a((View) (SurfaceView) this.this$0.a((int) C0906R.id.drp), (Context) this.this$0.getActivity(), Math.min(this.this$0.h().c().get(0).g, this.this$0.h().c().get(0).h), Math.max(this.this$0.h().c().get(0).g, this.this$0.h().c().get(0).h));
            this.this$0.v();
        }
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75749, new Class[0], Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.clear();
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, r, false, 75748, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, r, false, 75748, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.v == null) {
            this.v = new HashMap();
        }
        View view = (View) this.v.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.v.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        B();
    }

    @NotNull
    public final SurfaceView C() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75734, new Class[0], SurfaceView.class)) {
            return (SurfaceView) PatchProxy.accessDispatch(new Object[0], this, r, false, 75734, new Class[0], SurfaceView.class);
        }
        SurfaceView surfaceView = (SurfaceView) a((int) C0906R.id.drp);
        Intrinsics.checkExpressionValueIsNotNull(surfaceView, "videoSurface");
        return surfaceView;
    }

    @NotNull
    public final VEVideoEditView a() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75735, new Class[0], VEVideoEditView.class)) {
            return (VEVideoEditView) PatchProxy.accessDispatch(new Object[0], this, r, false, 75735, new Class[0], VEVideoEditView.class);
        }
        VEVideoEditView vEVideoEditView = (VEVideoEditView) a((int) C0906R.id.drl);
        Intrinsics.checkExpressionValueIsNotNull(vEVideoEditView, "videoEditView");
        return vEVideoEditView;
    }

    @NotNull
    public final View b() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75736, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, r, false, 75736, new Class[0], View.class);
        }
        ImageView imageView = (ImageView) a((int) C0906R.id.ayc);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivPlay");
        return imageView;
    }

    @NotNull
    public final View c() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75737, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, r, false, 75737, new Class[0], View.class);
        }
        TextView textView = (TextView) a((int) C0906R.id.d8h);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvNext");
        return textView;
    }

    @NotNull
    public final TextView d() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75739, new Class[0], TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, r, false, 75739, new Class[0], TextView.class);
        }
        AVDmtTextView aVDmtTextView = (AVDmtTextView) a((int) C0906R.id.d8n);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtTextView, "tvTime");
        return aVDmtTextView;
    }

    @NotNull
    public final ViewStub e() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75738, new Class[0], ViewStub.class)) {
            return (ViewStub) PatchProxy.accessDispatch(new Object[0], this, r, false, 75738, new Class[0], ViewStub.class);
        }
        ViewStub viewStub = (ViewStub) getView().findViewById(C0906R.id.cwd);
        Intrinsics.checkExpressionValueIsNotNull(viewStub, "stubSpeedLayout");
        return viewStub;
    }

    public final int f() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75740, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, r, false, 75740, new Class[0], Integer.TYPE)).intValue();
        } else if (fc.a()) {
            return C0906R.layout.nd;
        } else {
            return C0906R.layout.nc;
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 75746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 75746, new Class[0], Void.TYPE);
            return;
        }
        super.x();
        View.OnClickListener onClickListener = this;
        ((AVDmtImageView) a((int) C0906R.id.ayd)).setOnClickListener(onClickListener);
        ((AVDmtCheckableImageButton) a((int) C0906R.id.ayf)).setOnClickListener(onClickListener);
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, r, false, 75743, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, r, false, 75743, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (fc.a()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            new cv(activity).a(cv.a.INSTANCE, new a(this));
        }
    }

    public final void b(boolean z) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, r, false, 75745, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, r, false, 75745, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.cf);
        ViewGroup.LayoutParams layoutParams = m().getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (z) {
                i = dimensionPixelSize;
            } else {
                i = (int) UIUtils.dip2Px(getActivity(), 132.0f);
            }
            layoutParams2.height = i;
            m().setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout = this.u;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoEditViewWrapper");
            }
            ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                if (z) {
                    i2 = (int) (UIUtils.dip2Px(getActivity(), 5.5f) + ((float) dimensionPixelSize));
                } else {
                    i2 = 0;
                }
                layoutParams4.bottomMargin = i2;
                RelativeLayout relativeLayout2 = this.u;
                if (relativeLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEditViewWrapper");
                }
                relativeLayout2.setLayoutParams(layoutParams4);
                RelativeLayout relativeLayout3 = this.t;
                if (relativeLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
                }
                ViewGroup.LayoutParams layoutParams5 = relativeLayout3.getLayoutParams();
                if (layoutParams5 != null) {
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                    if (!z) {
                        dimensionPixelSize = 0;
                    }
                    layoutParams6.bottomMargin = dimensionPixelSize;
                    RelativeLayout relativeLayout4 = this.t;
                    if (relativeLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
                    }
                    relativeLayout4.setLayoutParams(layoutParams6);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @SuppressLint({"RestrictedApi"})
    public final void onClick(@Nullable View view) {
        Integer num;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, r, false, 75747, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, r, false, 75747, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.ayf) {
            ((AVDmtCheckableImageButton) a((int) C0906R.id.ayf)).toggle();
            AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) a((int) C0906R.id.ayf);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton, "ivSpeed");
            if (aVDmtCheckableImageButton.isChecked()) {
                n k = k();
                VEVideoEditView vEVideoEditView = (VEVideoEditView) a((int) C0906R.id.drl);
                Intrinsics.checkExpressionValueIsNotNull(vEVideoEditView, "videoEditView");
                k.a(ak.a(vEVideoEditView.getCurrentSpeed()));
                k().a(0);
            } else {
                k().a(8);
            }
        } else {
            z = false;
        }
        if (!z) {
            super.onClick(view);
        }
    }

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, r, false, 75744, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, r, false, 75744, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout relativeLayout = this.s;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z) {
                i = fc.c(getActivity());
            }
            layoutParams2.topMargin = i;
            RelativeLayout relativeLayout2 = this.s;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
            }
            relativeLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{2130838236, Integer.valueOf(i2)}, this, r, false, 75741, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{2130838236, Integer.valueOf(i2)}, this, r, false, 75741, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((TextView) a((int) C0906R.id.d8h)).setBackgroundResource(2130838236);
        ((TextView) a((int) C0906R.id.d8h)).setTextColor(i2);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, r, false, 75742, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, r, false, 75742, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        AVDmtImageView aVDmtImageView = (AVDmtImageView) a((int) C0906R.id.ayd);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtImageView, "ivRotate");
        aVDmtImageView.setVisibility(0);
        MutableLiveData<com.ss.android.ugc.aweme.shortvideo.cut.model.a> mutableLiveData = h().r;
        if (mutableLiveData != null) {
            com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.model.a) mutableLiveData.getValue();
            if (aVar != null) {
                List<h> videoSegmentList = aVar.getVideoSegmentList();
                if (videoSegmentList != null && !videoSegmentList.isEmpty()) {
                    h hVar = h().c().get(0);
                    if (hVar.g <= 0 || hVar.h <= 0) {
                        y();
                        return;
                    }
                    AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) a((int) C0906R.id.ayf);
                    Intrinsics.checkExpressionValueIsNotNull(aVDmtCheckableImageButton, "ivSpeed");
                    if (!this.f66197e || !j().a(hVar)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    aVDmtCheckableImageButton.setVisibility(i);
                    int min = Math.min(hVar.g, hVar.h);
                    int max = Math.max(hVar.g, hVar.h);
                    if (fc.a()) {
                        View findViewById = view.findViewById(C0906R.id.a07);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.corners_top)");
                        this.s = (RelativeLayout) findViewById;
                        View findViewById2 = view.findViewById(C0906R.id.a06);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.corners_bottom)");
                        this.t = (RelativeLayout) findViewById2;
                        RelativeLayout relativeLayout = this.t;
                        if (relativeLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
                        }
                        relativeLayout.setVisibility(0);
                        RelativeLayout relativeLayout2 = this.s;
                        if (relativeLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
                        }
                        relativeLayout2.setVisibility(0);
                        View findViewById3 = view.findViewById(C0906R.id.ds4);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.video_edit_view_wrapper)");
                        this.u = (RelativeLayout) findViewById3;
                        ViewGroup.LayoutParams layoutParams = l().getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = ((int) UIUtils.dip2Px(getActivity(), 25.0f)) + fc.c(getActivity());
                            l().setLayoutParams(layoutParams2);
                            fb.a((View) (SurfaceView) a((int) C0906R.id.drp), (Context) getActivity(), min, max);
                            v();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    } else if ((((float) min) * 1.0f) / ((float) max) < 0.85f) {
                        fb.b((SurfaceView) a((int) C0906R.id.drp), min, max);
                    }
                }
            }
        }
    }
}
