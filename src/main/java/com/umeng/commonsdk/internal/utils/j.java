package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.q.c;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f80783c = false;

    /* renamed from: d  reason: collision with root package name */
    private static HandlerThread f80784d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Context f80785e = null;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static int f80786f = 0;
    /* access modifiers changed from: private */
    public static int g = 0;
    private static int h = 0;
    /* access modifiers changed from: private */
    public static int i = 1;
    /* access modifiers changed from: private */
    public static long j;
    /* access modifiers changed from: private */
    public static long k;
    /* access modifiers changed from: private */
    public static SensorManager n;
    /* access modifiers changed from: private */
    public static ArrayList<float[]> o = new ArrayList<>();
    /* access modifiers changed from: private */
    public static SensorEventListener p = new SensorEventListener() {
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (j.g < 15) {
                j.c();
                return;
            }
            if (j.f80786f < 20) {
                j.e();
                j.o.add(sensorEvent.values.clone());
            }
            if (j.f80786f == 20) {
                j.e();
                if (j.i == 1) {
                    long unused = j.j = System.currentTimeMillis();
                }
                if (j.i == 2) {
                    long unused2 = j.k = System.currentTimeMillis();
                }
                j.h();
                j.l();
            }
        }
    };

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f80789a;

        /* renamed from: b  reason: collision with root package name */
        public int f80790b;

        /* renamed from: c  reason: collision with root package name */
        public long f80791c;
    }

    static /* synthetic */ int c() {
        int i2 = g;
        g = i2 + 1;
        return i2;
    }

    static /* synthetic */ int e() {
        int i2 = f80786f;
        f80786f = i2 + 1;
        return i2;
    }

    static /* synthetic */ int h() {
        int i2 = i;
        i = i2 + 1;
        return i2;
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (j.class) {
            z = f80783c;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public static void l() {
        if (n != null) {
            n.unregisterListener(p);
        }
        if (o.size() == 40) {
            f(f80785e);
            if (o != null) {
                o.clear();
            }
            if (f80784d != null) {
                f80784d.quit();
                f80784d = null;
            }
            f80785e = null;
            f80783c = false;
        }
    }

    public static List<Sensor> a(Context context) {
        if (context == null) {
            return null;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (sensorManager == null) {
            return null;
        }
        return sensorManager.getSensorList(-1);
    }

    public static JSONArray c(Context context) {
        SharedPreferences a2 = c.a(context.getApplicationContext(), "info", 0);
        if (a2 == null) {
            return null;
        }
        String string = a2.getString("stat", null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void d(Context context) {
        if (context != null) {
            c.a(context.getApplicationContext(), "info", 0).edit().remove("stat").commit();
        }
    }

    public static List<a> e(Context context) {
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.CAMERA")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                if (cameraManager != null) {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    for (String cameraCharacteristics : cameraIdList) {
                        Size size = (Size) cameraManager.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
                        if (size != null) {
                            a aVar = new a();
                            aVar.f80789a = size.getWidth();
                            aVar.f80790b = size.getHeight();
                            aVar.f80791c = System.currentTimeMillis();
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        } catch (Exception unused) {
            ULog.i("camera access exception");
        }
        return arrayList;
    }

    public static void b(Context context) {
        if (context != null && !a()) {
            f80783c = true;
            f80785e = context.getApplicationContext();
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getPackageName();
            if (currentProcessName != null && currentProcessName.equals(packageName)) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                n = sensorManager;
                if (sensorManager != null) {
                    final Sensor defaultSensor = n.getDefaultSensor(4);
                    final Sensor defaultSensor2 = n.getDefaultSensor(1);
                    if (defaultSensor != null) {
                        h = 4;
                        n.registerListener(p, defaultSensor, 50000);
                    } else if (defaultSensor2 != null) {
                        h = 1;
                        n.registerListener(p, defaultSensor2, 50000);
                    }
                    HandlerThread handlerThread = new HandlerThread("sensor_thread");
                    f80784d = handlerThread;
                    handlerThread.start();
                    new Handler(f80784d.getLooper()).postDelayed(new Runnable() {
                        public final void run() {
                            try {
                                int unused = j.f80786f = 0;
                                if (defaultSensor != null) {
                                    j.n.registerListener(j.p, defaultSensor, 50000);
                                    return;
                                }
                                if (defaultSensor2 != null) {
                                    j.n.registerListener(j.p, defaultSensor2, 50000);
                                }
                            } catch (Exception unused2) {
                                ULog.i("sensor exception");
                            }
                        }
                    }, (long) ((new Random().nextInt(3) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + 4000));
                }
            }
        }
    }

    private static void f(Context context) {
        int i2;
        if (context != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < 2; i3++) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    int i4 = 20;
                    if (i3 == 1) {
                        i2 = 40;
                    } else {
                        i4 = 0;
                        i2 = 20;
                    }
                    while (i4 < i2) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", (double) o.get(i4)[0]);
                        jSONObject2.put("y", (double) o.get(i4)[1]);
                        jSONObject2.put("z", (double) o.get(i4)[2]);
                        jSONArray2.put(jSONObject2);
                        i4++;
                    }
                    if (h == 4) {
                        jSONObject.put("g", jSONArray2);
                    } else if (h == 1) {
                        jSONObject.put("a", jSONArray2);
                    }
                    if (i3 == 0) {
                        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, j);
                    } else {
                        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, k);
                    }
                    jSONArray.put(jSONObject);
                    UMWorkDispatch.sendEvent(context, 32776, b.a(context).a(), jSONArray.toString());
                }
            } catch (Exception e2) {
                UMCrashManager.reportCrash(context, e2);
            }
        }
    }
}
