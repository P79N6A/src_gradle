package com.bytedance.android.livesdk.chatroom.widget;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.f;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.presenter.bw;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceListAdapter;
import com.bytedance.android.livesdk.chatroom.ui.AudienceListAdapter;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.view.c;
import com.bytedance.android.livesdk.chatroom.viewmodule.am;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.android.livesdk.message.model.be;
import com.bytedance.android.livesdk.popup.d;
import com.bytedance.android.livesdk.rank.UserRankDialog2;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.d;
import com.bytedance.android.livesdk.user.e;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.utils.v;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.e.b;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LiveRoomUserInfoWidget extends LiveRecyclableWidget implements Observer<KVData>, c, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13402a = null;

    /* renamed from: b  reason: collision with root package name */
    static final String f13403b = "com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget";

    /* renamed from: c  reason: collision with root package name */
    public static final String f13404c;

    /* renamed from: d  reason: collision with root package name */
    static final int f13405d = ac.a(34.0f);
    private e A;
    private View B;
    private View C;
    private View D;
    private View E;
    private ImageView F;
    private VHeadView G;
    private HSImageView H;
    private ImageView I;
    private TextView J;
    private TextView K;
    private bw L;
    private int M;
    private String N;
    private long O;
    private long P;
    private b Q;
    private User R;
    private RecyclableWidgetManager S;

    /* renamed from: e  reason: collision with root package name */
    Room f13406e;

    /* renamed from: f  reason: collision with root package name */
    boolean f13407f;
    String g;
    View h;
    View i;
    public ProgressBar j;
    TextView k;
    public TextView l;
    RecyclerView m;
    public AbsAudienceListAdapter n;
    public FragmentActivity o;
    public WeakHandler p;
    public long q;
    boolean r = true;
    boolean s = false;
    UserRankDialog2 t;
    boolean u;
    boolean v;
    boolean w;
    BaseDialogFragment x;
    public d y;
    private final CompositeDisposable z = new CompositeDisposable();

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f13402a, false, 7978, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7978, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f13402a, false, 7979, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f13402a, false, 7979, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.ald;
    }

    public final void a(List<com.bytedance.android.livesdk.rank.model.b> list, List<com.bytedance.android.livesdk.rank.model.b> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, this, f13402a, false, 7964, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2}, this, f13402a, false, 7964, new Class[]{List.class, List.class}, Void.TYPE);
        } else if (isViewValid() && list2 != null) {
            if (!CollectionUtils.isEmpty(list)) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    list.get(i2).h = true;
                    list2.add(i2, list.get(i2));
                }
            }
            this.n.a(list2);
            this.m.post(new aa(this, list2));
        }
    }

    static {
        String str;
        if (a.a()) {
            str = "https://webcast.amemv.com/falcon/webcast_douyin/page/fansclub/index.html?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s";
        } else {
            str = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/fansclub/index.html?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s&is_first_consume=%s";
        }
        f13404c = str;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7962, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7962, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (h.a("msg_view") == null) {
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7961, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7955, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7955, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f13407f || ((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.a()).intValue() != 3 || (!a.a() && !a.d())) {
            return false;
        } else {
            return true;
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7956, new Class[0], Void.TYPE);
            return;
        }
        this.z.clear();
        if (this.t != null) {
            this.t.dismiss();
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.S = null;
        this.L.d();
        this.n.a();
        this.O = 0;
        this.P = 0;
        this.q = 0;
        this.s = false;
        this.t = null;
        this.R = null;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7958, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!TTLiveSDKContext.getHostService().k().c()) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "live_detail");
                bundle.putString("action_type", "follow");
                bundle.putString("source", "live");
                bundle.putString("v1_source", "follow");
                this.s = true;
                TTLiveSDKContext.getHostService().k().a(this.context, i.a().a(f.a()).b(f.b()).d("live_detail").e("follow").c("live").a(1).a()).subscribe((io.reactivex.Observer<? super T>) new g<Object>());
                return;
            }
            if (this.o != null) {
                TTLiveSDKContext.getHostService().c().a(this.o, "live", this.context.getResources().getString(C0906R.string.dhv));
            }
            User owner = this.f13406e.getOwner();
            if (j.b(this.dataCenter)) {
                ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", j.c(this.dataCenter));
            }
            TTLiveSDKContext.getHostService().k().a(((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((b.a) com.bytedance.android.livesdk.user.f.b().a(owner.getId())).a(this.f13406e.getRequestId())).b(this.g)).c("live")).b(this.f13406e.getId())).d(this.f13406e.getLabels())).a(this.o)).e("live_detail")).f("follow")).c()).observeOn(AndroidSchedulers.mainThread()).compose(getAutoUnbindTransformer()).subscribe((io.reactivex.Observer<? super T>) new io.reactivex.Observer<com.bytedance.android.livesdkapi.depend.model.b.a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13412a;

                public final void onComplete() {
                }

                public final void onSubscribe(Disposable disposable) {
                }

                public final /* synthetic */ void onNext(Object obj) {
                    com.bytedance.android.livesdkapi.depend.model.b.a aVar = (com.bytedance.android.livesdkapi.depend.model.b.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f13412a, false, 8002, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f13412a, false, 8002, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
                        return;
                    }
                    LiveRoomUserInfoWidget.this.a(aVar);
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f13412a, false, 8003, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f13412a, false, 8003, new Class[]{Throwable.class}, Void.TYPE);
                    } else if (LiveRoomUserInfoWidget.this.isViewValid()) {
                        LiveRoomUserInfoWidget.this.c(0);
                        LiveRoomUserInfoWidget.this.j.setVisibility(8);
                        l.a(LiveRoomUserInfoWidget.this.context, th);
                    }
                }
            });
            c(8);
            this.j.setVisibility(0);
            if (a.d()) {
                com.bytedance.android.livesdk.r.a.a(this.context, this.f13406e, "follow_button");
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                com.bytedance.android.livesdk.j.a.a().a("follow", hashMap, new com.bytedance.android.livesdk.j.c.c("live", owner.getId()), new com.bytedance.android.livesdk.j.c.j().b("live_interact").a("live_detail"), Room.class);
            } catch (Exception unused) {
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f13402a, false, 7970, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f13402a, false, 7970, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 0 && this.m != null) {
            this.m.scrollToPosition(0);
        }
    }

    private void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f13402a, false, 7973, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f13402a, false, 7973, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.O <= j2 && !c() && !a.j()) {
            this.O = j2;
            this.K.setText(this.context.getString(C0906R.string.dko, new Object[]{com.bytedance.android.live.core.utils.e.a(j2)}));
            this.f13406e.getOwner().setFanTicketCount(this.O);
        }
    }

    private void b(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f13402a, false, 7974, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f13402a, false, 7974, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.P <= j2 && c()) {
            this.P = j2;
            this.K.setText(this.context.getString(C0906R.string.cup, new Object[]{com.bytedance.android.live.core.utils.e.a(j2)}));
        }
    }

    private void e(int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7976, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7976, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (a.f()) {
            TextView textView = this.J;
            if (this.o == null) {
                str = "";
            } else {
                str = this.o.getString(C0906R.string.dm1);
            }
            textView.setText(str);
            if (this.dataCenter != null && ((Integer) this.dataCenter.get("data_xt_broadcast_type", -1)).intValue() == 3) {
                Room room = (Room) this.dataCenter.get("data_room");
                if (!(room == null || room.mRoomAuthStatus == null || room.mRoomAuthStatus.enableGift)) {
                    UIUtils.setViewVisibility(this.J, 8);
                    UIUtils.setViewVisibility(this.m, 8);
                }
            }
        } else if (a.j()) {
            this.J.setText(v.a((long) i2));
        } else {
            this.J.setText(com.bytedance.android.live.core.utils.e.c((long) i2));
        }
        if (a.j()) {
            this.K.setText(this.context.getString(C0906R.string.dfn, new Object[]{v.a((long) i2)}));
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7965, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7965, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(i2));
            e(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7953, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7953, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.D.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = i2;
            this.D.setLayoutParams(layoutParams);
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7977, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13402a, false, 7977, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (a.j()) {
            UIUtils.setViewVisibility(this.F, i2);
        } else {
            UIUtils.setViewVisibility(this.E, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i2) {
        if (isViewValid()) {
            com.bytedance.android.livesdk.popup.d dVar = this.y;
            View view = this.i;
            int i3 = (-i2) * 2;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i3), Integer.valueOf(i2)}, dVar, com.bytedance.android.livesdk.popup.a.f16841a, false, 12803, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                com.bytedance.android.livesdk.popup.d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i3), Integer.valueOf(i2)}, dVar2, com.bytedance.android.livesdk.popup.a.f16841a, false, 12803, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                dVar.c(false);
                dVar.d();
                dVar.j = view;
                dVar.m = i3;
                dVar.n = i2;
                if (dVar.o) {
                    dVar.c();
                }
                dVar.f16842b.showAsDropDown(view, dVar.m, dVar.n);
            }
            this.p.postDelayed(new ad(this), 5000);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f13402a, false, 7966, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f13402a, false, 7966, new Class[]{String.class}, Void.TYPE);
            return;
        }
        be a2 = com.bytedance.android.livesdk.chatroom.bl.c.a(this.f13406e.getId(), null, "", 5, str, "#FF8533", "7", "");
        a2.f16553b.k = 2130841228;
        ((IMessageManager) this.dataCenter.get("data_message_manager")).insertMessage(a2, true);
    }

    public void onInit(Object... objArr) {
        String str;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13402a, false, 7951, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13402a, false, 7951, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.u = !com.bytedance.android.livesdkapi.a.a.f18614b;
        if ((a.a() && ((Integer) LiveSettingKeys.LIVE_FANS_CLUB_ENTRY_PLAN.a()).intValue() == 1) || a.b() || a.f()) {
            this.u = false;
        }
        this.v = ((Boolean) LiveSettingKeys.LIVE_SHOW_FANS_CLUB_RENEWAL.a()).booleanValue();
        this.B = this.contentView.findViewById(C0906R.id.dpt);
        this.C = this.contentView.findViewById(C0906R.id.ez);
        this.D = this.contentView.findViewById(C0906R.id.bpq);
        this.h = this.contentView.findViewById(C0906R.id.agy);
        this.E = this.contentView.findViewById(C0906R.id.agq);
        this.j = (ProgressBar) this.contentView.findViewById(C0906R.id.ah2);
        this.i = this.contentView.findViewById(C0906R.id.abu);
        this.G = (VHeadView) this.contentView.findViewById(C0906R.id.amr);
        this.H = (HSImageView) this.contentView.findViewById(C0906R.id.azn);
        this.I = (ImageView) this.containerView.findViewById(C0906R.id.dqh);
        this.k = (TextView) this.contentView.findViewById(C0906R.id.dq2);
        this.J = (TextView) this.contentView.findViewById(C0906R.id.bus);
        this.m = (RecyclerView) this.contentView.findViewById(C0906R.id.dwr);
        this.K = (TextView) this.contentView.findViewById(C0906R.id.d2t);
        this.l = (TextView) this.containerView.findViewById(C0906R.id.ace);
        if (UIUtils.getScreenWidth(this.context) < 500) {
            this.k.setMaxWidth(100);
        }
        this.i.setOnClickListener(new ah(this));
        this.L = new bw();
        this.n = new AudienceListAdapter(this.context);
        this.n.setHasStableIds(true);
        this.m.setLayoutManager(new SSLinearLayoutManager(this.context, 0, false));
        this.m.setItemAnimator(null);
        this.m.setAdapter(this.n);
        this.m.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13408a;

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            }

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13408a, false, 8000, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13408a, false, 8000, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    LiveRoomUserInfoWidget.this.p.sendMessageDelayed(LiveRoomUserInfoWidget.this.p.obtainMessage(0), 5000);
                    return;
                }
                LiveRoomUserInfoWidget.this.p.removeMessages(0);
            }
        });
        this.M = this.context.getResources().getDimensionPixelOffset(C0906R.dimen.oy);
        this.E.setOnClickListener(new ai(this));
        try {
            this.E.setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130840804));
        } catch (Exception unused) {
        }
        this.C.setOnClickListener(new aj(this));
        this.J.setOnClickListener(new ak(this));
        if (com.ss.android.ugc.aweme.q.c.a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.N = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.b.a> r1 = com.bytedance.android.livesdkapi.depend.model.b.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7975(0x1f27, float:1.1175E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            r3 = 0
            r4 = 7975(0x1f27, float:1.1175E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.b.a> r1 = com.bytedance.android.livesdkapi.depend.model.b.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            boolean r0 = r17.isViewValid()
            if (r0 != 0) goto L_0x003b
            return
        L_0x003b:
            boolean r0 = com.bytedance.android.live.uikit.a.a.f()
            if (r0 == 0) goto L_0x0065
            if (r18 == 0) goto L_0x0065
            int r0 = r18.a()
            if (r0 != r8) goto L_0x0065
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.dataCenter
            java.lang.String r1 = "data_is_followed"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.get((java.lang.String) r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0065
            android.content.Context r0 = r17.getContext()
            r1 = 2131563435(0x7f0d13ab, float:1.8752327E38)
            com.bytedance.android.livesdk.utils.ai.a((android.content.Context) r0, (int) r1)
        L_0x0065:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.dataCenter
            java.lang.String r1 = "data_room"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            int r1 = r18.a()
            r0.setFollowStatus(r1)
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.dataCenter
            java.lang.String r1 = "data_is_followed"
            int r2 = r18.a()
            if (r2 == 0) goto L_0x0086
            r2 = 1
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.lambda$put$1$DataCenter(r1, r2)
            int r0 = r18.a()
            r1 = 1086324736(0x40c00000, float:6.0)
            r2 = 8
            if (r0 != 0) goto L_0x00b3
            android.view.View r0 = r7.i
            r0.setVisibility(r2)
            android.view.View r0 = r7.h
            r0.setVisibility(r9)
            boolean r0 = r7.u
            if (r0 == 0) goto L_0x00b2
            android.content.Context r0 = r17.getContext()
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.b((int) r0)
        L_0x00b2:
            return
        L_0x00b3:
            r7.c(r9)
            android.widget.ProgressBar r0 = r7.j
            r0.setVisibility(r2)
            android.view.View r0 = r7.h
            r0.setVisibility(r2)
            boolean r0 = r7.u
            if (r0 == 0) goto L_0x020e
            android.content.Context r0 = r17.getContext()
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.b((int) r0)
            android.view.View r0 = r7.i
            r0.setVisibility(r9)
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.dataCenter
            java.lang.String r1 = "data_user_in_room"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto L_0x0128
            com.bytedance.android.live.base.model.FansClubMember r1 = r0.getFansClub()
            if (r1 == 0) goto L_0x0128
            com.bytedance.android.live.base.model.FansClubMember r1 = r0.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r1 = r1.getData()
            boolean r1 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r1)
            if (r1 == 0) goto L_0x00fe
            com.bytedance.android.live.base.model.FansClubMember r0 = r0.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r0 = r0.getData()
            goto L_0x011c
        L_0x00fe:
            com.bytedance.android.live.base.model.FansClubMember r1 = r0.getFansClub()
            java.util.Map r1 = r1.getPreferData()
            if (r1 == 0) goto L_0x011b
            com.bytedance.android.live.base.model.FansClubMember r0 = r0.getFansClub()
            java.util.Map r0 = r0.getPreferData()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.live.base.model.user.FansClubData r0 = (com.bytedance.android.live.base.model.user.FansClubData) r0
            goto L_0x011c
        L_0x011b:
            r0 = 0
        L_0x011c:
            boolean r1 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r0)
            if (r1 == 0) goto L_0x0128
            int r0 = r0.level
            if (r0 <= 0) goto L_0x0128
            r0 = 0
            goto L_0x0129
        L_0x0128:
            r0 = 1
        L_0x0129:
            if (r0 == 0) goto L_0x020d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            r3 = 0
            r4 = 7968(0x1f20, float:1.1166E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0150
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            r3 = 0
            r4 = 7968(0x1f20, float:1.1166E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x021c
        L_0x0150:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f13406e
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            long r0 = r0.getId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.bytedance.ies.e.b r1 = r7.Q
            int r1 = r1.a((java.lang.String) r0, (int) r9)
            if (r1 == r8) goto L_0x021c
            android.view.View r1 = r7.i
            if (r1 != 0) goto L_0x016c
            goto L_0x021c
        L_0x016c:
            com.bytedance.ies.e.b r1 = r7.Q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1.a((java.lang.String) r0, (java.lang.Object) r2)
            r1.a()
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = com.bytedance.android.live.core.utils.ac.a((float) r0)
            com.bytedance.android.livesdk.popup.d r1 = r7.y
            if (r1 == 0) goto L_0x0191
            com.bytedance.android.livesdk.popup.d r1 = r7.y
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0191
            com.bytedance.android.livesdk.popup.d r1 = r7.y
            r1.dismiss()
            goto L_0x0203
        L_0x0191:
            android.content.Context r1 = r7.context
            com.bytedance.android.livesdk.popup.d r1 = com.bytedance.android.livesdk.popup.d.a((android.content.Context) r1)
            r2 = 2131691344(0x7f0f0750, float:1.9011757E38)
            com.bytedance.android.livesdk.popup.a r1 = r1.a((int) r2)
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            r2 = 1108869120(0x42180000, float:38.0)
            int r2 = com.bytedance.android.live.core.utils.ac.a((float) r2)
            com.bytedance.android.livesdk.popup.a r1 = r1.b((int) r2)
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r9)
            r10[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.popup.a.f16841a
            r13 = 0
            r14 = 12789(0x31f5, float:1.7921E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r9] = r3
            java.lang.Class<com.bytedance.android.livesdk.popup.a> r16 = com.bytedance.android.livesdk.popup.a.class
            r11 = r1
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x01e7
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r9)
            r10[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.popup.a.f16841a
            r13 = 0
            r14 = 12789(0x31f5, float:1.7921E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r9] = r3
            java.lang.Class<com.bytedance.android.livesdk.popup.a> r16 = com.bytedance.android.livesdk.popup.a.class
            r11 = r1
            r15 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.popup.a r1 = (com.bytedance.android.livesdk.popup.a) r1
            goto L_0x01ed
        L_0x01e7:
            r1.f16846f = r9
            com.bytedance.android.livesdk.popup.a r1 = r1.a()
        L_0x01ed:
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            com.bytedance.android.livesdk.popup.a r1 = r1.a((boolean) r9)
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            com.bytedance.android.livesdk.popup.d$a r2 = com.bytedance.android.livesdk.chatroom.widget.ab.f13428b
            com.bytedance.android.livesdk.popup.d r1 = r1.a((com.bytedance.android.livesdk.popup.d.a) r2)
            com.bytedance.android.livesdk.popup.a r1 = r1.b()
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            r7.y = r1
        L_0x0203:
            android.view.View r1 = r7.i
            com.bytedance.android.livesdk.chatroom.widget.ac r2 = new com.bytedance.android.livesdk.chatroom.widget.ac
            r2.<init>(r7, r0)
            r1.post(r2)
        L_0x020d:
            return
        L_0x020e:
            android.content.Context r0 = r17.getContext()
            r1 = 1094713344(0x41400000, float:12.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.b((int) r0)
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.a(com.bytedance.android.livesdkapi.depend.model.b.a):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.bytedance.ies.sdk.widgets.KVData r7 = (com.bytedance.ies.sdk.widgets.KVData) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7950(0x1f0e, float:1.114E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            r3 = 0
            r4 = 7950(0x1f0e, float:1.114E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            boolean r0 = r10.isViewValid()
            if (r0 == 0) goto L_0x0234
            if (r7 == 0) goto L_0x0234
            java.lang.String r0 = r7.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0047
            goto L_0x0234
        L_0x0047:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 8
            switch(r2) {
                case -1741164106: goto L_0x00b3;
                case -774172322: goto L_0x00a9;
                case -407049065: goto L_0x009f;
                case 506917167: goto L_0x0095;
                case 519380817: goto L_0x008b;
                case 1060055221: goto L_0x0081;
                case 1102839345: goto L_0x0076;
                case 1247726949: goto L_0x006c;
                case 1433895618: goto L_0x0062;
                case 2143307222: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00bd
        L_0x0057:
            java.lang.String r2 = "cmd_wanna_follow_anchor"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 9
            goto L_0x00be
        L_0x0062:
            java.lang.String r2 = "cmd_send_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 4
            goto L_0x00be
        L_0x006c:
            java.lang.String r2 = "data_current_room_ticket_count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x0076:
            java.lang.String r2 = "data_xt_followed_change"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 8
            goto L_0x00be
        L_0x0081:
            java.lang.String r2 = "data_keyboard_status"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 6
            goto L_0x00be
        L_0x008b:
            java.lang.String r2 = "data_anchor_ticket_count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 0
            goto L_0x00be
        L_0x0095:
            java.lang.String r2 = "data_login_event"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 2
            goto L_0x00be
        L_0x009f:
            java.lang.String r2 = "data_member_message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 3
            goto L_0x00be
        L_0x00a9:
            java.lang.String r2 = "cmd_dismiss_dialog_end"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 5
            goto L_0x00be
        L_0x00b3:
            java.lang.String r2 = "data_user_in_room"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bd
            r0 = 7
            goto L_0x00be
        L_0x00bd:
            r0 = -1
        L_0x00be:
            switch(r0) {
                case 0: goto L_0x0225;
                case 1: goto L_0x0217;
                case 2: goto L_0x01dc;
                case 3: goto L_0x0185;
                case 4: goto L_0x0175;
                case 5: goto L_0x0175;
                case 6: goto L_0x0161;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00e5;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x0233
        L_0x00c3:
            java.lang.Object r0 = r7.getData()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r10.q = r0
            android.widget.TextView r2 = r10.l
            android.content.Context r3 = r10.context
            r4 = 2131563390(0x7f0d137e, float:1.8752236E38)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r0 = com.bytedance.android.live.core.utils.e.c(r0)
            r5[r9] = r0
            java.lang.String r0 = r3.getString(r4, r5)
            r2.setText(r0)
        L_0x00e5:
            android.view.View r0 = r10.E
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00f9
            android.widget.ImageView r0 = r10.F
            if (r0 == 0) goto L_0x0233
            android.widget.ImageView r0 = r10.F
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0233
        L_0x00f9:
            r10.b()
            goto L_0x0233
        L_0x00fe:
            java.lang.Object r0 = r7.getData()
            boolean r1 = r0 instanceof com.bytedance.android.live.base.model.user.User
            if (r1 == 0) goto L_0x010a
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            r10.R = r0
        L_0x010a:
            if (r1 == 0) goto L_0x0233
            boolean r0 = r10.f13407f
            if (r0 != 0) goto L_0x0233
            com.bytedance.android.live.base.model.user.User r0 = r10.R
            com.bytedance.android.live.base.model.FansClubMember r0 = r0.getFansClub()
            if (r0 == 0) goto L_0x013b
            com.bytedance.android.live.base.model.user.User r0 = r10.R
            com.bytedance.android.live.base.model.FansClubMember r0 = r0.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r0 = r0.getData()
            if (r0 == 0) goto L_0x013b
            com.bytedance.android.live.base.model.user.User r0 = r10.R
            com.bytedance.android.live.base.model.FansClubMember r0 = r0.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r0 = r0.getData()
            long r0 = r0.anchorId
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r10.f13406e
            long r2 = r2.getOwnerUserId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r8 = 0
        L_0x013c:
            r10.w = r8
            boolean r0 = r10.w
            if (r0 == 0) goto L_0x0233
            boolean r0 = r10.v
            if (r0 == 0) goto L_0x0233
            com.bytedance.android.livesdk.w.c<java.lang.Boolean> r0 = com.bytedance.android.livesdk.w.b.ab
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0233
            android.view.View r0 = r10.contentView
            com.bytedance.android.livesdk.chatroom.widget.ae r1 = new com.bytedance.android.livesdk.chatroom.widget.ae
            r1.<init>(r10)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
        L_0x0161:
            java.lang.Object r0 = r7.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            android.view.View r1 = r10.B
            if (r0 == 0) goto L_0x0170
            goto L_0x0171
        L_0x0170:
            r3 = 0
        L_0x0171:
            r1.setVisibility(r3)
            return
        L_0x0175:
            boolean r0 = r10.isViewValid()
            if (r0 == 0) goto L_0x0233
            com.bytedance.android.livesdk.rank.UserRankDialog2 r0 = r10.t
            if (r0 == 0) goto L_0x0233
            com.bytedance.android.livesdk.rank.UserRankDialog2 r0 = r10.t
            r0.dismiss()
            return
        L_0x0185:
            java.lang.Object r0 = r7.getData()
            com.bytedance.android.livesdk.message.model.as r0 = (com.bytedance.android.livesdk.message.model.as) r0
            if (r0 == 0) goto L_0x0233
            int r7 = r0.f16485b
            if (r7 <= 0) goto L_0x01db
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            r3 = 0
            r4 = 7963(0x1f1b, float:1.1159E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01c7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f13402a
            r3 = 0
            r4 = 7963(0x1f1b, float:1.1159E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0233
        L_0x01c7:
            boolean r0 = r10.isViewValid()
            if (r0 == 0) goto L_0x01db
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r10.dataCenter
            java.lang.String r1 = "data_member_count"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r0.lambda$put$1$DataCenter(r1, r2)
            r10.e(r7)
        L_0x01db:
            return
        L_0x01dc:
            java.lang.Object r0 = r7.getData()
            com.bytedance.android.livesdk.chatroom.event.v r0 = (com.bytedance.android.livesdk.chatroom.event.v) r0
            boolean r0 = r0.f10201a
            if (r0 == 0) goto L_0x0233
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r10.f13406e
            com.bytedance.android.live.base.model.user.User r1 = r1.getOwner()
            long r1 = r1.getId()
            io.reactivex.Single r0 = r0.b(r1)
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Single r0 = r0.observeOn(r1)
            com.bytedance.android.live.core.rxutils.a r1 = r10.getAutoUnbindTransformer()
            io.reactivex.Single r0 = r0.compose(r1)
            com.bytedance.android.livesdk.chatroom.widget.s r1 = new com.bytedance.android.livesdk.chatroom.widget.s
            r1.<init>(r10)
            io.reactivex.functions.Consumer r2 = com.bytedance.android.livesdk.chatroom.widget.t.f13554b
            r0.subscribe(r1, r2)
            return
        L_0x0217:
            java.lang.Object r0 = r7.getData()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r10.b((long) r0)
            return
        L_0x0225:
            java.lang.Object r0 = r7.getData()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r10.a((long) r0)
            return
        L_0x0233:
            return
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.onChanged(java.lang.Object):void");
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13402a, false, 7952, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13402a, false, 7952, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.L.a((c) this);
        this.f13406e = (Room) this.dataCenter.get("data_room");
        this.f13407f = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.r = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.g = (String) this.dataCenter.get("log_enter_live_source");
        this.A = (e) this.dataCenter.get("data_user_center");
        this.n.a(this.f13407f);
        this.o = (FragmentActivity) this.context;
        this.i.setVisibility(8);
        this.h.setVisibility(0);
        if (!a.j()) {
            this.E.setVisibility(0);
        }
        this.j.setVisibility(8);
        if (!this.f13407f) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", this.f13406e.getOwnerUserId());
                hashMap.put("room_id", this.f13406e.getIdStr());
                hashMap.put("rank_type", new String[]{"money", "fans", "nothing", "room_money"}[((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.a()).intValue()]);
                TTLiveSDKContext.getHostService().d().a("livesdk_live_room_info", hashMap);
            } catch (Exception e2) {
                Logger.throwException(e2);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7954, new Class[0], Void.TYPE);
        } else {
            if (a.f()) {
                UIUtils.setViewVisibility(this.l, 0);
                UIUtils.setViewVisibility(this.K, 8);
            }
            if (a.j()) {
                this.F = new ImageView(getContext());
                this.F.setImageResource(2130841163);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 28.0f), (int) UIUtils.dip2Px(getContext(), 28.0f));
                layoutParams.gravity = 17;
                ((FrameLayout) this.h).addView(this.F, layoutParams);
                UIUtils.setViewVisibility(this.E, 8);
                this.F.setOnClickListener(new z(this));
            }
            if (!this.f13407f && (a.a() || a.d())) {
                if (((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.a()).intValue() == 1) {
                    UIUtils.setViewVisibility(this.l, 0);
                    UIUtils.setViewVisibility(this.K, 8);
                } else if (((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.a()).intValue() == 2) {
                    UIUtils.setViewVisibility(this.l, 8);
                    UIUtils.setViewVisibility(this.K, 8);
                }
            }
        }
        if (this.f13407f) {
            b((int) UIUtils.dip2Px(getContext(), 6.0f));
            this.h.setVisibility(8);
            if (this.u) {
                this.i.setVisibility(0);
                if (!((Boolean) com.bytedance.android.livesdk.w.b.Z.a()).booleanValue()) {
                    Observable.timer(1, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).compose(getAutoUnbindTransformer()).subscribe(new al(this), am.f13451b);
                }
                if (this.v && !((Boolean) com.bytedance.android.livesdk.w.b.aa.a()).booleanValue()) {
                    Observable.timer(1, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).compose(getAutoUnbindTransformer()).subscribe(new an(this), u.f13556b);
                }
            } else {
                b((int) UIUtils.dip2Px(getContext(), 12.0f));
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7972, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.K != null) {
            if (!c() || this.f13406e.getStats() == null) {
                a(this.f13406e.getOwner().getFanTicketCount());
            } else {
                b(this.f13406e.getStats().getTicket());
            }
        }
        if (this.l != null) {
            this.q = this.f13406e.getOwner().getFollowInfo().f7763c;
            this.l.setText(this.context.getString(C0906R.string.cwf, new Object[]{com.bytedance.android.live.core.utils.e.c(this.q)}));
        }
        if (!this.f13407f) {
            this.z.add(this.A.d(this.f13406e.getOwner().getId()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new v(this), w.f13559a));
        }
        if (!c()) {
            this.z.add(this.A.c(this.f13406e.getOwnerUserId()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new x(this), y.f13562a));
        }
        if (PatchProxy.isSupport(new Object[0], this, f13402a, false, 7960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13402a, false, 7960, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            User owner = this.f13406e.getOwner();
            if (owner != null) {
                this.G.setVAble(false);
                com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.G, owner.getAvatarThumb(), 2130841141);
                UIUtils.setViewVisibility(this.I, 8);
                if (owner.getBorder() != null) {
                    k.a(this.H, owner.getBorder().f7750b);
                } else {
                    this.H.setImageDrawable(null);
                }
                if (a.h()) {
                    this.k.setText(owner.displayId);
                } else {
                    this.k.setText(owner.getNickName());
                }
                if (owner.isFollowing()) {
                    this.h.setVisibility(8);
                    if (this.u) {
                        this.i.setVisibility(0);
                    } else {
                        b((int) UIUtils.dip2Px(getContext(), 12.0f));
                    }
                }
                if (TTLiveSDKContext.getHostService().k().b() == owner.getId()) {
                    this.h.setVisibility(8);
                }
            }
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(this.f13406e.getUserCount()));
            e(this.f13406e.getUserCount());
            if (a.j()) {
                if (this.f13406e == null || this.f13406e.getRoomAuthStatus() == null || !this.f13406e.getRoomAuthStatus().isEnableRoomContributor()) {
                    UIUtils.setViewVisibility(this.J, 8);
                    UIUtils.setViewVisibility(this.m, 8);
                } else {
                    UIUtils.setViewVisibility(this.J, 0);
                    UIUtils.setViewVisibility(this.m, 0);
                }
            }
        }
        this.p = new WeakHandler(this.context.getMainLooper(), this);
        this.Q = com.bytedance.ies.e.b.a(this.context, "live_fans_club_tips");
        this.dataCenter.observeForever("data_anchor_ticket_count", this).observeForever("data_current_room_ticket_count", this).observeForever("data_login_event", this).observe("data_member_message", this).observe("cmd_send_gift", this).observeForever("data_keyboard_status", this).observe("data_user_in_room", this).observe("cmd_dismiss_dialog_end", this).observe("data_xt_followed_change", this).observe("cmd_wanna_follow_anchor", this);
        if (!(this.f13406e == null || this.f13406e.getOwner() == null)) {
            this.L.a(this.f13406e.getId(), this.f13406e.getOwner().getId(), 18);
        }
        if ((a.d() || a.a()) && !this.f13407f) {
            this.z.add(this.A.d(this.f13406e.getOwner().getId()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<com.bytedance.android.livesdkapi.depend.model.b.a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13410a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    com.bytedance.android.livesdkapi.depend.model.b.a aVar = (com.bytedance.android.livesdkapi.depend.model.b.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f13410a, false, 8001, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f13410a, false, 8001, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
                        return;
                    }
                    if (LiveRoomUserInfoWidget.this.l != null) {
                        if (aVar != null && (aVar.a() == 1 || aVar.a() == 2)) {
                            LiveRoomUserInfoWidget.this.q++;
                        } else if (aVar != null && aVar.a() == 0) {
                            LiveRoomUserInfoWidget.this.q--;
                        }
                        LiveRoomUserInfoWidget.this.l.setText(LiveRoomUserInfoWidget.this.context.getString(C0906R.string.cwf, new Object[]{com.bytedance.android.live.core.utils.e.c(LiveRoomUserInfoWidget.this.q)}));
                    }
                }
            }, com.bytedance.android.live.core.rxutils.i.b()));
        }
    }
}
