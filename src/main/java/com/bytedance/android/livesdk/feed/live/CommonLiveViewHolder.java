package com.bytedance.android.livesdk.feed.live;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.fresco.ImageTypeRecorder;
import com.bytedance.android.live.core.utils.i;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdk.feed.l.a;
import com.bytedance.android.livesdk.feed.l.c;
import com.bytedance.android.livesdk.feed.r;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public abstract class CommonLiveViewHolder extends BaseLiveViewHolder {
    public static ChangeQuickRedirect k;
    TextView l;
    HSImageView m;
    HSImageView n;
    View o;
    TextView p;
    View q;
    TextView r;
    ImageView s;
    View t;
    TextView u;
    View v;
    String w = ac.a((int) C0906R.string.cx1);
    r x;

    public void a(ImageModel imageModel) {
    }

    public abstract void a(FeedItem feedItem);

    public abstract int g();

    public final void f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 8733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 8733, new Class[0], Void.TYPE);
            return;
        }
        Room room = this.j;
        if (room != null) {
            TextView textView = this.u;
            if (room.getStatus() == 4) {
                str = ac.a((int) C0906R.string.cwq);
            } else {
                str = ac.a((int) C0906R.string.cx5);
            }
            textView.setText(str);
            if (room.getStatus() == 4) {
                this.p.setVisibility(4);
            } else {
                this.p.setVisibility(0);
                if (c.c() || c.d()) {
                    TextView textView2 = this.p;
                    textView2.setText(" " + a.a((long) room.getUserCount()) + " ");
                } else {
                    this.p.setText(a.a((long) room.getUserCount()));
                }
            }
            this.v.setVisibility(8);
        }
    }

    public final void a(View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, k, false, 8732, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, k, false, 8732, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void a(@NonNull ImageModel imageModel, Room room) {
        final String str;
        ImageModel imageModel2 = imageModel;
        final Room room2 = room;
        if (PatchProxy.isSupport(new Object[]{imageModel2, room2}, this, k, false, 8734, new Class[]{ImageModel.class, Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel2, room2}, this, k, false, 8734, new Class[]{ImageModel.class, Room.class}, Void.TYPE);
            return;
        }
        final long[] jArr = new long[1];
        if (FeedLiveFragment.C != null) {
            str = FeedLiveFragment.C.h;
        } else {
            str = "live_live";
        }
        this.x = new r();
        k.a(this.m, imageModel2, (q.a) new q.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14233a;

            public final void a(ImageModel imageModel) {
                if (PatchProxy.isSupport(new Object[]{imageModel}, this, f14233a, false, 8737, new Class[]{ImageModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel}, this, f14233a, false, 8737, new Class[]{ImageModel.class}, Void.TYPE);
                    return;
                }
                jArr[0] = SystemClock.currentThreadTimeMillis();
                HashMap hashMap = new HashMap();
                if (c.c() || c.d()) {
                    hashMap.put("enter_from_merge", "live_" + str);
                } else {
                    hashMap.put("enter_from_merge", "live_merge");
                }
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("request_id", room2.getRequestId());
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                b.a().a("live_cover_show_start", hashMap);
                r rVar = CommonLiveViewHolder.this.x;
                if (PatchProxy.isSupport(new Object[0], rVar, r.f14325b, false, 8436, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], rVar, r.f14325b, false, 8436, new Class[0], Void.TYPE);
                    return;
                }
                rVar.f14326c = SystemClock.uptimeMillis();
            }

            public final void a(ImageModel imageModel, Exception exc) {
                String str;
                Exception exc2 = exc;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{imageModel, exc2}, this, f14233a, false, 8739, new Class[]{ImageModel.class, Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel, exc2}, this, f14233a, false, 8739, new Class[]{ImageModel.class, Exception.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap();
                if (c.c() || c.d()) {
                    hashMap.put("enter_from_merge", "live_" + str);
                } else {
                    hashMap.put("enter_from_merge", "live_merge");
                }
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("request_id", room2.getRequestId());
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap.put("is_success", PushConstants.PUSH_TYPE_NOTIFY);
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                b.a().a("live_cover_show_finish", hashMap);
                r rVar = CommonLiveViewHolder.this.x;
                String uri = imageModel.getUri();
                if (PatchProxy.isSupport(new Object[]{exc2, uri}, rVar, r.f14325b, false, 8440, new Class[]{Throwable.class, String.class}, Void.TYPE)) {
                    r rVar2 = rVar;
                    PatchProxy.accessDispatch(new Object[]{exc2, uri}, rVar2, r.f14325b, false, 8440, new Class[]{Throwable.class, String.class}, Void.TYPE);
                    return;
                }
                rVar.b();
                if (PatchProxy.isSupport(new Object[]{-1L, exc2, uri}, null, r.f14325b, true, 8441, new Class[]{Long.TYPE, Throwable.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{-1L, exc2, uri}, null, r.f14325b, true, 8441, new Class[]{Long.TYPE, Throwable.class, String.class}, Void.TYPE);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (exc2 instanceof com.bytedance.android.live.a.a.a) {
                    i = ((com.bytedance.android.live.a.a.a) exc2).getErrorCode();
                }
                if (exc2 != null) {
                    str = exc.getMessage();
                } else {
                    str = "";
                }
                r.a(jSONObject, "error_code", (long) i);
                r.a(jSONObject, "error_msg", str);
                r.a(jSONObject, PushConstants.WEB_URL, uri);
                e.b("ttlive_feed_image_load_all", 1, jSONObject);
                e.a("ttlive_feed_image_load_error", 1, jSONObject);
            }

            public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                String str;
                if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f14233a, false, 8738, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f14233a, false, 8738, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap();
                if (c.c() || c.d()) {
                    hashMap.put("enter_from_merge", "live_" + str);
                } else {
                    hashMap.put("enter_from_merge", "live_merge");
                }
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("request_id", room2.getRequestId());
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap.put("is_success", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                b.a().a("live_cover_show_finish", hashMap);
                r rVar = CommonLiveViewHolder.this.x;
                if (imageModel == null) {
                    str = "";
                } else {
                    str = imageModel.getUri();
                }
                if (PatchProxy.isSupport(new Object[]{str}, rVar, r.f14325b, false, 8438, new Class[]{String.class}, Void.TYPE)) {
                    r rVar2 = rVar;
                    PatchProxy.accessDispatch(new Object[]{str}, rVar2, r.f14325b, false, 8438, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                long b2 = rVar.b();
                if (PatchProxy.isSupport(new Object[]{new Long(b2), str}, null, r.f14325b, true, 8439, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(b2), str}, null, r.f14325b, true, 8439, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                r.a(jSONObject, PushConstants.WEB_URL, str);
                e.a("ttlive_feed_image_load_all", 0, b2, jSONObject);
            }
        });
        if (com.bytedance.android.livesdk.feed.b.f13987b) {
            ImageTypeRecorder a2 = ImageTypeRecorder.a();
            List<String> urls = imageModel.getUrls();
            int g = g();
            if (PatchProxy.isSupport(new Object[]{urls, Integer.valueOf(g)}, a2, ImageTypeRecorder.f8254a, false, 1392, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
                ImageTypeRecorder imageTypeRecorder = a2;
                PatchProxy.accessDispatch(new Object[]{urls, Integer.valueOf(g)}, imageTypeRecorder, ImageTypeRecorder.f8254a, false, 1392, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            } else if (urls != null) {
                for (String put : urls) {
                    a2.f8256b.put(put, Integer.valueOf(g));
                }
            }
        }
    }

    public void a(@NonNull FeedItem feedItem, @NonNull Room room, int i) {
        ImageModel imageModel;
        FeedItem feedItem2 = feedItem;
        Room room2 = room;
        if (PatchProxy.isSupport(new Object[]{feedItem2, room2, Integer.valueOf(i)}, this, k, false, 8731, new Class[]{FeedItem.class, Room.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem2, room2, Integer.valueOf(i)}, this, k, false, 8731, new Class[]{FeedItem.class, Room.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this.t, 0);
        a(this.q, 8);
        this.s.setVisibility(8);
        if (room2.redEnvelopeNumber > 0) {
            this.o.setVisibility(0);
        } else {
            this.o.setVisibility(4);
        }
        User owner = room.getOwner();
        String str = null;
        if (TextUtils.isEmpty(room.getTitle())) {
            if (owner != null) {
                this.l.setText(owner.getNickName());
            } else {
                this.l.setText(null);
            }
            if (c.c()) {
                if (owner == null || TextUtils.isEmpty(owner.getNickName())) {
                    this.itemView.setContentDescription(ac.a((int) C0906R.string.cwr));
                } else {
                    this.itemView.setContentDescription(owner.getNickName());
                }
            }
        } else {
            this.l.setText(i.a("#%s", room.getTitle()));
            if (c.c()) {
                this.itemView.setContentDescription(i.a("#%s", room.getTitle()));
            }
        }
        if (!com.bytedance.android.livesdk.feed.b.f13989d) {
            imageModel = room.getCover();
        } else if (owner == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarMedium();
        }
        if (imageModel == null || Lists.isEmpty(imageModel.getUrls())) {
            this.m.setImageResource(2130841047);
            a(imageModel);
        } else {
            a(imageModel, room2);
        }
        ImageModel feedRoomLabel = room.getFeedRoomLabel();
        if (feedRoomLabel == null || Lists.isEmpty(feedRoomLabel.getUrls())) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
            k.a(this.n, feedRoomLabel, (q.a) new q.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14231a;

                public final void a(ImageModel imageModel) {
                }

                public final void a(ImageModel imageModel, Exception exc) {
                }

                public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f14231a, false, 8736, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f14231a, false, 8736, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = CommonLiveViewHolder.this.n.getLayoutParams();
                    layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                    CommonLiveViewHolder.this.n.setLayoutParams(layoutParams);
                }
            });
        }
        f();
        if (owner != null) {
            str = owner.getCity();
        }
        if (!StringUtils.isEmpty(str)) {
            this.r.setText(str);
            this.r.setVisibility(0);
            if (c.c()) {
                a(this.q, 0);
            }
        } else if (c.c()) {
            this.r.setVisibility(0);
            this.r.setText(C0906R.string.cx6);
            a(this.q, 0);
        } else {
            this.r.setVisibility(8);
            a(this.q, 8);
        }
        this.itemView.setOnClickListener(new k(this, feedItem, room2));
        room2.setLog_pb(feedItem2.logPb);
        room2.setRequestId(feedItem2.resId);
    }

    public CommonLiveViewHolder(View view, com.bytedance.android.livesdk.feed.dislike.a aVar, g gVar, com.bytedance.android.livesdk.feed.d.c cVar, com.bytedance.android.livesdk.feed.k kVar, f fVar, PublishSubject<FeedItem> publishSubject, PublishSubject<Boolean> publishSubject2, PublishSubject<Object> publishSubject3, PublishSubject<Object> publishSubject4, com.bytedance.android.livesdkapi.depend.d.g gVar2) {
        super(view, aVar, gVar, cVar, kVar, fVar, publishSubject, publishSubject2, publishSubject3, publishSubject4);
        this.l = (TextView) view.findViewById(C0906R.id.title);
        this.m = (HSImageView) view.findViewById(C0906R.id.bdj);
        this.n = (HSImageView) view.findViewById(C0906R.id.bf2);
        this.o = view.findViewById(C0906R.id.ccl);
        this.p = (TextView) view.findViewById(C0906R.id.gc);
        this.q = view.findViewById(C0906R.id.b2x);
        this.r = (TextView) view.findViewById(C0906R.id.bjo);
        this.s = (ImageView) view.findViewById(C0906R.id.bfa);
        this.t = view.findViewById(C0906R.id.bf5);
        this.u = (TextView) view.findViewById(C0906R.id.bf4);
        this.v = view.findViewById(C0906R.id.be6);
    }
}
