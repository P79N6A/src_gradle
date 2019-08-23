package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.chatroom.api.BroadcastConfigRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.c.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class aj extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11827a;

    /* renamed from: c  reason: collision with root package name */
    private static final int f11828c = Color.parseColor("#80FFFFFF");

    /* renamed from: d  reason: collision with root package name */
    private static final int f11829d = Color.parseColor("#FF2200");
    private static final /* synthetic */ a.C0900a z;

    /* renamed from: b  reason: collision with root package name */
    public a f11830b;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f11831e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f11832f;
    private View g;
    private ImageView h;
    private TextView i;
    private View j;
    private ImageView k;
    private TextView l;
    private View m;
    private ImageView n;
    private TextView o;
    private View p;
    private boolean q;
    private boolean r;
    private boolean s;
    private com.bytedance.android.livesdkapi.depend.model.live.a t;
    private View u;
    private View v;
    private View w;
    private h x;
    private Disposable y;

    public interface a {
        void a(com.bytedance.android.livesdkapi.depend.model.live.a aVar);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11827a, false, 5659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11827a, false, 5659, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        a(this.t);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11827a, false, 5663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11827a, false, 5663, new Class[0], Void.TYPE);
            return;
        }
        this.f11830b = null;
        if (this.y != null && !this.y.isDisposed()) {
            this.y.dispose();
        }
        super.onDetachedFromWindow();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11827a, true, 5664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11827a, true, 5664, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("ChooseLiveModeDialog.java", aj.class);
            z = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.ChooseLiveModeDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 175);
        }
    }

    private void b(com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11827a, false, 5662, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11827a, false, 5662, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
            return;
        }
        this.t = aVar;
        View view = this.g;
        int i5 = 8;
        if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = this.j;
        if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.m;
        if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.p;
        if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
            i5 = 0;
        }
        view4.setVisibility(i5);
        if (this.f11830b != null) {
            this.f11830b.a(this.t);
        }
    }

    private void a(com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11827a, false, 5661, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11827a, false, 5661, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
        } else if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
            b(aVar);
        } else {
            this.t = aVar;
            if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                z5 = false;
            }
            ImageView imageView = this.f11831e;
            if (z2) {
                i2 = 2130841371;
            } else {
                i2 = 2130841369;
            }
            imageView.setImageResource(i2);
            TextView textView = this.f11832f;
            if (z2) {
                i3 = f11829d;
            } else {
                i3 = f11828c;
            }
            textView.setTextColor(i3);
            ImageView imageView2 = this.h;
            if (z3) {
                i4 = 2130841362;
            } else {
                i4 = 2130841360;
            }
            imageView2.setImageResource(i4);
            TextView textView2 = this.i;
            if (z3) {
                i5 = f11829d;
            } else {
                i5 = f11828c;
            }
            textView2.setTextColor(i5);
            ImageView imageView3 = this.k;
            if (z4) {
                i6 = 2130841368;
            } else {
                i6 = 2130841366;
            }
            imageView3.setImageResource(i6);
            TextView textView3 = this.l;
            if (z4) {
                i7 = f11829d;
            } else {
                i7 = f11828c;
            }
            textView3.setTextColor(i7);
            TextView textView4 = this.o;
            if (z5) {
                i8 = f11829d;
            } else {
                i8 = f11828c;
            }
            textView4.setTextColor(i8);
            ImageView imageView4 = this.n;
            if (z5) {
                i9 = 2130841365;
            } else {
                i9 = 2130841363;
            }
            imageView4.setImageResource(i9);
            if (this.f11830b != null) {
                this.f11830b.a(this.t);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11827a, false, 5660, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11827a, false, 5660, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(z, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.dru) {
            a(com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO);
            dismiss();
        } else if (id == C0906R.id.gd) {
            a(com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO);
            dismiss();
        } else if (id == C0906R.id.d2g) {
            a(com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY);
            dismiss();
            HashMap hashMap = new HashMap();
            hashMap.put("event_page", "live_take_page");
            com.bytedance.android.livesdk.j.a.a().a("thirdparty_take_click", hashMap, new j().b("live").f("click"));
        } else {
            if (id == C0906R.id.cjz) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("event_page", "live_take_page");
                com.bytedance.android.livesdk.j.a.a().a("game_take_click", hashMap2, new j().b("live").f("click"));
                a(com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2;
        int i3;
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11827a, false, 5657, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11827a, false, 5657, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
            i3 = C0906R.layout.afm;
            i2 = 48;
        } else {
            i3 = C0906R.layout.afl;
            i2 = 80;
        }
        setContentView(LayoutInflater.from(getContext()).inflate(i3, null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(i2);
        }
        findViewById(C0906R.id.dru).setOnClickListener(this);
        this.f11831e = (ImageView) findViewById(C0906R.id.ds7);
        this.f11832f = (TextView) findViewById(C0906R.id.dt1);
        this.g = findViewById(C0906R.id.dsw);
        this.u = findViewById(C0906R.id.gd);
        this.u.setOnClickListener(this);
        this.h = (ImageView) findViewById(C0906R.id.gg);
        this.i = (TextView) findViewById(C0906R.id.gi);
        this.j = findViewById(C0906R.id.gh);
        this.v = findViewById(C0906R.id.d2g);
        this.v.setOnClickListener(this);
        this.k = (ImageView) findViewById(C0906R.id.d2h);
        this.l = (TextView) findViewById(C0906R.id.d2j);
        this.m = findViewById(C0906R.id.d2i);
        this.w = findViewById(C0906R.id.cjz);
        this.w.setOnClickListener(this);
        this.n = (ImageView) findViewById(C0906R.id.ck0);
        this.o = (TextView) findViewById(C0906R.id.ck2);
        this.p = findViewById(C0906R.id.ck1);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
            findViewById(C0906R.id.a5n).setOnClickListener(new ak(this));
        }
        this.x = new h(this.q, this.r, this.s);
        a(this.x, false);
        HashMap hashMap = new HashMap();
        if (this.r) {
            str = "show";
        } else {
            str = "not_show";
        }
        hashMap.put("thirdparty_button", str);
        if (this.s) {
            str2 = "show";
        } else {
            str2 = "not_show";
        }
        hashMap.put("game_live_button", str2);
        com.bytedance.android.livesdk.j.a.a().a("live_take_type_click", hashMap, new j().b("live").f("click").a("live_take_page"));
        this.y = ((BroadcastConfigRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(BroadcastConfigRetrofitApi.class)).getBroadcastConfig().compose(i.a()).subscribe(new al(this), am.f11838b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aj(@android.support.annotation.NonNull android.content.Context r3, com.bytedance.android.livesdkapi.depend.model.live.a r4) {
        /*
            r2 = this;
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.START_LIVE_STYLE
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x0013
            r0 = 2131493721(0x7f0c0359, float:1.861093E38)
            goto L_0x0016
        L_0x0013:
            r0 = 2131493717(0x7f0c0355, float:1.8610922E38)
        L_0x0016:
            r2.<init>(r3, r0)
            r3 = 0
            r2.q = r3
            r2.r = r3
            r2.s = r3
            r2.t = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.aj.<init>(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.a):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        if (r11.f11121c != false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.android.livesdk.chatroom.model.h r11, boolean r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f11827a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.model.h> r1 = com.bytedance.android.livesdk.chatroom.model.h.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 5658(0x161a, float:7.929E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f11827a
            r3 = 0
            r4 = 5658(0x161a, float:7.929E-42)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.model.h> r1 = com.bytedance.android.livesdk.chatroom.model.h.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            if (r12 == 0) goto L_0x004f
            com.bytedance.android.livesdk.chatroom.model.h r0 = r10.x
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00dd
        L_0x004f:
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.START_LIVE_MODE_UNLOCK
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 8
            if (r0 == 0) goto L_0x006c
            android.view.View r0 = r10.u
            r0.setVisibility(r8)
            android.view.View r0 = r10.w
            r0.setVisibility(r8)
            android.view.View r0 = r10.v
            goto L_0x00a7
        L_0x006c:
            boolean r0 = com.bytedance.android.livesdkapi.a.a.f18616d
            if (r0 == 0) goto L_0x0084
            android.view.View r0 = r10.u
            boolean r2 = r11.f11120b
            if (r2 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r8 = 8
        L_0x0079:
            r0.setVisibility(r8)
            android.view.View r0 = r10.w
            r0.setVisibility(r1)
            android.view.View r0 = r10.v
            goto L_0x00a5
        L_0x0084:
            android.view.View r0 = r10.u
            boolean r2 = r11.f11120b
            if (r2 == 0) goto L_0x008c
            r2 = 0
            goto L_0x008e
        L_0x008c:
            r2 = 8
        L_0x008e:
            r0.setVisibility(r2)
            android.view.View r0 = r10.w
            boolean r2 = r11.f11122d
            if (r2 == 0) goto L_0x0099
            r2 = 0
            goto L_0x009b
        L_0x0099:
            r2 = 8
        L_0x009b:
            r0.setVisibility(r2)
            android.view.View r0 = r10.v
            boolean r2 = r11.f11121c
            if (r2 == 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r8 = 8
        L_0x00a7:
            r0.setVisibility(r8)
            if (r12 == 0) goto L_0x00dd
            android.content.Context r0 = r10.getContext()
            java.lang.String r1 = "ttrlive_sp_live_setting"
            com.bytedance.ies.e.b r0 = com.bytedance.ies.e.b.a((android.content.Context) r0, (java.lang.String) r1)
            java.lang.String r1 = "enable_radio"
            boolean r2 = r11.f11120b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.bytedance.ies.e.b r0 = r0.a((java.lang.String) r1, (java.lang.Object) r2)
            java.lang.String r1 = "enable_live_third_party"
            boolean r2 = r11.f11121c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.bytedance.ies.e.b r0 = r0.a((java.lang.String) r1, (java.lang.Object) r2)
            java.lang.String r1 = "enable_live_screenshot"
            boolean r2 = r11.f11122d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.bytedance.ies.e.b r0 = r0.a((java.lang.String) r1, (java.lang.Object) r2)
            r0.a()
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.aj.a(com.bytedance.android.livesdk.chatroom.model.h, boolean):void");
    }
}
