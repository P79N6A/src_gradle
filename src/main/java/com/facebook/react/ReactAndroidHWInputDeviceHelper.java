package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import java.util.Map;

public class ReactAndroidHWInputDeviceHelper {
    private static final Map<Integer, String> KEY_EVENTS_ACTIONS = MapBuilder.of(23, "select", 66, "select", 62, "select", 85, "playPause", 89, "rewind", 90, "fastForward");
    private int mLastFocusedViewId = -1;
    private final ReactRootView mReactRootView;

    public void clearFocus() {
        if (this.mLastFocusedViewId != -1) {
            dispatchEvent("blur", this.mLastFocusedViewId);
        }
        this.mLastFocusedViewId = -1;
    }

    ReactAndroidHWInputDeviceHelper(ReactRootView reactRootView) {
        this.mReactRootView = reactRootView;
    }

    public void handleKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 1 && KEY_EVENTS_ACTIONS.containsKey(Integer.valueOf(keyCode))) {
            dispatchEvent(KEY_EVENTS_ACTIONS.get(Integer.valueOf(keyCode)), this.mLastFocusedViewId);
        }
    }

    public void onFocusChanged(View view) {
        if (this.mLastFocusedViewId != view.getId()) {
            if (this.mLastFocusedViewId != -1) {
                dispatchEvent("blur", this.mLastFocusedViewId);
            }
            this.mLastFocusedViewId = view.getId();
            dispatchEvent("focus", view.getId());
        }
    }

    private void dispatchEvent(String str, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.mReactRootView.sendEvent("onHWKeyEvent", writableNativeMap);
    }
}
