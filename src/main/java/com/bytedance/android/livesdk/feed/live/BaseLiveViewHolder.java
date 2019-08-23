package com.bytedance.android.livesdk.feed.live;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.livesdk.feed.b.b;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.dislike.a;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.ui.a;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.d.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;

public abstract class BaseLiveViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14221a;

    /* renamed from: d  reason: collision with root package name */
    protected final a f14222d;

    /* renamed from: e  reason: collision with root package name */
    protected final g f14223e;

    /* renamed from: f  reason: collision with root package name */
    protected final c f14224f;
    protected final boolean g;
    protected final f h;
    protected com.bytedance.android.livesdk.feed.d.g i;
    public Room j;
    private final PublishSubject<FeedItem> k;
    private final PublishSubject<Boolean> l;
    private final PublishSubject<Object> m;
    private final PublishSubject<Object> n;

    public abstract void a(@NonNull FeedItem feedItem, @NonNull Room room, int i2);

    public final boolean a(FeedItem feedItem, boolean z, String str, Bundle bundle) {
        FeedItem feedItem2 = feedItem;
        if (PatchProxy.isSupport(new Object[]{feedItem2, (byte) 1, str, bundle}, this, f14221a, false, 8712, new Class[]{FeedItem.class, Boolean.TYPE, String.class, Bundle.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{feedItem2, (byte) 1, str, bundle}, this, f14221a, false, 8712, new Class[]{FeedItem.class, Boolean.TYPE, String.class, Bundle.class}, Boolean.TYPE)).booleanValue();
        } else if (feedItem2 == null || !(feedItem2.item instanceof Room)) {
            return false;
        } else {
            Room room = (Room) feedItem2.item;
            if (!room.isPullUrlValid()) {
                return false;
            }
            room.setLog_pb(feedItem2.logPb);
            room.setRequestId(feedItem2.resId);
            Context context = this.itemView.getContext();
            if (!NetworkUtils.isNetworkAvailable(context)) {
                com.bytedance.android.live.uikit.d.a.a(context, (int) C0906R.string.cwz);
                return false;
            }
            if (!com.bytedance.android.livesdk.feed.l.c.c() || b.c().b().a().a() || NetworkUtils.isWifi(context)) {
                a(context, feedItem, true, str, bundle);
            } else {
                final Context context2 = context;
                final FeedItem feedItem3 = feedItem;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                AnonymousClass1 r0 = new a.C0104a(true) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f14225a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f14225a, false, 8728, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f14225a, false, 8728, new Class[0], Void.TYPE);
                            return;
                        }
                        b.c().a();
                        if (!TextUtils.isEmpty((CharSequence) null.first)) {
                            b.c().j().a(context2, (String) null.first, new Bundle());
                        }
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f14225a, false, 8729, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f14225a, false, 8729, new Class[0], Void.TYPE);
                            return;
                        }
                        b.c().b().a().a(true);
                        BaseLiveViewHolder.this.a(context2, feedItem3, true, str2, bundle2);
                    }
                };
                new com.bytedance.android.livesdk.feed.ui.a(context, r0).show();
            }
            return true;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14221a, false, 8710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14221a, false, 8710, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        a(this.j);
    }

    public final void e() {
        PopupWindow.OnDismissListener onDismissListener;
        if (PatchProxy.isSupport(new Object[0], this, f14221a, false, 8714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14221a, false, 8714, new Class[0], Void.TYPE);
        } else if (this.g) {
            com.bytedance.ies.e.b a2 = com.bytedance.ies.e.b.a(this.itemView.getContext());
            long a3 = a2.a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0);
            if (a3 >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > a3 && currentTimeMillis - a3 <= 5500) {
                    a2.a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) -1L).a();
                    if (PatchProxy.isSupport(new Object[0], this, f14221a, false, 8715, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f14221a, false, 8715, new Class[0], Void.TYPE);
                        return;
                    }
                    int[] iArr = new int[2];
                    this.itemView.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    View view = (View) this.itemView.getParent();
                    if (view != null) {
                        view.getLocationInWindow(iArr2);
                        int max = Math.max(0, iArr2[1] - iArr[1]);
                        int height = (this.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + this.itemView.getHeight()) - iArr2[1]) - view.getHeight());
                        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(C0906R.dimen.n1);
                        View inflate = View.inflate(this.itemView.getContext(), C0906R.layout.alg, null);
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(C0906R.id.f9);
                        ((LinearLayout.LayoutParams) lottieAnimationView.getLayoutParams()).topMargin = (int) (((((float) this.itemView.getHeight()) / 2.0f) - (((float) dimensionPixelSize) / 2.0f)) - ((float) max));
                        PopupWindow popupWindow = new PopupWindow(inflate, this.itemView.getWidth(), height, true);
                        inflate.setOnClickListener(new d(popupWindow));
                        popupWindow.showAtLocation(this.itemView, 51, iArr[0], iArr[1] + max);
                        lottieAnimationView.getClass();
                        if (PatchProxy.isSupport(new Object[]{lottieAnimationView}, null, e.f14263a, true, 8722, new Class[]{LottieAnimationView.class}, PopupWindow.OnDismissListener.class)) {
                            onDismissListener = (PopupWindow.OnDismissListener) PatchProxy.accessDispatch(new Object[]{lottieAnimationView}, null, e.f14263a, true, 8722, new Class[]{LottieAnimationView.class}, PopupWindow.OnDismissListener.class);
                        } else {
                            onDismissListener = new e(lottieAnimationView);
                        }
                        popupWindow.setOnDismissListener(onDismissListener);
                        lottieAnimationView.setAnimation("dislike_live_tips.json");
                        lottieAnimationView.loop(true);
                        lottieAnimationView.playAnimation();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Room room) throws Exception {
        this.f14223e.a(this.f14224f, String.valueOf(room.getId()));
        com.bytedance.android.live.uikit.d.a.a(this.itemView.getContext(), (int) C0906R.string.cwn);
    }

    public final void a(Room room) {
        long j2;
        String str;
        String str2;
        Room room2 = room;
        if (PatchProxy.isSupport(new Object[]{room2}, this, f14221a, false, 8711, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2}, this, f14221a, false, 8711, new Class[]{Room.class}, Void.TYPE);
        } else if (room2 != null) {
            if (room.getOwner() == null) {
                j2 = 0;
            } else {
                j2 = room.getOwner().getId();
            }
            HashMap hashMap = new HashMap();
            String str3 = "live";
            if (FeedLiveFragment.C != null && !TextUtils.isEmpty(FeedLiveFragment.C.h)) {
                str3 = FeedLiveFragment.C.h;
            }
            if (com.bytedance.android.livesdk.feed.l.c.c() || com.bytedance.android.livesdk.feed.l.c.d()) {
                hashMap.put("enter_from_merge", "live_" + str3);
            } else {
                hashMap.put("enter_from_merge", "live_merge");
            }
            hashMap.put("enter_method", "live_cover");
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("anchor_id", String.valueOf(j2));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("show_type", "stay");
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            hashMap.put("live_type", str);
            if (room2.isThirdParty) {
                str2 = "thirdparty";
            } else {
                str2 = "general";
            }
            hashMap.put("streaming_type", str2);
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", "live");
            hashMap.put("event_type", "core");
            hashMap.put("event_module", "live");
            hashMap.put("action_type", "click");
            com.bytedance.android.livesdk.feed.g.b.a().a("live_show", hashMap);
        }
    }

    @CallSuper
    public final /* synthetic */ void a(Object obj, int i2) {
        FeedItem feedItem = (FeedItem) obj;
        if (PatchProxy.isSupport(new Object[]{feedItem, Integer.valueOf(i2)}, this, f14221a, false, 8709, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem, Integer.valueOf(i2)}, this, f14221a, false, 8709, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE);
        } else if (feedItem == null || !(feedItem.item instanceof Room)) {
            this.itemView.setOnLongClickListener(null);
            this.j = null;
        } else {
            this.j = (Room) feedItem.item;
            if (this.g) {
                this.itemView.setOnLongClickListener(new a(this));
            } else {
                this.itemView.setOnLongClickListener(null);
            }
            a(feedItem, this.j, i2);
            if (this.l != null) {
                a(this.l.subscribe(new b(this), c.f14260b));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Room room, PopupWindow popupWindow) {
        Observable observable;
        Room room2 = room;
        String str = this.f14224f.f14075c;
        if (PatchProxy.isSupport(new Object[]{room2, str}, this, f14221a, false, 8717, new Class[]{Room.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2, str}, this, f14221a, false, 8717, new Class[]{Room.class, String.class}, Void.TYPE);
        } else {
            com.bytedance.android.livesdk.feed.dislike.a aVar = this.f14222d;
            long id = room.getId();
            long ownerUserId = room.getOwnerUserId();
            String requestId = room.getRequestId();
            String log_pb = room.getLog_pb();
            Object[] objArr = {new Long(id), new Long(ownerUserId), requestId, str, log_pb};
            if (PatchProxy.isSupport(objArr, aVar, com.bytedance.android.livesdk.feed.dislike.a.f14089a, false, 8584, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class}, Observable.class)) {
                Object[] objArr2 = {new Long(id), new Long(ownerUserId), requestId, str, log_pb};
                ChangeQuickRedirect changeQuickRedirect = com.bytedance.android.livesdk.feed.dislike.a.f14089a;
                Object[] objArr3 = objArr2;
                com.bytedance.android.livesdk.feed.dislike.a aVar2 = aVar;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                observable = (Observable) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect2, false, 8584, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class}, Observable.class);
            } else {
                observable = aVar.f14090b.dislikeRoom(id, ownerUserId, requestId, str, str, log_pb).map(com.bytedance.android.livesdk.feed.dislike.b.f14092b).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
            a(observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new h(this, room2), new i(this)));
            String str2 = this.f14224f.f14075c;
            if (str2.contains("live") && FeedLiveFragment.C != null) {
                this.i = FeedLiveFragment.C;
                str2 = FeedLiveFragment.C.h;
            }
            HashMap hashMap = new HashMap();
            if (com.bytedance.android.livesdk.feed.l.c.c() || com.bytedance.android.livesdk.feed.l.c.d()) {
                hashMap.put("enter_from_merge", "live_" + str2);
            } else {
                hashMap.put("enter_from_merge", "live_merge");
            }
            hashMap.put("enter_method", "live_cover");
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("event_belong", "live_interact");
            hashMap.put("event_page", "live");
            hashMap.put("event_type", "core");
            hashMap.put("event_module", str2);
            com.bytedance.android.livesdk.feed.g.b.a().a("live_dislike", hashMap);
        }
        j.a(popupWindow);
    }

    public final void a(Context context, FeedItem feedItem, boolean z, String str, Bundle bundle) {
        Context context2 = context;
        FeedItem feedItem2 = feedItem;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, feedItem2, Byte.valueOf(z ? (byte) 1 : 0), str, bundle2}, this, f14221a, false, 8713, new Class[]{Context.class, FeedItem.class, Boolean.TYPE, String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, feedItem2, Byte.valueOf(z), str, bundle2}, this, f14221a, false, 8713, new Class[]{Context.class, FeedItem.class, Boolean.TYPE, String.class, Bundle.class}, Void.TYPE);
        } else if (h.e() == null || h.e().e() == null) {
            com.bytedance.android.livesdk.feed.g.b.a().a("livesdk_rd_plugin_init_failed", new HashMap());
            com.bytedance.android.live.uikit.d.a.a(context2, (int) C0906R.string.cwp);
        } else {
            n d2 = h.e().d();
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (d2 != null) {
                if (!h.e().e().f() || !TextUtils.equals(h.e().e().h(), this.j.buildPullUrl())) {
                    d2.a(com.bytedance.android.livesdkapi.depend.d.a.FEED);
                } else {
                    d2.a(com.bytedance.android.livesdkapi.depend.d.a.FEED_WITH_PREVIEW);
                }
            }
            if (z) {
                com.bytedance.android.livesdk.feed.f.a aVar = new com.bytedance.android.livesdk.feed.f.a(this.f14224f, this.f14223e);
                int b2 = aVar.b(this.j.getId());
                this.h.a(aVar);
                Bundle a2 = p.a(context, b2, "live_cover", str, 1, this.g, bundle);
                if (a2 != null) {
                    hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    hashMap.put("location", "before start activity");
                    if (a2.get("live.intent.extra.USER_ID") == null) {
                        a2.putString("live.intent.extra.USER_ID", String.valueOf(this.j.getOwnerUserId()));
                    }
                    if (this.i != null && this.i.c()) {
                        a2.putString("double_stream_feed_url", this.f14224f.f14074b);
                    }
                    com.bytedance.android.livesdk.feed.g.b.a().a("feed_enter_room", hashMap);
                    if (!(h.f() == null || h.f().k() == null)) {
                        h.f().k().a(context2, this.j.getId(), a2);
                    }
                }
                if (this.g) {
                    com.bytedance.ies.e.b a3 = com.bytedance.ies.e.b.a(context);
                    if (a3.a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0) >= 0) {
                        a3.a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) Long.valueOf(System.currentTimeMillis())).a();
                    }
                }
                hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                hashMap.put("location", "after sp");
                com.bytedance.android.livesdk.feed.g.b.a().a("feed_enter_room", hashMap);
            } else {
                Bundle a4 = p.a(context2, this.j, this.f14224f.f14075c, bundle2);
                if (!(a4 == null || h.f() == null || h.f().k() == null)) {
                    if (a4.get("live.intent.extra.USER_ID") == null) {
                        a4.putString("live.intent.extra.USER_ID", String.valueOf(this.j.getOwnerUserId()));
                    }
                    h.f().k().a(context2, this.j.getId(), a4);
                }
            }
            this.k.onNext(feedItem2);
        }
    }

    public BaseLiveViewHolder(View view, com.bytedance.android.livesdk.feed.dislike.a aVar, g gVar, c cVar, k kVar, f fVar, PublishSubject<FeedItem> publishSubject, PublishSubject<Boolean> publishSubject2, PublishSubject<Object> publishSubject3, PublishSubject<Object> publishSubject4) {
        super(view);
        boolean z;
        this.f14222d = aVar;
        this.f14223e = gVar;
        this.f14224f = cVar;
        if (cVar == null || kVar == null || !kVar.b(cVar.f14076d)) {
            z = false;
        } else {
            z = true;
        }
        this.g = z;
        this.h = fVar;
        this.k = publishSubject;
        this.l = publishSubject2;
        this.m = publishSubject4;
        this.n = publishSubject3;
        if (cVar.f14075c.equals("live")) {
            this.i = FeedLiveFragment.C;
        } else {
            this.i = kVar.a(cVar.f14076d);
        }
    }
}
