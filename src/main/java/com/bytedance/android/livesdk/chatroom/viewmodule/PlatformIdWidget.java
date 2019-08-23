package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.support.annotation.Nullable;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PlatformIdWidget extends LiveRecyclableWidget implements c<KVData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12721a;

    /* renamed from: b  reason: collision with root package name */
    private Room f12722b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f12723c;

    public final /* bridge */ /* synthetic */ void a(@Nullable Object obj) {
    }

    public int getLayoutId() {
        return C0906R.layout.aiu;
    }

    public void onUnload() {
    }

    public void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12721a, false, 7362, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12721a, false, 7362, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12723c = (TextView) this.contentView.findViewById(C0906R.id.avc);
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12721a, false, 7363, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12721a, false, 7363, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12722b = (Room) this.dataCenter.get("data_room");
        if (this.f12722b != null && this.f12722b.getOwner() != null) {
            this.f12723c.setText(ac.a((int) C0906R.string.d8_, this.f12722b.getOwner().displayId));
        }
    }
}
