package com.bytedance.bdlocation.utils;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.netwok.a.a;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final TelephonyManager f19328a;

    public final a a() {
        a aVar = new a();
        if (this.f19328a != null) {
            aVar.f19228a = new com.bytedance.bdlocation.netwok.a.c();
            aVar.f19229b = new ArrayList();
            try {
                if (Build.VERSION.SDK_INT >= 17) {
                    List<CellInfo> allCellInfo = this.f19328a.getAllCellInfo();
                    if (allCellInfo != null && !allCellInfo.isEmpty()) {
                        a(aVar.f19228a, allCellInfo.get(0));
                        for (CellInfo a2 : allCellInfo) {
                            com.bytedance.bdlocation.netwok.a.c cVar = new com.bytedance.bdlocation.netwok.a.c();
                            a(cVar, a2);
                            aVar.f19229b.add(cVar);
                        }
                    }
                } else {
                    CellLocation cellLocation = this.f19328a.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        aVar.f19228a.f19231a = 16;
                        aVar.f19228a.g = (long) gsmCellLocation.getCid();
                        aVar.f19228a.f19236f = (long) gsmCellLocation.getCid();
                        aVar.f19228a.f19235e = (long) gsmCellLocation.getLac();
                        aVar.f19228a.h = (long) gsmCellLocation.getPsc();
                    } else if (cellLocation instanceof CdmaCellLocation) {
                        CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                        aVar.f19228a.f19231a = 4;
                        aVar.f19228a.j = cdmaCellLocation.getBaseStationId();
                        aVar.f19228a.k = cdmaCellLocation.getBaseStationLatitude();
                        aVar.f19228a.l = cdmaCellLocation.getBaseStationLongitude();
                        aVar.f19228a.m = cdmaCellLocation.getNetworkId();
                        aVar.f19228a.n = cdmaCellLocation.getSystemId();
                    }
                    a(aVar, this.f19328a.getNeighboringCellInfo());
                }
            } catch (SecurityException unused) {
            }
        }
        return aVar;
    }

    public c(Context context) {
        this.f19328a = (TelephonyManager) context.getSystemService("phone");
    }

    private static void a(a aVar, List<NeighboringCellInfo> list) {
        int size = list.size();
        if (size > BDLocationConfig.getBssNum()) {
            size = BDLocationConfig.getBssNum();
        }
        for (int i = 0; i < size; i++) {
            NeighboringCellInfo neighboringCellInfo = list.get(i);
            com.bytedance.bdlocation.netwok.a.c cVar = new com.bytedance.bdlocation.netwok.a.c();
            cVar.f19236f = (long) neighboringCellInfo.getCid();
            cVar.g = (long) neighboringCellInfo.getCid();
            cVar.h = (long) neighboringCellInfo.getPsc();
            cVar.f19235e = (long) neighboringCellInfo.getLac();
            cVar.f19231a = neighboringCellInfo.getNetworkType();
            cVar.i = (long) neighboringCellInfo.getRssi();
            aVar.f19229b.add(cVar);
        }
    }

    @RequiresApi(api = 17)
    private static void a(com.bytedance.bdlocation.netwok.a.c cVar, CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
            cVar.f19231a = 16;
            cVar.f19235e = (long) cellIdentity.getLac();
            cVar.g = (long) cellIdentity.getCid();
            cVar.f19236f = (long) cellIdentity.getCid();
            cVar.h = (long) cellIdentity.getPsc();
            cVar.f19234d = (long) cellSignalStrength.getDbm();
            cVar.f19232b = (long) cellIdentity.getMcc();
            cVar.f19233c = (long) cellIdentity.getMnc();
        } else if (cellInfo instanceof CellInfoCdma) {
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            CellSignalStrengthCdma cellSignalStrength2 = cellInfoCdma.getCellSignalStrength();
            cVar.f19231a = 4;
            cVar.j = cellIdentity2.getBasestationId();
            cVar.k = cellIdentity2.getLatitude();
            cVar.l = cellIdentity2.getLongitude();
            cVar.m = cellIdentity2.getNetworkId();
            cVar.n = cellIdentity2.getSystemId();
            cVar.f19234d = (long) cellSignalStrength2.getDbm();
        } else if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
            CellSignalStrengthLte cellSignalStrength3 = cellInfoLte.getCellSignalStrength();
            if (Build.VERSION.SDK_INT >= 28) {
                cVar.o = cellIdentity3.getBandwidth();
            }
            cVar.p = cellIdentity3.getCi();
            if (Build.VERSION.SDK_INT >= 24) {
                cVar.q = cellIdentity3.getEarfcn();
            }
            cVar.f19231a = 13;
            cVar.r = cellIdentity3.getPci();
            cVar.s = cellIdentity3.getTac();
            cVar.f19234d = (long) cellSignalStrength3.getDbm();
            cVar.f19232b = (long) cellIdentity3.getMcc();
            cVar.f19233c = (long) cellIdentity3.getMnc();
        } else {
            if (Build.VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                CellSignalStrengthWcdma cellSignalStrength4 = cellInfoWcdma.getCellSignalStrength();
                cVar.f19231a = 4;
                cVar.g = (long) cellIdentity4.getCid();
                cVar.f19236f = (long) cellIdentity4.getCid();
                cVar.f19235e = (long) cellIdentity4.getLac();
                cVar.h = (long) cellIdentity4.getPsc();
                cVar.f19234d = (long) cellSignalStrength4.getDbm();
                cVar.f19233c = (long) cellIdentity4.getMnc();
                cVar.f19232b = (long) cellIdentity4.getMcc();
            }
        }
    }
}
