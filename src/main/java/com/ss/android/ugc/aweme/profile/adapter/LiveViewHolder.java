package com.ss.android.ugc.aweme.profile.adapter;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.newfollow.vh.x;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.live.c;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0017\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001eH\u0002J\u0006\u0010%\u001a\u00020\u001eJ\u0006\u0010&\u001a\u00020\u001eJ\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u0003H\u0002J:\u0010)\u001a\u00020\u001e2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050*\"\u00020\u00052\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0,¢\u0006\u0002\b-H\u0002¢\u0006\u0002\u0010.R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/adapter/LiveViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/arch/lifecycle/Observer;", "", "itemView", "Landroid/view/View;", "activity", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/view/View;Landroid/support/v4/app/FragmentActivity;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "animViewModel", "Lcom/ss/android/ugc/aweme/main/MainAnimViewModel;", "isVisibleToUser", "livePlayHelper", "Lcom/ss/android/ugc/aweme/newfollow/live/LivePlayHelper;", "mCoverView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mLiveContainer", "Landroid/widget/FrameLayout;", "mLiveFinishedStatus", "Landroid/widget/TextView;", "mRoomStruct", "Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "mTop", "mWatchPeopleCount", "refreshLiveCallback", "Lio/reactivex/functions/Consumer;", "Lcom/ss/android/ugc/aweme/live/feedpage/LiveState;", "bind", "", "room", "logLiveShow", "onChanged", "visible", "(Ljava/lang/Boolean;)V", "onRoomFinish", "onViewAttachedToWindow", "onViewDetachedFromWindow", "setMute", "mute", "views", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "([Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LiveViewHolder extends RecyclerView.ViewHolder implements Observer<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61255a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f61256b;

    /* renamed from: c  reason: collision with root package name */
    public final RemoteImageView f61257c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f61258d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f61259e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f61260f;
    public RoomStruct g;
    final MainAnimViewModel h;
    boolean i;
    public final com.ss.android.ugc.aweme.newfollow.live.b j = new com.ss.android.ugc.aweme.newfollow.live.b(new a(this), new b(this));
    @NotNull
    public final FragmentActivity k;
    private Consumer<com.ss.android.ugc.aweme.live.feedpage.b> l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveViewHolder f61264b;

        a(LiveViewHolder liveViewHolder) {
            this.f61264b = liveViewHolder;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f61263a, false, 67403, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61263a, false, 67403, new Class[0], Void.TYPE);
                return;
            }
            this.f61264b.f61256b.setVisibility(0);
            this.f61264b.f61258d.setVisibility(0);
            this.f61264b.f61259e.setVisibility(0);
            this.f61264b.f61257c.setVisibility(8);
            this.f61264b.f61260f.setVisibility(8);
            this.f61264b.f61257c.postDelayed(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61265a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f61266b;

                {
                    this.f61266b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f61265a, false, 67404, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61265a, false, 67404, new Class[0], Void.TYPE);
                        return;
                    }
                    LiveViewHolder liveViewHolder = this.f61266b.f61264b;
                    if (PatchProxy.isSupport(new Object[]{(byte) 1}, liveViewHolder, LiveViewHolder.f61255a, false, 67400, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        LiveViewHolder liveViewHolder2 = liveViewHolder;
                        PatchProxy.accessDispatch(new Object[]{(byte) 1}, liveViewHolder2, LiveViewHolder.f61255a, false, 67400, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    liveViewHolder.j.a(true);
                }
            }, 1000);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/profile/adapter/LiveViewHolder$livePlayHelper$2", "Lcom/ss/android/ugc/aweme/newfollow/vh/ILiveCallback;", "onPlayerMessage", "", "message", "Lcom/bytedance/android/livesdkapi/depend/live/ILivePlayController$PlayerMessage;", "onVideoSizeChange", "textureView", "Landroid/view/TextureView;", "width", "", "height", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveViewHolder f61268b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<View, Unit> {
            public static final a INSTANCE = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
                super(1);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 67406, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 67406, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view2, "$receiver");
                view2.setVisibility(0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$b$b  reason: collision with other inner class name */
        static final class C0677b extends Lambda implements Function1<View, Unit> {
            public static final C0677b INSTANCE = new C0677b();
            public static ChangeQuickRedirect changeQuickRedirect;

            C0677b() {
                super(1);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 67407, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 67407, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view2, "$receiver");
                view2.setVisibility(8);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class c extends Lambda implements Function1<View, Unit> {
            public static final c INSTANCE = new c();
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
                super(1);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 67408, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 67408, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view2, "$receiver");
                view2.setVisibility(8);
            }
        }

        public final void a(@Nullable TextureView textureView, int i, int i2) {
        }

        b(LiveViewHolder liveViewHolder) {
            this.f61268b = liveViewHolder;
        }

        public final void a(@NotNull g.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f61267a, false, 67405, new Class[]{g.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f61267a, false, 67405, new Class[]{g.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "message");
            switch (e.f61297a[bVar.ordinal()]) {
                case 1:
                    this.f61268b.a(new View[]{this.f61268b.f61256b, this.f61268b.f61258d, this.f61268b.f61259e}, a.INSTANCE);
                    this.f61268b.a(new View[]{this.f61268b.f61257c, this.f61268b.f61260f}, C0677b.INSTANCE);
                    return;
                case 2:
                    this.f61268b.a(new View[]{this.f61268b.f61256b, this.f61268b.f61258d, this.f61268b.f61259e, this.f61268b.f61260f}, c.INSTANCE);
                    this.f61268b.f61257c.setVisibility(0);
                    RoomStruct roomStruct = this.f61268b.g;
                    if (roomStruct != null) {
                        UrlModel urlModel = roomStruct.roomCover;
                        if (urlModel != null) {
                            com.ss.android.ugc.aweme.base.c.a(this.f61268b.f61257c, urlModel, this.f61268b.f61257c.getWidth(), this.f61268b.f61257c.getHeight());
                            break;
                        }
                    }
                    return;
                case 3:
                    this.f61268b.a();
                    break;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<View, Unit> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 67409, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 67409, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "$receiver");
            view2.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<View, Unit> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 67410, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 67410, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "$receiver");
            view2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/profile/adapter/LiveViewHolder$onChanged$3", "Lio/reactivex/functions/Consumer;", "Lcom/ss/android/ugc/aweme/live/feedpage/LiveState;", "accept", "", "liveState", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements Consumer<com.ss.android.ugc.aweme.live.feedpage.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveViewHolder f61270b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RoomStruct f61271c;

        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.live.feedpage.b bVar = (com.ss.android.ugc.aweme.live.feedpage.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f61269a, false, 67411, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f61269a, false, 67411, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "liveState");
            User user = this.f61271c.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "room.owner");
            if (TextUtils.equals(String.valueOf(bVar.f53380a), user.getUid())) {
                this.f61271c.id = bVar.f53381b;
                this.f61271c.owner.roomId = this.f61271c.id;
                this.f61270b.j.b();
                this.f61270b.a();
            }
        }

        e(LiveViewHolder liveViewHolder, RoomStruct roomStruct) {
            this.f61270b = liveViewHolder;
            this.f61271c = roomStruct;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/profile/adapter/LiveViewHolder$onRoomFinish$3$1"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UrlModel f61273b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LiveViewHolder f61274c;

        f(UrlModel urlModel, LiveViewHolder liveViewHolder) {
            this.f61273b = urlModel;
            this.f61274c = liveViewHolder;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f61272a, false, 67412, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61272a, false, 67412, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.c.a(this.f61274c.f61257c, this.f61273b, this.f61274c.f61257c.getWidth(), this.f61274c.f61257c.getHeight(), (Postprocessor) new com.ss.android.ugc.aweme.newfollow.live.a(5, (((float) this.f61273b.getWidth()) * 1.0f) / ((float) this.f61274c.f61257c.getWidth()), null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<View, Unit> {
        public static final g INSTANCE = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 67413, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 67413, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "$receiver");
            view2.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<View, Unit> {
        public static final h INSTANCE = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 67414, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 67414, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "$receiver");
            view2.setVisibility(0);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61255a, false, 67397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61255a, false, 67397, new Class[0], Void.TYPE);
            return;
        }
        a(new View[]{this.f61256b, this.f61258d, this.f61259e}, g.INSTANCE);
        a(new View[]{this.f61257c, this.f61260f}, h.INSTANCE);
        RoomStruct roomStruct = this.g;
        if (roomStruct != null) {
            UrlModel urlModel = roomStruct.roomCover;
            if (urlModel != null) {
                this.f61257c.post(new f(urlModel, this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(RoomStruct roomStruct) {
        RoomStruct roomStruct2 = roomStruct;
        if (PatchProxy.isSupport(new Object[]{roomStruct2}, this, f61255a, false, 67399, new Class[]{RoomStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{roomStruct2}, this, f61255a, false, 67399, new Class[]{RoomStruct.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1009").a("enter_from_merge", "others_homepage").a("action_type", "click");
        User user = roomStruct2.owner;
        Intrinsics.checkExpressionValueIsNotNull(user, "room.owner");
        r.a("livesdk_live_show", (Map) a2.a("anchor_id", user.getUid()).a("room_id", roomStruct2.id).a("request_id", roomStruct.getRequestId()).a("enter_method", "live_cover").f34114b);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        if (PatchProxy.isSupport(new Object[]{bool}, this, f61255a, false, 67394, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, f61255a, false, 67394, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.g;
        if (roomStruct != null) {
            if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                this.j.a(true, roomStruct, this.f61258d);
            } else {
                this.j.b();
                a(new View[]{this.f61256b, this.f61259e}, c.INSTANCE);
                a(new View[]{this.f61257c}, d.INSTANCE);
            }
            if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                a(roomStruct);
            }
            this.i = Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE);
            if (this.i) {
                Consumer<com.ss.android.ugc.aweme.live.feedpage.b> consumer = this.l;
                if (consumer == null) {
                    consumer = new e<>(this, roomStruct);
                }
                this.l = consumer;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveViewHolder(@NotNull View view, @NotNull FragmentActivity fragmentActivity) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        this.k = fragmentActivity;
        View findViewById = view.findViewById(C0906R.id.dky);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_top)");
        this.f61256b = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.cf8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.riv_cover)");
        this.f61257c = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.afv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.fl_live_container)");
        this.f61258d = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.dln);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.tv_watch_people_count)");
        this.f61259e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.aeh);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.finished_status)");
        this.f61260f = (TextView) findViewById5;
        ViewModel viewModel = ViewModelProviders.of(this.k).get(MainAnimViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…nimViewModel::class.java)");
        this.h = (MainAnimViewModel) viewModel;
        view.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61261a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LiveViewHolder f61262b;

            {
                this.f61262b = r1;
            }

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f61261a, false, 67402, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f61261a, false, 67402, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                RoomStruct roomStruct = this.f61262b.g;
                if (roomStruct != null) {
                    com.ss.android.ugc.aweme.story.live.c a2 = com.ss.android.ugc.aweme.story.live.c.a();
                    Intrinsics.checkExpressionValueIsNotNull(view2, NotifyType.VIBRATE);
                    a2.a(new c.a(view.getContext(), roomStruct.owner).b("others_homepage").c("live_cover"));
                }
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View[] r20, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f61255a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.view.View[]> r4 = android.view.View[].class
            r8[r10] = r4
            java.lang.Class<kotlin.jvm.functions.Function1> r4 = kotlin.jvm.functions.Function1.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 67401(0x10749, float:9.4449E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f61255a
            r15 = 0
            r16 = 67401(0x10749, float:9.4449E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r10] = r1
            java.lang.Class<kotlin.jvm.functions.Function1> r1 = kotlin.jvm.functions.Function1.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            int r2 = r0.length
        L_0x0048:
            if (r10 >= r2) goto L_0x0052
            r3 = r0[r10]
            r1.invoke(r3)
            int r10 = r10 + 1
            goto L_0x0048
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder.a(android.view.View[], kotlin.jvm.functions.Function1):void");
    }
}
