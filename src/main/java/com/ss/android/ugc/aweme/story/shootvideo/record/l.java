package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.r;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.d;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.h;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.k;
import com.ss.android.ugc.aweme.story.shootvideo.record.scene.StorySceneViewModel;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.c;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import com.ss.android.ugc.aweme.tools.a.g;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.b.f;
import dmt.av.video.b.y;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0006\u00100\u001a\u00020\fJ\u0010\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u000203J\u0006\u00104\u001a\u00020\fJ\u0006\u00105\u001a\u00020\fJ\b\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u000e\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@J\u0018\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020C2\u0006\u0010.\u001a\u00020/H\u0002J \u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u0010F\u001a\u00020\f2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010HH\u0016J\u0018\u0010I\u001a\u00020\f2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KH\u0016J\u0010\u0010M\u001a\u00020\f2\u0006\u0010B\u001a\u00020CH\u0016J\u0012\u0010N\u001a\u00020\f2\b\u0010O\u001a\u0004\u0018\u000107H\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u0010\u0010Q\u001a\u00020\f2\u0006\u0010R\u001a\u00020KH\u0016J\b\u0010S\u001a\u00020\fH\u0016J\b\u0010T\u001a\u00020\fH\u0016J\u0018\u0010U\u001a\u00020\f2\b\u0010O\u001a\u0004\u0018\u0001072\u0006\u0010D\u001a\u00020EJ\b\u0010V\u001a\u000203H\u0016J\b\u0010W\u001a\u00020\fH\u0016J\u0010\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0006\u0010[\u001a\u00020\fJ\u0016\u0010\\\u001a\u00020\f2\u0006\u0010?\u001a\u00020@2\u0006\u0010]\u001a\u000203J\u000e\u0010^\u001a\u00020\f2\u0006\u0010_\u001a\u000203J\b\u0010`\u001a\u00020\fH\u0016J\b\u0010a\u001a\u00020\fH\u0002J\u0006\u0010b\u001a\u00020\fR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPresenter;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/SimpleRecordModulesPresenter;", "Lcom/ss/android/ugc/aweme/shortvideo/widget/RecordLayout$IRecordListener;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerFilterStrategy;", "Lcom/ss/android/ugc/aweme/story/widget/TabHost$OnTabIndexChangedListener;", "storyRecordProvider", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewProvider;", "recordView", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewProvider;Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IAVRecordView;)V", "autoCancelBadRecordTask", "Lkotlin/Function0;", "", "recordController", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "getRecordController", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "recordSpeed", "Lcom/ss/android/ugc/aweme/tools/RecordingSpeed;", "sceneViewModel", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel;", "getSceneViewModel$tools_story_impl_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel;", "shortVideoContextViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;", "shotVideoExtractor", "Lcom/ss/android/ugc/aweme/tools/extract/Extractor;", "getShotVideoExtractor", "()Lcom/ss/android/ugc/aweme/tools/extract/Extractor;", "shotVideoExtractor$delegate", "Lkotlin/Lazy;", "stickerHelper", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryStickerHelper;", "storyRecordViewModel", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewModel;", "getStoryRecordViewModel$tools_story_impl_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewModel;", "storyTextRecord", "Lcom/ss/android/ugc/aweme/story/shootvideo/textrecord/StoryTextRecord;", "getStoryTextRecord", "()Lcom/ss/android/ugc/aweme/story/shootvideo/textrecord/StoryTextRecord;", "updateProgressTask", "Ljava/lang/Runnable;", "addExtraInfoToIntent", "intent", "Landroid/content/Intent;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "cancelSelectSticker", "clearEdit", "cancelSticker", "", "clearRecordData", "forceStopRecord", "getStickerPannel", "", "getUpdateProgressTask", "safeHandler", "Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;", "isEffectAvailable", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "isGoingNext", "recordLength", "", "jump2PhotoEditPage", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "textStickerData", "Lcom/ss/android/ugc/aweme/story/shootvideo/textrecord/TextStickerData;", "onFilter", "responses", "", "onIndexChanged", "peIndex", "", "curIndex", "onPhotoSelected", "onPhotoTaken", "localPath", "onRecordEnd", "onRecordModeConfirmed", "mode", "onRecordStart", "onRecordStartRejected", "onTextRecordTaken", "preventRecord", "recordingScaleEnd", "recordingScaled", "currentY", "", "removeExtractFrames", "resolveStopRecord", "isForce", "setBeautyFaceConfigEnable", "isEnable", "shotScreen", "startAutoCancelTask", "startUpdateProgress", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l extends h implements r, RecordLayout.a, TabHost.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73981a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f73982b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(l.class), "shotVideoExtractor", "getShotVideoExtractor()Lcom/ss/android/ugc/aweme/tools/extract/Extractor;"))};
    private final Lazy K = LazyKt.lazy(new a(this));
    private am L;
    private final o M;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final d f73983c;

    /* renamed from: d  reason: collision with root package name */
    public final ShortVideoContextViewModel f73984d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final StoryRecordViewModel f73985e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final StorySceneViewModel f73986f;
    public Function0<Unit> g;
    final Runnable h;
    @NotNull
    public final c i;
    public final n j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/tools/extract/ShotVideoExtractor;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<com.ss.android.ugc.aweme.tools.extract.h> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.tools.extract.h invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85743, new Class[0], com.ss.android.ugc.aweme.tools.extract.h.class)) {
                return new com.ss.android.ugc.aweme.tools.extract.h(new s<y>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73993a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f73994b;

                    {
                        this.f73994b = r1;
                    }

                    public final /* synthetic */ Object get() {
                        if (!PatchProxy.isSupport(new Object[0], this, f73993a, false, 85744, new Class[0], f.class)) {
                            return new f(this.f73994b.this$0.l());
                        }
                        return (f) PatchProxy.accessDispatch(new Object[0], this, f73993a, false, 85744, new Class[0], f.class);
                    }
                });
            }
            return (com.ss.android.ugc.aweme.tools.extract.h) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85743, new Class[0], com.ss.android.ugc.aweme.tools.extract.h.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85745, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85745, new Class[0], Void.TYPE);
                return;
            }
            if (!this.this$0.f73984d.f() && this.this$0.l().e() / 1000 <= 0) {
                this.this$0.j.a(true, true, 300);
                this.this$0.f73983c.a(true);
            }
        }
    }

    public final void a(int i2) {
    }

    public final void ao_() {
    }

    public final boolean ap_() {
        return false;
    }

    public final e h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f73981a, false, 85714, new Class[0], e.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f73981a, false, 85714, new Class[0], e.class);
        } else {
            value = this.K.getValue();
        }
        return (e) value;
    }

    @NotNull
    public final String i() {
        return "springfestival";
    }

    public final void a(@Nullable List<Effect> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f73981a, false, 85723, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f73981a, false, 85723, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null) {
            Iterator<Effect> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!a(it2.next())) {
                    it2.remove();
                }
            }
        }
    }

    public final boolean a(@Nullable Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, this, f73981a, false, 85724, new Class[]{Effect.class}, Boolean.TYPE)) {
            return !ae.c(effect) && !ae.f(effect) && !ae.l(effect);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f73981a, false, 85724, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73981a, false, 85729, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73981a, false, 85729, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        j();
        this.j.f(true);
        this.f73985e.a(true);
        if (z) {
            k();
        }
    }

    public final boolean a(long j2) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f73981a, false, 85733, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((float) j3) * this.L.value() >= 1000.0f;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f73981a, false, 85733, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f73981a, false, 85716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73981a, false, 85716, new Class[0], Void.TYPE);
            return;
        }
        this.f73983c.a(false);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f73981a, false, 85719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73981a, false, 85719, new Class[0], Void.TYPE);
            return;
        }
        n().e();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f73981a, false, 85717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73981a, false, 85717, new Class[0], Void.TYPE);
        } else if (!this.f73984d.l()) {
            fh fhVar = this.f73984d.f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
            g.a(fhVar, true);
            this.j.f(false);
            this.f73985e.a(false);
            q().f3721e = this;
            q().a();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f73981a, false, 85732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73981a, false, 85732, new Class[0], Void.TYPE);
            return;
        }
        fh fhVar = this.j.I().f65401b;
        fhVar.l.h();
        Iterator it2 = fhVar.m.iterator();
        while (it2.hasNext()) {
            it2.next();
            l().f();
        }
        com.ss.android.ugc.aweme.shortvideo.a.d dVar = fhVar.l;
        Intrinsics.checkExpressionValueIsNotNull(dVar, "shortVideoContext.mWorkspace");
        File g2 = dVar.g();
        Intrinsics.checkExpressionValueIsNotNull(g2, "shortVideoContext.mWorkspace.recordingDirectory");
        com.ss.android.ugc.aweme.video.b.b(new File(g2.getPath()));
        fhVar.m.clear();
        fhVar.n = 0;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f73981a, false, 85734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73981a, false, 85734, new Class[0], Void.TYPE);
            return;
        }
        if (this.D && p().g != null && (!Intrinsics.areEqual((Object) p().g, (Object) FaceStickerBean.NONE))) {
            p().g();
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.story.shootvideo.record.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f73981a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 85715(0x14ed3, float:1.20112E-40)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f73981a
            r3 = 0
            r4 = 85715(0x14ed3, float:1.20112E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            com.ss.android.ugc.aweme.story.shootvideo.record.n r9 = r7.j
            r10 = 0
            r11 = 1
            r12 = 0
            r14 = 4
            r15 = 0
            r9.a(r10, true, 300)
            com.ss.android.ugc.aweme.story.shootvideo.record.base.d r0 = r7.f73983c
            com.ss.android.ugc.aweme.tools.am r1 = r7.L
            r0.a((com.ss.android.ugc.aweme.tools.am) r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r7.f73984d
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.story.shootvideo.record.n r0 = r7.j
            r1 = 1
            r0.j(r1)
        L_0x0049:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r7.f73984d
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f65401b
            java.lang.String r1 = "shortVideoContextViewModel.shortVideoContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.story.shootvideo.record.g.a((com.ss.android.ugc.aweme.shortvideo.fh) r0, (boolean) r8)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f73981a
            r3 = 0
            r4 = 85739(0x14eeb, float:1.20146E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f73981a
            r3 = 0
            r4 = 85739(0x14eeb, float:1.20146E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0097
        L_0x007b:
            com.ss.android.ugc.aweme.story.shootvideo.record.l$b r0 = new com.ss.android.ugc.aweme.story.shootvideo.record.l$b
            r0.<init>(r7)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r7.g = r0
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r0 = r7.C
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r7.g
            if (r1 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.story.shootvideo.record.m r2 = new com.ss.android.ugc.aweme.story.shootvideo.record.m
            r2.<init>(r1)
            r1 = r2
        L_0x0090:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
        L_0x0097:
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordViewModel r0 = r7.f73985e
            r0.a((boolean) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.l.c():void");
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73981a, false, 85730, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73981a, false, 85730, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).b(true);
            c(true);
        } else {
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).b(false, true);
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).c(false, true);
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) o().c()).a(false, true);
            o();
            c(false);
        }
    }

    public final void a_(float f2) {
        Context context;
        float f3;
        Context context2;
        float f4;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f73981a, false, 85718, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f73981a, false, 85718, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        Application a2 = com.ss.android.ugc.aweme.framework.e.a.a();
        int bottom = this.j.n().getBottom();
        float f5 = f2 + 100.0f;
        if (f2 >= 0.0f) {
            float f6 = (float) bottom;
            if (com.ss.android.g.a.b()) {
                context = a2;
                f3 = 225.0f;
            } else {
                context = a2;
                f3 = 210.0f;
            }
            float a3 = f6 - com.ss.android.ttve.utils.c.a(context, f3);
            if (com.ss.android.g.a.b()) {
                context2 = a2;
                f4 = 35.0f;
            } else {
                context2 = a2;
                f4 = 20.0f;
            }
            float a4 = (f5 - com.ss.android.ttve.utils.c.a(context2, f4)) / a3;
            CameraModule n = n();
            if (((double) a4) > 0.98d) {
                a4 = 1.0f;
            }
            n.a(a4, a3);
        }
    }

    public final void a(@NotNull PhotoContext photoContext) {
        if (PatchProxy.isSupport(new Object[]{photoContext}, this, f73981a, false, 85722, new Class[]{PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext}, this, f73981a, false, 85722, new Class[]{PhotoContext.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(photoContext, "photoContext");
        fh fhVar = this.j.I().f65401b;
        Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
        fhVar.d().setContentSource("upload");
        fhVar.d().setContentType("video");
        photoContext.mShootWay = fhVar.r;
        ej a2 = ej.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "PublishManager.inst()");
        photoContext.challenges = a2.f67529b;
        photoContext.mPoiId = fhVar.D;
        photoContext.microAppModel = fhVar.am;
        photoContext.setAvetParameter(fhVar.d());
        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong(1));
        g.a(com.ss.android.ugc.aweme.shortvideo.r.b(fhVar), com.ss.android.ugc.aweme.shortvideo.r.a(photoContext), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.EDIT);
        a(photoContext, fhVar);
    }

    public final void a(@Nullable String str) {
        Long l;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73981a, false, 85720, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f73981a, false, 85720, new Class[]{String.class}, Void.TYPE);
        } else if (str2 == null) {
            this.j.f(true);
            this.f73985e.a(true);
            this.j.a(true, true, 300);
        } else {
            fh fhVar = this.j.I().f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
            fhVar.d().setContentType("photo");
            fhVar.d().setContentSource("shoot");
            PhotoContext fromCapture = PhotoContext.fromCapture(str2, 720, 1280, fhVar.q);
            Intrinsics.checkExpressionValueIsNotNull(fromCapture, "photo");
            fromCapture.setAvetParameter(fhVar.d());
            com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) o().c();
            Intrinsics.checkExpressionValueIsNotNull(eVar, "filterModule.filterFunc");
            com.ss.android.ugc.aweme.filter.h e2 = eVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "filterModule.filterFunc.curFilter");
            fromCapture.mFilterIndex = e2.f47602f;
            com.ss.android.ugc.aweme.shortvideo.filter.e eVar2 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o().c();
            Intrinsics.checkExpressionValueIsNotNull(eVar2, "filterModule.filterFunc");
            com.ss.android.ugc.aweme.filter.h e3 = eVar2.e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "filterModule.filterFunc.curFilter");
            fromCapture.mFilterName = e3.f47599c;
            com.ss.android.ugc.aweme.shortvideo.filter.e eVar3 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o().c();
            Intrinsics.checkExpressionValueIsNotNull(eVar3, "filterModule.filterFunc");
            fromCapture.mBigEyesRate = (float) eVar3.i();
            com.ss.android.ugc.aweme.shortvideo.filter.e eVar4 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o().c();
            Intrinsics.checkExpressionValueIsNotNull(eVar4, "filterModule.filterFunc");
            fromCapture.mSmoothSkinRate = (float) eVar4.k();
            fromCapture.mShootWay = fhVar.r;
            fromCapture.draftId = fhVar.v;
            FaceStickerBean faceStickerBean = p().g;
            if (faceStickerBean != null) {
                l = Long.valueOf(faceStickerBean.getStickerId());
            } else {
                l = null;
            }
            fromCapture.mStickers = String.valueOf(l);
            fromCapture.mCamera = String.valueOf(n().h());
            ej a2 = ej.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "PublishManager.inst()");
            fromCapture.challenges = a2.f67529b;
            g.a(com.ss.android.ugc.aweme.shortvideo.r.b(fhVar), com.ss.android.ugc.aweme.shortvideo.r.a(fromCapture), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.EDIT);
            a(fromCapture, fhVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Intent intent, fh fhVar) {
        Intent intent2 = intent;
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{intent2, fhVar2}, this, f73981a, false, 85738, new Class[]{Intent.class, fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, fhVar2}, this, f73981a, false, 85738, new Class[]{Intent.class, fh.class}, Void.TYPE);
            return;
        }
        intent2.putExtra("send_to_user_head", fhVar2.ar);
        intent2.putExtra("enter_from", fhVar2.s);
    }

    private final void a(PhotoContext photoContext, fh fhVar) {
        if (PatchProxy.isSupport(new Object[]{photoContext, fhVar}, this, f73981a, false, 85736, new Class[]{PhotoContext.class, fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext, fhVar}, this, f73981a, false, 85736, new Class[]{PhotoContext.class, fh.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("story_mediaType", 0);
        intent.putExtra("photo_model", photoContext);
        if (this.f73984d.f65401b.ap != null) {
            StoryFestivalModel storyFestivalModel = this.f73984d.f65401b.ap;
            if (storyFestivalModel != null) {
                intent.putExtra("story_festival_model", storyFestivalModel);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        intent.putExtra("creation_id", this.f73984d.f65401b.q);
        intent.putExtra("av_et_parameter", photoContext.getAvetParameter());
        a(intent, fhVar);
        VideoStoryEditPublishActivity.a(this.j.e(), intent, 4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(@NotNull n nVar, @NotNull com.ss.android.ugc.aweme.story.shootvideo.record.base.c cVar) {
        super(cVar);
        Intrinsics.checkParameterIsNotNull(nVar, "storyRecordProvider");
        Intrinsics.checkParameterIsNotNull(cVar, "recordView");
        this.j = nVar;
        FragmentActivity activity = this.j.e().getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(ShortVideoContextViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(st…extViewModel::class.java]");
        this.f73984d = (ShortVideoContextViewModel) viewModel;
        FragmentActivity activity2 = this.j.e().getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel2 = ViewModelProviders.of(activity2).get(StoryRecordViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(st…ordViewModel::class.java]");
        this.f73985e = (StoryRecordViewModel) viewModel2;
        FragmentActivity activity3 = this.j.e().getActivity();
        if (activity3 == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel3 = ViewModelProviders.of(activity3).get(StorySceneViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel3, "ViewModelProviders.of(st…eneViewModel::class.java]");
        this.f73986f = (StorySceneViewModel) viewModel3;
        this.L = am.NORMAL;
        this.f73983c = new k(this.j.e(), this, new s<e>(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73987a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f73988b;

            {
                this.f73988b = r1;
            }

            public final /* synthetic */ Object get() {
                if (!PatchProxy.isSupport(new Object[0], this, f73987a, false, 85740, new Class[0], e.class)) {
                    return this.f73988b.h();
                }
                return (e) PatchProxy.accessDispatch(new Object[0], this, f73987a, false, 85740, new Class[0], e.class);
            }
        });
        FragmentActivity activity4 = this.j.e().getActivity();
        if (activity4 != null) {
            this.M = new o((AppCompatActivity) activity4, this.f73983c);
            o oVar = this.M;
            if (PatchProxy.isSupport(new Object[0], oVar, o.f73996a, false, 85749, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], oVar, o.f73996a, false, 85749, new Class[0], Void.TYPE);
            } else {
                oVar.f73999d.b();
                com.ss.android.ugc.aweme.shortvideo.sticker.b.c cVar2 = oVar.f73998c;
                if (PatchProxy.isSupport(new Object[0], cVar2, com.ss.android.ugc.aweme.shortvideo.sticker.b.c.f69476a, false, 79073, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar2, com.ss.android.ugc.aweme.shortvideo.sticker.b.c.f69476a, false, 79073, new Class[0], Void.TYPE);
                } else {
                    cVar2.f69477b.a().observe(cVar2.g, cVar2.f69480e);
                    cVar2.f69477b.b().observe(cVar2.g, cVar2.f69481f);
                }
                com.ss.android.ugc.aweme.shortvideo.sticker.b.a aVar = oVar.f73997b;
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.sticker.b.a.f69463a, false, 79063, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.sticker.b.a.f69463a, false, 79063, new Class[0], Void.TYPE);
                } else {
                    aVar.f69465c.a().observe(aVar.k, aVar.h);
                    aVar.f69465c.b().observe(aVar.k, aVar.i);
                    aVar.l.c().observe(aVar.k, aVar.j);
                }
            }
            this.i = new c();
            this.i.f74235e = new c.a(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73989a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ l f73990b;

                {
                    this.f73990b = r1;
                }

                public final void a(String str, TextStickerData textStickerData) {
                    Long l;
                    String str2 = str;
                    TextStickerData textStickerData2 = textStickerData;
                    if (PatchProxy.isSupport(new Object[]{str2, textStickerData2}, this, f73989a, false, 85741, new Class[]{String.class, TextStickerData.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, textStickerData2}, this, f73989a, false, 85741, new Class[]{String.class, TextStickerData.class}, Void.TYPE);
                        return;
                    }
                    l lVar = this.f73990b;
                    Intrinsics.checkExpressionValueIsNotNull(textStickerData2, "data");
                    if (PatchProxy.isSupport(new Object[]{str2, textStickerData2}, lVar, l.f73981a, false, 85721, new Class[]{String.class, TextStickerData.class}, Void.TYPE)) {
                        l lVar2 = lVar;
                        PatchProxy.accessDispatch(new Object[]{str2, textStickerData2}, lVar2, l.f73981a, false, 85721, new Class[]{String.class, TextStickerData.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(textStickerData2, "textStickerData");
                        if (str2 == null) {
                            lVar.j.f(true);
                            lVar.f73985e.a(true);
                        } else {
                            fh fhVar = lVar.j.I().f65401b;
                            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
                            fhVar.d().setContentType("photo");
                            fhVar.d().setContentSource("shoot");
                            PhotoContext fromCapture = PhotoContext.fromCapture(str2, 720, 1280, fhVar.q);
                            Intrinsics.checkExpressionValueIsNotNull(fromCapture, "photo");
                            fromCapture.setAvetParameter(fhVar.d());
                            com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) lVar.o().c();
                            Intrinsics.checkExpressionValueIsNotNull(eVar, "filterModule.filterFunc");
                            com.ss.android.ugc.aweme.filter.h e2 = eVar.e();
                            Intrinsics.checkExpressionValueIsNotNull(e2, "filterModule.filterFunc.curFilter");
                            fromCapture.mFilterIndex = e2.f47602f;
                            com.ss.android.ugc.aweme.shortvideo.filter.e eVar2 = (com.ss.android.ugc.aweme.shortvideo.filter.e) lVar.o().c();
                            Intrinsics.checkExpressionValueIsNotNull(eVar2, "filterModule.filterFunc");
                            com.ss.android.ugc.aweme.filter.h e3 = eVar2.e();
                            Intrinsics.checkExpressionValueIsNotNull(e3, "filterModule.filterFunc.curFilter");
                            fromCapture.mFilterName = e3.f47599c;
                            com.ss.android.ugc.aweme.shortvideo.filter.e eVar3 = (com.ss.android.ugc.aweme.shortvideo.filter.e) lVar.o().c();
                            Intrinsics.checkExpressionValueIsNotNull(eVar3, "filterModule.filterFunc");
                            fromCapture.mBigEyesRate = (float) eVar3.i();
                            com.ss.android.ugc.aweme.shortvideo.filter.e eVar4 = (com.ss.android.ugc.aweme.shortvideo.filter.e) lVar.o().c();
                            Intrinsics.checkExpressionValueIsNotNull(eVar4, "filterModule.filterFunc");
                            fromCapture.mSmoothSkinRate = (float) eVar4.k();
                            fromCapture.mShootWay = fhVar.r;
                            fromCapture.draftId = fhVar.v;
                            FaceStickerBean faceStickerBean = lVar.p().g;
                            if (faceStickerBean != null) {
                                l = Long.valueOf(faceStickerBean.getStickerId());
                            } else {
                                l = null;
                            }
                            fromCapture.mStickers = String.valueOf(l);
                            fromCapture.mCamera = String.valueOf(lVar.n().h());
                            ej a2 = ej.a();
                            Intrinsics.checkExpressionValueIsNotNull(a2, "PublishManager.inst()");
                            fromCapture.challenges = a2.f67529b;
                            g.a(com.ss.android.ugc.aweme.shortvideo.r.b(fhVar), com.ss.android.ugc.aweme.shortvideo.r.a(fromCapture), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.EDIT);
                            if (PatchProxy.isSupport(new Object[]{fromCapture, textStickerData2, fhVar}, lVar, l.f73981a, false, 85737, new Class[]{PhotoContext.class, TextStickerData.class, fh.class}, Void.TYPE)) {
                                l lVar3 = lVar;
                                PatchProxy.accessDispatch(new Object[]{fromCapture, textStickerData2, fhVar}, lVar3, l.f73981a, false, 85737, new Class[]{PhotoContext.class, TextStickerData.class, fh.class}, Void.TYPE);
                            } else {
                                Intent intent = new Intent();
                                intent.putExtra("story_mediaType", 0);
                                intent.putExtra("photo_model", fromCapture);
                                if (lVar.f73984d.f65401b.ap != null) {
                                    StoryFestivalModel storyFestivalModel = lVar.f73984d.f65401b.ap;
                                    if (storyFestivalModel != null) {
                                        intent.putExtra("story_festival_model", storyFestivalModel);
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
                                    }
                                }
                                intent.putExtra("creation_id", lVar.f73984d.f65401b.q);
                                intent.putExtra("text_sticker_data", textStickerData2);
                                intent.putExtra("story_text_record_type", true);
                                intent.putExtra("av_et_parameter", fromCapture.getAvetParameter());
                                lVar.a(intent, fhVar);
                                VideoStoryEditPublishActivity.a(lVar.j.e(), intent, 4);
                            }
                        }
                    }
                    this.f73990b.i.a(true);
                }
            };
            this.h = new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73991a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ l f73992b;

                /* JADX WARNING: type inference failed for: r11v1, types: [com.ss.android.ugc.aweme.story.shootvideo.record.m] */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r14 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f73991a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 85742(0x14eee, float:1.2015E-40)
                        r2 = r14
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0025
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f73991a
                        r5 = 0
                        r6 = 85742(0x14eee, float:1.2015E-40)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r3 = r14
                        com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        return
                    L_0x0025:
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r1 = r14.f73992b
                        com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r1.f73984d
                        boolean r1 = r1.f()
                        if (r1 == 0) goto L_0x0030
                        return
                    L_0x0030:
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r1 = r14.f73992b
                        com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r1.f73984d
                        com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r2 = r14.f73992b
                        com.ss.android.medialib.presenter.MediaRecordPresenter r2 = r2.l()
                        long r2 = r2.e()
                        r4 = 1000(0x3e8, double:4.94E-321)
                        long r2 = r2 / r4
                        r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                        long r2 = com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension.calculateRealTime((long) r2, (double) r4)
                        long r4 = r1.n
                        long r2 = r2 + r4
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r4 = r14.f73992b
                        com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r4 = r4.f73984d
                        long r4 = r4.a()
                        r6 = 0
                        r7 = 0
                        int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                        if (r9 <= 0) goto L_0x007a
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r9 = r14.f73992b
                        kotlin.jvm.functions.Function0<kotlin.Unit> r9 = r9.g
                        if (r9 == 0) goto L_0x007a
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r9 = r14.f73992b
                        com.ss.android.ugc.aweme.shortvideo.SafeHandler r9 = r9.C
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r10 = r14.f73992b
                        kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r10.g
                        if (r10 == 0) goto L_0x0071
                        com.ss.android.ugc.aweme.story.shootvideo.record.m r11 = new com.ss.android.ugc.aweme.story.shootvideo.record.m
                        r11.<init>(r10)
                        r10 = r11
                    L_0x0071:
                        java.lang.Runnable r10 = (java.lang.Runnable) r10
                        r9.removeCallbacks(r10)
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r9 = r14.f73992b
                        r9.g = r6
                    L_0x007a:
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r9 = r14.f73992b
                        com.ss.android.ugc.aweme.story.shootvideo.record.n r9 = r9.j
                        com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout r9 = r9.n()
                        r9.setCurrentStoryProgress(r2)
                        long r9 = r1.f67720c
                        r11 = 1
                        int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                        if (r12 <= 0) goto L_0x008e
                        r9 = 1
                        goto L_0x008f
                    L_0x008e:
                        r9 = 0
                    L_0x008f:
                        int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                        if (r10 <= 0) goto L_0x009f
                        long r12 = r1.f67720c
                        int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                        if (r1 >= 0) goto L_0x009f
                        int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r1 <= 0) goto L_0x009f
                        r1 = 1
                        goto L_0x00a0
                    L_0x009f:
                        r1 = 0
                    L_0x00a0:
                        if (r1 != 0) goto L_0x00b0
                        if (r9 == 0) goto L_0x00a5
                        goto L_0x00b0
                    L_0x00a5:
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r0 = r14.f73992b
                        com.ss.android.ugc.aweme.shortvideo.SafeHandler r0 = r0.C
                        r1 = r14
                        java.lang.Runnable r1 = (java.lang.Runnable) r1
                        r0.post(r1)
                        goto L_0x00c1
                    L_0x00b0:
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r2 = r14.f73992b
                        com.ss.android.ugc.aweme.story.shootvideo.record.base.d r2 = r2.f73983c
                        r2.a(false)
                        if (r1 == 0) goto L_0x00c1
                        com.ss.android.ugc.aweme.story.shootvideo.record.l r0 = r14.f73992b
                        com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r0.f73984d
                        r0.a((long) r7)
                        return
                    L_0x00c1:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.l.AnonymousClass3.run():void");
                }

                {
                    this.f73992b = r1;
                }
            };
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73981a, false, 85726, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73981a, false, 85726, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        fh fhVar = this.f73984d.f65401b;
        switch (i3) {
            case 0:
                k();
                this.j.n().a(241, true, true);
                this.f73984d.a(9);
                Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
                fhVar.d().setShootMode(9);
                this.L = am.NORMAL;
                this.i.a();
                this.i.a(fhVar.q, fhVar.r);
                break;
            case 1:
                this.j.n().a(241, true, true);
                this.L = am.NORMAL;
                fhVar.N = 4;
                this.f73984d.a(4);
                Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
                fhVar.d().setShootMode(4);
                this.i.dismiss();
                this.f73985e.a(10000);
                break;
            case 2:
                this.j.n().a(242, false, false);
                this.L = am.STORY_BOOM;
                fhVar.N = 6;
                Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
                fhVar.d().setShootMode(6);
                this.f73984d.a(6);
                this.i.dismiss();
                this.f73985e.a(1500);
                break;
            case 3:
                k();
                this.j.n().a(243, false, true);
                this.L = am.NORMAL;
                fhVar.N = 4;
                this.f73984d.a(7);
                Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
                fhVar.d().setShootMode(7);
                this.i.dismiss();
                this.f73985e.a(10000);
                break;
        }
        this.j.b(i2, i3);
    }
}
