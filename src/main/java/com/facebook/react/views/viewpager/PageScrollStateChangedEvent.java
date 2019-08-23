package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class PageScrollStateChangedEvent extends Event<PageScrollStateChangedEvent> {
    private final String mPageScrollState;

    public String getEventName() {
        return "topPageScrollStateChanged";
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.mPageScrollState);
        return createMap;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    protected PageScrollStateChangedEvent(int i, String str) {
        super(i);
        this.mPageScrollState = str;
    }
}