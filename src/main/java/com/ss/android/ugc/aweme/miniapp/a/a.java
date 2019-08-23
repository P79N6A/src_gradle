package com.ss.android.ugc.aweme.miniapp.a;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.excitingvideo.IDownloadListener;
import com.ss.android.excitingvideo.IDownloadStatus;
import com.ss.android.excitingvideo.model.BaseAd;
import com.ss.android.ugc.aweme.miniapp.c.a.b;
import com.ss.android.ugc.aweme.miniapp.c.a.d;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a implements IDownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55407a;

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, IpcCallback> f55408b = Collections.synchronizedMap(new HashMap());

    public final boolean isDownloaded(@NonNull Activity activity, @NonNull String str) {
        return false;
    }

    public final void download(@NonNull Activity activity, @NonNull String str, @NonNull BaseAd baseAd) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity, str2, baseAd}, this, f55407a, false, 59119, new Class[]{Activity.class, String.class, BaseAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, str2, baseAd}, this, f55407a, false, 59119, new Class[]{Activity.class, String.class, BaseAd.class}, Void.TYPE);
            return;
        }
        String a2 = d.a(baseAd.getDownloadEvent());
        if (PatchProxy.isSupport(new Object[]{str2, a2, null}, null, b.f55603a, true, 59358, new Class[]{String.class, String.class, IpcCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, a2, null}, null, b.f55603a, true, 59358, new Class[]{String.class, String.class, IpcCallback.class}, Void.TYPE);
            return;
        }
        HostProcessBridge.hostActionAsync("operateAdDownload", CrossProcessDataEntity.Builder.create().put("downloadUrl", str2).put("adDownloadOperateType", "download").put("downloadEvent", a2).build(), null);
    }

    public final void unbind(@NonNull Activity activity, @NonNull String str, @NonNull BaseAd baseAd) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity, str2, baseAd}, this, f55407a, false, 59120, new Class[]{Activity.class, String.class, BaseAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, str2, baseAd}, this, f55407a, false, 59120, new Class[]{Activity.class, String.class, BaseAd.class}, Void.TYPE);
            return;
        }
        IpcCallback remove = this.f55408b.remove(Integer.valueOf(baseAd.hashCode()));
        if (remove != null) {
            remove.finishListenIpcCallback();
            String valueOf = String.valueOf(baseAd.hashCode());
            if (PatchProxy.isSupport(new Object[]{str2, valueOf, null}, null, b.f55603a, true, 59359, new Class[]{String.class, String.class, IpcCallback.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, valueOf, null}, null, b.f55603a, true, 59359, new Class[]{String.class, String.class, IpcCallback.class}, Void.TYPE);
                return;
            }
            HostProcessBridge.hostActionAsync("operateAdDownload", CrossProcessDataEntity.Builder.create().put("downloadUrl", str2).put("adDownloadOperateType", "unbind").put("downloadToken", valueOf).build(), null);
        }
    }

    public final void bind(@NonNull Activity activity, long j, @NonNull String str, @NonNull IDownloadStatus iDownloadStatus, @NonNull BaseAd baseAd) {
        long j2 = j;
        String str2 = str;
        final IDownloadStatus iDownloadStatus2 = iDownloadStatus;
        if (PatchProxy.isSupport(new Object[]{activity, new Long(j2), str2, iDownloadStatus2, baseAd}, this, f55407a, false, 59118, new Class[]{Activity.class, Long.TYPE, String.class, IDownloadStatus.class, BaseAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, new Long(j2), str2, iDownloadStatus2, baseAd}, this, f55407a, false, 59118, new Class[]{Activity.class, Long.TYPE, String.class, IDownloadStatus.class, BaseAd.class}, Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new IpcCallback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55409a;

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
                if (r0.equals("start") != false) goto L_0x00f4;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onIpcCallback(@android.support.annotation.Nullable com.tt.miniapphost.process.data.CrossProcessDataEntity r19) {
                /*
                    r18 = this;
                    r7 = r18
                    r8 = r19
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f55409a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r1 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 59122(0xe6f2, float:8.2848E-41)
                    r1 = r18
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0038
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f55409a
                    r3 = 0
                    r4 = 59122(0xe6f2, float:8.2848E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r1 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r18
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0038:
                    com.ss.android.ugc.aweme.miniapp.a.a r0 = com.ss.android.ugc.aweme.miniapp.a.a.this
                    com.ss.android.excitingvideo.IDownloadStatus r1 = r12
                    r2 = 2
                    java.lang.Object[] r11 = new java.lang.Object[r2]
                    r11[r10] = r1
                    r11[r9] = r8
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.miniapp.a.a.f55407a
                    r14 = 0
                    r15 = 59121(0xe6f1, float:8.2846E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r2]
                    java.lang.Class<com.ss.android.excitingvideo.IDownloadStatus> r4 = com.ss.android.excitingvideo.IDownloadStatus.class
                    r3[r10] = r4
                    java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r4 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
                    r3[r9] = r4
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r3 == 0) goto L_0x007d
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    r3[r10] = r1
                    r3[r9] = r8
                    com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.miniapp.a.a.f55407a
                    r11 = 0
                    r12 = 59121(0xe6f1, float:8.2846E-41)
                    java.lang.Class[] r13 = new java.lang.Class[r2]
                    java.lang.Class<com.ss.android.excitingvideo.IDownloadStatus> r2 = com.ss.android.excitingvideo.IDownloadStatus.class
                    r13[r10] = r2
                    java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r2 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
                    r13[r9] = r2
                    java.lang.Class r14 = java.lang.Void.TYPE
                    r8 = r3
                    r9 = r0
                    r10 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                    return
                L_0x007d:
                    if (r1 != 0) goto L_0x0087
                    java.lang.String r0 = "AdDownloadImpl"
                    java.lang.String r1 = "downloadStatus == null"
                    com.tt.miniapphost.util.DebugUtil.outputError(r0, r1)
                    return
                L_0x0087:
                    if (r8 != 0) goto L_0x0091
                    java.lang.String r0 = "AdDownloadImpl"
                    java.lang.String r1 = "callbackData == null"
                    com.tt.miniapphost.util.DebugUtil.outputError(r0, r1)
                    return
                L_0x0091:
                    java.lang.String r0 = "downloadStatus"
                    java.lang.String r0 = r8.getString(r0)
                    boolean r3 = android.text.TextUtils.isEmpty(r0)
                    if (r3 == 0) goto L_0x00a5
                    java.lang.String r0 = "AdDownloadImpl"
                    java.lang.String r1 = "adDownloadStatus is empty"
                    com.tt.miniapphost.util.DebugUtil.outputError(r0, r1)
                    return
                L_0x00a5:
                    r3 = -1
                    int r4 = r0.hashCode()
                    switch(r4) {
                        case -1422950650: goto L_0x00e9;
                        case -1274442605: goto L_0x00df;
                        case 3135262: goto L_0x00d5;
                        case 3227604: goto L_0x00cb;
                        case 106440182: goto L_0x00c1;
                        case 109757538: goto L_0x00b8;
                        case 1957569947: goto L_0x00ae;
                        default: goto L_0x00ad;
                    }
                L_0x00ad:
                    goto L_0x00f3
                L_0x00ae:
                    java.lang.String r2 = "install"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00f3
                    r9 = 4
                    goto L_0x00f4
                L_0x00b8:
                    java.lang.String r2 = "start"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00f3
                    goto L_0x00f4
                L_0x00c1:
                    java.lang.String r4 = "pause"
                    boolean r0 = r0.equals(r4)
                    if (r0 == 0) goto L_0x00f3
                    r9 = 2
                    goto L_0x00f4
                L_0x00cb:
                    java.lang.String r2 = "idle"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00f3
                    r9 = 6
                    goto L_0x00f4
                L_0x00d5:
                    java.lang.String r2 = "fail"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00f3
                    r9 = 5
                    goto L_0x00f4
                L_0x00df:
                    java.lang.String r2 = "finish"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00f3
                    r9 = 3
                    goto L_0x00f4
                L_0x00e9:
                    java.lang.String r2 = "active"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00f3
                    r9 = 0
                    goto L_0x00f4
                L_0x00f3:
                    r9 = -1
                L_0x00f4:
                    switch(r9) {
                        case 0: goto L_0x0116;
                        case 1: goto L_0x0112;
                        case 2: goto L_0x0108;
                        case 3: goto L_0x0104;
                        case 4: goto L_0x0100;
                        case 5: goto L_0x00fc;
                        case 6: goto L_0x00f8;
                        default: goto L_0x00f7;
                    }
                L_0x00f7:
                    goto L_0x0120
                L_0x00f8:
                    r1.onIdle()
                    goto L_0x0120
                L_0x00fc:
                    r1.onFail()
                    return
                L_0x0100:
                    r1.onInstalled()
                    return
                L_0x0104:
                    r1.onFinish()
                    return
                L_0x0108:
                    java.lang.String r0 = "downloadPercent"
                    int r0 = r8.getInt(r0, r10)
                    r1.onPause(r0)
                    return
                L_0x0112:
                    r1.onDownloadStart()
                    return
                L_0x0116:
                    java.lang.String r0 = "downloadPercent"
                    int r0 = r8.getInt(r0, r10)
                    r1.onDownloading(r0)
                    return
                L_0x0120:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.a.a.AnonymousClass1.onIpcCallback(com.tt.miniapphost.process.data.CrossProcessDataEntity):void");
            }
        };
        String str3 = "";
        if (baseAd.getClickTrackUrl() != null && !baseAd.getClickTrackUrl().isEmpty()) {
            str3 = baseAd.getClickTrackUrl().get(0);
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(baseAd.hashCode());
        String packageName = baseAd.getPackageName();
        String appName = baseAd.getAppName();
        String logExtra = baseAd.getLogExtra();
        if (PatchProxy.isSupport(new Object[]{str2, valueOf, valueOf2, packageName, appName, str3, logExtra, r0}, null, b.f55603a, true, 59357, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, IpcCallback.class}, Void.TYPE)) {
            Object[] objArr = {str2, valueOf, valueOf2, packageName, appName, str3, logExtra, r0};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, b.f55603a, true, 59357, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, IpcCallback.class}, Void.TYPE);
        } else {
            HostProcessBridge.hostActionAsync("operateAdDownload", CrossProcessDataEntity.Builder.create().put("downloadUrl", str2).put("adDownloadOperateType", "bind").put("adId", valueOf).put("downloadToken", valueOf2).put("packageName", packageName).put("appName", appName).put("trackUrl", str3).put("logExtra", logExtra).build(), r0);
        }
        this.f55408b.put(Integer.valueOf(baseAd.hashCode()), r0);
    }
}
