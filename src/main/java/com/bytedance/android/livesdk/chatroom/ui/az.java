package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.a.b;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.event.af;
import com.bytedance.android.livesdk.common.c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.i.b;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Iterator;

public final class az extends c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11898a;

    /* renamed from: b  reason: collision with root package name */
    final Room f11899b;

    /* renamed from: c  reason: collision with root package name */
    final long f11900c;

    /* renamed from: d  reason: collision with root package name */
    final b f11901d;

    /* renamed from: e  reason: collision with root package name */
    boolean f11902e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11903f = "@";
    private final User i;
    private final i j;
    private String k;
    private final long l;
    private final String m;
    private HSImageView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private View r;
    private DataCenter s;

    private boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f11898a, false, 5737, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11898a, false, 5737, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.g() && this.l == 3) {
            z = true;
        }
        return z;
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f11898a, false, 5743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11898a, false, 5743, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        d.INSTANCE.onMessageFinish();
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f11898a, false, 5742, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11898a, false, 5742, new Class[0], Void.TYPE);
        } else if (!a.f()) {
            super.show();
        }
    }

    private String c() {
        if (PatchProxy.isSupport(new Object[0], this, f11898a, false, 5740, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f11898a, false, 5740, new Class[0], String.class);
        }
        String str = "";
        if (LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a() != null && ((com.bytedance.android.livesdkapi.i.b) LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a()).f18808b != null) {
            Iterator<a.C0134a> it2 = ((com.bytedance.android.livesdkapi.i.b) LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a()).f18808b.g.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                a.C0134a next = it2.next();
                if ("USD".equals(next.f18684a)) {
                    str = next.f18685b;
                    break;
                }
            }
        }
        return str;
    }

    private boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f11898a, false, 5736, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11898a, false, 5736, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User user = (User) this.s.get("data_user_in_room");
        com.bytedance.android.livesdkapi.i.c cVar = (com.bytedance.android.livesdkapi.i.c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.a();
        if (!com.bytedance.android.live.uikit.a.a.a() || user == null || !user.isNeverRecharge() || this.l != 3 || cVar == null || cVar.f18815d != 2 || cVar.f18816e == null) {
            return false;
        }
        return true;
    }

    public final void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f11898a, false, 5738, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11898a, false, 5738, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.yc) {
            dismiss();
        } else {
            if (view.getId() == C0906R.id.dig) {
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(this.f11899b.getId()));
                if (this.l == 3) {
                    str = "charge";
                } else {
                    str = "convenient_gift";
                }
                hashMap.put("guide_style", str);
                com.bytedance.android.livesdk.j.a.a().a("gift_guide_popup_click", hashMap, new j().b("live_function").f("click").a("live_detail").c("gift_guide_popup"));
                if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
                    ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(getContext(), com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.der)).c("gift_guide").a(-1).a()).subscribe();
                } else if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(h.GIFT)) {
                    if (a()) {
                        this.s.lambda$put$1$DataCenter("cmd_show_pay_dialog", new af(((com.bytedance.android.livesdkapi.i.c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.a()).f18816e, "gift", "live_detail", 2));
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("request_page", "live_detail");
                        hashMap2.put("panel_position", "room_detail");
                        com.bytedance.android.livesdk.j.a.a().a("livesdk_convenient_gift_panel_click", hashMap2, j.class, Room.class);
                        dismiss();
                    } else if (b()) {
                        FragmentActivity b2 = com.bytedance.android.live.core.utils.d.b(getContext());
                        if (b2 != null) {
                            ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).showRechargeDialogInH5(b2, false, "gift_guide_popup", null, null);
                        }
                        dismiss();
                    } else {
                        if (PatchProxy.isSupport(new Object[0], this, f11898a, false, 5739, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f11898a, false, 5739, new Class[0], Void.TYPE);
                        } else if (((com.bytedance.android.livesdkapi.host.d) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.d.class)).k()) {
                            ai.a((int) C0906R.string.d_b);
                        } else {
                            com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(this.f11900c);
                            if (findGiftById != null && !((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().b(findGiftById.f15107f)) {
                                String c2 = ((com.bytedance.android.livesdkapi.host.d) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.d.class)).c();
                                if (!"test".equals(c2) && !"local_test".equals(c2)) {
                                    if (this.f11901d != null) {
                                        this.f11901d.a();
                                    }
                                    return;
                                }
                            }
                            if (!this.f11902e) {
                                this.f11902e = true;
                                ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).send(this.f11900c, this.f11899b.getId(), this.f11899b.getOwner().getId(), 1, 125).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new ba(this, SystemClock.uptimeMillis()), new bb(this), new bc(this));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        SpannableString spannableString;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11898a, false, 5735, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11898a, false, 5735, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (b()) {
            i2 = C0906R.layout.ahp;
        } else {
            i2 = C0906R.layout.ag9;
        }
        setContentView(i2);
        this.n = (HSImageView) findViewById(C0906R.id.ayr);
        this.o = (TextView) findViewById(C0906R.id.dfb);
        this.p = (TextView) findViewById(C0906R.id.dau);
        this.q = (TextView) findViewById(C0906R.id.dig);
        this.r = findViewById(C0906R.id.yc);
        if (com.bytedance.android.live.uikit.a.a.d()) {
            this.r.setContentDescription(ac.a((int) C0906R.string.czr));
        }
        com.bytedance.android.livesdk.chatroom.f.b.a(this.n, this.i.getAvatarThumb());
        if (this.j == null || StringUtils.isEmpty(this.j.getNickName())) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("@");
            stringBuffer.append(ac.a((int) C0906R.string.d3r));
            this.o.setText(stringBuffer.toString());
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("@");
            stringBuffer2.append(this.j.getNickName());
            this.o.setText(stringBuffer2.toString());
        }
        com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(this.f11900c);
        if (TextUtils.isEmpty(this.k) || findGiftById == null) {
            this.k = getContext().getResources().getString(C0906R.string.djk);
            findGiftById = GiftManager.inst().getFastGift();
        }
        com.bytedance.android.livesdkapi.i.b bVar = (com.bytedance.android.livesdkapi.i.b) LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a();
        try {
            if (b()) {
                spannableString = new SpannableString(this.k);
                a(spannableString, this.k, c());
                if (bVar != null) {
                    for (b.a aVar : bVar.f18807a) {
                        a(spannableString, this.k, ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).parsePatternAndGetSpannable(aVar.f18809a, "").toString());
                    }
                }
            } else {
                SpannableString spannableString2 = new SpannableString(this.k + " ");
                BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), GiftManager.inst().getGiftIconBitmap(findGiftById.f15105d));
                int a2 = ac.a(16.0f);
                bitmapDrawable.setBounds(0, 0, a2, a2);
                bd.a(spannableString2, new com.bytedance.android.livesdk.widget.c(bitmapDrawable), spannableString2.length() - 1, spannableString2.length(), 33);
                spannableString = spannableString2;
            }
            this.p.setText(spannableString);
        } catch (Exception unused) {
        }
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        if (a()) {
            this.q.setText(ac.a((int) C0906R.string.dji));
            HashMap hashMap = new HashMap();
            hashMap.put("request_page", "live_detail");
            hashMap.put("panel_position", "room_detail");
            com.bytedance.android.livesdk.j.a.a().a("livesdk_convenient_gift_panel_show", hashMap, j.class, Room.class);
            return;
        }
        if (b()) {
            String c2 = c();
            this.q.setText(ac.a((int) C0906R.string.cqd, c2));
        }
    }

    private void a(SpannableString spannableString, String str, String str2) {
        SpannableString spannableString2 = spannableString;
        if (PatchProxy.isSupport(new Object[]{spannableString2, str, str2}, this, f11898a, false, 5741, new Class[]{SpannableString.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannableString2, str, str2}, this, f11898a, false, 5741, new Class[]{SpannableString.class, String.class, String.class}, Void.TYPE);
            return;
        }
        int indexOf = str.indexOf(str2);
        if (indexOf >= 0) {
            bd.a(spannableString2, new ForegroundColorSpan(ac.b((int) C0906R.color.a_t)), indexOf, str2.length() + indexOf, 33);
        }
    }

    public az(Context context, Room room, i iVar, com.bytedance.android.live.gift.a.b bVar, long j2, String str, long j3, String str2, DataCenter dataCenter) {
        super(context, true);
        this.f11899b = room;
        this.i = room.getOwner();
        this.j = iVar;
        this.f11901d = bVar;
        this.f11900c = j2;
        this.k = str;
        this.l = j3;
        this.m = str2;
        this.s = dataCenter;
    }
}
