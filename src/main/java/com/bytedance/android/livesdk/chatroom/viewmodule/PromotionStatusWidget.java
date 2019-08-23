package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.presenter.bn;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.message.model.at;
import com.bytedance.android.livesdk.message.model.au;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;
import org.json.JSONObject;

public class PromotionStatusWidget extends LiveRecyclableWidget implements View.OnClickListener, bn.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12763a;
    private static final /* synthetic */ a.C0900a i;

    /* renamed from: b  reason: collision with root package name */
    private TextView f12764b;

    /* renamed from: c  reason: collision with root package name */
    private bn f12765c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12766d;

    /* renamed from: e  reason: collision with root package name */
    private Room f12767e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12768f;
    private boolean g;
    private JSONObject h;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12772a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12773c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12772a, false, 7414, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12772a, false, 7414, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12772a, false, 7416, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12772a, false, 7416, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12772a, false, 7415, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12772a, false, 7415, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12772a, true, 7413, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12772a, true, 7413, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("PromotionStatusWidget.java", a.class);
            f12773c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget$ToolbarPromotionCardBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 240);
        }

        private a() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12772a, false, 7412, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12772a, false, 7412, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f12773c, this, this, view));
            PromotionStatusWidget.this.onClick(view);
        }

        /* synthetic */ a(PromotionStatusWidget promotionStatusWidget, byte b2) {
            this();
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12763a, false, 7407, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12763a, false, 7407, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12763a, false, 7408, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12763a, false, 7408, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.ano;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12763a, false, 7404, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12763a, false, 7404, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = !z;
        if (!z) {
            this.f12764b.setVisibility(0);
            this.f12764b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130841335, 0);
            this.f12764b.setOnClickListener(null);
        } else if (((Boolean) com.bytedance.android.livesdk.config.a.Z.a()).booleanValue() || !this.f12766d) {
            this.f12764b.setVisibility(4);
            this.f12764b.setOnClickListener(null);
        } else {
            this.f12764b.setVisibility(0);
            this.f12764b.setText(C0906R.string.dhr);
            this.f12764b.setCompoundDrawablesWithIntrinsicBounds(2130841346, 0, 2130841335, 0);
            this.f12764b.setOnClickListener(this);
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12763a, false, 7398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12763a, false, 7398, new Class[0], Void.TYPE);
            return;
        }
        this.f12765c.d();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12763a, true, 7406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12763a, true, 7406, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("PromotionStatusWidget.java", PromotionStatusWidget.class);
        i = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 226);
    }

    private void a(String str) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{str}, this, f12763a, false, 7403, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12763a, false, 7403, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f12768f) {
            i2 = c.f69428f;
        } else {
            i2 = 240;
        }
        if (this.f12768f) {
            i3 = 400;
        } else {
            i3 = 320;
        }
        BaseDialogFragment.a((FragmentActivity) this.context, (DialogFragment) j.q().f().a(com.bytedance.android.livesdk.browser.c.c.a(str).a(i2).b(i3).d(8).a("promotionCards")));
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12763a, false, 7405, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12763a, false, 7405, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(i, this, this, view));
        au auVar = new au();
        auVar.f16498a = "buy_card";
        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
        bVar.f18776c = this.f12767e.getId();
        at atVar = new at();
        atVar.baseMessage = bVar;
        atVar.f16497b = auVar;
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.c(atVar));
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12763a, false, 7396, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12763a, false, 7396, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.g = false;
        this.f12764b = (TextView) this.contentView.findViewById(C0906R.id.dgr);
        this.f12765c = new bn(1);
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.event.c cVar) {
        com.bytedance.android.livesdk.chatroom.event.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f12763a, false, 7401, new Class[]{com.bytedance.android.livesdk.chatroom.event.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f12763a, false, 7401, new Class[]{com.bytedance.android.livesdk.chatroom.event.c.class}, Void.TYPE);
            return;
        }
        f.a(this.context).a("click_adcard", "anchor_click_button", TTLiveSDKContext.getHostService().k().b(), this.f12767e.getId(), this.h);
        if (isViewValid() && cVar2.f10162a != null && cVar2.f10162a.f16497b != null) {
            String str = cVar2.f10162a.f16497b.f16498a;
            char c2 = 65535;
            if (str.hashCode() == -984622807 && str.equals("buy_card")) {
                c2 = 0;
            }
            if (c2 == 0 && cVar2.f10162a.baseMessage != null) {
                a(n.a(Locale.ENGLISH, "https://hotsoon.snssdk.com/falcon/live_inroom/page/promotion_card/index.html?type=promotion&room_id=%1$d&is_anchor=%2$s", Long.valueOf(cVar2.f10162a.baseMessage.f18776c), String.valueOf(this.f12766d)));
            }
        }
    }

    public void onLoad(Object... objArr) {
        String str;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12763a, false, 7397, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12763a, false, 7397, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12766d = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12767e = (Room) this.dataCenter.get("data_room");
        this.f12768f = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f12765c.a((bn.a) this);
        com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.chatroom.event.c.class).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<com.bytedance.android.livesdk.chatroom.event.c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12769a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.livesdk.chatroom.event.c cVar = (com.bytedance.android.livesdk.chatroom.event.c) obj;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f12769a, false, 7411, new Class[]{com.bytedance.android.livesdk.chatroom.event.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f12769a, false, 7411, new Class[]{com.bytedance.android.livesdk.chatroom.event.c.class}, Void.TYPE);
                    return;
                }
                PromotionStatusWidget.this.onEvent(cVar);
            }
        });
        a(true);
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.PROMOTION_CARD, (d.a) new a(this, (byte) 0));
        if (com.ss.android.ugc.aweme.q.c.a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        String str2 = (String) this.dataCenter.get("data_enter_source");
        this.h = new JSONObject();
        try {
            this.h.put("source", this.f12767e.getUserFrom());
            this.h.put("live_source", str);
            this.h.put("request_id", this.f12767e.getRequestId());
            this.h.put("log_pb", this.f12767e.getLog_pb());
            this.h.put("enter_from", str2);
        } catch (Exception unused) {
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12763a, false, 7400, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12763a, false, 7400, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f12764b != null) {
            this.f12764b.setText(this.f12764b.getContext().getString(C0906R.string.dht, new Object[]{Integer.valueOf(i2)}));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, long j) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{view, new Long(j2)}, this, f12763a, false, 7402, new Class[]{View.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, new Long(j2)}, this, f12763a, false, 7402, new Class[]{View.class, Long.TYPE}, Void.TYPE);
            return;
        }
        a(n.a(Locale.ENGLISH, "https://hotsoon.snssdk.com/falcon/live_inroom/page/promotion_card/index.html?type=history&room_id=%1$d&is_anchor=%2$s", Long.valueOf(j), String.valueOf(this.f12766d)));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", this.f12767e.getUserFrom());
            jSONObject.put("request_id", this.f12767e.getRequestId());
            jSONObject.put("log_pb", this.f12767e.getLog_pb());
        } catch (Exception unused) {
        }
        if (this.f12766d) {
            str = "anchor_click";
        } else {
            str = "user_click";
        }
        f.a(view).a("click_adcard_history", str, this.f12767e.getOwner().getId(), j, jSONObject);
    }

    public final void a(bn.b bVar, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{bVar, new Long(j2)}, this, f12763a, false, 7399, new Class[]{bn.b.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, new Long(j2)}, this, f12763a, false, 7399, new Class[]{bn.b.class, Long.TYPE}, Void.TYPE);
        } else if (this.f12764b != null) {
            switch (bVar) {
                case IDLE:
                    a(true);
                    return;
                case IN_PROGRESS:
                    a(false);
                    this.f12764b.setText(this.f12764b.getContext().getString(C0906R.string.dht, new Object[]{0}));
                    this.f12764b.setOnClickListener(new dz(this, j2));
                    return;
                case FINISHED:
                    if (this.g) {
                        this.f12764b.setText(C0906R.string.dhs);
                        this.f12764b.setOnClickListener(new ea(this, j2));
                        break;
                    }
                    break;
            }
        }
    }
}
