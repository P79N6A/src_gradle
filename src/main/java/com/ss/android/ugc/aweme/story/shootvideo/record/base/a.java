package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import android.app.Application;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.FrameLayout;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.log.IMonitor;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.filter.ac;
import com.ss.android.ugc.aweme.filter.an;
import com.ss.android.ugc.aweme.filter.ar;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.e.k;
import com.ss.android.ugc.aweme.shortvideo.e.l;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl;
import com.ss.android.ugc.aweme.shortvideo.local.a;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.record.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFilterModule;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010n\u001a\u00020oJ\b\u0010p\u001a\u00020qH&J\b\u0010r\u001a\u00020sH&J\b\u0010t\u001a\u00020uH&J\n\u0010v\u001a\u0004\u0018\u00010CH\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190wJ\f\u0010x\u001a\b\u0012\u0004\u0012\u00020#0wJ\b\u0010y\u001a\u00020zH&J\u0010\u0010{\u001a\u00020|2\u0006\u0010Z\u001a\u00020[H&J*\u0010}\u001a\u00020o2\u0006\u0010\u001c\u001a\u00020~2\b\b\u0002\u0010\u001a\u00020z2\u0010\b\u0002\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0001J\t\u0010\u0001\u001a\u00020oH\u0002J\t\u0010\u0001\u001a\u00020oH\u0016J\t\u0010\u0001\u001a\u00020oH\u0002J\n\u0010\u0001\u001a\u00030\u0001H&J\b\u0010F\u001a\u00020GH\u0016J\n\u0010\u0001\u001a\u00030\u0001H&J\u0012\u0010\u0001\u001a\u00020o2\u0007\u0010\u0001\u001a\u000202H\u0002J\t\u0010\u0001\u001a\u00020oH\u0002J\u0007\u0010\u0001\u001a\u00020oJ\n\u0010\u0001\u001a\u00030\u0001H&J\t\u0010\u0001\u001a\u00020oH\u0002J\u0010\u0010\u0001\u001a\u00020o2\u0007\u0010\u0001\u001a\u00020#J\u001b\u0010\u0001\u001a\u00020o2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\n\u0010\u0001\u001a\u00030\u0001H&J\n\u0010\u0001\u001a\u00030\u0001H&J\u0010\u0010\u0001\u001a\u00020o2\u0007\u0010\u0001\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R\u001a\u00101\u001a\u000202X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u00107\u001a\n 9*\u0004\u0018\u00010808X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'R\u001a\u0010<\u001a\u00020=X.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0010\u0010B\u001a\u0004\u0018\u00010CX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010F\u001a\u00020G8FX\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010%\"\u0004\bN\u0010'R\u000e\u0010O\u001a\u00020PX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020#0\u0018X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010R\u001a\u00020SX.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020[X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020_X.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010d\u001a\u00020e8FX\u0002¢\u0006\f\n\u0004\bh\u0010K\u001a\u0004\bf\u0010gR\u000e\u0010i\u001a\u00020jX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010k\u001a\u000202X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00104\"\u0004\bm\u00106¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/MediaRecordPresenterProvider;", "recordView", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;)V", "audioRecordModule", "Lcom/ss/android/ugc/aweme/shortvideo/record/AudioRecordModule;", "getAudioRecordModule", "()Lcom/ss/android/ugc/aweme/shortvideo/record/AudioRecordModule;", "setAudioRecordModule", "(Lcom/ss/android/ugc/aweme/shortvideo/record/AudioRecordModule;)V", "cameraFilterStrategy", "Lcom/ss/android/ugc/aweme/shortvideo/config/CameraFilterStrategyImpl;", "getCameraFilterStrategy", "()Lcom/ss/android/ugc/aweme/shortvideo/config/CameraFilterStrategyImpl;", "setCameraFilterStrategy", "(Lcom/ss/android/ugc/aweme/shortvideo/config/CameraFilterStrategyImpl;)V", "cameraModule", "Lcom/ss/android/ugc/aweme/shortvideo/record/CameraModule;", "getCameraModule", "()Lcom/ss/android/ugc/aweme/shortvideo/record/CameraModule;", "setCameraModule", "(Lcom/ss/android/ugc/aweme/shortvideo/record/CameraModule;)V", "cameraState", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/CameraState;", "getCameraState", "()Landroid/arch/lifecycle/MutableLiveData;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "ffmpegInit", "", "getFfmpegInit", "()Z", "setFfmpegInit", "(Z)V", "filterModule", "Lcom/ss/android/ugc/aweme/shortvideo/filter/IRecordFilterModule;", "getFilterModule", "()Lcom/ss/android/ugc/aweme/shortvideo/filter/IRecordFilterModule;", "setFilterModule", "(Lcom/ss/android/ugc/aweme/shortvideo/filter/IRecordFilterModule;)V", "hadInit", "getHadInit", "setHadInit", "height", "", "getHeight", "()I", "setHeight", "(I)V", "iesCameraManager", "Lcom/ss/android/medialib/camera/IESCameraManager;", "kotlin.jvm.PlatformType", "isShowFilterTab", "setShowFilterTab", "localMediaModule", "Lcom/ss/android/ugc/aweme/shortvideo/local/ChooseLocalMediaModule;", "getLocalMediaModule", "()Lcom/ss/android/ugc/aweme/shortvideo/local/ChooseLocalMediaModule;", "setLocalMediaModule", "(Lcom/ss/android/ugc/aweme/shortvideo/local/ChooseLocalMediaModule;)V", "mCameraHandler", "Landroid/os/Handler;", "mCameraThread", "Landroid/os/HandlerThread;", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "getMediaRecordPresenter", "()Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "mediaRecordPresenter$delegate", "Lkotlin/Lazy;", "musicalBeautyModeEnable", "getMusicalBeautyModeEnable", "setMusicalBeautyModeEnable", "nativeInitListener", "Lcom/ss/android/medialib/listener/NativeInitListener;", "nativeInitState", "photoModule", "Lcom/ss/android/ugc/aweme/photo/PhotoModule;", "getPhotoModule", "()Lcom/ss/android/ugc/aweme/photo/PhotoModule;", "setPhotoModule", "(Lcom/ss/android/ugc/aweme/photo/PhotoModule;)V", "getRecordView", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;", "safeHandler", "Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;", "getSafeHandler", "()Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;", "stickerModule", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule;", "getStickerModule", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule;", "setStickerModule", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule;)V", "videoRecorder", "Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;", "getVideoRecorder", "()Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;", "videoRecorder$delegate", "wideCamera", "Lcom/ss/android/ugc/aweme/shortvideo/widecamera/BasicWideCameraOperation;", "width", "getWidth", "setWidth", "closeCamera", "", "filterAnimateListener", "Lcom/ss/android/ugc/aweme/filter/FilterModule$FilterAnimationListener;", "filterChangeListener", "Lcom/ss/android/ugc/aweme/filter/FilterModule$OnFilterChange;", "filterVisibilityListener", "Lcom/ss/android/ugc/aweme/filter/FilterModule$OnVisibilityListener;", "getCameraHandler", "Landroid/arch/lifecycle/LiveData;", "getNativeInitState", "getStickerPannel", "", "getUpdateProgressTask", "Ljava/lang/Runnable;", "init", "Lcom/bytedance/ies/uikit/base/AbsActivity;", "mode", "onModuleInitFinish", "Lkotlin/Function0;", "initCameraHandler", "initFaceBeauty", "initFilterData", "localMediaSelectListener", "Lcom/ss/android/ugc/aweme/shortvideo/local/ChooseLocalMediaModule$OnLocalMediaSelectListener;", "onCameraListener", "Lcom/ss/android/ugc/aweme/shortvideo/record/CameraModule$OnCameraListener;", "onNativeInitFailed", "ret", "onNativeInitSuccess", "openCamera", "photoListener", "Lcom/ss/android/ugc/aweme/photo/PhotoModule$OnPhotoListener;", "quitCameraHandler", "setBeautyFaceEnabled", "enabled", "setCameraFocus", "x", "", "y", "stickerSelectListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule$OnStickerSelectListener;", "stickerVisibilityListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule$OnVisibilityListener;", "updateCameraState", "state", "LegacyFromRootViewSupplier", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a implements com.ss.android.ugc.aweme.story.shootvideo.record.b {
    public static ChangeQuickRedirect k;
    static final /* synthetic */ KProperty[] l = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mediaRecordPresenter", "getMediaRecordPresenter()Lcom/ss/android/medialib/presenter/MediaRecordPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "videoRecorder", "getVideoRecorder()Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;"))};
    @NotNull
    public com.ss.android.ugc.aweme.shortvideo.record.a A;
    @NotNull
    public Context B;
    @NotNull
    public final SafeHandler C;
    public boolean D;
    public final MutableLiveData<Boolean> E;
    final com.ss.android.medialib.c.b F;
    @NotNull
    public final c G;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f73874a = LazyKt.lazy(d.INSTANCE);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f73875b = LazyKt.lazy(new f(this));

    /* renamed from: c  reason: collision with root package name */
    private final g f73876c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.s.a f73877d;
    public int m = 1280;
    public int n = 720;
    public volatile boolean o;
    public boolean p = true;
    public boolean q = (true ^ com.ss.android.g.a.b());
    @NotNull
    public final MutableLiveData<b> r = new MutableLiveData<>();
    HandlerThread s;
    Handler t;
    @NotNull
    public com.ss.android.ugc.aweme.shortvideo.e.b u;
    @NotNull
    public CameraModule v;
    @NotNull
    public com.ss.android.ugc.aweme.shortvideo.filter.d w;
    @NotNull
    public StickerModule x;
    @NotNull
    public PhotoModule y;
    @NotNull
    public com.ss.android.ugc.aweme.shortvideo.local.a z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter$LegacyFromRootViewSupplier;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule$RootViewSupplier;", "mRootView", "Landroid/widget/FrameLayout;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;Landroid/widget/FrameLayout;)V", "getToolMarkView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getToolName", "Landroid/widget/TextView;", "getToolView", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.base.a$a  reason: collision with other inner class name */
    final class C0767a implements StickerModule.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73878a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f73879b;

        /* renamed from: c  reason: collision with root package name */
        private final FrameLayout f73880c;

        @Nullable
        public final RemoteImageView a() {
            if (!PatchProxy.isSupport(new Object[0], this, f73878a, false, 85790, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.f73880c.findViewById(C0906R.id.b63);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, f73878a, false, 85790, new Class[0], RemoteImageView.class);
        }

        @Nullable
        public final RemoteImageView b() {
            if (!PatchProxy.isSupport(new Object[0], this, f73878a, false, 85791, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.f73880c.findViewById(C0906R.id.b64);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, f73878a, false, 85791, new Class[0], RemoteImageView.class);
        }

        public C0767a(a aVar, @NotNull FrameLayout frameLayout) {
            Intrinsics.checkParameterIsNotNull(frameLayout, "mRootView");
            this.f73879b = aVar;
            this.f73880c = frameLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onStartRecord"}, k = 3, mv = {1, 1, 15})
    static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f73883a = new b();

        b() {
        }

        public final void a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter$initFilterData$1", "Landroid/arch/lifecycle/Observer;", "", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "onChanged", "", "filterBeans", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements Observer<List<? extends h>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f73887b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f73888c;

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f73886a, false, 85793, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f73886a, false, 85793, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (list != null && list.size() > this.f73888c) {
                Object service = ServiceManager.get().getService(IAVService.class);
                Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
                ((com.ss.android.ugc.aweme.shortvideo.filter.e) this.f73887b.o().c()).c(((IAVService) service).getFilterService().getFilter(this.f73887b.u.a(this.f73887b.n().h())));
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) this.f73887b.o().c();
                Intrinsics.checkExpressionValueIsNotNull(eVar, "filterModule.filterFunc");
                ((com.ss.android.ugc.aweme.shortvideo.filter.e) this.f73887b.o().c()).b(eVar.e());
                an d2 = com.ss.android.ugc.aweme.port.in.a.d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "AVEnv.getFilterSources()");
                d2.a().removeObserver(this);
            }
        }

        c(a aVar, int i) {
            this.f73887b = aVar;
            this.f73888c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<MediaRecordPresenter> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "logType", "", "kotlin.jvm.PlatformType", "logExtra", "Lorg/json/JSONObject;", "monitorLog"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.base.a$d$a  reason: collision with other inner class name */
        static final class C0768a implements IMonitor {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73889a;

            /* renamed from: b  reason: collision with root package name */
            public static final C0768a f73890b = new C0768a();

            C0768a() {
            }

            public final void monitorLog(String str, JSONObject jSONObject) {
                if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f73889a, false, 85795, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f73889a, false, 85795, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                    return;
                }
                n.a(str, jSONObject);
            }
        }

        d() {
            super(0);
        }

        @NotNull
        public final MediaRecordPresenter invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85794, new Class[0], MediaRecordPresenter.class)) {
                return (MediaRecordPresenter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85794, new Class[0], MediaRecordPresenter.class);
            }
            MediaRecordPresenter mediaRecordPresenter = new MediaRecordPresenter();
            mediaRecordPresenter.b(com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEnhanceVolume));
            mediaRecordPresenter.a((IMonitor) C0768a.f73890b);
            return mediaRecordPresenter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter$nativeInitListener$1", "Lcom/ss/android/medialib/listener/NativeInitListener;", "onNativeInitCallBack", "", "ret", "", "onNativeInitHardEncoderRetCallback", "isCPUEncode", "encoderProfile", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.ss.android.medialib.c.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f73892b;

        e(a aVar) {
            this.f73892b = aVar;
        }

        public final void a(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73891a, false, 85796, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73891a, false, 85796, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.util.c.a("onNativeInitCallBack() called with: ret = [" + i2 + ']');
            if (i2 < 0) {
                a aVar = this.f73892b;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, aVar, a.k, false, 85780, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aVar2, a.k, false, 85780, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) com.ss.android.ugc.aweme.framework.e.a.a(), com.ss.android.ugc.aweme.framework.e.a.a().getString(C0906R.string.bfz, new Object[]{Integer.valueOf(i)})).a();
                    com.ss.android.ugc.aweme.shortvideo.d.a.a();
                    try {
                        StringBuilder sb = new StringBuilder("currentWidth:");
                        sb.append(aVar.m);
                        sb.append(",currentHeight:");
                        sb.append(aVar.n);
                        sb.append(",availableMem:");
                        sb.append(com.ss.android.ugc.aweme.utils.b.a(com.ss.android.ugc.aweme.port.in.a.f61119b));
                        sb.append(",currentPIDMem:");
                        Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
                        Intrinsics.checkExpressionValueIsNotNull(application, "AVEnv.application");
                        sb.append(com.ss.android.ugc.aweme.utils.b.b(application.getApplicationContext()));
                        sb.append(",hasUsedMem:");
                        Application application2 = com.ss.android.ugc.aweme.port.in.a.f61119b;
                        Intrinsics.checkExpressionValueIsNotNull(application2, "AVEnv.application");
                        sb.append(com.ss.android.ugc.aweme.utils.b.c(application2.getApplicationContext()));
                        String sb2 = sb.toString();
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("init failed detail: " + sb2));
                        n.a("aweme_sensetime_init_fail", 1, com.ss.android.ugc.aweme.app.d.c.a().a("errorCode", Integer.valueOf(i)).a("errorDesc", "").a("exception", sb2).b());
                    } catch (Exception unused) {
                    }
                    aVar.E.setValue(Boolean.FALSE);
                }
            } else {
                a aVar3 = this.f73892b;
                if (PatchProxy.isSupport(new Object[0], aVar3, a.k, false, 85781, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar3, a.k, false, 85781, new Class[0], Void.TYPE);
                    return;
                }
                ShortVideoContextViewModel I = aVar3.G.I();
                I.c(true);
                n.a("aweme_sensetime_init_fail", 0, (JSONObject) null);
                com.ss.android.ugc.aweme.shortvideo.filter.d dVar = aVar3.w;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterModule");
                }
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar, "filterFunc");
                ((com.ss.android.ugc.aweme.shortvideo.filter.e) dVar.c()).a(eVar.e());
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar2 = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar2, "filterFunc");
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar3 = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar3, "filterFunc");
                eVar2.e(eVar3.k());
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar4 = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar4, "filterFunc");
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar5 = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar5, "filterFunc");
                eVar4.a(eVar5.i());
                StickerModule stickerModule = aVar3.x;
                if (stickerModule == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stickerModule");
                }
                stickerModule.e();
                aVar3.m().b(I.f65401b.p);
                MediaRecordPresenter l = aVar3.l();
                CameraModule cameraModule = aVar3.v;
                if (cameraModule == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
                }
                float k = ((float) cameraModule.k()) * 1.0f;
                CameraModule cameraModule2 = aVar3.v;
                if (cameraModule2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
                }
                l.b(k / ((float) cameraModule2.l()));
                l.k(com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UseLargeMattingModel));
                l.j(!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UseLargeGestureDetectModel));
                aVar3.E.setValue(Boolean.TRUE);
            }
        }

        public final void a(int i, int i2) {
            int i3 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f73891a, false, 85797, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f73891a, false, 85797, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            fh fhVar = this.f73892b.G.I().f65401b;
            com.ss.android.ugc.aweme.util.c.a("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [" + i3 + ']');
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.RecordUseSuccessRecordProfile, i2);
            if (fhVar.f67719b == 0) {
                fhVar.o = i3 ^ 1;
                com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.o);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<com.ss.android.ugc.aweme.shortvideo.j.e> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final com.ss.android.ugc.aweme.shortvideo.j.e invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85798, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.e.class)) {
                return com.ss.android.ugc.aweme.shortvideo.j.e.a((dmt.av.video.b.a) new dmt.av.video.b.d(this.this$0.t(), this.this$0.l()));
            }
            return (com.ss.android.ugc.aweme.shortvideo.j.e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85798, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.e.class);
        }
    }

    @NotNull
    public abstract StickerModule.c A();

    @NotNull
    public abstract StickerModule.b B();

    @NotNull
    public abstract a.C0718a C();

    @NotNull
    public abstract PhotoModule.a D();

    @NotNull
    public abstract String i();

    @NotNull
    public final MediaRecordPresenter l() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85759, new Class[0], MediaRecordPresenter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, k, false, 85759, new Class[0], MediaRecordPresenter.class);
        } else {
            value = this.f73874a.getValue();
        }
        return (MediaRecordPresenter) value;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.j.e m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85760, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.e.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, k, false, 85760, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.e.class);
        } else {
            value = this.f73875b.getValue();
        }
        return (com.ss.android.ugc.aweme.shortvideo.j.e) value;
    }

    @NotNull
    public abstract CameraModule.a w();

    @NotNull
    public abstract ac.b x();

    @NotNull
    public abstract ac.a y();

    @NotNull
    public abstract ac.c z();

    @NotNull
    public final MediaRecordPresenter g() {
        if (!PatchProxy.isSupport(new Object[0], this, k, false, 85789, new Class[0], MediaRecordPresenter.class)) {
            return l();
        }
        return (MediaRecordPresenter) PatchProxy.accessDispatch(new Object[0], this, k, false, 85789, new Class[0], MediaRecordPresenter.class);
    }

    @NotNull
    public final CameraModule n() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85762, new Class[0], CameraModule.class)) {
            return (CameraModule) PatchProxy.accessDispatch(new Object[0], this, k, false, 85762, new Class[0], CameraModule.class);
        }
        CameraModule cameraModule = this.v;
        if (cameraModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
        }
        return cameraModule;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.filter.d o() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85764, new Class[0], com.ss.android.ugc.aweme.shortvideo.filter.d.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.filter.d) PatchProxy.accessDispatch(new Object[0], this, k, false, 85764, new Class[0], com.ss.android.ugc.aweme.shortvideo.filter.d.class);
        }
        com.ss.android.ugc.aweme.shortvideo.filter.d dVar = this.w;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterModule");
        }
        return dVar;
    }

    @NotNull
    public final StickerModule p() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85766, new Class[0], StickerModule.class)) {
            return (StickerModule) PatchProxy.accessDispatch(new Object[0], this, k, false, 85766, new Class[0], StickerModule.class);
        }
        StickerModule stickerModule = this.x;
        if (stickerModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerModule");
        }
        return stickerModule;
    }

    @NotNull
    public final PhotoModule q() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85768, new Class[0], PhotoModule.class)) {
            return (PhotoModule) PatchProxy.accessDispatch(new Object[0], this, k, false, 85768, new Class[0], PhotoModule.class);
        }
        PhotoModule photoModule = this.y;
        if (photoModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoModule");
        }
        return photoModule;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.local.a r() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85770, new Class[0], com.ss.android.ugc.aweme.shortvideo.local.a.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.local.a) PatchProxy.accessDispatch(new Object[0], this, k, false, 85770, new Class[0], com.ss.android.ugc.aweme.shortvideo.local.a.class);
        }
        com.ss.android.ugc.aweme.shortvideo.local.a aVar = this.z;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localMediaModule");
        }
        return aVar;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.record.a s() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85772, new Class[0], com.ss.android.ugc.aweme.shortvideo.record.a.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.record.a) PatchProxy.accessDispatch(new Object[0], this, k, false, 85772, new Class[0], com.ss.android.ugc.aweme.shortvideo.record.a.class);
        }
        com.ss.android.ugc.aweme.shortvideo.record.a aVar = this.A;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioRecordModule");
        }
        return aVar;
    }

    @NotNull
    public final Context t() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85774, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, k, false, 85774, new Class[0], Context.class);
        }
        Context context = this.B;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    /* access modifiers changed from: package-private */
    public final Handler v() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85785, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], this, k, false, 85785, new Class[0], Handler.class);
        }
        HandlerThread handlerThread = this.s;
        if (handlerThread != null) {
            if (!handlerThread.isAlive()) {
                handlerThread = null;
            }
            if (handlerThread != null) {
                return this.t;
            }
        }
        return null;
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85784, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 85784, new Class[0], Void.TYPE);
            return;
        }
        CameraModule cameraModule = this.v;
        if (cameraModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
        }
        cameraModule.b(v());
        l().l();
        this.f73876c.j();
        l().j();
        l().g = null;
        FaceBeautyInvoker.setNativeInitListener(null);
        this.G.I().c(false);
        this.o = false;
        StickerModule stickerModule = this.x;
        if (stickerModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerModule");
        }
        stickerModule.e(false);
        stickerModule.d();
        if (PatchProxy.isSupport(new Object[0], this, k, false, 85787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 85787, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            ai.d("AVRecordModulesPresenter quitCameraHandler");
            HandlerThread handlerThread = this.s;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.s = null;
        }
    }

    public a(@NotNull c cVar) {
        com.ss.android.ugc.aweme.shortvideo.e.b bVar;
        Intrinsics.checkParameterIsNotNull(cVar, "recordView");
        this.G = cVar;
        if (com.ss.android.g.a.b()) {
            bVar = new com.ss.android.ugc.aweme.shortvideo.e.g();
        } else {
            bVar = new com.ss.android.ugc.aweme.shortvideo.e.b();
        }
        this.u = bVar;
        this.f73876c = g.b();
        this.f73877d = new com.ss.android.ugc.aweme.shortvideo.s.a();
        this.C = new SafeHandler(this.G.H());
        this.E = new MutableLiveData<>();
        this.F = new e(this.C, new e(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = k
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 85778(0x14f12, float:1.202E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = k
            r3 = 0
            r4 = 85778(0x14f12, float:1.202E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            boolean r0 = r9.p
            if (r0 != 0) goto L_0x004f
            android.app.Application r0 = com.ss.android.ugc.aweme.framework.e.a.a()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131559054(0x7f0d028e, float:1.8743441E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x004f:
            com.ss.android.ugc.aweme.story.shootvideo.record.base.c r0 = r9.G
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r0.I()
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f65401b
            r0.p = r10
            com.ss.android.ugc.aweme.shortvideo.filter.d r0 = r9.w
            if (r0 != 0) goto L_0x0062
            java.lang.String r1 = "filterModule"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0062:
            com.ss.android.ugc.aweme.shortvideo.filter.a r0 = r0.c()
            com.ss.android.ugc.aweme.shortvideo.filter.e r0 = (com.ss.android.ugc.aweme.shortvideo.filter.e) r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            java.lang.String r2 = "ServiceManager.get().get…e(IAVService::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.filter.ar r1 = r1.getFilterService()
            com.ss.android.ugc.aweme.shortvideo.e.b r2 = r9.u
            com.ss.android.ugc.aweme.shortvideo.record.CameraModule r3 = r9.v
            if (r3 != 0) goto L_0x0088
            java.lang.String r4 = "cameraModule"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0088:
            int r3 = r3.h()
            int r2 = r2.a(r3)
            com.ss.android.ugc.aweme.filter.h r1 = r1.getFilter(r2)
            r0.d(r1)
            com.ss.android.ugc.aweme.shortvideo.j.e r0 = r9.m()
            r0.b((boolean) r10)
            if (r10 == 0) goto L_0x00d2
            com.ss.android.ugc.aweme.shortvideo.filter.d r0 = r9.w
            if (r0 != 0) goto L_0x00a9
            java.lang.String r1 = "filterModule"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00a9:
            com.ss.android.ugc.aweme.shortvideo.filter.a r0 = r0.c()
            com.ss.android.ugc.aweme.shortvideo.filter.e r0 = (com.ss.android.ugc.aweme.shortvideo.filter.e) r0
            r1 = 1051931443(0x3eb33333, float:0.35)
            r2 = 0
            if (r0 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.filter.h r0 = r0.e()
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.f47602f
            if (r0 != 0) goto L_0x00c3
            r0 = 1051931443(0x3eb33333, float:0.35)
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            boolean r3 = com.ss.android.g.a.b()
            if (r3 == 0) goto L_0x00cb
            r0 = 0
        L_0x00cb:
            com.ss.android.ugc.aweme.shortvideo.j.e r2 = r9.m()
            r2.a((float) r1, (float) r0)
        L_0x00d2:
            com.ss.android.ugc.aweme.utils.a r0 = com.ss.android.ugc.aweme.utils.a.f75468b
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            if (r10 == 0) goto L_0x00dd
            java.lang.String r2 = "prettify_on"
            goto L_0x00df
        L_0x00dd:
            java.lang.String r2 = "prettify_off"
        L_0x00df:
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "shoot_page"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            com.ss.android.ugc.aweme.story.shootvideo.record.base.c r2 = r9.G
            com.ss.android.ugc.aweme.base.b.a.d r2 = r2.G()
            java.lang.Object r2 = r2.a()
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setJsonObject(r2)
            java.lang.String r2 = "MobClick.obtain().setEve…shootWaySupplier().get())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.onEvent(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.base.a.c(boolean):void");
    }

    /* access modifiers changed from: private */
    public void a(@NotNull AbsActivity absActivity, @NotNull String str, @NotNull Function0<Unit> function0) {
        int i;
        AbsActivity absActivity2;
        com.ss.android.ugc.aweme.shortvideo.filter.d dVar;
        AbsActivity absActivity3 = absActivity;
        String str2 = str;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{absActivity3, str2, function02}, this, k, false, 85776, new Class[]{AbsActivity.class, String.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absActivity3, str2, function02}, this, k, false, 85776, new Class[]{AbsActivity.class, String.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(absActivity3, "context");
        Intrinsics.checkParameterIsNotNull(str2, "mode");
        Intrinsics.checkParameterIsNotNull(function02, "onModuleInitFinish");
        if (!this.D) {
            this.D = true;
            this.B = absActivity3;
            this.v = new CameraModule(absActivity3, l(), w(), this.G.G());
            if (Intrinsics.areEqual((Object) str2, (Object) "story")) {
                this.u = new l();
                CameraModule cameraModule = this.v;
                if (cameraModule == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
                }
                cameraModule.l = new k();
                MediaRecordPresenter l2 = l();
                com.ss.android.ugc.aweme.shortvideo.j.e m2 = m();
                FrameLayout F2 = this.G.F();
                ac.a y2 = y();
                ac.c z2 = z();
                i = 0;
                absActivity2 = absActivity3;
                StoryRecordFilterModule storyRecordFilterModule = new StoryRecordFilterModule(absActivity, l2, m2, F2, y2, z2, x(), this.G.G(), this.G.m());
                dVar = storyRecordFilterModule;
            } else {
                absActivity2 = absActivity3;
                i = 0;
                RecordFilterModuleImpl recordFilterModuleImpl = new RecordFilterModuleImpl(absActivity, l(), m(), this.G.F(), y(), z(), x(), this.G.G(), this.G.m());
                dVar = recordFilterModuleImpl;
            }
            this.w = dVar;
            com.ss.android.ugc.aweme.port.in.a.f();
            fh fhVar = this.G.I().f65401b;
            StickerModule stickerModule = new StickerModule(absActivity, this.G.H(), this.G.J(), i(), this.G.F(), new C0767a(this, this.G.F()), this.G.b(), l(), null, B(), A(), this.G.G());
            this.x = stickerModule;
            this.y = new PhotoModule(absActivity2, l(), D());
            com.ss.android.ugc.aweme.shortvideo.local.a aVar = new com.ss.android.ugc.aweme.shortvideo.local.a(absActivity, this.G.J(), fhVar, this.G.c(), C());
            this.z = aVar;
            this.A = new com.ss.android.ugc.aweme.shortvideo.record.a(absActivity2, b.f73883a);
            if (PatchProxy.isSupport(new Object[i], this, k, false, 85779, new Class[i], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, k, false, 85779, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.shortvideo.e.b bVar = this.u;
                CameraModule cameraModule2 = this.v;
                if (cameraModule2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
                }
                int a2 = bVar.a(cameraModule2.h());
                com.ss.android.ugc.aweme.shortvideo.filter.d dVar2 = this.w;
                if (dVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterModule");
                }
                dVar2.a();
                an d2 = com.ss.android.ugc.aweme.port.in.a.d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "AVEnv.getFilterSources()");
                MutableLiveData<List<h>> a3 = d2.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AVEnv.getFilterSources().preparedFilterSources");
                if (a3.getValue() != null) {
                    an d3 = com.ss.android.ugc.aweme.port.in.a.d();
                    Intrinsics.checkExpressionValueIsNotNull(d3, "AVEnv.getFilterSources()");
                    MutableLiveData<List<h>> a4 = d3.a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "AVEnv.getFilterSources().preparedFilterSources");
                    Object value = a4.getValue();
                    if (value == null) {
                        Intrinsics.throwNpe();
                    }
                    if (((List) value).size() > a2) {
                        com.ss.android.ugc.aweme.shortvideo.filter.d dVar3 = this.w;
                        if (dVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("filterModule");
                        }
                        com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar3.c();
                        Object service = ServiceManager.get().getService(IAVService.class);
                        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
                        ar filterService = ((IAVService) service).getFilterService();
                        com.ss.android.ugc.aweme.shortvideo.e.b bVar2 = this.u;
                        CameraModule cameraModule3 = this.v;
                        if (cameraModule3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
                        }
                        eVar.c(filterService.getFilter(bVar2.a(cameraModule3.h())));
                        com.ss.android.ugc.aweme.shortvideo.filter.d dVar4 = this.w;
                        if (dVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("filterModule");
                        }
                        com.ss.android.ugc.aweme.shortvideo.filter.e eVar2 = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar4.c();
                        com.ss.android.ugc.aweme.shortvideo.filter.d dVar5 = this.w;
                        if (dVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("filterModule");
                        }
                        com.ss.android.ugc.aweme.shortvideo.filter.e eVar3 = (com.ss.android.ugc.aweme.shortvideo.filter.e) dVar5.c();
                        Intrinsics.checkExpressionValueIsNotNull(eVar3, "filterModule.filterFunc");
                        eVar2.b(eVar3.e());
                    }
                }
                an d4 = com.ss.android.ugc.aweme.port.in.a.d();
                Intrinsics.checkExpressionValueIsNotNull(d4, "AVEnv.getFilterSources()");
                d4.a().observe(this.G.H(), new c(this, a2));
            }
            CameraModule cameraModule4 = this.v;
            if (cameraModule4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
            }
            cameraModule4.c();
            function0.invoke();
        }
    }
}
