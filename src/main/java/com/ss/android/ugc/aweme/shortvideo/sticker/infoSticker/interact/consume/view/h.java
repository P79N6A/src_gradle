package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.log.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ey;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0003uvwB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010T\u001a\u0004\u0018\u00010\r2\b\u0010U\u001a\u0004\u0018\u00010\rH\u0002J0\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010[\u001a\u00020&H\u0002J\u0018\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020\nH\u0002J\u0010\u0010_\u001a\u00020W2\u0006\u0010A\u001a\u00020\nH\u0003J\u0012\u0010`\u001a\u00020&2\b\u0010a\u001a\u0004\u0018\u00010bH\u0016J\u000f\u0010B\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010cJ\b\u0010d\u001a\u00020\nH\u0002J\u0010\u0010e\u001a\u00020W2\u0006\u0010f\u001a\u00020\rH\u0002J\b\u0010g\u001a\u00020WH\u0002J(\u0010h\u001a\u00020W2\u0006\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010Z\u001a\u00020\nH\u0002J\b\u0010i\u001a\u00020WH\u0014J\u0012\u0010j\u001a\u00020W2\b\u0010k\u001a\u0004\u0018\u00010lH\u0014J(\u0010m\u001a\u00020W2\u0006\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010Z\u001a\u00020\nH\u0002J6\u0010n\u001a\u00020W2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010%\u001a\u00020&2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010\u001f\u001a\u0004\u0018\u00010 J(\u0010o\u001a\u00020W2\u0006\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020G2\u0006\u0010p\u001a\u00020G2\u0006\u0010Z\u001a\u00020\nH\u0002J \u0010q\u001a\u00020W2\u0006\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020G2\u0006\u0010p\u001a\u00020GH\u0002J\u0017\u0010r\u001a\u00020W2\b\u0010s\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0002\u0010tR\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001e\u0010-\u001a\u00060.R\u00020\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020=X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020=X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010P\u001a\u00020Q¢\u0006\b\n\u0000\u001a\u0004\bR\u0010S¨\u0006x"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView;", "Landroid/widget/RelativeLayout;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/IStatusView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "EDIT_TEXT_TITLE_TYPEFACE", "", "NO_ONE_VOTE", "", "aid", "animEndListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$OnAnimFinishListener;", "getAnimEndListener", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$OnAnimFinishListener;", "api", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteApi;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "getInteractStickerParams", "()Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "setInteractStickerParams", "(Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "interactStickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "getInteractStickerStruct", "()Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "setInteractStickerStruct", "(Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;)V", "isSelf", "", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "pbListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$ClickListener;", "getPbListener", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$ClickListener;", "setPbListener", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$ClickListener;)V", "pbQuestion1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DispathTouchEventView;", "pbQuestion2", "points", "", "getPoints", "()[F", "setPoints", "([F)V", "rlQuestion1", "Landroid/view/ViewGroup;", "rlQuestion2", "selectOptionId", "", "status", "getStatus", "()I", "setStatus", "(I)V", "tvQuestion1", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "tvQuestion1Percent", "tvQuestion2", "tvQuestion2Percent", "tvTitle", "voteEventListener", "Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;", "voteStruct", "Lcom/ss/android/ugc/aweme/sticker/data/VoteStruct;", "voteView", "Landroid/widget/FrameLayout;", "getVoteView", "()Landroid/widget/FrameLayout;", "adjustText", "text", "animationRun", "", "pbQuestion", "tvQuestion", "progress", "shouldNotify", "calculateProgress", "index", "currentAppend", "changeStatus", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "()Ljava/lang/Integer;", "getVoteStatus", "mobAdClick", "area", "mobClick", "onClickItem", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onUnClickItem", "setData", "setSelectState", "tvQuestionPercent", "setUnSelectState", "vote", "optionId", "(Ljava/lang/Long;)V", "ClickListener", "Companion", "OnAnimFinishListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends RelativeLayout implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70042a;
    public static final b n = new b((byte) 0);
    @Nullable
    private InteractStickerStruct A;
    @NotNull
    private a B;
    @NotNull
    private final c C;

    /* renamed from: b  reason: collision with root package name */
    public final DispathTouchEventView f70043b;

    /* renamed from: c  reason: collision with root package name */
    public final DmtTextView f70044c;

    /* renamed from: d  reason: collision with root package name */
    public final DmtTextView f70045d;

    /* renamed from: e  reason: collision with root package name */
    public final DispathTouchEventView f70046e;

    /* renamed from: f  reason: collision with root package name */
    public final DmtTextView f70047f;
    public final DmtTextView g;
    public String h = "";
    public final CompositeDisposable i;
    final float j;
    public long k;
    public VoteStruct l;
    public com.ss.android.ugc.aweme.sticker.a.c m;
    private final DmtTextView o;
    private final ViewGroup p;
    private final ViewGroup q;
    private boolean r;
    private final VoteApi s;
    private final String t;
    @Nullable
    private com.ss.android.ugc.aweme.sticker.d u;
    private int v;
    @Nullable
    private float[] w;
    private final Paint x;
    @NotNull
    private final Path y;
    @NotNull
    private final FrameLayout z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$ClickListener;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DispathTouchEventView$OnClickProgressBar;", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView;)V", "onClick", "", "id", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class a implements DispathTouchEventView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70048a;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
            if (r1 == null) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e1, code lost:
            if (r1 == null) goto L_0x01e3;
         */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x015a  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x02ad  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x02cc  */
        @android.annotation.SuppressLint({"SetTextI18n"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r16) {
            /*
                r15 = this;
                r7 = r15
                r8 = r16
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r10 = 0
                r0[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f70048a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 79725(0x1376d, float:1.11719E-40)
                r1 = r15
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003d
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r0[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f70048a
                r3 = 0
                r4 = 79725(0x1376d, float:1.11719E-40)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r15
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003d:
                r0 = 2131171482(0x7f07189a, float:1.7957352E38)
                r1 = 1
                r3 = 0
                r4 = 1120403456(0x42c80000, float:100.0)
                r5 = 0
                if (r8 != r0) goto L_0x01b5
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r8 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r8)
                boolean r0 = r0.isLogin()
                if (r0 != 0) goto L_0x0082
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                android.content.Context r0 = r0.getContext()
                if (r0 == 0) goto L_0x007a
                android.app.Activity r0 = (android.app.Activity) r0
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.d r1 = r1.getInteractStickerParams()
                if (r1 == 0) goto L_0x0072
                com.ss.android.ugc.aweme.sticker.c r1 = r1.n
                if (r1 == 0) goto L_0x0072
                java.lang.String r1 = r1.f71627b
                if (r1 != 0) goto L_0x0074
            L_0x0072:
                java.lang.String r1 = ""
            L_0x0074:
                java.lang.String r2 = ""
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2)
                return
            L_0x007a:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
                r0.<init>(r1)
                throw r0
            L_0x0082:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.l
                if (r8 == 0) goto L_0x009d
                java.util.List r8 = r8.getOptions()
                if (r8 == 0) goto L_0x009d
                java.lang.Object r8 = r8.get(r10)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r8 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r8
                if (r8 == 0) goto L_0x009d
                long r11 = r8.getOptionId()
                goto L_0x009e
            L_0x009d:
                r11 = r5
            L_0x009e:
                r0.k = r11
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                float r0 = r0.a(r10, r9)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f70045d
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "%.0f"
                java.lang.Object[] r13 = new java.lang.Object[r9]
                java.lang.Float r14 = java.lang.Float.valueOf(r0)
                r13[r10] = r14
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r9)
                java.lang.String r12 = java.lang.String.format(r12, r13)
                java.lang.String r13 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r13)
                r11.append(r12)
                java.lang.String r12 = "%"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r8.setText(r11)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.g
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "%.0f"
                java.lang.Object[] r13 = new java.lang.Object[r9]
                float r4 = r4 - r0
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r13[r10] = r4
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r13, r9)
                java.lang.String r4 = java.lang.String.format(r12, r4)
                java.lang.String r12 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r12)
                r11.append(r4)
                java.lang.String r4 = "%"
                r11.append(r4)
                java.lang.String r4 = r11.toString()
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r8.setText(r4)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f70043b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r11 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r11.f70044c
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r12 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r12.f70045d
                int r0 = (int) r0
                r4.a(r8, r11, r12, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f70046e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r11 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r11.f70047f
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r12 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r12.g
                int r0 = 100 - r0
                r4.b(r8, r11, r12, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                r0.setStatus(r9)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r4.l
                if (r4 == 0) goto L_0x0151
                java.util.List r4 = r4.getOptions()
                if (r4 == 0) goto L_0x0151
                java.lang.Object r4 = r4.get(r10)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r4 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r4
                if (r4 == 0) goto L_0x0151
                long r3 = r4.getOptionId()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
            L_0x0151:
                r0.a((java.lang.Long) r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r0.l
                if (r0 == 0) goto L_0x0177
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.l
                if (r3 == 0) goto L_0x0173
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x0173
                java.lang.Object r3 = r3.get(r10)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x0173
                long r3 = r3.getOptionId()
                goto L_0x0174
            L_0x0173:
                r3 = r5
            L_0x0174:
                r0.setSelectOptionId(r3)
            L_0x0177:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r0.l
                if (r0 == 0) goto L_0x01a8
                java.util.List r0 = r0.getOptions()
                if (r0 == 0) goto L_0x01a8
                java.lang.Object r0 = r0.get(r10)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
                if (r0 == 0) goto L_0x01a8
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.l
                if (r3 == 0) goto L_0x01a3
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x01a3
                java.lang.Object r3 = r3.get(r10)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x01a3
                long r5 = r3.getVoteCount()
            L_0x01a3:
                r3 = 0
                long r5 = r5 + r1
                r0.setVoteCount(r5)
            L_0x01a8:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                java.lang.String r1 = "A"
                r0.a((java.lang.String) r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                r0.a()
                return
            L_0x01b5:
                r0 = 2131171483(0x7f07189b, float:1.7957354E38)
                if (r8 != r0) goto L_0x0326
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r8 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r8)
                boolean r0 = r0.isLogin()
                if (r0 != 0) goto L_0x01f3
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                android.content.Context r0 = r0.getContext()
                if (r0 == 0) goto L_0x01eb
                android.app.Activity r0 = (android.app.Activity) r0
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.d r1 = r1.getInteractStickerParams()
                if (r1 == 0) goto L_0x01e3
                com.ss.android.ugc.aweme.sticker.c r1 = r1.n
                if (r1 == 0) goto L_0x01e3
                java.lang.String r1 = r1.f71627b
                if (r1 != 0) goto L_0x01e5
            L_0x01e3:
                java.lang.String r1 = ""
            L_0x01e5:
                java.lang.String r2 = ""
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2)
                return
            L_0x01eb:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
                r0.<init>(r1)
                throw r0
            L_0x01f3:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.l
                if (r8 == 0) goto L_0x020e
                java.util.List r8 = r8.getOptions()
                if (r8 == 0) goto L_0x020e
                java.lang.Object r8 = r8.get(r9)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r8 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r8
                if (r8 == 0) goto L_0x020e
                long r11 = r8.getOptionId()
                goto L_0x020f
            L_0x020e:
                r11 = r5
            L_0x020f:
                r0.k = r11
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                float r0 = r0.a(r9, r9)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.g
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "%.0f"
                java.lang.Object[] r13 = new java.lang.Object[r9]
                java.lang.Float r14 = java.lang.Float.valueOf(r0)
                r13[r10] = r14
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r9)
                java.lang.String r12 = java.lang.String.format(r12, r13)
                java.lang.String r13 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r13)
                r11.append(r12)
                java.lang.String r12 = "%"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r8.setText(r11)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f70045d
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "%.0f"
                java.lang.Object[] r13 = new java.lang.Object[r9]
                float r4 = r4 - r0
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r13[r10] = r4
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r13, r9)
                java.lang.String r4 = java.lang.String.format(r12, r4)
                java.lang.String r10 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r10)
                r11.append(r4)
                java.lang.String r4 = "%"
                r11.append(r4)
                java.lang.String r4 = r11.toString()
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r8.setText(r4)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f70046e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r10 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r10.f70047f
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r11 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r11.g
                int r0 = (int) r0
                r4.a(r8, r10, r11, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f70043b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r10 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r10.f70044c
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r11 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r11.f70045d
                int r0 = 100 - r0
                r4.b(r8, r10, r11, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                r4 = 2
                r0.setStatus(r4)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r4.l
                if (r4 == 0) goto L_0x02c3
                java.util.List r4 = r4.getOptions()
                if (r4 == 0) goto L_0x02c3
                java.lang.Object r4 = r4.get(r9)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r4 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r4
                if (r4 == 0) goto L_0x02c3
                long r3 = r4.getOptionId()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
            L_0x02c3:
                r0.a((java.lang.Long) r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r0.l
                if (r0 == 0) goto L_0x02e9
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.l
                if (r3 == 0) goto L_0x02e5
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x02e5
                java.lang.Object r3 = r3.get(r9)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x02e5
                long r3 = r3.getOptionId()
                goto L_0x02e6
            L_0x02e5:
                r3 = r5
            L_0x02e6:
                r0.setSelectOptionId(r3)
            L_0x02e9:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r0.l
                if (r0 == 0) goto L_0x031a
                java.util.List r0 = r0.getOptions()
                if (r0 == 0) goto L_0x031a
                java.lang.Object r0 = r0.get(r9)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
                if (r0 == 0) goto L_0x031a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.l
                if (r3 == 0) goto L_0x0315
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x0315
                java.lang.Object r3 = r3.get(r9)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x0315
                long r5 = r3.getVoteCount()
            L_0x0315:
                r3 = 0
                long r5 = r5 + r1
                r0.setVoteCount(r5)
            L_0x031a:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                java.lang.String r1 = "B"
                r0.a((java.lang.String) r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.this
                r0.a()
            L_0x0326:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.a.a(int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$Companion;", "", "()V", "STATUS_NORMAL", "", "STATUS_SELF", "STATUS_VOTED_FIRST", "STATUS_VOTED_SECOND", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$OnAnimFinishListener;", "", "onAnimEnd", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface c {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$animEndListener$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$OnAnimFinishListener;", "onAnimEnd", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f70051b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f70050a, false, 79726, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70050a, false, 79726, new Class[0], Void.TYPE);
                return;
            }
            String str = this.f70051b.h;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            bg.a(new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a(str, this.f70051b.k));
        }

        d(h hVar) {
            this.f70051b = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$animationRun$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70052a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f70053b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f70054c;

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationCancel(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f70052a, false, 79728, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f70052a, false, 79728, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (this.f70054c) {
                com.ss.android.ugc.aweme.sticker.a.c cVar = this.f70053b.m;
                if (cVar != null) {
                    cVar.c();
                }
                c animEndListener = this.f70053b.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.a();
                }
            }
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f70052a, false, 79727, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f70052a, false, 79727, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (this.f70054c) {
                com.ss.android.ugc.aweme.sticker.a.c cVar = this.f70053b.m;
                if (cVar != null) {
                    cVar.c();
                }
                c animEndListener = this.f70053b.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.a();
                }
            }
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f70052a, false, 79729, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f70052a, false, 79729, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            if (this.f70054c) {
                com.ss.android.ugc.aweme.sticker.a.c cVar = this.f70053b.m;
                if (cVar != null) {
                    cVar.b();
                }
            }
        }

        e(h hVar, boolean z) {
            this.f70053b = hVar;
            this.f70054c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70055a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f70056b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VoteStruct f70057c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.a.c f70058d;

        f(h hVar, VoteStruct voteStruct, com.ss.android.ugc.aweme.sticker.a.c cVar) {
            this.f70056b = hVar;
            this.f70057c = voteStruct;
            this.f70058d = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f70055a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 79730(0x13772, float:1.11726E-40)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f70055a
                r5 = 0
                r6 = 79730(0x13772, float:1.11726E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r9.f70056b
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.f70044c
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = r9.f70056b
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r9.f70057c
                r4 = 0
                if (r3 == 0) goto L_0x0043
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x0043
                java.lang.Object r0 = r3.get(r0)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
                if (r0 == 0) goto L_0x0043
                java.lang.String r0 = r0.getOptionText()
                goto L_0x0044
            L_0x0043:
                r0 = r4
            L_0x0044:
                java.lang.String r0 = r2.b(r0)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r9.f70056b
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f70047f
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r9.f70056b
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r9.f70057c
                if (r2 == 0) goto L_0x006a
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x006a
                r3 = 1
                java.lang.Object r2 = r2.get(r3)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x006a
                java.lang.String r4 = r2.getOptionText()
            L_0x006a:
                java.lang.String r1 = r1.b(r4)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r9.f70056b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r0 = r0.f70043b
                if (r0 == 0) goto L_0x007e
                com.ss.android.ugc.aweme.sticker.a.c r1 = r9.f70058d
                r0.setListener(r1)
            L_0x007e:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r9.f70056b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r0 = r0.f70046e
                if (r0 == 0) goto L_0x0089
                com.ss.android.ugc.aweme.sticker.a.c r1 = r9.f70058d
                r0.setListener(r1)
            L_0x0089:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r9.f70056b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r9.f70056b
                int r1 = r1.getVoteStatus()
                r0.setStatus(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r9.f70056b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$f$1 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$f$1
                r1.<init>(r9)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r0.post(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.f.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView$vote$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements Observer<VoteResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70061a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f70062b;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f70061a, false, 79734, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f70061a, false, 79734, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
        }

        g(h hVar) {
            this.f70062b = hVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            VoteResponse voteResponse = (VoteResponse) obj;
            if (PatchProxy.isSupport(new Object[]{voteResponse}, this, f70061a, false, 79733, new Class[]{VoteResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voteResponse}, this, f70061a, false, 79733, new Class[]{VoteResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(voteResponse, "t");
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f70061a, false, 79732, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f70061a, false, 79732, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
            this.f70062b.i.add(disposable2);
        }
    }

    @NotNull
    public final c getAnimEndListener() {
        return this.C;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.sticker.d getInteractStickerParams() {
        return this.u;
    }

    @Nullable
    public final InteractStickerStruct getInteractStickerStruct() {
        return this.A;
    }

    @NotNull
    public final Path getPath() {
        return this.y;
    }

    @NotNull
    public final a getPbListener() {
        return this.B;
    }

    @Nullable
    public final float[] getPoints() {
        return this.w;
    }

    public final int getStatus() {
        return this.v;
    }

    @NotNull
    public final FrameLayout getVoteView() {
        return this.z;
    }

    public final void a(@Nullable VoteStruct voteStruct, boolean z2, @Nullable String str, @Nullable com.ss.android.ugc.aweme.sticker.a.c cVar, @Nullable InteractStickerStruct interactStickerStruct) {
        VoteStruct voteStruct2 = voteStruct;
        com.ss.android.ugc.aweme.sticker.a.c cVar2 = cVar;
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        if (PatchProxy.isSupport(new Object[]{voteStruct2, Byte.valueOf(z2 ? (byte) 1 : 0), str, cVar2, interactStickerStruct2}, this, f70042a, false, 79709, new Class[]{VoteStruct.class, Boolean.TYPE, String.class, com.ss.android.ugc.aweme.sticker.a.c.class, InteractStickerStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{voteStruct2, Byte.valueOf(z2), str, cVar2, interactStickerStruct2}, this, f70042a, false, 79709, new Class[]{VoteStruct.class, Boolean.TYPE, String.class, com.ss.android.ugc.aweme.sticker.a.c.class, InteractStickerStruct.class}, Void.TYPE);
            return;
        }
        this.l = voteStruct2;
        this.r = z2;
        this.h = str == null ? "" : str;
        this.m = cVar2;
        this.A = interactStickerStruct2;
        String str2 = null;
        if (TextUtils.isEmpty(voteStruct2 != null ? voteStruct.getQuestion() : null)) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
            DmtTextView dmtTextView = this.o;
            if (voteStruct2 != null) {
                str2 = voteStruct.getQuestion();
            }
            dmtTextView.setText(str2);
        }
        this.f70044c.post(new f(this, voteStruct2, cVar2));
    }

    public final void a(String str) {
        String str2 = str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f70042a, false, 79710, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f70042a, false, 79710, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.sticker.d dVar = this.u;
        Long l2 = null;
        CharSequence charSequence = dVar != null ? dVar.f71637f : null;
        if (!(charSequence == null || charSequence.length() == 0)) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            com.ss.android.ugc.aweme.sticker.d dVar2 = this.u;
            String str3 = dVar2 != null ? dVar2.f71637f : null;
            com.ss.android.ugc.aweme.sticker.d dVar3 = this.u;
            String str4 = dVar3 != null ? dVar3.g : null;
            com.ss.android.ugc.aweme.sticker.d dVar4 = this.u;
            String valueOf = String.valueOf(dVar4 != null ? Long.valueOf(dVar4.h) : null);
            com.ss.android.ugc.aweme.sticker.d dVar5 = this.u;
            if (dVar5 != null) {
                l2 = Long.valueOf(dVar5.i);
            }
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            long longValue = l2.longValue();
            if (PatchProxy.isSupport(new Object[]{context, str2, str3, str4, valueOf, new Long(longValue)}, null, w.f39352a, true, 31807, new Class[]{Context.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, str2, str3, str4, valueOf, new Long(longValue)}, null, w.f39352a, true, 31807, new Class[]{Context.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str2, "area");
            Intrinsics.checkParameterIsNotNull(valueOf, "cid");
            CharSequence charSequence2 = str3;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                w.a(context, "draw_ad", "poll_sticker_click", w.b(w.a(context, str3, "ad vote click event : " + str2), str2), str4, valueOf, longValue);
            }
        }
    }

    public final void a(Long l2) {
        if (PatchProxy.isSupport(new Object[]{l2}, this, f70042a, false, 79712, new Class[]{Long.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{l2}, this, f70042a, false, 79712, new Class[]{Long.class}, Void.TYPE);
            return;
        }
        if (l2 != null) {
            VoteStruct voteStruct = this.l;
            if ((voteStruct != null ? Long.valueOf(voteStruct.getVoteId()) : null) != null) {
                VoteApi voteApi = this.s;
                VoteStruct voteStruct2 = this.l;
                voteApi.vote(voteStruct2 != null ? voteStruct2.getVoteId() : 0, l2.longValue()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new g<Object>(this));
            }
        }
    }

    @Nullable
    /* renamed from: getStatus  reason: collision with other method in class */
    public final Integer m13getStatus() {
        if (!PatchProxy.isSupport(new Object[0], this, f70042a, false, 79706, new Class[0], Integer.class)) {
            return Integer.valueOf(this.v);
        }
        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f70042a, false, 79706, new Class[0], Integer.class);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f70042a, false, 79713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70042a, false, 79713, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.i.dispose();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getVoteStatus() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f70042a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 79708(0x1375c, float:1.11695E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f70042a
            r5 = 0
            r6 = 79708(0x1375c, float:1.11695E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            boolean r1 = r9.r
            if (r1 == 0) goto L_0x0032
            r0 = 3
            return r0
        L_0x0032:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r1 = r9.l
            r2 = 0
            if (r1 == 0) goto L_0x0040
            long r3 = r1.getSelectOptionId()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0041
        L_0x0040:
            r1 = r2
        L_0x0041:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r9.l
            if (r3 == 0) goto L_0x005c
            java.util.List r3 = r3.getOptions()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r3.get(r0)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
            if (r3 == 0) goto L_0x005c
            long r3 = r3.getOptionId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x005d
        L_0x005c:
            r3 = r2
        L_0x005d:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            r3 = 1
            if (r1 == 0) goto L_0x0065
            return r3
        L_0x0065:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r1 = r9.l
            if (r1 == 0) goto L_0x0072
            long r4 = r1.getSelectOptionId()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r9.l
            if (r4 == 0) goto L_0x008d
            java.util.List r4 = r4.getOptions()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r3 = r4.get(r3)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
            if (r3 == 0) goto L_0x008d
            long r2 = r3.getOptionId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x008d:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0095
            r0 = 2
            return r0
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.getVoteStatus():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r3 == null) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f70042a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79711(0x1375f, float:1.11699E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f70042a
            r5 = 0
            r6 = 79711(0x1375f, float:1.11699E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r0 = "guest_poll_click"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.u
            r4 = 0
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.f71629d
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.u
            if (r3 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x004b
            java.lang.String r3 = r3.f71628c
            goto L_0x004c
        L_0x004b:
            r3 = r4
        L_0x004c:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.u
            if (r3 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.f71630e
            goto L_0x005e
        L_0x005d:
            r3 = r4
        L_0x005e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.u
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x006e
            java.lang.String r4 = r3.f71627b
        L_0x006e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r9.A
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3)
            if (r3 == 0) goto L_0x0082
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0084
        L_0x0082:
            java.lang.String r3 = ""
        L_0x0084:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.a():void");
    }

    public final void setInteractStickerParams(@Nullable com.ss.android.ugc.aweme.sticker.d dVar) {
        this.u = dVar;
    }

    public final void setInteractStickerStruct(@Nullable InteractStickerStruct interactStickerStruct) {
        this.A = interactStickerStruct;
    }

    public final void setPoints(@Nullable float[] fArr) {
        this.w = fArr;
    }

    public final void setStatus(int i2) {
        this.v = i2;
    }

    public final void setPbListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f70042a, false, 79705, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f70042a, false, 79705, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "<set-?>");
        this.B = aVar2;
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f70042a, false, 79722, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70042a, false, 79722, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.r) {
            return false;
        } else {
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public final String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f70042a, false, 79720, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f70042a, false, 79720, new Class[]{String.class}, String.class);
        } else if (str2 == null) {
            return "";
        } else {
            Paint paint = new Paint();
            Rect rect = new Rect();
            paint.setTypeface(Typeface.DEFAULT);
            paint.setTextSize(UIUtils.sp2px(getContext(), 15.0f));
            int length = str.length() - 1;
            int length2 = str.length() - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                }
                paint.getTextBounds(str2, 0, length2, rect);
                if (UIUtils.dip2Px(getContext(), 20.0f) + ((float) rect.width()) + UIUtils.dip2Px(getContext(), 49.0f) < ((float) this.f70043b.getWidth())) {
                    length = length2;
                    break;
                }
                length2--;
            }
            if (length < str.length() - 1) {
                StringBuilder sb = new StringBuilder();
                String substring = str2.substring(0, length);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append("...");
                str2 = sb.toString();
            }
            return str2;
        }
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f70042a, false, 79721, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f70042a, false, 79721, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(context) && this.w != null) {
            this.y.reset();
            Path path = this.y;
            float[] fArr = this.w;
            if (fArr == null) {
                Intrinsics.throwNpe();
            }
            float f2 = fArr[0];
            float[] fArr2 = this.w;
            if (fArr2 == null) {
                Intrinsics.throwNpe();
            }
            path.moveTo(f2, fArr2[1]);
            Path path2 = this.y;
            float[] fArr3 = this.w;
            if (fArr3 == null) {
                Intrinsics.throwNpe();
            }
            float f3 = fArr3[2];
            float[] fArr4 = this.w;
            if (fArr4 == null) {
                Intrinsics.throwNpe();
            }
            path2.lineTo(f3, fArr4[3]);
            Path path3 = this.y;
            float[] fArr5 = this.w;
            if (fArr5 == null) {
                Intrinsics.throwNpe();
            }
            float f4 = fArr5[6];
            float[] fArr6 = this.w;
            if (fArr6 == null) {
                Intrinsics.throwNpe();
            }
            path3.lineTo(f4, fArr6[7]);
            Path path4 = this.y;
            float[] fArr7 = this.w;
            if (fArr7 == null) {
                Intrinsics.throwNpe();
            }
            float f5 = fArr7[4];
            float[] fArr8 = this.w;
            if (fArr8 == null) {
                Intrinsics.throwNpe();
            }
            path4.lineTo(f5, fArr8[5]);
            this.y.close();
            if (canvas != null) {
                canvas.drawPath(this.y, this.x);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        super(context);
        VoteApi voteApi;
        Intrinsics.checkParameterIsNotNull(context, "context");
        VoteApi.a aVar = VoteApi.f69855a;
        if (PatchProxy.isSupport(new Object[0], aVar, VoteApi.a.f69856a, false, 79500, new Class[0], VoteApi.class)) {
            voteApi = (VoteApi) PatchProxy.accessDispatch(new Object[0], aVar, VoteApi.a.f69856a, false, 79500, new Class[0], VoteApi.class);
        } else {
            Object create = VoteApi.a.f69857b.createNewRetrofit("https://aweme.snssdk.com").create(VoteApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "retrofitService.createNe…eate(VoteApi::class.java)");
            voteApi = (VoteApi) create;
        }
        this.s = voteApi;
        this.i = new CompositeDisposable();
        this.j = 101.0f;
        this.t = "方正兰亭特黑简体";
        this.x = new Paint();
        this.y = new Path();
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ask, this, false);
        if (inflate != null) {
            this.z = (FrameLayout) inflate;
            this.B = new a();
            View findViewById = this.z.findViewById(C0906R.id.dvi);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "voteView.findViewById(R.id.vote_title)");
            this.o = (DmtTextView) findViewById;
            View findViewById2 = this.z.findViewById(C0906R.id.cg6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "voteView.findViewById(R.id.rl_question1)");
            this.p = (ViewGroup) findViewById2;
            View findViewById3 = this.z.findViewById(C0906R.id.dvg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "voteView.findViewById(R.id.vote_question_1)");
            this.f70043b = (DispathTouchEventView) findViewById3;
            View findViewById4 = this.z.findViewById(C0906R.id.d1k);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "voteView.findViewById(R.id.text_question_1)");
            this.f70044c = (DmtTextView) findViewById4;
            View findViewById5 = this.z.findViewById(C0906R.id.bx5);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "voteView.findViewById(R.id.percent_question_1)");
            this.f70045d = (DmtTextView) findViewById5;
            View findViewById6 = this.z.findViewById(C0906R.id.cg7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "voteView.findViewById(R.id.rl_question2)");
            this.q = (ViewGroup) findViewById6;
            View findViewById7 = this.z.findViewById(C0906R.id.dvh);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "voteView.findViewById(R.id.vote_question_2)");
            this.f70046e = (DispathTouchEventView) findViewById7;
            View findViewById8 = this.z.findViewById(C0906R.id.d1l);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "voteView.findViewById(R.id.text_question_2)");
            this.f70047f = (DmtTextView) findViewById8;
            View findViewById9 = this.z.findViewById(C0906R.id.bx6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "voteView.findViewById(R.id.percent_question_2)");
            this.g = (DmtTextView) findViewById9;
            this.f70045d.setAlpha(0.0f);
            this.g.setAlpha(0.0f);
            d dVar = this;
            this.f70043b.setStatusView(dVar);
            this.f70046e.setStatusView(dVar);
            this.f70043b.setClickListener(this.B);
            this.f70046e.setClickListener(this.B);
            ViewCompat.setElevation(this.p, UIUtils.dip2Px(getContext(), 4.0f));
            ViewCompat.setElevation(this.q, UIUtils.dip2Px(getContext(), 4.0f));
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Paint paint = this.x;
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                paint.setColor(context2.getResources().getColor(C0906R.color.yq));
                this.x.setStyle(Paint.Style.STROKE);
                this.x.setStrokeWidth(10.0f);
                setWillNotDraw(false);
            }
            Typeface typefaceByFontName = ((IAVService) ServiceManager.get().getService(IAVService.class)).getTypefaceByFontName(this.t);
            if (typefaceByFontName != null) {
                this.o.setTypeface(typefaceByFontName);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                FrameLayout frameLayout = this.z;
                if (frameLayout != null) {
                    frameLayout.setLayoutDirection(3);
                }
                if (ey.a(getContext())) {
                    this.p.setLayoutDirection(1);
                    this.q.setLayoutDirection(1);
                } else {
                    this.p.setLayoutDirection(0);
                    this.q.setLayoutDirection(0);
                }
            }
            addView(this.z);
            this.C = new d(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70042a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r3 = 0
            r4 = 79717(0x13765, float:1.11707E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0056
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70042a
            r3 = 0
            r4 = 79717(0x13765, float:1.11707E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
        L_0x0056:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r10.l
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.util.List r0 = r0.getOptions()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r0.get(r8)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
            if (r0 == 0) goto L_0x006f
            long r2 = r0.getVoteCount()
            float r0 = (float) r2
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r10.l
            if (r2 == 0) goto L_0x0088
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x0088
            java.lang.Object r2 = r2.get(r9)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x0088
            long r2 = r2.getVoteCount()
            float r2 = (float) r2
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            float r0 = r0 + r2
            float r2 = (float) r12
            float r0 = r0 + r2
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x009a
            boolean r0 = r10.r
            if (r0 == 0) goto L_0x0097
            float r0 = r10.j
            return r0
        L_0x0097:
            r0 = 1112014848(0x42480000, float:50.0)
            return r0
        L_0x009a:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r10.l
            if (r3 == 0) goto L_0x00b1
            java.util.List r3 = r3.getOptions()
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r3.get(r11)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
            if (r3 == 0) goto L_0x00b1
            long r3 = r3.getVoteCount()
            float r1 = (float) r3
        L_0x00b1:
            float r1 = r1 + r2
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.a(int, int):float");
    }

    /* access modifiers changed from: package-private */
    public final void a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2) {
        DispathTouchEventView dispathTouchEventView2 = dispathTouchEventView;
        DmtTextView dmtTextView3 = dmtTextView;
        DmtTextView dmtTextView4 = dmtTextView2;
        if (PatchProxy.isSupport(new Object[]{dispathTouchEventView2, dmtTextView3, dmtTextView4}, this, f70042a, false, 79718, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dispathTouchEventView2, dmtTextView3, dmtTextView4}, this, f70042a, false, 79718, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class}, Void.TYPE);
            return;
        }
        dispathTouchEventView2.setProgress(0);
        dmtTextView4.setAlpha(0.0f);
        dmtTextView3.setTranslationX(0.0f);
    }

    /* access modifiers changed from: package-private */
    public final void c(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i2) {
        DispathTouchEventView dispathTouchEventView2 = dispathTouchEventView;
        DmtTextView dmtTextView3 = dmtTextView;
        DmtTextView dmtTextView4 = dmtTextView2;
        if (PatchProxy.isSupport(new Object[]{dispathTouchEventView2, dmtTextView3, dmtTextView4, Integer.valueOf(i2)}, this, f70042a, false, 79719, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dispathTouchEventView2, dmtTextView3, dmtTextView4, Integer.valueOf(i2)}, this, f70042a, false, 79719, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        float width = ((float) ((dispathTouchEventView.getWidth() - dmtTextView.getWidth()) / 2)) - UIUtils.dip2Px(getContext(), 20.0f);
        if (ey.a(getContext())) {
            width = -width;
        }
        dispathTouchEventView2.setProgress(i2);
        dmtTextView4.setAlpha(1.0f);
        dmtTextView3.setTranslationX(-width);
    }

    public final void b(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i2) {
        DispathTouchEventView dispathTouchEventView2 = dispathTouchEventView;
        if (PatchProxy.isSupport(new Object[]{dispathTouchEventView2, dmtTextView, dmtTextView2, Integer.valueOf(i2)}, this, f70042a, false, 79715, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dispathTouchEventView2, dmtTextView, dmtTextView2, Integer.valueOf(i2)}, this, f70042a, false, 79715, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dispathTouchEventView2.setProgressDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130841703));
        a(dispathTouchEventView, dmtTextView, dmtTextView2, i2, false);
    }

    public final void a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i2) {
        DispathTouchEventView dispathTouchEventView2 = dispathTouchEventView;
        if (PatchProxy.isSupport(new Object[]{dispathTouchEventView2, dmtTextView, dmtTextView2, Integer.valueOf(i2)}, this, f70042a, false, 79714, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dispathTouchEventView2, dmtTextView, dmtTextView2, Integer.valueOf(i2)}, this, f70042a, false, 79714, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dispathTouchEventView2.setProgressDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130841701));
        a(dispathTouchEventView, dmtTextView, dmtTextView2, i2, true);
    }

    private final void a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i2, boolean z2) {
        DispathTouchEventView dispathTouchEventView2 = dispathTouchEventView;
        DmtTextView dmtTextView3 = dmtTextView;
        DmtTextView dmtTextView4 = dmtTextView2;
        if (PatchProxy.isSupport(new Object[]{dispathTouchEventView2, dmtTextView3, dmtTextView4, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70042a, false, 79716, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {dispathTouchEventView2, dmtTextView3, dmtTextView4, Integer.valueOf(i2), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f70042a, false, 79716, new Class[]{DispathTouchEventView.class, DmtTextView.class, DmtTextView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        float width = ((float) ((dispathTouchEventView.getWidth() - dmtTextView.getWidth()) / 2)) - UIUtils.dip2Px(getContext(), 20.0f);
        if (ey.a(getContext())) {
            width = -width;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(dispathTouchEventView2, "progress", new int[]{0, i2});
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtTextView4, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtTextView3, "translationX", new float[]{0.0f, -width});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt});
        animatorSet.setDuration(300);
        animatorSet.addListener(new e(this, z2));
        animatorSet.start();
    }
}
