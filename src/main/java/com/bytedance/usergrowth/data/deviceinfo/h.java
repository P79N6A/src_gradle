package com.bytedance.usergrowth.data.deviceinfo;

import android.content.Context;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.bytedance.usergrowth.data.deviceinfo.DeviceInfo;
import com.bytedance.usergrowth.data.deviceinfo.f;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@WorkerThread
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f22871a = "h";

    /* renamed from: b  reason: collision with root package name */
    public final Context f22872b;

    /* renamed from: c  reason: collision with root package name */
    public final i f22873c;

    /* renamed from: d  reason: collision with root package name */
    public final f f22874d;

    /* renamed from: e  reason: collision with root package name */
    public final f f22875e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22876f = 10000;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22877a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22878b;

        /* renamed from: c  reason: collision with root package name */
        public AtomicBoolean f22879c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f22881e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f22882f;
        private boolean g;

        private DeviceInfo.DeviceParameter a() {
            String str;
            DeviceInfo.DeviceParameter.Builder newBuilder = DeviceInfo.DeviceParameter.newBuilder();
            try {
                long a2 = d.a(h.this.f22872b);
                newBuilder.setMemorySize(a2);
                newBuilder.setMemoryUsageSize(a2 - d.b(h.this.f22872b));
                if (Build.VERSION.SDK_INT >= 21) {
                    str = TextUtils.join(",", Build.SUPPORTED_ABIS);
                } else {
                    str = Build.CPU_ABI;
                }
                newBuilder.setCpuType(str);
                long b2 = g.b();
                long a3 = g.a();
                newBuilder.setDiskSize(b2);
                newBuilder.setDiskUsageSize(b2 - a3);
            } catch (Throwable unused) {
            }
            return newBuilder.build();
        }

        public final void run() {
            try {
                final DeviceInfo.CronUploadInfo.Builder newBuilder = DeviceInfo.CronUploadInfo.newBuilder();
                this.f22881e = h.this.f22875e.a(new f.b() {
                    public final void a() {
                        a(null);
                    }

                    public final void a(final SensorEvent sensorEvent) {
                        h.this.a(new Runnable() {
                            public final void run() {
                                DeviceInfo.Gyro gyro;
                                SensorEvent sensorEvent = sensorEvent;
                                boolean z = false;
                                if (sensorEvent == null) {
                                    gyro = null;
                                } else {
                                    float[] fArr = sensorEvent.values;
                                    DeviceInfo.Gyro.Builder newBuilder = DeviceInfo.Gyro.newBuilder();
                                    newBuilder.setX(fArr[0]);
                                    newBuilder.setY(fArr[1]);
                                    newBuilder.setZ(fArr[2]);
                                    gyro = newBuilder.build();
                                }
                                synchronized (this) {
                                    if (sensorEvent != null) {
                                        newBuilder.setGyro(gyro);
                                    }
                                    a.this.f22877a = true;
                                }
                                if (a.this.f22879c.get()) {
                                    a.this.a(newBuilder);
                                }
                                h hVar = h.this;
                                if (sensorEvent == null) {
                                    z = true;
                                }
                                hVar.a("gyroscope", z);
                            }
                        });
                    }
                }, h.this.f22876f);
                this.f22882f = h.this.f22874d.a(new f.b() {
                    public final void a() {
                        a(null);
                    }

                    public final void a(final SensorEvent sensorEvent) {
                        h.this.a(new Runnable() {
                            public final void run() {
                                DeviceInfo.Acceleration acceleration;
                                SensorEvent sensorEvent = sensorEvent;
                                boolean z = false;
                                if (sensorEvent == null) {
                                    acceleration = null;
                                } else {
                                    float[] fArr = sensorEvent.values;
                                    DeviceInfo.Acceleration.Builder newBuilder = DeviceInfo.Acceleration.newBuilder();
                                    newBuilder.setX(fArr[0]);
                                    newBuilder.setY(fArr[1]);
                                    newBuilder.setZ(fArr[2]);
                                    acceleration = newBuilder.build();
                                }
                                synchronized (this) {
                                    if (sensorEvent != null) {
                                        newBuilder.setAcceleration(acceleration);
                                    }
                                    a.this.f22878b = true;
                                }
                                if (a.this.f22879c.get()) {
                                    a.this.a(newBuilder);
                                }
                                h hVar = h.this;
                                if (sensorEvent == null) {
                                    z = true;
                                }
                                hVar.a("acceleration", z);
                            }
                        });
                    }
                }, h.this.f22876f);
                DeviceInfo.DeviceParameter a2 = a();
                synchronized (this) {
                    newBuilder.setDeviceParameter(a2);
                }
                this.f22879c.set(true);
                if (!this.f22881e && !this.f22882f) {
                    a(newBuilder);
                }
                if (!this.f22881e || !this.f22882f) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("Gyroscope", this.f22881e);
                    jSONObject.put("Gyroscope", this.f22882f);
                    i.c().a("ugd_sensor_enable", jSONObject);
                }
            } catch (Throwable th) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("stacktrace", Log.getStackTraceString(th));
                } catch (JSONException unused) {
                }
                i.c().a("weasel_cron_failed", jSONObject2);
            }
        }

        private a() {
            this.f22879c = new AtomicBoolean(false);
        }

        public final void a(DeviceInfo.CronUploadInfo.Builder builder) {
            DeviceInfo.CronUploadInfo build;
            if (this.f22881e && !this.f22877a) {
                return;
            }
            if ((!this.f22882f || this.f22878b) && !this.g) {
                this.g = true;
                synchronized (this) {
                    build = builder.build();
                }
                i.c();
                StringBuilder sb = new StringBuilder();
                sb.append(h.f22871a);
                sb.append(" => ");
                sb.append(build);
                byte[] byteArray = build.toByteArray();
                try {
                    String optString = new JSONObject(i.b().a(com.bytedance.usergrowth.data.a.a.a("/weasel/v1/cron/"), TTEncryptUtils.a(byteArray, byteArray.length), true, false, "text/plain;charset=utf-8")).optString("msg");
                    i.c();
                    new StringBuilder("/weasel/v1/cron/ 返回 :").append(optString);
                } catch (Exception e2) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stacktrace", Log.getStackTraceString(e2));
                    } catch (JSONException unused) {
                    }
                    i.c().a("weasel_cron_failed", jSONObject);
                }
            }
        }

        /* synthetic */ a(h hVar, byte b2) {
            this();
        }
    }

    public final void a(Runnable runnable) {
        i.a().execute(runnable);
    }

    public final void a(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("timeout", z);
        } catch (JSONException unused) {
        }
        i.c().a("ugd_sensor_result", jSONObject);
    }

    h(Context context, long j, i iVar, Handler handler) {
        this.f22872b = context;
        this.f22873c = iVar;
        this.f22875e = new f(this.f22872b, handler, 4);
        this.f22874d = new f(this.f22872b, handler, 1);
    }
}
