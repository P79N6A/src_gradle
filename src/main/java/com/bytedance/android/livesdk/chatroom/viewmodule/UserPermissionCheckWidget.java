package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.detail.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class UserPermissionCheckWidget extends LiveRecyclableWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12853a;

    /* renamed from: b  reason: collision with root package name */
    Room f12854b;

    /* renamed from: c  reason: collision with root package name */
    String f12855c;

    /* renamed from: d  reason: collision with root package name */
    String f12856d;

    /* renamed from: e  reason: collision with root package name */
    String f12857e;

    /* renamed from: f  reason: collision with root package name */
    private g f12858f;
    private Disposable g;

    public void onInit(@Nullable Object[] objArr) {
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12853a, false, 7547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12853a, false, 7547, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null && !this.g.isDisposed()) {
            this.g.dispose();
        }
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12853a, false, 7544, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12853a, false, 7544, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12854b = (Room) this.dataCenter.get("data_room");
        this.f12858f = (g) this.dataCenter.get("data_room_logger");
        if (this.f12858f != null) {
            this.f12855c = this.f12858f.t;
            this.f12856d = this.f12858f.j;
            this.f12857e = this.f12858f.v;
        }
        this.g = TTLiveSDKContext.getHostService().k().d().subscribe((Consumer<? super T>) new eu<Object>(this));
    }
}
