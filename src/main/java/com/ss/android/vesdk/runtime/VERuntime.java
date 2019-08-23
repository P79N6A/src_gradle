package com.ss.android.vesdk.runtime;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.annotation.NonNull;
import com.bef.effectsdk.b;
import com.ss.android.ttve.monitor.IMonitor;
import com.ss.android.ttve.monitor.e;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.g;
import com.ss.android.vesdk.runtime.cloudconfig.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class VERuntime {

    /* renamed from: a  reason: collision with root package name */
    public Context f78079a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78080b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f78081c;

    /* renamed from: d  reason: collision with root package name */
    public e f78082d;

    /* renamed from: e  reason: collision with root package name */
    public c f78083e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f78084f;
    public g g;
    public boolean h;
    public boolean i;
    public WeakReference<VEListener.n> j;
    public IMonitor k;
    public com.ss.android.vesdk.runtime.a.a l;
    private boolean m;

    enum a {
        INSTANCE;
        
        private VERuntime veRuntime;

        public final VERuntime getInstance() {
            return this.veRuntime;
        }
    }

    public native void nativeEnableHDH264HWDecoder(boolean z, int i2);

    public native void nativeEnableTT265Decoder(boolean z);

    public native void nativeSetVideoEncodeSetting(VEVideoEncodeSettings vEVideoEncodeSettings);

    @NonNull
    public static VERuntime a() {
        return a.INSTANCE.getInstance();
    }

    private VERuntime() {
        this.k = new IMonitor() {
            public final void monitorLog(String str, JSONObject jSONObject) {
                if (VERuntime.this.j != null && VERuntime.this.j.get() != null) {
                    ((VEListener.n) VERuntime.this.j.get()).a(str, jSONObject);
                }
            }
        };
    }

    public void b() {
        if (this.f78080b) {
            try {
                d.a();
            } catch (Exception unused) {
            }
        }
        new Thread() {
            public final void run() {
                boolean z;
                String str;
                boolean z2;
                String str2;
                boolean z3;
                String str3;
                boolean z4;
                String str4;
                System.currentTimeMillis();
                boolean z5 = false;
                if (VERuntime.this.f78080b) {
                    new d.a((byte) 0).execute(new Void[0]);
                }
                try {
                    com.ss.android.ttve.monitor.a.a(VERuntime.this.f78079a);
                    if (!((Boolean) com.ss.android.vesdk.runtime.a.a.a().b("sensor_reported", Boolean.FALSE)).booleanValue()) {
                        Context context = VERuntime.this.f78079a;
                        HashMap hashMap = new HashMap();
                        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                        if (defaultSensor != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hashMap.put("te_sensor_type_gyroscope_exist", Boolean.valueOf(z));
                        String str5 = null;
                        if (defaultSensor != null) {
                            str = defaultSensor.getName();
                        } else {
                            str = null;
                        }
                        hashMap.put("te_sensor_type_gyroscope_name", str);
                        Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                        if (defaultSensor2 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hashMap.put("te_sensor_type_game_rotation_vector_exist", Boolean.valueOf(z2));
                        if (defaultSensor2 != null) {
                            str2 = defaultSensor2.getName();
                        } else {
                            str2 = null;
                        }
                        hashMap.put("te_sensor_type_game_rotation_vector_name", str2);
                        Sensor defaultSensor3 = sensorManager.getDefaultSensor(11);
                        if (defaultSensor3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        hashMap.put("te_sensor_type_rotation_vector_exist", Boolean.valueOf(z3));
                        if (defaultSensor3 != null) {
                            str3 = defaultSensor3.getName();
                        } else {
                            str3 = null;
                        }
                        hashMap.put("te_sensor_type_rotation_vector_name", str3);
                        Sensor defaultSensor4 = sensorManager.getDefaultSensor(9);
                        if (defaultSensor4 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        hashMap.put("te_sensor_type_gravity_exist", Boolean.valueOf(z4));
                        if (defaultSensor4 != null) {
                            str4 = defaultSensor4.getName();
                        } else {
                            str4 = null;
                        }
                        hashMap.put("te_sensor_type_gravity_name", str4);
                        Sensor defaultSensor5 = sensorManager.getDefaultSensor(1);
                        if (defaultSensor5 != null) {
                            z5 = true;
                        }
                        hashMap.put("te_sensor_type_accelerometer_exist", Boolean.valueOf(z5));
                        if (defaultSensor5 != null) {
                            str5 = defaultSensor5.getName();
                        }
                        hashMap.put("te_sensor_type_accelerometer_name", str5);
                        e.a("iesve_veeditor_sensor_report", "iesve_veeditor_sensor_report", (Map) hashMap);
                        com.ss.android.vesdk.runtime.a.a.a().a("sensor_reported", Boolean.TRUE);
                    }
                } catch (Exception unused) {
                }
                com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
                aVar.a("iesve_vesdk_init_finish_result", "success");
                aVar.a("iesve_vesdk_init_finish_reason", "null");
                com.ss.android.ttve.monitor.d.a("iesve_vesdk_init_finish", 1, aVar);
            }
        }.start();
    }

    /* synthetic */ VERuntime(byte b2) {
        this();
    }

    public final boolean a(@NonNull b bVar) {
        com.ss.android.vesdk.d.a(bVar);
        VEEffectConfig.setResourceFinder(bVar);
        this.f78081c = false;
        this.m = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }
}
