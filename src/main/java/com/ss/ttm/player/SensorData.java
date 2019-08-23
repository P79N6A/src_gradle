package com.ss.ttm.player;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SensorData implements SensorEventListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float[] accel = new float[3];
    private long mHandle;
    private SensorManager mSensorManager;
    private float[] magnet = new float[3];

    private static final native void _writeData(long j, int i, float f2, float f3, float f4);

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void finalize() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90725, new Class[0], Void.TYPE);
            return;
        }
        stop();
    }

    public Boolean initListeners() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90726, new Class[0], Boolean.class)) {
            return Boolean.valueOf(this.mSensorManager.registerListener(this, this.mSensorManager.getDefaultSensor(11), 0));
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90726, new Class[0], Boolean.class);
    }

    public int start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90730, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90730, new Class[0], Integer.TYPE)).intValue();
        } else if (initListeners().booleanValue()) {
            return 0;
        } else {
            return -1;
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90729, new Class[0], Void.TYPE);
            return;
        }
        if (this.mSensorManager != null) {
            this.mSensorManager.unregisterListener(this);
            this.mSensorManager = null;
        }
        this.mHandle = 0;
    }

    @SuppressLint({"NewApi"})
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        if (PatchProxy.isSupport(new Object[]{sensorEvent2}, this, changeQuickRedirect, false, 90727, new Class[]{SensorEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sensorEvent2}, this, changeQuickRedirect, false, 90727, new Class[]{SensorEvent.class}, Void.TYPE);
            return;
        }
        int type = sensorEvent2.sensor.getType();
        if (type != 4) {
            if (type != 11) {
                switch (type) {
                    case 1:
                        System.arraycopy(sensorEvent2.values, 0, this.accel, 0, 3);
                        if (this.accel[0] >= 0.001f || this.accel[1] >= 0.001f || this.accel[2] >= 0.001f) {
                            _writeData(this.mHandle, 1, this.accel[0], this.accel[1], this.accel[2]);
                            return;
                        }
                    case 2:
                        System.arraycopy(sensorEvent2.values, 0, this.magnet, 0, 3);
                        _writeData(this.mHandle, 2, this.magnet[0], this.magnet[1], this.magnet[2]);
                        return;
                }
            } else {
                _writeData(this.mHandle, 3, sensorEvent2.values[0], sensorEvent2.values[1], sensorEvent2.values[2]);
            }
        }
    }

    public void setHandle(long j, TTPlayer tTPlayer) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j), tTPlayer}, this, changeQuickRedirect, false, 90728, new Class[]{Long.TYPE, TTPlayer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j), tTPlayer}, this, changeQuickRedirect, false, 90728, new Class[]{Long.TYPE, TTPlayer.class}, Void.TYPE);
            return;
        }
        this.mHandle = j2;
        this.mSensorManager = (SensorManager) tTPlayer.getContext().getSystemService("sensor");
    }
}
