package com.loc;

import android.os.Bundle;
import android.text.TextUtils;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.model.AMapLocationServer;

public final class cb {

    /* renamed from: a  reason: collision with root package name */
    AMapLocationClientOption f25626a = new AMapLocationClientOption();

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f25627b = new StringBuilder();

    private void a(AMapLocationServer aMapLocationServer, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str2) && (this.f25626a.getGeoLanguage() != AMapLocationClientOption.GeoLanguage.EN ? !str.contains("市") || !str.equals(str2) : !str2.equals(str))) {
            sb.append(str2);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(str4);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(str5);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str6)) {
            if (TextUtils.isEmpty(str7) || this.f25626a.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) {
                sb.append("Near ".concat(String.valueOf(str6)));
                str8 = "Near ".concat(String.valueOf(str6));
            } else {
                sb.append("靠近");
                sb.append(str6);
                sb.append(" ");
                str8 = "在" + str6 + "附近";
            }
            aMapLocationServer.setDescription(str8);
        }
        Bundle bundle = new Bundle();
        bundle.putString("citycode", aMapLocationServer.getCityCode());
        bundle.putString("desc", sb.toString());
        bundle.putString("adcode", aMapLocationServer.getAdCode());
        aMapLocationServer.setExtras(bundle);
        aMapLocationServer.g(sb.toString());
        String adCode = aMapLocationServer.getAdCode();
        aMapLocationServer.setAddress((adCode == null || adCode.trim().length() <= 0 || this.f25626a.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) ? sb.toString() : sb.toString().replace(" ", ""));
    }

    private static String b(String str) {
        return "[]".equals(str) ? "" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x022b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0282, code lost:
        r14.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d0, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011b, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014d, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017b, code lost:
        r2 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x01da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x01ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0165 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b6 A[Catch:{ Throwable -> 0x022d, all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c5 A[Catch:{ Throwable -> 0x022d, all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01f5 A[Catch:{ Throwable -> 0x022d, all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0204 A[Catch:{ Throwable -> 0x022d, all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0217 A[Catch:{ Throwable -> 0x0225, all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x022b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:29:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.autonavi.aps.amapapi.model.AMapLocationServer a(com.autonavi.aps.amapapi.model.AMapLocationServer r21, byte[] r22) {
        /*
            r20 = this;
            r10 = r20
            r0 = r21
            r11 = 5
            r13 = 0
            if (r22 != 0) goto L_0x002f
            r0.setErrorCode(r11)     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            java.lang.StringBuilder r1 = r10.f25627b     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            java.lang.String r2 = "binaryResult is null#0504"
            r1.append(r2)     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            java.lang.StringBuilder r1 = r10.f25627b     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            r0.setLocationDetail(r1)     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            java.lang.StringBuilder r1 = r10.f25627b     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            java.lang.StringBuilder r2 = r10.f25627b     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            int r2 = r2.length()     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            r1.delete(r13, r2)     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            r14 = 0
            goto L_0x0280
        L_0x002b:
            r0 = move-exception
            r12 = 0
            goto L_0x022f
        L_0x002f:
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r22)     // Catch:{ Throwable -> 0x002b, all -> 0x0027 }
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            if (r1 != 0) goto L_0x004d
            short r1 = r14.getShort()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r0.b((java.lang.String) r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.clear()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            if (r14 == 0) goto L_0x004c
            r14.clear()
        L_0x004c:
            return r0
        L_0x004d:
            int r1 = r14.getInt()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            double r1 = (double) r1
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            double r1 = com.loc.cn.a((double) r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r0.setLongitude(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            int r1 = r14.getInt()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            double r1 = com.loc.cn.a((double) r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r0.setLatitude(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            short r1 = r14.getShort()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            float r1 = (float) r1     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r0.setAccuracy(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r0.c(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r0.d(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r15 = 1
            if (r1 != r15) goto L_0x01a5
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            byte r8 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte[] r8 = new byte[r8]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r8)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x00ba, all -> 0x022b }
            java.lang.String r12 = "UTF-8"
            r9.<init>(r8, r12)     // Catch:{ Throwable -> 0x00ba, all -> 0x022b }
            r0.setCountry(r9)     // Catch:{ Throwable -> 0x00ba, all -> 0x022b }
        L_0x00ba:
            byte r8 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte[] r8 = new byte[r8]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r8)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x00d1, all -> 0x022b }
            java.lang.String r12 = "UTF-8"
            r9.<init>(r8, r12)     // Catch:{ Throwable -> 0x00d1, all -> 0x022b }
            r0.setProvince(r9)     // Catch:{ Throwable -> 0x00d0, all -> 0x022b }
            goto L_0x00d2
        L_0x00d0:
            r1 = r9
        L_0x00d1:
            r9 = r1
        L_0x00d2:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r8 = new java.lang.String     // Catch:{ Throwable -> 0x00e9, all -> 0x022b }
            java.lang.String r12 = "UTF-8"
            r8.<init>(r1, r12)     // Catch:{ Throwable -> 0x00e9, all -> 0x022b }
            r0.setCity(r8)     // Catch:{ Throwable -> 0x00e8, all -> 0x022b }
            goto L_0x00ea
        L_0x00e8:
            r2 = r8
        L_0x00e9:
            r8 = r2
        L_0x00ea:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0100, all -> 0x022b }
            java.lang.String r12 = "UTF-8"
            r2.<init>(r1, r12)     // Catch:{ Throwable -> 0x0100, all -> 0x022b }
            r0.setDistrict(r2)     // Catch:{ Throwable -> 0x0101, all -> 0x022b }
            goto L_0x0101
        L_0x0100:
            r2 = r3
        L_0x0101:
            r12 = r2
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x011b, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x011b, all -> 0x022b }
            r0.setStreet(r2)     // Catch:{ Throwable -> 0x011c, all -> 0x022b }
            r0.setRoad(r2)     // Catch:{ Throwable -> 0x011c, all -> 0x022b }
            goto L_0x011c
        L_0x011b:
            r2 = r4
        L_0x011c:
            r16 = r2
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0134, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x0134, all -> 0x022b }
            r0.setNumber(r2)     // Catch:{ Throwable -> 0x0135, all -> 0x022b }
            goto L_0x0135
        L_0x0134:
            r2 = r5
        L_0x0135:
            r17 = r2
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x014d, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x014d, all -> 0x022b }
            r0.setPoiName(r2)     // Catch:{ Throwable -> 0x014e, all -> 0x022b }
            goto L_0x014e
        L_0x014d:
            r2 = r6
        L_0x014e:
            r18 = r2
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0165, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x0165, all -> 0x022b }
            r0.setAoiName(r2)     // Catch:{ Throwable -> 0x0165, all -> 0x022b }
        L_0x0165:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x017b, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x017b, all -> 0x022b }
            r0.setAdCode(r2)     // Catch:{ Throwable -> 0x017c, all -> 0x022b }
            goto L_0x017c
        L_0x017b:
            r2 = r7
        L_0x017c:
            r19 = r2
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0193, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x0193, all -> 0x022b }
            r0.setCityCode(r2)     // Catch:{ Throwable -> 0x0193, all -> 0x022b }
        L_0x0193:
            r1 = r20
            r2 = r21
            r3 = r9
            r4 = r8
            r5 = r12
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
        L_0x01a5:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            if (r1 != r15) goto L_0x01bf
            r14.getInt()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.getInt()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.getShort()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
        L_0x01bf:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            if (r1 != r15) goto L_0x01ef
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x01da, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x01da, all -> 0x022b }
            r0.setBuildingId(r2)     // Catch:{ Throwable -> 0x01da, all -> 0x022b }
        L_0x01da:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x01ef, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x01ef, all -> 0x022b }
            r0.setFloor(r2)     // Catch:{ Throwable -> 0x01ef, all -> 0x022b }
        L_0x01ef:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            if (r1 != r15) goto L_0x01fe
            r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.getInt()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
        L_0x01fe:
            byte r1 = r14.get()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            if (r1 != r15) goto L_0x020b
            long r1 = r14.getLong()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r0.setTime(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
        L_0x020b:
            short r1 = r14.getShort()     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            r14.get(r1)     // Catch:{ Throwable -> 0x022d, all -> 0x022b }
            int r2 = r1.length     // Catch:{ Throwable -> 0x0225, all -> 0x022b }
            if (r2 <= 0) goto L_0x0225
            byte[] r1 = android.util.Base64.decode(r1, r13)     // Catch:{ Throwable -> 0x0225, all -> 0x022b }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0225, all -> 0x022b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x0225, all -> 0x022b }
            r0.a((java.lang.String) r2)     // Catch:{ Throwable -> 0x0225, all -> 0x022b }
        L_0x0225:
            if (r14 == 0) goto L_0x026a
            r14.clear()
            goto L_0x026a
        L_0x022b:
            r0 = move-exception
            goto L_0x0280
        L_0x022d:
            r0 = move-exception
            r12 = r14
        L_0x022f:
            com.autonavi.aps.amapapi.model.AMapLocationServer r1 = new com.autonavi.aps.amapapi.model.AMapLocationServer     // Catch:{ all -> 0x027e }
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch:{ all -> 0x027e }
            r1.setErrorCode(r11)     // Catch:{ all -> 0x027e }
            java.lang.StringBuilder r2 = r10.f25627b     // Catch:{ all -> 0x027e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "parser data error:"
            r3.<init>(r4)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x027e }
            r3.append(r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = "#0505"
            r3.append(r0)     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x027e }
            r2.append(r0)     // Catch:{ all -> 0x027e }
            r0 = 2054(0x806, float:2.878E-42)
            r2 = 0
            com.loc.cj.a((java.lang.String) r2, (int) r0)     // Catch:{ all -> 0x027e }
            java.lang.StringBuilder r0 = r10.f25627b     // Catch:{ all -> 0x027e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x027e }
            r1.setLocationDetail(r0)     // Catch:{ all -> 0x027e }
            if (r12 == 0) goto L_0x0269
            r12.clear()
        L_0x0269:
            r0 = r1
        L_0x026a:
            java.lang.StringBuilder r1 = r10.f25627b
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x027d
            java.lang.StringBuilder r1 = r10.f25627b
            java.lang.StringBuilder r2 = r10.f25627b
            int r2 = r2.length()
            r1.delete(r13, r2)
        L_0x027d:
            return r0
        L_0x027e:
            r0 = move-exception
            r14 = r12
        L_0x0280:
            if (r14 == 0) goto L_0x0285
            r14.clear()
        L_0x0285:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cb.a(com.autonavi.aps.amapapi.model.AMapLocationServer, byte[]):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083 A[Catch:{ Throwable -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088 A[Catch:{ Throwable -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d3 A[Catch:{ Throwable -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6 A[Catch:{ Throwable -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f3 A[Catch:{ Throwable -> 0x010b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.autonavi.aps.amapapi.model.AMapLocationServer a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 0
            com.autonavi.aps.amapapi.model.AMapLocationServer r10 = new com.autonavi.aps.amapapi.model.AMapLocationServer     // Catch:{ Throwable -> 0x010b }
            java.lang.String r1 = ""
            r10.<init>(r1)     // Catch:{ Throwable -> 0x010b }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x010b }
            r1.<init>(r13)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r13 = "regeocode"
            org.json.JSONObject r13 = r1.optJSONObject(r13)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r1 = "addressComponent"
            org.json.JSONObject r1 = r13.optJSONObject(r1)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "country"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = b(r2)     // Catch:{ Throwable -> 0x010b }
            r10.setCountry(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "province"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r3 = b(r2)     // Catch:{ Throwable -> 0x010b }
            r10.setProvince(r3)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "citycode"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = b(r2)     // Catch:{ Throwable -> 0x010b }
            r10.setCityCode(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r4 = "city"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r5 = "010"
            boolean r5 = r2.endsWith(r5)     // Catch:{ Throwable -> 0x010b }
            if (r5 != 0) goto L_0x006f
            java.lang.String r5 = "021"
            boolean r5 = r2.endsWith(r5)     // Catch:{ Throwable -> 0x010b }
            if (r5 != 0) goto L_0x006f
            java.lang.String r5 = "022"
            boolean r5 = r2.endsWith(r5)     // Catch:{ Throwable -> 0x010b }
            if (r5 != 0) goto L_0x006f
            java.lang.String r5 = "023"
            boolean r2 = r2.endsWith(r5)     // Catch:{ Throwable -> 0x010b }
            if (r2 == 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            java.lang.String r2 = b(r4)     // Catch:{ Throwable -> 0x010b }
            r10.setCity(r2)     // Catch:{ Throwable -> 0x010b }
            goto L_0x007d
        L_0x006f:
            if (r3 == 0) goto L_0x007c
            int r2 = r3.length()     // Catch:{ Throwable -> 0x010b }
            if (r2 <= 0) goto L_0x007c
            r10.setCity(r3)     // Catch:{ Throwable -> 0x010b }
            r2 = r3
            goto L_0x007d
        L_0x007c:
            r2 = r4
        L_0x007d:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x010b }
            if (r4 == 0) goto L_0x0088
            r10.setCity(r3)     // Catch:{ Throwable -> 0x010b }
            r4 = r3
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            java.lang.String r2 = "district"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r5 = b(r2)     // Catch:{ Throwable -> 0x010b }
            r10.setDistrict(r5)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "adcode"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r9 = b(r2)     // Catch:{ Throwable -> 0x010b }
            r10.setAdCode(r9)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "streetNumber"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "street"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r6 = b(r2)     // Catch:{ Throwable -> 0x010b }
            r10.setStreet(r6)     // Catch:{ Throwable -> 0x010b }
            r10.setRoad(r6)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "number"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r7 = b(r1)     // Catch:{ Throwable -> 0x010b }
            r10.setNumber(r7)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r1 = "pois"
            org.json.JSONArray r1 = r13.optJSONArray(r1)     // Catch:{ Throwable -> 0x010b }
            int r2 = r1.length()     // Catch:{ Throwable -> 0x010b }
            r8 = 0
            if (r2 <= 0) goto L_0x00e6
            org.json.JSONObject r1 = r1.getJSONObject(r8)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r2 = "name"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r1 = b(r1)     // Catch:{ Throwable -> 0x010b }
            r10.setPoiName(r1)     // Catch:{ Throwable -> 0x010b }
            r11 = r1
            goto L_0x00e7
        L_0x00e6:
            r11 = r0
        L_0x00e7:
            java.lang.String r1 = "aois"
            org.json.JSONArray r13 = r13.optJSONArray(r1)     // Catch:{ Throwable -> 0x010b }
            int r1 = r13.length()     // Catch:{ Throwable -> 0x010b }
            if (r1 <= 0) goto L_0x0104
            org.json.JSONObject r13 = r13.getJSONObject(r8)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r1 = "name"
            java.lang.String r13 = r13.optString(r1)     // Catch:{ Throwable -> 0x010b }
            java.lang.String r13 = b(r13)     // Catch:{ Throwable -> 0x010b }
            r10.setAoiName(r13)     // Catch:{ Throwable -> 0x010b }
        L_0x0104:
            r1 = r12
            r2 = r10
            r8 = r11
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x010b }
            return r10
        L_0x010b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cb.a(java.lang.String):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0050 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0091 A[Catch:{ Throwable -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.autonavi.aps.amapapi.model.AMapLocationServer a(java.lang.String r6, android.content.Context r7, com.loc.am r8) {
        /*
            r5 = this;
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = new com.autonavi.aps.amapapi.model.AMapLocationServer
            java.lang.String r1 = ""
            r0.<init>(r1)
            r1 = 7
            r0.setErrorCode(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "#SHA1AndPackage#"
            r1.append(r3)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r7 = com.loc.cy.e(r7)     // Catch:{ Throwable -> 0x0050 }
            r1.append(r7)     // Catch:{ Throwable -> 0x0050 }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r8.f25473b     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r3 = "gsid"
            java.lang.Object r7 = r7.get(r3)     // Catch:{ Throwable -> 0x0050 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ Throwable -> 0x0050 }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x0050 }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0050 }
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "#gsid#"
            r1.append(r3)     // Catch:{ Throwable -> 0x0050 }
            r1.append(r7)     // Catch:{ Throwable -> 0x0050 }
        L_0x003b:
            java.lang.String r7 = r8.f25474c     // Catch:{ Throwable -> 0x0050 }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0050 }
            if (r3 != 0) goto L_0x0050
            java.lang.String r3 = "#csid#"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r7 = r3.concat(r7)     // Catch:{ Throwable -> 0x0050 }
            r1.append(r7)     // Catch:{ Throwable -> 0x0050 }
        L_0x0050:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00a9 }
            r7.<init>(r6)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r3 = "status"
            boolean r3 = r7.has(r3)     // Catch:{ Throwable -> 0x00a9 }
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = "info"
            boolean r3 = r7.has(r3)     // Catch:{ Throwable -> 0x00a9 }
            if (r3 != 0) goto L_0x0077
        L_0x0065:
            java.lang.StringBuilder r3 = r5.f25627b     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r4 = "json is error:"
            r3.append(r4)     // Catch:{ Throwable -> 0x00a9 }
            r3.append(r6)     // Catch:{ Throwable -> 0x00a9 }
            r3.append(r1)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r6 = "#0702"
            r3.append(r6)     // Catch:{ Throwable -> 0x00a9 }
        L_0x0077:
            java.lang.String r6 = "status"
            java.lang.String r6 = r7.getString(r6)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r3 = "info"
            java.lang.String r3 = r7.getString(r3)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r4 = "infocode"
            java.lang.String r7 = r7.getString(r4)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r4 = "0"
            boolean r6 = r4.equals(r6)     // Catch:{ Throwable -> 0x00a9 }
            if (r6 == 0) goto L_0x00c7
            java.lang.StringBuilder r6 = r5.f25627b     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r4 = "auth fail:"
            r6.append(r4)     // Catch:{ Throwable -> 0x00a9 }
            r6.append(r3)     // Catch:{ Throwable -> 0x00a9 }
            r6.append(r1)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r4 = "#0701"
            r6.append(r4)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r6 = r8.f25475d     // Catch:{ Throwable -> 0x00a9 }
            com.loc.cj.a((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00c7
        L_0x00a9:
            r6 = move-exception
            java.lang.StringBuilder r7 = r5.f25627b
            java.lang.String r8 = "json exception error:"
            r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = "#0703"
            r7.append(r8)
            java.lang.String r7 = "parser"
            java.lang.String r8 = "paseAuthFailurJson"
            com.loc.ce.a(r6, r7, r8)
        L_0x00c7:
            java.lang.StringBuilder r6 = r5.f25627b
            java.lang.String r6 = r6.toString()
            r0.setLocationDetail(r6)
            java.lang.StringBuilder r6 = r5.f25627b
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x00e3
            java.lang.StringBuilder r6 = r5.f25627b
            java.lang.StringBuilder r7 = r5.f25627b
            int r7 = r7.length()
            r6.delete(r2, r7)
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cb.a(java.lang.String, android.content.Context, com.loc.am):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }
}
