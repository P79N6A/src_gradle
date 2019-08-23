package com.ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.a.c;
import com.bytedance.scene.group.e;
import com.bytedance.scene.i;
import com.bytedance.scene.navigation.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.CutMusicModule;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u000223B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\"\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordRootScene;", "Lcom/bytedance/scene/group/InheritedScene;", "()V", "chooseVideoModeViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ui/viewmodel/ChooseVideoModeViewModel;", "getChooseVideoModeViewModel", "()Lcom/ss/android/ugc/aweme/shortvideo/ui/viewmodel/ChooseVideoModeViewModel;", "setChooseVideoModeViewModel", "(Lcom/ss/android/ugc/aweme/shortvideo/ui/viewmodel/ChooseVideoModeViewModel;)V", "cutMusicModule", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/CutMusicModule;", "getCutMusicModule", "()Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/CutMusicModule;", "setCutMusicModule", "(Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/CutMusicModule;)V", "liveModule", "Lcom/ss/android/ugc/aweme/port/internal/ILiveModule;", "getLiveModule", "()Lcom/ss/android/ugc/aweme/port/internal/ILiveModule;", "setLiveModule", "(Lcom/ss/android/ugc/aweme/port/internal/ILiveModule;)V", "mainContentView", "Landroid/view/View;", "getMainContentView", "()Landroid/view/View;", "setMainContentView", "(Landroid/view/View;)V", "normalGroupScene", "Lcom/ss/android/ugc/gamora/recorder/NormalGroupScene;", "getNormalGroupScene", "()Lcom/ss/android/ugc/gamora/recorder/NormalGroupScene;", "setNormalGroupScene", "(Lcom/ss/android/ugc/gamora/recorder/NormalGroupScene;)V", "owner", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;", "getOwner", "()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;", "setOwner", "(Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;)V", "recordViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "container", "Companion", "MoreCommandsNavigationListener", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j extends e {
    public static final a q = new a((byte) 0);
    @NotNull
    public ShortVideoRecordingOperationPanelFragment k;
    @NotNull
    public View l;
    @NotNull
    public com.ss.android.ugc.aweme.shortvideo.ui.a.b m;
    @NotNull
    public com.ss.android.ugc.aweme.port.internal.b n;
    @NotNull
    public CutMusicModule o;
    @NotNull
    public c p;
    private RecordViewModel r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordRootScene$Companion;", "", "()V", "CUT_MUSIC_CONTEXT", "", "LIVE_CONTEXT", "OWNER_CONTEXT", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordRootScene$MoreCommandsNavigationListener;", "Lcom/bytedance/scene/navigation/NavigationListener;", "(Lcom/ss/android/ugc/gamora/recorder/RecordRootScene;)V", "navigationChange", "", "from", "Lcom/bytedance/scene/Scene;", "to", "isPush", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class b implements d {
        public b() {
        }

        public final void a(@Nullable com.bytedance.scene.e eVar, @NotNull com.bytedance.scene.e eVar2, boolean z) {
            Intrinsics.checkParameterIsNotNull(eVar2, "to");
            if (z) {
                if (eVar2 instanceof b) {
                    com.ss.android.ugc.aweme.shortvideo.transition.a.f70438a = true;
                    j.this.b((com.bytedance.scene.e) j.this.b());
                    j.this.a().setVisibility(8);
                    com.ss.android.ugc.aweme.shortvideo.transition.a.f70438a = false;
                }
            } else if (eVar instanceof b) {
                com.ss.android.ugc.aweme.shortvideo.transition.a.f70438a = true;
                j.this.a().setVisibility(0);
                j.this.c(j.this.b());
                com.ss.android.ugc.aweme.shortvideo.transition.a.f70438a = false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f77659a;

        c(j jVar) {
            this.f77659a = jVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.f77659a.f22097e.a(b.class, (Bundle) null, new c.a().a(true).a((com.bytedance.scene.animation.c) new com.bytedance.scene.animation.a.b()).a());
                } else {
                    this.f77659a.f22097e.c();
                }
            }
        }
    }

    @NotNull
    public final View a() {
        View view = this.l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContentView");
        }
        return view;
    }

    @NotNull
    public final c b() {
        c cVar = this.p;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalGroupScene");
        }
        return cVar;
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Activity activity = this.f22093a;
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(RecordViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ordViewModel::class.java)");
            this.r = (RecordViewModel) viewModel;
            com.bytedance.scene.navigation.e eVar = this.f22097e;
            Intrinsics.checkExpressionValueIsNotNull(eVar, "navigationScene");
            i w = eVar.w();
            ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = this.k;
            if (shortVideoRecordingOperationPanelFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("owner");
            }
            w.a("owner", shortVideoRecordingOperationPanelFragment);
            com.bytedance.scene.navigation.e eVar2 = this.f22097e;
            Intrinsics.checkExpressionValueIsNotNull(eVar2, "navigationScene");
            i w2 = eVar2.w();
            com.ss.android.ugc.aweme.port.internal.b bVar = this.n;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveModule");
            }
            w2.a("live", bVar);
            com.bytedance.scene.navigation.e eVar3 = this.f22097e;
            Intrinsics.checkExpressionValueIsNotNull(eVar3, "navigationScene");
            i w3 = eVar3.w();
            CutMusicModule cutMusicModule = this.o;
            if (cutMusicModule == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cutMusicModule");
            }
            w3.a("cut_music", cutMusicModule);
            this.f22097e.a(getLifecycle(), (d) new b());
            this.p = new c();
            c cVar = this.p;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("normalGroupScene");
            }
            a((int) C0906R.id.cbv, (com.bytedance.scene.e) cVar, "NormalGroupScene");
            RecordViewModel recordViewModel = this.r;
            if (recordViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel.f77631a.observe(this.f22097e, new c(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final ViewGroup a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.ace, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final /* bridge */ /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return a(layoutInflater, viewGroup);
    }
}
