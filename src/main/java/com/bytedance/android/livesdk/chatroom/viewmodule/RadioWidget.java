package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.r;
import com.bytedance.android.livesdk.chatroom.interact.ab;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter;
import com.bytedance.android.livesdk.chatroom.ui.em;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class RadioWidget extends LiveRecyclableWidget implements View.OnClickListener, ab, RadioViewPresenter.a, em.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12775a;
    private static final String o = RadioWidget.class.getSimpleName();
    private static final /* synthetic */ a.C0900a s;

    /* renamed from: b  reason: collision with root package name */
    Room f12776b;

    /* renamed from: c  reason: collision with root package name */
    boolean f12777c;

    /* renamed from: d  reason: collision with root package name */
    public RadioViewPresenter f12778d;

    /* renamed from: e  reason: collision with root package name */
    p f12779e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f12780f;
    LottieAnimationView g;
    View h;
    ImageView i;
    ImageView j;
    TextView k;
    HSImageView l;
    FrameLayout.LayoutParams m;
    FrameLayout.LayoutParams n;
    private boolean p;
    private boolean q;
    private Observer<KVData> r = new eb(this);

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12781a;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12782d;

        /* renamed from: c  reason: collision with root package name */
        private View f12784c;

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12781a, false, 7445, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12781a, false, 7445, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12781a, true, 7444, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12781a, true, 7444, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("RadioWidget.java", a.class);
            f12782d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget$ToolbarRadioBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 362);
        }

        private a() {
        }

        public final void a(@NonNull com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12781a, false, 7443, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12781a, false, 7443, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
                return;
            }
            if (this.f12784c != null && (aVar instanceof com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b)) {
                this.f12784c.setVisibility(((com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b) aVar).f12947a);
            }
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12781a, false, 7442, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12781a, false, 7442, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f12782d, this, this, view));
            RadioWidget.this.f12778d.a();
        }

        /* synthetic */ a(RadioWidget radioWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            this.f12784c = view;
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12775a, false, 7434, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7434, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12775a, false, 7435, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12775a, false, 7435, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.an5;
    }

    public final Room b() {
        return this.f12776b;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7426, new Class[0], Void.TYPE);
            return;
        }
        em emVar = new em(this.context);
        emVar.f12170b = this;
        emVar.show();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7430, new Class[0], Void.TYPE);
        } else if (this.p) {
            ai.a((int) C0906R.string.d_o);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7431, new Class[0], Void.TYPE);
            return;
        }
        c();
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7419, new Class[0], Void.TYPE);
            return;
        }
        this.f12778d.d();
        this.g.cancelAnimation();
        this.dataCenter.removeObserver("cmd_interact_audio", this.r);
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12775a, true, 7433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12775a, true, 7433, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("RadioWidget.java", RadioWidget.class);
            s = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget", "android.view.View", "view", "", "void"), 215);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7425, new Class[0], Void.TYPE);
            return;
        }
        p pVar = new p((Activity) this.context, null, "radio_cover", 12, 7, 12, 7, new ed(this));
        this.f12779e = pVar;
        this.f12779e.a();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7427, new Class[0], Void.TYPE);
            return;
        }
        this.f12779e.c();
        ai.a((int) C0906R.string.d_q);
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        com.bytedance.android.livesdk.j.a.a().a("background_pic_upload", hashMap, new j().a("live_take_detail").b("live_take"), Room.class);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7428, new Class[0], Void.TYPE);
            return;
        }
        this.f12779e.c();
        ai.a((int) C0906R.string.d_p);
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", PushConstants.PUSH_TYPE_NOTIFY);
        com.bytedance.android.livesdk.j.a.a().a("background_pic_upload", hashMap, new j().a("live_take_detail").b("live_take"), Room.class);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7432, new Class[0], Void.TYPE);
            return;
        }
        new m.a(this.context).a(true).c((int) C0906R.string.d_n).b(0, (int) C0906R.string.d_m, (DialogInterface.OnClickListener) new ee(this)).b(1, (int) C0906R.string.d_j, ef.f13212b).c();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12775a, false, 7429, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12775a, false, 7429, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f12776b.getOwner().setBackgroundImgUrl(str);
        if (TextUtils.isEmpty(str)) {
            this.l.setVisibility(4);
            com.bytedance.android.livesdk.chatroom.f.b.b(this.f12780f, this.f12776b.getOwner().getAvatarLarge());
            return;
        }
        this.l.setVisibility(0);
        com.bytedance.android.livesdk.chatroom.f.b.a(this.l, str);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12775a, false, 7422, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12775a, false, 7422, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(s, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.c_0 || id == C0906R.id.c_1) {
            if (this.p && !this.f12777c && !com.bytedance.android.livesdkapi.a.a.f18614b) {
                if (PatchProxy.isSupport(new Object[0], this, f12775a, false, 7423, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f12775a, false, 7423, new Class[0], Void.TYPE);
                } else {
                    this.f12778d.a();
                }
            } else if (!this.p && this.f12777c && this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_send_gift", this.f12776b.getOwner());
            }
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12775a, false, 7417, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12775a, false, 7417, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12778d = new RadioViewPresenter(this.context);
        this.f12780f = (ImageView) this.contentView.findViewById(C0906R.id.c_0);
        this.h = this.contentView.findViewById(C0906R.id.i5);
        this.k = (TextView) this.contentView.findViewById(C0906R.id.eq);
        this.i = (ImageView) this.contentView.findViewById(C0906R.id.cri);
        this.j = (ImageView) this.contentView.findViewById(C0906R.id.crj);
        this.g = (LottieAnimationView) this.contentView.findViewById(C0906R.id.c_4);
        this.g.setAnimation("audio_interact_effect.json");
        this.g.loop(true);
        this.l = (HSImageView) this.contentView.findViewById(C0906R.id.c_1);
    }

    public void onLoad(Object... objArr) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12775a, false, 7418, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12775a, false, 7418, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.g.setVisibility(4);
        this.h.setVisibility(0);
        this.f12780f.setVisibility(4);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.f12776b = (Room) this.dataCenter.get("data_room");
        this.p = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        com.bytedance.android.livesdk.chatroom.f.b.b(this.f12780f, this.f12776b.getOwner().getAvatarLarge());
        if (TextUtils.isEmpty(this.f12776b.getOwner().getBackgroundImgUrl())) {
            com.bytedance.android.livesdk.chatroom.f.b.b(this.f12780f, this.f12776b.getOwner().getAvatarLarge());
        } else {
            com.bytedance.android.livesdk.chatroom.f.b.a(this.l, this.f12776b.getOwner().getBackgroundImgUrl());
            this.l.setVisibility(0);
        }
        if (this.p) {
            j2 = 3500;
        } else {
            j2 = 500;
        }
        Observable.timer(j2, TimeUnit.MILLISECONDS).compose(getAutoUnbindTransformer()).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new ec<Object>(this));
        this.dataCenter.observeForever("cmd_interact_audio", this.r);
        this.dataCenter.lambda$put$1$DataCenter("cmd_live_radio", new r(true));
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(f.RADIO_COVER, (d.a) new a(this, (byte) 0));
        this.f12778d.a((RadioViewPresenter.a) this);
    }

    public final void a(long j2, boolean z) {
        long j3 = j2;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f12775a, false, 7420, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), Byte.valueOf(z)}, this, f12775a, false, 7420, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.q != z2) {
            this.q = z2;
            if (!this.q || this.j.getVisibility() != 8) {
                this.g.setVisibility(4);
                this.g.cancelAnimation();
            } else {
                this.g.setVisibility(0);
                this.g.playAnimation();
            }
        }
    }

    public final void b(long j2, boolean z) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f12775a, false, 7421, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Byte.valueOf(z)}, this, f12775a, false, 7421, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (j3 == this.f12776b.getOwner().getId()) {
            if (!z || this.i.getVisibility() != 8) {
                if (!z && this.i.getVisibility() == 0) {
                    this.i.setVisibility(8);
                    this.j.setVisibility(8);
                }
                return;
            }
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            this.g.cancelAnimation();
            this.g.setVisibility(4);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f12775a, false, 7424, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f12775a, false, 7424, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (this.f12779e != null) {
            int i4 = i2;
            int i5 = i3;
            this.f12779e.a(i2, i3, intent2);
        }
    }
}
