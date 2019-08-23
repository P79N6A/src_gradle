package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.p;
import dmt.av.video.VEVideoPublishEditViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\b\u0010)\u001a\u00020&H\u0002J\u0006\u0010*\u001a\u00020&J\u0018\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\bH\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0007J\b\u00101\u001a\u00020&H\u0007J\u0012\u00102\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u000e\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\u0019J\u0006\u00107\u001a\u00020&J\u001c\u00108\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\rH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectModule;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/IAudioEffectHintCallback;", "mActivity", "Landroid/support/v7/app/AppCompatActivity;", "mModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "mParentView", "Landroid/widget/FrameLayout;", "mInitialAudioParam", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "(Landroid/support/v7/app/AppCompatActivity;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Landroid/widget/FrameLayout;Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;)V", "isShowing", "", "mAudioItemAdapter", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemAdapter;", "mBottomSheetLayout", "Landroid/view/View;", "mGuidePresenter", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/IAudioEffectGuidePresenter;", "mHintText", "Landroid/widget/TextView;", "mTrackType", "", "mTransitionListener", "Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener;", "mVEEditor", "Lcom/ss/android/vesdk/VEEditor;", "getMVEEditor", "()Lcom/ss/android/vesdk/VEEditor;", "setMVEEditor", "(Lcom/ss/android/vesdk/VEEditor;)V", "mView", "mVoiceConversionTransition", "Lcom/ss/android/ugc/aweme/filter/ChooseFilterTransition;", "mVoiceList", "Landroid/support/v7/widget/RecyclerView;", "attachLifecycle", "", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "buildVoiceList", "hide", "init", "activity", "root", "initData", "initViews", "onDestroy", "onResume", "onShowHint", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "setTransitionListener", "transitionListener", "show", "updateVoiceEffectList", "model", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "fromNet", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AudioEffectModule implements LifecycleObserver, g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3939a;
    public static final a p = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f3940b;

    /* renamed from: c  reason: collision with root package name */
    public View f3941c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f3942d;

    /* renamed from: e  reason: collision with root package name */
    public View f3943e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f3944f;
    public com.ss.android.ugc.aweme.filter.b g;
    public f h;
    public AudioItemAdapter i;
    public com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d j;
    @Nullable
    public p k;
    public final AppCompatActivity l;
    public final cb m;
    public final FrameLayout n;
    public final AudioEffectParam o;
    private int q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectModule$Companion;", "", "()V", "AUDIO", "", "DEFAULT_TRACK_TYPE", "", "VIDEO", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectModule$buildVoiceList$1", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$OnVoiceListLoadListener;", "onVoiceListLoadFailed", "", "code", "", "msg", "", "onVoiceListLoaded", "model", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "onVoiceListLoading", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements c.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AudioEffectModule f66994b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66995a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f66996b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CategoryPageModel f66997c;

            a(b bVar, CategoryPageModel categoryPageModel) {
                this.f66996b = bVar;
                this.f66997c = categoryPageModel;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f66995a, false, 76630, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66995a, false, 76630, new Class[0], Void.TYPE);
                    return;
                }
                this.f66996b.f66994b.a(this.f66997c, true);
            }
        }

        public final void a(int i, @NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f66993a, false, 76628, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f66993a, false, 76628, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "msg");
        }

        b(AudioEffectModule audioEffectModule) {
            this.f66994b = audioEffectModule;
        }

        public final void a(@Nullable CategoryPageModel categoryPageModel) {
            if (PatchProxy.isSupport(new Object[]{categoryPageModel}, this, f66993a, false, 76629, new Class[]{CategoryPageModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{categoryPageModel}, this, f66993a, false, 76629, new Class[]{CategoryPageModel.class}, Void.TYPE);
                return;
            }
            RecyclerView recyclerView = this.f66994b.f3944f;
            if (recyclerView != null) {
                recyclerView.post(new a(this, categoryPageModel));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectModule$init$1", "Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener$DefaultTransitionListener;", "onHideEnd", "", "onHidePre", "onHiding", "franc", "", "start", "", "end", "onShowEnd", "onShowPre", "onShowing", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AudioEffectModule f66999b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f66998a, false, 76631, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66998a, false, 76631, new Class[0], Void.TYPE);
                return;
            }
            this.f66999b.f3940b = true;
            f fVar = this.f66999b.h;
            if (fVar != null) {
                fVar.a();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f66998a, false, 76633, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66998a, false, 76633, new Class[0], Void.TYPE);
                return;
            }
            f fVar = this.f66999b.h;
            if (fVar != null) {
                fVar.b();
            }
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f66998a, false, 76634, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66998a, false, 76634, new Class[0], Void.TYPE);
                return;
            }
            f fVar = this.f66999b.h;
            if (fVar != null) {
                fVar.c();
            }
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f66998a, false, 76636, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66998a, false, 76636, new Class[0], Void.TYPE);
                return;
            }
            this.f66999b.f3940b = false;
            f fVar = this.f66999b.h;
            if (fVar != null) {
                fVar.d();
            }
        }

        public c(AudioEffectModule audioEffectModule) {
            this.f66999b = audioEffectModule;
        }

        public final void a(float f2, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f66998a, false, 76632, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f66998a, false, 76632, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            f fVar = this.f66999b.h;
            if (fVar != null) {
                fVar.a(f2, i, i2);
            }
        }

        public final void b(float f2, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f66998a, false, 76635, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f66998a, false, 76635, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            f fVar = this.f66999b.h;
            if (fVar != null) {
                fVar.b(f2, i, i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AudioEffectModule f67001b;

        public d(AudioEffectModule audioEffectModule) {
            this.f67001b = audioEffectModule;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f67000a, false, 76637, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f67000a, false, 76637, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            AudioEffectModule audioEffectModule = this.f67001b;
            if (PatchProxy.isSupport(new Object[0], audioEffectModule, AudioEffectModule.f3939a, false, 76621, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], audioEffectModule, AudioEffectModule.f3939a, false, 76621, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.filter.b bVar = audioEffectModule.g;
            if (bVar != null) {
                bVar.b(new com.ss.android.ugc.aweme.shortvideo.sticker.c.c());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectModule$show$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/transition/EmptyTransition;", "onShowPre", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends com.ss.android.ugc.aweme.shortvideo.sticker.c.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AudioEffectModule f67003b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f67002a, false, 76638, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67002a, false, 76638, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f67003b.f3941c;
            if (view != null) {
                view.setVisibility(0);
            }
            super.a();
        }

        public e(AudioEffectModule audioEffectModule) {
            this.f67003b = audioEffectModule;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3939a, false, 76625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3939a, false, 76625, new Class[0], Void.TYPE);
            return;
        }
        a(b.f67057c.a(), false);
        c.f67064f.a().a((c.f) new b(this));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3939a, false, 76618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3939a, false, 76618, new Class[0], Void.TYPE);
            return;
        }
        c a2 = c.f67064f.a();
        if (PatchProxy.isSupport(new Object[]{1}, a2, c.f67060a, false, 76603, new Class[]{Integer.TYPE}, Void.TYPE)) {
            c cVar = a2;
            PatchProxy.accessDispatch(new Object[]{1}, cVar, c.f67060a, false, 76603, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            f c2 = c.f67064f.c();
            if (PatchProxy.isSupport(new Object[]{1}, c2, f.f67075a, false, 76682, new Class[]{Integer.TYPE}, Void.TYPE)) {
                f fVar = c2;
                PatchProxy.accessDispatch(new Object[]{1}, fVar, f.f67075a, false, 76682, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                c2.f67076b.trimToSize(1);
            }
        }
        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
    }

    public final void a(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f3939a, false, 76627, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, f3939a, false, 76627, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d dVar = this.j;
        if (dVar != null) {
            dVar.a(effect2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(CategoryPageModel categoryPageModel, boolean z) {
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        if (PatchProxy.isSupport(new Object[]{categoryPageModel2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3939a, false, 76626, new Class[]{CategoryPageModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{categoryPageModel2, Byte.valueOf(z)}, this, f3939a, false, 76626, new Class[]{CategoryPageModel.class, Boolean.TYPE}, Void.TYPE);
        } else if (categoryPageModel2 != null) {
            AudioItemAdapter audioItemAdapter = this.i;
            if (audioItemAdapter != null) {
                audioItemAdapter.a(categoryPageModel2, z);
            }
        }
    }

    public AudioEffectModule(@NotNull AppCompatActivity appCompatActivity, @Nullable cb cbVar, @NotNull FrameLayout frameLayout, @Nullable AudioEffectParam audioEffectParam) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "mActivity");
        Intrinsics.checkParameterIsNotNull(frameLayout, "mParentView");
        this.l = appCompatActivity;
        this.m = cbVar;
        this.n = frameLayout;
        this.o = audioEffectParam;
        this.q = 1;
        this.q = a.a(this.m);
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.l).get(VEVideoPublishEditViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(mA…ditViewModel::class.java)");
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = (VEVideoPublishEditViewModel) viewModel;
        if (vEVideoPublishEditViewModel != null) {
            MutableLiveData<AudioEffectParam> c2 = vEVideoPublishEditViewModel.c();
            if (c2 != null) {
                c2.observe(this.l, new Observer<AudioEffectParam>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AudioEffectModule f66992a;

                    {
                        this.f66992a = r1;
                    }

                    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                        AudioEffectParam audioEffectParam = (AudioEffectParam) obj;
                        cb cbVar = this.f66992a.m;
                        if (cbVar != null) {
                            cbVar.veAudioEffectParam = audioEffectParam;
                        }
                    }
                });
            }
        }
    }
}
