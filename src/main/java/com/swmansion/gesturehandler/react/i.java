package com.swmansion.gesturehandler.react;

import android.support.v4.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.b;
import javax.annotation.Nullable;

public final class i extends Event<i> {

    /* renamed from: a  reason: collision with root package name */
    static final Pools.SynchronizedPool<i> f78829a = new Pools.SynchronizedPool<>(7);

    /* renamed from: b  reason: collision with root package name */
    private WritableMap f78830b;

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "onGestureHandlerStateChange";
    }

    i() {
    }

    public final void onDispose() {
        this.f78830b = null;
        f78829a.release(this);
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerStateChange", this.f78830b);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, int i, int i2, @Nullable c cVar) {
        super.init(bVar.f78773f.getId());
        this.f78830b = Arguments.createMap();
        if (cVar != null) {
            cVar.a(bVar, this.f78830b);
        }
        this.f78830b.putInt("handlerTag", bVar.f78772e);
        this.f78830b.putInt("state", i);
        this.f78830b.putInt("oldState", i2);
    }
}
