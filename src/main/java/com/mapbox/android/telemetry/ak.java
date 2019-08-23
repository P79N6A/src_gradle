package com.mapbox.android.telemetry;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mapbox.android.telemetry.r;
import java.util.HashMap;
import java.util.Map;

public final class ak {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Integer, String> f25997b = new HashMap<Integer, String>() {
        {
            put(2, "Landscape");
            put(1, "Portrait");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Map<r.a, ah> f25998a = new HashMap<r.a, ah>() {
        {
            put(r.a.MAP_CLICK, new ah() {
                public final r a(am amVar) {
                    ak akVar = ak.this;
                    ai aiVar = new ai(amVar);
                    Context context = MapboxTelemetry.g;
                    aiVar.f25992e = Integer.valueOf(bp.a(context));
                    aiVar.f25993f = Boolean.valueOf(bp.b(context));
                    aiVar.h = bp.c(context);
                    aiVar.f25991a = ak.a(MapboxTelemetry.g);
                    aiVar.g = ak.b(MapboxTelemetry.g);
                    aiVar.i = Boolean.valueOf(akVar.c(MapboxTelemetry.g).booleanValue());
                    return aiVar;
                }
            });
            put(r.a.MAP_DRAGEND, new ah() {
                public final r a(am amVar) {
                    ak akVar = ak.this;
                    aj ajVar = new aj(amVar);
                    Context context = MapboxTelemetry.g;
                    ajVar.f25995e = bp.a(context);
                    ajVar.f25996f = Boolean.valueOf(bp.b(context));
                    ajVar.h = bp.c(context);
                    ajVar.f25994a = ak.a(MapboxTelemetry.g);
                    ajVar.g = ak.b(MapboxTelemetry.g);
                    ajVar.i = Boolean.valueOf(akVar.c(MapboxTelemetry.g).booleanValue());
                    return ajVar;
                }
            });
        }
    };

    public ak() {
        if (MapboxTelemetry.g == null) {
            throw new IllegalStateException("Create a MapboxTelemetry instance before calling this method.");
        }
    }

    public Boolean c(Context context) {
        return Boolean.valueOf(d(context));
    }

    public static String a(Context context) {
        return f25997b.get(Integer.valueOf(context.getResources().getConfiguration().orientation));
    }

    public static String b(Context context) {
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            return "EMPTY_CARRIER";
        }
        return networkOperatorName;
    }

    private boolean d(Context context) {
        boolean z;
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (wifiManager.isWifiEnabled()) {
                if (connectionInfo.getNetworkId() != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
