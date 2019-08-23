package com.facebook.react.uimanager.events;

import android.support.v4.util.Pools;
import android.view.MotionEvent;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.SoftAssertions;
import javax.annotation.Nullable;

public class TouchEvent extends Event<TouchEvent> {
    private static final Pools.SynchronizedPool<TouchEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(3);
    private short mCoalescingKey;
    @Nullable
    private MotionEvent mMotionEvent;
    @Nullable
    private TouchEventType mTouchEventType;
    private float mViewX;
    private float mViewY;

    private TouchEvent() {
    }

    public short getCoalescingKey() {
        return this.mCoalescingKey;
    }

    public float getViewX() {
        return this.mViewX;
    }

    public float getViewY() {
        return this.mViewY;
    }

    public MotionEvent getMotionEvent() {
        a.b(this.mMotionEvent);
        return this.mMotionEvent;
    }

    public String getEventName() {
        return ((TouchEventType) a.b(this.mTouchEventType)).getJSEventName();
    }

    public void onDispose() {
        ((MotionEvent) a.b(this.mMotionEvent)).recycle();
        this.mMotionEvent = null;
        EVENTS_POOL.release(this);
    }

    public boolean canCoalesce() {
        switch ((TouchEventType) a.b(this.mTouchEventType)) {
            case START:
            case END:
            case CANCEL:
                return false;
            case MOVE:
                return true;
            default:
                throw new RuntimeException("Unknown touch event type: " + this.mTouchEventType);
        }
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        TouchesHelper.sendTouchEvent(rCTEventEmitter, (TouchEventType) a.b(this.mTouchEventType), getViewTag(), this);
    }

    public static TouchEvent obtain(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f2, float f3, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        TouchEvent touchEvent = (TouchEvent) EVENTS_POOL.acquire();
        if (touchEvent == null) {
            touchEvent = new TouchEvent();
        }
        touchEvent.init(i, touchEventType, motionEvent, j, f2, f3, touchEventCoalescingKeyHelper);
        return touchEvent;
    }

    private void init(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f2, float f3, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        boolean z;
        super.init(i);
        short s = 0;
        if (j != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        SoftAssertions.assertCondition(z, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                touchEventCoalescingKeyHelper.addCoalescingKey(j);
                break;
            case 1:
                touchEventCoalescingKeyHelper.removeCoalescingKey(j);
                break;
            case 2:
                s = touchEventCoalescingKeyHelper.getCoalescingKey(j);
                break;
            case 3:
                touchEventCoalescingKeyHelper.removeCoalescingKey(j);
                break;
            case 5:
            case 6:
                touchEventCoalescingKeyHelper.incrementCoalescingKey(j);
                break;
            default:
                throw new RuntimeException("Unhandled MotionEvent action: " + action);
        }
        this.mTouchEventType = touchEventType;
        this.mMotionEvent = MotionEvent.obtain(motionEvent);
        this.mCoalescingKey = s;
        this.mViewX = f2;
        this.mViewY = f3;
    }
}
