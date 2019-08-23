package com.ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.l;
import com.bytedance.android.livesdkapi.depend.d.m;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\u001bH\u0016J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/DetailFeedLiveViewHolder;", "Lcom/ss/android/ugc/aweme/feed/adapter/BaseFeedLiveViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "pageId", "", "eventType", "", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;JLjava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "liveRoomFragment", "Lcom/bytedance/android/livesdkapi/depend/live/ILiveRoomPageFragment;", "mCoverView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mHasAdd", "", "mLiveContainer", "Landroid/widget/FrameLayout;", "getPageId", "()J", "setPageId", "(J)V", "bind", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "loadDirectly", "bindView", "getActionType", "playLive", "resumeFeedPlay", "tryPauseLive", "unBind", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {
    public static ChangeQuickRedirect h;
    public final RemoteImageView i;
    h j;
    public long k;
    @NotNull
    public final String l;
    private final FrameLayout m;
    private boolean n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/DetailFeedLiveViewHolder$bind$1", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedLiveCallBack;", "onLivePause", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f44887b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f44886a, false, 40350, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44886a, false, 40350, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.f44887b;
            if (PatchProxy.isSupport(new Object[0], bVar, b.h, false, 40346, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.h, false, 40346, new Class[0], Void.TYPE);
                return;
            }
            if (bVar.k == com.ss.android.ugc.aweme.video.d.a()) {
                h hVar = bVar.j;
                if (hVar != null) {
                    hVar.h();
                }
                FeedPagerAdapter.a(-1);
            }
        }

        a(b bVar) {
            this.f44887b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/feed/adapter/DetailFeedLiveViewHolder$bindView$1$1$1", "com/ss/android/ugc/aweme/feed/adapter/DetailFeedLiveViewHolder$$special$$inlined$also$lambda$1"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$b  reason: collision with other inner class name */
    static final class C0557b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UrlModel f44889b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f44890c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f44891d;

        C0557b(UrlModel urlModel, Bundle bundle, b bVar) {
            this.f44889b = urlModel;
            this.f44890c = bundle;
            this.f44891d = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f44888a, false, 40351, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44888a, false, 40351, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.c.a(this.f44891d.i, this.f44889b, this.f44891d.i.getWidth(), this.f44891d.i.getHeight(), (Postprocessor) new com.ss.android.ugc.aweme.newfollow.live.a(5, (((float) this.f44889b.getWidth()) * 1.0f) / ((float) this.f44891d.i.getWidth()), null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000í\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/DetailFeedLiveViewHolder$bindView$1$2$2", "Lcom/bytedance/android/livesdkapi/depend/live/IRoomEventListener;", "onFirsFrame", "", "onInteractionViewsAdapt", "isPortrait", "", "interactionLayout", "Landroid/view/View;", "closeView", "shadowOfTopLayout", "orientationSwitch", "onLiveEnd", "liveEndView", "exitView", "main_douyinCnRelease", "com/ss/android/ugc/aweme/feed/adapter/DetailFeedLiveViewHolder$$special$$inlined$apply$lambda$1"}, k = 1, mv = {1, 1, 15})
    public static final class c implements m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f44893b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f44892a, false, 40353, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44892a, false, 40353, new Class[0], Void.TYPE);
                return;
            }
            this.f44893b.i.setVisibility(8);
        }

        c(b bVar) {
            this.f44893b = bVar;
        }

        public final void a(@Nullable View view, @Nullable View view2) {
            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f44892a, false, 40352, new Class[]{View.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2}, this, f44892a, false, 40352, new Class[]{View.class, View.class}, Void.TYPE);
                return;
            }
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44894a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f44895b;

                    {
                        this.f44895b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f44894a, false, 40355, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f44894a, false, 40355, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        Context n = this.f44895b.f44893b.n();
                        if (n != null) {
                            ((Activity) n).finish();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                });
            }
            if (view2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(com.ss.android.ugc.aweme.profile.a.a(), "AdaptationManager.getInstance()");
                if (!com.ss.android.ugc.aweme.profile.a.d()) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin += UIUtils.getStatusBarHeight(this.f44893b.n());
                        view2.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            }
            this.f44893b.i.setVisibility(8);
        }

        public final void a(boolean z, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4) {
            View view5 = view;
            View view6 = view2;
            View view7 = view3;
            View view8 = view4;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view5, view6, view7, view8}, this, f44892a, false, 40354, new Class[]{Boolean.TYPE, View.class, View.class, View.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view5, view6, view7, view8}, this, f44892a, false, 40354, new Class[]{Boolean.TYPE, View.class, View.class, View.class, View.class}, Void.TYPE);
                return;
            }
            if (z) {
                Intrinsics.checkExpressionValueIsNotNull(com.ss.android.ugc.aweme.profile.a.a(), "AdaptationManager.getInstance()");
                if (!com.ss.android.ugc.aweme.profile.a.d()) {
                    if (view5 != null) {
                        view5.setPadding(0, UIUtils.getStatusBarHeight(this.f44893b.n()), 0, 0);
                    }
                    if (view7 != null) {
                        view7.setVisibility(8);
                    }
                }
            }
            if (view6 != null) {
                view6.setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44896a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f44897b;

                    {
                        this.f44897b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f44896a, false, 40356, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f44896a, false, 40356, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        Context n = this.f44897b.f44893b.n();
                        if (n != null) {
                            ((Activity) n).finish();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                });
            }
            if (view8 != null) {
                view8.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "exitRoom"}, k = 3, mv = {1, 1, 15})
    static final class d implements l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f44898a = new d();

        d() {
        }

        public final void a() {
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40343, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        h hVar = this.j;
        if (hVar != null && (this.f3136b instanceof FragmentActivity)) {
            FragmentTransaction beginTransaction = ((FragmentActivity) this.f3136b).getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
            beginTransaction.remove(hVar.d()).commitAllowingStateLoss();
        }
        this.n = false;
        this.i.setVisibility(0);
    }

    public final void b() {
        long j2;
        Long l2;
        Long l3;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40344, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null) {
            j2 = roomStruct.id;
        } else {
            j2 = -1;
        }
        FeedPagerAdapter.a(j2);
        RoomStruct roomStruct2 = this.f3138d;
        String str = null;
        if (roomStruct2 != null) {
            l2 = Long.valueOf(roomStruct2.id);
        } else {
            l2 = null;
        }
        if (l2 != null) {
            RoomStruct roomStruct3 = this.f3138d;
            if (roomStruct3 != null) {
                l3 = Long.valueOf(roomStruct3.id);
            } else {
                l3 = null;
            }
            if (l3 == null) {
                Intrinsics.throwNpe();
            }
            FeedPagerAdapter.a(l3.longValue(), this.k);
        }
        RoomStruct roomStruct4 = this.f3138d;
        if (roomStruct4 != null) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putString("enter_from_merge", this.l);
            bundle2.putString("enter_method", "live_cover");
            Aweme aweme = this.f3137c;
            if (aweme != null) {
                str = aweme.getRequestId();
            }
            bundle.putString("live.intent.extra.REQUEST_ID", str);
            bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
            bundle.putLong("anchor_id", roomStruct4.getAnchorId());
            UrlModel urlModel = roomStruct4.roomCover;
            if (urlModel != null) {
                bundle.putStringArrayList("live.intent.extra.BG_URLS", new ArrayList(urlModel.getUrlList()));
                this.i.post(new C0557b(urlModel, bundle, this));
            }
            this.j = com.ss.android.ugc.aweme.live.a.d().a(roomStruct4.id, bundle);
            h hVar = this.j;
            if (hVar != null) {
                hVar.a((l) d.f44898a);
                hVar.a((m) new c(this));
            }
            this.m.setId(ao.a());
        }
    }

    public final void l() {
        long j2;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40345, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        if (this.j != null && (this.f3136b instanceof FragmentActivity)) {
            com.bytedance.android.livesdkapi.service.c d2 = com.ss.android.ugc.aweme.live.a.d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "Live.getService()");
            d2.f().a(this.f3136b.hashCode(), (LifecycleOwner) this.f3136b);
        }
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null) {
            h hVar = this.j;
            if (hVar != null) {
                Fragment d3 = hVar.d();
                if (d3 != null) {
                    Bundle arguments = d3.getArguments();
                    if (arguments != null) {
                        arguments.putLong("anchor_id", roomStruct.getAnchorId());
                    }
                }
            }
        }
        RoomStruct roomStruct2 = this.f3138d;
        if (roomStruct2 != null) {
            j2 = roomStruct2.id;
        } else {
            j2 = -1;
        }
        FeedPagerAdapter.a(j2);
        if (this.n) {
            h hVar2 = this.j;
            if (hVar2 != null) {
                hVar2.a("draw");
            }
        } else {
            h hVar3 = this.j;
            if (hVar3 != null) {
                Fragment d4 = hVar3.d();
                if (d4 != null) {
                    Bundle arguments2 = d4.getArguments();
                    if (arguments2 != null) {
                        if (PatchProxy.isSupport(new Object[0], this, h, false, 40348, new Class[0], String.class)) {
                            str = (String) PatchProxy.accessDispatch(new Object[0], this, h, false, 40348, new Class[0], String.class);
                        } else if (TextUtils.equals(this.f3140f, "click")) {
                            str = this.f3140f;
                        } else {
                            str = "draw";
                        }
                        arguments2.putString("live.intent.extra.ENTER_TYPE", str);
                    }
                }
                if (this.f3136b instanceof FragmentActivity) {
                    FragmentTransaction beginTransaction = ((FragmentActivity) this.f3136b).getSupportFragmentManager().beginTransaction();
                    Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
                    beginTransaction.replace(this.m.getId(), hVar3.d()).commitAllowingStateLoss();
                    this.n = true;
                }
            }
        }
    }

    public final void a_(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, h, false, 40347, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, h, false, 40347, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        l();
    }

    public final void a(@Nullable Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 40342, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, h, false, 40342, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, z);
        this.f3139e = new a(this);
        if (this.j != null && (this.f3136b instanceof FragmentActivity)) {
            com.bytedance.android.livesdkapi.service.c d2 = com.ss.android.ugc.aweme.live.a.d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "Live.getService()");
            d2.f().a(this.f3136b.hashCode(), (LifecycleOwner) this.f3136b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull View view, @Nullable aa<ar> aaVar, long j2, @NotNull String str) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "eventType");
        this.k = j2;
        this.l = str;
        View findViewById = view.findViewById(C0906R.id.cf8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.riv_cover)");
        this.i = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.afv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.fl_live_container)");
        this.m = (FrameLayout) findViewById2;
        if (this.f3136b instanceof FragmentActivity) {
            ((FragmentActivity) this.f3136b).getLifecycle().addObserver(new DetailFeedLiveViewHolder$1(this));
        }
    }
}
