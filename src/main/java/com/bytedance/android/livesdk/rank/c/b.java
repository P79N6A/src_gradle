package com.bytedance.android.livesdk.rank.c;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.rank.a.b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class b implements b.a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16939a;

    /* renamed from: b  reason: collision with root package name */
    private final b.C0118b f16940b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHandler f16941c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.android.livesdk.rank.model.a f16942d;

    /* renamed from: e  reason: collision with root package name */
    private a f16943e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16944f;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16945a;

        /* renamed from: b  reason: collision with root package name */
        public int f16946b;

        /* renamed from: c  reason: collision with root package name */
        private WeakHandler f16947c;

        public final void run() {
            StringBuilder sb;
            StringBuilder sb2;
            StringBuilder sb3;
            if (PatchProxy.isSupport(new Object[0], this, f16945a, false, 13075, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16945a, false, 13075, new Class[0], Void.TYPE);
                return;
            }
            String str = "00:00:00";
            if (this.f16946b > 0) {
                this.f16946b--;
                int i = this.f16946b / 3600;
                int i2 = (this.f16946b % 3600) / 60;
                int i3 = (this.f16946b % 3600) % 60;
                StringBuilder sb4 = new StringBuilder();
                if (i < 10) {
                    sb = new StringBuilder(PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    sb = new StringBuilder();
                }
                sb.append(i);
                sb4.append(sb.toString());
                sb4.append(":");
                if (i2 < 10) {
                    sb2 = new StringBuilder(PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    sb2 = new StringBuilder();
                }
                sb2.append(i2);
                sb4.append(sb2.toString());
                sb4.append(":");
                if (i3 < 10) {
                    sb3 = new StringBuilder(PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    sb3 = new StringBuilder();
                }
                sb3.append(i3);
                sb4.append(sb3.toString());
                str = sb4.toString();
            }
            this.f16947c.sendMessage(this.f16947c.obtainMessage(100, str));
        }

        a(int i, WeakHandler weakHandler) {
            this.f16946b = i;
            this.f16947c = weakHandler;
        }
    }

    private int c() {
        if (this.f16942d == null) {
            return 0;
        }
        long j = this.f16942d.j;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16939a, false, 13071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16939a, false, 13071, new Class[0], Void.TYPE);
            return;
        }
        this.f16941c.removeCallbacksAndMessages(null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16939a, false, 13073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16939a, false, 13073, new Class[0], Void.TYPE);
        } else if (!this.f16944f && this.f16942d != null) {
            this.f16941c.removeCallbacksAndMessages(null);
            if (this.f16943e == null) {
                this.f16943e = new a(c(), this.f16941c);
            } else {
                this.f16943e.f16946b = c();
            }
            this.f16941c.post(this.f16943e);
            this.f16944f = true;
        }
    }

    public final void a(com.bytedance.android.livesdk.rank.model.a aVar) {
        this.f16942d = aVar;
    }

    public final void handleMsg(Message message) {
        long j;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f16939a, false, 13072, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f16939a, false, 13072, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 100 && this.f16944f) {
            String str = (String) message2.obj;
            if (this.f16940b != null) {
                this.f16940b.a(str);
            }
            if (!TextUtils.equals(str, "00:00:00")) {
                this.f16941c.postDelayed(this.f16943e, 1000);
            } else {
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    this.f16944f = false;
                    if (PatchProxy.isSupport(new Object[0], this, f16939a, false, 13074, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f16939a, false, 13074, new Class[0], Void.TYPE);
                    } else if (!(this.f16942d == null || this.f16942d.f17020c == null || this.f16942d.f17020c.f17025b == null)) {
                        User user = this.f16942d.f17020c.f17025b;
                        h.a().a((Handler) this.f16941c, user.getId(), user.getLiveRoomId(), 12, 0);
                    }
                }
            }
        } else if (message2.what == 12 && !(message2.obj instanceof Exception)) {
            com.bytedance.android.live.core.network.response.b bVar = (com.bytedance.android.live.core.network.response.b) message2.obj;
            com.bytedance.android.livesdk.rank.model.a aVar = (com.bytedance.android.livesdk.rank.model.a) bVar.f7871b;
            if (aVar != null) {
                if (bVar.f7872c != null) {
                    j = bVar.f7872c.now;
                } else {
                    j = 0;
                }
                aVar.k = j;
                if (this.f16940b != null) {
                    this.f16940b.a(aVar);
                }
                this.f16942d = aVar;
                a();
            }
        }
    }

    public b(b.C0118b bVar, com.bytedance.android.livesdk.rank.model.a aVar) {
        this.f16940b = bVar;
        this.f16942d = aVar;
    }
}
