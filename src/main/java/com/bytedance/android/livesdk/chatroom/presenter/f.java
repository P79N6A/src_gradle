package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.model.p;
import com.bytedance.android.livesdk.chatroom.model.s;
import com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.message.model.l;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;

public final class f extends bx<a> implements WeakHandler.IHandler, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11349a;

    /* renamed from: b  reason: collision with root package name */
    public long f11350b;

    /* renamed from: c  reason: collision with root package name */
    public long f11351c;

    /* renamed from: d  reason: collision with root package name */
    public Disposable f11352d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11353e;

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f11354f;

    public interface a extends al {
        void a(p pVar);

        void a(l lVar);

        void a(com.bytedance.android.livesdk.rank.model.a aVar);
    }

    private boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f11349a, false, 5160, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f11349a, false, 5160, new Class[0], Boolean.TYPE)).booleanValue();
        }
        s sVar = (s) LiveSettingKeys.LIVE_RANK_CONFIG.a();
        if (sVar != null && sVar.f11162a) {
            z = true;
        }
        return z;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11349a, false, 5154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11349a, false, 5154, new Class[0], Void.TYPE);
            return;
        }
        this.f11354f.removeCallbacksAndMessages(null);
        super.d();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11349a, false, 5158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11349a, false, 5158, new Class[0], Void.TYPE);
        } else if (!this.f11353e && this.f11350b > 0) {
            h.a().a((Handler) this.f11354f, this.f11350b, this.f11351c, 12, 1);
            this.f11353e = true;
        }
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11349a, false, 5156, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11349a, false, 5156, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "receive_daily_rank_msg_and_not_show");
        hashMap.put("is_enable_location_rank", Boolean.valueOf(c()));
        hashMap.put("msg_type", String.valueOf(i));
        c.b().a("ttlive_msg", (Map<String, Object>) hashMap);
    }

    public final void handleMsg(Message message) {
        long j;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f11349a, false, 5157, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f11349a, false, 5157, new Class[]{Message.class}, Void.TYPE);
        } else if (12 == message2.what) {
            this.f11353e = false;
            if ((message2.obj instanceof b) && b() != null) {
                b bVar = (b) message2.obj;
                com.bytedance.android.livesdk.rank.model.a aVar = (com.bytedance.android.livesdk.rank.model.a) bVar.f7871b;
                if (bVar.f7872c != null) {
                    j = bVar.f7872c.now;
                } else {
                    j = 0;
                }
                aVar.k = j;
                ((a) b()).a(aVar);
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11349a, false, 5155, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11349a, false, 5155, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.livesdkapi.depend.f.a.DAILY_RANK.getIntType() == iMessage.getIntType() && b() != null) {
            l lVar = (l) iMessage;
            if (c()) {
                if (lVar.f16653f == 5 || lVar.f16653f == 6) {
                    ((a) b()).a(lVar);
                } else {
                    a(lVar.f16653f);
                }
            } else if (lVar.f16653f == 1) {
                ((a) b()).a(lVar);
            } else {
                a(lVar.f16653f);
            }
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11349a, false, 5153, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11349a, false, 5153, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (DailyRankWidget.b()) {
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DAILY_RANK.getIntType(), this);
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DAILY_REGION_RANK.getIntType(), this);
        }
        this.f11354f = new WeakHandler(this);
    }
}
