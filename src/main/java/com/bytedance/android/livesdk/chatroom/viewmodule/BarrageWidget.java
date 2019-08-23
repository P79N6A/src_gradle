package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdk.message.model.p;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.barrage.b.a;
import com.ss.ugc.live.barrage.b.b;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class BarrageWidget extends LiveRecyclableWidget implements Observer<KVData>, al, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12352a;
    private static final TypedArray i;
    private static final Bitmap[] j;

    /* renamed from: b  reason: collision with root package name */
    final List<Bitmap> f12353b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f12354c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12355d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f12356e;

    /* renamed from: f  reason: collision with root package name */
    public Room f12357f;
    boolean g;
    public String h = null;
    private final Random k = new Random();
    private final List<bi> l = new CopyOnWriteArrayList();
    private IMessageManager m;
    private a n;
    private com.bytedance.android.livesdk.chatroom.a.b.a o;
    private BarrageLayout p;
    private BarrageLayout q;
    private Runnable r = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12358a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f12358a, false, 6573, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12358a, false, 6573, new Class[0], Void.TYPE);
            } else if (BarrageWidget.this.isViewValid()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("live_source", BarrageWidget.this.f12356e);
                    jSONObject.put("request_id", BarrageWidget.this.f12357f.getRequestId());
                    jSONObject.put("log_pb", BarrageWidget.this.f12357f.getLog_pb());
                    jSONObject.put("source", BarrageWidget.this.f12357f.getUserFrom());
                } catch (JSONException unused) {
                }
                com.bytedance.android.livesdk.j.a.a().a("like", new j().b("live_interact").g("click"), Room.class);
                h a2 = h.a();
                long id = BarrageWidget.this.f12357f.getId();
                int i = BarrageWidget.this.f12354c;
                String labels = BarrageWidget.this.f12357f.getLabels();
                String str = BarrageWidget.this.h;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{null, new Long(id), Integer.valueOf(i), 2000, labels, str}, a2, h.f9797a, false, 3993, new Class[]{Handler.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                    h hVar = a2;
                    PatchProxy.accessDispatch(new Object[]{null, new Long(id), Integer.valueOf(i), 2000, labels, str2}, hVar, h.f9797a, false, 3993, new Class[]{Handler.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
                } else {
                    ((RoomRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(RoomRetrofitApi.class)).digg(new o().a("room_id", String.valueOf(id)).a("count", String.valueOf(i)).a("duration", "2000").a("common_label_list", String.valueOf(labels)).a("icon", str2).f17622b).compose(i.a()).subscribe(i.c(), i.b());
                }
                BarrageWidget.this.h = null;
                BarrageWidget.this.f12354c = 0;
                BarrageWidget.this.f12355d = false;
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12362a = new int[com.bytedance.android.livesdkapi.depend.f.a.values().length];

        static {
            try {
                f12362a[com.bytedance.android.livesdkapi.depend.f.a.DIGG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    interface BarrageResourceApi {
        @GET("/webcast/room/digg/icon/list/")
        Observable<d<com.bytedance.android.livesdk.chatroom.model.i>> fetchResource(@Query(a = "room_id") long j);
    }

    public int getLayoutId() {
        return C0906R.layout.ako;
    }

    static {
        TypedArray obtainTypedArray = ac.a().obtainTypedArray(C0906R.array.ab);
        i = obtainTypedArray;
        j = new Bitmap[obtainTypedArray.length()];
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12352a, false, 6565, new Class[0], String.class)) {
            return getClass().getName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12352a, false, 6565, new Class[0], String.class);
    }

    public void onClear() {
        if (PatchProxy.isSupport(new Object[0], this, f12352a, false, 6560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12352a, false, 6560, new Class[0], Void.TYPE);
            return;
        }
        super.onClear();
        for (Bitmap bitmap : j) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    public final void b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f12352a, false, 6563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12352a, false, 6563, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.q != null && this.n != null && this.n.b() < 10 && !this.l.isEmpty()) {
            bi remove = this.l.remove(0);
            boolean a2 = c.a(this.context);
            LayoutInflater from = LayoutInflater.from(this.context);
            if (a2) {
                i2 = C0906R.layout.akm;
            } else {
                i2 = C0906R.layout.akl;
            }
            this.n.a((com.ss.ugc.live.barrage.a.a) new com.bytedance.android.livesdk.chatroom.a.c.a(from.inflate(i2, null), remove).f9722c, remove.a());
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12352a, false, 6559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12352a, false, 6559, new Class[0], Void.TYPE);
            return;
        }
        this.dataCenter.removeObserver(this);
        this.m.removeMessageListener(this);
        if (this.q != null) {
            this.q.a();
        }
        if (this.q != null) {
            this.p.a();
        }
        this.f12354c = 0;
        this.f12355d = false;
        this.l.clear();
        this.g = false;
        for (Bitmap next : this.f12353b) {
            if (!next.isRecycled()) {
                next.recycle();
            }
        }
        this.f12353b.clear();
    }

    public final void a(@NonNull Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12352a, false, 6566, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12352a, false, 6566, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.live.core.c.a.a(a(), th.toString());
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12352a, false, 6556, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12352a, false, 6556, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode == -369217431 && key.equals("data_screen_message")) {
                    c2 = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    bi biVar = (bi) kVData.getData();
                    if (this.l.size() >= 200) {
                        Iterator<bi> it2 = this.l.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                bi next = it2.next();
                                if (!next.a()) {
                                    this.l.remove(next);
                                }
                            }
                        }
                    }
                    if (this.l.size() >= 200) {
                        this.l.remove(this.l.size() - 1);
                    }
                    if (biVar.a()) {
                        this.l.add(0, biVar);
                    } else {
                        this.l.add(biVar);
                    }
                    b();
                    return;
                case 1:
                    if (((Integer) kVData.getData()).intValue() == 0) {
                        UIUtils.setViewVisibility(this.contentView, 0);
                        break;
                    } else {
                        UIUtils.setViewVisibility(this.contentView, 8);
                        return;
                    }
            }
        }
    }

    public void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f12352a, false, 6562, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f12352a, false, 6562, new Class[]{IMessage.class}, Void.TYPE);
        } else if (!isViewValid() || !(iMessage2 instanceof p)) {
        } else {
            p pVar = (p) iMessage2;
            if (PatchProxy.isSupport(new Object[0], pVar, p.f16664a, false, 11035, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], pVar, p.f16664a, false, 11035, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                com.bytedance.android.live.base.model.user.i a2 = TTLiveSDKContext.getHostService().k().a();
                if (!(a2 == null || pVar.f16668e == null || a2.getId() != pVar.f16668e.getId())) {
                    z = true;
                }
            }
            if (!z) {
                if (AnonymousClass3.f12362a[pVar.getMessageType().ordinal()] == 1) {
                    a(true);
                }
            }
        }
    }

    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12352a, false, 6561, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12352a, false, 6561, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (((Boolean) com.bytedance.android.livesdk.app.dataholder.d.a().f9041c).booleanValue() || !isViewValid()) {
            return false;
        } else {
            if (this.o.b() < 24) {
                Bitmap bitmap = null;
                if (this.g && !Lists.isEmpty(this.f12353b)) {
                    bitmap = this.f12353b.get(this.k.nextInt(this.f12353b.size()));
                } else if (i.length() > 0) {
                    int nextInt = this.k.nextInt(i.length());
                    if (j[nextInt] == null || j[nextInt].isRecycled()) {
                        j[nextInt] = BitmapFactory.decodeResource(this.context.getResources(), i.getResourceId(nextInt, 0));
                    }
                    Bitmap bitmap2 = j[nextInt];
                    if (!z && this.h == null) {
                        this.h = String.valueOf(nextInt);
                    }
                    bitmap = bitmap2;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.o.a((com.ss.ugc.live.barrage.a.a) new com.bytedance.android.livesdk.chatroom.a.a.a(bitmap, this.k.nextDouble()), false);
                }
            }
            if (com.bytedance.android.live.uikit.a.a.f()) {
                User user = (User) this.dataCenter.get("data_user_in_room");
                if (!(user == null || user.getUserAttr() == null || !user.getUserAttr().f7773b)) {
                    return false;
                }
            }
            if (z || !TTLiveSDKContext.getHostService().k().c()) {
                return false;
            }
            this.f12354c++;
            if (!this.f12355d) {
                this.f12355d = true;
                this.contentView.postDelayed(this.r, 2000);
            }
            return true;
        }
    }

    public void onInit(Object... objArr) {
        String str;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12352a, false, 6557, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12352a, false, 6557, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12357f = (Room) this.dataCenter.get("data_room");
        if (com.ss.android.ugc.aweme.q.c.a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f12356e = str;
        this.q = (BarrageLayout) this.contentView.findViewById(C0906R.id.jq);
        int i2 = 2;
        if (com.bytedance.android.live.uikit.a.a.f() && this.f12357f != null && this.f12357f.getOrientation() != 0 && getContext().getResources().getConfiguration().orientation == 1) {
            i2 = 1;
        }
        if (c.a(this.context)) {
            this.n = new b(this.q, ac.d(C0906R.dimen.ox), i2, 7000);
        } else {
            this.n = new com.ss.ugc.live.barrage.b.c(this.q, ac.d(C0906R.dimen.ox), i2, 7000);
        }
        this.n.a((a.C0842a) new a.C0842a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12360a;

            public final void a(com.ss.ugc.live.barrage.a.a aVar) {
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f12360a, false, 6574, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f12360a, false, 6574, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE);
                    return;
                }
                BarrageWidget.this.b();
            }
        });
        this.q.a(this.n);
        this.p = (BarrageLayout) this.contentView.findViewById(C0906R.id.a53);
        this.o = new com.bytedance.android.livesdk.chatroom.a.b.a(this.p, 1400);
        this.p.a(this.o);
        for (int i3 = 0; i3 < 10; i3++) {
            Path path = new Path();
            path.moveTo((float) ac.a(94.0f), (float) ac.a(150.0f));
            float f2 = (float) (((i3 - 5) * 8) + 94);
            path.quadTo((float) ac.a(f2), (float) ac.a(150.0f), (float) ac.a(f2), (float) ac.a(40.0f));
            this.o.a(path);
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12352a, false, 6558, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12352a, false, 6558, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.m = (IMessageManager) this.dataCenter.get("data_message_manager");
        this.m.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DIGG.getIntType(), this);
        this.dataCenter.observe("data_screen_message", this);
        this.dataCenter.observe("data_xt_landscape_tab_change", this);
        if (PatchProxy.isSupport(new Object[0], this, f12352a, false, 6564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12352a, false, 6564, new Class[0], Void.TYPE);
        } else if (!com.bytedance.android.live.uikit.a.a.b()) {
            ((com.bytedance.android.livesdk.utils.b.b) ((BarrageResourceApi) com.bytedance.android.livesdk.v.j.q().d().a(BarrageResourceApi.class)).fetchResource(this.f12357f.getId()).subscribeOn(Schedulers.io()).as(com.bytedance.android.livesdk.utils.b.c.a())).a(2).compose(getAutoUnbindTransformer()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(this), c.f13061b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f12352a, false, 6567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12352a, false, 6567, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.dataCenter == null || !com.bytedance.android.live.uikit.a.a.f() || this.f12357f == null || this.f12357f.getOrientation() == 0)) {
            boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
            if (booleanValue) {
                this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            }
            if (this.f12357f.getOrientation() != 2 || booleanValue) {
                UIUtils.setViewVisibility(this.contentView, 0);
            } else {
                UIUtils.setViewVisibility(this.contentView, 4);
            }
        }
    }
}
