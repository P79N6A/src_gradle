package com.ss.android.ugc.aweme.poi.rn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends Event<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60286a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60287b;

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "topChange";
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        RCTEventEmitter rCTEventEmitter2 = rCTEventEmitter;
        if (PatchProxy.isSupport(new Object[]{rCTEventEmitter2}, this, f60286a, false, 65610, new Class[]{RCTEventEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rCTEventEmitter2}, this, f60286a, false, 65610, new Class[]{RCTEventEmitter.class}, Void.TYPE);
            return;
        }
        int viewTag = getViewTag();
        String eventName = getEventName();
        if (PatchProxy.isSupport(new Object[0], this, f60286a, false, 65611, new Class[0], WritableMap.class)) {
            writableMap = (WritableMap) PatchProxy.accessDispatch(new Object[0], this, f60286a, false, 65611, new Class[0], WritableMap.class);
        } else {
            writableMap = Arguments.createMap();
            writableMap.putString("state", this.f60287b);
        }
        rCTEventEmitter2.receiveEvent(viewTag, eventName, writableMap);
    }

    a(int i, String str) {
        super(i);
        this.f60287b = str;
    }
}
