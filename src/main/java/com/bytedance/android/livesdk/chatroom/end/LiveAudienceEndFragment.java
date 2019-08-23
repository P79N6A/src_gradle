package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.f;
import com.bytedance.android.live.core.utils.ae;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar;
import com.bytedance.android.livesdk.chatroom.end.j;
import com.bytedance.android.livesdk.j.d;
import com.bytedance.android.livesdk.schema.a.b;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LiveAudienceEndFragment extends LiveEndFragment implements j.a, a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10032a;

    /* renamed from: b  reason: collision with root package name */
    public View f10033b;

    /* renamed from: c  reason: collision with root package name */
    public List<Room> f10034c;
    public DataCenter h;
    private a i;
    private Activity j;
    private WeakHandler k = new WeakHandler(this);
    private VHeadView l;
    private TextView m;
    private HSImageView n;
    private TopFansLayout o;
    private View p;
    private View q;
    private LinearLayout r;
    private View s;
    private List<LiveRecommendBar> t = new ArrayList();
    private j u;
    private View.OnClickListener v = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10035a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10036c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10035a, true, 4206, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10035a, true, 4206, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LiveAudienceEndFragment.java", AnonymousClass1.class);
            f10036c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.end.LiveAudienceEndFragment$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 121);
        }

        public void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f10035a, false, 4205, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10035a, false, 4205, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10036c, this, this, view));
            if (view.getTag() != null && (view.getTag() instanceof Room)) {
                Room room = (Room) view.getTag();
                Bundle bundle = new Bundle();
                if (LiveAudienceEndFragment.this.C) {
                    str = "anchor_live_ending";
                } else {
                    str = "live_end";
                }
                bundle.putString("enter_from", str);
                bundle.putString("log_pb", room.getLog_pb());
                bundle.putString("request_id", room.getRequestId());
                bundle.putString("enter_from_merge", "live_end");
                bundle.putString("live.intent.extra.LOG_PB", room.getLog_pb());
                bundle.putString("live.intent.extra.REQUEST_ID", room.getRequestId());
                bundle.putString("enter_method", "live_cover");
                com.bytedance.android.livesdk.schema.a.a m = com.bytedance.android.livesdk.v.j.q().m();
                Context context = LiveAudienceEndFragment.this.getContext();
                b.a a2 = new b.a().a(room.getId());
                a2.n = room.getRequestId();
                b.a b2 = a2.b("live_end").h(room.getLog_pb()).b(room.getUserFrom());
                b2.r = room.getOrientation();
                b.a i = b2.i("live_end");
                i.q = bundle;
                m.a(context, i);
                com.bytedance.android.livesdk.v.j.q().i().f15874a = new com.bytedance.android.livesdk.live.b.a("live_end");
            }
        }
    };
    private View.OnClickListener w = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10038a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10039c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10038a, true, 4208, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10038a, true, 4208, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveAudienceEndFragment.java", AnonymousClass2.class);
            f10039c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.end.LiveAudienceEndFragment$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 391);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f10038a, false, 4207, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10038a, false, 4207, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f10039c, this, this, view));
            int id = view.getId();
            if (id == C0906R.id.agq) {
                LiveAudienceEndFragment.this.b();
            } else if (id == C0906R.id.j6) {
                LiveAudienceEndFragment.this.d();
            } else {
                if (id == C0906R.id.d43) {
                    LiveAudienceEndFragment.this.c();
                }
            }
        }
    };
    private LiveRecommendBar.a x = new LiveRecommendBar.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10041a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f10041a, false, 4209, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f10041a, false, 4209, new Class[0], Void.TYPE);
                return;
            }
            if (LiveAudienceEndFragment.this.getUserVisibleHint() && LiveAudienceEndFragment.this.f10034c.size() >= 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(LiveAudienceEndFragment.this.f10034c.get(0));
                arrayList.add(LiveAudienceEndFragment.this.f10034c.get(1));
                LiveAudienceEndFragment.this.f10034c.removeAll(arrayList);
                LiveAudienceEndFragment.this.a((List<Room>) arrayList);
            }
        }
    };

    public final void a(List<Room> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10032a, false, 4198, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10032a, false, 4198, new Class[]{List.class}, Void.TYPE);
        } else if (this.r.getChildCount() >= 2) {
            int i2 = 0;
            while (i2 < list.size() && i2 < 2) {
                Room room = list.get(i2);
                if (Room.isValid(room)) {
                    a(room, this.r.getChildAt(i2), i2 == 0);
                }
                i2++;
            }
            if (this.f10034c.size() <= 4) {
                com.bytedance.android.livesdk.chatroom.api.a.a(this.k, this.B.getId());
            }
        }
    }

    public final boolean i_() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4181, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4181, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.i != null && this.i.i_()) {
            z = true;
        }
        return z;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4192, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.k != null) {
            this.k.removeCallbacks(null);
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4189, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!CollectionUtils.isEmpty(this.t)) {
            for (LiveRecommendBar next : this.t) {
                if (next != null) {
                    next.a();
                }
            }
        }
    }

    public void onResume() {
        LiveRecommendBar.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4190, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!CollectionUtils.isEmpty(this.t)) {
            for (LiveRecommendBar next : this.t) {
                if (next != null && getUserVisibleHint()) {
                    if (this.t.indexOf(next) == 0) {
                        aVar = this.x;
                    } else {
                        aVar = null;
                    }
                    next.a(aVar);
                }
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4193, new Class[0], Void.TYPE);
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            TTLiveSDKContext.getHostService().k().a(getContext(), i.a().a(f.a()).b(f.b()).a(-1).d("live_detail").e("follow").c("live").a()).subscribe((Observer<? super T>) new g<Object>());
        } else {
            User owner = this.B.getOwner();
            if (owner != null) {
                this.u.a(owner.getId(), this.B, this.E, this);
            }
            if (com.bytedance.android.livesdk.utils.j.b(this.h)) {
                ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", com.bytedance.android.livesdk.utils.j.c(this.h));
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10032a, false, 4195, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10032a, false, 4195, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
        } else if (this.j != null) {
            if (this.p != null && this.p.getVisibility() == 0) {
                this.p.setVisibility(8);
            }
            com.bytedance.android.live.uikit.d.a.a((Context) this.j, (int) C0906R.string.d36);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f10032a, false, 4183, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f10032a, false, 4183, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.B != null) {
            h.a().a((Handler) this.k, false, this.B.getId(), 4, 12);
            this.u = new j();
        }
    }

    public void setUserVisibleHint(boolean z) {
        LiveRecommendBar.a aVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10032a, false, 4191, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10032a, false, 4191, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!CollectionUtils.isEmpty(this.t)) {
            for (LiveRecommendBar next : this.t) {
                if (next != null) {
                    if (z) {
                        if (this.t.indexOf(next) == 0) {
                            aVar = this.x;
                        } else {
                            aVar = null;
                        }
                        next.a(aVar);
                    } else {
                        next.a();
                    }
                }
            }
        }
    }

    private void a(RoomStats roomStats) {
        if (PatchProxy.isSupport(new Object[]{roomStats}, this, f10032a, false, 4187, new Class[]{RoomStats.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{roomStats}, this, f10032a, false, 4187, new Class[]{RoomStats.class}, Void.TYPE);
        } else if (roomStats != null && b_()) {
            UIUtils.setViewVisibility(a(C0906R.id.av2), 0);
            TextView textView = (TextView) a(C0906R.id.av8);
            if (textView != null) {
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    textView.setTextSize(24.0f);
                    try {
                        textView.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/DIN_Alternate.ttf"));
                    } catch (Throwable th) {
                        if (Logger.debug()) {
                            Logger.throwException(th);
                        }
                    }
                    String a2 = e.a(roomStats.getTicket());
                    if (e.e(roomStats.getTicket())) {
                        textView.setText(ae.a(a2, 0.6777f, a2.length() - 1, a2.length()));
                    } else {
                        textView.setText(a2);
                    }
                } else {
                    UIUtils.setText(textView, e.a(roomStats.getTicket()));
                    String a3 = e.a(roomStats.getTicket());
                    if (!e.e(roomStats.getTicket())) {
                        textView.setText(a3);
                    } else if (com.bytedance.android.live.uikit.a.a.d()) {
                        textView.setText(ae.b(a3, 20.0f, a3.length() - 1, a3.length()));
                    } else {
                        textView.setText(ae.a(a3, 0.6777f, a3.length() - 1, a3.length()));
                    }
                }
            }
        }
    }

    private void a(Room room) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{room}, this, f10032a, false, 4200, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, this, f10032a, false, 4200, new Class[]{Room.class}, Void.TYPE);
        } else if (room != null) {
            if (this.C) {
                str = "anchor_live_ending";
            } else {
                str = "live_end";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("action_type", "click");
            hashMap.put("event_page", str);
            hashMap.put("enter_from", "live_detail");
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("room_id", String.valueOf(room.getId()));
            if (room.isLiveTypeAudio()) {
                str2 = "voice_live";
            } else {
                str2 = "video_live";
            }
            hashMap.put("live_type", str2);
            hashMap.put("enter_from_merge", "live_end");
            hashMap.put("enter_method", "live_cover");
            if (TextUtils.isEmpty(room.getLinkMicInfo())) {
                com.bytedance.android.livesdk.j.a.a().a("live_show", hashMap, new com.bytedance.android.livesdk.j.c.j());
                return;
            }
            Observable.just(room.getLinkMicInfo()).map(a.f10096b).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new b(hashMap), c.f10100b);
        }
    }

    public void handleMsg(Message message) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{message}, this, f10032a, false, 4182, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f10032a, false, 4182, new Class[]{Message.class}, Void.TYPE);
        } else if (this.j != null && !this.j.isFinishing()) {
            int i2 = message.what;
            if (message.obj instanceof Exception) {
                if ((!com.bytedance.android.livesdkapi.a.a.f18614b || !(i2 == 21 || i2 == 22)) && (message.obj instanceof com.bytedance.android.live.a.a.b.a)) {
                    com.bytedance.android.live.uikit.d.a.a((Context) this.j, ((com.bytedance.android.live.a.a.b.a) message.obj).getPrompt());
                }
                return;
            }
            if (12 == i2 && (message.obj instanceof Room)) {
                Room room = (Room) message.obj;
                if (PatchProxy.isSupport(new Object[]{room}, this, f10032a, false, 4194, new Class[]{Room.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{room}, this, f10032a, false, 4194, new Class[]{Room.class}, Void.TYPE);
                } else if (!(room == null || room.getStats() == null)) {
                    User owner = this.B.getOwner();
                    if (owner != null && owner.isFollowing()) {
                        this.D = true;
                        UIUtils.setViewVisibility(this.p, 8);
                    }
                    if (Lists.isEmpty(room.getTopFanTickets())) {
                        UIUtils.setViewVisibility(this.o, 8);
                    } else {
                        this.o.setFollowVisible(false);
                        this.o.setDataCenter(this.h);
                        this.o.a(this.j, this, room, this.E);
                        a(room.getStats());
                    }
                }
            }
            if (22 == i2 && (message.obj instanceof List)) {
                try {
                    List<Room> list = (List) message.obj;
                    if (this.q.getVisibility() == 0) {
                        this.f10034c.addAll(list);
                    } else {
                        if (PatchProxy.isSupport(new Object[]{list}, this, f10032a, false, 4197, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list}, this, f10032a, false, 4197, new Class[]{List.class}, Void.TYPE);
                        } else if (b_() && list != null && !list.isEmpty()) {
                            if (list.size() >= 2) {
                                this.q.setVisibility(0);
                                int screenWidth = UIUtils.getScreenWidth(getContext());
                                int dip2Px = (int) UIUtils.dip2Px(getContext(), 8.0f);
                                int dip2Px2 = (int) (((((float) screenWidth) - UIUtils.dip2Px(getContext(), 32.0f)) - ((float) dip2Px)) / 2.0f);
                                this.r = (LinearLayout) this.q.findViewById(C0906R.id.bde);
                                ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
                                layoutParams.height = dip2Px2;
                                this.r.setLayoutParams(layoutParams);
                                LayoutInflater from = LayoutInflater.from(getContext());
                                for (int i3 = 0; i3 < 2; i3++) {
                                    Room room2 = list.get(i3);
                                    if (Room.isValid(room2)) {
                                        View inflate = from.inflate(C0906R.layout.am9, null);
                                        if (i3 == 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        a(room2, inflate, z);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dip2Px2, dip2Px2);
                                        if (i3 == 0) {
                                            layoutParams2.rightMargin = dip2Px;
                                        }
                                        inflate.setLayoutParams(layoutParams2);
                                        inflate.setOnClickListener(this.v);
                                        this.r.addView(inflate);
                                    }
                                }
                                this.f10034c = list;
                                if (this.f10034c.size() > 2) {
                                    this.f10034c.remove(0);
                                    this.f10034c.remove(0);
                                } else {
                                    com.bytedance.android.livesdk.chatroom.api.a.a(this.k, this.B.getId());
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    com.bytedance.android.live.core.c.a.a("LiveEnd", th);
                }
            }
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f10032a, false, 4196, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f10032a, false, 4196, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.j != null && th != null) {
            UIUtils.setViewVisibility(this.p, 0);
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.j, ((com.bytedance.android.live.a.a.b.a) th).getPrompt());
            } else {
                com.bytedance.android.live.uikit.d.a.a((Context) this.j, (int) C0906R.string.d35);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        User user;
        long j2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f10032a, false, 4184, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f10032a, false, 4184, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4186, new Class[0], Void.TYPE);
        } else {
            this.l = (VHeadView) a(C0906R.id.d43);
            this.m = (TextView) a(C0906R.id.d44);
            this.n = (HSImageView) a(C0906R.id.be4);
            this.o = (TopFansLayout) a(C0906R.id.d60);
            this.p = a(C0906R.id.agq);
            this.q = a(C0906R.id.cbe);
            this.s = a(C0906R.id.title);
            this.f10033b = a(C0906R.id.j6);
            this.f10033b.setOnClickListener(this.w);
            this.l.setOnClickListener(this.w);
            this.p.setOnClickListener(this.w);
        }
        if (this.B != null) {
            user = this.B.getOwner();
        } else {
            user = null;
        }
        if (user != null) {
            com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.l, user.getAvatarThumb(), 2130841141);
            this.m.setText(user.getNickName());
        }
        if (this.B != null) {
            com.bytedance.android.livesdk.chatroom.api.a.a(this.k, this.B.getId());
            a(this.B.getStats());
        }
        if (user != null && user.isFollowing()) {
            UIUtils.setViewVisibility(this.p, 8);
        }
        if (user != null && user.getId() == TTLiveSDKContext.getHostService().k().b()) {
            TTLiveSDKContext.getHostService().k().a(true);
        }
        float screenWidth = ((float) UIUtils.getScreenWidth(getContext())) / ((float) UIUtils.getScreenHeight(getContext()));
        if (user != null) {
            com.bytedance.android.livesdk.chatroom.f.b.a(this.n, user.getAvatarLarge(), (Postprocessor) new u(8, screenWidth, null));
        }
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4185, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.j()) {
            UIUtils.setViewVisibility(this.o, 8);
            if (!(getContext() == null || this.s == null)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
                marginLayoutParams.topMargin = (int) UIUtils.dip2Px(getContext(), 100.0f);
                this.s.setLayoutParams(marginLayoutParams);
            }
        }
        com.bytedance.android.livesdk.j.f a2 = com.bytedance.android.livesdk.j.f.a((Context) this.j);
        if (this.B != null) {
            j2 = this.B.getId();
        } else {
            j2 = 0;
        }
        a2.a("audience_live_over", "enter", j2, 0);
        if (PatchProxy.isSupport(new Object[0], this, f10032a, false, 4201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10032a, false, 4201, new Class[0], Void.TYPE);
        } else {
            com.bytedance.android.livesdk.j.b.g a3 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
            com.bytedance.android.livesdk.j.a.a().a("livesdk_finish_show", d.a.a().a(a3, "enter_from_merge", "enter_method", "enter_from", "source", "action_type", "video_id").a(com.bytedance.android.livesdk.j.a.a().a(Room.class), "anchor_id", "room_id", "log_pb", "request_id").f15712b, new Object[0]);
        }
        com.bytedance.android.livesdk.app.dataholder.e.a().a((Integer) 0);
        ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f10032a, false, 4188, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return LayoutInflater.from(getContext()).inflate(C0906R.layout.ahv, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f10032a, false, 4188, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    private void a(Room room, View view, boolean z) {
        LiveRecommendBar.a aVar;
        Room room2 = room;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{room2, view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f10032a, false, 4199, new Class[]{Room.class, View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2, view2, Byte.valueOf(z)}, this, f10032a, false, 4199, new Class[]{Room.class, View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HSImageView hSImageView = (HSImageView) view2.findViewById(C0906R.id.a1a);
        TextView textView = (TextView) view2.findViewById(C0906R.id.a_8);
        LiveRecommendBar liveRecommendBar = (LiveRecommendBar) view2.findViewById(C0906R.id.a_7);
        if (!this.t.contains(liveRecommendBar)) {
            this.t.add(liveRecommendBar);
        }
        if (room.getOwner() != null && !TextUtils.isEmpty(room.getOwner().getNickName())) {
            UIUtils.setText(textView, room.getOwner().getNickName());
        }
        ImageModel imageModel = null;
        if (z) {
            aVar = this.x;
        } else {
            aVar = null;
        }
        liveRecommendBar.a(aVar);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            imageModel = room.cover();
        } else if (room.getOwner() != null) {
            imageModel = room.getOwner().getAvatarMedium();
        }
        if (imageModel != null) {
            com.bytedance.android.livesdk.chatroom.f.b.a(hSImageView, imageModel);
        }
        view2.setTag(room);
        a(room);
    }

    public final void a(Activity activity, Room room, com.bytedance.android.livesdkapi.depend.a.a aVar, String str) {
        this.j = activity;
        this.B = room;
        this.i = aVar;
        this.E = str;
        this.C = false;
    }
}
