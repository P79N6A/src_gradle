package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.chatroom.event.l;
import com.bytedance.android.livesdk.chatroom.event.m;
import com.bytedance.android.livesdk.i18n.b;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.message.model.bc;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveRoomNotifyWidget extends LiveRecyclableWidget implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12641a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f12642b;

    /* renamed from: c  reason: collision with root package name */
    public View f12643c;

    /* renamed from: d  reason: collision with root package name */
    public AutoRTLImageView f12644d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f12645e;

    /* renamed from: f  reason: collision with root package name */
    public Room f12646f;
    public WeakHandler g;
    public int h;
    public AnimatorSet i;
    public boolean j;
    public long k = f12642b;
    private AnimatorSet l;
    private CompositeDisposable m;

    public int getLayoutId() {
        return C0906R.layout.alc;
    }

    public void handleMsg(Message message) {
    }

    static {
        long j2;
        if (a.f()) {
            j2 = 2600;
        } else {
            j2 = 2000;
        }
        f12642b = j2;
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12641a, false, 7216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12641a, false, 7216, new Class[0], Void.TYPE);
            return;
        }
        this.contentView.setVisibility(8);
        this.g.removeCallbacksAndMessages(null);
        this.l.cancel();
        this.i.cancel();
        if (this.m != null) {
            this.m.dispose();
        }
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12641a, false, 7221, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f12641a, false, 7221, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", "unrecognised schema");
            jSONObject.put("schema", str2);
            try {
                f.a(this.context).a("live_notifycation_forward", "failed", 0, 0, jSONObject);
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12641a, false, 7215, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12641a, false, 7215, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12646f = (Room) this.dataCenter.get("data_room");
        if (!((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue()) {
            ViewGroup.LayoutParams layoutParams = this.f12643c.getLayoutParams();
            layoutParams.width = ac.a(400.0f);
            this.f12643c.setLayoutParams(layoutParams);
        }
        if (PatchProxy.isSupport(new Object[0], this, f12641a, false, 7224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12641a, false, 7224, new Class[0], Void.TYPE);
            return;
        }
        this.m = new CompositeDisposable();
        this.m.add(com.bytedance.android.livesdk.u.a.a().a(m.class).subscribe((Consumer<? super T>) new Consumer<m>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12655a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                m mVar = (m) obj;
                if (PatchProxy.isSupport(new Object[]{mVar}, this, f12655a, false, 7240, new Class[]{m.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{mVar}, this, f12655a, false, 7240, new Class[]{m.class}, Void.TYPE);
                    return;
                }
                if (mVar != null && mVar.f10185a != null) {
                    l lVar = mVar.f10185a;
                    if (lVar.f10184c == null) {
                        lVar.f10184c = new Bundle();
                    }
                    com.bytedance.android.livesdk.rank.a.a(LiveRoomNotifyWidget.this.dataCenter, lVar.f10184c);
                    com.bytedance.android.livesdk.u.a.a().a((Object) new l(lVar.f10182a, "live_detail", lVar.f10184c));
                }
            }
        }));
    }

    public final void a(bc bcVar) {
        long j2;
        bc bcVar2 = bcVar;
        if (PatchProxy.isSupport(new Object[]{bcVar2}, this, f12641a, false, 7219, new Class[]{bc.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bcVar2}, this, f12641a, false, 7219, new Class[]{bc.class}, Void.TYPE);
            return;
        }
        String str = bcVar2.f16547e;
        User user = bcVar2.g;
        long j3 = bcVar2.baseMessage.f18777d;
        if (bcVar.supportDisplayText()) {
            e eVar = bcVar2.baseMessage.j;
            String str2 = null;
            String str3 = eVar.f18783b;
            if (!TextUtils.isEmpty(eVar.f18782a)) {
                str2 = b.a().a(eVar.f18782a);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = str3;
            }
            this.f12645e.setText(y.a(str2, eVar));
        } else if (!(bcVar2.f16548f == null || bcVar2.f16548f.f16550b == null)) {
            this.f12645e.setText(bcVar2.f16548f.f16550b.a());
        }
        try {
            j2 = Long.parseLong(Uri.parse(str).getQueryParameter("room_id"));
        } catch (NumberFormatException unused) {
            j2 = 0;
        }
        long j4 = j2;
        int i2 = bcVar2.f16546d;
        String str4 = str;
        User user2 = user;
        ct ctVar = r0;
        long j5 = j3;
        View view = this.f12643c;
        int i3 = i2;
        int i4 = i2;
        bc bcVar3 = bcVar;
        ct ctVar2 = new ct(this, str4, user2, j5, i3, bcVar3);
        view.setOnClickListener(ctVar);
        TextView textView = this.f12645e;
        cu cuVar = new cu(this, str4, user2, j5, i4, bcVar3);
        textView.setOnClickListener(cuVar);
        if (bcVar2.f16548f != null) {
            this.k = bcVar2.f16548f.f16551c * 1000;
        }
        this.l.start();
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j4));
        hashMap.put("message_type", String.valueOf(i4));
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", "top_message");
        hashMap.put("top_message_type", "gift");
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("gift_id");
        if (!StringUtils.isEmpty(queryParameter)) {
            hashMap.put("gift_id", queryParameter);
        }
        String queryParameter2 = parse.getQueryParameter("anchor_id");
        if (!StringUtils.isEmpty(queryParameter2)) {
            hashMap.put("anchor_id", queryParameter2);
        }
        com.bytedance.android.livesdk.j.a.a().a("live_show", hashMap, new j().b("live_view").a("live_detail").c("top_message").g("click").f("core"), Room.class);
        a(bcVar2, "show");
    }

    public void onInit(Object... objArr) {
        boolean z;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12641a, false, 7214, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12641a, false, 7214, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{"huawei&honor"}, this, f12641a, false, 7223, new Class[]{String.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{"huawei&honor"}, this, f12641a, false, 7223, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else {
            z = "huawei&honor".contains(Build.BRAND.toLowerCase());
        }
        this.j = z;
        this.f12643c = this.contentView;
        this.f12644d = (AutoRTLImageView) this.contentView.findViewById(C0906R.id.j9);
        this.f12645e = (TextView) this.contentView.findViewById(C0906R.id.btx);
        if (c.a(this.context) && this.j) {
            this.f12645e = (TextView) this.contentView.findViewById(C0906R.id.bty);
            this.f12645e.setGravity(8388613);
        } else if (!c.a(this.context) && Build.VERSION.SDK_INT >= 17) {
            this.f12645e.setTextDirection(3);
        }
        this.h = UIUtils.getScreenWidth(this.context);
        this.g = new WeakHandler(this);
        if (PatchProxy.isSupport(new Object[0], this, f12641a, false, 7217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12641a, false, 7217, new Class[0], Void.TYPE);
            return;
        }
        if (!c.a(this.context) || this.j) {
            objectAnimator = ObjectAnimator.ofFloat(this.f12643c, "translationX", new float[]{(float) this.h, 0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f12643c, "translationX", new float[]{(float) (-this.h), 0.0f});
        }
        objectAnimator.setDuration(1000);
        if (!c.a(this.context) || this.j) {
            objectAnimator2 = ObjectAnimator.ofFloat(this.f12643c, "translationX", new float[]{0.0f, (float) (-this.h)});
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(this.f12643c, "translationX", new float[]{0.0f, (float) this.h});
        }
        this.l = new AnimatorSet();
        this.i = new AnimatorSet();
        this.l.playSequentially(new Animator[]{objectAnimator});
        this.i.playSequentially(new Animator[]{objectAnimator2});
        this.l.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12647a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f12647a, false, 7228, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12647a, false, 7228, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                LiveRoomNotifyWidget.this.f12643c.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                int i;
                long j;
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{animator}, this, f12647a, false, 7229, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12647a, false, 7229, new Class[]{Animator.class}, Void.TYPE);
                } else if (LiveRoomNotifyWidget.this.isViewValid() && LiveRoomNotifyWidget.this.g != null) {
                    if (LiveRoomNotifyWidget.this.f12645e.getLayout() != null) {
                        i = ((int) LiveRoomNotifyWidget.this.f12645e.getLayout().getLineWidth(0)) - ((LiveRoomNotifyWidget.this.f12645e.getWidth() - LiveRoomNotifyWidget.this.f12645e.getCompoundPaddingRight()) - LiveRoomNotifyWidget.this.f12645e.getCompoundPaddingLeft());
                        if (i > 0) {
                            z = true;
                        }
                    } else {
                        i = 0;
                    }
                    if (!z) {
                        View view = LiveRoomNotifyWidget.this.contentView;
                        cv cvVar = new cv(this);
                        if (LiveRoomNotifyWidget.this.k > 0) {
                            j = LiveRoomNotifyWidget.this.k;
                        } else {
                            j = LiveRoomNotifyWidget.f12642b;
                        }
                        view.postDelayed(cvVar, j);
                        return;
                    }
                    LiveRoomNotifyWidget.this.contentView.postDelayed(new cw(this, i), 500);
                }
            }
        });
        this.i.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12651a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f12651a, false, 7234, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12651a, false, 7234, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                LiveRoomNotifyWidget.this.f12643c.setVisibility(8);
                d.INSTANCE.onMessageFinish();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(bc bcVar, String str) {
        if (PatchProxy.isSupport(new Object[]{bcVar, str}, this, f12641a, false, 7225, new Class[]{bc.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bcVar, str}, this, f12641a, false, 7225, new Class[]{bc.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap(7);
        if (this.f12646f != null) {
            hashMap.put("room_id", this.f12646f.getIdStr());
            hashMap.put("anchor_id", String.valueOf(this.f12646f.getOwnerUserId()));
        }
        if (bcVar != null) {
            String str2 = "";
            switch ((int) bcVar.f16545c) {
                case 1:
                    str2 = "gift";
                    break;
                case 2:
                    str2 = "notice";
                    break;
                case 3:
                    str2 = PushConstants.INTENT_ACTIVITY_NAME;
                    break;
                case 4:
                    str2 = "fans_club";
                    break;
                case 5:
                    str2 = "prop";
                    break;
                case 6:
                    str2 = "warden_buy";
                    break;
            }
            hashMap.put("message_type", str2);
            try {
                Uri parse = Uri.parse(bcVar.f16547e);
                hashMap.put("to_room_id", parse.getQueryParameter("room_id"));
                hashMap.put("to_anchor_id", parse.getQueryParameter("user_id"));
                hashMap.put("present_id", parse.getQueryParameter("gift_id"));
            } catch (Exception unused) {
            }
        }
        hashMap.put("action_type", str);
        com.bytedance.android.livesdk.j.a.a().a("livesdk_top_message", hashMap, new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, User user, long j2, int i2) {
        String str2;
        String str3 = str;
        User user2 = user;
        long j3 = j2;
        int i3 = i2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str3, user2, new Long(j3), Integer.valueOf(i2)}, this, f12641a, false, 7220, new Class[]{String.class, User.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, user2, new Long(j3), Integer.valueOf(i2)}, this, f12641a, false, 7220, new Class[]{String.class, User.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            a(str);
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() == null) {
                str2 = "enter_from_widget=notify&msg_type=" + i3;
            } else {
                str2 = str3 + "&enter_from_widget=notify&msg_type=" + i3;
            }
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{parse}, this, f12641a, false, 7222, new Class[]{Uri.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{parse}, this, f12641a, false, 7222, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
            } else if (parse != null && !TextUtils.isEmpty(parse.getQueryParameter("gift_id"))) {
                z = true;
            }
            if (z) {
                str4 = str4 + "&enter_live_source=top_message&enter_from_v3=live_detail&enter_from_module=top_message&top_message_type=gift";
                ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).setCrossRoomGift(new com.bytedance.android.live.room.a.a(str4, user2, j3));
            }
            if (a.f()) {
                str4 = str4 + "&xt_back_room=true";
            }
            if (!com.bytedance.android.livesdk.v.j.q().m().a(this.context, str4)) {
                a(str4);
            }
        }
    }
}
