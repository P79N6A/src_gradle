package com.ss.android.ugc.aweme.shortvideo.cut;

import a.g;
import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020&0,H\u0002J\u0016\u0010-\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020.2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020&H\u0007JF\u00102\u001a\u00020&2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000209H\u0002J\u0012\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u0013H\u0002J\u0018\u0010A\u001a\u00020B2\b\u0010\u0002\u001a\u0004\u0018\u00010.2\u0006\u0010@\u001a\u00020\u0013J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110DH\u0002J\b\u0010E\u001a\u00020\u0013H\u0002J\u0018\u0010F\u001a\u00020&2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104H\u0002J \u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u0011H\u0002J\b\u0010L\u001a\u00020\u0013H\u0002J\u0010\u0010M\u001a\u00020\u00132\b\u0010N\u001a\u0004\u0018\u000105J<\u0010O\u001a\u00020&2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020\u00112\b\b\u0002\u0010V\u001a\u00020\u0003H\u0002J\b\u0010W\u001a\u00020&H\u0007J4\u0010X\u001a\u00020&2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020[2\b\b\u0002\u0010\\\u001a\u00020\u00132\b\b\u0002\u0010]\u001a\u00020[2\b\b\u0002\u0010^\u001a\u00020[J\u000e\u0010_\u001a\u00020&2\u0006\u0010`\u001a\u00020\u0011J\u0010\u0010a\u001a\u00020&2\b\b\u0001\u0010b\u001a\u00020\u0011J\u001e\u0010c\u001a\u00020&2\u0016\u0010d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b0eJ\b\u0010f\u001a\u00020&H\u0002J\u000e\u0010g\u001a\u00020&2\u0006\u0010h\u001a\u00020\u0013J\u0006\u0010i\u001a\u00020&J\u0016\u0010j\u001a\u00020&2\u0006\u0010`\u001a\u00020\u00112\u0006\u0010k\u001a\u00020[R \u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u00138BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u000e\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;", "Landroid/arch/lifecycle/LifecycleObserver;", "workspace", "", "viewProvider", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoViewProvider;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoViewProvider;)V", "<set-?>", "", "currentProgress", "getCurrentProgress", "()J", "cutMultiVideoViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", "duration", "getDuration", "fastImportErrorCode", "", "hadEditorInit", "", "isEnableReuseEditor", "()Z", "isFirst", "isLastPausedByUser", "isVideoPlaying", "lastPlayPosition", "surfaceBackgroundColor", "veEditor", "Lcom/ss/android/ugc/aweme/shortvideo/androidq/QVEEditor;", "veVideoCutterViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", "videoCutter", "Lcom/ss/android/ugc/aweme/shortvideo/cut/IVideoCutter;", "videoEditViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", "videoPlayer", "Lcom/ss/android/ugc/aweme/shortvideo/cut/IVideoPlayer;", "addObserver", "", "attach", "activity", "Landroid/support/v4/app/FragmentActivity;", "callTaskInMain", "task", "Lkotlin/Function0;", "compile", "Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;", "listener", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CutVEEditorCompileListener;", "destroy", "fillVideoData", "videoSegmentList", "", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "videoPathArray", "", "vTrimInArray", "", "vTrimOutArray", "speedArray", "", "rotateArray", "getPreviewConfigure", "Lcom/ss/android/ugc/aweme/shortvideo/model/VEPreviewConfigure;", "isFastImport", "getStartIntent", "Landroid/content/Intent;", "getTargetCompileFps", "Lbolts/Task;", "init", "initFileRotate", "segmentList", "isChangeSpeedEnable", "width", "height", "fps", "isFastImportEnable", "isSegMultiSpeedSupported", "segment", "monitorCompileProcess", "status", "fpsCalculateTime", "compileCostTime", "settings", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CutVideoCompileSettings;", "errorCode", "errorMsg", "performInit", "rotateVideo", "index", "degree", "", "isPreview", "scaleW", "scaleH", "selectPlaySegment", "originIndex", "setBackgroundColor", "color", "setPlayBoundary", "boundary", "Landroid/support/v4/util/Pair;", "stop", "unSelect", "isConfirm", "updatePlayOrder", "updateVideoSpeed", "speed", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VECutVideoPresenter implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3915a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3916b = true;

    /* renamed from: c  reason: collision with root package name */
    long f3917c;

    /* renamed from: d  reason: collision with root package name */
    boolean f3918d;

    /* renamed from: e  reason: collision with root package name */
    public int f3919e = com.ss.android.ugc.aweme.themechange.base.b.f74589e.a(true, false, false, true, false);

    /* renamed from: f  reason: collision with root package name */
    boolean f3920f;
    public ah g;
    public ai h;
    public com.ss.android.ugc.aweme.shortvideo.b.b i;
    CutMultiVideoViewModel j;
    public VEVideoCutterViewModel k;
    public VideoEditViewModel l;
    public final am m;
    private int n = -1;
    private final String o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "operation", "Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEPreviewAction;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f66250b;

        a(VECutVideoPresenter vECutVideoPresenter) {
            this.f66250b = vECutVideoPresenter;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f66249a, false, 75648, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f66249a, false, 75648, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                num = Integer.valueOf(aVar.f66604c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                ai aiVar = this.f66250b.h;
                if (aiVar != null) {
                    aiVar.a(aVar.f66605d);
                }
            } else if (num != null && num.intValue() == 2) {
                ai aiVar2 = this.f66250b.h;
                if (aiVar2 != null) {
                    aiVar2.b(aVar.f66605d);
                }
            } else if (num != null && num.intValue() == 3) {
                ai aiVar3 = this.f66250b.h;
                if (aiVar3 != null) {
                    aiVar3.a(aVar.f66603b, aVar.f66602a);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class b<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f66252b;

        b(Function0 function0) {
            this.f66252b = function0;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f66251a, false, 75649, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66251a, false, 75649, new Class[0], Void.TYPE);
            } else {
                this.f66252b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "then", "(Lbolts/Task;)Lkotlin/Unit;"}, k = 3, mv = {1, 1, 15})
    static final class c<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f66254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f66255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.a.d f66256d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ae f66257e;

        c(VECutVideoPresenter vECutVideoPresenter, long j, com.ss.android.ugc.aweme.shortvideo.a.d dVar, ae aeVar) {
            this.f66254b = vECutVideoPresenter;
            this.f66255c = j;
            this.f66256d = dVar;
            this.f66257e = aeVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00c7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r24) {
            /*
                r23 = this;
                r7 = r23
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r9 = 0
                r0[r9] = r24
                com.meituan.robust.ChangeQuickRedirect r2 = f66253a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r9] = r1
                java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                r3 = 0
                r4 = 75650(0x12782, float:1.06008E-40)
                r1 = r23
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r24
                com.meituan.robust.ChangeQuickRedirect r2 = f66253a
                r3 = 0
                r4 = 75650(0x12782, float:1.06008E-40)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r9] = r1
                java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                r1 = r23
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                kotlin.Unit r0 = (kotlin.Unit) r0
                return r0
            L_0x0039:
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r7.f66255c
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.shortvideo.cut.af r2 = new com.ss.android.ugc.aweme.shortvideo.cut.af
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r7.f66254b
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.a((com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter) r3)
                java.util.List r10 = r3.c()
                java.lang.String r3 = "videoEditViewModel.originVideoList"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r3)
                com.ss.android.ugc.aweme.shortvideo.a.d r3 = r7.f66256d
                java.io.File r3 = r3.c()
                java.lang.String r4 = "workspace.concatVideoFile"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                java.lang.String r11 = r3.getPath()
                java.lang.String r3 = "workspace.concatVideoFile.path"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r3)
                com.ss.android.ugc.aweme.shortvideo.a.d r3 = r7.f66256d
                java.io.File r3 = r3.d()
                java.lang.String r4 = "workspace.concatAudioFile"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                java.lang.String r12 = r3.getPath()
                java.lang.String r3 = "workspace.concatAudioFile.path"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r3)
                r13 = -1
                r14 = -1
                if (r24 == 0) goto L_0x008b
                java.lang.Object r3 = r24.e()
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x008b
                int r3 = r3.intValue()
                r15 = r3
                goto L_0x008f
            L_0x008b:
                r3 = 30
                r15 = 30
            L_0x008f:
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 4032(0xfc0, float:5.65E-42)
                r9 = r2
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r7.f66254b
                com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.i
                if (r3 == 0) goto L_0x00aa
                r3.d((boolean) r8)
            L_0x00aa:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r7.f66254b
                com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.i
                if (r3 == 0) goto L_0x00b4
                r4 = -1
                r3.c((int) r4)
            L_0x00b4:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r7.f66254b
                com.ss.android.ugc.aweme.shortvideo.cut.ah r3 = r3.g
                if (r3 == 0) goto L_0x00c7
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1 r4 = new com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1
                r4.<init>(r7, r0, r2)
                com.ss.android.vesdk.VEListener$g r4 = (com.ss.android.vesdk.VEListener.g) r4
                r3.a((com.ss.android.ugc.aweme.shortvideo.cut.af) r2, (com.ss.android.vesdk.VEListener.g) r4)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x00c7:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.c.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class d<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f66263b;

        d(VECutVideoPresenter vECutVideoPresenter) {
            this.f66263b = vECutVideoPresenter;
        }

        public final /* synthetic */ Object call() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f66262a, false, 75657, new Class[0], Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66262a, false, 75657, new Class[0], Integer.TYPE)).intValue();
            } else {
                List<h> c2 = VECutVideoPresenter.a(this.f66263b).c();
                if (c2 != null) {
                    if (!(!c2.isEmpty())) {
                        c2 = null;
                    }
                    if (c2 != null) {
                        for (h hVar : c2) {
                            if (hVar != null && !hVar.j && hVar.a() > i) {
                                i = hVar.a();
                            }
                        }
                    }
                }
                if (51 <= i && 74 >= i) {
                    i /= 2;
                } else if (i >= 75) {
                    i /= 3;
                }
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"<anonymous>", "", "type", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "", "kotlin.jvm.PlatformType", "onCallback", "com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter$init$1$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f66265b;

        e(VECutVideoPresenter vECutVideoPresenter) {
            this.f66265b = vECutVideoPresenter;
        }

        public final void a(int i, int i2, float f2, String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66264a, false, 75658, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66264a, false, 75658, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (i == 4101) {
                this.f66265b.a((Function0<Unit>) new Function0<Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ e this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void invoke() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75659, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75659, new Class[0], Void.TYPE);
                            return;
                        }
                        VEVideoCutterViewModel vEVideoCutterViewModel = this.this$0.f66265b.k;
                        if (vEVideoCutterViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("veVideoCutterViewModel");
                        }
                        vEVideoCutterViewModel.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onRendered", "com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter$init$1$2"}, k = 3, mv = {1, 1, 15})
    static final class f implements VEListener.k {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f66267b;

        f(VECutVideoPresenter vECutVideoPresenter) {
            this.f66267b = vECutVideoPresenter;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f66266a, false, 75660, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66266a, false, 75660, new Class[0], Void.TYPE);
                return;
            }
            this.f66267b.a((Function0<Unit>) new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ f this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75661, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75661, new Class[0], Void.TYPE);
                        return;
                    }
                    if (this.this$0.f66267b.f3916b) {
                        this.this$0.f66267b.m.q();
                        this.this$0.f66267b.f3916b = false;
                    }
                }
            });
        }
    }

    public final void a(@NotNull Pair<Long, Long> pair) {
        if (PatchProxy.isSupport(new Object[]{pair}, this, f3915a, false, 75635, new Class[]{Pair.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pair}, this, f3915a, false, 75635, new Class[]{Pair.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(pair, "boundary");
        long j2 = 0;
        long s = this.m.s();
        if (pair.first != null) {
            F f2 = pair.first;
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            j2 = ((Number) f2).longValue();
        }
        if (pair.second != null) {
            S s2 = pair.second;
            if (s2 == null) {
                Intrinsics.throwNpe();
            }
            s = ((Number) s2).longValue();
        }
        ah ahVar = this.g;
        if (ahVar != null) {
            ahVar.a((int) j2, (int) s);
        }
    }

    public final boolean a(@Nullable h hVar) {
        h hVar2 = hVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f3915a, false, 75641, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f3915a, false, 75641, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        if (hVar2 != null) {
            int i2 = hVar2.g;
            int i3 = hVar2.h;
            int a2 = hVar.a();
            if (i2 > i3) {
                int i4 = i3;
                i3 = i2;
                i2 = i4;
            }
            if ((i2 >= 1080 || i3 >= 1920) && (i2 > 1080 || i3 > 1920 || a2 >= 35)) {
                return false;
            }
        } else {
            z = false;
        }
        return z;
    }

    public final void a(Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f3915a, false, 75645, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f3915a, false, 75645, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new b<TResult>(function02), i.f1052b);
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3915a, false, 75624, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3915a, false, 75624, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ai aiVar = this.h;
        if (aiVar != null) {
            z = aiVar.b();
        }
        return z;
    }

    public final long a() {
        if (PatchProxy.isSupport(new Object[0], this, f3915a, false, 75622, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f3915a, false, 75622, new Class[0], Long.TYPE)).longValue();
        }
        ai aiVar = this.h;
        if (aiVar != null) {
            return aiVar.c();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        Boolean bool;
        if (PatchProxy.isSupport(new Object[0], this, f3915a, false, 75625, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3915a, false, 75625, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            bool = b2.bP();
            Intrinsics.checkExpressionValueIsNotNull(bool, "SettingsReader.get().ena…eReuseEditorForFastimport");
        } catch (com.bytedance.ies.a unused) {
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3915a, false, 75628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3915a, false, 75628, new Class[0], Void.TYPE);
        } else if (this.f3920f) {
            this.f3920f = false;
            com.ss.android.ugc.aweme.shortvideo.b.b bVar = this.i;
            if (bVar != null) {
                bVar.k();
            }
            if (this.h != null) {
                if (this.h == null) {
                    Intrinsics.throwNpe();
                }
                this.h = null;
            }
            if (this.g != null) {
                if (this.g == null) {
                    Intrinsics.throwNpe();
                }
                this.g = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ff, code lost:
        if (r1 <= java.lang.Integer.parseInt((java.lang.String) r2.get(1))) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0103 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106 A[Catch:{ Exception -> 0x010a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3915a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 75644(0x1277c, float:1.06E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3915a
            r5 = 0
            r6 = 75644(0x1277c, float:1.06E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            com.ss.android.ugc.aweme.property.a r1 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r2 = com.ss.android.ugc.aweme.property.a.C0682a.EnableVEFastImport
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L_0x011c
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r11.l
            if (r1 != 0) goto L_0x003f
            java.lang.String r2 = "videoEditViewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x003f:
            java.util.List r1 = r1.c()
            java.lang.String r2 = "videoEditViewModel.originVideoList"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0055:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.ss.android.ugc.aweme.shortvideo.cut.model.h r5 = (com.ss.android.ugc.aweme.shortvideo.cut.model.h) r5
            boolean r5 = r5.j
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0055
            r2.add(r3)
            goto L_0x0055
        L_0x006c:
            java.util.List r2 = (java.util.List) r2
            com.ss.android.ugc.aweme.shortvideo.cut.am r1 = r11.m
            int r1 = r1.r()
            if (r1 != 0) goto L_0x0117
            java.lang.Object r1 = r2.get(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.model.h r1 = (com.ss.android.ugc.aweme.shortvideo.cut.model.h) r1
            java.lang.String r2 = "segment"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            int r2 = r1.b()
            com.ss.android.ugc.aweme.property.a r3 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r5 = com.ss.android.ugc.aweme.property.a.C0682a.FastImportGopLimit
            int r3 = r3.b(r5)
            if (r2 > r3) goto L_0x0112
            int r2 = r1.a()
            float r2 = (float) r2
            float r3 = r1.f66499f
            float r2 = r2 * r3
            com.ss.android.ugc.aweme.property.a r3 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r5 = com.ss.android.ugc.aweme.property.a.C0682a.FastImportFpsLimit
            int r3 = r3.b(r5)
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0112
            com.ss.android.ugc.aweme.shortvideo.cut.ar$a r2 = com.ss.android.ugc.aweme.shortvideo.cut.ar.f66386a     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = r2.a()     // Catch:{ Exception -> 0x010a }
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x010a }
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = "*"
            r6[r0] = r2     // Catch:{ Exception -> 0x010a }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r5, (java.lang.String[]) r6, (boolean) r7, (int) r8, (int) r9, (java.lang.Object) r10)     // Catch:{ Exception -> 0x010a }
            int r3 = r1.g     // Catch:{ Exception -> 0x010a }
            int r5 = r1.h     // Catch:{ Exception -> 0x010a }
            int r3 = java.lang.Math.min(r3, r5)     // Catch:{ Exception -> 0x010a }
            int r5 = r1.g     // Catch:{ Exception -> 0x010a }
            int r1 = r1.h     // Catch:{ Exception -> 0x010a }
            int r1 = java.lang.Math.max(r5, r1)     // Catch:{ Exception -> 0x010a }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ Exception -> 0x010a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x010a }
            java.lang.String r6 = ""
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ Exception -> 0x010a }
            if (r5 == 0) goto L_0x00e9
            java.lang.Object r1 = r2.get(r0)     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x010a }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x010a }
            if (r3 > r1) goto L_0x00e7
            goto L_0x0101
        L_0x00e7:
            r4 = 0
            goto L_0x0101
        L_0x00e9:
            java.lang.Object r5 = r2.get(r0)     // Catch:{ Exception -> 0x010a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x010a }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x010a }
            if (r3 > r5) goto L_0x00e7
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x010a }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x010a }
            if (r1 > r2) goto L_0x00e7
        L_0x0101:
            if (r4 != 0) goto L_0x0106
            r1 = -11004(0xffffffffffffd504, float:NaN)
            goto L_0x0107
        L_0x0106:
            r1 = 0
        L_0x0107:
            r11.n = r1     // Catch:{ Exception -> 0x010a }
            return r4
        L_0x010a:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.ss.android.ugc.aweme.shortvideo.util.ai.b(r1)
        L_0x0112:
            r1 = -11005(0xffffffffffffd503, float:NaN)
            r11.n = r1
            return r0
        L_0x0117:
            r1 = -11007(0xffffffffffffd501, float:NaN)
            r11.n = r1
            return r0
        L_0x011c:
            r1 = -2
            r11.n = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.d():boolean");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void performInit() {
        int i2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3915a, false, 75627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3915a, false, 75627, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3915a, false, 75630, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3915a, false, 75630, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!this.f3920f) {
                VideoEditViewModel videoEditViewModel = this.l;
                if (videoEditViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                }
                MutableLiveData<com.ss.android.ugc.aweme.shortvideo.cut.model.a> mutableLiveData = videoEditViewModel.r;
                Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "videoEditViewModel.cutVideoContext");
                if (mutableLiveData.getValue() == null) {
                    ai.b("VECutVideoPresenter,init error because of null cutVideoContext");
                } else {
                    VideoEditViewModel videoEditViewModel2 = this.l;
                    if (videoEditViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                    }
                    List c2 = videoEditViewModel2.c();
                    if (c2 != null) {
                        i2 = c2.size();
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        this.f3920f = true;
                        com.ss.android.ugc.aweme.shortvideo.b.b bVar = new com.ss.android.ugc.aweme.shortvideo.b.b(this.o, this.m.C());
                        bVar.b((m) new e(this));
                        bVar.a(p.c.SCALE_MODE_CENTER_INSIDE);
                        bVar.a(true);
                        bVar.g = new f(this);
                        this.i = bVar;
                        List arrayList = new ArrayList();
                        int[] iArr = new int[i2];
                        int[] iArr2 = new int[i2];
                        float[] fArr = new float[i2];
                        int[] iArr3 = new int[i2];
                        a(c2, arrayList, iArr, iArr2, fArr, iArr3);
                        Collection collection = arrayList;
                        Object[] array = collection.toArray(new String[0]);
                        if (array != null) {
                            al alVar = new al((String[]) array);
                            com.ss.android.ugc.aweme.shortvideo.b.b bVar2 = this.i;
                            if (bVar2 == null) {
                                Intrinsics.throwNpe();
                            }
                            this.g = new ap(bVar2, alVar);
                            Context n2 = this.m.n();
                            com.ss.android.ugc.aweme.shortvideo.b.b bVar3 = this.i;
                            if (bVar3 == null) {
                                Intrinsics.throwNpe();
                            }
                            this.h = new aq(n2, bVar3, this.m.C(), this.m.o());
                            com.ss.android.ugc.aweme.shortvideo.b.b bVar4 = this.i;
                            if (bVar4 != null) {
                                Object[] array2 = collection.toArray(new String[0]);
                                if (array2 != null) {
                                    if (bVar4.a((String[]) array2, iArr, iArr2, null, null, null, null, fArr, null, p.i.VIDEO_OUT_RATIO_ORIGINAL) == 0) {
                                        List list = c2;
                                        com.ss.android.ugc.aweme.tools.b.c.a(alVar, c2, iArr, iArr2, fArr, iArr3);
                                        com.ss.android.ugc.aweme.shortvideo.b.b bVar5 = this.i;
                                        if (bVar5 != null) {
                                            bVar5.a(alVar);
                                        }
                                        bVar4.b(this.f3919e);
                                        bVar4.j(30);
                                        bVar4.c(1);
                                        IVideoConfigService iVideoConfigService = com.ss.android.ugc.aweme.port.in.a.r;
                                        Intrinsics.checkExpressionValueIsNotNull(iVideoConfigService, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
                                        int videoWidth = iVideoConfigService.getVideoWidth();
                                        IVideoConfigService iVideoConfigService2 = com.ss.android.ugc.aweme.port.in.a.r;
                                        Intrinsics.checkExpressionValueIsNotNull(iVideoConfigService2, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
                                        bVar4.b(videoWidth, iVideoConfigService2.getVideoHeight());
                                        bVar4.b(com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableSlimVECutProcessor));
                                        bVar4.h();
                                        Pair t = this.m.t();
                                        Long l2 = (Long) t.first;
                                        if (l2 == null) {
                                            l2 = 0L;
                                        }
                                        Intrinsics.checkExpressionValueIsNotNull(l2, "boundary.first ?: 0");
                                        long longValue = l2.longValue();
                                        Long l3 = (Long) t.second;
                                        if (l3 == null) {
                                            l3 = Long.valueOf(this.m.s());
                                        }
                                        Intrinsics.checkExpressionValueIsNotNull(l3, "boundary.second ?: viewProvider.maxDuration()");
                                        bVar4.a((int) longValue, (int) l3.longValue());
                                        List list2 = list;
                                        if (PatchProxy.isSupport(new Object[]{list}, this, f3915a, false, 75637, new Class[]{List.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{list2}, this, f3915a, false, 75637, new Class[]{List.class}, Void.TYPE);
                                        } else if (list2 != null && (!list2.isEmpty())) {
                                            h hVar = (h) list2.get(0);
                                            if (this.m.r() == 0 && hVar.k > 0) {
                                                ah ahVar = this.g;
                                                if (ahVar != null) {
                                                    ahVar.a((float) hVar.k, hVar.l, hVar.m);
                                                }
                                            }
                                        }
                                        if (this.f3918d) {
                                            ai aiVar = this.h;
                                            if (aiVar != null) {
                                                aiVar.c(this.f3918d);
                                            }
                                            this.f3918d = false;
                                        }
                                        ai aiVar2 = this.h;
                                        if (aiVar2 != null) {
                                            aiVar2.a(this.f3917c, p.d.EDITOR_SEEK_FLAG_LastSeek);
                                        }
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                }
            }
            z = true;
        }
        if (!z) {
            this.m.p();
        }
    }

    public static final /* synthetic */ VideoEditViewModel a(VECutVideoPresenter vECutVideoPresenter) {
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.l;
        if (videoEditViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    private final VEPreviewConfigure a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3915a, false, 75640, new Class[]{Boolean.TYPE}, VEPreviewConfigure.class)) {
            return (VEPreviewConfigure) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3915a, false, 75640, new Class[]{Boolean.TYPE}, VEPreviewConfigure.class);
        } else if (!z) {
            return null;
        } else {
            this.m.u();
            VideoEditViewModel videoEditViewModel = this.l;
            if (videoEditViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
            }
            List c2 = videoEditViewModel.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "videoEditViewModel.originVideoList");
            Collection arrayList = new ArrayList();
            for (Object next : c2) {
                if (!((h) next).j) {
                    arrayList.add(next);
                }
            }
            Iterable<h> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (h hVar : iterable) {
                Intrinsics.checkExpressionValueIsNotNull(hVar, AdvanceSetting.NETWORK_TYPE);
                arrayList2.add(new VEVideoSegment(hVar));
            }
            VEPreviewConfigure vEPreviewConfigure = new VEPreviewConfigure((List) arrayList2);
            if (vEPreviewConfigure.getVideoSegments().size() > 1) {
                Pair t = this.m.t();
                Long l2 = (Long) t.first;
                if (l2 == null) {
                    l2 = 0L;
                }
                Intrinsics.checkExpressionValueIsNotNull(l2, "boundary.first ?: 0");
                long longValue = l2.longValue();
                Long l3 = (Long) t.second;
                if (l3 == null) {
                    l3 = Long.valueOf(this.m.s());
                }
                Intrinsics.checkExpressionValueIsNotNull(l3, "boundary.second ?: viewProvider.maxDuration()");
                long longValue2 = l3.longValue();
                vEPreviewConfigure.sceneIn = (int) longValue;
                vEPreviewConfigure.sceneOut = (int) longValue2;
            }
            IVideoConfigService iVideoConfigService = com.ss.android.ugc.aweme.port.in.a.r;
            Intrinsics.checkExpressionValueIsNotNull(iVideoConfigService, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
            vEPreviewConfigure.setPreviewWidth(iVideoConfigService.getVideoWidth());
            IVideoConfigService iVideoConfigService2 = com.ss.android.ugc.aweme.port.in.a.r;
            Intrinsics.checkExpressionValueIsNotNull(iVideoConfigService2, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
            vEPreviewConfigure.setPreviewHeight(iVideoConfigService2.getVideoHeight());
            return vEPreviewConfigure;
        }
    }

    public VECutVideoPresenter(@NotNull String str, @NotNull am amVar) {
        Intrinsics.checkParameterIsNotNull(str, "workspace");
        Intrinsics.checkParameterIsNotNull(amVar, "viewProvider");
        this.o = str;
        this.m = amVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0109  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.shortvideo.a.d r11, boolean r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3915a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.a.d> r1 = com.ss.android.ugc.aweme.shortvideo.a.d.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class<android.content.Intent> r6 = android.content.Intent.class
            r3 = 0
            r4 = 75639(0x12777, float:1.05993E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3915a
            r3 = 0
            r4 = 75639(0x12777, float:1.05993E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.a.d> r1 = com.ss.android.ugc.aweme.shortvideo.a.d.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class<android.content.Intent> r6 = android.content.Intent.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.content.Intent r0 = (android.content.Intent) r0
            return r0
        L_0x004a:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "workspace"
            r2 = r11
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r0.putExtra(r1, r2)
            java.lang.String r1 = "mp4"
            r2 = 0
            if (r12 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r10.l
            if (r3 != 0) goto L_0x0065
            java.lang.String r4 = "videoEditViewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0065:
            java.util.List r3 = r3.c()
            java.lang.String r4 = "videoEditViewModel.originVideoList"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L_0x007b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0091
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.ss.android.ugc.aweme.shortvideo.cut.model.h r6 = (com.ss.android.ugc.aweme.shortvideo.cut.model.h) r6
            boolean r6 = r6.j
            r6 = r6 ^ r9
            if (r6 == 0) goto L_0x007b
            r4.add(r5)
            goto L_0x007b
        L_0x0091:
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r4.get(r8)
            com.ss.android.ugc.aweme.shortvideo.cut.model.h r3 = (com.ss.android.ugc.aweme.shortvideo.cut.model.h) r3
            java.lang.String r3 = r3.f66495b
            goto L_0x00aa
        L_0x009c:
            if (r11 == 0) goto L_0x00a9
            java.io.File r3 = r11.c()
            if (r3 == 0) goto L_0x00a9
            java.lang.String r3 = r3.getAbsolutePath()
            goto L_0x00aa
        L_0x00a9:
            r3 = r2
        L_0x00aa:
            r0.putExtra(r1, r3)
            java.lang.String r1 = "wav"
            if (r12 == 0) goto L_0x00b3
        L_0x00b1:
            r3 = r2
            goto L_0x00bf
        L_0x00b3:
            if (r11 == 0) goto L_0x00b1
            java.io.File r3 = r11.d()
            if (r3 == 0) goto L_0x00b1
            java.lang.String r3 = r3.getPath()
        L_0x00bf:
            r0.putExtra(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r1 = r10.a((boolean) r12)
            if (r1 == 0) goto L_0x00cf
            java.lang.String r3 = "extra_ve_preview_configure"
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putExtra(r3, r1)
        L_0x00cf:
            java.lang.String r1 = "extra_av_is_fast_import"
            r0.putExtra(r1, r12)
            java.lang.String r1 = "extra_fast_import_error_code"
            int r3 = r10.n
            r0.putExtra(r1, r3)
            java.lang.String r1 = "extra_av_enable_fast_import_resolution"
            com.ss.android.ugc.aweme.shortvideo.cut.ar$a r3 = com.ss.android.ugc.aweme.shortvideo.cut.ar.f66386a
            java.lang.String r3 = r3.a()
            r0.putExtra(r1, r3)
            boolean r1 = r10.c()
            if (r1 == 0) goto L_0x0112
            if (r12 == 0) goto L_0x0112
            java.lang.String r1 = "extra_editor_extra"
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r10.i
            if (r3 == 0) goto L_0x00fd
            long r3 = r3.c()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x00fe
        L_0x00fd:
            r3 = r2
        L_0x00fe:
            java.io.Serializable r3 = (java.io.Serializable) r3
            r0.putExtra(r1, r3)
            java.lang.String r1 = "extra_editor_model"
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r10.i
            if (r3 == 0) goto L_0x010d
            com.ss.android.vesdk.q r2 = r3.g()
        L_0x010d:
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r0.putExtra(r1, r2)
        L_0x0112:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.a(com.ss.android.ugc.aweme.shortvideo.a.d, boolean):android.content.Intent");
    }

    private void a(int i2, float f2, boolean z, float f3, float f4) {
        float f5 = f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : 0), Float.valueOf(f3), Float.valueOf(f4)}, this, f3915a, false, 75642, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Byte.valueOf(z), Float.valueOf(f3), Float.valueOf(f4)}, this, f3915a, false, 75642, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            ah ahVar = this.g;
            if (ahVar != null) {
                ahVar.a(f5, f3, f4);
            }
        } else {
            ah ahVar2 = this.g;
            if (ahVar2 != null) {
                ahVar2.a(i2, f5);
            }
        }
    }

    private final void a(List<? extends h> list, List<String> list2, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        List<? extends h> list3;
        List<String> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list, list4, iArr, iArr2, fArr, iArr3}, this, f3915a, false, 75636, new Class[]{List.class, List.class, int[].class, int[].class, float[].class, int[].class}, Void.TYPE)) {
            Object[] objArr = {list, list4, iArr, iArr2, fArr, iArr3};
            PatchProxy.accessDispatch(objArr, this, f3915a, false, 75636, new Class[]{List.class, List.class, int[].class, int[].class, float[].class, int[].class}, Void.TYPE);
            return;
        }
        if (list != null) {
            if (!list.isEmpty()) {
                list3 = list;
            } else {
                list3 = null;
            }
            if (list3 != null) {
                int i2 = 0;
                for (Object next : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    h hVar = (h) next;
                    String str = hVar.f66495b;
                    Intrinsics.checkExpressionValueIsNotNull(str, "videoSegment.path");
                    list4.add(str);
                    iArr[i2] = (int) hVar.f66497d;
                    iArr2[i2] = (int) hVar.f66498e;
                    fArr[i2] = hVar.f66499f;
                    iArr3[i2] = hVar.k;
                    i2 = i3;
                }
                if (this.m.r() == 0) {
                    iArr[0] = 0;
                    iArr2[0] = (int) ((h) list3.get(0)).f66496c;
                    iArr3[0] = 0;
                }
                return;
            }
        }
    }

    public final void a(int i2, long j2, long j3, af afVar, int i3, String str) {
        long j4 = j2;
        long j5 = j3;
        af afVar2 = afVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5), afVar2, Integer.valueOf(i3), str2}, this, f3915a, false, 75647, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, af.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5), afVar2, Integer.valueOf(i3), str2}, this, f3915a, false, 75647, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, af.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        int i4 = i2;
        n.a("av_ve_import_compile", i4, com.ss.android.ugc.aweme.tools.b.a.a(MapsKt.mapOf(TuplesKt.to("fps_time", String.valueOf(j2)), TuplesKt.to("compile_time", String.valueOf(j3)), TuplesKt.to("is_hard_encode", String.valueOf(afVar2.h)), TuplesKt.to("fps", String.valueOf(afVar2.g)), TuplesKt.to("errorCode", String.valueOf(i3)), TuplesKt.to("error_message", str2))));
    }

    public static /* synthetic */ void a(VECutVideoPresenter vECutVideoPresenter, int i2, float f2, boolean z, float f3, float f4, int i3) {
        boolean z2;
        float f5;
        float f6;
        if ((i3 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i3 & 8) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f3;
        }
        if ((i3 & 16) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f4;
        }
        vECutVideoPresenter.a(i2, f2, z2, f5, f6);
    }
}
