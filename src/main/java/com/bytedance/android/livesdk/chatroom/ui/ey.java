package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.w;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.w.e;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class ey extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12245a;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f12246f;

    /* renamed from: b  reason: collision with root package name */
    private final Room f12247b;

    /* renamed from: c  reason: collision with root package name */
    private String f12248c;

    /* renamed from: d  reason: collision with root package name */
    private List<Button> f12249d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f12250e;

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12245a, true, 6449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12245a, true, 6449, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("SwitchVideoQualityDialog.java", ey.class);
        f12246f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.SwitchVideoQualityDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 164);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12245a, false, 6446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12245a, false, 6446, new Class[0], Void.TYPE);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(this.f12247b.getStreamUrl().c());
        Collections.reverse(arrayList);
        for (String str : arrayList) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aka, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            inflate.setLayoutParams(layoutParams);
            Button button = (Button) inflate.findViewById(C0906R.id.nl);
            button.setText(str);
            button.setTag(C0906R.id.d7v, str);
            button.setTag(C0906R.id.d7x, this.f12247b.buildPullUrl(str));
            button.setTextColor(getContext().getResources().getColor(C0906R.color.aic));
            button.setBackgroundColor(getContext().getResources().getColor(C0906R.color.a7l));
            button.setTag(C0906R.id.d7w, this.f12247b.getSdkParams(str));
            button.setOnClickListener(this);
            this.f12249d.add(button);
            this.f12250e.addView(inflate);
            if (str.equals(this.f12248c)) {
                a(button);
            }
            if (this.f12249d.size() > 5) {
                break;
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12245a, false, 6448, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12245a, false, 6448, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f12246f, this, this, view));
        if (view.getId() == C0906R.id.nl) {
            HashMap hashMap = new HashMap();
            com.bytedance.android.livesdk.j.a.a().a("definition_setting", hashMap, Room.class, new j().a("live_detail").b("live").f("other"));
            a((Button) view);
            com.bytedance.android.livesdk.u.a.a().a((Object) new w(this.f12248c, (String) view.getTag(C0906R.id.d7x), (String) view.getTag(C0906R.id.d7w)));
            dismiss();
        }
    }

    private void a(Button button) {
        if (PatchProxy.isSupport(new Object[]{button}, this, f12245a, false, 6447, new Class[]{Button.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{button}, this, f12245a, false, 6447, new Class[]{Button.class}, Void.TYPE);
            return;
        }
        this.f12248c = (String) button.getTag(C0906R.id.d7v);
        for (Button next : this.f12249d) {
            if (com.bytedance.android.live.uikit.a.a.f()) {
                next.setTextColor(getContext().getResources().getColor(C0906R.color.aic));
                next.setBackgroundColor(getContext().getResources().getColor(C0906R.color.a7l));
            } else {
                if (ac.f()) {
                    next.setBackgroundResource(2130840796);
                }
                next.setTextColor(getContext().getResources().getColor(C0906R.color.a9g));
            }
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            button.setTextColor(getContext().getResources().getColor(C0906R.color.agy));
            button.setBackgroundColor(getContext().getResources().getColor(C0906R.color.a7l));
        } else if (ac.f()) {
            button.setBackgroundResource(2130840797);
            button.setTextColor(getContext().getResources().getColor(C0906R.color.ao4));
        } else {
            button.setTextColor(getContext().getResources().getColor(C0906R.color.agy));
        }
        TTLiveSDKContext.getHostService().b().b().a((d.a) e.LIVE_QUALITY_ROOM_ID, this.f12247b.getId());
        TTLiveSDKContext.getHostService().b().b().a((d.a) e.LIVE_QUALITY, this.f12248c);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12245a, false, 6444, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12245a, false, 6444, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ahg, null);
        setContentView(inflate);
        this.f12250e = (LinearLayout) inflate.findViewById(C0906R.id.bc4);
        if (getWindow() != null) {
            if (getContext().getResources().getConfiguration().orientation != 2) {
                getWindow().setLayout(-1, (int) UIUtils.dip2Px(getContext(), 80.0f));
                getWindow().setGravity(80);
            } else if (com.bytedance.android.live.uikit.a.a.f()) {
                getWindow().setLayout((int) UIUtils.dip2Px(getContext(), 240.0f), -1);
                getWindow().setGravity(8388613);
            } else {
                getWindow().setLayout(ac.a(376.0f), ac.a(104.0f));
                getWindow().setGravity(8388693);
            }
        }
        if (!com.bytedance.android.live.uikit.a.a.f()) {
            if (PatchProxy.isSupport(new Object[0], this, f12245a, false, 6445, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12245a, false, 6445, new Class[0], Void.TYPE);
            } else {
                for (String next : this.f12247b.getStreamUrl().c()) {
                    View inflate2 = LayoutInflater.from(getContext()).inflate(C0906R.layout.aka, null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                    layoutParams.weight = 1.0f;
                    inflate2.setLayoutParams(layoutParams);
                    Button button = (Button) inflate2.findViewById(C0906R.id.nl);
                    button.setText(next);
                    button.setTag(C0906R.id.d7v, next);
                    button.setTag(C0906R.id.d7x, this.f12247b.buildPullUrl(next));
                    button.setOnClickListener(this);
                    this.f12249d.add(button);
                    this.f12250e.addView(inflate2);
                    if (next.equals(this.f12248c)) {
                        a(button);
                    }
                    if (this.f12249d.size() > 5) {
                        break;
                    }
                }
            }
        } else {
            a();
        }
    }

    public ey(@NonNull Context context, Room room) {
        super(context, C0906R.style.wg);
        this.f12247b = room;
        this.f12248c = room.getStreamUrl().n;
        if (TTLiveSDKContext.getHostService().b().b().c(e.LIVE_QUALITY_ROOM_ID) == room.getId()) {
            this.f12248c = TTLiveSDKContext.getHostService().b().b().d(e.LIVE_QUALITY);
        }
    }
}
