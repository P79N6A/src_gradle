package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public final class fr {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f6174a = new StringBuilder();

    public final fi a(String str, Context context, ex exVar) {
        fi fiVar = new fi("");
        fiVar.setErrorCode(7);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status") || !jSONObject.has("info")) {
                this.f6174a.append("json is error ".concat(String.valueOf(str)));
            }
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("info");
            if (string.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
                this.f6174a.append("auth fail:".concat(String.valueOf(string2)));
            }
        } catch (Throwable th) {
            StringBuilder sb = this.f6174a;
            sb.append("json exception error:" + th.getMessage());
            gc.a(th, "parser", "paseAuthFailurJson");
        }
        try {
            StringBuilder sb2 = this.f6174a;
            sb2.append("#SHA1AndPackage#");
            sb2.append(cp.e(context));
            String str2 = (String) exVar.f6095b.get("gsid").get(0);
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb3 = this.f6174a;
                sb3.append(" #gsid#");
                sb3.append(str2);
            }
            String str3 = exVar.f6096c;
            if (!TextUtils.isEmpty(str3)) {
                this.f6174a.append(" #csid#".concat(String.valueOf(str3)));
            }
        } catch (Throwable unused) {
        }
        fiVar.setLocationDetail(this.f6174a.toString());
        if (this.f6174a.length() > 0) {
            this.f6174a.delete(0, this.f6174a.length());
        }
        return fiVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(62:23|24|25|26|27|28|29|30|31|34|35|36|37|38|39|42|43|44|45|46|47|50|51|52|53|54|55|58|59|60|61|62|63|(4:64|65|66|67)|70|71|72|73|74|75|76|77|78|79|82|83|84|85|86|87|(1:89)|90|(1:96)|97|(1:99)|100|(1:102)|103|(3:105|(1:107)|108)|109|(1:115)(1:113)|114) */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ac, code lost:
        if (r15 != null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ae, code lost:
        r15.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b2, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e6, code lost:
        if (r15 != null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ef, code lost:
        if (r14.f6174a.length() <= 0) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f1, code lost:
        r14.f6174a.delete(0, r14.f6174a.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02fc, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x0268 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x027d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0113 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0128 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x013f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0154 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x016b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0180 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c3 A[Catch:{ Throwable -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d1 A[Catch:{ Throwable -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0214 A[Catch:{ Throwable -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0283 A[Catch:{ Throwable -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0292 A[Catch:{ Throwable -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018b A[Catch:{ Throwable -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b5 A[Catch:{ Throwable -> 0x02b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.amap.api.mapcore2d.fi a(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 5
            r2 = 0
            com.amap.api.mapcore2d.fi r3 = new com.amap.api.mapcore2d.fi     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            java.lang.String r4 = ""
            r3.<init>(r4)     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            if (r15 != 0) goto L_0x002b
            r3.setErrorCode(r1)     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            java.lang.StringBuilder r15 = r14.f6174a     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            java.lang.String r4 = "byte[] is null"
            r15.append(r4)     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            java.lang.StringBuilder r15 = r14.f6174a     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            java.lang.String r15 = r15.toString()     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            r3.setLocationDetail(r15)     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            java.lang.StringBuilder r15 = r14.f6174a     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            java.lang.StringBuilder r4 = r14.f6174a     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            int r4 = r4.length()     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            r15.delete(r0, r4)     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            return r3
        L_0x002b:
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.wrap(r15)     // Catch:{ Throwable -> 0x02b8, all -> 0x02b4 }
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            if (r2 != 0) goto L_0x0049
            short r2 = r15.getShort()     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x02b2 }
            r3.b(r2)     // Catch:{ Throwable -> 0x02b2 }
            r15.clear()     // Catch:{ Throwable -> 0x02b2 }
            if (r15 == 0) goto L_0x0048
            r15.clear()
        L_0x0048:
            return r3
        L_0x0049:
            int r2 = r15.getInt()     // Catch:{ Throwable -> 0x02b2 }
            double r4 = (double) r2
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r6
            double r4 = com.amap.api.mapcore2d.gf.a((double) r4)     // Catch:{ Throwable -> 0x02b2 }
            r3.setLongitude(r4)     // Catch:{ Throwable -> 0x02b2 }
            int r2 = r15.getInt()     // Catch:{ Throwable -> 0x02b2 }
            double r4 = (double) r2
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r6
            double r4 = com.amap.api.mapcore2d.gf.a((double) r4)     // Catch:{ Throwable -> 0x02b2 }
            r3.setLatitude(r4)     // Catch:{ Throwable -> 0x02b2 }
            short r2 = r15.getShort()     // Catch:{ Throwable -> 0x02b2 }
            float r2 = (float) r2     // Catch:{ Throwable -> 0x02b2 }
            r3.setAccuracy(r2)     // Catch:{ Throwable -> 0x02b2 }
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x02b2 }
            r3.c(r2)     // Catch:{ Throwable -> 0x02b2 }
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x02b2 }
            r3.d(r2)     // Catch:{ Throwable -> 0x02b2 }
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r4 = 1
            if (r2 != r4) goto L_0x0233
            java.lang.String r2 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            byte r10 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte[] r10 = new byte[r10]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r10)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r11 = new java.lang.String     // Catch:{ Throwable -> 0x00b4 }
            java.lang.String r12 = "UTF-8"
            r11.<init>(r10, r12)     // Catch:{ Throwable -> 0x00b4 }
            r3.setCountry(r11)     // Catch:{ Throwable -> 0x00b4 }
        L_0x00b4:
            byte r10 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte[] r10 = new byte[r10]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r10)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r11 = new java.lang.String     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r12 = "UTF-8"
            r11.<init>(r10, r12)     // Catch:{ Throwable -> 0x00ca }
            r3.setProvince(r11)     // Catch:{ Throwable -> 0x00cb }
            goto L_0x00cb
        L_0x00ca:
            r11 = r2
        L_0x00cb:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r10 = new java.lang.String     // Catch:{ Throwable -> 0x00e1 }
            java.lang.String r12 = "UTF-8"
            r10.<init>(r2, r12)     // Catch:{ Throwable -> 0x00e1 }
            r3.setCity(r10)     // Catch:{ Throwable -> 0x00e2 }
            goto L_0x00e2
        L_0x00e1:
            r10 = r5
        L_0x00e2:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r12 = "UTF-8"
            r5.<init>(r2, r12)     // Catch:{ Throwable -> 0x00f8 }
            r3.setDistrict(r5)     // Catch:{ Throwable -> 0x00f9 }
            goto L_0x00f9
        L_0x00f8:
            r5 = r6
        L_0x00f9:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r6 = new java.lang.String     // Catch:{ Throwable -> 0x0112 }
            java.lang.String r12 = "UTF-8"
            r6.<init>(r2, r12)     // Catch:{ Throwable -> 0x0112 }
            r3.setStreet(r6)     // Catch:{ Throwable -> 0x0113 }
            r3.setRoad(r6)     // Catch:{ Throwable -> 0x0113 }
            goto L_0x0113
        L_0x0112:
            r6 = r7
        L_0x0113:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r7 = new java.lang.String     // Catch:{ Throwable -> 0x0128 }
            java.lang.String r12 = "UTF-8"
            r7.<init>(r2, r12)     // Catch:{ Throwable -> 0x0128 }
            r3.setNumber(r7)     // Catch:{ Throwable -> 0x0128 }
        L_0x0128:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r7 = new java.lang.String     // Catch:{ Throwable -> 0x013e }
            java.lang.String r12 = "UTF-8"
            r7.<init>(r2, r12)     // Catch:{ Throwable -> 0x013e }
            r3.setPoiName(r7)     // Catch:{ Throwable -> 0x013f }
            goto L_0x013f
        L_0x013e:
            r7 = r8
        L_0x013f:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r8 = new java.lang.String     // Catch:{ Throwable -> 0x0154 }
            java.lang.String r12 = "UTF-8"
            r8.<init>(r2, r12)     // Catch:{ Throwable -> 0x0154 }
            r3.setAoiName(r8)     // Catch:{ Throwable -> 0x0154 }
        L_0x0154:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r8 = new java.lang.String     // Catch:{ Throwable -> 0x016a }
            java.lang.String r12 = "UTF-8"
            r8.<init>(r2, r12)     // Catch:{ Throwable -> 0x016a }
            r3.setAdCode(r8)     // Catch:{ Throwable -> 0x016b }
            goto L_0x016b
        L_0x016a:
            r8 = r9
        L_0x016b:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x0180 }
            java.lang.String r12 = "UTF-8"
            r9.<init>(r2, r12)     // Catch:{ Throwable -> 0x0180 }
            r3.setCityCode(r9)     // Catch:{ Throwable -> 0x0180 }
        L_0x0180:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02b2 }
            r2.<init>()     // Catch:{ Throwable -> 0x02b2 }
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x02b2 }
            if (r9 != 0) goto L_0x0193
            r2.append(r11)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r9 = " "
            r2.append(r9)     // Catch:{ Throwable -> 0x02b2 }
        L_0x0193:
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x02b2 }
            if (r9 != 0) goto L_0x01af
            java.lang.String r9 = "市"
            boolean r9 = r11.contains(r9)     // Catch:{ Throwable -> 0x02b2 }
            if (r9 == 0) goto L_0x01a7
            boolean r9 = r11.equals(r10)     // Catch:{ Throwable -> 0x02b2 }
            if (r9 != 0) goto L_0x01af
        L_0x01a7:
            r2.append(r10)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r9 = " "
            r2.append(r9)     // Catch:{ Throwable -> 0x02b2 }
        L_0x01af:
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x02b2 }
            if (r9 != 0) goto L_0x01bd
            r2.append(r5)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = " "
            r2.append(r5)     // Catch:{ Throwable -> 0x02b2 }
        L_0x01bd:
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x02b2 }
            if (r5 != 0) goto L_0x01cb
            r2.append(r6)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = " "
            r2.append(r5)     // Catch:{ Throwable -> 0x02b2 }
        L_0x01cb:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x02b2 }
            if (r5 != 0) goto L_0x01e4
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x02b2 }
            if (r5 != 0) goto L_0x01dc
            java.lang.String r5 = "靠近"
            r2.append(r5)     // Catch:{ Throwable -> 0x02b2 }
        L_0x01dc:
            r2.append(r7)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = " "
            r2.append(r5)     // Catch:{ Throwable -> 0x02b2 }
        L_0x01e4:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ Throwable -> 0x02b2 }
            r5.<init>()     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r6 = "citycode"
            java.lang.String r7 = r3.getCityCode()     // Catch:{ Throwable -> 0x02b2 }
            r5.putString(r6, r7)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r6 = "desc"
            java.lang.String r7 = r2.toString()     // Catch:{ Throwable -> 0x02b2 }
            r5.putString(r6, r7)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r6 = "adcode"
            java.lang.String r7 = r3.getAdCode()     // Catch:{ Throwable -> 0x02b2 }
            r5.putString(r6, r7)     // Catch:{ Throwable -> 0x02b2 }
            r3.setExtras(r5)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = r2.toString()     // Catch:{ Throwable -> 0x02b2 }
            r3.e(r5)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = r3.getAdCode()     // Catch:{ Throwable -> 0x02b2 }
            if (r5 == 0) goto L_0x022e
            java.lang.String r5 = r5.trim()     // Catch:{ Throwable -> 0x02b2 }
            int r5 = r5.length()     // Catch:{ Throwable -> 0x02b2 }
            if (r5 <= 0) goto L_0x022e
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = " "
            java.lang.String r6 = ""
            java.lang.String r2 = r2.replace(r5, r6)     // Catch:{ Throwable -> 0x02b2 }
        L_0x022a:
            r3.setAddress(r2)     // Catch:{ Throwable -> 0x02b2 }
            goto L_0x0233
        L_0x022e:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x02b2 }
            goto L_0x022a
        L_0x0233:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            if (r2 != r4) goto L_0x024d
            r15.getInt()     // Catch:{ Throwable -> 0x02b2 }
            r15.getInt()     // Catch:{ Throwable -> 0x02b2 }
            r15.getShort()     // Catch:{ Throwable -> 0x02b2 }
        L_0x024d:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            if (r2 != r4) goto L_0x027d
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Throwable -> 0x0268 }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r2, r6)     // Catch:{ Throwable -> 0x0268 }
            r3.setBuildingId(r5)     // Catch:{ Throwable -> 0x0268 }
        L_0x0268:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Throwable -> 0x027d }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r2, r6)     // Catch:{ Throwable -> 0x027d }
            r3.setFloor(r5)     // Catch:{ Throwable -> 0x027d }
        L_0x027d:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            if (r2 != r4) goto L_0x028c
            r15.get()     // Catch:{ Throwable -> 0x02b2 }
            r15.getInt()     // Catch:{ Throwable -> 0x02b2 }
            r15.get()     // Catch:{ Throwable -> 0x02b2 }
        L_0x028c:
            byte r2 = r15.get()     // Catch:{ Throwable -> 0x02b2 }
            if (r2 != r4) goto L_0x0299
            long r4 = r15.getLong()     // Catch:{ Throwable -> 0x02b2 }
            r3.setTime(r4)     // Catch:{ Throwable -> 0x02b2 }
        L_0x0299:
            short r2 = r15.getShort()     // Catch:{ Throwable -> 0x02b2 }
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x02b2 }
            r15.get(r2)     // Catch:{ Throwable -> 0x02b2 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x02ac }
            java.lang.String r4 = "UTF-8"
            r1.<init>(r2, r4)     // Catch:{ Throwable -> 0x02ac }
            r3.a(r1)     // Catch:{ Throwable -> 0x02ac }
        L_0x02ac:
            if (r15 == 0) goto L_0x02e9
        L_0x02ae:
            r15.clear()
            goto L_0x02e9
        L_0x02b2:
            r2 = move-exception
            goto L_0x02bc
        L_0x02b4:
            r15 = move-exception
            r0 = r15
            r15 = r2
            goto L_0x02fe
        L_0x02b8:
            r15 = move-exception
            r13 = r2
            r2 = r15
            r15 = r13
        L_0x02bc:
            com.amap.api.mapcore2d.fi r3 = new com.amap.api.mapcore2d.fi     // Catch:{ all -> 0x02fd }
            java.lang.String r4 = ""
            r3.<init>(r4)     // Catch:{ all -> 0x02fd }
            r3.setErrorCode(r1)     // Catch:{ all -> 0x02fd }
            java.lang.StringBuilder r1 = r14.f6174a     // Catch:{ all -> 0x02fd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fd }
            java.lang.String r5 = "parser data error:"
            r4.<init>(r5)     // Catch:{ all -> 0x02fd }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x02fd }
            r4.append(r2)     // Catch:{ all -> 0x02fd }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x02fd }
            r1.append(r2)     // Catch:{ all -> 0x02fd }
            java.lang.StringBuilder r1 = r14.f6174a     // Catch:{ all -> 0x02fd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02fd }
            r3.setLocationDetail(r1)     // Catch:{ all -> 0x02fd }
            if (r15 == 0) goto L_0x02e9
            goto L_0x02ae
        L_0x02e9:
            java.lang.StringBuilder r15 = r14.f6174a
            int r15 = r15.length()
            if (r15 <= 0) goto L_0x02fc
            java.lang.StringBuilder r15 = r14.f6174a
            java.lang.StringBuilder r1 = r14.f6174a
            int r1 = r1.length()
            r15.delete(r0, r1)
        L_0x02fc:
            return r3
        L_0x02fd:
            r0 = move-exception
        L_0x02fe:
            if (r15 == 0) goto L_0x0303
            r15.clear()
        L_0x0303:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fr.a(byte[]):com.amap.api.mapcore2d.fi");
    }
}
