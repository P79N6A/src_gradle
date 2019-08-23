package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.vesdk.VEListener;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEVideoPublishEditFragment;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.p;
import dmt.av.video.r;
import dmt.av.video.s;
import dmt.av.video.t;
import dmt.av.video.u;
import dmt.av.video.v;
import dmt.av.video.w;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\"\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010&\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditPreviewScene;", "Lcom/bytedance/scene/Scene;", "()V", "editViewModel", "Lcom/ss/android/ugc/gamora/editor/EditViewModel;", "previewViewModel", "Lcom/ss/android/ugc/gamora/editor/EditPreviewViewModel;", "publishEditFragment", "Ldmt/av/video/VEVideoPublishEditFragment;", "publishEditViewModel", "Ldmt/av/video/VEVideoPublishEditViewModel;", "videoContainer", "Landroid/widget/FrameLayout;", "addPreviewView", "", "view", "Landroid/view/View;", "bindScaleAnimLayout", "layout", "getAutoStartStopArbiter", "Ldmt/av/video/VEEditorAutoStartStopArbiter;", "getLightDetectionDone", "Landroid/arch/lifecycle/MutableLiveData;", "", "getSurfaceLayoutHeight", "", "getSurfaceLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "getSurfaceLayoutWidth", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "setUpVEVideoPublishEditFragment", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends com.bytedance.scene.e {
    public static final a l = new a((byte) 0);
    public VEVideoPublishEditFragment i;
    public EditPreviewViewModel j;
    public FrameLayout k;
    private VEVideoPublishEditViewModel m;
    private EditViewModel n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditPreviewScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.editor.b$b  reason: collision with other inner class name */
    static final class C0815b<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77561a;

        C0815b(b bVar) {
            this.f77561a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                FrameLayout frameLayout = this.f77561a.k;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
                }
                Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                frameLayout.setBackgroundColor(num.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRendered"}, k = 3, mv = {1, 1, 15})
    static final class c implements VEListener.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77562a;

        c(b bVar) {
            this.f77562a = bVar;
        }

        public final void a() {
            b.a(this.f77562a).a().postValue(Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/gamora/editor/EditPreviewScene$setUpVEVideoPublishEditFragment$2", "Ldmt/av/video/VEVideoPublishEditFragment$VEViewScaleListener;", "scale", "", "op", "Ldmt/av/video/VEPreviewScaleOp;", "op2", "Ldmt/av/video/VEPreviewScaleOpV2;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements VEVideoPublishEditFragment.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77563a;

        d(b bVar) {
            this.f77563a = bVar;
        }

        public final void a(@Nullable v vVar) {
            b.a(this.f77563a).b().setValue(vVar);
        }

        public final void a(@Nullable w wVar) {
            b.a(this.f77563a).c().setValue(wVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77564a;

        e(b bVar) {
            this.f77564a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            b.a(this.f77564a).d().setValue(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77565a;

        f(b bVar) {
            this.f77565a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                ImageView imageView = b.b(this.f77565a).g;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "publishEditFragment.firstFrameView");
                Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/graphics/Bitmap;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77566a;

        g(b bVar) {
            this.f77566a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                b.b(this.f77566a).g.setImageBitmap(bitmap);
            }
        }
    }

    public final int b() {
        VEVideoPublishEditFragment vEVideoPublishEditFragment = this.i;
        if (vEVideoPublishEditFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
        }
        SurfaceView surfaceView = vEVideoPublishEditFragment.f82765f;
        Intrinsics.checkExpressionValueIsNotNull(surfaceView, "publishEditFragment.surfaceView");
        return surfaceView.getWidth();
    }

    public final int c() {
        VEVideoPublishEditFragment vEVideoPublishEditFragment = this.i;
        if (vEVideoPublishEditFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
        }
        SurfaceView surfaceView = vEVideoPublishEditFragment.f82765f;
        Intrinsics.checkExpressionValueIsNotNull(surfaceView, "publishEditFragment.surfaceView");
        return surfaceView.getHeight();
    }

    @NotNull
    public final ViewGroup.MarginLayoutParams a() {
        VEVideoPublishEditFragment vEVideoPublishEditFragment = this.i;
        if (vEVideoPublishEditFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
        }
        SurfaceView surfaceView = vEVideoPublishEditFragment.f82765f;
        Intrinsics.checkExpressionValueIsNotNull(surfaceView, "publishEditFragment.surfaceView");
        ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
        if (layoutParams != null) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Nullable
    public final VEEditorAutoStartStopArbiter d() {
        Activity activity = this.f22093a;
        if (activity != null) {
            Fragment findFragmentById = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentById(C0906R.id.bg2);
            if (findFragmentById == null) {
                return null;
            }
            if (findFragmentById != null) {
                return ((VEVideoPublishEditFragment) findFragmentById).a();
            }
            throw new TypeCastException("null cannot be cast to non-null type dmt.av.video.VEVideoPublishEditFragment");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public static final /* synthetic */ EditPreviewViewModel a(b bVar) {
        EditPreviewViewModel editPreviewViewModel = bVar.j;
        if (editPreviewViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewViewModel");
        }
        return editPreviewViewModel;
    }

    public static final /* synthetic */ VEVideoPublishEditFragment b(b bVar) {
        VEVideoPublishEditFragment vEVideoPublishEditFragment = bVar.i;
        if (vEVideoPublishEditFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
        }
        return vEVideoPublishEditFragment;
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "layout");
        Activity activity = this.f22093a;
        if (activity != null) {
            Fragment findFragmentById = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentById(C0906R.id.bg2);
            if (findFragmentById == null) {
                return;
            }
            if (findFragmentById != null) {
                ((VEVideoPublishEditFragment) findFragmentById).a(view);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type dmt.av.video.VEVideoPublishEditFragment");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void e(@Nullable Bundle bundle) {
        super.e(bundle);
        Activity activity = this.f22093a;
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(VEVideoPublishEditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.m = (VEVideoPublishEditViewModel) viewModel;
            Activity activity2 = this.f22093a;
            if (activity2 != null) {
                ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) activity2).get(EditPreviewViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(ac…iewViewModel::class.java)");
                this.j = (EditPreviewViewModel) viewModel2;
                Activity activity3 = this.f22093a;
                if (activity3 != null) {
                    ViewModel viewModel3 = ViewModelProviders.of((FragmentActivity) activity3).get(EditViewModel.class);
                    Intrinsics.checkExpressionValueIsNotNull(viewModel3, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                    this.n = (EditViewModel) viewModel3;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view, bundle);
        View a2 = a((int) C0906R.id.bg2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "findViewById(R.id.ll_container)");
        this.k = (FrameLayout) a2;
        EditPreviewViewModel editPreviewViewModel = this.j;
        if (editPreviewViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewViewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        editPreviewViewModel.g().observe(lifecycleOwner, new C0815b(this));
        Activity activity = this.f22093a;
        if (activity != null) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            Fragment findFragmentById = supportFragmentManager.findFragmentById(C0906R.id.bg2);
            if (findFragmentById != null) {
                this.i = (VEVideoPublishEditFragment) findFragmentById;
            } else {
                VEVideoPublishEditFragment a3 = VEVideoPublishEditFragment.a((u) null);
                Intrinsics.checkExpressionValueIsNotNull(a3, "VEVideoPublishEditFragment.newInstance(null)");
                this.i = a3;
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                VEVideoPublishEditFragment vEVideoPublishEditFragment = this.i;
                if (vEVideoPublishEditFragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
                }
                beginTransaction.add((int) C0906R.id.bg2, (Fragment) vEVideoPublishEditFragment).commit();
            }
            VEVideoPublishEditFragment vEVideoPublishEditFragment2 = this.i;
            if (vEVideoPublishEditFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            EditViewModel editViewModel = this.n;
            if (editViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
            }
            vEVideoPublishEditFragment2.a(editViewModel.b().videoEditorType, (VEListener.k) new c(this));
            VEVideoPublishEditFragment vEVideoPublishEditFragment3 = this.i;
            if (vEVideoPublishEditFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            EditViewModel editViewModel2 = this.n;
            if (editViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
            }
            vEVideoPublishEditFragment3.a(editViewModel2.a());
            VEVideoPublishEditFragment vEVideoPublishEditFragment4 = this.i;
            if (vEVideoPublishEditFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            vEVideoPublishEditFragment4.f82764e = new d(this);
            VEVideoPublishEditFragment vEVideoPublishEditFragment5 = this.i;
            if (vEVideoPublishEditFragment5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.m;
            if (vEVideoPublishEditViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment5.a((LiveData<u>) vEVideoPublishEditViewModel.a());
            VEVideoPublishEditFragment vEVideoPublishEditFragment6 = this.i;
            if (vEVideoPublishEditFragment6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.m;
            if (vEVideoPublishEditViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment6.b((LiveData<t>) vEVideoPublishEditViewModel2.d());
            VEVideoPublishEditFragment vEVideoPublishEditFragment7 = this.i;
            if (vEVideoPublishEditFragment7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = this.m;
            if (vEVideoPublishEditViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment7.f82761b = vEVideoPublishEditViewModel3.e();
            VEVideoPublishEditFragment vEVideoPublishEditFragment8 = this.i;
            if (vEVideoPublishEditFragment8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel4 = this.m;
            if (vEVideoPublishEditViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment8.f82762c = vEVideoPublishEditViewModel4.f();
            VEVideoPublishEditFragment vEVideoPublishEditFragment9 = this.i;
            if (vEVideoPublishEditFragment9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel5 = this.m;
            if (vEVideoPublishEditViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment9.b(vEVideoPublishEditViewModel5.c());
            VEVideoPublishEditFragment vEVideoPublishEditFragment10 = this.i;
            if (vEVideoPublishEditFragment10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel6 = this.m;
            if (vEVideoPublishEditViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment10.a(vEVideoPublishEditViewModel6.b());
            VEVideoPublishEditFragment vEVideoPublishEditFragment11 = this.i;
            if (vEVideoPublishEditFragment11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel7 = this.m;
            if (vEVideoPublishEditViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment11.c(vEVideoPublishEditViewModel7.k());
            VEVideoPublishEditFragment vEVideoPublishEditFragment12 = this.i;
            if (vEVideoPublishEditFragment12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel8 = this.m;
            if (vEVideoPublishEditViewModel8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment12.e((LiveData<p>) vEVideoPublishEditViewModel8.l());
            VEVideoPublishEditFragment vEVideoPublishEditFragment13 = this.i;
            if (vEVideoPublishEditFragment13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel9 = this.m;
            if (vEVideoPublishEditViewModel9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment13.d((LiveData<s>) vEVideoPublishEditViewModel9.m());
            VEVideoPublishEditFragment vEVideoPublishEditFragment14 = this.i;
            if (vEVideoPublishEditFragment14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel10 = this.m;
            if (vEVideoPublishEditViewModel10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment14.a(vEVideoPublishEditViewModel10.f82809c);
            VEVideoPublishEditFragment vEVideoPublishEditFragment15 = this.i;
            if (vEVideoPublishEditFragment15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel11 = this.m;
            if (vEVideoPublishEditViewModel11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment15.b(vEVideoPublishEditViewModel11.n());
            VEVideoPublishEditFragment vEVideoPublishEditFragment16 = this.i;
            if (vEVideoPublishEditFragment16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel12 = this.m;
            if (vEVideoPublishEditViewModel12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment16.d(vEVideoPublishEditViewModel12.o());
            VEVideoPublishEditFragment vEVideoPublishEditFragment17 = this.i;
            if (vEVideoPublishEditFragment17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel13 = this.m;
            if (vEVideoPublishEditViewModel13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment17.f((LiveData<r>) vEVideoPublishEditViewModel13.p());
            VEVideoPublishEditFragment vEVideoPublishEditFragment18 = this.i;
            if (vEVideoPublishEditFragment18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel14 = this.m;
            if (vEVideoPublishEditViewModel14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment18.e(vEVideoPublishEditViewModel14.q());
            VEVideoPublishEditFragment vEVideoPublishEditFragment19 = this.i;
            if (vEVideoPublishEditFragment19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel15 = this.m;
            if (vEVideoPublishEditViewModel15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment19.c(vEVideoPublishEditViewModel15.t());
            VEVideoPublishEditFragment vEVideoPublishEditFragment20 = this.i;
            if (vEVideoPublishEditFragment20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel16 = this.m;
            if (vEVideoPublishEditViewModel16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditViewModel");
            }
            vEVideoPublishEditFragment20.f(vEVideoPublishEditViewModel16.r());
            VEVideoPublishEditFragment vEVideoPublishEditFragment21 = this.i;
            if (vEVideoPublishEditFragment21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishEditFragment");
            }
            vEVideoPublishEditFragment21.b().observe(lifecycleOwner, new e(this));
            EditPreviewViewModel editPreviewViewModel2 = this.j;
            if (editPreviewViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewViewModel");
            }
            editPreviewViewModel2.e().observe(lifecycleOwner, new f(this));
            EditPreviewViewModel editPreviewViewModel3 = this.j;
            if (editPreviewViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewViewModel");
            }
            editPreviewViewModel3.f().observe(lifecycleOwner, new g(this));
            if (this.j == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewViewModel");
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.acr, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…review, container, false)");
        return inflate;
    }
}
