package com.ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.b.a.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountDownModule;
import com.ss.android.ugc.aweme.shortvideo.countdown.h;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.tools.ae;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordCountDownScene;", "Lcom/bytedance/scene/Scene;", "()V", "countDownModule", "Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownModule;", "countDownViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordCountDownViewModel;", "owner", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends e {
    public ShortVideoRecordingOperationPanelFragment i;
    public RecordCountDownViewModel j;
    public CountDownModule k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/gamora/recorder/RecordCountDownScene$onActivityCreated$1", "Lcom/ss/android/ugc/aweme/shortvideo/countdown/ICountDownView$OnCountDownAnimListener;", "onEndCountDownAnim", "", "onStartCountDownAnim", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f77650a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShortVideoContextViewModel f77651b;

        public final void a() {
            this.f77651b.a(true);
            f.a(this.f77650a).f77599a.setValue(Unit.INSTANCE);
        }

        public final void b() {
            this.f77650a.f22097e.c();
            f.a(this.f77650a).f77600b.setValue(Unit.INSTANCE);
            this.f77651b.a(false);
            this.f77651b.a((long) f.b(this.f77650a).f3901e);
        }

        a(f fVar, ShortVideoContextViewModel shortVideoContextViewModel) {
            this.f77650a = fVar;
            this.f77651b = shortVideoContextViewModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "get"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements d<JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f77652a;

        b(f fVar) {
            this.f77652a = fVar;
        }

        public final /* synthetic */ Object a() {
            return f.c(this.f77652a).t();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/gamora/recorder/RecordCountDownScene$onActivityCreated$3", "Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownModule$OnVisibilityListener;", "onDismiss", "", "onShow", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements CountDownModule.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f77653a;

        public final void a() {
            f.c(this.f77653a).k().a((Object) f.b(this.f77653a), (bc) new ae(f.b(this.f77653a), 0));
        }

        public final void b() {
            if (!f.b(this.f77653a).b()) {
                bd k = f.c(this.f77653a).k();
                if (k == null) {
                    Intrinsics.throwNpe();
                }
                k.a((Object) f.c(this.f77653a), (bc) new ae(f.b(this.f77653a), 4));
            }
        }

        c(f fVar) {
            this.f77653a = fVar;
        }
    }

    public static final /* synthetic */ RecordCountDownViewModel a(f fVar) {
        RecordCountDownViewModel recordCountDownViewModel = fVar.j;
        if (recordCountDownViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countDownViewModel");
        }
        return recordCountDownViewModel;
    }

    public static final /* synthetic */ CountDownModule b(f fVar) {
        CountDownModule countDownModule = fVar.k;
        if (countDownModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countDownModule");
        }
        return countDownModule;
    }

    public static final /* synthetic */ ShortVideoRecordingOperationPanelFragment c(f fVar) {
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = fVar.i;
        if (shortVideoRecordingOperationPanelFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("owner");
        }
        return shortVideoRecordingOperationPanelFragment;
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Object a2 = w().a("owner");
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        this.i = (ShortVideoRecordingOperationPanelFragment) a2;
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = this.i;
        if (shortVideoRecordingOperationPanelFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("owner");
        }
        ViewModel viewModel = ViewModelProviders.of(shortVideoRecordingOperationPanelFragment.requireActivity()).get(RecordCountDownViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ow…ownViewModel::class.java)");
        this.j = (RecordCountDownViewModel) viewModel;
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment2 = this.i;
        if (shortVideoRecordingOperationPanelFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("owner");
        }
        ViewModel viewModel2 = ViewModelProviders.of(shortVideoRecordingOperationPanelFragment2.requireActivity()).get(ShortVideoContextViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(ow…extViewModel::class.java)");
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) viewModel2;
        Activity s = s();
        if (s != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) s;
            View view = this.f22094b;
            if (view != null) {
                this.k = new CountDownModule(fragmentActivity, (FrameLayout) view, new a(this, shortVideoContextViewModel), new b(this));
                fh fhVar = shortVideoContextViewModel.f65401b;
                CountDownModule countDownModule = this.k;
                if (countDownModule == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("countDownModule");
                }
                String str = fhVar.f67723f;
                UrlModel urlModel = fhVar.f67722e;
                long j2 = fhVar.n;
                long j3 = (long) fhVar.h;
                long j4 = (long) fhVar.g;
                long j5 = fhVar.f67720c;
                ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment3 = this.i;
                if (shortVideoRecordingOperationPanelFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("owner");
                }
                countDownModule.a(str, urlModel, j2, j3, j4, j5, shortVideoRecordingOperationPanelFragment3.Z, new c(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.apy, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
