package com.swmansion.gesturehandler.react;

import android.support.v4.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import javax.annotation.Nullable;

public final class b extends Event<b> {

    /* renamed from: a  reason: collision with root package name */
    private static final Pools.SynchronizedPool<b> f78813a = new Pools.SynchronizedPool<>(7);

    /* renamed from: b  reason: collision with root package name */
    private WritableMap f78814b;

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "onGestureHandlerEvent";
    }

    private b() {
    }

    public final void onDispose() {
        this.f78814b = null;
        f78813a.release(this);
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f78814b);
    }

    public static b a(com.swmansion.gesturehandler.b bVar, @Nullable c cVar) {
        b bVar2 = (b) f78813a.acquire();
        if (bVar2 == null) {
            bVar2 = new b();
        }
        super.init(bVar.f78773f.getId());
        bVar2.f78814b = Arguments.createMap();
        if (cVar != null) {
            cVar.a(bVar, bVar2.f78814b);
        }
        bVar2.f78814b.putInt("handlerTag", bVar.f78772e);
        bVar2.f78814b.putInt("state", bVar.g);
        return bVar2;
    }
}
