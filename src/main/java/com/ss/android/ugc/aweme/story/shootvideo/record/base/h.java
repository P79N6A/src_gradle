package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.filter.ac;
import com.ss.android.ugc.aweme.filter.az;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.gesture.a;
import com.ss.android.ugc.aweme.shortvideo.j.e;
import com.ss.android.ugc.aweme.shortvideo.local.a;
import com.ss.android.ugc.aweme.shortvideo.r;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.ai;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\rH\u0016J\"\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020+H\u0016J\u0010\u00101\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0018\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u000fH\u0016J\u001e\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0016J\u0010\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020@H\u0016J\u0012\u0010A\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010C\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010D\u001a\u00020\u0006H\u0016J\u0018\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rH\u0016J\u0012\u0010H\u001a\u00020\u00122\b\u0010I\u001a\u0004\u0018\u000104H\u0016J\b\u0010J\u001a\u00020\u0003H\u0016J\b\u0010K\u001a\u00020LH\u0016J\u0018\u0010M\u001a\u00020\u00122\u0006\u0010N\u001a\u00020O2\u0006\u0010*\u001a\u00020+H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/SimpleRecordModulesPresenter;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;", "Lcom/ss/android/ugc/aweme/filter/FilterModule$OnFilterChange;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule$OnStickerSelectListener;", "Lcom/ss/android/ugc/aweme/filter/FilterModule$FilterAnimationListener;", "Lcom/ss/android/ugc/aweme/shortvideo/local/ChooseLocalMediaModule$OnLocalMediaSelectListener;", "Lcom/ss/android/ugc/aweme/photo/PhotoModule$OnPhotoListener;", "Lcom/ss/android/ugc/aweme/shortvideo/record/CameraModule$OnCameraListener;", "recordView", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;)V", "cameraPositionState", "Landroid/arch/lifecycle/MutableLiveData;", "", "filterVisibleState", "", "stickerVisibleState", "changeFilter", "", "fraction", "", "filterAnimateListener", "filterChangeListener", "filterVisibilityListener", "Lcom/ss/android/ugc/aweme/filter/FilterModule$OnVisibilityListener;", "getCameraPositionState", "Landroid/arch/lifecycle/LiveData;", "getFilterVisibleState", "getStickerVisibleState", "localMediaSelectListener", "onAnimationEnd", "onAnimationStart", "onCameraChanged", "cameraPosition", "onCameraListener", "onCameraOpen", "onCameraOpenFailed", "cameraType", "errorCode", "info", "", "onChange3DMaskSticker", "sticker", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "onChange3DSticker", "onChangeARSticker", "onChangeGameSticker", "onChangeHwBeautySticker", "stickerBean", "onChangeTouchSticker", "onFilterChanged", "currentFilter", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "onLocalVideoSelected", "videoFile", "isMultiEdit", "onPhotoMovieSelected", "movieContext", "Lcom/ss/android/ugc/aweme/photomovie/PhotoMovieContext;", "musicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "onPhotoSelected", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "onPhotoTaken", "localPath", "onSelectSticker", "photoListener", "previewSize", "bestWidth", "bestHeight", "setFilter", "filter", "stickerSelectListener", "stickerVisibilityListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule$OnVisibilityListener;", "updateGestureListener", "stickerType", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/StickerType;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class h extends a implements ac.a, ac.b, PhotoModule.a, a.C0718a, CameraModule.a, StickerModule.b {
    public static ChangeQuickRedirect H;
    public final MutableLiveData<Boolean> I = new MutableLiveData<>();
    public final MutableLiveData<Integer> J = new MutableLiveData<>();

    /* renamed from: a  reason: collision with root package name */
    private final MutableLiveData<Boolean> f73902a = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"initMediaProcess", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        public final void invoke() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85875, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85875, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.l().d();
            h hVar = this.this$0;
            if (PatchProxy.isSupport(new Object[0], hVar, a.k, false, 85777, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], hVar, a.k, false, 85777, new Class[0], Void.TYPE);
                return;
            }
            fh fhVar = hVar.G.I().f65401b;
            MediaRecordPresenter l = hVar.l();
            Context context = hVar.B;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            l.a(context);
            e.a f2 = hVar.m().f();
            Context context2 = hVar.B;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            e.a a2 = f2.a(context2);
            StringBuilder sb = new StringBuilder();
            d dVar = fhVar.l;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "shortVideoContext.mWorkspace");
            File g = dVar.g();
            Intrinsics.checkExpressionValueIsNotNull(g, "shortVideoContext.mWorkspace.recordingDirectory");
            sb.append(g.getPath());
            sb.append("/");
            e.a a3 = a2.a(sb.toString());
            CameraModule cameraModule = hVar.v;
            if (cameraModule == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
            }
            e.a a4 = a3.a(cameraModule.k());
            CameraModule cameraModule2 = hVar.v;
            if (cameraModule2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
            }
            e.a b2 = a4.b(cameraModule2.l());
            if (fhVar.b()) {
                i = fhVar.k / 2;
            } else {
                i = fhVar.k;
            }
            e.a c2 = b2.d(i).c(fhVar.j);
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
            c2.e(fhVar.a() ? 1 : 0).a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/base/SimpleRecordModulesPresenter$setFilter$1$1", "Lcom/ss/android/ugc/aweme/shortvideo/recorder/FilterDataSource;", "get1_0Path", "", "get1_1Path", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.ss.android.ugc.aweme.shortvideo.j.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.filter.h f73903d;

        @NotNull
        public final String a() {
            return "";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.filter.h hVar, int i) {
            super(i);
            this.f73903d = hVar;
        }
    }

    @NotNull
    public final StickerModule.b B() {
        return this;
    }

    @NotNull
    public final a.C0718a C() {
        return this;
    }

    @NotNull
    public final PhotoModule.a D() {
        return this;
    }

    public void a(@NotNull PhotoContext photoContext) {
        PhotoContext photoContext2 = photoContext;
        if (PatchProxy.isSupport(new Object[]{photoContext2}, this, H, false, 85868, new Class[]{PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext2}, this, H, false, 85868, new Class[]{PhotoContext.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(photoContext2, "photoContext");
    }

    public final void a(@NotNull PhotoMovieContext photoMovieContext, @NotNull List<? extends com.ss.android.ugc.aweme.shortvideo.e> list) {
        PhotoMovieContext photoMovieContext2 = photoMovieContext;
        List<? extends com.ss.android.ugc.aweme.shortvideo.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext2, list2}, this, H, false, 85869, new Class[]{PhotoMovieContext.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoMovieContext2, list2}, this, H, false, 85869, new Class[]{PhotoMovieContext.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(photoMovieContext2, "movieContext");
        Intrinsics.checkParameterIsNotNull(list2, "musicList");
    }

    public void a(@Nullable String str) {
    }

    @NotNull
    public final CameraModule.a w() {
        return this;
    }

    @NotNull
    public final ac.b x() {
        return this;
    }

    @NotNull
    public final ac.a y() {
        return this;
    }

    public final void a(@NotNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, H, false, 85855, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, H, false, 85855, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean, "sticker");
        if (ae.a("camera_front", faceStickerBean)) {
            if (n().h() != 1) {
                this.J.setValue(1);
            }
        } else if (ae.a("camera_back", faceStickerBean) && n().h() != 0) {
            this.J.setValue(0);
        }
    }

    public final void a(@NotNull String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, H, false, 85867, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, H, false, 85867, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "videoFile");
        fh fhVar = this.G.I().f65401b;
        Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
        fhVar.d().setContentSource("upload");
        fhVar.d().setContentType("video");
        Intent intent = new Intent();
        intent.putExtra("from_music_detail", Intrinsics.areEqual((Object) "single_song", (Object) fhVar.r));
        intent.putExtra("creation_id", fhVar.q);
        intent.putExtra("shoot_way", fhVar.r);
        intent.putExtra("min_duration", fhVar.f67721d);
        intent.putExtra("shoot_mode", fhVar.N);
        d dVar = fhVar.l;
        Intrinsics.checkExpressionValueIsNotNull(dVar, "shortVideoContext.mWorkspace");
        if (dVar.e() != null) {
            d dVar2 = fhVar.l;
            Intrinsics.checkExpressionValueIsNotNull(dVar2, "shortVideoContext.mWorkspace");
            File e2 = dVar2.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "shortVideoContext.mWorkspace.musicFile");
            intent.putExtra("path", e2.getAbsolutePath());
        }
        ej a2 = ej.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "PublishManager.inst()");
        List<c> list = a2.f67529b;
        if (list != null && !list.isEmpty()) {
            intent.putExtra("av_challenge", list.get(0));
        }
        intent.putExtra("poi_struct_in_tools_line", fhVar.D);
        intent.putExtra("micro_app_info", fhVar.am);
        intent.putExtra("av_et_parameter", fhVar.d());
        intent.putExtra("send_to_user_head", fhVar.ar);
        intent.putExtra("enter_from", fhVar.s);
        g.a(intent, r.b(fhVar), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.CUT);
        if (TextUtils.equals(fhVar.s, "from_chat")) {
            VECutVideoActivity.f66190b.a(t(), intent, 4);
        } else {
            VECutVideoActivity.f66190b.a(t(), intent, -1);
        }
    }

    @NotNull
    public final StickerModule.c A() {
        if (!PatchProxy.isSupport(new Object[0], this, H, false, 85854, new Class[0], StickerModule.c.class)) {
            return new com.ss.android.ugc.aweme.story.shootvideo.record.base.a.b(this.I);
        }
        return (StickerModule.c) PatchProxy.accessDispatch(new Object[0], this, H, false, 85854, new Class[0], StickerModule.c.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, H, false, 85865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, H, false, 85865, new Class[0], Void.TYPE);
            return;
        }
        this.G.d().f67908e = true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, H, false, 85866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, H, false, 85866, new Class[0], Void.TYPE);
            return;
        }
        this.G.d().f67908e = false;
    }

    @NotNull
    public final ac.c z() {
        if (!PatchProxy.isSupport(new Object[0], this, H, false, 85853, new Class[0], ac.c.class)) {
            return new com.ss.android.ugc.aweme.story.shootvideo.record.base.a.a(this.f73902a);
        }
        return (ac.c) PatchProxy.accessDispatch(new Object[0], this, H, false, 85853, new Class[0], ac.c.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(@NotNull c cVar) {
        super(cVar);
        Intrinsics.checkParameterIsNotNull(cVar, "recordView");
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, H, false, 85863, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, H, false, 85863, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) o().c();
        Intrinsics.checkExpressionValueIsNotNull(eVar, "filterModule.filterFunc");
        com.ss.android.ugc.aweme.filter.h e2 = eVar.e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "filterModule.filterFunc.curFilter");
        int i = e2.f47602f;
        m().a(new com.ss.android.ugc.aweme.shortvideo.j.a(i), f2);
        com.ss.android.ugc.aweme.port.in.a.u.a(i);
    }

    public final void c(@NotNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, H, false, 85857, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, H, false, 85857, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean, "sticker");
        fh fhVar = this.G.I().f65401b;
        if (com.ss.android.g.a.b()) {
            this.p = true;
            c(fhVar.p);
        }
        if (!fhVar.p) {
            c(true);
            fhVar.p = true;
        }
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).b(true);
        a(j.STICKER_3D, faceStickerBean);
    }

    public final void f(@NotNull FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, H, false, 85861, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, H, false, 85861, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean2, "sticker");
        a(j.STICKER_TOUCH, faceStickerBean2);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, H, false, 85873, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, H, false, 85873, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ShortVideoContextViewModel I2 = this.G.I();
        this.r.setValue(b.STATE_OPEN);
        fh fhVar = I2.f65401b;
        Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
        if (!fhVar.a()) {
            l().a(t(), 5, s().a());
        }
        l().c(com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectParallelFwk));
        l().a(this.G.p().b(), Build.DEVICE);
        p().d(I2.e());
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, H, false, 85872, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, H, false, 85872, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r.setValue(b.STATE_OPEN);
        n().e();
        com.ss.android.ugc.aweme.shortvideo.filter.d o = o();
        Object service = ServiceManager.get().getService(IAVService.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).c(((IAVService) service).getFilterService().getFilter(this.u.a(n().h())));
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).a(false);
    }

    public final void d(@NotNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, H, false, 85858, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, H, false, 85858, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean, "sticker");
        if (faceStickerBean.getTags() != null) {
            if (com.ss.android.g.a.b()) {
                this.p = false;
                c(false);
            }
            com.ss.android.ugc.aweme.shortvideo.filter.d o = o();
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).b(!faceStickerBean.getTags().contains("disable_reshape"), true);
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).c(!faceStickerBean.getTags().contains("disable_smooth"), true);
            faceStickerBean.getTags().contains("disable_beautify_filter");
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).a(true, true);
            a(j.STICKER_3D_MASK, faceStickerBean);
        }
    }

    public final void e(@NotNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, H, false, 85860, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, H, false, 85860, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean, "sticker");
        ShortVideoContextViewModel I2 = this.G.I();
        if (com.ss.android.g.a.b()) {
            this.p = true;
            c(I2.f65401b.p);
        }
        com.ss.android.ugc.aweme.shortvideo.filter.d o = o();
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).b(!faceStickerBean.getTags().contains("disable_reshape"), true);
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).c(!faceStickerBean.getTags().contains("disable_smooth"), true);
        faceStickerBean.getTags().contains("disable_beautify_filter");
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).a(true, true);
        a(j.STICKER_GAME, faceStickerBean);
    }

    public final void g(@NotNull FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, H, false, 85859, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, H, false, 85859, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean2, "stickerBean");
        if (n().h() != 0) {
            this.J.setValue(0);
            n().i();
        }
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).b(false, true);
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).c(false, true);
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).a(false, true);
        n().a(true);
        n().b(100);
    }

    public final void b(@Nullable com.ss.android.ugc.aweme.filter.h hVar) {
        float f2;
        com.ss.android.ugc.aweme.filter.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, H, false, 85864, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, H, false, 85864, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE);
            return;
        }
        ShortVideoContextViewModel I2 = this.G.I();
        if (hVar2 != null) {
            com.ss.android.ugc.aweme.shortvideo.j.a aVar = new com.ss.android.ugc.aweme.shortvideo.j.a(hVar2.f47602f);
            if (com.ss.android.g.a.b() && hVar.a().contains("normal")) {
                aVar = new b(hVar2, hVar2.f47602f);
            }
            com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) o().c();
            Intrinsics.checkExpressionValueIsNotNull(eVar, "filterModule.filterFunc");
            com.ss.android.ugc.aweme.filter.h e2 = eVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "filterModule.filterFunc.curFilter");
            int i = e2.f47602f;
            m().a(aVar);
            if (I2.f65401b.p) {
                if (hVar2.f47602f == 0) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.0f;
                }
                m().a(0.35f, f2);
            }
            com.ss.android.ugc.aweme.port.in.a.u.a(i);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.filter.h hVar) {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, H, false, 85862, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, H, false, 85862, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE);
            return;
        }
        ShortVideoContextViewModel I2 = this.G.I();
        if (!I2.f()) {
            az azVar = I2.f65401b.O;
            Integer num = null;
            if (hVar != null) {
                str = hVar.f47600d;
            } else {
                str = null;
            }
            azVar.add(str);
            az azVar2 = I2.f65401b.P;
            if (hVar != null) {
                num = Integer.valueOf(hVar.f47598b);
            }
            azVar2.add(String.valueOf(num));
        }
        if (hVar != null) {
            i = hVar.f47602f;
        }
        this.u.a(n().h(), i);
        this.G.d().f67907d = 0.0f;
    }

    public final void b(@NotNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, H, false, 85856, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, H, false, 85856, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean, "sticker");
        fh fhVar = this.G.I().f65401b;
        if (com.ss.android.g.a.b()) {
            this.p = true;
            c(fhVar.p);
        }
        com.ss.android.ugc.aweme.shortvideo.filter.d o = o();
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).b(false, true);
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).c(false, true);
        ((com.ss.android.ugc.aweme.shortvideo.filter.e) o.c()).a(false, true);
        if (fhVar.p) {
            c(false);
            fhVar.p = false;
        }
        if (n().h() != 0) {
            this.J.setValue(0);
        }
        a(j.STICKER_AR, faceStickerBean);
    }

    public final void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, H, false, 85871, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, H, false, 85871, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = new a(this);
        if (!this.o) {
            this.m = i;
            this.n = i2;
            aVar.invoke();
            this.o = true;
        }
    }

    private final void a(j jVar, FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{jVar, faceStickerBean}, this, H, false, 85874, new Class[]{j.class, FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar, faceStickerBean}, this, H, false, 85874, new Class[]{j.class, FaceStickerBean.class}, Void.TYPE);
            return;
        }
        switch (i.f73904a[jVar.ordinal()]) {
            case 1:
                this.G.d().f67905b = new com.ss.android.ugc.aweme.shortvideo.ar.a.a(faceStickerBean, l());
                return;
            case 2:
                this.G.d().f67905b = new a.C0715a();
                return;
            case 3:
                this.G.d().f67905b = new a.C0715a();
                return;
            case 4:
                this.G.d().f67905b = new a.C0715a();
                return;
            case 5:
                this.G.d().f67905b = new ai(t());
                break;
        }
    }

    public final void a(int i, int i2, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, H, false, 85870, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, H, false, 85870, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.r.setValue(b.STATE_OPEN_FAILED);
    }
}
