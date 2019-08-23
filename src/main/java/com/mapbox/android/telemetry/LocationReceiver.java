package com.mapbox.android.telemetry;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.support.annotation.NonNull;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.List;

public class LocationReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final s f25964a;

    /* renamed from: b  reason: collision with root package name */
    private af f25965b;

    LocationReceiver(@NonNull s sVar) {
        this.f25964a = sVar;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z;
        String str;
        if ("onLocation".equals(intent.getStringExtra("location_received"))) {
            Location location = (Location) intent.getExtras().get("location");
            boolean z2 = false;
            if (Double.isNaN(location.getLatitude()) || Double.isNaN(location.getLongitude()) || Double.isNaN(location.getAltitude()) || Float.isNaN(location.getAccuracy())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (Double.isInfinite(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isInfinite(location.getAltitude()) || Float.isInfinite(location.getAccuracy())) {
                    z2 = true;
                }
                if (!z2) {
                    if (this.f25965b == null) {
                        this.f25965b = new af();
                    }
                    af afVar = this.f25965b;
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        String packageName = context.getPackageName();
                        Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                str = "Background";
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it2.next();
                            if (next.importance == 100 && next.processName.equals(packageName)) {
                                str = "Foreground";
                                break;
                            }
                        }
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    bf bfVar = afVar.f25990a;
                    if (System.currentTimeMillis() - bfVar.f26060b >= ((long) (bfVar.f26061c * 3600000)) || bfVar.f26059a == null) {
                        bfVar.f26059a = bp.a();
                        bfVar.f26060b = System.currentTimeMillis();
                    }
                    String str3 = bfVar.f26059a;
                    double a2 = af.a(location.getLatitude());
                    double a3 = af.a(location.getLongitude());
                    if (a3 < -180.0d || a3 > 180.0d) {
                        a3 = ((((a3 - -180.0d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
                    }
                    ae aeVar = new ae(str3, a2, a3, str2);
                    if (location.hasAltitude()) {
                        aeVar.h = Double.valueOf((double) Math.round(location.getAltitude()));
                    }
                    if (location.hasAccuracy()) {
                        aeVar.j = Float.valueOf((float) Math.round(location.getAccuracy()));
                    }
                    this.f25964a.onEventReceived(aeVar);
                }
            }
        }
    }
}
