package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.model.ac;
import com.bytedance.android.livesdk.chatroom.presenter.bk;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class PkPromotionWidget extends LiveRecyclableWidget implements Observer<KVData>, View.OnClickListener, bk.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12715a;
    private static final /* synthetic */ a.C0900a k;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f12716b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f12717c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f12718d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f12719e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f12720f;
    private ForegroundColorSpan g;
    private Room h;
    private boolean i;
    private bk j;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12715a, false, 7356, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12715a, false, 7356, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12715a, false, 7357, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12715a, false, 7357, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.ank;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12715a, false, 7350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12715a, false, 7350, new Class[0], Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.d95);
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12715a, false, 7347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12715a, false, 7347, new Class[0], Void.TYPE);
            return;
        }
        this.j.d();
        this.dataCenter.removeObserver(this);
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12715a, true, 7355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12715a, true, 7355, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("PkPromotionWidget.java", PkPromotionWidget.class);
        k = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.PkPromotionWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 96);
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12715a, false, 7345, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12715a, false, 7345, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12716b = (ImageView) this.contentView.findViewById(C0906R.id.b37);
        this.f12717c = (ViewGroup) this.contentView.findViewById(C0906R.id.cuc);
        this.f12718d = (ViewGroup) this.contentView.findViewById(C0906R.id.c86);
        this.f12719e = (TextView) this.contentView.findViewById(C0906R.id.djc);
        this.f12720f = (TextView) this.contentView.findViewById(C0906R.id.dgq);
        this.contentView.setOnClickListener(this);
        this.j = new bk();
    }

    public void onLoad(Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12715a, false, 7346, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12715a, false, 7346, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.h = (Room) this.dataCenter.get("data_room");
        this.i = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.dataCenter.observe("data_link_state", this);
        this.j.a((bk.a) this);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12715a, false, 7348, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12715a, false, 7348, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            int intValue = ((Integer) kVData.getData()).intValue();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue)}, this, f12715a, false, 7354, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue)}, this, f12715a, false, 7354, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (intValue != 1) {
                this.contentView.setVisibility(0);
            } else {
                this.contentView.setVisibility(8);
            }
        }
    }

    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f12715a, false, 7349, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12715a, false, 7349, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(k, this, this, view));
        com.bytedance.android.livesdk.u.a.a().a((Object) new aa(Uri.parse("https://hotsoon.snssdk.com/hotsoon/in_app/common_live/pk_division/").buildUpon().appendQueryParameter("anchor_id", String.valueOf(this.h.getOwner().getId())).appendQueryParameter("room_id", String.valueOf(this.h.getId())).appendQueryParameter("is_anchor", String.valueOf(this.i ? 1 : 0)).build().toString(), ""));
        com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
        Object[] objArr = new Object[2];
        j b2 = new j().b("live_function");
        if (this.i) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[0] = b2.a(str);
        objArr[1] = Room.class;
        a2.a("medal_click", objArr);
    }

    public final void a(@NonNull ac acVar, long j2, boolean z) {
        ac acVar2 = acVar;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{acVar2, new Long(j3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f12715a, false, 7351, new Class[]{ac.class, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{acVar2, new Long(j3), Byte.valueOf(z)}, this, f12715a, false, 7351, new Class[]{ac.class, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.chatroom.f.b.a(this.f12716b, acVar2.f11085f);
        if (acVar2.f11083d != null) {
            ac.b bVar = acVar2.f11083d;
            ac.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f12715a, false, 7352, new Class[]{ac.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f12715a, false, 7352, new Class[]{ac.b.class}, Void.TYPE);
            } else {
                this.f12717c.setVisibility(8);
                this.f12718d.setVisibility(0);
                SpannableString spannableString = new SpannableString(com.bytedance.android.live.core.utils.ac.a((int) C0906R.string.d6a, Integer.valueOf(bVar2.f11087a), Integer.valueOf(bVar2.f11088b)));
                if (this.g == null) {
                    this.g = new ForegroundColorSpan(Color.parseColor("#ffee00"));
                }
                ForegroundColorSpan foregroundColorSpan = this.g;
                int length = String.valueOf(bVar2.f11087a).length();
                Object[] objArr = {spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 33};
                if (PatchProxy.isSupport(objArr, null, dy.f13194a, true, 7361, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr2 = {spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 33};
                    Object[] objArr3 = objArr2;
                    PatchProxy.accessDispatch(objArr3, null, dy.f13194a, true, 7361, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    spannableString.setSpan(foregroundColorSpan, 0, length, 33);
                }
                this.f12720f.setText(spannableString);
            }
            if (this.i && !((Boolean) com.bytedance.android.livesdk.w.b.aA.a()).booleanValue()) {
                new m.a(this.context, 1).a(2, (CharSequence) com.bytedance.android.live.core.utils.ac.a((int) C0906R.string.cqy), dv.f13189b).c((int) C0906R.string.d96).c();
                com.bytedance.android.livesdk.w.b.aA.a(Boolean.TRUE);
                com.bytedance.android.livesdk.w.b.aB.a(Long.valueOf(j2));
            }
        } else {
            int i2 = acVar2.f11080a;
            int i3 = acVar2.f11081b;
            int i4 = i3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12715a, false, 7353, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)}, this, f12715a, false, 7353, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                this.f12718d.setVisibility(8);
                this.f12717c.setVisibility(0);
                int i5 = i4;
                if (i5 < 100000000) {
                    this.f12719e.setText(com.bytedance.android.live.core.utils.ac.a((int) C0906R.string.d6a, Integer.valueOf(i2), Integer.valueOf(i5)));
                } else {
                    this.f12719e.setText(String.valueOf(i2));
                }
            }
            if (this.i) {
                if (((Boolean) com.bytedance.android.livesdk.w.b.aA.a()).booleanValue() && acVar2.f11084e != null && !TextUtils.isEmpty(acVar2.f11084e.f11086a) && j3 - ((Long) com.bytedance.android.livesdk.w.b.aB.a()).longValue() > 86400000) {
                    new m.a(this.context, 1).a(2, (CharSequence) com.bytedance.android.live.core.utils.ac.a((int) C0906R.string.cqy), dw.f13191b).c((CharSequence) acVar2.f11084e.f11086a).c();
                }
                com.bytedance.android.livesdk.w.b.aA.a(Boolean.FALSE);
            }
        }
        if (this.i && z && acVar2.f11084e != null && !TextUtils.isEmpty(acVar2.f11084e.f11086a)) {
            new m.a(this.context, 1).a(2, (CharSequence) com.bytedance.android.live.core.utils.ac.a((int) C0906R.string.cqy), dx.f13193b).c((CharSequence) acVar2.f11084e.f11086a).c();
        }
    }
}
