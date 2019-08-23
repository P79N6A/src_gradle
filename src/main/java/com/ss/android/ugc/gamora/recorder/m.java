package com.ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.h;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordTitleScene;", "Lcom/bytedance/scene/Scene;", "Lcom/bytedance/jedi/arch/JediView;", "()V", "closeChooseContainer", "Landroid/widget/RelativeLayout;", "closeRecordView", "Lcom/ss/android/ugc/aweme/views/AutoRTLImageView;", "ivChooseMusic", "Landroid/widget/ImageView;", "mMusicTipProvider", "Lcom/ss/android/ugc/aweme/shortvideo/PlanCMusicTipProvider;", "progressSegmentView", "Lcom/ss/android/ugc/aweme/shortvideo/widget/ProgressSegmentView;", "titleBarContainer", "Landroid/widget/FrameLayout;", "tvChooseMusic", "Landroid/widget/TextView;", "uiHandler", "Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;", "useStickerMusicTips", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "viewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleViewModel;", "getViewModel", "()Lcom/ss/android/ugc/gamora/recorder/RecordTitleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindMusicTipsDismissView", "", "initObserver", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setClickable", "isClick", "", "setMusicChanged", "showMusicTip", "tryHideMusicTips", "tryInitMusicTipProvider", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m extends com.bytedance.scene.e implements com.bytedance.jedi.arch.h {
    static final /* synthetic */ KProperty[] i = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(m.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordTitleViewModel;"))};
    public static final b q = new b((byte) 0);
    public FrameLayout j;
    public RelativeLayout k;
    public ImageView l;
    public TextView m;
    public ProgressSegmentView n;
    public AutoRTLImageView o;
    ea p;
    private SafeHandler r;
    private final Lazy s = LazyKt.lazy(new a(this, Reflection.getOrCreateKotlinClass(RecordTitleViewModel.class)));
    private com.bytedance.ies.dmt.ui.a.b t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/scene/Scene;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/scene/JediSceneExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<RecordTitleViewModel> {
        final /* synthetic */ com.bytedance.scene.e $this_activityViewModel;
        final /* synthetic */ KClass $viewModelClass;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.e eVar, KClass kClass) {
            super(0);
            this.$this_activityViewModel = eVar;
            this.$viewModelClass = kClass;
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.gamora.recorder.RecordTitleViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final RecordTitleViewModel invoke() {
            Activity s = this.$this_activityViewModel.s();
            if (s != null) {
                ViewModelProvider of = ViewModelProviders.of((FragmentActivity) s, new ViewModelProvider.Factory() {
                    public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                        throw new IllegalStateException(RecordTitleViewModel.class.getSimpleName() + " should be created in the activity before being used.");
                    }
                });
                return (JediViewModel) of.get("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + RecordTitleViewModel.class.getCanonicalName(), kotlin.jvm.a.a(this.$viewModelClass));
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordTitleScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77662a;

        c(m mVar) {
            this.f77662a = mVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f77662a.z();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                m.e(this.this$0).setVisibility(0);
            } else {
                m.e(this.this$0).setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<com.bytedance.jedi.arch.f, Integer, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, int i) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            ViewGroup.LayoutParams layoutParams = m.e(this.this$0).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = ((int) UIUtils.dip2Px(this.this$0.f22093a, 6.0f)) + i;
                m.e(this.this$0).setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = m.c(this.this$0).getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = i;
                    m.c(this.this$0).setLayoutParams(layoutParams4);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, Pair<? extends Float, ? extends Float>, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Pair) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @Nullable Pair<Float, Float> pair) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (pair != null) {
                UIUtils.clearAnimation(m.c(this.this$0));
                AlphaAnimation alphaAnimation = new AlphaAnimation(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
                alphaAnimation.setDuration(150);
                m.c(this.this$0).startAnimation(alphaAnimation);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            m.a(this.this$0).setClickable(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function2<com.bytedance.jedi.arch.f, Drawable, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Drawable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @Nullable Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (drawable != null) {
                m.d(this.this$0).setImageDrawable(drawable);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                m.b(this.this$0).setVisibility(0);
            } else {
                m.b(this.this$0).setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<com.bytedance.jedi.arch.f, String, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull String str) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            m.a(this.this$0).setText(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function2<com.bytedance.jedi.arch.f, Integer, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, int i) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            m.d(this.this$0).setImageAlpha(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, Float, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Number) obj2).floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, float f2) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            m.a(this.this$0).setAlpha(f2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/shortvideo/ui/TimeSpeedModelExtension;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.recorder.m$m  reason: collision with other inner class name */
    static final class C0822m extends Lambda implements Function2<com.bytedance.jedi.arch.f, Pair<? extends List<? extends TimeSpeedModelExtension>, ? extends Long>, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0822m(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Pair) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @Nullable Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (pair != null) {
                m.e(this.this$0).a((List) pair.getFirst(), ((Number) pair.getSecond()).longValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function2<com.bytedance.jedi.arch.f, Long, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Number) obj2).longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, long j) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            m.e(this.this$0).setMaxDuration(j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class o<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77663a;

        o(m mVar) {
            this.f77663a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77663a.z();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class p<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77664a;

        p(m mVar) {
            this.f77664a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77664a.A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class q<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77665a;

        q(m mVar) {
            this.f77665a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            m mVar = this.f77665a;
            mVar.y();
            ea eaVar = mVar.p;
            if (eaVar != null) {
                eaVar.f66829c = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class r<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77666a;

        r(m mVar) {
            this.f77666a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                m mVar = this.f77666a;
                Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                boolean booleanValue = bool.booleanValue();
                Activity activity = mVar.f22093a;
                if (activity != null) {
                    ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(ShortVideoContextViewModel.class);
                    Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…extViewModel::class.java)");
                    fh fhVar = ((ShortVideoContextViewModel) viewModel).f65401b;
                    if (booleanValue) {
                        TextView textView = mVar.m;
                        if (textView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvChooseMusic");
                        }
                        textView.setOnClickListener(new x(mVar, fhVar));
                    } else {
                        TextView textView2 = mVar.m;
                        if (textView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvChooseMusic");
                        }
                        textView2.setOnClickListener(new y(fhVar));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class s extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                m.c(this.this$0).setVisibility(0);
            } else {
                m.c(this.this$0).setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class t extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                m.d(this.this$0).setVisibility(0);
            } else {
                m.d(this.this$0).setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class u extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                m.a(this.this$0).setVisibility(0);
            } else {
                m.a(this.this$0).setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77667a;

        v(m mVar) {
            this.f77667a = mVar;
        }

        public final void run() {
            m.a(this.f77667a).requestFocus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/gamora/recorder/RecordTitleScene$onViewCreated$3", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class w extends ax {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77668a;

        w(m mVar) {
            this.f77668a = mVar;
        }

        public final void a(@Nullable View view) {
            bd bdVar = this.f77668a.x().f77608d;
            if (bdVar != null) {
                AutoRTLImageView autoRTLImageView = this.f77668a.o;
                if (autoRTLImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("closeRecordView");
                }
                bdVar.a((Object) autoRTLImageView, (bc) new com.ss.android.ugc.aweme.tools.j("close_view"));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class x implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ fh f77670b;

        x(m mVar, fh fhVar) {
            this.f77669a = mVar;
            this.f77670b = fhVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("change_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f77670b.q).a("shoot_way", this.f77670b.r).a("draft_id", this.f77670b.v).a("enter_from", "video_shoot_page").f34114b);
            bd bdVar = this.f77669a.x().f77608d;
            if (bdVar != null) {
                Activity activity = this.f77669a.f22093a;
                if (activity != null) {
                    bdVar.a((Object) ((VideoRecordNewActivity) activity).P, (bc) new com.ss.android.ugc.aweme.tools.k());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class y implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fh f77671a;

        y(fh fhVar) {
            this.f77671a = fhVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("change_music_grey", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f77671a.q).a("shoot_way", this.f77671a.r).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/gamora/recorder/RecordTitleScene$showMusicTip$1$1"}, k = 3, mv = {1, 1, 15})
    static final class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.dmt.ui.a.b f77672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f77673b;

        z(com.bytedance.ies.dmt.ui.a.b bVar, m mVar) {
            this.f77672a = bVar;
            this.f77673b = mVar;
        }

        public final void run() {
            if (this.f77673b.f22093a != null) {
                Activity activity = this.f77673b.f22093a;
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                if (!activity.isFinishing()) {
                    int[] iArr = new int[2];
                    m.a(this.f77673b).getLocationOnScreen(iArr);
                    int measuredWidth = iArr[0] + ((m.a(this.f77673b).getMeasuredWidth() - this.f77672a.d()) / 2);
                    float f2 = (float) iArr[1];
                    float measuredHeight = (float) m.a(this.f77673b).getMeasuredHeight();
                    Activity activity2 = this.f77673b.f22093a;
                    if (activity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.f77672a.a(m.a(this.f77673b), 80, measuredWidth, (int) (f2 + (measuredHeight - UIUtils.dip2Px(activity2, 10.0f))), (float) (this.f77672a.d() / 2));
                }
            }
        }
    }

    public final RecordTitleViewModel x() {
        return (RecordTitleViewModel) this.s.getValue();
    }

    @NotNull
    public final com.bytedance.jedi.arch.k a() {
        return h.a.a(this);
    }

    @NotNull
    public final com.bytedance.jedi.arch.r<com.bytedance.jedi.arch.f> b() {
        return h.a.b(this);
    }

    public final boolean c() {
        return h.a.e(this);
    }

    @NotNull
    public final LifecycleOwner d() {
        return h.a.c(this);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        return h.a.d(this);
    }

    public final void z() {
        com.bytedance.ies.dmt.ui.a.b bVar = this.t;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final void y() {
        if (this.p == null) {
            Activity activity = this.f22093a;
            if (activity != null) {
                this.p = new ea((FragmentActivity) activity);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.bytedance.ies.dmt.ui.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r10 = this;
            r10.y()
            com.ss.android.ugc.aweme.shortvideo.ea r7 = r10.p
            r8 = 0
            if (r7 == 0) goto L_0x008e
            r9 = 0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.shortvideo.ea.f66825a
            r3 = 0
            r4 = 74382(0x1228e, float:1.04231E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.dmt.ui.a.b> r6 = com.bytedance.ies.dmt.ui.a.b.class
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0031
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.shortvideo.ea.f66825a
            r3 = 0
            r4 = 74382(0x1228e, float:1.04231E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.dmt.ui.a.b> r6 = com.bytedance.ies.dmt.ui.a.b.class
            r1 = r7
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r8 = r0
            com.bytedance.ies.dmt.ui.a.b r8 = (com.bytedance.ies.dmt.ui.a.b) r8
            goto L_0x008e
        L_0x0031:
            android.support.v4.app.FragmentActivity r0 = r7.f66830d
            if (r0 == 0) goto L_0x0049
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            java.lang.String r1 = "ViewModelProviders.of(it…extViewModel::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r0
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f65401b
            goto L_0x004a
        L_0x0049:
            r0 = r8
        L_0x004a:
            r7.f66828b = r0
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f66828b
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.a()
            r1 = 1
            if (r0 != r1) goto L_0x008e
            com.ss.android.ugc.aweme.ao.a r0 = com.ss.android.ugc.aweme.port.in.a.i
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f66828b
            if (r1 == 0) goto L_0x005f
            java.lang.String r8 = r1.f67723f
        L_0x005f:
            int r0 = r0.b(r8)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f66828b
            if (r1 == 0) goto L_0x0069
            boolean r9 = r1.V
        L_0x0069:
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.cz.a()
            if (r1 == 0) goto L_0x007c
            long r0 = (long) r0
            if (r9 == 0) goto L_0x0075
            long r2 = com.ss.android.ugc.aweme.shortvideo.ea.f66826e
            goto L_0x0077
        L_0x0075:
            long r2 = com.ss.android.ugc.aweme.shortvideo.ea.f66827f
        L_0x0077:
            com.bytedance.ies.dmt.ui.a.b r8 = r7.a(r0, r2)
            goto L_0x008e
        L_0x007c:
            long r1 = com.ss.android.ugc.aweme.shortvideo.ea.f66827f
            long r3 = (long) r0
            long r0 = java.lang.Math.min(r1, r3)
            if (r9 == 0) goto L_0x0088
            long r2 = com.ss.android.ugc.aweme.shortvideo.ea.f66826e
            goto L_0x008a
        L_0x0088:
            long r2 = com.ss.android.ugc.aweme.shortvideo.ea.f66827f
        L_0x008a:
            com.bytedance.ies.dmt.ui.a.b r8 = r7.a(r0, r2)
        L_0x008e:
            r10.t = r8
            com.bytedance.ies.dmt.ui.a.b r0 = r10.t
            if (r0 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r1 = r10.r
            if (r1 != 0) goto L_0x009d
            java.lang.String r2 = "uiHandler"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x009d:
            com.ss.android.ugc.gamora.recorder.m$z r2 = new com.ss.android.ugc.gamora.recorder.m$z
            r2.<init>(r0, r10)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
        L_0x00a7:
            android.widget.TextView r0 = r10.m
            if (r0 != 0) goto L_0x00b0
            java.lang.String r1 = "tvChooseMusic"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00b0:
            com.ss.android.ugc.gamora.recorder.m$c r1 = new com.ss.android.ugc.gamora.recorder.m$c
            r1.<init>(r10)
            android.view.View$OnTouchListener r1 = (android.view.View.OnTouchListener) r1
            r0.setOnTouchListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.m.A():void");
    }

    public static final /* synthetic */ TextView a(m mVar) {
        TextView textView = mVar.m;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvChooseMusic");
        }
        return textView;
    }

    public static final /* synthetic */ FrameLayout b(m mVar) {
        FrameLayout frameLayout = mVar.j;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarContainer");
        }
        return frameLayout;
    }

    public static final /* synthetic */ RelativeLayout c(m mVar) {
        RelativeLayout relativeLayout = mVar.k;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeChooseContainer");
        }
        return relativeLayout;
    }

    public static final /* synthetic */ ImageView d(m mVar) {
        ImageView imageView = mVar.l;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivChooseMusic");
        }
        return imageView;
    }

    public static final /* synthetic */ ProgressSegmentView e(m mVar) {
        ProgressSegmentView progressSegmentView = mVar.n;
        if (progressSegmentView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressSegmentView");
        }
        return progressSegmentView;
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function1, "block");
        return h.a.a(this, vm1, function1);
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view, bundle);
        LifecycleOwner lifecycleOwner = this;
        this.r = new SafeHandler(lifecycleOwner);
        View a2 = a((int) C0906R.id.d3n);
        Intrinsics.checkExpressionValueIsNotNull(a2, "findViewById(R.id.title_bar_container)");
        this.j = (FrameLayout) a2;
        View a3 = a((int) C0906R.id.tn);
        Intrinsics.checkExpressionValueIsNotNull(a3, "findViewById(R.id.close_choose_container)");
        this.k = (RelativeLayout) a3;
        View a4 = a((int) C0906R.id.azs);
        Intrinsics.checkExpressionValueIsNotNull(a4, "findViewById(R.id.iv_choose_music)");
        this.l = (ImageView) a4;
        View a5 = a((int) C0906R.id.d_b);
        Intrinsics.checkExpressionValueIsNotNull(a5, "findViewById(R.id.tv_choose_music)");
        this.m = (TextView) a5;
        View a6 = a((int) C0906R.id.c7y);
        Intrinsics.checkExpressionValueIsNotNull(a6, "findViewById(R.id.progress_segment_view)");
        this.n = (ProgressSegmentView) a6;
        View a7 = a((int) C0906R.id.asa);
        Intrinsics.checkExpressionValueIsNotNull(a7, "findViewById(R.id.img_close_record)");
        this.o = (AutoRTLImageView) a7;
        SafeHandler safeHandler = this.r;
        if (safeHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiHandler");
        }
        safeHandler.post(new v(this));
        if (com.ss.android.g.a.a()) {
            Typeface a8 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.c.g);
            if (a8 != null) {
                TextView textView = this.m;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvChooseMusic");
                }
                textView.setTypeface(a8);
            }
        }
        AutoRTLImageView autoRTLImageView = this.o;
        if (autoRTLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeRecordView");
        }
        autoRTLImageView.setOnClickListener(new w(this));
        Disposable unused = a(x(), n.INSTANCE, c(), false, new i(this));
        Disposable unused2 = a(x(), x.INSTANCE, c(), false, new s(this));
        Disposable unused3 = a(x(), y.INSTANCE, c(), false, new t(this));
        Disposable unused4 = a(x(), z.INSTANCE, c(), false, new u(this));
        Disposable unused5 = a(x(), aa.INSTANCE, c(), false, new d(this));
        Disposable unused6 = a(x(), o.INSTANCE, c(), false, new e(this));
        Disposable unused7 = a(x(), p.INSTANCE, c(), false, new f(this));
        Disposable unused8 = a(x(), q.INSTANCE, c(), false, new g(this));
        Disposable unused9 = a(x(), r.INSTANCE, c(), false, new h(this));
        Disposable unused10 = a(x(), s.INSTANCE, c(), false, new j(this));
        Disposable unused11 = a(x(), t.INSTANCE, c(), false, new k(this));
        Disposable unused12 = a(x(), u.INSTANCE, c(), false, new l(this));
        Disposable unused13 = a(x(), v.INSTANCE, c(), false, new C0822m(this));
        Disposable unused14 = a(x(), w.INSTANCE, c(), false, new n(this));
        x().f77609e.observe(lifecycleOwner, new o(this));
        x().f77610f.observe(lifecycleOwner, new p(this));
        x().g.observe(lifecycleOwner, new q(this));
        x().h.observe(lifecycleOwner, new r(this));
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.acv, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…tlebar, container, false)");
        return inflate;
    }

    @NotNull
    public final <S extends com.bytedance.jedi.arch.x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z2, boolean z3, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function2, "subscriber");
        return h.a.a(this, jediViewModel, z2, z3, function2);
    }

    @NotNull
    public final <S extends com.bytedance.jedi.arch.x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z2, boolean z3, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(function2, "subscriber");
        return h.a.a(this, jediViewModel, kProperty1, z2, z3, function2);
    }

    @NotNull
    public final <S extends com.bytedance.jedi.arch.x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty1, boolean z2, boolean z3, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super Throwable, Unit> function2, @Nullable Function1<? super com.bytedance.jedi.arch.f, Unit> function1, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super T, Unit> function22) {
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z2, z3, function2, function1, function22);
    }
}
