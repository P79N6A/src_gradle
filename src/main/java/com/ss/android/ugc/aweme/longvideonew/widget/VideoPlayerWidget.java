package com.ss.android.ugc.aweme.longvideonew.widget;

import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.freeflowcard.b.a;
import com.ss.android.ugc.aweme.longvideo.j;
import com.ss.android.ugc.aweme.longvideonew.a.a;
import com.ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 D2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001DB1\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0016H\u0016J\u0012\u0010(\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010*\u001a\u00020#H\u0016J\u0010\u0010+\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020#H\u0016J\u0012\u0010.\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u00100\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u00101\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u00102\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u00109\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0012\u0010?\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010@\u001a\u00020#2\b\u0010A\u001a\u0004\u0018\u000104H\u0016J\b\u0010B\u001a\u00020#H\u0002J\b\u0010C\u001a\u00020#H\u0002R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006E"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/widget/VideoPlayerWidget;", "Lcom/ss/android/ugc/aweme/utils/GenericWidget;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mEventType", "", "mPageType", "", "mBusinessType", "mDialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;ILjava/lang/String;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMBusinessType", "()Ljava/lang/String;", "getMDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "mDialogShowing", "", "getMEventType", "mLongVideoPlayerView", "Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView;", "getMLongVideoPlayerView", "()Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView;", "setMLongVideoPlayerView", "(Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView;)V", "mLongVideoRawAdLogger", "Lcom/ss/android/ugc/aweme/commercialize/log/LongVideoRawAdLogger;", "getMPageType", "()I", "onBindView", "", "view", "Landroid/view/View;", "onBuffering", "start", "onChanged", "t", "onCreate", "onDecoderBuffering", "onDestroy", "onPause", "onPausePlay", "sourceId", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResume", "onResumePlay", "onRetryOnError", "obj", "showMobileWarnDialog", "tryAdapterPlayVideoSize", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoPlayerWidget extends GenericWidget implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, com.ss.android.ugc.aweme.video.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54092a;
    public static final a q = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.longvideonew.a.a f54093b;
    public boolean k;
    @Nullable
    public final Aweme l;
    @NotNull
    public final String m;
    public final int n;
    @NotNull
    public final String o;
    @Nullable
    public final com.ss.android.ugc.aweme.feed.d p;
    private x r = new x(this.l);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/widget/VideoPlayerWidget$Companion;", "", "()V", "ACTION_RESIZE_VIDEO_AND_COVER", "", "ACTION_VIDEO_ON_BUFFERING", "ACTION_VIDEO_ON_PAUSE_PLAY", "ACTION_VIDEO_ON_PLAY_COMPLETED", "ACTION_VIDEO_ON_PLAY_FAIL", "ACTION_VIDEO_ON_PLAY_PROGRESS_CHANGE", "ACTION_VIDEO_ON_PREPARE_PLAY", "ACTION_VIDEO_ON_RENDER_FIRST_FRAME", "ACTION_VIDEO_ON_RENDER_READY", "ACTION_VIDEO_ON_RESUME_PLAY", "ACTION_VIDEO_SECONDARY_PROGRESS", "COMPLETE_PROGRESS", "", "SEEK_COMPLETE_PROGRESS_DELAY_TIME", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/widget/VideoPlayerWidget$onBindView$1", "Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$IVideoPlayerCallBack;", "onSecondaryProgress", "", "progress", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPlayerWidget f54095b;

        b(VideoPlayerWidget videoPlayerWidget) {
            this.f54095b = videoPlayerWidget;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54094a, false, 57000, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54094a, false, 57000, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f54095b.g.a("action_video_secondary_progress", (Object) Integer.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/widget/VideoPlayerWidget$onBindView$2", "Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$IVideoPlayInterceptor;", "canPlay", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPlayerWidget f54097b;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x009a, code lost:
            if (android.text.TextUtils.isEmpty(r3.c()) == false) goto L_0x009c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a() {
            /*
                r10 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f54096a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r4 = 0
                r5 = 57001(0xdea9, float:7.9875E-41)
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x002c
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f54096a
                r5 = 0
                r6 = 57001(0xdea9, float:7.9875E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r10
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x002c:
                com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget r1 = r10.f54097b
                boolean r1 = r1.k
                if (r1 == 0) goto L_0x0033
                return r0
            L_0x0033:
                com.ss.android.ugc.aweme.base.utils.m r1 = com.ss.android.ugc.aweme.base.utils.m.a()
                java.lang.String r2 = "NetworkStateManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                boolean r1 = r1.b()
                r2 = 1
                if (r1 == 0) goto L_0x0044
                return r2
            L_0x0044:
                com.ss.android.ugc.aweme.freeflowcard.a.a r1 = com.ss.android.ugc.aweme.freeflowcard.a.a.a()
                com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget r3 = r10.f54097b
                java.lang.String r3 = r3.m
                boolean r1 = r1.a(r3)
                if (r1 != 0) goto L_0x00b4
                com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget r1 = r10.f54097b
                java.lang.Object[] r3 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget.f54092a
                r6 = 0
                r7 = 56988(0xde9c, float:7.9857E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]
                java.lang.Class r9 = java.lang.Void.TYPE
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0078
                java.lang.Object[] r3 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget.f54092a
                r6 = 0
                r7 = 56988(0xde9c, float:7.9857E-41)
                java.lang.Class[] r8 = new java.lang.Class[r0]
                java.lang.Class r9 = java.lang.Void.TYPE
                r4 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x00b3
            L_0x0078:
                com.ss.android.ugc.aweme.base.utils.m r3 = com.ss.android.ugc.aweme.base.utils.m.a()
                java.lang.String r4 = "NetworkStateManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                boolean r3 = r3.b()
                if (r3 == 0) goto L_0x009c
                com.ss.android.ugc.aweme.freeflowcard.b r3 = com.ss.android.ugc.aweme.freeflowcard.b.a()
                java.lang.String r4 = "FlowCardDataManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                java.lang.String r3 = r3.c()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00b3
            L_0x009c:
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r1.f54093b
                if (r3 == 0) goto L_0x00a3
                r3.c()
            L_0x00a3:
                com.ss.android.ugc.aweme.feed.d r3 = r1.p
                if (r3 == 0) goto L_0x00b1
                com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$e r4 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$e
                r4.<init>(r1)
                com.ss.android.ugc.aweme.freeflowcard.b.a$a r4 = (com.ss.android.ugc.aweme.freeflowcard.b.a.C0575a) r4
                r3.a((com.ss.android.ugc.aweme.freeflowcard.b.a.C0575a) r4)
            L_0x00b1:
                r1.k = r2
            L_0x00b3:
                return r0
            L_0x00b4:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget.c.a():boolean");
        }

        c(VideoPlayerWidget videoPlayerWidget) {
            this.f54097b = videoPlayerWidget;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPlayerWidget f54099b;

        d(VideoPlayerWidget videoPlayerWidget) {
            this.f54099b = videoPlayerWidget;
        }

        public final void run() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f54098a, false, 57002, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54098a, false, 57002, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.longvideonew.a.a aVar = this.f54099b.f54093b;
            if (aVar != null) {
                Aweme aweme = this.f54099b.l;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                aVar.e(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/widget/VideoPlayerWidget$showMobileWarnDialog$1", "Lcom/ss/android/ugc/aweme/freeflowcard/widget/FreeFlowCardDialog$OnDialogButtonClickListener;", "onCancel", "", "dialog", "Landroid/app/Dialog;", "onConfirm", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements a.C0575a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPlayerWidget f54101b;

        e(VideoPlayerWidget videoPlayerWidget) {
            this.f54101b = videoPlayerWidget;
        }

        public final void a(@NotNull Dialog dialog) {
            if (PatchProxy.isSupport(new Object[]{dialog}, this, f54100a, false, 57003, new Class[]{Dialog.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialog}, this, f54100a, false, 57003, new Class[]{Dialog.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            this.f54101b.k = false;
            com.ss.android.ugc.aweme.longvideonew.a.a aVar = this.f54101b.f54093b;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void b(@NotNull Dialog dialog) {
            Dialog dialog2 = dialog;
            if (PatchProxy.isSupport(new Object[]{dialog2}, this, f54100a, false, 57004, new Class[]{Dialog.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialog2}, this, f54100a, false, 57004, new Class[]{Dialog.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dialog2, "dialog");
            this.f54101b.k = false;
        }
    }

    public final void b(@Nullable com.ss.android.ugc.aweme.video.e eVar) {
    }

    public final void c(boolean z) {
    }

    public final void d(@Nullable String str) {
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f54092a, false, 56983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54092a, false, 56983, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Observer observer = this;
        this.g.a("action_seek_stop_tracking_touch", observer).a("action_play_control", observer).a("action_replay", observer);
        if (x.f2923e.a(this.l)) {
            x xVar = this.r;
            if (PatchProxy.isSupport(new Object[0], xVar, x.f2920a, false, 31811, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], xVar, x.f2920a, false, 31811, new Class[0], Void.TYPE);
                return;
            }
            bg.c(xVar);
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f54092a, false, 56985, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54092a, false, 56985, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        com.ss.android.ugc.aweme.longvideonew.a.a aVar = this.f54093b;
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56949, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56949, new Class[0], Void.TYPE);
            } else {
                aVar.c();
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f54092a, false, 56984, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54092a, false, 56984, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        com.ss.android.ugc.aweme.longvideonew.a.a aVar = this.f54093b;
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56948, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56948, new Class[0], Void.TYPE);
            } else {
                if (aVar.f54023d.f45077a != 0) {
                    aVar.b();
                }
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f54092a, false, 56986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54092a, false, 56986, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.longvideonew.a.a aVar = this.f54093b;
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56950, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56950, new Class[0], Void.TYPE);
            } else {
                g.f().b((com.ss.android.ugc.aweme.video.preload.a) aVar);
                if (aVar.g.b((com.ss.android.ugc.aweme.video.a.a) aVar)) {
                    aVar.f54025f.a();
                }
                aVar.f54024e.b(aVar.i);
                aVar.f54022c.clear();
                try {
                    aVar.g.n();
                    aVar.g.j();
                } catch (Throwable unused) {
                }
            }
        }
        if (x.f2923e.a(this.l)) {
            this.r.a();
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
        com.ss.android.ugc.aweme.video.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f54092a, false, 56995, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f54092a, false, 56995, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_render_ready", (Object) aVar2);
    }

    public final void b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54092a, false, 56990, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54092a, false, 56990, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_resume_play", (Object) str2);
    }

    public final void c(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54092a, false, 56991, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54092a, false, 56991, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_pause_play", (Object) str2);
    }

    public final void e(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54092a, false, 56998, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54092a, false, 56998, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_play_completed", (Object) "onPlayCompleted");
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f54092a, false, 56999, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f54092a, false, 56999, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_play_progress_change", (Object) Float.valueOf(f2));
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54092a, false, 56997, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54092a, false, 56997, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_buffering", (Object) Boolean.valueOf(z));
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.b bVar) {
        o oVar;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f54092a, false, 56993, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f54092a, false, 56993, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        this.g.a("on_render_first_frame", (Object) bVar);
        if (PatchProxy.isSupport(new Object[0], this, f54092a, false, 56994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54092a, false, 56994, new Class[0], Void.TYPE);
            return;
        }
        try {
            Integer bK = com.ss.android.ugc.aweme.global.config.settings.g.b().bK();
            if (bK != null) {
                if (bK.intValue() == 1) {
                    com.ss.android.ugc.aweme.longvideonew.a.a aVar = this.f54093b;
                    if (aVar != null) {
                        oVar = aVar.g;
                    } else {
                        oVar = null;
                    }
                    if (oVar != null) {
                        int q2 = oVar.q();
                        int r2 = oVar.r();
                        Video a2 = j.f53966b.a(this.l);
                        if (q2 > 0 && r2 > 0 && this.l != null && a2 != null && a2.getWidth() > 0 && a2.getHeight() > 0 && com.ss.android.ugc.aweme.feed.g.b.a(a2.getWidth(), a2.getHeight(), q2, r2)) {
                            a2.setWidth(q2);
                            a2.setHeight(r2);
                            UrlModel originCover = a2.getOriginCover();
                            if (originCover != null) {
                                originCover.setWidth(q2);
                            }
                            UrlModel originCover2 = a2.getOriginCover();
                            if (originCover2 != null) {
                                originCover2.setHeight(r2);
                            }
                            this.g.a("resize_video_and_cover", (Object) new com.ss.android.ugc.aweme.longvideonew.feature.c(q2, r2));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54092a, false, 56989, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54092a, false, 56989, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            str = aVar.f34376a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 561796795) {
                if (hashCode != 710880054) {
                    if (hashCode == 1497529872 && str.equals("action_replay")) {
                        com.ss.android.ugc.aweme.longvideonew.a.a aVar2 = this.f54093b;
                        if (aVar2 != null) {
                            aVar2.b();
                        }
                    }
                } else if (str.equals("action_seek_stop_tracking_touch")) {
                    Object a2 = aVar.a();
                    if (a2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    } else if (((Float) a2).floatValue() == 100.0f) {
                        View view = this.f2711f;
                        if (view != null) {
                            view.postDelayed(new d(this), 600);
                        }
                    } else {
                        com.ss.android.ugc.aweme.longvideonew.a.a aVar3 = this.f54093b;
                        if (aVar3 != null) {
                            Object a3 = aVar.a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "t.getData()");
                            aVar3.b(((Number) a3).floatValue());
                        }
                    }
                }
            } else if (str.equals("action_play_control")) {
                com.ss.android.ugc.aweme.longvideonew.a.a aVar4 = this.f54093b;
                if (aVar4 != null) {
                    if (PatchProxy.isSupport(new Object[0], aVar4, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56947, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar4, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56947, new Class[0], Void.TYPE);
                    } else if (aVar4.f54023d.f45077a == 3) {
                        aVar4.b();
                    } else {
                        aVar4.c();
                    }
                }
            }
        }
    }

    public final void a(@Nullable View view) {
        boolean z;
        boolean z2;
        o oVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54092a, false, 56987, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54092a, false, 56987, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        if ("long_video_player_activity".equals(this.o)) {
            z2 = true;
            z = true;
        } else {
            z2 = false;
            z = false;
        }
        if (view != null) {
            this.f54093b = new com.ss.android.ugc.aweme.longvideonew.a.a((ViewGroup) view, this.l, z2, z);
            com.ss.android.ugc.aweme.longvideonew.a.a aVar = this.f54093b;
            if (aVar != null) {
                aVar.a((com.ss.android.ugc.aweme.video.a.a) this);
            }
            com.ss.android.ugc.aweme.longvideonew.a.a aVar2 = this.f54093b;
            if (aVar2 != null) {
                Aweme aweme = this.l;
                String str = this.m;
                int i = this.n;
                com.ss.android.ugc.aweme.longvideonew.a.a aVar3 = this.f54093b;
                if (aVar3 != null) {
                    oVar = aVar3.g;
                } else {
                    oVar = null;
                }
                aVar2.a((com.ss.android.ugc.aweme.video.a.a) new com.ss.android.ugc.aweme.longvideonew.c(aweme, str, i, oVar));
            }
            if (x.f2923e.a(this.l)) {
                com.ss.android.ugc.aweme.longvideonew.a.a aVar4 = this.f54093b;
                if (aVar4 != null) {
                    aVar4.a((com.ss.android.ugc.aweme.video.a.a) this.r);
                }
            }
            com.ss.android.ugc.aweme.longvideonew.a.a aVar5 = this.f54093b;
            if (aVar5 != null) {
                a.c bVar = new b(this);
                if (PatchProxy.isSupport(new Object[]{bVar}, aVar5, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56966, new Class[]{a.c.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.longvideonew.a.a aVar6 = aVar5;
                    PatchProxy.accessDispatch(new Object[]{bVar}, aVar6, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56966, new Class[]{a.c.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(bVar, "videoPlayerViewCallBack");
                    aVar5.h = bVar;
                }
            }
            com.ss.android.ugc.aweme.longvideonew.a.a aVar7 = this.f54093b;
            if (aVar7 != null) {
                a.b cVar = new c(this);
                if (PatchProxy.isSupport(new Object[]{cVar}, aVar7, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56968, new Class[]{a.b.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.longvideonew.a.a aVar8 = aVar7;
                    PatchProxy.accessDispatch(new Object[]{cVar}, aVar8, com.ss.android.ugc.aweme.longvideonew.a.a.f54020a, false, 56968, new Class[]{a.b.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(cVar, "interceptor");
                    aVar7.f54021b.add(cVar);
                    return;
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.e eVar) {
        com.ss.android.ugc.aweme.video.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f54092a, false, 56996, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f54092a, false, 56996, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_play_fail", (Object) eVar2);
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54092a, false, 56992, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54092a, false, 56992, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.g.a("action_video_on_prepare_play", (Object) str2);
    }

    public VideoPlayerWidget(@Nullable Aweme aweme, @NotNull String str, int i, @NotNull String str2, @Nullable com.ss.android.ugc.aweme.feed.d dVar) {
        Intrinsics.checkParameterIsNotNull(str, "mEventType");
        Intrinsics.checkParameterIsNotNull(str2, "mBusinessType");
        this.l = aweme;
        this.m = str;
        this.n = i;
        this.o = str2;
        this.p = dVar;
    }
}
