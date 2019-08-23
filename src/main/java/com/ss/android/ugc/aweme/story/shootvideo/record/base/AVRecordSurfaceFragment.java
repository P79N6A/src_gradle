package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.port.in.m;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.shortvideo.widget.ScreenSizeAspectFrameLayout;
import com.ss.android.ugc.aweme.story.shootvideo.record.p;
import com.ss.android.vesdk.ai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.k;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007H\u0014J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0007H\u0014J\b\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007H\u0002J\b\u0010)\u001a\u00020\u001aH\u0016J\u0010\u0010*\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0007H\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u0007H\u0014J\b\u0010-\u001a\u00020.H%J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0003H\u0016J\u0012\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\"\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u00020\"2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J&\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010C\u001a\u00020\"H\u0016J\u0018\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020\"H\u0014J\b\u0010I\u001a\u00020\"H\u0014J\b\u0010J\u001a\u00020\"H\u0016J\b\u0010K\u001a\u00020\"H$J\b\u0010L\u001a\u00020\"H\u0016J\b\u0010M\u001a\u00020\"H\u0016J\b\u0010N\u001a\u00020\"H\u0016J\b\u0010O\u001a\u00020\"H\u0016J\u0010\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020\"H\u0016J\u001a\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020>2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010V\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0007H\u0002J\b\u0010W\u001a\u00020XH$J\b\u0010Y\u001a\u00020ZH$J\b\u0010[\u001a\u00020\\H$J\u0010\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\u0016H\u0016J\u0010\u0010_\u001a\u00020\"2\u0006\u0010^\u001a\u00020\u0018H\u0016J\u0012\u0010`\u001a\u00020\"2\b\b\u0002\u0010a\u001a\u00020\u0007H\u0004J\b\u0010b\u001a\u00020\"H\u0014J\u0010\u0010c\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020'0eH\u0016J\b\u0010f\u001a\u00020gH\u0016J \u0010h\u001a\u00020\"2\b\b\u0002\u0010i\u001a\u00020.2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\"0kH\u0002J\u0010\u0010l\u001a\u00020\"2\u0006\u0010^\u001a\u00020\u0016H\u0016J\u0010\u0010m\u001a\u00020\"2\u0006\u0010^\u001a\u00020\u0018H\u0016J\u0018\u0010n\u001a\u00020\"2\u0006\u0010o\u001a\u00020.2\u0006\u0010p\u001a\u00020.H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00078@X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u000e\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordSurfaceFragment;", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;", "Lcom/ss/android/ugc/aweme/base/activity/ListenableActivityRegistry;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/SurfaceStateListener;", "()V", "isActivityCreated", "", "()Z", "setActivityCreated", "(Z)V", "isCameraInit", "isCameraOnStopReleased", "isFirstCreate", "isUsingSurfaceView", "isUsingSurfaceView$tools_story_impl_douyinCnRelease", "isUsingSurfaceView$delegate", "Lkotlin/Lazy;", "isVisibleToUser", "setVisibleToUser", "mActivityOnKeyDownListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "mActivityResultListener", "Lcom/ss/android/ugc/aweme/base/activity/ActivityResultListener;", "recordRootView", "Landroid/widget/FrameLayout;", "requestDataNeeded", "getRequestDataNeeded", "setRequestDataNeeded", "surfaceCreated", "surfaceSizeLayout", "Lcom/ss/android/ugc/aweme/shortvideo/widget/ScreenSizeAspectFrameLayout;", "afterCameraClosed", "", "destroyAll", "beforeCameraOpen", "isReopen", "buildShootWayExtra", "Lorg/json/JSONObject;", "closeCameraOnHide", "contentView", "doRealCameraOpen", "enableRecord", "isEnable", "layoutRes", "", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "listenableActivityRegistry", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onPageClosed", "onPageOpen", "onPause", "onRequestPermissionFailed", "onResume", "onStart", "onStop", "onSurfaceAvailable", "onSurfaceChanged", "surface", "Landroid/view/Surface;", "onSurfaceDestroy", "onViewCreated", "view", "openCameraOnShow", "permissionChecker", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/PermissionChecker;", "recordController", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "recordModulesPresenter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;", "registerActivityOnKeyDownListener", "listener", "registerActivityResultListener", "requestEffectData", "useCacheFirst", "requestPageInfoBeforeCameraOpen", "setUserVisibleHint", "shootWaySupplier", "Lcom/ss/android/ugc/aweme/base/fp/compat/SupplierC;", "shortVideoContextViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;", "tryRequestDataOnDeviceIdReady", "waitSeconds", "action", "Lkotlin/Function0;", "unRegisterActivityOnKeyDownListener", "unRegisterActivityResultListener", "updateLayout", "videoWidth", "videoHeight", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class AVRecordSurfaceFragment extends ShortVideoRecordingOperationPanelFragment implements com.ss.android.ugc.aweme.base.activity.e, c, p {
    public static ChangeQuickRedirect n;
    static final /* synthetic */ KProperty[] o = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AVRecordSurfaceFragment.class), "isUsingSurfaceView", "isUsingSurfaceView$tools_story_impl_douyinCnRelease()Z"))};

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f73862a;

    /* renamed from: b  reason: collision with root package name */
    private ScreenSizeAspectFrameLayout f73863b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.ss.android.ugc.aweme.base.activity.b> f73864c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<com.ss.android.ugc.aweme.base.activity.a> f73865d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f73866e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f73867f;
    private boolean g;
    private boolean h;
    @NotNull
    private final Lazy i = LazyKt.lazy(c.INSTANCE);
    private HashMap j;
    public boolean p;
    public boolean q;
    public boolean r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AVRecordSurfaceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AVRecordSurfaceFragment aVRecordSurfaceFragment) {
            super(0);
            this.this$0 = aVRecordSurfaceFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85833, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85833, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.m(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AVRecordSurfaceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AVRecordSurfaceFragment aVRecordSurfaceFragment) {
            super(0);
            this.this$0 = aVRecordSurfaceFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85834, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85834, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.m(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Boolean> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(0);
        }

        public final boolean invoke() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85835, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85835, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.StoryPreviewUsingSurfaceView)) {
                m mVar = com.ss.android.ugc.aweme.port.in.a.f61121d;
                Intrinsics.checkExpressionValueIsNotNull(mVar, "AVEnv.APPLICATION_SERVICE");
                if (!mVar.g()) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AVRecordSurfaceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AVRecordSurfaceFragment aVRecordSurfaceFragment) {
            super(1);
            this.this$0 = aVRecordSurfaceFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 85836, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 85836, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            ShortVideoContextViewModel r = this.this$0.r();
            Intrinsics.checkExpressionValueIsNotNull(r, "shortVideoContextViewModel");
            int i2 = r.f65401b.j;
            ShortVideoContextViewModel r2 = this.this$0.r();
            Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
            fb.a(this.this$0.p().a(), (Context) this.this$0.getActivity(), i2, r2.f65401b.k);
            AVRecordSurfaceFragment aVRecordSurfaceFragment = this.this$0;
            ShortVideoContextViewModel r3 = this.this$0.r();
            Intrinsics.checkExpressionValueIsNotNull(r3, "shortVideoContextViewModel");
            int i3 = r3.f65401b.j;
            ShortVideoContextViewModel r4 = this.this$0.r();
            Intrinsics.checkExpressionValueIsNotNull(r4, "shortVideoContextViewModel");
            aVRecordSurfaceFragment.a(i3, r4.f65401b.k);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $isReopen;
        final /* synthetic */ AVRecordSurfaceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AVRecordSurfaceFragment aVRecordSurfaceFragment, boolean z) {
            super(0);
            this.this$0 = aVRecordSurfaceFragment;
            this.$isReopen = z;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85837, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85837, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.l(this.$isReopen);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $useCacheFirst;
        final /* synthetic */ AVRecordSurfaceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AVRecordSurfaceFragment aVRecordSurfaceFragment, boolean z) {
            super(0);
            this.this$0 = aVRecordSurfaceFragment;
            this.$useCacheFirst = z;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85838, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85838, new Class[0], Void.TYPE);
                return;
            }
            if (this.$useCacheFirst) {
                this.this$0.i().p().a(true, this.$useCacheFirst);
            } else {
                w.a();
                this.this$0.i().p().a(true);
            }
            this.this$0.x();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "get"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements com.ss.android.ugc.aweme.base.b.a.d<JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVRecordSurfaceFragment f73869b;

        g(AVRecordSurfaceFragment aVRecordSurfaceFragment) {
            this.f73869b = aVRecordSurfaceFragment;
        }

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f73868a, false, 85839, new Class[0], JSONObject.class)) {
                return this.f73869b.t();
            }
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f73868a, false, 85839, new Class[0], JSONObject.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class h<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f73871b;

        h(int i) {
            this.f73871b = i;
        }

        public final /* synthetic */ Object call() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f73870a, false, 85840, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73870a, false, 85840, new Class[0], Void.TYPE);
            } else {
                while (TextUtils.isEmpty(com.ss.android.d.d.b()) && i < this.f73871b) {
                    i++;
                    Thread.sleep(1000);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class i<TTaskResult, TContinuationResult> implements a.g<Unit, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f73873b;

        i(Function0 function0) {
            this.f73873b = function0;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f73872a, false, 85841, new Class[]{a.i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f73872a, false, 85841, new Class[]{a.i.class}, Void.TYPE);
            } else {
                this.f73873b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public void D() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85832, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.clear();
        }
    }

    public final boolean E() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85799, new Class[0], Boolean.TYPE)) {
            value = PatchProxy.accessDispatch(new Object[0], this, n, false, 85799, new Class[0], Boolean.TYPE);
        } else {
            value = this.i.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @NotNull
    public final LifecycleOwner H() {
        return this;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.base.activity.e J() {
        return this;
    }

    public void g(boolean z) {
    }

    @NotNull
    public abstract a i();

    public void i(boolean z) {
    }

    @NotNull
    public abstract com.ss.android.ugc.aweme.story.shootvideo.record.c j();

    @NotNull
    public abstract d l();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        D();
    }

    public void x() {
    }

    @NotNull
    public final FrameLayout F() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85818, new Class[0], FrameLayout.class)) {
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, n, false, 85818, new Class[0], FrameLayout.class);
        }
        FrameLayout frameLayout = this.f73862a;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordRootView");
        }
        return frameLayout;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.base.b.a.d<JSONObject> G() {
        if (!PatchProxy.isSupport(new Object[0], this, n, false, 85819, new Class[0], com.ss.android.ugc.aweme.base.b.a.d.class)) {
            return new g<>(this);
        }
        return (com.ss.android.ugc.aweme.base.b.a.d) PatchProxy.accessDispatch(new Object[0], this, n, false, 85819, new Class[0], com.ss.android.ugc.aweme.base.b.a.d.class);
    }

    @NotNull
    public final ShortVideoContextViewModel I() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85821, new Class[0], ShortVideoContextViewModel.class)) {
            return (ShortVideoContextViewModel) PatchProxy.accessDispatch(new Object[0], this, n, false, 85821, new Class[0], ShortVideoContextViewModel.class);
        }
        ShortVideoContextViewModel r2 = r();
        Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
        return r2;
    }

    public final void am_() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85816, new Class[0], Void.TYPE);
            return;
        }
        this.g = false;
        if (!this.h) {
            l().a(true);
            f(false);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85815, new Class[0], Void.TYPE);
            return;
        }
        this.g = true;
        e(false);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85812, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (i().D) {
            i().p().b(false);
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85810, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.q) {
            l().a(true);
            i().l().g(true);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85809, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.q) {
            i().l().g(false);
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85811, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        p().a().setVisibility(8);
        this.h = true;
        if (this.g) {
            l().a(true);
            f(false);
        }
    }

    @NotNull
    public final JSONObject t() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85820, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, n, false, 85820, new Class[0], JSONObject.class);
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
        ShortVideoContextViewModel r2 = r();
        Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
        com.ss.android.ugc.aweme.app.d.c a3 = a2.a("shoot_way", r2.f65401b.r).a("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        ShortVideoContextViewModel r3 = r();
        Intrinsics.checkExpressionValueIsNotNull(r3, "shortVideoContextViewModel");
        if (r3.c()) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        JSONObject b2 = a3.a("is_photo", str).a("position", "shoot_page").b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "builder.build()");
        return b2;
    }

    public void v() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85800, new Class[0], Void.TYPE);
            return;
        }
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            ((LifecycleRegistry) lifecycle).handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            Lifecycle lifecycle2 = getLifecycle();
            if (lifecycle2 != null) {
                ((LifecycleRegistry) lifecycle2).handleLifecycleEvent(Lifecycle.Event.ON_START);
                try {
                    ai.a();
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.util.c.a("vesdk.monitorClear:" + e2.getMessage());
                }
                if (this.g) {
                    e(true);
                }
                i().p().b(true);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleRegistry");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleRegistry");
    }

    public void w() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85801, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.END);
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            ((LifecycleRegistry) lifecycle).handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            Lifecycle lifecycle2 = getLifecycle();
            if (lifecycle2 != null) {
                ((LifecycleRegistry) lifecycle2).handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                if (i().D) {
                    f(true);
                    i().p().b(false);
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleRegistry");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleRegistry");
    }

    public void onStart() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, n, false, 85808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 85808, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (!E() && this.f73867f) {
            i(false);
            a i3 = i();
            b bVar = b.STATE_OPEN;
            if (PatchProxy.isSupport(new Object[]{bVar}, i3, a.k, false, 85788, new Class[]{b.class}, Void.TYPE)) {
                a aVar = i3;
                PatchProxy.accessDispatch(new Object[]{bVar}, aVar, a.k, false, 85788, new Class[]{b.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(bVar, "state");
                i3.r.setValue(bVar);
            }
        }
        View a2 = p().a();
        if (!this.q) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        a2.setVisibility(i2);
        this.h = false;
        if (this.g) {
            e(false);
        }
    }

    private final void e(boolean z) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, n, false, 85826, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, n, false, 85826, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.q && this.r && !this.f73867f) {
            com.ss.android.ugc.aweme.util.c.a("StoryRecord\ninit camera called");
            com.ss.android.medialib.camera.g b2 = com.ss.android.medialib.camera.g.b();
            Context context2 = getContext();
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            j.a(b2, context);
            g(false);
            j().a((Function0<Unit>) new e<Unit>(this, z));
        }
    }

    private final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, n, false, 85828, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, n, false, 85828, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.r) {
            if (this.f73867f) {
                this.f73867f = false;
                i().u();
            }
            if (z) {
                this.p = true;
                i().p().b();
            }
        }
    }

    public final void b(@NotNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        com.ss.android.ugc.aweme.base.activity.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, n, false, 85825, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, n, false, 85825, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.f73865d.remove(aVar2);
    }

    public void onAttach(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, n, false, 85803, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, n, false, 85803, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.ugc.aweme.mediachoose.a.d.a(context.getApplicationContext());
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, n, false, 85802, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, n, false, 85802, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z || !isAdded()) {
            z2 = false;
        }
        this.q = z2;
        if (this.r) {
            if (this.q) {
                v();
                return;
            }
            w();
        }
    }

    public final void a(@NotNull Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, n, false, 85817, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, n, false, 85817, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(surface2, "surface");
        if (fc.a()) {
            i().l().b(surface2);
        }
    }

    public final void m(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, n, false, 85830, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, n, false, 85830, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Function0 fVar = new f(this, z);
        if (PatchProxy.isSupport(new Object[]{5, fVar}, this, n, false, 85829, new Class[]{Integer.TYPE, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{5, fVar}, this, n, false, 85829, new Class[]{Integer.TYPE, Function0.class}, Void.TYPE);
            return;
        }
        a.i.a((Callable<TResult>) new h<TResult>(5)).a((a.g<TResult, TContinuationResult>) new i<TResult,TContinuationResult>(fVar), a.i.f1052b);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, n, false, 85806, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, n, false, 85806, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.r = true;
        if (fc.a()) {
            ShortVideoContextViewModel r2 = r();
            Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
            int i2 = r2.f65401b.j;
            ShortVideoContextViewModel r3 = r();
            Intrinsics.checkExpressionValueIsNotNull(r3, "shortVideoContextViewModel");
            fb.a(p().a(), (Context) getActivity(), i2, r3.f65401b.k);
            ShortVideoContextViewModel r4 = r();
            Intrinsics.checkExpressionValueIsNotNull(r4, "shortVideoContextViewModel");
            int i3 = r4.f65401b.j;
            ShortVideoContextViewModel r5 = r();
            Intrinsics.checkExpressionValueIsNotNull(r5, "shortVideoContextViewModel");
            a(i3, r5.f65401b.k);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            new cv(activity).a(cv.a.INSTANCE, new d(this));
            return;
        }
        View a2 = p().a();
        ShortVideoContextViewModel r6 = r();
        Intrinsics.checkExpressionValueIsNotNull(r6, "shortVideoContextViewModel");
        int i4 = r6.f65401b.j;
        ShortVideoContextViewModel r7 = r();
        Intrinsics.checkExpressionValueIsNotNull(r7, "shortVideoContextViewModel");
        fb.a(a2, i4, r7.f65401b.k);
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        com.ss.android.ugc.aweme.base.activity.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, n, false, 85824, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, n, false, 85824, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.f73865d.add(aVar2);
    }

    public final void l(boolean z) {
        Looper looper;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, n, false, 85827, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, n, false, 85827, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.q && this.r && !this.f73867f) {
            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.BEGIN);
            this.f73867f = true;
            if (!this.f73866e && !z) {
                z2 = false;
            }
            i(z2);
            this.f73866e = false;
            if (this.p) {
                this.p = false;
                com.ss.android.ugc.aweme.story.shootvideo.record.a.a.b.f73856c.a("springfestival", new a(this), new b(this));
            }
            a i2 = i();
            if (PatchProxy.isSupport(new Object[0], i2, a.k, false, 85783, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i2, a.k, false, 85783, new Class[0], Void.TYPE);
            } else {
                FaceBeautyInvoker.setNativeInitListener(i2.F);
                if (PatchProxy.isSupport(new Object[0], i2, a.k, false, 85786, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], i2, a.k, false, 85786, new Class[0], Void.TYPE);
                } else if (i2.s == null && com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableStoryCameraOpt)) {
                    i2.s = new HandlerThread("AVRecordModulesPresenter");
                    HandlerThread handlerThread = i2.s;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = i2.s;
                    if (handlerThread2 != null) {
                        looper = handlerThread2.getLooper();
                    } else {
                        looper = null;
                    }
                    i2.t = new Handler(looper);
                }
                CameraModule cameraModule = i2.v;
                if (cameraModule == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
                }
                cameraModule.a(i2.v());
            }
            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.END);
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.base.activity.b bVar) {
        com.ss.android.ugc.aweme.base.activity.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, n, false, 85822, new Class[]{com.ss.android.ugc.aweme.base.activity.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, n, false, 85822, new Class[]{com.ss.android.ugc.aweme.base.activity.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "listener");
        this.f73864c.add(bVar2);
    }

    public void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, n, false, 85807, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, n, false, 85807, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        throw new k("An operation is not implemented: " + "not implemented");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, n, false, 85805, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, n, false, 85805, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C0906R.id.ba5);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.layout_surface_size)");
        this.f73863b = (ScreenSizeAspectFrameLayout) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.cbn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.record_fragment_root)");
        this.f73862a = (FrameLayout) findViewById2;
        ScreenSizeAspectFrameLayout screenSizeAspectFrameLayout = this.f73863b;
        if (screenSizeAspectFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceSizeLayout");
        }
        ShortVideoContextViewModel r2 = r();
        Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
        screenSizeAspectFrameLayout.setAdjustEnable(!r2.f65401b.b());
        if (!this.q) {
            p().a().setVisibility(8);
        }
    }

    public boolean a(int i2, @NotNull KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, n, false, 85814, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, n, false, 85814, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(keyEvent2, "event");
        Iterator<com.ss.android.ugc.aweme.base.activity.a> it2 = this.f73865d.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(i2, keyEvent2)) {
                return true;
            }
        }
        return false;
    }

    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, n, false, 85813, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, n, false, 85813, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Iterator<com.ss.android.ugc.aweme.base.activity.b> it2 = this.f73864c.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(i2, i3, intent2)) {
                return;
            }
        }
        int i4 = i2;
        int i5 = i3;
        super.onActivityResult(i2, i3, intent);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, n, false, 85804, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, n, false, 85804, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(C0906R.layout.od, viewGroup2, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View inflate2 = layoutInflater2.inflate(C0906R.layout.a98, null, false);
            ((FrameLayout) frameLayout.findViewById(C0906R.id.ba5)).addView(p().a(), new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(inflate2, new ViewGroup.LayoutParams(-1, -1));
            return frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
