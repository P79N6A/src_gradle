package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.event.e;
import com.bytedance.android.livesdk.chatroom.event.g;
import com.bytedance.android.livesdk.chatroom.event.r;
import com.bytedance.android.livesdk.chatroom.interact.w;
import com.bytedance.android.livesdk.chatroom.presenter.bu;
import com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.ui.SpaceItemDecoration;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

public class TextMessageWidget extends LiveRecyclableWidget implements Observer<KVData>, bu.a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12800a = null;
    private static final String h = "TextMessageWidget";

    /* renamed from: b  reason: collision with root package name */
    public LiveMessageRecyclerView f12801b;

    /* renamed from: c  reason: collision with root package name */
    public SmoothLinearLayoutManager f12802c;

    /* renamed from: d  reason: collision with root package name */
    public bu f12803d;

    /* renamed from: e  reason: collision with root package name */
    public int f12804e;

    /* renamed from: f  reason: collision with root package name */
    public int f12805f;
    public boolean g;
    private View i;
    private TextView j;
    private MessageListAdapter k;
    private a l = a.NORMAL;
    private Room m;
    private boolean n;
    private final WeakHandler o = new WeakHandler(Looper.getMainLooper(), this);

    enum a {
        NORMAL,
        FOCUS;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12800a, false, 7495, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12800a, false, 7495, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12800a, false, 7496, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12800a, false, 7496, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.all;
    }

    public final void a(bi biVar) {
        if (PatchProxy.isSupport(new Object[]{biVar}, this, f12800a, false, 7489, new Class[]{bi.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{biVar}, this, f12800a, false, 7489, new Class[]{bi.class}, Void.TYPE);
            return;
        }
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_screen_message", biVar);
        }
    }

    public void onClear() {
        if (PatchProxy.isSupport(new Object[0], this, f12800a, false, 7494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12800a, false, 7494, new Class[0], Void.TYPE);
            return;
        }
        super.onClear();
        this.f12801b.setAdapter(null);
        this.o.removeCallbacksAndMessages(null);
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12800a, false, 7482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12800a, false, 7482, new Class[0], Void.TYPE);
            return;
        }
        a("onUnload");
        this.dataCenter.removeObserver(this);
        if (this.f12803d != null) {
            this.f12803d.d();
        }
    }

    public void handleMsg(Message message) {
        if (message != null && 1 == message.what) {
            this.n = true;
        }
    }

    public void onEvent(r rVar) {
        if (PatchProxy.isSupport(new Object[]{rVar}, this, f12800a, false, 7490, new Class[]{r.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rVar}, this, f12800a, false, 7490, new Class[]{r.class}, Void.TYPE);
            return;
        }
        this.l = a.NORMAL;
        a(a.NORMAL);
    }

    private <T> void a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f12800a, false, 7481, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, this, f12800a, false, 7481, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a(cls2).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12810a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f12810a, false, 7502, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f12810a, false, 7502, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof e) {
                    TextMessageWidget.this.onEvent((e) t);
                } else if (t instanceof r) {
                    TextMessageWidget.this.onEvent((r) t);
                } else {
                    if (t instanceof w) {
                        TextMessageWidget.this.onEvent((w) t);
                    }
                }
            }
        });
    }

    public void onEvent(w wVar) {
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f12800a, false, 7491, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f12800a, false, 7491, new Class[]{w.class}, Void.TYPE);
            return;
        }
        this.l = a.NORMAL;
        a(a.NORMAL);
    }

    private void a(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f12800a, false, 7480, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f12800a, false, 7480, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TEXT_MESSAGE_WIDGET_STATUS");
        hashMap.put("reason", str3);
        if (this.contentView.getVisibility() == 0) {
            str2 = "visible";
        } else {
            str2 = "gone";
        }
        hashMap.put("view_status", str2);
        c.b().b("ttlive_msg", (Map<String, Object>) hashMap);
    }

    public final void b(int i2) {
        String str;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12800a, false, 7483, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12800a, false, 7483, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (a.NORMAL == this.l || i3 <= 0) {
                this.i.setVisibility(4);
                this.f12804e = 0;
                return;
            }
            this.f12804e = i3;
            if (i3 < 100) {
                str = String.valueOf(i2);
            } else {
                str = "99+";
            }
            this.j.setText(this.context.getResources().getString(C0906R.string.cqm, new Object[]{str}));
            if (this.i.getVisibility() != 0) {
                f.a(this.context);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(100);
                this.i.startAnimation(translateAnimation);
            }
            this.i.setVisibility(0);
        }
    }

    public void onEvent(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f12800a, false, 7493, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f12800a, false, 7493, new Class[]{e.class}, Void.TYPE);
            return;
        }
        T t = eVar2.f10167a;
        if (t.f16526b != null && "6".equals(t.f16526b.f16532f)) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_do_send_message", new g(t.f16526b.f16531e));
            if (this.f12803d != null) {
                bu buVar = this.f12803d;
                if (PatchProxy.isSupport(new Object[]{t}, buVar, bu.f11321a, false, 5323, new Class[]{com.bytedance.android.livesdkapi.h.a.class}, Void.TYPE)) {
                    bu buVar2 = buVar;
                    PatchProxy.accessDispatch(new Object[]{t}, buVar2, bu.f11321a, false, 5323, new Class[]{com.bytedance.android.livesdkapi.h.a.class}, Void.TYPE);
                } else if (buVar.b() != null) {
                    for (int i2 = 0; i2 < buVar.f11324c.size(); i2++) {
                        if (t == buVar.f11324c.get(i2).f10013b) {
                            buVar.f11324c.remove(i2);
                            ((bu.a) buVar.b()).a(i2, true);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void onInit(Object... objArr) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12800a, false, 7478, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12800a, false, 7478, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12801b = (LiveMessageRecyclerView) this.contentView.findViewById(C0906R.id.bmu);
        this.i = this.contentView.findViewById(C0906R.id.bms);
        this.j = (TextView) this.contentView.findViewById(C0906R.id.bmt);
        if (!com.bytedance.android.livesdkapi.a.a.f18614b || com.bytedance.android.live.uikit.a.a.j()) {
            z = false;
        } else {
            z = true;
        }
        if (z && Build.VERSION.SDK_INT >= 17) {
            this.j.setTextDirection(4);
        }
        this.k = new MessageListAdapter();
        this.f12802c = new SmoothLinearLayoutManager(this.context, 1, false);
        this.f12802c.f11788b = 1.0f;
        this.f12801b.setLayoutManager(this.f12802c);
        this.f12801b.addItemDecoration(new SpaceItemDecoration(1, (int) UIUtils.dip2Px(this.context, 4.0f)));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDuration(0);
        defaultItemAnimator.setMoveDuration(0);
        defaultItemAnimator.setRemoveDuration(0);
        this.f12801b.setItemAnimator(null);
        this.f12801b.setAdapter(this.k);
        this.f12801b.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12806a;

            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f12806a, false, 7500, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f12806a, false, 7500, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    TextMessageWidget.this.g = false;
                    return;
                }
                if (i == 0 && TextMessageWidget.this.g) {
                    TextMessageWidget.this.a(a.NORMAL);
                }
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                RecyclerView recyclerView2 = recyclerView;
                if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f12806a, false, 7499, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f12806a, false, 7499, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (!recyclerView.canScrollVertically(1)) {
                    TextMessageWidget.this.a(a.NORMAL);
                } else if (!TextMessageWidget.this.g) {
                    int findLastVisibleItemPosition = TextMessageWidget.this.f12802c.findLastVisibleItemPosition();
                    if (findLastVisibleItemPosition > TextMessageWidget.this.f12805f) {
                        TextMessageWidget.this.b(TextMessageWidget.this.f12804e - (findLastVisibleItemPosition - TextMessageWidget.this.f12805f));
                        TextMessageWidget.this.f12805f = findLastVisibleItemPosition;
                    }
                }
            }
        });
        this.f12801b.setOnTouchListener(new em(this));
        this.f12801b.setOnFlingListener(new RecyclerView.OnFlingListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12808a;

            public boolean onFling(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f12808a, false, 7501, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f12808a, false, 7501, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                }
                if (i2 == 0) {
                    if (!TextMessageWidget.this.f12801b.canScrollVertically(1)) {
                        TextMessageWidget.this.a(a.NORMAL);
                    } else {
                        TextMessageWidget.this.a(a.FOCUS);
                        int findLastVisibleItemPosition = TextMessageWidget.this.f12802c.findLastVisibleItemPosition();
                        if (findLastVisibleItemPosition > TextMessageWidget.this.f12805f) {
                            TextMessageWidget.this.b(TextMessageWidget.this.f12804e - (findLastVisibleItemPosition - TextMessageWidget.this.f12805f));
                            TextMessageWidget.this.f12805f = findLastVisibleItemPosition;
                        }
                    }
                }
                return false;
            }
        });
        this.i.setOnClickListener(new en(this));
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{70}, this, f12800a, false, 7485, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{70}, this, f12800a, false, 7485, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k.notifyItemRangeRemoved(0, 70);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
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
            com.meituan.robust.ChangeQuickRedirect r2 = f12800a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7477(0x1d35, float:1.0478E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12800a
            r3 = 0
            r4 = 7477(0x1d35, float:1.0478E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            if (r7 == 0) goto L_0x011c
            java.lang.String r0 = r7.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011c
            java.lang.Object r0 = r7.getData()
            if (r0 != 0) goto L_0x0047
            goto L_0x011c
        L_0x0047:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -1833053846(0xffffffff92bdd16a, float:-1.1979201E-27)
            if (r2 == r3) goto L_0x0074
            r3 = -1548871708(0xffffffffa3ae17e4, float:-1.8875236E-17)
            if (r2 == r3) goto L_0x006a
            r3 = -1357019912(0xffffffffaf1d84f8, float:-1.4326307E-10)
            if (r2 == r3) goto L_0x0060
            goto L_0x007e
        L_0x0060:
            java.lang.String r2 = "data_pre_show_keyboard"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r0 = 2
            goto L_0x007f
        L_0x006a:
            java.lang.String r2 = "cmd_hide_in_douyin_commerce"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r0 = 1
            goto L_0x007f
        L_0x0074:
            java.lang.String r2 = "data_normal_gift_end_event"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r0 = 0
            goto L_0x007f
        L_0x007e:
            r0 = -1
        L_0x007f:
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x008b;
                case 2: goto L_0x0084;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x011b
        L_0x0084:
            com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView r0 = r10.f12801b
            r0.clearFocus()
            goto L_0x011b
        L_0x008b:
            java.lang.Object r0 = r7.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009e
            android.view.View r0 = r10.contentView
            r1 = 4
            r0.setVisibility(r1)
            goto L_0x00a3
        L_0x009e:
            android.view.View r0 = r10.contentView
            r0.setVisibility(r9)
        L_0x00a3:
            java.lang.String r0 = "onChanged"
            r10.a((java.lang.String) r0)
            return
        L_0x00a9:
            java.lang.Object r0 = r7.getData()
            r7 = r0
            com.bytedance.android.livesdk.chatroom.event.y r7 = (com.bytedance.android.livesdk.chatroom.event.y) r7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12800a
            r3 = 0
            r4 = 7492(0x1d44, float:1.0499E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.y> r1 = com.bytedance.android.livesdk.chatroom.event.y.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00de
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12800a
            r3 = 0
            r4 = 7492(0x1d44, float:1.0499E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.y> r1 = com.bytedance.android.livesdk.chatroom.event.y.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x011b
        L_0x00de:
            boolean r0 = r10.isViewValid()
            if (r0 == 0) goto L_0x011b
            if (r7 != 0) goto L_0x00e7
            goto L_0x011b
        L_0x00e7:
            com.bytedance.android.live.base.model.user.User r0 = r7.f10207a
            java.lang.String r1 = r7.f10208b
            long r2 = r7.f10209c
            if (r1 == 0) goto L_0x011b
            if (r0 != 0) goto L_0x00f2
            goto L_0x011b
        L_0x00f2:
            com.bytedance.android.livesdk.message.model.aa r4 = new com.bytedance.android.livesdk.message.model.aa
            r4.<init>()
            r4.f16425a = r0
            r4.f16427c = r1
            r4.f16426b = r2
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r10.dataCenter
            java.lang.String r1 = "data_room_id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r4.f16428d = r0
            com.bytedance.android.livesdkapi.h.b r0 = r7.f10210d
            r4.baseMessage = r0
            com.bytedance.android.livesdk.chatroom.presenter.bu r0 = r10.f12803d
            if (r0 == 0) goto L_0x011a
            com.bytedance.android.livesdk.chatroom.presenter.bu r0 = r10.f12803d
            r0.onMessage(r4)
        L_0x011a:
            return
        L_0x011b:
            return
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget.onChanged(java.lang.Object):void");
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12800a, false, 7479, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12800a, false, 7479, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.f() && this.dataCenter.get("data_room_text_message_presenter") != null) {
            this.f12803d = (bu) this.dataCenter.get("data_room_text_message_presenter");
        } else if (this.dataCenter.get("data_room_id") != null) {
            this.f12803d = new bu(((Long) this.dataCenter.get("data_room_id")).longValue());
        } else {
            return;
        }
        this.dataCenter.lambda$put$1$DataCenter("text_msg_widget_ready", "");
        this.m = (Room) this.dataCenter.get("data_room");
        if (this.m != null && com.bytedance.android.live.uikit.a.a.f() && (this.m.getOrientation() == 1 || this.m.getOrientation() == 2)) {
            this.f12801b.setDisableAllowIntercept(false);
        }
        this.k.f11709b = LayoutInflater.from(this.context);
        this.k.f11710c = this.f12803d.f11324c;
        this.k.f11711d = this.m;
        this.k.notifyDataSetChanged();
        this.f12801b.smoothScrollToPosition(this.k.getItemCount());
        this.f12803d.a((bu.a) this);
        a(e.class);
        a(r.class);
        a(w.class);
        this.dataCenter.observeForever("data_normal_gift_end_event", this).observeForever("cmd_hide_in_douyin_commerce", this).observe("data_pre_show_keyboard", this);
        b(0);
        if (this.m.getOrientation() != 0 && com.bytedance.android.live.uikit.a.a.f()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams.setMargins((int) UIUtils.dip2Px(getContext(), 8.0f), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            this.f12801b.setFadingEdgeLength(0);
        }
        if (com.bytedance.android.live.uikit.a.a.f() && this.m.getOrientation() != 0) {
            this.dataCenter.lambda$put$1$DataCenter("data_room_text_message_presenter", this.f12803d);
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            this.n = false;
            this.o.sendEmptyMessageDelayed(1, 2000);
        } else {
            this.n = true;
        }
        a("onLoad");
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12800a, false, 7484, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12800a, false, 7484, new Class[]{a.class}, Void.TYPE);
        } else if (this.l != aVar) {
            this.l = aVar;
            if (a.NORMAL == aVar) {
                b(0);
                this.f12802c.f11788b = 1.0f;
                this.f12801b.smoothScrollToPosition(this.k.getItemCount() - 1);
                this.f12805f = this.k.getItemCount() - 1;
            }
        }
    }

    public final void c(int i2, boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), (byte) 0}, this, f12800a, false, 7488, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), (byte) 0}, this, f12800a, false, 7488, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.f12802c;
        if (this.n) {
            f2 = 100.0f;
        } else {
            f2 = 1.0f;
        }
        smoothLinearLayoutManager.f11788b = f2;
        this.k.notifyItemChanged(i2);
        if (a.NORMAL == this.l || this.g) {
            this.g = true;
            this.f12801b.smoothScrollToPosition(this.k.getItemCount() - 1);
            this.f12805f = this.k.getItemCount() - 1;
        }
    }

    public final void b(int i2, boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), (byte) 1}, this, f12800a, false, 7487, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), (byte) 1}, this, f12800a, false, 7487, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.f12802c;
        if (this.n) {
            f2 = 100.0f;
        } else {
            f2 = 1.0f;
        }
        smoothLinearLayoutManager.f11788b = f2;
        this.k.notifyItemInserted(i2);
        b(this.f12804e + 1);
        if (this.f12804e >= 300) {
            this.l = a.NORMAL;
            b(0);
            this.f12802c.f11788b = 1.0f;
            this.f12801b.smoothScrollToPosition(this.k.getItemCount());
            this.f12805f = this.k.getItemCount() - 1;
        }
        if (a.NORMAL == this.l || this.g) {
            this.g = true;
            this.f12801b.smoothScrollToPosition(this.k.getItemCount() - 1);
            this.f12805f = this.k.getItemCount() - 1;
        }
    }

    public final void a(int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f12800a, false, 7486, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f12800a, false, 7486, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k.notifyItemRemoved(i2);
        if (i2 != this.k.getItemCount()) {
            MessageListAdapter messageListAdapter = this.k;
            messageListAdapter.notifyItemRangeChanged(i2, messageListAdapter.getItemCount() - i2);
        }
        if (z) {
            this.f12801b.smoothScrollToPosition(this.k.getItemCount() - 1);
            this.f12805f = this.k.getItemCount() - 1;
        }
    }
}
