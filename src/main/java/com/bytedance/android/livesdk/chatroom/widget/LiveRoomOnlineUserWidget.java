package com.bytedance.android.livesdk.chatroom.widget;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.presenter.bw;
import com.bytedance.android.livesdk.chatroom.view.c;
import com.bytedance.android.livesdk.chatroom.viewmodule.am;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.android.livesdk.rank.UserRankDialog2;
import com.bytedance.android.livesdk.rank.model.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class LiveRoomOnlineUserWidget extends LiveRecyclableWidget implements Observer<KVData>, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13396a;

    /* renamed from: b  reason: collision with root package name */
    Room f13397b;

    /* renamed from: c  reason: collision with root package name */
    UserRankDialog2 f13398c;

    /* renamed from: d  reason: collision with root package name */
    boolean f13399d = true;

    /* renamed from: e  reason: collision with root package name */
    String f13400e;

    /* renamed from: f  reason: collision with root package name */
    boolean f13401f;
    AppCompatActivity g;
    private TextView h;
    private bw i;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f13396a, false, 7947, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f13396a, false, 7947, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f13396a, false, 7948, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f13396a, false, 7948, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public final void a(List<b> list, List<b> list2) {
    }

    public int getLayoutId() {
        return C0906R.layout.aot;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f13396a, false, 7943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13396a, false, 7943, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        b();
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f13396a, false, 7940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13396a, false, 7940, new Class[0], Void.TYPE);
            return;
        }
        this.dataCenter.removeObserver(this);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13396a, false, 7945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13396a, false, 7945, new Class[0], Void.TYPE);
            return;
        }
        if (!(!isViewValid() || this.f13397b == null || this.f13397b.getOwner() == null)) {
            this.i.a(this.f13397b.getId(), this.f13397b.getOwner().getId(), 18);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13396a, false, 7946, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13396a, false, 7946, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(i2));
            b(i2);
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13396a, false, 7938, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13396a, false, 7938, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.h = (TextView) this.contentView.findViewById(C0906R.id.bus);
        this.h.setOnClickListener(new r(this));
        this.i = new bw();
        this.i.a((c) this);
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13396a, false, 7939, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13396a, false, 7939, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f13397b = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observe("data_member_message", this);
        this.f13399d = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f13400e = (String) this.dataCenter.get("log_enter_live_source");
        this.f13401f = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.g = (AppCompatActivity) this.context;
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13396a, false, 7942, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13396a, false, 7942, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (!a.f()) {
                this.h.setText(e.c((long) i2));
            } else {
                this.h.setText("榜单");
            }
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f13396a, false, 7944, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f13396a, false, 7944, new Class[]{KVData.class}, Void.TYPE);
        } else if (!isViewValid() || kVData == null || TextUtils.isEmpty(kVData.getKey())) {
        } else {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == -407049065 && key.equals("data_member_message")) {
                c2 = 0;
            }
            if (c2 == 0) {
                as asVar = (as) kVData.getData();
                int i2 = asVar.f16485b;
                b(i2);
                if (i2 < 15) {
                    b();
                }
                if (asVar.a() == 8) {
                    b();
                }
            }
        }
    }
}
