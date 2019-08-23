package com.ss.android.ugc.aweme.feed.adapter;

import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.newfollow.util.m;
import com.ss.android.ugc.aweme.newfollow.util.n;
import com.ss.android.ugc.aweme.newfollow.vh.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020+H\u0002J\u0006\u0010-\u001a\u00020+J\u0006\u0010.\u001a\u00020+J\b\u0010/\u001a\u00020+H\u0002J\u0006\u00100\u001a\u00020+J\b\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020+H&J\u0006\u00103\u001a\u00020+R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/BaseStaggeredGridTimelineViewHolder;", "Lcom/ss/android/ugc/aweme/feed/adapter/AbsCellViewHolder;", "eventLabel", "", "pageType", "", "itemView", "Landroid/view/View;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/feed/adapter/StaggeredGridScrollStateManager;", "(Ljava/lang/String;ILandroid/view/View;Lcom/ss/android/ugc/aweme/feed/adapter/StaggeredGridScrollStateManager;)V", "getEventLabel", "()Ljava/lang/String;", "iHandler", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "mAttachStateChangeListener", "Landroid/view/View$OnAttachStateChangeListener;", "mHandler", "Lcom/bytedance/common/utility/collection/WeakHandler;", "mItemViewLocation", "", "mItemViewRect", "Landroid/graphics/Rect;", "mLiveCallback", "Lcom/ss/android/ugc/aweme/newfollow/vh/ILiveCallback;", "mLivePlayHelper", "Lcom/ss/android/ugc/aweme/newfollow/live/LivePlayHelper;", "mLiveStarted", "", "mLiveStreamContainer", "Landroid/widget/FrameLayout;", "mScrollStateObserver", "Lcom/ss/android/ugc/aweme/newfollow/util/ScrollStateObserver;", "mStartLoadTime", "", "mStreamPlay", "Ljava/lang/Runnable;", "getPageType", "()I", "getScrollStateManager", "()Lcom/ss/android/ugc/aweme/feed/adapter/StaggeredGridScrollStateManager;", "getLoadDuration", "hideCover", "", "mobLive", "onDestroy", "play", "playLive", "reset", "setStreamContainerRoundCorner", "showCover", "stopPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseStaggeredGridTimelineViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44645a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f44646b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final int[] f44647c = new int[2];
    com.ss.android.ugc.aweme.newfollow.live.b k;
    public FrameLayout l;
    public long m = -1;
    boolean n;
    WeakHandler o = new WeakHandler(this.x);
    public m p;
    @Nullable
    public final String q;
    public final int r;
    @Nullable
    public final z s;
    private Runnable v;
    private x w;
    private final WeakHandler.IHandler x = new a(this);
    private View.OnAttachStateChangeListener y = new b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "msg", "Landroid/os/Message;", "kotlin.jvm.PlatformType", "handleMsg"}, k = 3, mv = {1, 1, 15})
    static final class a implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseStaggeredGridTimelineViewHolder f44653b;

        a(BaseStaggeredGridTimelineViewHolder baseStaggeredGridTimelineViewHolder) {
            this.f44653b = baseStaggeredGridTimelineViewHolder;
        }

        public final void handleMsg(Message message) {
            Integer num;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f44652a, false, 40303, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f44652a, false, 40303, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (message2 != null) {
                num = Integer.valueOf(message2.what);
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 65281) {
                    BaseStaggeredGridTimelineViewHolder baseStaggeredGridTimelineViewHolder = this.f44653b;
                    if (PatchProxy.isSupport(new Object[0], baseStaggeredGridTimelineViewHolder, BaseStaggeredGridTimelineViewHolder.f44645a, false, 40297, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], baseStaggeredGridTimelineViewHolder, BaseStaggeredGridTimelineViewHolder.f44645a, false, 40297, new Class[0], Void.TYPE);
                    } else if (!baseStaggeredGridTimelineViewHolder.n) {
                        baseStaggeredGridTimelineViewHolder.m();
                        baseStaggeredGridTimelineViewHolder.n = true;
                        Aweme aweme = (Aweme) baseStaggeredGridTimelineViewHolder.g;
                        if (!(aweme == null || aweme.getRoom() == null)) {
                            baseStaggeredGridTimelineViewHolder.m = System.currentTimeMillis();
                            com.ss.android.ugc.aweme.newfollow.live.b bVar = baseStaggeredGridTimelineViewHolder.k;
                            if (bVar != null) {
                                bVar.a(true, RoomStruct.fromAweme((Aweme) baseStaggeredGridTimelineViewHolder.g), baseStaggeredGridTimelineViewHolder.l);
                            }
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/BaseStaggeredGridTimelineViewHolder$mAttachStateChangeListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44654a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseStaggeredGridTimelineViewHolder f44655b;

        b(BaseStaggeredGridTimelineViewHolder baseStaggeredGridTimelineViewHolder) {
            this.f44655b = baseStaggeredGridTimelineViewHolder;
        }

        public final void onViewAttachedToWindow(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f44654a, false, 40304, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f44654a, false, 40304, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
            z zVar = this.f44655b.s;
            if (zVar != null) {
                zVar.a(this.f44655b.p);
            }
        }

        public final void onViewDetachedFromWindow(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f44654a, false, 40305, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f44654a, false, 40305, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
            z zVar = this.f44655b.s;
            if (zVar != null) {
                zVar.b(this.f44655b.p);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/BaseStaggeredGridTimelineViewHolder$mScrollStateObserver$1", "Lcom/ss/android/ugc/aweme/newfollow/util/ScrollStateObserver;", "getLocation", "Landroid/graphics/Rect;", "getName", "", "isLive", "", "onRollOutPlayRegion", "", "onRollToHalfShow", "onRollToPlayRegion", "scrollState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseStaggeredGridTimelineViewHolder f44657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f44658c;

        public final void c() {
        }

        @NotNull
        public final Rect a() {
            if (PatchProxy.isSupport(new Object[0], this, f44656a, false, 40307, new Class[0], Rect.class)) {
                return (Rect) PatchProxy.accessDispatch(new Object[0], this, f44656a, false, 40307, new Class[0], Rect.class);
            }
            this.f44658c.getLocationOnScreen(this.f44657b.f44647c);
            this.f44657b.f44646b.set(this.f44657b.f44647c[0], this.f44657b.f44647c[1], this.f44657b.f44647c[0] + this.f44658c.getWidth(), this.f44657b.f44647c[1] + this.f44658c.getHeight());
            return this.f44657b.f44646b;
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f44656a, false, 40309, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44656a, false, 40309, new Class[0], Void.TYPE);
                return;
            }
            BaseStaggeredGridTimelineViewHolder baseStaggeredGridTimelineViewHolder = this.f44657b;
            if (PatchProxy.isSupport(new Object[0], baseStaggeredGridTimelineViewHolder, BaseStaggeredGridTimelineViewHolder.f44645a, false, 40298, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], baseStaggeredGridTimelineViewHolder, BaseStaggeredGridTimelineViewHolder.f44645a, false, 40298, new Class[0], Void.TYPE);
                return;
            }
            baseStaggeredGridTimelineViewHolder.n = false;
            WeakHandler weakHandler = baseStaggeredGridTimelineViewHolder.o;
            if (weakHandler != null) {
                weakHandler.removeMessages(65281);
            }
            baseStaggeredGridTimelineViewHolder.p();
            com.ss.android.ugc.aweme.newfollow.live.b bVar = baseStaggeredGridTimelineViewHolder.k;
            if (bVar != null) {
                bVar.b();
            }
        }

        public final boolean d() {
            Boolean bool;
            if (PatchProxy.isSupport(new Object[0], this, f44656a, false, 40310, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44656a, false, 40310, new Class[0], Boolean.TYPE)).booleanValue();
            }
            Aweme aweme = (Aweme) this.f44657b.g;
            if (aweme != null) {
                bool = Boolean.valueOf(aweme.isLive());
            } else {
                bool = null;
            }
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            return bool.booleanValue();
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44656a, false, 40306, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44656a, false, 40306, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            BaseStaggeredGridTimelineViewHolder baseStaggeredGridTimelineViewHolder = this.f44657b;
            if (PatchProxy.isSupport(new Object[0], baseStaggeredGridTimelineViewHolder, BaseStaggeredGridTimelineViewHolder.f44645a, false, 40296, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], baseStaggeredGridTimelineViewHolder, BaseStaggeredGridTimelineViewHolder.f44645a, false, 40296, new Class[0], Void.TYPE);
                return;
            }
            if (!(baseStaggeredGridTimelineViewHolder.g == null || baseStaggeredGridTimelineViewHolder.o == null)) {
                WeakHandler weakHandler = baseStaggeredGridTimelineViewHolder.o;
                if (weakHandler == null) {
                    Intrinsics.throwNpe();
                }
                weakHandler.removeMessages(65281);
                Message message = new Message();
                message.what = 65281;
                message.obj = baseStaggeredGridTimelineViewHolder.g;
                WeakHandler weakHandler2 = baseStaggeredGridTimelineViewHolder.o;
                if (weakHandler2 == null) {
                    Intrinsics.throwNpe();
                }
                weakHandler2.sendMessageDelayed(message, 150);
            }
        }

        c(BaseStaggeredGridTimelineViewHolder baseStaggeredGridTimelineViewHolder, View view) {
            this.f44657b = baseStaggeredGridTimelineViewHolder;
            this.f44658c = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/BaseStaggeredGridTimelineViewHolder$setStreamContainerRoundCorner$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44659a;

        d() {
        }

        @RequiresApi(api = 21)
        public final void getOutline(@NotNull View view, @NotNull Outline outline) {
            View view2 = view;
            Outline outline2 = outline;
            if (PatchProxy.isSupport(new Object[]{view2, outline2}, this, f44659a, false, 40311, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, outline2}, this, f44659a, false, 40311, new Class[]{View.class, Outline.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            Intrinsics.checkParameterIsNotNull(outline2, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 4.0f);
        }
    }

    public final void n() {
        this.n = false;
    }

    public abstract void o();

    public abstract void p();

    /* access modifiers changed from: package-private */
    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f44645a, false, 40293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44645a, false, 40293, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21 && this.l != null) {
            FrameLayout frameLayout = this.l;
            if (frameLayout == null) {
                Intrinsics.throwNpe();
            }
            frameLayout.setBackgroundColor(Color.parseColor("#000000"));
            FrameLayout frameLayout2 = this.l;
            if (frameLayout2 == null) {
                Intrinsics.throwNpe();
            }
            frameLayout2.setOutlineProvider(new d());
            FrameLayout frameLayout3 = this.l;
            if (frameLayout3 == null) {
                Intrinsics.throwNpe();
            }
            frameLayout3.setClipToOutline(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseStaggeredGridTimelineViewHolder(@Nullable String str, int i, @NotNull View view, @Nullable z zVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.q = str;
        this.r = i;
        this.s = zVar;
        this.p = new c(this, view);
        this.l = (FrameLayout) view.findViewById(C0906R.id.bef);
        view.addOnAttachStateChangeListener(this.y);
        this.v = new Runnable(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44648a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BaseStaggeredGridTimelineViewHolder f44649b;

            {
                this.f44649b = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x00e5  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x00fd  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r14 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f44648a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 40300(0x9d6c, float:5.6472E-41)
                    r2 = r14
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0025
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = f44648a
                    r5 = 0
                    r6 = 40300(0x9d6c, float:5.6472E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r14
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    return
                L_0x0025:
                    com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder r1 = r14.f44649b
                    long r1 = r1.m
                    r3 = 0
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 < 0) goto L_0x0123
                    com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder r1 = r14.f44649b
                    r1.o()
                    com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder r1 = r14.f44649b
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder.f44645a
                    r8 = 0
                    r9 = 40294(0x9d66, float:5.6464E-41)
                    java.lang.Class[] r10 = new java.lang.Class[r0]
                    java.lang.Class r11 = java.lang.Void.TYPE
                    r6 = r1
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
                    if (r2 == 0) goto L_0x005b
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder.f44645a
                    r8 = 0
                    r9 = 40294(0x9d66, float:5.6464E-41)
                    java.lang.Class[] r10 = new java.lang.Class[r0]
                    java.lang.Class r11 = java.lang.Void.TYPE
                    r6 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
                    goto L_0x011d
                L_0x005b:
                    com.ss.android.ugc.aweme.common.MobClick r2 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                    java.lang.String r5 = "livesdk_live_stream_load_duration"
                    com.ss.android.ugc.aweme.common.MobClick r2 = r2.setEventName(r5)
                    com.ss.android.ugc.aweme.app.d.c r5 = new com.ss.android.ugc.aweme.app.d.c
                    r5.<init>()
                    java.lang.String r6 = "enter_from_merge"
                    java.lang.String r7 = r1.q
                    com.ss.android.ugc.aweme.app.d.c r5 = r5.a((java.lang.String) r6, (java.lang.String) r7)
                    java.lang.String r6 = "enter_method"
                    java.lang.String r7 = "live_cover"
                    com.ss.android.ugc.aweme.app.d.c r5 = r5.a((java.lang.String) r6, (java.lang.String) r7)
                    java.lang.String r6 = "action_type"
                    java.lang.String r7 = "click"
                    com.ss.android.ugc.aweme.app.d.c r5 = r5.a((java.lang.String) r6, (java.lang.String) r7)
                    java.lang.String r6 = "anchor_id"
                    java.lang.Object r7 = r1.g
                    com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
                    java.lang.String r7 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r7)
                    com.ss.android.ugc.aweme.app.d.c r5 = r5.a((java.lang.String) r6, (java.lang.String) r7)
                    java.lang.String r6 = "room_id"
                    java.lang.Object r7 = r1.g
                    com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
                    if (r7 == 0) goto L_0x00a5
                    com.ss.android.ugc.aweme.feed.model.RoomStruct r7 = r7.getRoom()
                    if (r7 == 0) goto L_0x00a5
                    long r7 = r7.roomId
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)
                    goto L_0x00a6
                L_0x00a5:
                    r7 = 0
                L_0x00a6:
                    com.ss.android.ugc.aweme.app.d.c r5 = r5.a((java.lang.String) r6, (java.lang.Long) r7)
                    java.lang.String r6 = "request_id"
                    java.lang.Object r7 = r1.g
                    com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
                    int r8 = r1.r
                    java.lang.String r7 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r7, (int) r8)
                    com.ss.android.ugc.aweme.app.d.c r5 = r5.a((java.lang.String) r6, (java.lang.String) r7)
                    java.lang.String r6 = "log_pb"
                    com.ss.android.ugc.aweme.feed.ai r7 = com.ss.android.ugc.aweme.feed.ai.a()
                    java.lang.Object r8 = r1.g
                    com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8
                    java.lang.String r8 = com.ss.android.ugc.aweme.u.aa.c((com.ss.android.ugc.aweme.feed.model.Aweme) r8)
                    java.lang.String r7 = r7.a((java.lang.String) r8)
                    com.ss.android.ugc.aweme.app.d.c r12 = r5.a((java.lang.String) r6, (java.lang.String) r7)
                    java.lang.String r13 = "duration"
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder.f44645a
                    r8 = 0
                    r9 = 40295(0x9d67, float:5.6465E-41)
                    java.lang.Class[] r10 = new java.lang.Class[r0]
                    java.lang.Class r11 = java.lang.Long.TYPE
                    r6 = r1
                    boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
                    if (r5 == 0) goto L_0x00fd
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder.f44645a
                    r8 = 0
                    r9 = 40295(0x9d67, float:5.6465E-41)
                    java.lang.Class[] r10 = new java.lang.Class[r0]
                    java.lang.Class r11 = java.lang.Long.TYPE
                    r6 = r1
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
                    java.lang.Long r0 = (java.lang.Long) r0
                    long r3 = r0.longValue()
                    goto L_0x010a
                L_0x00fd:
                    long r5 = r1.m
                    int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r0 < 0) goto L_0x010a
                    long r3 = java.lang.System.currentTimeMillis()
                    long r0 = r1.m
                    long r3 = r3 - r0
                L_0x010a:
                    java.lang.Long r0 = java.lang.Long.valueOf(r3)
                    com.ss.android.ugc.aweme.app.d.c r0 = r12.a((java.lang.String) r13, (java.lang.Long) r0)
                    org.json.JSONObject r0 = r0.b()
                    com.ss.android.ugc.aweme.common.MobClick r0 = r2.setJsonObject(r0)
                    com.ss.android.ugc.aweme.common.r.onEvent(r0)
                L_0x011d:
                    com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder r0 = r14.f44649b
                    r1 = -1
                    r0.m = r1
                L_0x0123:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.BaseStaggeredGridTimelineViewHolder.AnonymousClass1.run():void");
            }
        };
        this.w = new x(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44650a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BaseStaggeredGridTimelineViewHolder f44651b;

            {
                this.f44651b = r1;
            }

            public final void a(@NotNull g.b bVar) {
                g.b bVar2 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar2}, this, f44650a, false, 40302, new Class[]{g.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar2}, this, f44650a, false, 40302, new Class[]{g.b.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(bVar2, "message");
                x.a.a(this, bVar);
            }

            public final void a(@Nullable TextureView textureView, int i, int i2) {
                TextureView textureView2 = textureView;
                if (PatchProxy.isSupport(new Object[]{textureView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f44650a, false, 40301, new Class[]{TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textureView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f44650a, false, 40301, new Class[]{TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (textureView2 != null) {
                    FrameLayout frameLayout = this.f44651b.l;
                    if (frameLayout == null) {
                        Intrinsics.throwNpe();
                    }
                    int width = frameLayout.getWidth();
                    FrameLayout frameLayout2 = this.f44651b.l;
                    if (frameLayout2 == null) {
                        Intrinsics.throwNpe();
                    }
                    int i3 = i;
                    n.a(width, frameLayout2.getHeight(), textureView, i, i2);
                }
            }
        };
        this.k = new com.ss.android.ugc.aweme.newfollow.live.b(this.v, this.w);
        m();
    }
}
