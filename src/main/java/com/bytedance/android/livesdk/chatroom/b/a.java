package com.bytedance.android.livesdk.chatroom.b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.message.model.e;
import com.bytedance.android.livesdk.message.model.p;
import com.bytedance.android.livesdk.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashSet;
import java.util.Set;

public final class a implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9755a;

    /* renamed from: b  reason: collision with root package name */
    public long f9756b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<C0081a> f9757c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public long f9758d;

    /* renamed from: e  reason: collision with root package name */
    public long f9759e;

    /* renamed from: f  reason: collision with root package name */
    public long f9760f;
    public long g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.b.a$a  reason: collision with other inner class name */
    public interface C0081a {
        void a(com.bytedance.android.livesdkapi.depend.f.a aVar, long j);
    }

    public a() {
        IMessageManager a2 = ab.a();
        a2.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.GIFT.getIntType(), this);
        a2.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.CHAT.getIntType(), this);
        a2.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.DIGG.getIntType(), this);
        a2.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.MEMBER.getIntType(), this);
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f9755a, true, 4043, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f9755a, true, 4043, new Class[0], Boolean.TYPE)).booleanValue();
        }
        TTLiveSDKContext.getHostService().b();
        return false;
    }

    private boolean a(long j) {
        if (j == this.f9756b) {
            return true;
        }
        return false;
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f9755a, false, 4047, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f9755a, false, 4047, new Class[]{IMessage.class}, Void.TYPE);
        } else if (a()) {
            switch (((c) iMessage).getMessageType()) {
                case GIFT:
                    if (a(((com.bytedance.android.livesdk.message.model.ab) iMessage).f16430b.getId())) {
                        this.f9758d++;
                        a(com.bytedance.android.livesdkapi.depend.f.a.GIFT, this.f9758d);
                        return;
                    }
                    break;
                case DIGG:
                    User user = ((p) iMessage).f16668e;
                    if (user != null && a(user.getId())) {
                        this.f9760f++;
                        a(com.bytedance.android.livesdkapi.depend.f.a.DIGG, this.f9760f);
                        return;
                    }
                case CHAT:
                    if (a(((e) iMessage).f16615d.getId())) {
                        this.f9759e++;
                        a(com.bytedance.android.livesdkapi.depend.f.a.CHAT, this.f9759e);
                        return;
                    }
                    break;
                case MEMBER:
                    User user2 = ((as) iMessage).f16486c;
                    if (user2 != null && a(user2.getId())) {
                        this.g++;
                        a(com.bytedance.android.livesdkapi.depend.f.a.MEMBER, this.g);
                        break;
                    }
            }
        }
    }

    public void a(com.bytedance.android.livesdkapi.depend.f.a aVar, long j) {
        com.bytedance.android.livesdkapi.depend.f.a aVar2 = aVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aVar2, new Long(j2)}, this, f9755a, false, 4048, new Class[]{com.bytedance.android.livesdkapi.depend.f.a.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, new Long(j2)}, this, f9755a, false, 4048, new Class[]{com.bytedance.android.livesdkapi.depend.f.a.class, Long.TYPE}, Void.TYPE);
            return;
        }
        for (C0081a a2 : this.f9757c) {
            a2.a(aVar2, j2);
        }
    }
}
