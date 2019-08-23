package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.e.x;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.s;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.message.model.l;
import com.bytedance.android.livesdk.message.model.n;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class TopRankWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12812a;

    /* renamed from: b  reason: collision with root package name */
    public View f12813b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f12814c;

    /* renamed from: d  reason: collision with root package name */
    public View f12815d;

    /* renamed from: e  reason: collision with root package name */
    public View f12816e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f12817f;
    public TextView g;
    public ImageView h;
    public View i;
    public View j;
    public ImageView k;
    public TextView l;
    public Animator m;
    public AnimatorSet n;
    public AnimatorSet o;
    public AnimatorSet p;
    public Animator q;
    public Animator r;
    public Room s;
    public int t;
    public int u;
    private Animator v;
    private IMessageManager w;
    private boolean x;
    private boolean y;

    public int getLayoutId() {
        return C0906R.layout.am4;
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12812a, false, 7507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12812a, false, 7507, new Class[0], Void.TYPE);
            return;
        }
        this.w.removeMessageListener(this);
        if (this.v != null && this.v.isRunning()) {
            this.v.cancel();
        }
        if (this.m != null && this.m.isRunning()) {
            this.m.cancel();
        }
        if (this.n != null && this.n.isRunning()) {
            this.n.cancel();
        }
        if (this.o != null && this.o.isRunning()) {
            this.o.cancel();
        }
        if (this.p != null && this.p.isRunning()) {
            this.p.cancel();
        }
        if (this.q != null && this.q.isRunning()) {
            this.q.cancel();
        }
        if (this.r != null && this.r.isRunning()) {
            this.r.cancel();
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12812a, false, 7506, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12812a, false, 7506, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.s = (Room) this.dataCenter.get("data_room");
        this.x = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.y = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.w = (IMessageManager) this.dataCenter.get("data_message_manager");
        this.w.addMessageListener(a.DAILY_RANK.getIntType(), this);
    }

    public void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f12812a, false, 7516, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f12812a, false, 7516, new Class[]{IMessage.class}, Void.TYPE);
        } else if (iMessage.getIntType() == a.DAILY_RANK.getIntType()) {
            l lVar = (l) iMessage;
            if (2 == lVar.f16653f || 3 == lVar.f16653f || 4 == lVar.f16653f) {
                d.INSTANCE.add(lVar);
            }
        }
    }

    public final void a(final l lVar) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        long j2;
        if (PatchProxy.isSupport(new Object[]{lVar}, this, f12812a, false, 7509, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar}, this, f12812a, false, 7509, new Class[]{l.class}, Void.TYPE);
        } else if (this.contentView != null && isViewValid()) {
            if (lVar == null || lVar.g == null || lVar.g.f16654a == null || lVar.g.f16654a.size() < this.u + 1 || lVar.g.f16654a.get(this.u) == null || TextUtils.isEmpty(lVar.g.f16654a.get(this.u).f16655a)) {
                this.u++;
                if (this.u <= 2) {
                    a(lVar);
                } else {
                    d.INSTANCE.onMessageFinish();
                }
            } else {
                if (this.t == 0 && this.contentView != null) {
                    this.t = this.contentView.getWidth();
                }
                this.f12813b.setVisibility(8);
                this.f12815d.setVisibility(8);
                this.f12816e.setVisibility(8);
                this.i.setVisibility(8);
                this.j.setVisibility(8);
                n nVar = lVar.g.f16654a.get(this.u);
                if (!(nVar == null || (nVar.f16660f == null && nVar.f16659e == null))) {
                    Spannable spannable = x.f10027b;
                    if (nVar.f16659e != null) {
                        spannable = y.a(nVar.f16659e, "");
                    }
                    if (spannable != x.f10027b) {
                        this.f12814c.setText(spannable);
                    } else {
                        this.f12814c.setText(nVar.f16660f.a());
                    }
                }
                this.f12813b.setOnClickListener(new eo(this, nVar));
                this.f12813b.setVisibility(0);
                if (c.a(this.context)) {
                    objectAnimator = ObjectAnimator.ofFloat(this.f12813b, "translationX", new float[]{(float) (-this.t), 0.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(this.f12813b, "translationX", new float[]{(float) this.t, 0.0f});
                }
                this.v = objectAnimator;
                this.v.setDuration(1000);
                this.v.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12818a;

                    public final void onAnimationEnd(Animator animator) {
                        long j;
                        int i;
                        boolean z = false;
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f12818a, false, 7519, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f12818a, false, 7519, new Class[]{Animator.class}, Void.TYPE);
                        } else if (TopRankWidget.this.isViewValid()) {
                            if (lVar.f16652e > 0) {
                                j = (long) (lVar.f16652e * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            } else {
                                j = 2000;
                            }
                            if (TopRankWidget.this.f12814c.getLayout() != null) {
                                i = ((int) TopRankWidget.this.f12814c.getLayout().getLineWidth(0)) - ((TopRankWidget.this.f12814c.getWidth() - TopRankWidget.this.f12814c.getCompoundPaddingRight()) - TopRankWidget.this.f12814c.getCompoundPaddingLeft());
                                if (i > 0) {
                                    z = true;
                                }
                            } else {
                                i = 0;
                            }
                            if (!z) {
                                TopRankWidget.this.f12813b.postDelayed(new ep(this), j);
                            } else {
                                TopRankWidget.this.f12813b.postDelayed(new eq(this, i, j), 500);
                            }
                        }
                    }
                });
                if (c.a(this.context)) {
                    objectAnimator2 = ObjectAnimator.ofFloat(this.f12813b, "translationX", new float[]{0.0f, (float) this.t});
                } else {
                    objectAnimator2 = ObjectAnimator.ofFloat(this.f12813b, "translationX", new float[]{0.0f, (float) (-this.t)});
                }
                this.m = objectAnimator2;
                this.m.setDuration(1000);
                this.m.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12823a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f12823a, false, 7524, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f12823a, false, 7524, new Class[]{Animator.class}, Void.TYPE);
                        } else if (TopRankWidget.this.isViewValid()) {
                            TopRankWidget.this.f12813b.setVisibility(8);
                            TopRankWidget.this.u++;
                            TopRankWidget.this.f12813b.postDelayed(new es(this, lVar), 1000);
                        }
                    }
                });
                this.v.start();
                HashMap hashMap = new HashMap();
                if (nVar.f16657c != null) {
                    hashMap.put("anchor_id", String.valueOf(nVar.f16657c.getId()));
                }
                hashMap.put("room_id", String.valueOf(nVar.f16656b));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live_detail");
                hashMap.put("event_module", "top");
                hashMap.put("action_type", "click");
                hashMap.put("top_message_type", "hourly_rank_top");
                com.bytedance.android.livesdk.j.a.a().a("live_show", hashMap, new Object[0]);
                if (nVar.f16657c == null) {
                    j2 = 0;
                } else {
                    j2 = nVar.f16657c.getId();
                }
                a("show_roomnotifymessage", j2, nVar.f16656b);
            }
        }
    }

    public void onInit(Object... objArr) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12812a, false, 7505, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12812a, false, 7505, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        View view = this.contentView;
        if (PatchProxy.isSupport(new Object[]{view}, this, f12812a, false, 7508, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12812a, false, 7508, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f12813b = view.findViewById(C0906R.id.bew);
        this.f12814c = (TextView) view.findViewById(C0906R.id.bex);
        this.f12815d = view.findViewById(C0906R.id.ber);
        this.f12816e = view.findViewById(C0906R.id.beu);
        this.f12817f = (TextView) view.findViewById(C0906R.id.bev);
        this.g = (TextView) view.findViewById(C0906R.id.bet);
        this.h = (ImageView) view.findViewById(C0906R.id.beq);
        this.i = view.findViewById(C0906R.id.bes);
        if (PatchProxy.isSupport(new Object[0], this, f12812a, false, 7517, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12812a, false, 7517, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            s sVar = (s) LiveSettingKeys.LIVE_RANK_CONFIG.a();
            if (sVar == null || !sVar.f11162a) {
                z = false;
            }
        }
        if (z) {
            this.j = view.findViewById(C0906R.id.bk5);
            this.l = (TextView) this.j.findViewById(C0906R.id.bk6);
            this.k = (ImageView) this.j.findViewById(C0906R.id.bk1);
        } else {
            this.j = view.findViewById(C0906R.id.bk4);
            this.l = (TextView) this.j.findViewById(C0906R.id.bk6);
            this.k = (ImageView) this.j.findViewById(C0906R.id.bk1);
        }
        this.t = view.getWidth();
        if (!this.y) {
            ViewGroup.LayoutParams layoutParams = this.f12813b.getLayoutParams();
            layoutParams.width = ac.a(400.0f);
            this.f12813b.setLayoutParams(layoutParams);
        }
    }

    public final void a(n nVar, String str) {
        long j2;
        n nVar2 = nVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{nVar2, str2}, this, f12812a, false, 7513, new Class[]{n.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2, str2}, this, f12812a, false, 7513, new Class[]{n.class, String.class}, Void.TYPE);
        } else if (isViewValid() && nVar2 != null) {
            if (nVar2.f16657c == null) {
                j2 = 0;
            } else {
                j2 = nVar2.f16657c.getId();
            }
            a("click_roomnotifymessage", j2, nVar2.f16656b);
            if (nVar2.f16656b <= 0 || TextUtils.isEmpty(nVar2.f16658d) || this.x) {
                if (nVar2.f16657c != null && !this.x) {
                    this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(nVar2.f16657c));
                    Context context = this.context;
                    if (PatchProxy.isSupport(new Object[]{context}, this, f12812a, false, 7514, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context}, this, f12812a, false, 7514, new Class[]{Context.class}, Void.TYPE);
                        return;
                    }
                    Toast toast = new Toast(context);
                    View inflate = LayoutInflater.from(context).inflate(C0906R.layout.alo, null);
                    toast.setGravity(49, 0, (int) UIUtils.dip2Px(context, 55.0f));
                    toast.setDuration(0);
                    toast.setView(inflate);
                    if (PatchProxy.isSupport(new Object[]{toast}, null, et.f13246a, true, 7534, new Class[]{Toast.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{toast}, null, et.f13246a, true, 7534, new Class[]{Toast.class}, Void.TYPE);
                        return;
                    }
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(toast);
                    }
                    toast.show();
                }
                return;
            }
            j.q().m().a(this.context, nVar2.f16658d + "&enter_live_source=top&enter_from_v3=live_detail&enter_from_module=top&top_message_type=" + str2);
        }
    }

    public void a(String str, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j4), new Long(j5)}, this, f12812a, false, 7515, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, new Long(j4), new Long(j5)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f12812a, false, 7515, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", PushConstants.PUSH_TYPE_NOTIFY);
            try {
                f.a(this.context).a(str, "top", j2, j3, jSONObject);
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
        }
    }
}
