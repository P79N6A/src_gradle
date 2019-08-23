package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

public class a implements View.OnClickListener {
    private static final /* synthetic */ a.C0900a A;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13418a;
    private static final int y = Color.parseColor("#80FFFFFF");
    private static final int z = Color.parseColor("#FF2200");

    /* renamed from: b  reason: collision with root package name */
    public ImageView f13419b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f13420c;

    /* renamed from: d  reason: collision with root package name */
    public View f13421d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f13422e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f13423f;
    public View g;
    public ImageView h;
    public TextView i;
    public View j;
    public ImageView k;
    public TextView l;
    public View m;
    public boolean n;
    public boolean o;
    public boolean p;
    public com.bytedance.android.livesdkapi.depend.model.live.a q;
    public C0094a r;
    public View s;
    public View t;
    public View u;
    public h v;
    public Context w;
    public Disposable x;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.a$a  reason: collision with other inner class name */
    public interface C0094a {
        void a(com.bytedance.android.livesdkapi.depend.model.live.a aVar);

        void i();
    }

    private void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f13418a, false, 7800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13418a, false, 7800, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.i();
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f13418a, true, 7801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13418a, true, 7801, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("ChooseLiveModeView.java", a.class);
            A = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.widget.ChooseLiveModeView", "android.view.View", NotifyType.VIBRATE, "", "void"), 149);
        }
    }

    private void b(com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f13418a, false, 7798, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f13418a, false, 7798, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
            return;
        }
        this.q = aVar;
        View view = this.f13421d;
        int i5 = 8;
        if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = this.g;
        if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.j;
        if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.m;
        if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
            i5 = 0;
        }
        view4.setVisibility(i5);
        if (this.r != null) {
            this.r.a(this.q);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13418a, false, 7796, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13418a, false, 7796, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(A, this, this, view));
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
            }
        }
    }

    public void a(com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
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
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f13418a, false, 7797, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f13418a, false, 7797, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
        } else if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
            b(aVar);
        } else {
            this.q = aVar;
            if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.q != com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                z5 = false;
            }
            ImageView imageView = this.f13419b;
            if (z2) {
                i2 = 2130841371;
            } else {
                i2 = 2130841369;
            }
            imageView.setImageResource(i2);
            TextView textView = this.f13420c;
            if (z2) {
                i3 = z;
            } else {
                i3 = y;
            }
            textView.setTextColor(i3);
            ImageView imageView2 = this.f13422e;
            if (z3) {
                i4 = 2130841362;
            } else {
                i4 = 2130841360;
            }
            imageView2.setImageResource(i4);
            TextView textView2 = this.f13423f;
            if (z3) {
                i5 = z;
            } else {
                i5 = y;
            }
            textView2.setTextColor(i5);
            ImageView imageView3 = this.h;
            if (z4) {
                i6 = 2130841368;
            } else {
                i6 = 2130841366;
            }
            imageView3.setImageResource(i6);
            TextView textView3 = this.i;
            if (z4) {
                i7 = z;
            } else {
                i7 = y;
            }
            textView3.setTextColor(i7);
            TextView textView4 = this.l;
            if (z5) {
                i8 = z;
            } else {
                i8 = y;
            }
            textView4.setTextColor(i8);
            ImageView imageView4 = this.k;
            if (z5) {
                i9 = 2130841365;
            } else {
                i9 = 2130841363;
            }
            imageView4.setImageResource(i9);
            if (this.r != null) {
                this.r.a(this.q);
            }
        }
    }

    public a(@NonNull Context context, com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
        this.w = context;
        this.q = aVar;
    }

    public void a(h hVar, boolean z2) {
        View view;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{hVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f13418a, false, 7795, new Class[]{h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, Byte.valueOf(z2)}, this, f13418a, false, 7795, new Class[]{h.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2 || !hVar.equals(this.v)) {
            int i5 = 8;
            if (com.bytedance.android.livesdkapi.a.a.f18616d) {
                View view2 = this.s;
                if (!hVar.f11120b) {
                    i4 = 8;
                }
                view2.setVisibility(i4);
                this.u.setVisibility(8);
                view = this.t;
            } else {
                View view3 = this.s;
                if (hVar.f11120b) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view3.setVisibility(i2);
                View view4 = this.u;
                if (hVar.f11122d) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                view4.setVisibility(i3);
                view = this.t;
                if (hVar.f11121c) {
                    i5 = 0;
                }
            }
            view.setVisibility(i5);
            if (z2) {
                com.bytedance.ies.e.b.a(this.w, "ttrlive_sp_live_setting").a("enable_radio", (Object) Boolean.valueOf(hVar.f11120b)).a("enable_live_third_party", (Object) Boolean.valueOf(hVar.f11121c)).a("enable_live_screenshot", (Object) Boolean.valueOf(hVar.f11122d)).a();
            }
        }
    }
}
