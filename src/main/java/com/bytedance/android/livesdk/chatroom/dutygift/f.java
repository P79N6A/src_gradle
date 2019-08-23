package com.bytedance.android.livesdk.chatroom.dutygift;

import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.message.model.u;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.a.b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public class f extends b<a> implements OnMessageListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f9987b;

    /* renamed from: a  reason: collision with root package name */
    private DataCenter f9988a;

    /* renamed from: c  reason: collision with root package name */
    protected Room f9989c;

    /* renamed from: d  reason: collision with root package name */
    private IMessageManager f9990d;

    public interface a extends com.bytedance.ies.a.a {
        void c(DutyGiftInfo dutyGiftInfo);

        void d(DutyGiftInfo dutyGiftInfo);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f9987b, false, 4126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9987b, false, 4126, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f9990d.removeMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DUTY_GIFT_MESSAGE.getIntType(), this);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f9987b, false, 4125, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f9987b, false, 4125, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f9990d = (IMessageManager) this.f9988a.get("data_message_manager");
        this.f9990d.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DUTY_GIFT_MESSAGE.getIntType(), this);
        if (PatchProxy.isSupport(new Object[0], this, f9987b, false, 4127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9987b, false, 4127, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f9989c == null || this.f9989c.getOwner() == null)) {
            j.q().d().h().dutyGiftRequest(this.f9989c.getId(), this.f9989c.getOwner().getId(), 1, false).compose(i.a()).subscribe(new g(this), new h(this));
        }
    }

    public void onMessage(IMessage iMessage) {
        DutyGiftInfo dutyGiftInfo;
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f9987b, false, 4128, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f9987b, false, 4128, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (b() != null && (iMessage2 instanceof u)) {
            u uVar = (u) iMessage2;
            a aVar = (a) b();
            if (PatchProxy.isSupport(new Object[]{uVar}, this, f9987b, false, 4129, new Class[]{u.class}, DutyGiftInfo.class)) {
                dutyGiftInfo = (DutyGiftInfo) PatchProxy.accessDispatch(new Object[]{uVar}, this, f9987b, false, 4129, new Class[]{u.class}, DutyGiftInfo.class);
            } else {
                DutyGiftInfo dutyGiftInfo2 = new DutyGiftInfo();
                dutyGiftInfo2.setGiftId((long) uVar.f16685b);
                dutyGiftInfo2.setTargetScore((long) uVar.f16686c);
                dutyGiftInfo2.setStageCount((long) uVar.f16687d);
                dutyGiftInfo2.setStatus(uVar.f16688e);
                dutyGiftInfo2.setScore((long) uVar.f16689f);
                dutyGiftInfo2.setMvpUser(uVar.g);
                dutyGiftInfo2.setDutyId(uVar.h);
                dutyGiftInfo = dutyGiftInfo2;
            }
            aVar.d(dutyGiftInfo);
        }
    }

    public f(Room room, DataCenter dataCenter) {
        this.f9989c = room;
        this.f9988a = dataCenter;
    }
}
