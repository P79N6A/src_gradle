package com.ss.android.socialbase.appdownloader.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.AppDownloadUtils;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class b implements k {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f30778a;

        /* renamed from: b  reason: collision with root package name */
        long f30779b;

        /* renamed from: c  reason: collision with root package name */
        int f30780c;

        /* renamed from: d  reason: collision with root package name */
        long f30781d;

        /* renamed from: e  reason: collision with root package name */
        int f30782e;

        public final String a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", this.f30778a);
                jSONObject.put("last_time_failed_resume", this.f30779b);
                jSONObject.put("show_count_failed_resume", this.f30780c);
                jSONObject.put("last_time_uninstall_resume", this.f30781d);
                jSONObject.put("show_coun_uninstall_resume", this.f30782e);
                return jSONObject.toString();
            } catch (Exception unused) {
                return "";
            }
        }

        public a(int i) {
            this.f30778a = i;
        }
    }

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("application/vnd.android.package-archive");
        return arrayList;
    }

    public final void a(final List<DownloadInfo> list) {
        if (d.d()) {
            com.ss.android.socialbase.downloader.downloader.b.f().execute(new Runnable() {
                public final void run() {
                    try {
                        b.this.b(list);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            b(list);
        }
    }

    private static a a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.opt("id") == null) {
                return null;
            }
            int optInt = jSONObject.optInt("id");
            if (optInt == 0) {
                return null;
            }
            a aVar = new a(optInt);
            try {
                if (jSONObject.opt("last_time_failed_resume") != null) {
                    aVar.f30779b = jSONObject.optLong("last_time_failed_resume");
                }
                if (jSONObject.opt("show_count_failed_resume") != null) {
                    aVar.f30780c = jSONObject.optInt("show_count_failed_resume");
                }
                if (jSONObject.opt("last_time_uninstall_resume") != null) {
                    aVar.f30781d = jSONObject.optLong("last_time_uninstall_resume");
                }
                if (jSONObject.opt("show_coun_uninstall_resume") != null) {
                    aVar.f30782e = jSONObject.optInt("show_coun_uninstall_resume");
                }
            } catch (Exception unused) {
            }
            return aVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final void b(List<DownloadInfo> list) {
        a aVar;
        boolean z;
        if (list != null && !list.isEmpty()) {
            Context q = com.ss.android.socialbase.downloader.downloader.b.q();
            if (q != null) {
                SharedPreferences a2 = c.a(q, "sp_appdownloader", 0);
                for (DownloadInfo next : list) {
                    if (next != null && next.isShowNotification()) {
                        String string = a2.getString(Long.toString((long) next.getId()), "");
                        if (!TextUtils.isEmpty(string)) {
                            aVar = a(string);
                        } else {
                            aVar = new a(next.getId());
                        }
                        a aVar2 = aVar;
                        int realStatus = next.getRealStatus();
                        boolean z2 = true;
                        if (realStatus == -5 && !next.isDownloaded()) {
                            if (System.currentTimeMillis() - aVar2.f30779b <= AppDownloader.getInstance().getMinResumeFailedIntervalTime() || aVar2.f30780c >= AppDownloader.getInstance().getMaxFailedNotificationShowCount()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                a(next, true);
                                a(a2, aVar2);
                            }
                        } else if (realStatus == -3 && next.isDownloaded() && !AppDownloadUtils.isApkInstalled(q, next.getSavePath(), next.getName())) {
                            if (System.currentTimeMillis() - aVar2.f30781d <= AppDownloader.getInstance().getMinResumeUnInstallIntervalTime() || aVar2.f30782e >= AppDownloader.getInstance().getMaxUnInstallNotificationShowCount()) {
                                z2 = false;
                            }
                            if (z2) {
                                com.ss.android.socialbase.downloader.notification.a notificationItem = DownloadNotificationManager.getInstance().getNotificationItem(next.getId());
                                if (notificationItem == null) {
                                    com.ss.android.socialbase.appdownloader.a aVar3 = new com.ss.android.socialbase.appdownloader.a(q, next.getId(), next.getTitle(), next.getSavePath(), next.getName(), next.getExtra());
                                    DownloadNotificationManager.getInstance().addNotification(aVar3);
                                    notificationItem = aVar3;
                                } else {
                                    notificationItem.a(next);
                                }
                                notificationItem.f31096c = next.getTotalBytes();
                                notificationItem.f31095b = next.getTotalBytes();
                                notificationItem.a(next.getStatus(), null, false);
                                b(a2, aVar2);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void a(SharedPreferences sharedPreferences, a aVar) {
        if (aVar != null) {
            try {
                aVar.f30779b = System.currentTimeMillis();
                aVar.f30780c++;
                sharedPreferences.edit().putString(Integer.toString(aVar.f30778a), aVar.a()).commit();
            } catch (Exception unused) {
            }
        }
    }

    private static void b(SharedPreferences sharedPreferences, a aVar) {
        if (aVar != null) {
            try {
                aVar.f30781d = System.currentTimeMillis();
                aVar.f30782e++;
                sharedPreferences.edit().putString(Integer.toString(aVar.f30778a), aVar.a()).commit();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(DownloadInfo downloadInfo, boolean z) {
        AppDownloader.getInstance().addDownloadTask(new AppTaskBuilder(com.ss.android.socialbase.downloader.downloader.b.q(), downloadInfo.getUrl()).name(downloadInfo.getTitle()).saveName(downloadInfo.getName()).savePath(downloadInfo.getSavePath()).showNotification(downloadInfo.isShowNotification()).needWifi(downloadInfo.isOnlyWifi()).extra(downloadInfo.getExtra()).mimeType(downloadInfo.getMimeType()).headers(downloadInfo.getExtraHeaders()).autoResumed(true).minProgressTimeMsInterval(downloadInfo.getMinProgressTimeMsInterval()).maxProgressCount(downloadInfo.getMaxProgressCount()).showNotificationForAutoResumed(true).needHttpsToHttpRetry(downloadInfo.isNeedHttpsToHttpRetry()).packageName(downloadInfo.getPackageName()).md5(downloadInfo.getMd5()).needDefaultHttpServiceBackUp(downloadInfo.isNeedDefaultHttpServiceBackUp()).needReuseFirstConnection(downloadInfo.isNeedReuseFirstConnection()).needIndependentProcess(downloadInfo.isNeedIndependentProcess()).enqueueType(downloadInfo.getEnqueueType()).force(downloadInfo.isForce()).headConnectionAvailable(downloadInfo.isHeadConnectionAvailable()).needRetryDelay(downloadInfo.isNeedRetryDelay()));
    }
}
