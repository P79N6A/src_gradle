package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.event.ai;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FullVideoButtonWidget extends LiveWidget implements Observer<KVData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12514a;

    /* renamed from: b  reason: collision with root package name */
    long f12515b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12516c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12517d;

    public int getLayoutId() {
        return C0906R.layout.al0;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12514a, false, 6815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12514a, false, 6815, new Class[0], Void.TYPE);
            return;
        }
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12514a, false, 6814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12514a, false, 6814, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (a.d()) {
            this.contentView.setContentDescription(ac.a((int) C0906R.string.czw));
        }
        this.f12515b = ((Long) this.dataCenter.get("data_room_id")).longValue();
        this.dataCenter.observe("data_keyboard_status", this).observe("cmd_video_orientation_changed", this, true);
        this.contentView.setOnClickListener(new ac(this));
    }

    private void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12514a, false, 6817, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12514a, false, 6817, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            View view = this.contentView;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12514a, false, 6816, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12514a, false, 6816, new Class[]{KVData.class}, Void.TYPE);
        } else if (isViewValid() && kVData != null && kVData.getData() != null && isViewValid()) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 1060055221) {
                if (hashCode == 1631824572 && key.equals("cmd_video_orientation_changed")) {
                    c2 = 1;
                }
            } else if (key.equals("data_keyboard_status")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    this.f12517d = ((Boolean) kVData.getData()).booleanValue();
                    if (this.f12517d || !this.f12516c) {
                        z = false;
                    }
                    a(z);
                    return;
                case 1:
                    this.f12516c = ((ai) kVData.getData()).f10149a;
                    if (this.f12517d || !this.f12516c) {
                        z = false;
                    }
                    a(z);
                    break;
            }
        }
    }
}
