package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.view.c;
import com.bytedance.android.livesdk.floatwindow.ui.GameMsgView;
import com.bytedance.android.livesdk.message.model.bg;
import com.bytedance.android.livesdk.message.model.i;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;

public final class bw extends bx<c> implements WeakHandler.IHandler, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11331a;

    /* renamed from: b  reason: collision with root package name */
    private WeakHandler f11332b = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f11333c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bw$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11334a = new int[a.values().length];

        static {
            try {
                f11334a[a.USER_SEQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11331a, false, 5331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11331a, false, 5331, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f11332b = new WeakHandler(Looper.getMainLooper(), this);
        this.f11333c = false;
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f11331a, false, 5333, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f11331a, false, 5333, new Class[]{c.class}, Void.TYPE);
            return;
        }
        super.a(cVar);
        this.y.addMessageListener(a.USER_SEQ.getIntType(), this);
    }

    public final void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f11331a, false, 5332, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f11331a, false, 5332, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        int i = message2.what;
        if (b() != null) {
            if (i == 24) {
                if (message2.obj instanceof Exception) {
                    b();
                    Object obj = message2.obj;
                } else if (message2.obj instanceof b) {
                    b bVar = (b) message2.obj;
                    if (bVar.f7871b instanceof CurrentRankListResponse) {
                        CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) bVar.f7871b;
                        int i2 = (int) currentRankListResponse.total;
                        GameMsgView.a(i2);
                        ((c) b()).a(i2);
                        if (!CollectionUtils.isEmpty(currentRankListResponse.ranks) || !CollectionUtils.isEmpty(currentRankListResponse.seats)) {
                            ((c) b()).a(currentRankListResponse.seats, currentRankListResponse.ranks);
                        } else {
                            return;
                        }
                    }
                }
                this.f11333c = false;
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f11331a, false, 5334, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f11331a, false, 5334, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (b() != null && iMessage2 != null && (iMessage2 instanceof com.bytedance.android.livesdk.message.model.c) && AnonymousClass1.f11334a[((com.bytedance.android.livesdk.message.model.c) iMessage2).getMessageType().ordinal()] == 1 && (iMessage2 instanceof bg)) {
            bg bgVar = (bg) iMessage2;
            int i = (int) bgVar.f16561b;
            GameMsgView.a(i);
            ((c) b()).a(i);
            if (bgVar.f16562c != null || i >= 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!CollectionUtils.isEmpty(bgVar.f16564e)) {
                    for (i next : bgVar.f16564e) {
                        if (next != null) {
                            com.bytedance.android.livesdk.rank.model.b bVar = new com.bytedance.android.livesdk.rank.model.b();
                            bVar.f17025b = next.f16632a;
                            bVar.f17026c = next.f16633b;
                            bVar.f17027d = (int) next.f16634c;
                            bVar.f17029f = next.f16635d;
                            arrayList2.add(bVar);
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(bgVar.f16562c)) {
                    for (i next2 : bgVar.f16562c) {
                        if (next2 != null) {
                            com.bytedance.android.livesdk.rank.model.b bVar2 = new com.bytedance.android.livesdk.rank.model.b();
                            bVar2.f17025b = next2.f16632a;
                            bVar2.f17026c = next2.f16633b;
                            bVar2.f17027d = (int) next2.f16634c;
                            bVar2.f17029f = next2.f16635d;
                            arrayList.add(bVar2);
                        }
                    }
                }
                ((c) b()).a(arrayList2, arrayList);
            }
        }
    }

    public final void a(long j, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), 18}, this, f11331a, false, 5330, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), 18}, this, f11331a, false, 5330, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.f11333c) {
            this.f11333c = true;
            h.a().a(this.f11332b, j, j2, 18);
        }
    }
}
