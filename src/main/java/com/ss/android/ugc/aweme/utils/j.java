package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.downloadlib.b.b;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import java.io.File;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75899a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f75900b;

    private static boolean a(DownloadInfo downloadInfo) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, null, f75899a, true, 87893, new Class[]{DownloadInfo.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{downloadInfo}, null, f75899a, true, 87893, new Class[]{DownloadInfo.class}, Boolean.TYPE)).booleanValue();
        } else if (downloadInfo == null) {
            return true;
        } else {
            if (!downloadInfo.isDownloadOverStatus() || d.a(downloadInfo.getSavePath(), downloadInfo.getName(), false)) {
                return false;
            }
            return true;
        }
    }

    public static void a(Context context, DownloadInfo downloadInfo) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, downloadInfo}, null, f75899a, true, 87892, new Class[]{Context.class, DownloadInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, downloadInfo}, null, f75899a, true, 87892, new Class[]{Context.class, DownloadInfo.class}, Void.TYPE);
            return;
        }
        try {
            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(1);
            intent.setDataAndType(p.a(context2, file), "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            context2.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0086, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.app.Activity r19, com.ss.android.socialbase.downloader.model.DownloadInfo r20) {
        /*
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = f75899a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.socialbase.downloader.model.DownloadInfo> r4 = com.ss.android.socialbase.downloader.model.DownloadInfo.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 87891(0x15753, float:1.23162E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0041
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r20
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75899a
            r15 = 1
            r16 = 87891(0x15753, float:1.23162E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.socialbase.downloader.model.DownloadInfo> r1 = com.ss.android.socialbase.downloader.model.DownloadInfo.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0041:
            int r2 = r20.getId()     // Catch:{ Exception -> 0x0087 }
            int r3 = r20.getStatus()     // Catch:{ Exception -> 0x0087 }
            r4 = 2131560628(0x7f0d08b4, float:1.8746634E38)
            switch(r3) {
                case -4: goto L_0x0073;
                case -3: goto L_0x006f;
                case -2: goto L_0x005c;
                case -1: goto L_0x0073;
                case 0: goto L_0x004f;
                case 1: goto L_0x0050;
                case 2: goto L_0x0050;
                case 3: goto L_0x0050;
                case 4: goto L_0x0050;
                case 5: goto L_0x0050;
                default: goto L_0x004f;
            }     // Catch:{ Exception -> 0x0087 }
        L_0x004f:
            goto L_0x0086
        L_0x0050:
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x0087 }
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r4)     // Catch:{ Exception -> 0x0087 }
            r0.a()     // Catch:{ Exception -> 0x0087 }
            goto L_0x0087
        L_0x005c:
            com.ss.android.socialbase.downloader.downloader.Downloader r0 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r19)     // Catch:{ Exception -> 0x0087 }
            r0.resume(r2)     // Catch:{ Exception -> 0x0087 }
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x0087 }
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r4)     // Catch:{ Exception -> 0x0087 }
            r0.a()     // Catch:{ Exception -> 0x0087 }
            goto L_0x0087
        L_0x006f:
            a((android.content.Context) r19, (com.ss.android.socialbase.downloader.model.DownloadInfo) r20)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0086
        L_0x0073:
            com.ss.android.socialbase.downloader.downloader.Downloader r0 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r19)     // Catch:{ Exception -> 0x0087 }
            r0.restart(r2)     // Catch:{ Exception -> 0x0087 }
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x0087 }
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r4)     // Catch:{ Exception -> 0x0087 }
            r0.a()     // Catch:{ Exception -> 0x0087 }
            goto L_0x0087
        L_0x0086:
            return
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.j.a(android.app.Activity, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static boolean a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f75899a, true, 87888, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f75899a, true, 87888, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (context.getPackageManager().getPackageArchiveInfo(str2, 1) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Activity activity, String str, boolean z, String str2) {
        final Activity activity2 = activity;
        final String str3 = str;
        boolean z2 = z;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, Byte.valueOf(z ? (byte) 1 : 0), str4}, null, f75899a, true, 87890, new Class[]{Activity.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, Byte.valueOf(z), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f75899a, true, 87890, new Class[]{Activity.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (ContextCompat.checkSelfPermission(activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(GlobalContext.getContext(), str3);
                if (a(appDownloadInfo)) {
                    String str5 = "";
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("download_silent", z2);
                        jSONObject.put("bind_app", true);
                        str5 = jSONObject.toString();
                    } catch (Exception unused) {
                    }
                    AppDownloader.getInstance().addDownloadTask(new AppTaskBuilder(k.a(), str3).name(str4).mimeType("application/vnd.android.package-archive").showNotification(!z2).showNotificationForAutoResumed(false).needWifi(z2).extra(str5).mainThreadListener(new AbsDownloadListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f75901a;

                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            DownloadInfo downloadInfo2 = downloadInfo;
                            if (PatchProxy.isSupport(new Object[]{downloadInfo2}, this, f75901a, false, 87896, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{downloadInfo2}, this, f75901a, false, 87896, new Class[]{DownloadInfo.class}, Void.TYPE);
                                return;
                            }
                            super.onSuccessed(downloadInfo);
                            if (j.f75900b && downloadInfo2 != null) {
                                j.a(GlobalContext.getContext(), downloadInfo2);
                                IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                                if (appDownloadEventHandler != null) {
                                    File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                                    if (file.exists()) {
                                        try {
                                            PackageInfo packageArchiveInfo = activity2.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                                            if (packageArchiveInfo != null) {
                                                appDownloadEventHandler.handleDownloadEvent(downloadInfo.getId(), 1, packageArchiveInfo.packageName, -3, downloadInfo.getDownloadTime());
                                            }
                                            return;
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }));
                    AppDownloader.getInstance().setAppDownloadEventHandler(new b(activity2) {

                        /* renamed from: b  reason: collision with root package name */
                        public static ChangeQuickRedirect f75903b;

                        public final void handleAppInstalled(Context context, String str) {
                            String str2 = str;
                            if (PatchProxy.isSupport(new Object[]{context, str2}, this, f75903b, false, 87897, new Class[]{Context.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context, str2}, this, f75903b, false, 87897, new Class[]{Context.class, String.class}, Void.TYPE);
                                return;
                            }
                            super.handleAppInstalled(context, str);
                            if (TextUtils.equals(str2, "my.maya.android")) {
                                DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(GlobalContext.getContext(), str3);
                                if (appDownloadInfo != null) {
                                    File file = new File(appDownloadInfo.getSavePath(), appDownloadInfo.getName());
                                    if (file.exists() && file.isFile()) {
                                        file.delete();
                                    }
                                }
                            }
                        }
                    });
                    if (!z2) {
                        f75900b = true;
                        a.a(GlobalContext.getContext(), (int) C0906R.string.avr).a();
                    }
                } else {
                    if (!z2) {
                        f75900b = true;
                        a(activity2, appDownloadInfo);
                    }
                }
            } else if (!z2) {
                com.ss.android.ugc.aweme.ac.b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new k(activity2));
            }
        }
    }
}
