package com.amap.api.services.a;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.amap.api.services.nearby.UploadInfo;
import com.amap.api.services.nearby.UploadInfoCallback;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class aw implements INearbySearch {

    /* renamed from: e  reason: collision with root package name */
    private static long f6506e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List<NearbySearch.NearbyListener> f6507a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private String f6508b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6509c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public s f6510d;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f6511f;
    private LatLonPoint g = null;
    private String h = null;
    private boolean i = false;
    private Timer j = new Timer();
    /* access modifiers changed from: private */
    public UploadInfoCallback k;
    private TimerTask l;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    class a extends TimerTask {
        public void run() {
            try {
                if (aw.this.k != null) {
                    int b2 = aw.this.b(aw.this.k.OnUploadInfoCallback());
                    Message obtainMessage = aw.this.f6510d.obtainMessage();
                    obtainMessage.arg1 = 10;
                    obtainMessage.obj = aw.this.f6507a;
                    obtainMessage.what = b2;
                    aw.this.f6510d.sendMessage(obtainMessage);
                }
            } catch (Throwable th) {
                j.a(th, "NearbySearch", "UpdateDataTask");
            }
        }

        private a() {
        }
    }

    public void clearUserInfoAsyn() {
        try {
            ai.a().a(new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
                    if (com.amap.api.services.a.aw.a(r4.f6512a) == null) goto L_0x004a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
                    if (com.amap.api.services.a.aw.a(r4.f6512a) != null) goto L_0x0027;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
                    com.amap.api.services.a.aw.a(r4.f6512a).sendMessage(r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r4 = this;
                        com.amap.api.services.a.aw r0 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r0 = r0.f6510d
                        android.os.Message r0 = r0.obtainMessage()
                        r1 = 8
                        r0.arg1 = r1
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this
                        java.util.List r1 = r1.f6507a
                        r0.obj = r1
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this     // Catch:{ AMapException -> 0x0033 }
                        int unused = r1.a()     // Catch:{ AMapException -> 0x0033 }
                        r1 = 1000(0x3e8, float:1.401E-42)
                        r0.what = r1     // Catch:{ AMapException -> 0x0033 }
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r1 = r1.f6510d
                        if (r1 == 0) goto L_0x004a
                    L_0x0027:
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r1 = r1.f6510d
                        r1.sendMessage(r0)
                        return
                    L_0x0031:
                        r1 = move-exception
                        goto L_0x004b
                    L_0x0033:
                        r1 = move-exception
                        int r2 = r1.getErrorCode()     // Catch:{ all -> 0x0031 }
                        r0.what = r2     // Catch:{ all -> 0x0031 }
                        java.lang.String r2 = "NearbySearch"
                        java.lang.String r3 = "clearUserInfoAsyn"
                        com.amap.api.services.a.j.a(r1, r2, r3)     // Catch:{ all -> 0x0031 }
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r1 = r1.f6510d
                        if (r1 == 0) goto L_0x004a
                        goto L_0x0027
                    L_0x004a:
                        return
                    L_0x004b:
                        com.amap.api.services.a.aw r2 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r2 = r2.f6510d
                        if (r2 == 0) goto L_0x005c
                        com.amap.api.services.a.aw r2 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r2 = r2.f6510d
                        r2.sendMessage(r0)
                    L_0x005c:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.aw.AnonymousClass1.run():void");
                }
            });
        } catch (Throwable th) {
            j.a(th, "NearbySearch", "clearUserInfoAsynThrowable");
        }
    }

    public synchronized void destroy() {
        try {
            this.j.cancel();
        } catch (Throwable th) {
            j.a(th, "NearbySearch", "destryoy");
        }
    }

    public synchronized void stopUploadNearbyInfoAuto() {
        try {
            if (this.l != null) {
                this.l.cancel();
            }
        } catch (Throwable th) {
            j.a(th, "NearbySearch", "stopUploadNearbyInfoAuto");
        }
        this.i = false;
        this.l = null;
    }

    /* access modifiers changed from: private */
    public int a() throws AMapException {
        try {
            if (this.i) {
                throw new AMapException("已开启自动上传");
            } else if (a(this.f6508b)) {
                q.a(this.f6509c);
                return ((Integer) new t(this.f6509c, this.f6508b).c()).intValue();
            } else {
                throw new AMapException("USERID非法");
            }
        } catch (AMapException e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new AMapException("未知错误");
        }
    }

    public void setUserID(String str) {
        this.f6508b = str;
    }

    /* access modifiers changed from: private */
    public int a(UploadInfo uploadInfo) {
        if (this.i) {
            return PushConstants.EXPIRE_NOTIFICATION;
        }
        return b(uploadInfo);
    }

    private boolean a(NearbySearch.NearbyQuery nearbyQuery) {
        if (nearbyQuery == null || nearbyQuery.getCenterPoint() == null) {
            return false;
        }
        return true;
    }

    public synchronized void addNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        try {
            this.f6507a.add(nearbyListener);
        } catch (Throwable th) {
            j.a(th, "NearbySearch", "addNearbyListener");
        }
    }

    public synchronized void removeNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        if (nearbyListener != null) {
            try {
                this.f6507a.remove(nearbyListener);
            } catch (Throwable th) {
                j.a(th, "NearbySearch", "removeNearbyListener");
            }
        }
    }

    public void searchNearbyInfoAsyn(final NearbySearch.NearbyQuery nearbyQuery) {
        try {
            ai.a().a(new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
                    if (com.amap.api.services.a.aw.a(r4.f6516b) == null) goto L_0x0056;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
                    if (com.amap.api.services.a.aw.a(r4.f6516b) != null) goto L_0x0033;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
                    com.amap.api.services.a.aw.a(r4.f6516b).sendMessage(r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r4 = this;
                        com.amap.api.services.a.aw r0 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r0 = r0.f6510d
                        android.os.Message r0 = r0.obtainMessage()
                        r1 = 9
                        r0.arg1 = r1
                        com.amap.api.services.a.s$f r1 = new com.amap.api.services.a.s$f
                        r1.<init>()
                        com.amap.api.services.a.aw r2 = com.amap.api.services.a.aw.this
                        java.util.List r2 = r2.f6507a
                        r1.f6895a = r2
                        r0.obj = r1
                        com.amap.api.services.a.aw r2 = com.amap.api.services.a.aw.this     // Catch:{ AMapException -> 0x003f }
                        com.amap.api.services.nearby.NearbySearch$NearbyQuery r3 = r3     // Catch:{ AMapException -> 0x003f }
                        com.amap.api.services.nearby.NearbySearchResult r2 = r2.searchNearbyInfo(r3)     // Catch:{ AMapException -> 0x003f }
                        r1.f6896b = r2     // Catch:{ AMapException -> 0x003f }
                        r1 = 1000(0x3e8, float:1.401E-42)
                        r0.what = r1     // Catch:{ AMapException -> 0x003f }
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r1 = r1.f6510d
                        if (r1 == 0) goto L_0x0056
                    L_0x0033:
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r1 = r1.f6510d
                        r1.sendMessage(r0)
                        return
                    L_0x003d:
                        r1 = move-exception
                        goto L_0x0057
                    L_0x003f:
                        r1 = move-exception
                        int r2 = r1.getErrorCode()     // Catch:{ all -> 0x003d }
                        r0.what = r2     // Catch:{ all -> 0x003d }
                        java.lang.String r2 = "NearbySearch"
                        java.lang.String r3 = "searchNearbyInfoAsyn"
                        com.amap.api.services.a.j.a(r1, r2, r3)     // Catch:{ all -> 0x003d }
                        com.amap.api.services.a.aw r1 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r1 = r1.f6510d
                        if (r1 == 0) goto L_0x0056
                        goto L_0x0033
                    L_0x0056:
                        return
                    L_0x0057:
                        com.amap.api.services.a.aw r2 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r2 = r2.f6510d
                        if (r2 == 0) goto L_0x0068
                        com.amap.api.services.a.aw r2 = com.amap.api.services.a.aw.this
                        com.amap.api.services.a.s r2 = r2.f6510d
                        r2.sendMessage(r0)
                    L_0x0068:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.aw.AnonymousClass3.run():void");
                }
            });
        } catch (Throwable th) {
            j.a(th, "NearbySearch", "searchNearbyInfoAsynThrowable");
        }
    }

    public void uploadNearbyInfoAsyn(final UploadInfo uploadInfo) {
        if (this.f6511f == null) {
            this.f6511f = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();
        }
        this.f6511f.submit(new Runnable() {
            public void run() {
                try {
                    Message obtainMessage = aw.this.f6510d.obtainMessage();
                    obtainMessage.arg1 = 10;
                    obtainMessage.obj = aw.this.f6507a;
                    obtainMessage.what = aw.this.a(uploadInfo);
                    aw.this.f6510d.sendMessage(obtainMessage);
                } catch (Throwable th) {
                    j.a(th, "NearbySearch", "uploadNearbyInfoAsyn");
                }
            }
        });
    }

    public aw(Context context) {
        this.f6509c = context.getApplicationContext();
        this.f6510d = s.a();
    }

    public NearbySearchResult searchNearbyInfo(NearbySearch.NearbyQuery nearbyQuery) throws AMapException {
        try {
            q.a(this.f6509c);
            if (a(nearbyQuery)) {
                return (NearbySearchResult) new u(this.f6509c, nearbyQuery).c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            throw e2;
        } catch (Throwable th) {
            j.a(th, "NearbySearch", "searchNearbyInfo");
            throw new AMapException("未知错误");
        }
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[a-z0-9A-Z_-]{1,32}$").matcher(str).find();
    }

    /* access modifiers changed from: private */
    public int b(UploadInfo uploadInfo) {
        try {
            q.a(this.f6509c);
            if (uploadInfo == null) {
                return PushConstants.DELAY_NOTIFICATION;
            }
            long time = new Date().getTime();
            if (time - f6506e < 6500) {
                return 2203;
            }
            f6506e = time;
            String userID = uploadInfo.getUserID();
            if (!a(userID)) {
                return PushConstants.ONTIME_NOTIFICATION;
            }
            if (TextUtils.isEmpty(this.h)) {
                this.h = userID;
            }
            if (!userID.equals(this.h)) {
                return PushConstants.ONTIME_NOTIFICATION;
            }
            LatLonPoint point = uploadInfo.getPoint();
            if (point != null) {
                if (!point.equals(this.g)) {
                    new v(this.f6509c, uploadInfo).c();
                    this.g = point.copy();
                    return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                }
            }
            return 2204;
        } catch (AMapException e2) {
            return e2.getErrorCode();
        } catch (Throwable unused) {
            return 1900;
        }
    }

    public synchronized void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i2) {
        if (i2 < 7000) {
            i2 = 7000;
        }
        try {
            this.k = uploadInfoCallback;
            if (this.i && this.l != null) {
                this.l.cancel();
            }
            this.i = true;
            this.l = new a();
            this.j.schedule(this.l, 0, (long) i2);
        } catch (Throwable th) {
            j.a(th, "NearbySearch", "startUploadNearbyInfoAuto");
        }
    }
}
