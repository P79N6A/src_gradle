package com.ss.android.ugc.gamora.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.ey;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordCameraScene;", "Lcom/bytedance/scene/Scene;", "()V", "cameraViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordCameraViewModel;", "focusing", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends com.bytedance.scene.e {
    public static final a j = new a((byte) 0);
    public boolean i;
    private RecordCameraViewModel k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordCameraScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f77647a;

        b(e eVar) {
            this.f77647a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Pair pair = (Pair) obj;
            if (pair != null && !this.f77647a.i) {
                this.f77647a.i = true;
                final ImageView imageView = new ImageView(this.f77647a.f22093a);
                imageView.setImageResource(2130838684);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                int dip2Px = (int) UIUtils.dip2Px(this.f77647a.f22093a, 65.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dip2Px, dip2Px);
                layoutParams.leftMargin = (int) (((Number) pair.getFirst()).floatValue() - (UIUtils.dip2Px(this.f77647a.f22093a, 60.0f) / 2.0f));
                if (ey.a((Context) this.f77647a.f22093a)) {
                    layoutParams.rightMargin = (UIUtils.getScreenWidth(this.f77647a.f22093a) - layoutParams.leftMargin) - dip2Px;
                }
                layoutParams.topMargin = ((Number) pair.getSecond()).intValue() - (((int) UIUtils.dip2Px(this.f77647a.f22093a, 60.0f)) / 2);
                if (layoutParams.leftMargin > UIUtils.getScreenWidth(this.f77647a.f22093a) - dip2Px) {
                    layoutParams.leftMargin = UIUtils.getScreenWidth(this.f77647a.f22093a) - dip2Px;
                }
                if (ey.a((Context) this.f77647a.f22093a) && layoutParams.rightMargin > UIUtils.getScreenWidth(this.f77647a.f22093a) - dip2Px) {
                    layoutParams.rightMargin = UIUtils.getScreenWidth(this.f77647a.f22093a) - dip2Px;
                }
                if (layoutParams.leftMargin < 0) {
                    layoutParams.leftMargin = 0;
                }
                if (ey.a((Context) this.f77647a.f22093a) && layoutParams.rightMargin < 0) {
                    layoutParams.rightMargin = 0;
                }
                if (layoutParams.topMargin > UIUtils.getScreenHeight(this.f77647a.f22093a) - dip2Px) {
                    layoutParams.topMargin = UIUtils.getScreenHeight(this.f77647a.f22093a) - dip2Px;
                }
                if (layoutParams.topMargin < 0) {
                    layoutParams.topMargin = 0;
                }
                imageView.setLayoutParams(layoutParams);
                View view = this.f77647a.f22094b;
                if (view != null) {
                    ((ViewGroup) view).addView(imageView);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{1.0f, 1.1f, 0.95f});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleY", new float[]{1.0f, 1.1f, 0.95f});
                    ofFloat.addListener(new AnimatorListenerAdapter(this) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f77648a;

                        public final void onAnimationEnd(@NotNull Animator animator) {
                            Intrinsics.checkParameterIsNotNull(animator, "animation");
                            Lifecycle lifecycle = this.f77648a.f77647a.getLifecycle();
                            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycle");
                            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                                View view = this.f77648a.f77647a.f22094b;
                                if (view != null) {
                                    ((ViewGroup) view).removeView(imageView);
                                    this.f77648a.f77647a.i = false;
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                            }
                        }

                        {
                            this.f77648a = r1;
                        }
                    });
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animatorX");
                    ofFloat.setInterpolator(new com.ss.android.ttve.utils.a());
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "animatorY");
                    ofFloat2.setInterpolator(new com.ss.android.ttve.utils.a());
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet.setDuration(1500).start();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        }
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Activity s = s();
        if (s != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) s).get(RecordCameraViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(re…eraViewModel::class.java)");
            this.k = (RecordCameraViewModel) viewModel;
            RecordCameraViewModel recordCameraViewModel = this.k;
            if (recordCameraViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraViewModel");
            }
            recordCameraViewModel.f77598a.observe(this, new b(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.apx, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
