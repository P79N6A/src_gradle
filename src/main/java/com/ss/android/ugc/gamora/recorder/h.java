package com.ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.MvTemplateView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0016\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordMVScene;", "Lcom/bytedance/scene/Scene;", "()V", "mvTemplateModule", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/MvTemplateModule;", "mvTemplateView", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/MvTemplateView;", "mvViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordMVViewModel;", "owner", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;", "hide", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "show", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends com.bytedance.scene.e {
    public static final a j = new a((byte) 0);
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.a i;
    private RecordMVViewModel k;
    private ShortVideoRecordingOperationPanelFragment l;
    private MvTemplateView m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordMVScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f77654a;

        b(h hVar) {
            this.f77654a = hVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            h.a(this.f77654a).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f77655a;

        c(h hVar) {
            this.f77655a = hVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.a a2 = h.a(this.f77655a);
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, "it!!");
            a2.b(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f77656a;

        d(h hVar) {
            this.f77656a = hVar;
        }

        public final void onChanged(@Nullable Object obj) {
            h.a(this.f77656a).b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f77657a;

        e(h hVar) {
            this.f77657a = hVar;
        }

        public final void onChanged(@Nullable Object obj) {
            h.a(this.f77657a).c();
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.a a(h hVar) {
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.a aVar = hVar.i;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mvTemplateModule");
        }
        return aVar;
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Activity s = s();
        if (s != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) s).get(RecordMVViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(re…dMVViewModel::class.java)");
            this.k = (RecordMVViewModel) viewModel;
            Object a2 = w().a("owner");
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            this.l = (ShortVideoRecordingOperationPanelFragment) a2;
            View a3 = a((int) C0906R.id.bp7);
            Intrinsics.checkExpressionValueIsNotNull(a3, "findViewById(R.id.mvtemplate_view)");
            this.m = (MvTemplateView) a3;
            Activity s2 = s();
            if (s2 != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) s2;
                MvTemplateView mvTemplateView = this.m;
                if (mvTemplateView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvTemplateView");
                }
                this.i = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a(fragmentActivity, mvTemplateView);
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a aVar = this.i;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvTemplateModule");
                }
                RecordMVViewModel recordMVViewModel = this.k;
                if (recordMVViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvViewModel");
                }
                aVar.a(recordMVViewModel.f77601a);
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a aVar2 = this.i;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvTemplateModule");
                }
                RecordMVViewModel recordMVViewModel2 = this.k;
                if (recordMVViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvViewModel");
                }
                aVar2.a(recordMVViewModel2.f77602b);
                RecordMVViewModel recordMVViewModel3 = this.k;
                if (recordMVViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvViewModel");
                }
                LifecycleOwner lifecycleOwner = this;
                recordMVViewModel3.f77603c.observe(lifecycleOwner, new b(this));
                RecordMVViewModel recordMVViewModel4 = this.k;
                if (recordMVViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvViewModel");
                }
                recordMVViewModel4.f77604d.observe(lifecycleOwner, new c(this));
                RecordMVViewModel recordMVViewModel5 = this.k;
                if (recordMVViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvViewModel");
                }
                recordMVViewModel5.f77605e.observe(lifecycleOwner, new d(this));
                RecordMVViewModel recordMVViewModel6 = this.k;
                if (recordMVViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mvViewModel");
                }
                recordMVViewModel6.f77606f.observe(lifecycleOwner, new e(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.aq2, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
