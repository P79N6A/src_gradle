package com.loc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.HandlerThread;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"NewApi"})
public final class bq {

    /* renamed from: a  reason: collision with root package name */
    public int f25563a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<bp> f25564b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public String f25565c = null;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<bp> f25566d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    int f25567e = -113;

    /* renamed from: f  reason: collision with root package name */
    public TelephonyManager f25568f = null;
    bo g = null;
    Object h;
    long i = 0;
    CellLocation j;
    long k = 0;
    boolean l = false;
    PhoneStateListener m = null;
    public String n = null;
    boolean o = false;
    StringBuilder p = null;
    HandlerThread q = null;
    boolean r = false;
    Object s = new Object();
    private Context t;
    private int u = 0;

    class a extends HandlerThread {
        public a(String str) {
            super(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r3.f25570a.f25568f.listen(r3.f25570a.m, 0);
            r3.f25570a.m = null;
            quit();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0004 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                super.run()     // Catch:{ Throwable -> 0x0004 }
                return
            L_0x0004:
                com.loc.bq r0 = com.loc.bq.this     // Catch:{ Throwable -> 0x0018 }
                android.telephony.TelephonyManager r0 = r0.f25568f     // Catch:{ Throwable -> 0x0018 }
                com.loc.bq r1 = com.loc.bq.this     // Catch:{ Throwable -> 0x0018 }
                android.telephony.PhoneStateListener r1 = r1.m     // Catch:{ Throwable -> 0x0018 }
                r2 = 0
                r0.listen(r1, r2)     // Catch:{ Throwable -> 0x0018 }
                com.loc.bq r0 = com.loc.bq.this     // Catch:{ Throwable -> 0x0018 }
                r1 = 0
                r0.m = r1     // Catch:{ Throwable -> 0x0018 }
                r3.quit()     // Catch:{ Throwable -> 0x0018 }
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.bq.a.run():void");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(6:6|(1:8)(1:11)|9|10|14|(2:16|17)(1:18))|19|20) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0040 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLooperPrepared() {
            /*
                r6 = this;
                super.onLooperPrepared()     // Catch:{ Throwable -> 0x0045 }
                com.loc.bq r0 = com.loc.bq.this     // Catch:{ Throwable -> 0x0045 }
                java.lang.Object r0 = r0.s     // Catch:{ Throwable -> 0x0045 }
                monitor-enter(r0)     // Catch:{ Throwable -> 0x0045 }
                com.loc.bq r1 = com.loc.bq.this     // Catch:{ all -> 0x0042 }
                boolean r1 = r1.r     // Catch:{ all -> 0x0042 }
                if (r1 != 0) goto L_0x0040
                com.loc.bq r1 = com.loc.bq.this     // Catch:{ all -> 0x0042 }
                com.loc.bq$1 r2 = new com.loc.bq$1     // Catch:{ all -> 0x0042 }
                r2.<init>()     // Catch:{ all -> 0x0042 }
                r1.m = r2     // Catch:{ all -> 0x0042 }
                java.lang.String r2 = "android.telephony.PhoneStateListener"
                r3 = 0
                int r4 = com.loc.cn.c()     // Catch:{ all -> 0x0042 }
                r5 = 7
                if (r4 >= r5) goto L_0x0028
                java.lang.String r4 = "LISTEN_SIGNAL_STRENGTH"
            L_0x0023:
                int r2 = com.loc.ch.b(r2, r4)     // Catch:{ Throwable -> 0x002b }
                goto L_0x002c
            L_0x0028:
                java.lang.String r4 = "LISTEN_SIGNAL_STRENGTHS"
                goto L_0x0023
            L_0x002b:
                r2 = 0
            L_0x002c:
                r3 = 16
                if (r2 != 0) goto L_0x0038
                android.telephony.TelephonyManager r2 = r1.f25568f     // Catch:{ Throwable -> 0x0040 }
                android.telephony.PhoneStateListener r1 = r1.m     // Catch:{ Throwable -> 0x0040 }
                r2.listen(r1, r3)     // Catch:{ Throwable -> 0x0040 }
                goto L_0x0040
            L_0x0038:
                android.telephony.TelephonyManager r4 = r1.f25568f     // Catch:{ Throwable -> 0x0040 }
                android.telephony.PhoneStateListener r1 = r1.m     // Catch:{ Throwable -> 0x0040 }
                r2 = r2 | r3
                r4.listen(r1, r2)     // Catch:{ Throwable -> 0x0040 }
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return
            L_0x0042:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ Throwable -> 0x0045 }
                throw r1     // Catch:{ Throwable -> 0x0045 }
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.bq.a.onLooperPrepared():void");
        }
    }

    public bq(Context context) {
        Object a2;
        this.t = context;
        if (this.f25568f == null) {
            this.f25568f = (TelephonyManager) cn.a(this.t, "phone");
        }
        if (this.f25568f != null) {
            try {
                this.f25563a = c(this.f25568f.getCellLocation());
            } catch (SecurityException e2) {
                this.n = e2.getMessage();
            } catch (Throwable th) {
                this.n = null;
                ce.a(th, "CgiManager", "CgiManager");
                this.f25563a = 0;
            }
            try {
                this.u = j();
                switch (this.u) {
                    case 1:
                        a2 = cn.a(this.t, "phone_msim");
                        break;
                    case 2:
                        a2 = cn.a(this.t, "phone2");
                        break;
                    default:
                        a2 = cn.a(this.t, "phone2");
                        break;
                }
                this.h = a2;
            } catch (Throwable unused) {
            }
            if (this.q == null) {
                this.q = new a("listenerPhoneStateThread");
                this.q.start();
            }
        }
        this.g = new bo();
    }

    private CellLocation a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Object a2 = ch.a(obj, str, objArr);
            CellLocation cellLocation = a2 != null ? (CellLocation) a2 : null;
            if (b(cellLocation)) {
                return cellLocation;
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad A[RETURN] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.telephony.CellLocation a(java.util.List<android.telephony.CellInfo> r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x00ae
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x000b
            goto L_0x00ae
        L_0x000b:
            r1 = 0
        L_0x000c:
            int r2 = r11.size()
            if (r1 >= r2) goto L_0x0079
            java.lang.Object r2 = r11.get(r1)
            android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2
            if (r2 == 0) goto L_0x0076
            boolean r3 = r2.isRegistered()     // Catch:{ Throwable -> 0x0076 }
            boolean r4 = r2 instanceof android.telephony.CellInfoCdma     // Catch:{ Throwable -> 0x0076 }
            if (r4 == 0) goto L_0x0034
            android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2     // Catch:{ Throwable -> 0x0076 }
            android.telephony.CellIdentityCdma r4 = r2.getCellIdentity()     // Catch:{ Throwable -> 0x0076 }
            boolean r4 = a((android.telephony.CellIdentityCdma) r4)     // Catch:{ Throwable -> 0x0076 }
            if (r4 != 0) goto L_0x002f
            goto L_0x0076
        L_0x002f:
            com.loc.bp r2 = r10.a((android.telephony.CellInfoCdma) r2, (boolean) r3)     // Catch:{ Throwable -> 0x0076 }
            goto L_0x007a
        L_0x0034:
            boolean r4 = r2 instanceof android.telephony.CellInfoGsm     // Catch:{ Throwable -> 0x0076 }
            if (r4 == 0) goto L_0x004a
            android.telephony.CellInfoGsm r2 = (android.telephony.CellInfoGsm) r2     // Catch:{ Throwable -> 0x0076 }
            android.telephony.CellIdentityGsm r4 = r2.getCellIdentity()     // Catch:{ Throwable -> 0x0076 }
            boolean r4 = a((android.telephony.CellIdentityGsm) r4)     // Catch:{ Throwable -> 0x0076 }
            if (r4 != 0) goto L_0x0045
            goto L_0x0076
        L_0x0045:
            com.loc.bp r2 = a((android.telephony.CellInfoGsm) r2, (boolean) r3)     // Catch:{ Throwable -> 0x0076 }
            goto L_0x007a
        L_0x004a:
            boolean r4 = r2 instanceof android.telephony.CellInfoWcdma     // Catch:{ Throwable -> 0x0076 }
            if (r4 == 0) goto L_0x0060
            android.telephony.CellInfoWcdma r2 = (android.telephony.CellInfoWcdma) r2     // Catch:{ Throwable -> 0x0076 }
            android.telephony.CellIdentityWcdma r4 = r2.getCellIdentity()     // Catch:{ Throwable -> 0x0076 }
            boolean r4 = a((android.telephony.CellIdentityWcdma) r4)     // Catch:{ Throwable -> 0x0076 }
            if (r4 != 0) goto L_0x005b
            goto L_0x0076
        L_0x005b:
            com.loc.bp r2 = a((android.telephony.CellInfoWcdma) r2, (boolean) r3)     // Catch:{ Throwable -> 0x0076 }
            goto L_0x007a
        L_0x0060:
            boolean r4 = r2 instanceof android.telephony.CellInfoLte     // Catch:{ Throwable -> 0x0076 }
            if (r4 == 0) goto L_0x0079
            android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2     // Catch:{ Throwable -> 0x0076 }
            android.telephony.CellIdentityLte r4 = r2.getCellIdentity()     // Catch:{ Throwable -> 0x0076 }
            boolean r4 = a((android.telephony.CellIdentityLte) r4)     // Catch:{ Throwable -> 0x0076 }
            if (r4 != 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            com.loc.bp r2 = a((android.telephony.CellInfoLte) r2, (boolean) r3)     // Catch:{ Throwable -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0079:
            r2 = r0
        L_0x007a:
            if (r2 == 0) goto L_0x00a6
            int r11 = r2.k     // Catch:{ Throwable -> 0x00a4 }
            r1 = 2
            if (r11 != r1) goto L_0x0097
            android.telephony.cdma.CdmaCellLocation r11 = new android.telephony.cdma.CdmaCellLocation     // Catch:{ Throwable -> 0x00a4 }
            r11.<init>()     // Catch:{ Throwable -> 0x00a4 }
            int r4 = r2.i     // Catch:{ Throwable -> 0x0095 }
            int r5 = r2.f25561e     // Catch:{ Throwable -> 0x0095 }
            int r6 = r2.f25562f     // Catch:{ Throwable -> 0x0095 }
            int r7 = r2.g     // Catch:{ Throwable -> 0x0095 }
            int r8 = r2.h     // Catch:{ Throwable -> 0x0095 }
            r3 = r11
            r3.setCellLocationData(r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0095 }
            goto L_0x00aa
        L_0x0095:
            goto L_0x00aa
        L_0x0097:
            android.telephony.gsm.GsmCellLocation r11 = new android.telephony.gsm.GsmCellLocation     // Catch:{ Throwable -> 0x00a4 }
            r11.<init>()     // Catch:{ Throwable -> 0x00a4 }
            int r1 = r2.f25559c     // Catch:{ Throwable -> 0x00a7 }
            int r2 = r2.f25560d     // Catch:{ Throwable -> 0x00a7 }
            r11.setLacAndCid(r1, r2)     // Catch:{ Throwable -> 0x00a7 }
            goto L_0x00a7
        L_0x00a4:
            r11 = r0
            goto L_0x00aa
        L_0x00a6:
            r11 = r0
        L_0x00a7:
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00aa:
            if (r11 != 0) goto L_0x00ad
            return r0
        L_0x00ad:
            return r11
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bq.a(java.util.List):android.telephony.CellLocation");
    }

    private static bp a(int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        bp bpVar = new bp(i2, z);
        bpVar.f25557a = i3;
        bpVar.f25558b = i4;
        bpVar.f25559c = i5;
        bpVar.f25560d = i6;
        bpVar.j = i7;
        return bpVar;
    }

    @SuppressLint({"NewApi"})
    private bp a(CellInfoCdma cellInfoCdma, boolean z) {
        int i2;
        int i3;
        int i4;
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        String[] a2 = cn.a(this.f25568f);
        try {
            i4 = Integer.parseInt(a2[0]);
            try {
                i2 = Integer.parseInt(a2[1]);
                i3 = i4;
            } catch (Throwable unused) {
                i3 = i4;
                i2 = 0;
                bp a3 = a(2, z, i3, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                a3.g = cellIdentity.getSystemId();
                a3.h = cellIdentity.getNetworkId();
                a3.i = cellIdentity.getBasestationId();
                a3.f25561e = cellIdentity.getLatitude();
                a3.f25562f = cellIdentity.getLongitude();
                return a3;
            }
        } catch (Throwable unused2) {
            i4 = 0;
            i3 = i4;
            i2 = 0;
            bp a32 = a(2, z, i3, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
            a32.g = cellIdentity.getSystemId();
            a32.h = cellIdentity.getNetworkId();
            a32.i = cellIdentity.getBasestationId();
            a32.f25561e = cellIdentity.getLatitude();
            a32.f25562f = cellIdentity.getLongitude();
            return a32;
        }
        bp a322 = a(2, z, i3, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
        a322.g = cellIdentity.getSystemId();
        a322.h = cellIdentity.getNetworkId();
        a322.i = cellIdentity.getBasestationId();
        a322.f25561e = cellIdentity.getLatitude();
        a322.f25562f = cellIdentity.getLongitude();
        return a322;
    }

    @SuppressLint({"NewApi"})
    private static bp a(CellInfoGsm cellInfoGsm, boolean z) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        return a(1, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
    }

    @SuppressLint({"NewApi"})
    private static bp a(CellInfoLte cellInfoLte, boolean z) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        return a(3, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getTac(), cellIdentity.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
    }

    @SuppressLint({"NewApi"})
    private static bp a(CellInfoWcdma cellInfoWcdma, boolean z) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        return a(4, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
    }

    private static bp a(NeighboringCellInfo neighboringCellInfo, String[] strArr) {
        try {
            bp bpVar = new bp(1, false);
            bpVar.f25557a = Integer.parseInt(strArr[0]);
            bpVar.f25558b = Integer.parseInt(strArr[1]);
            bpVar.f25559c = ch.b(neighboringCellInfo, "getLac", new Object[0]);
            bpVar.f25560d = neighboringCellInfo.getCid();
            bpVar.j = cn.a(neighboringCellInfo.getRssi());
            return bpVar;
        } catch (Throwable th) {
            ce.a(th, "CgiManager", "getGsm");
            return null;
        }
    }

    private void a(CellLocation cellLocation, String[] strArr, boolean z) {
        if (!(cellLocation == null || this.f25568f == null)) {
            this.f25564b.clear();
            if (b(cellLocation)) {
                this.f25563a = 1;
                ArrayList<bp> arrayList = this.f25564b;
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                bp bpVar = new bp(1, true);
                bpVar.f25557a = cn.g(strArr[0]);
                bpVar.f25558b = cn.g(strArr[1]);
                bpVar.f25559c = gsmCellLocation.getLac();
                bpVar.f25560d = gsmCellLocation.getCid();
                bpVar.j = this.f25567e;
                arrayList.add(bpVar);
                if (!z) {
                    List<NeighboringCellInfo> neighboringCellInfo = this.f25568f.getNeighboringCellInfo();
                    if (neighboringCellInfo != null && !neighboringCellInfo.isEmpty()) {
                        for (NeighboringCellInfo neighboringCellInfo2 : neighboringCellInfo) {
                            if (neighboringCellInfo2 != null && a(neighboringCellInfo2.getLac(), neighboringCellInfo2.getCid())) {
                                bp a2 = a(neighboringCellInfo2, strArr);
                                if (a2 != null && !this.f25564b.contains(a2)) {
                                    this.f25564b.add(a2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static /* synthetic */ void a(bq bqVar, int i2) {
        if (i2 == -113) {
            bqVar.f25567e = -113;
            return;
        }
        bqVar.f25567e = i2;
        switch (bqVar.f25563a) {
            case 1:
            case 2:
                if (bqVar.f25564b != null && !bqVar.f25564b.isEmpty()) {
                    try {
                        bqVar.f25564b.get(0).j = bqVar.f25567e;
                        break;
                    } catch (Throwable unused) {
                        break;
                    }
                }
        }
    }

    private static boolean a(int i2) {
        return (i2 == -1 || i2 == 0 || i2 > 65535) ? false : true;
    }

    private static boolean a(int i2, int i3) {
        return (i2 == -1 || i2 == 0 || i2 > 65535 || i3 == -1 || i3 == 0 || i3 == 65535 || i3 >= 268435455) ? false : true;
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityCdma cellIdentityCdma) {
        return cellIdentityCdma != null && cellIdentityCdma.getSystemId() > 0 && cellIdentityCdma.getNetworkId() >= 0 && cellIdentityCdma.getBasestationId() >= 0;
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityGsm cellIdentityGsm) {
        return cellIdentityGsm != null && a(cellIdentityGsm.getLac()) && b(cellIdentityGsm.getCid());
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte != null && a(cellIdentityLte.getTac()) && b(cellIdentityLte.getCi());
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma != null && a(cellIdentityWcdma.getLac()) && b(cellIdentityWcdma.getCid());
    }

    private static boolean b(int i2) {
        return (i2 == -1 || i2 == 0 || i2 == 65535 || i2 >= 268435455) ? false : true;
    }

    private boolean b(CellLocation cellLocation) {
        boolean a2 = a(cellLocation);
        if (!a2) {
            this.f25563a = 0;
        }
        return a2;
    }

    private int c(CellLocation cellLocation) {
        if (this.o || cellLocation == null) {
            return 0;
        }
        if (cellLocation instanceof GsmCellLocation) {
            return 1;
        }
        try {
            Class.forName("android.telephony.cdma.CdmaCellLocation");
            return 2;
        } catch (Throwable th) {
            ce.a(th, "Utils", "getCellLocT");
            return 0;
        }
    }

    private CellLocation f() {
        if (this.f25568f != null) {
            try {
                CellLocation cellLocation = this.f25568f.getCellLocation();
                this.n = null;
                if (b(cellLocation)) {
                    this.j = cellLocation;
                    return cellLocation;
                }
            } catch (SecurityException e2) {
                this.n = e2.getMessage();
            } catch (Throwable th) {
                this.n = null;
                ce.a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    private CellLocation g() {
        TelephonyManager telephonyManager = this.f25568f;
        CellLocation cellLocation = null;
        if (telephonyManager == null) {
            return null;
        }
        CellLocation f2 = f();
        if (b(f2)) {
            return f2;
        }
        if (cn.c() >= 18) {
            try {
                cellLocation = a((List) telephonyManager.getAllCellInfo());
            } catch (SecurityException e2) {
                this.n = e2.getMessage();
            }
        }
        if (cellLocation != null) {
            return cellLocation;
        }
        CellLocation a2 = a((Object) telephonyManager, "getCellLocationExt", 1);
        if (a2 != null) {
            return a2;
        }
        CellLocation a3 = a((Object) telephonyManager, "getCellLocationGemini", 1);
        if (a3 != null) {
        }
        return a3;
    }

    private CellLocation h() {
        Object obj = this.h;
        CellLocation cellLocation = null;
        if (obj == null) {
            return null;
        }
        try {
            Class<?> i2 = i();
            if (i2.isInstance(obj)) {
                Object cast = i2.cast(obj);
                CellLocation a2 = a((Object) cast, "getCellLocation", new Object[0]);
                if (a2 != null) {
                    return a2;
                }
                try {
                    CellLocation a3 = a((Object) cast, "getCellLocation", 1);
                    if (a3 != null) {
                        return a3;
                    }
                    try {
                        a2 = a((Object) cast, "getCellLocationGemini", 1);
                        if (a2 != null) {
                            return a2;
                        }
                        cellLocation = a((Object) cast, "getAllCellInfo", 1);
                        if (cellLocation != null) {
                            return cellLocation;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cellLocation = a3;
                        ce.a(th, "CgiManager", "getSim2Cgi");
                        return cellLocation;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cellLocation = a2;
                    ce.a(th, "CgiManager", "getSim2Cgi");
                    return cellLocation;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            ce.a(th, "CgiManager", "getSim2Cgi");
            return cellLocation;
        }
        return cellLocation;
    }

    private Class<?> i() {
        String str;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        switch (this.u) {
            case 0:
                str = "android.telephony.TelephonyManager";
                break;
            case 1:
                str = "android.telephony.MSimTelephonyManager";
                break;
            case 2:
                str = "android.telephony.TelephonyManager2";
                break;
            default:
                str = null;
                break;
        }
        try {
            return systemClassLoader.loadClass(str);
        } catch (Throwable th) {
            ce.a(th, "CgiManager", "getSim2TmClass");
            return null;
        }
    }

    private int j() {
        try {
            Class.forName("android.telephony.MSimTelephonyManager");
            this.u = 1;
        } catch (Throwable unused) {
        }
        if (this.u == 0) {
            try {
                Class.forName("android.telephony.TelephonyManager2");
                this.u = 2;
            } catch (Throwable unused2) {
            }
        }
        return this.u;
    }

    public final bp a() {
        if (this.o) {
            return null;
        }
        ArrayList<bp> arrayList = this.f25564b;
        if (arrayList.size() > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02ac, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02ad, code lost:
        r9.n = r10.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00df, code lost:
        if (r10 == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        com.loc.ce.a(r10, "CgiManager", "hdlCdmaLocChange");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x025d */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x025d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0261 A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0281 A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0285 A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02ac A[ExcHandler: SecurityException (r10v1 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0089 A[EDGE_INSN: B:178:0x0089->B:40:0x0089 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050 A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085 A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093 A[Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r10, boolean r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.t     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r0 = com.loc.cn.a((android.content.Context) r0)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r9.o = r0     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r0 = r9.o     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0020
        L_0x0010:
            long r3 = com.loc.cn.b()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            long r5 = r9.i     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r0 = 0
            long r3 = r3 - r5
            r5 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            goto L_0x000e
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 != 0) goto L_0x002a
            java.util.ArrayList<com.loc.bp> r0 = r9.f25564b     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r0 = r0.isEmpty()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r0 == 0) goto L_0x027d
        L_0x002a:
            boolean r0 = r9.o     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r3 = 0
            if (r0 != 0) goto L_0x006b
            android.telephony.TelephonyManager r0 = r9.f25568f     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r0 == 0) goto L_0x006b
            android.telephony.CellLocation r0 = r9.g()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r4 = r9.b((android.telephony.CellLocation) r0)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r4 != 0) goto L_0x0041
            android.telephony.CellLocation r0 = r9.h()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x0041:
            boolean r4 = r9.b((android.telephony.CellLocation) r0)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r4 == 0) goto L_0x0050
            r9.j = r0     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            long r4 = com.loc.cn.b()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r9.k = r4     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            goto L_0x006b
        L_0x0050:
            long r4 = com.loc.cn.b()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            long r6 = r9.k     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r0 = 0
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            r9.j = r3     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            java.util.ArrayList<com.loc.bp> r0 = r9.f25564b     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r0.clear()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            java.util.ArrayList<com.loc.bp> r0 = r9.f25566d     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r0.clear()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x006b:
            boolean r0 = r9.l     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r0 != 0) goto L_0x0089
            android.telephony.CellLocation r0 = r9.j     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r0 != 0) goto L_0x0089
            if (r11 == 0) goto L_0x0089
            r11 = 0
        L_0x0076:
            r4 = 10
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x0080:
            int r11 = r11 + r1
            android.telephony.CellLocation r0 = r9.j     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r0 != 0) goto L_0x0089
            r0 = 50
            if (r11 < r0) goto L_0x0076
        L_0x0089:
            r9.l = r1     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            android.telephony.CellLocation r11 = r9.j     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r11 = r9.b((android.telephony.CellLocation) r11)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r11 == 0) goto L_0x017a
            android.telephony.TelephonyManager r11 = r9.f25568f     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            java.lang.String[] r11 = com.loc.cn.a((android.telephony.TelephonyManager) r11)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            android.telephony.CellLocation r0 = r9.j     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            int r0 = r9.c(r0)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            switch(r0) {
                case 1: goto L_0x0175;
                case 2: goto L_0x00a4;
                default: goto L_0x00a2;
            }     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x00a2:
            goto L_0x017a
        L_0x00a4:
            android.telephony.CellLocation r0 = r9.j     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r0 == 0) goto L_0x017a
            java.util.ArrayList<com.loc.bp> r4 = r9.f25564b     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r4.clear()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            int r4 = com.loc.cn.c()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r5 = 5
            if (r4 < r5) goto L_0x017a
            java.lang.Object r4 = r9.h     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r4 == 0) goto L_0x00e3
            java.lang.Class r4 = r0.getClass()     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
            java.lang.String r5 = "mGsmCellLoc"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
            boolean r5 = r4.isAccessible()     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
            if (r5 != 0) goto L_0x00cb
            r4.setAccessible(r1)     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
        L_0x00cb:
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
            android.telephony.gsm.GsmCellLocation r4 = (android.telephony.gsm.GsmCellLocation) r4     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
            if (r4 == 0) goto L_0x00de
            boolean r5 = r9.b((android.telephony.CellLocation) r4)     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
            if (r5 == 0) goto L_0x00de
            r9.a((android.telephony.CellLocation) r4, (java.lang.String[]) r11, (boolean) r10)     // Catch:{ Throwable -> 0x00de, SecurityException -> 0x02ac }
            r10 = 1
            goto L_0x00df
        L_0x00de:
            r10 = 0
        L_0x00df:
            if (r10 == 0) goto L_0x00e3
            goto L_0x017a
        L_0x00e3:
            boolean r10 = r9.b((android.telephony.CellLocation) r0)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r10 != 0) goto L_0x00eb
            goto L_0x017a
        L_0x00eb:
            r10 = 2
            r9.f25563a = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            com.loc.bp r4 = new com.loc.bp     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.<init>(r10, r1)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r10 = r11[r2]     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.f25557a = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r10 = r11[r1]     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.f25558b = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            java.lang.String r10 = "getSystemId"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = com.loc.ch.b(r0, r10, r11)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.g = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            java.lang.String r10 = "getNetworkId"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = com.loc.ch.b(r0, r10, r11)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.h = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            java.lang.String r10 = "getBaseStationId"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = com.loc.ch.b(r0, r10, r11)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.i = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = r9.f25567e     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.j = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            java.lang.String r10 = "getBaseStationLatitude"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = com.loc.ch.b(r0, r10, r11)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.f25561e = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            java.lang.String r10 = "getBaseStationLongitude"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = com.loc.ch.b(r0, r10, r11)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.f25562f = r10     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r10 = r4.f25561e     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            int r11 = r4.f25562f     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r10 != r11) goto L_0x0144
            int r10 = r4.f25561e     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r10 <= 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r1 = 0
        L_0x0145:
            int r10 = r4.f25561e     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r10 < 0) goto L_0x015a
            int r10 = r4.f25562f     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r10 < 0) goto L_0x015a
            int r10 = r4.f25561e     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r11) goto L_0x015a
            int r10 = r4.f25562f     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r10 == r11) goto L_0x015a
            if (r1 == 0) goto L_0x015e
        L_0x015a:
            r4.f25561e = r2     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r4.f25562f = r2     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
        L_0x015e:
            java.util.ArrayList<com.loc.bp> r10 = r9.f25564b     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            boolean r10 = r10.contains(r4)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            if (r10 != 0) goto L_0x017a
            java.util.ArrayList<com.loc.bp> r10 = r9.f25564b     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            r10.add(r4)     // Catch:{ Throwable -> 0x016c, SecurityException -> 0x02ac }
            goto L_0x017a
        L_0x016c:
            r10 = move-exception
            java.lang.String r11 = "CgiManager"
            java.lang.String r0 = "hdlCdmaLocChange"
            com.loc.ce.a(r10, r11, r0)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            goto L_0x017a
        L_0x0175:
            android.telephony.CellLocation r0 = r9.j     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r9.a((android.telephony.CellLocation) r0, (java.lang.String[]) r11, (boolean) r10)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x017a:
            int r10 = com.loc.cn.c()     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            r11 = 18
            if (r10 < r11) goto L_0x025d
            android.telephony.TelephonyManager r10 = r9.f25568f     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            if (r10 == 0) goto L_0x025d
            java.util.ArrayList<com.loc.bp> r10 = r9.f25566d     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            com.loc.bo r11 = r9.g     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            android.telephony.TelephonyManager r0 = r9.f25568f     // Catch:{ SecurityException -> 0x0195, Throwable -> 0x025d }
            java.util.List r0 = r0.getAllCellInfo()     // Catch:{ SecurityException -> 0x0195, Throwable -> 0x025d }
            r9.n = r3     // Catch:{ SecurityException -> 0x0193, Throwable -> 0x025d }
            goto L_0x019d
        L_0x0193:
            r1 = move-exception
            goto L_0x0197
        L_0x0195:
            r1 = move-exception
            r0 = r3
        L_0x0197:
            java.lang.String r1 = r1.getMessage()     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            r9.n = r1     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
        L_0x019d:
            if (r0 == 0) goto L_0x024c
            int r1 = r0.size()     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            if (r1 == 0) goto L_0x024c
            if (r10 == 0) goto L_0x01aa
            r10.clear()     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
        L_0x01aa:
            r3 = 0
        L_0x01ab:
            if (r3 >= r1) goto L_0x024c
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            android.telephony.CellInfo r4 = (android.telephony.CellInfo) r4     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            if (r4 == 0) goto L_0x0248
            boolean r5 = r4.isRegistered()     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            boolean r6 = r4 instanceof android.telephony.CellInfoCdma     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            r7 = 65535(0xffff, double:3.23786E-319)
            if (r6 == 0) goto L_0x01e2
            android.telephony.CellInfoCdma r4 = (android.telephony.CellInfoCdma) r4     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            android.telephony.CellIdentityCdma r6 = r4.getCellIdentity()     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            boolean r6 = a((android.telephony.CellIdentityCdma) r6)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            if (r6 != 0) goto L_0x01ce
            goto L_0x0248
        L_0x01ce:
            com.loc.bp r4 = r9.a((android.telephony.CellInfoCdma) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = r11.a((com.loc.bp) r4)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = java.lang.Math.min(r7, r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            int r5 = (int) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            short r5 = (short) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            r4.l = r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
        L_0x01de:
            r10.add(r4)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            goto L_0x0248
        L_0x01e2:
            boolean r6 = r4 instanceof android.telephony.CellInfoGsm     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            if (r6 == 0) goto L_0x0204
            android.telephony.CellInfoGsm r4 = (android.telephony.CellInfoGsm) r4     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            android.telephony.CellIdentityGsm r6 = r4.getCellIdentity()     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            boolean r6 = a((android.telephony.CellIdentityGsm) r6)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            if (r6 != 0) goto L_0x01f3
            goto L_0x0248
        L_0x01f3:
            com.loc.bp r4 = a((android.telephony.CellInfoGsm) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = r11.a((com.loc.bp) r4)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = java.lang.Math.min(r7, r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            int r5 = (int) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            short r5 = (short) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            r4.l = r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            goto L_0x01de
        L_0x0204:
            boolean r6 = r4 instanceof android.telephony.CellInfoWcdma     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            if (r6 == 0) goto L_0x0226
            android.telephony.CellInfoWcdma r4 = (android.telephony.CellInfoWcdma) r4     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            android.telephony.CellIdentityWcdma r6 = r4.getCellIdentity()     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            boolean r6 = a((android.telephony.CellIdentityWcdma) r6)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            if (r6 != 0) goto L_0x0215
            goto L_0x0248
        L_0x0215:
            com.loc.bp r4 = a((android.telephony.CellInfoWcdma) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = r11.a((com.loc.bp) r4)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = java.lang.Math.min(r7, r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            int r5 = (int) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            short r5 = (short) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            r4.l = r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            goto L_0x01de
        L_0x0226:
            boolean r6 = r4 instanceof android.telephony.CellInfoLte     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            if (r6 == 0) goto L_0x0248
            android.telephony.CellInfoLte r4 = (android.telephony.CellInfoLte) r4     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            android.telephony.CellIdentityLte r6 = r4.getCellIdentity()     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            boolean r6 = a((android.telephony.CellIdentityLte) r6)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            if (r6 != 0) goto L_0x0237
            goto L_0x0248
        L_0x0237:
            com.loc.bp r4 = a((android.telephony.CellInfoLte) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = r11.a((com.loc.bp) r4)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            long r5 = java.lang.Math.min(r7, r5)     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            int r5 = (int) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            short r5 = (short) r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            r4.l = r5     // Catch:{ Throwable -> 0x0248, SecurityException -> 0x02ac }
            goto L_0x01de
        L_0x0248:
            int r3 = r3 + 1
            goto L_0x01ab
        L_0x024c:
            if (r10 == 0) goto L_0x025d
            int r0 = r10.size()     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            if (r0 <= 0) goto L_0x025d
            int r0 = r9.f25563a     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            r0 = r0 | 4
            r9.f25563a = r0     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
            r11.a((java.util.ArrayList) r10)     // Catch:{ Throwable -> 0x025d, SecurityException -> 0x02ac }
        L_0x025d:
            android.telephony.TelephonyManager r10 = r9.f25568f     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r10 == 0) goto L_0x0277
            android.telephony.TelephonyManager r10 = r9.f25568f     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            java.lang.String r10 = r10.getNetworkOperator()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r9.f25565c = r10     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            java.lang.String r10 = r9.f25565c     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r10 != 0) goto L_0x0277
            int r10 = r9.f25563a     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r10 = r10 | 8
            r9.f25563a = r10     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x0277:
            long r10 = com.loc.cn.b()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r9.i = r10     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x027d:
            boolean r10 = r9.o     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r10 == 0) goto L_0x0285
            r9.c()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            return
        L_0x0285:
            int r10 = r9.f25563a     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            r10 = r10 & 3
            switch(r10) {
                case 1: goto L_0x0298;
                case 2: goto L_0x028d;
                default: goto L_0x028c;
            }     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x028c:
            goto L_0x02a2
        L_0x028d:
            java.util.ArrayList<com.loc.bp> r10 = r9.f25564b     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r10 = r10.isEmpty()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r10 == 0) goto L_0x02a2
            r9.f25563a = r2     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            goto L_0x02a2
        L_0x0298:
            java.util.ArrayList<com.loc.bp> r10 = r9.f25564b     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            boolean r10 = r10.isEmpty()     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
            if (r10 == 0) goto L_0x02a2
            r9.f25563a = r2     // Catch:{ SecurityException -> 0x02ac, Throwable -> 0x02a3 }
        L_0x02a2:
            return
        L_0x02a3:
            r10 = move-exception
            java.lang.String r11 = "CgiManager"
            java.lang.String r0 = "refresh"
            com.loc.ce.a(r10, r11, r0)
            return
        L_0x02ac:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            r9.n = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bq.a(boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.telephony.CellLocation r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            int r2 = r4.c(r5)
            switch(r2) {
                case 1: goto L_0x0033;
                case 2: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x004b
        L_0x000d:
            java.lang.String r2 = "getSystemId"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x002d }
            int r2 = com.loc.ch.b(r5, r2, r3)     // Catch:{ Throwable -> 0x002d }
            if (r2 <= 0) goto L_0x002b
            java.lang.String r2 = "getNetworkId"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x002d }
            int r2 = com.loc.ch.b(r5, r2, r3)     // Catch:{ Throwable -> 0x002d }
            if (r2 < 0) goto L_0x002b
            java.lang.String r2 = "getBaseStationId"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x002d }
            int r5 = com.loc.ch.b(r5, r2, r3)     // Catch:{ Throwable -> 0x002d }
            if (r5 >= 0) goto L_0x004b
        L_0x002b:
            r1 = 0
            goto L_0x004b
        L_0x002d:
            r5 = move-exception
            java.lang.String r0 = "CgiManager"
            java.lang.String r2 = "cgiUseful Cgi.I_CDMA_T"
            goto L_0x0048
        L_0x0033:
            android.telephony.gsm.GsmCellLocation r5 = (android.telephony.gsm.GsmCellLocation) r5     // Catch:{ Throwable -> 0x0043 }
            int r0 = r5.getLac()     // Catch:{ Throwable -> 0x0043 }
            int r5 = r5.getCid()     // Catch:{ Throwable -> 0x0043 }
            boolean r5 = a((int) r0, (int) r5)     // Catch:{ Throwable -> 0x0043 }
            r1 = r5
            goto L_0x004b
        L_0x0043:
            r5 = move-exception
            java.lang.String r0 = "CgiManager"
            java.lang.String r2 = "cgiUseful Cgi.I_GSM_T"
        L_0x0048:
            com.loc.ce.a(r5, r0, r2)
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bq.a(android.telephony.CellLocation):boolean");
    }

    public final int b() {
        return this.f25563a & 3;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.n = null;
        this.j = null;
        this.f25563a = 0;
        this.f25564b.clear();
        this.f25566d.clear();
    }

    public final String d() {
        if (this.o) {
            c();
        }
        if (this.p == null) {
            this.p = new StringBuilder();
        } else {
            this.p.delete(0, this.p.length());
        }
        if ((this.f25563a & 3) == 1) {
            for (int i2 = 1; i2 < this.f25564b.size(); i2++) {
                StringBuilder sb = this.p;
                sb.append("#");
                sb.append(this.f25564b.get(i2).f25558b);
                StringBuilder sb2 = this.p;
                sb2.append("|");
                sb2.append(this.f25564b.get(i2).f25559c);
                StringBuilder sb3 = this.p;
                sb3.append("|");
                sb3.append(this.f25564b.get(i2).f25560d);
            }
        }
        if (this.p.length() > 0) {
            this.p.deleteCharAt(0);
        }
        return this.p.toString();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r3 = this;
            r0 = 1
            android.telephony.TelephonyManager r1 = r3.f25568f     // Catch:{ Throwable -> 0x001f }
            if (r1 == 0) goto L_0x001f
            android.telephony.TelephonyManager r1 = r3.f25568f     // Catch:{ Throwable -> 0x001f }
            java.lang.String r1 = r1.getSimOperator()     // Catch:{ Throwable -> 0x001f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x001f }
            if (r1 != 0) goto L_0x0012
            return r0
        L_0x0012:
            android.telephony.TelephonyManager r1 = r3.f25568f     // Catch:{ Throwable -> 0x001f }
            java.lang.String r1 = r1.getSimCountryIso()     // Catch:{ Throwable -> 0x001f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x001f }
            if (r1 != 0) goto L_0x001f
            return r0
        L_0x001f:
            android.content.Context r1 = r3.t     // Catch:{ Throwable -> 0x0038 }
            android.net.NetworkInfo r1 = com.loc.cn.c((android.content.Context) r1)     // Catch:{ Throwable -> 0x0038 }
            int r1 = com.loc.cn.a((android.net.NetworkInfo) r1)     // Catch:{ Throwable -> 0x0038 }
            if (r1 == 0) goto L_0x0037
            r2 = 4
            if (r1 == r2) goto L_0x0037
            r2 = 2
            if (r1 == r2) goto L_0x0037
            r2 = 5
            if (r1 == r2) goto L_0x0037
            r2 = 3
            if (r1 != r2) goto L_0x0038
        L_0x0037:
            return r0
        L_0x0038:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bq.e():boolean");
    }
}
