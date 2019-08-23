package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.GridLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.j.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import java.util.Map;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class e extends com.bytedance.android.livesdk.widget.e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13311a;
    private static final /* synthetic */ a.C0900a g;

    /* renamed from: b  reason: collision with root package name */
    private List<f> f13312b;

    /* renamed from: c  reason: collision with root package name */
    private Map<f, View> f13313c;

    /* renamed from: d  reason: collision with root package name */
    private GridLayout f13314d;

    /* renamed from: e  reason: collision with root package name */
    private i f13315e = ((i) j.b());

    /* renamed from: f  reason: collision with root package name */
    private boolean f13316f;

    public final int a() {
        return C0906R.layout.afo;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13311a, false, 7695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13311a, false, 7695, new Class[0], Void.TYPE);
            return;
        }
        this.f13315e.a(false);
        super.onDetachedFromWindow();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f13311a, true, 7698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13311a, true, 7698, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LiveToolbarMoreDialog.java", e.class);
        g = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarMoreDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 121);
    }

    public void onAttachedToWindow() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f13311a, false, 7694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13311a, false, 7694, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (ac.f()) {
            i = ac.c();
        } else {
            i = ac.a(376.0f);
        }
        if (this.f13316f) {
            i2 = (int) (UIUtils.dip2Px(getContext(), 375.0f) / 4.0f);
        } else {
            i2 = (int) ((((float) i) - UIUtils.dip2Px(getContext(), 16.0f)) / 4.0f);
        }
        this.f13314d.removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        for (f next : this.f13312b) {
            View inflate = from.inflate(C0906R.layout.am0, this.f13314d, false);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(i2, -2));
            inflate.findViewById(C0906R.id.aq8).setBackgroundResource(next.getDrawableFolded());
            TextView textView = (TextView) inflate.findViewById(C0906R.id.bpn);
            textView.setText(next.getTitleId());
            if (!ac.f()) {
                textView.setTextColor(2063597567);
            }
            inflate.setTag(next);
            this.f13314d.addView(inflate);
            this.f13313c.put(next, inflate);
            this.f13315e.a(next, inflate);
            inflate.setOnClickListener(this);
        }
    }

    public void show() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f13311a, false, 7697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13311a, false, 7697, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        if (this.f13312b.contains(f.DOU_PLUS_PROMOTE)) {
            d.a a2 = this.f13315e.a(f.DOU_PLUS_PROMOTE);
            if (a2 instanceof com.bytedance.android.livesdk.c.a.a) {
                com.bytedance.android.livesdk.c.a.a aVar = (com.bytedance.android.livesdk.c.a.a) a2;
                if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.livesdk.c.a.a.f9671a, false, 3876, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.livesdk.c.a.a.f9671a, false, 3876, new Class[0], Void.TYPE);
                    return;
                }
                Room room = (Room) aVar.f9673b.get("data_room", null);
                com.bytedance.android.livesdkapi.c.a aVar2 = (com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class);
                d.a a3 = d.a.a().a("entrance_type", "tool_panel").a("pay_mode", "dou_not_iap").a("serving_type", "my_group");
                long j2 = 0;
                if (room == null) {
                    j = 0;
                } else {
                    j = room.getId();
                }
                d.a a4 = a3.a("room_id", String.valueOf(j));
                if (room != null) {
                    j2 = room.author().getId();
                }
                aVar2.a(false, "show_live_dou_plus", "", a4.a("anchor_id", String.valueOf(j2)).f15712b);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13311a, false, 7696, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13311a, false, 7696, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(g, this, this, view));
        f fVar = (f) view.getTag();
        d.a a2 = this.f13315e.a(fVar);
        if (a2 != null) {
            a2.onClick(view);
            if (!(fVar == f.REVERSE_CAMERA || fVar == f.REVERSE_MIRROR || fVar == f.AUDIO_TOGGLE)) {
                dismiss();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13311a, false, 7693, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13311a, false, 7693, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getWindow() != null && !ac.f()) {
            getWindow().setLayout(ac.a(376.0f), -2);
            getWindow().setGravity(8388693);
        }
        findViewById(C0906R.id.y9).setOnClickListener(this);
        this.f13314d = (GridLayout) findViewById(C0906R.id.ali);
        Window window = getWindow();
        if (window != null && com.bytedance.android.live.uikit.a.a.f()) {
            window.setDimAmount(0.0f);
            if (this.f13316f) {
                window.setLayout((int) UIUtils.dip2Px(getContext(), 391.0f), -2);
                window.setGravity(85);
                int dip2Px = (int) UIUtils.dip2Px(getContext(), 8.0f);
                UIUtils.updateLayoutMargin(this.f13314d, dip2Px, dip2Px, dip2Px, dip2Px);
            }
        }
        if (!ac.f()) {
            ((ConstraintLayout.LayoutParams) this.f13314d.getLayoutParams()).bottomMargin = ac.a(8.0f);
        }
    }

    public e(Context context, List<f> list) {
        super(context);
        this.f13312b = list;
        this.f13313c = this.f13315e.f13327c;
    }
}
