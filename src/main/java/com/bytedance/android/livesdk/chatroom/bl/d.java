package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.message.model.x;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayDeque;
import java.util.Queue;

public enum d {
    INSTANCE;
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.bytedance.android.livesdk.chatroom.event.a bigGiftPlayStateEvent;
    private Runnable followGuideRunnable;
    private boolean isCurrentWindowFocus;
    private Handler mainHandler;
    private boolean sIsBusy;
    private boolean sIsRunning;
    private a sMessageCallback;
    private Queue<com.bytedance.android.livesdkapi.h.a> sMessageQueue;

    public interface a {
        void a(com.bytedance.android.livesdkapi.h.a aVar);
    }

    private boolean canConsumeFollowGuideMessage() {
        if (!this.isCurrentWindowFocus || (this.bigGiftPlayStateEvent != null && !this.bigGiftPlayStateEvent.f10125b)) {
            return false;
        }
        return true;
    }

    public final void onMessageFinish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3973, new Class[0], Void.TYPE);
            return;
        }
        this.sIsBusy = false;
        next();
    }

    public final void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3974, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3974, new Class[0], Void.TYPE);
            return;
        }
        this.sMessageCallback = null;
        this.sMessageQueue = null;
        this.sIsRunning = false;
        this.sIsBusy = false;
        if (this.mainHandler != null) {
            this.mainHandler.removeCallbacksAndMessages(null);
        }
        this.mainHandler = null;
        this.followGuideRunnable = null;
    }

    private void next() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3971, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3971, new Class[0], Void.TYPE);
        } else if (this.sMessageQueue != null && this.sMessageQueue.size() > 0 && this.sMessageCallback != null && this.sIsRunning && !this.sIsBusy) {
            this.sIsBusy = true;
            this.sMessageCallback.a(this.sMessageQueue.poll());
        }
    }

    public final void setCurrentWindowFocus(boolean z) {
        this.isCurrentWindowFocus = z;
    }

    public final void start(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 3967, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 3967, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.sMessageCallback = aVar;
        this.sMessageQueue = new ArrayDeque();
        this.sIsRunning = true;
        this.sIsBusy = false;
    }

    private boolean hasFollowed(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, this, changeQuickRedirect, false, 3972, new Class[]{Room.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{room}, this, changeQuickRedirect, false, 3972, new Class[]{Room.class}, Boolean.TYPE)).booleanValue();
        } else if (room == null) {
            return false;
        } else {
            long j = room.getOwner().getFollowInfo().f7764d;
            if (j == 1 || j == 2) {
                return true;
            }
            return false;
        }
    }

    public final void add(com.bytedance.android.livesdkapi.h.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 3970, new Class[]{com.bytedance.android.livesdkapi.h.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 3970, new Class[]{com.bytedance.android.livesdkapi.h.a.class}, Void.TYPE);
        } else if (this.sIsRunning && aVar != null && this.sMessageQueue != null) {
            this.sMessageQueue.offer(aVar);
            next();
        }
    }

    /* renamed from: addFollowGuideMessage */
    public final void lambda$addFollowGuideMessage$1$PlatformMessageHelper(Room room, com.bytedance.android.livesdkapi.h.a aVar) {
        if (PatchProxy.isSupport(new Object[]{room, aVar}, this, changeQuickRedirect, false, 3969, new Class[]{Room.class, com.bytedance.android.livesdkapi.h.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room, aVar}, this, changeQuickRedirect, false, 3969, new Class[]{Room.class, com.bytedance.android.livesdkapi.h.a.class}, Void.TYPE);
        } else if (aVar instanceof x) {
            if (hasFollowed(room)) {
                if (this.mainHandler != null) {
                    this.mainHandler.removeCallbacksAndMessages(null);
                }
                this.followGuideRunnable = null;
                onMessageFinish();
                return;
            }
            x xVar = (x) aVar;
            if (this.sIsRunning && this.sMessageQueue != null) {
                if (this.mainHandler == null) {
                    this.mainHandler = new Handler(Looper.getMainLooper());
                }
                if (this.followGuideRunnable == null) {
                    this.followGuideRunnable = new e(this, room, xVar);
                }
                if (!canConsumeFollowGuideMessage()) {
                    this.mainHandler.postDelayed(new f(this, room, aVar), 2000);
                } else {
                    this.mainHandler.postDelayed(this.followGuideRunnable, 500);
                }
            }
        }
    }

    public final void setBigGiftPlayStateEvent(boolean z, boolean z2, com.bytedance.android.livesdk.gift.effect.b.a aVar) {
        boolean z3 = z;
        boolean z4 = z2;
        com.bytedance.android.livesdk.gift.effect.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), aVar2}, this, changeQuickRedirect, false, 3968, new Class[]{Boolean.TYPE, Boolean.TYPE, com.bytedance.android.livesdk.gift.effect.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), aVar2}, this, changeQuickRedirect, false, 3968, new Class[]{Boolean.TYPE, Boolean.TYPE, com.bytedance.android.livesdk.gift.effect.b.a.class}, Void.TYPE);
            return;
        }
        if (this.bigGiftPlayStateEvent == null) {
            this.bigGiftPlayStateEvent = new com.bytedance.android.livesdk.chatroom.event.a(z3, z4, aVar2);
        }
        this.bigGiftPlayStateEvent.f10124a = z3;
        this.bigGiftPlayStateEvent.f10125b = z4;
        this.bigGiftPlayStateEvent.f10126c = aVar2;
    }
}
