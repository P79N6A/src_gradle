package com.amap.api.services.a;

import android.content.Context;
import android.os.Handler;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.interfaces.IDistrictSearch;
import java.util.HashMap;

public class at implements IDistrictSearch {

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<Integer, DistrictResult> f6487f;

    /* renamed from: a  reason: collision with root package name */
    private Context f6488a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public DistrictSearchQuery f6489b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public DistrictSearch.OnDistrictSearchListener f6490c;

    /* renamed from: d  reason: collision with root package name */
    private DistrictSearchQuery f6491d;

    /* renamed from: e  reason: collision with root package name */
    private int f6492e;
    /* access modifiers changed from: private */
    public Handler g = s.a();

    public DistrictSearchQuery getQuery() {
        return this.f6489b;
    }

    public void searchDistrictAnsy() {
        searchDistrictAsyn();
    }

    private boolean a() {
        if (this.f6489b == null) {
            return false;
        }
        return true;
    }

    public void searchDistrictAsyn() {
        try {
            ai.a().a(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
                /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r7 = this;
                        com.amap.api.services.a.s r0 = com.amap.api.services.a.s.a()
                        android.os.Message r0 = r0.obtainMessage()
                        com.amap.api.services.district.DistrictResult r1 = new com.amap.api.services.district.DistrictResult
                        r1.<init>()
                        com.amap.api.services.a.at r2 = com.amap.api.services.a.at.this
                        com.amap.api.services.district.DistrictSearchQuery r2 = r2.f6489b
                        r1.setQuery(r2)
                        r2 = 4
                        com.amap.api.services.a.at r3 = com.amap.api.services.a.at.this     // Catch:{ AMapException -> 0x008e, Throwable -> 0x005a, all -> 0x0055 }
                        com.amap.api.services.district.DistrictResult r3 = r3.searchDistrict()     // Catch:{ AMapException -> 0x008e, Throwable -> 0x005a, all -> 0x0055 }
                        if (r3 == 0) goto L_0x002c
                        com.amap.api.services.core.AMapException r1 = new com.amap.api.services.core.AMapException     // Catch:{ AMapException -> 0x002a, Throwable -> 0x0028 }
                        r1.<init>()     // Catch:{ AMapException -> 0x002a, Throwable -> 0x0028 }
                        r3.setAMapException(r1)     // Catch:{ AMapException -> 0x002a, Throwable -> 0x0028 }
                        goto L_0x002c
                    L_0x0028:
                        r1 = move-exception
                        goto L_0x005e
                    L_0x002a:
                        r1 = move-exception
                        goto L_0x0092
                    L_0x002c:
                        r0.arg1 = r2
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r1 = r1.f6490c
                        r0.obj = r1
                        android.os.Bundle r1 = new android.os.Bundle
                        r1.<init>()
                        java.lang.String r2 = "result"
                        r1.putParcelable(r2, r3)
                        r0.setData(r1)
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        android.os.Handler r1 = r1.g
                        if (r1 == 0) goto L_0x0054
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        android.os.Handler r1 = r1.g
                        r1.sendMessage(r0)
                    L_0x0054:
                        return
                    L_0x0055:
                        r3 = move-exception
                        r6 = r3
                        r3 = r1
                        r1 = r6
                        goto L_0x00bf
                    L_0x005a:
                        r3 = move-exception
                        r6 = r3
                        r3 = r1
                        r1 = r6
                    L_0x005e:
                        java.lang.String r4 = "DistrictSearch"
                        java.lang.String r5 = "searchDistrictAnsyThrowable"
                        com.amap.api.services.a.j.a(r1, r4, r5)     // Catch:{ all -> 0x00be }
                        r0.arg1 = r2
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r1 = r1.f6490c
                        r0.obj = r1
                        android.os.Bundle r1 = new android.os.Bundle
                        r1.<init>()
                        java.lang.String r2 = "result"
                        r1.putParcelable(r2, r3)
                        r0.setData(r1)
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        android.os.Handler r1 = r1.g
                        if (r1 == 0) goto L_0x008d
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        android.os.Handler r1 = r1.g
                        r1.sendMessage(r0)
                    L_0x008d:
                        return
                    L_0x008e:
                        r3 = move-exception
                        r6 = r3
                        r3 = r1
                        r1 = r6
                    L_0x0092:
                        r3.setAMapException(r1)     // Catch:{ all -> 0x00be }
                        r0.arg1 = r2
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r1 = r1.f6490c
                        r0.obj = r1
                        android.os.Bundle r1 = new android.os.Bundle
                        r1.<init>()
                        java.lang.String r2 = "result"
                        r1.putParcelable(r2, r3)
                        r0.setData(r1)
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        android.os.Handler r1 = r1.g
                        if (r1 == 0) goto L_0x00bd
                        com.amap.api.services.a.at r1 = com.amap.api.services.a.at.this
                        android.os.Handler r1 = r1.g
                        r1.sendMessage(r0)
                    L_0x00bd:
                        return
                    L_0x00be:
                        r1 = move-exception
                    L_0x00bf:
                        r0.arg1 = r2
                        com.amap.api.services.a.at r2 = com.amap.api.services.a.at.this
                        com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r2 = r2.f6490c
                        r0.obj = r2
                        android.os.Bundle r2 = new android.os.Bundle
                        r2.<init>()
                        java.lang.String r4 = "result"
                        r2.putParcelable(r4, r3)
                        r0.setData(r2)
                        com.amap.api.services.a.at r2 = com.amap.api.services.a.at.this
                        android.os.Handler r2 = r2.g
                        if (r2 == 0) goto L_0x00e7
                        com.amap.api.services.a.at r2 = com.amap.api.services.a.at.this
                        android.os.Handler r2 = r2.g
                        r2.sendMessage(r0)
                    L_0x00e7:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.at.AnonymousClass1.run():void");
                }
            });
        } catch (Throwable unused) {
        }
    }

    public DistrictResult searchDistrict() throws AMapException {
        DistrictResult districtResult;
        try {
            DistrictResult districtResult2 = new DistrictResult();
            q.a(this.f6488a);
            if (!a()) {
                this.f6489b = new DistrictSearchQuery();
            }
            districtResult2.setQuery(this.f6489b.clone());
            if (!this.f6489b.weakEquals(this.f6491d)) {
                this.f6492e = 0;
                this.f6491d = this.f6489b.clone();
                if (f6487f != null) {
                    f6487f.clear();
                }
            }
            if (this.f6492e == 0) {
                districtResult = (DistrictResult) new l(this.f6488a, this.f6489b.clone()).c();
                if (districtResult == null) {
                    return districtResult;
                }
                this.f6492e = districtResult.getPageCount();
                a(districtResult);
            } else {
                districtResult = a(this.f6489b.getPageNum());
                if (districtResult == null) {
                    districtResult = (DistrictResult) new l(this.f6488a, this.f6489b.clone()).c();
                    if (this.f6489b != null) {
                        if (districtResult != null) {
                            if (this.f6492e > 0 && this.f6492e > this.f6489b.getPageNum()) {
                                f6487f.put(Integer.valueOf(this.f6489b.getPageNum()), districtResult);
                            }
                        }
                    }
                    return districtResult;
                }
            }
            return districtResult;
        } catch (AMapException e2) {
            j.a(e2, "DistrictSearch", "searchDistrict");
            throw e2;
        }
    }

    public void setOnDistrictSearchListener(DistrictSearch.OnDistrictSearchListener onDistrictSearchListener) {
        this.f6490c = onDistrictSearchListener;
    }

    public void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f6489b = districtSearchQuery;
    }

    public at(Context context) {
        this.f6488a = context.getApplicationContext();
    }

    private boolean b(int i) {
        if (i >= this.f6492e || i < 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public DistrictResult a(int i) throws AMapException {
        if (b(i)) {
            return f6487f.get(Integer.valueOf(i));
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    private void a(DistrictResult districtResult) {
        f6487f = new HashMap<>();
        if (this.f6489b != null && districtResult != null && this.f6492e > 0 && this.f6492e > this.f6489b.getPageNum()) {
            f6487f.put(Integer.valueOf(this.f6489b.getPageNum()), districtResult);
        }
    }
}
