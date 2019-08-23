package com.ttnet.org.chromium.net;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.Iterator;
import java.util.List;

@JNINamespace("net::android::cellular_signal_strength")
public class AndroidCellularSignalStrength {
    @CalledByNative
    @TargetApi(18)
    public static int getSignalStrengthDbm(Context context) {
        List<CellInfo> registeredCellInfo = getRegisteredCellInfo(context);
        if (registeredCellInfo == null || registeredCellInfo.size() != 1) {
            return Integer.MIN_VALUE;
        }
        return getSignalStrengthDbm(registeredCellInfo.get(0));
    }

    @CalledByNative
    @TargetApi(18)
    public static int getSignalStrengthLevel(Context context) {
        List<CellInfo> registeredCellInfo = getRegisteredCellInfo(context);
        if (registeredCellInfo == null || registeredCellInfo.size() != 1) {
            return Integer.MIN_VALUE;
        }
        return getSignalStrengthLevel(registeredCellInfo.get(0));
    }

    private static boolean isAPIAvailable(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        try {
            if (context.checkPermission("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @TargetApi(18)
    private static List<CellInfo> getRegisteredCellInfo(Context context) {
        if (!isAPIAvailable(context)) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        if (allCellInfo == null) {
            return null;
        }
        Iterator<CellInfo> it2 = allCellInfo.iterator();
        while (it2.hasNext()) {
            if (!it2.next().isRegistered()) {
                it2.remove();
            }
        }
        return allCellInfo;
    }

    @TargetApi(18)
    private static int getSignalStrengthDbm(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
        }
        return Integer.MIN_VALUE;
    }

    @TargetApi(18)
    private static int getSignalStrengthLevel(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
        }
        return Integer.MIN_VALUE;
    }
}
