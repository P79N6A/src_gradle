package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;
import javax.annotation.Nullable;

public class EventAnimationDriver implements RCTEventEmitter {
    private List<String> mEventPath;
    ValueAnimatedNode mValueNode;

    public EventAnimationDriver(List<String> list, ValueAnimatedNode valueAnimatedNode) {
        this.mEventPath = list;
        this.mValueNode = valueAnimatedNode;
    }

    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }

    public void receiveEvent(int i, String str, @Nullable WritableMap writableMap) {
        if (writableMap != null) {
            int i2 = 0;
            ReadableMap readableMap = writableMap;
            while (i2 < this.mEventPath.size() - 1) {
                i2++;
                readableMap = readableMap.getMap(this.mEventPath.get(i2));
            }
            this.mValueNode.mValue = readableMap.getDouble(this.mEventPath.get(this.mEventPath.size() - 1));
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }
}