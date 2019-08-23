package com.bytedance.common.utility.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class ShakeDetector implements SensorEventListener {
    private float mAccel;
    private float mAccelCurrent;
    private float mAccelLast;
    RingBuffer mBuffer;
    private long mLastShakeTime;
    private long mLastTime;
    private OnShakeListener mListener;
    Sensor mSensor;
    SensorManager mSensorMgr;

    public interface OnShakeListener {
        void onShake();
    }

    static class RingBuffer {
        final float[] mAccelRing = new float[this.mSize];
        int mIndex;
        int mSize;
        final long[] mStampRing = new long[this.mSize];

        /* access modifiers changed from: package-private */
        public void clear() {
            this.mIndex = 0;
            for (int i = 0; i < this.mSize; i++) {
                this.mStampRing[i] = 0;
            }
        }

        RingBuffer(int i) {
            this.mSize = i;
        }

        /* access modifiers changed from: package-private */
        public boolean levelReached(long j) {
            boolean z;
            int i = this.mIndex;
            long j2 = 0;
            long j3 = 0;
            int i2 = 0;
            boolean z2 = true;
            for (int i3 = 0; i3 < this.mSize; i3++) {
                i--;
                if (i < 0) {
                    i = this.mSize - 1;
                }
                long j4 = this.mStampRing[i];
                if (j4 <= 0 || j - j4 > 1000) {
                    return false;
                }
                if (j2 > 0 && j2 - j4 > 800) {
                    return false;
                }
                if (j3 > 0 && j3 - j4 > 500) {
                    return false;
                }
                float f2 = this.mAccelRing[i];
                if (Math.abs(f2) >= 2.0f) {
                    if (f2 > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 == 0 || z != z2) {
                        i2++;
                        j2 = j4;
                    } else {
                        z = z2;
                    }
                    if (i2 >= 3) {
                        return true;
                    }
                    z2 = z;
                    j3 = j4;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void add(float f2, long j) {
            this.mAccelRing[this.mIndex] = f2;
            this.mStampRing[this.mIndex] = j;
            this.mIndex = (this.mIndex + 1) % this.mSize;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor != null && sensorEvent.sensor.getType() == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastShakeTime >= 1500 && currentTimeMillis - this.mLastTime > 100) {
                this.mLastTime = currentTimeMillis;
                float f2 = sensorEvent.values[0];
                float f3 = sensorEvent.values[1];
                float f4 = sensorEvent.values[2];
                this.mAccelLast = this.mAccelCurrent;
                this.mAccelCurrent = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3) + (f4 * f4)));
                this.mAccel = (this.mAccel * 0.9f) + (this.mAccelCurrent - this.mAccelLast);
                this.mBuffer.add(this.mAccel, currentTimeMillis);
                if (Math.abs(this.mAccel) > 2.0f && this.mBuffer.levelReached(currentTimeMillis)) {
                    this.mBuffer.clear();
                    this.mLastShakeTime = currentTimeMillis;
                    if (this.mListener != null) {
                        this.mListener.onShake();
                    }
                }
            }
        }
    }

    public ShakeDetector(Context context, OnShakeListener onShakeListener) {
    }
}
