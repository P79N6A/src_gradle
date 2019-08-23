package com.ss.android.ugc.aweme.app.c.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.download.api.b.a.a;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.c.a.c;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34054a;

    /* renamed from: c  reason: collision with root package name */
    private static b f34055c;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f34056b;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Integer> f34057d;

    private b() {
        c.a().a((a) this);
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f34054a, true, 23441, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f34054a, true, 23441, new Class[0], b.class);
        }
        if (f34055c == null) {
            synchronized (b.class) {
                if (f34055c == null) {
                    f34055c = new b();
                }
            }
        }
        return f34055c;
    }

    private Map<String, Integer> b() {
        if (PatchProxy.isSupport(new Object[0], this, f34054a, false, 23442, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f34054a, false, 23442, new Class[0], Map.class);
        }
        if (this.f34057d == null) {
            this.f34057d = new ConcurrentHashMap();
        }
        return this.f34057d;
    }

    private JSONObject a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34054a, false, 23451, new Class[]{String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str2}, this, f34054a, false, 23451, new Class[]{String.class}, JSONObject.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log_extra", str2);
                jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    private void b(@NonNull DownloadInfo downloadInfo) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f34054a, false, 23447, new Class[]{DownloadInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f34054a, false, 23447, new Class[]{DownloadInfo.class}, Void.TYPE);
            return;
        }
        b().remove(downloadInfo.getUrl());
    }

    private boolean c(@NonNull DownloadInfo downloadInfo) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f34054a, false, 23449, new Class[]{DownloadInfo.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f34054a, false, 23449, new Class[]{DownloadInfo.class}, Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(downloadInfo.getExtra())) {
            try {
                z = new JSONObject(downloadInfo.getExtra()).optBoolean("download_silent");
            } catch (Exception unused) {
            }
            if (k.g().optInt("is_enable_show_retry_download_dialog") != 1 && b().get(downloadInfo.getUrl()).intValue() <= 1) {
                if (this.f34056b || !NetworkUtils.isNetworkAvailable(d.a()) || z) {
                    return false;
                }
                return true;
            }
            return false;
        }
        z = false;
        if (k.g().optInt("is_enable_show_retry_download_dialog") != 1) {
        }
        return false;
    }

    public final void a(@NonNull DownloadInfo downloadInfo) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f34054a, false, 23445, new Class[]{DownloadInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f34054a, false, 23445, new Class[]{DownloadInfo.class}, Void.TYPE);
            return;
        }
        b(downloadInfo);
    }

    public final long a(DownloadInfo downloadInfo, Activity activity) {
        long j;
        JSONObject jSONObject;
        char c2;
        long j2;
        char c3;
        char c4;
        com.ss.android.downloadad.api.b.a aVar;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{downloadInfo, activity2}, this, f34054a, false, 23450, new Class[]{DownloadInfo.class, Activity.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{downloadInfo, activity2}, this, f34054a, false, 23450, new Class[]{DownloadInfo.class, Activity.class}, Long.TYPE)).longValue();
        }
        String str = null;
        if (!TextUtils.isEmpty(downloadInfo.getExtra())) {
            try {
                jSONObject = new JSONObject(downloadInfo.getExtra());
                try {
                    j = com.ss.android.downloadlib.c.k.a(jSONObject, PushConstants.EXTRA);
                    try {
                        try {
                            str = jSONObject.optString("ext_value");
                        } catch (Exception unused) {
                            str = jSONObject.optString("log_extra");
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
            }
            if (j > 0 || TextUtils.isEmpty(str)) {
                return 0;
            }
            if (k.a(false, true)) {
                HashMap hashMap = new HashMap();
                List<HttpHeader> extraHeaders = downloadInfo.getExtraHeaders();
                if (!CollectionUtils.isEmpty(extraHeaders)) {
                    for (HttpHeader httpHeader : extraHeaders) {
                        hashMap.put(httpHeader.getName(), httpHeader.getValue());
                    }
                }
                c4 = 1;
                c2 = 2;
                long a2 = j.a(downloadInfo.getUrl(), downloadInfo.getTitle(), activity, downloadInfo.getMimeType(), hashMap, jSONObject, true, downloadInfo.canShowNotification(), false, false, false, "", "", false);
                c.a().f29059c.a(Long.valueOf(a2), String.valueOf(j), 0, str, true, 0);
                j2 = a2;
                c3 = 0;
            } else {
                c4 = 1;
                c3 = 0;
                c2 = 2;
                j2 = (long) j.a(true, false, jSONObject, new AppTaskBuilder(activity2, downloadInfo.getUrl()).name(downloadInfo.getTitle()).extra(downloadInfo.getExtra()).mimeType(downloadInfo.getMimeType()).headers(downloadInfo.getExtraHeaders()).showNotification(downloadInfo.canShowNotification()).needWifi(false).savePath(downloadInfo.getSavePath()).mimeType("application/vnd.android.package-archive"));
            }
            r.a((Context) com.ss.android.ugc.aweme.app.k.a(), "feed_download_ad", "click", String.valueOf(j), 0, a(str));
            if (j2 > 0) {
                com.ss.android.downloadlib.a a3 = com.ss.android.downloadlib.a.a();
                Object[] objArr = new Object[4];
                objArr[c3] = new Long(j);
                objArr[c4] = 0L;
                objArr[c2] = str;
                objArr[3] = new Long(j2);
                ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.app.c.d.f34067a;
                Class[] clsArr = new Class[4];
                clsArr[c3] = Long.TYPE;
                clsArr[c4] = Long.TYPE;
                clsArr[c2] = String.class;
                clsArr[3] = Long.TYPE;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, 23357, clsArr, com.ss.android.downloadad.api.b.a.class)) {
                    Object[] objArr2 = new Object[4];
                    objArr2[c3] = new Long(j);
                    objArr2[c4] = 0L;
                    objArr2[c2] = str;
                    objArr2[3] = new Long(j2);
                    ChangeQuickRedirect changeQuickRedirect2 = com.ss.android.ugc.aweme.app.c.d.f34067a;
                    Class[] clsArr2 = new Class[4];
                    clsArr2[c3] = Long.TYPE;
                    clsArr2[c4] = Long.TYPE;
                    clsArr2[c2] = String.class;
                    clsArr2[3] = Long.TYPE;
                    aVar = (com.ss.android.downloadad.api.b.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, 23357, clsArr2, com.ss.android.downloadad.api.b.a.class);
                } else {
                    aVar = new com.ss.android.downloadad.api.b.a(j, str);
                }
                a3.a(aVar);
                r.a((Context) com.ss.android.ugc.aweme.app.k.a(), "feed_download_ad", "click_start", String.valueOf(j), 0, a(str));
            }
            return j2;
        }
        jSONObject = null;
        j = 0;
        if (j > 0) {
        }
        return 0;
    }

    public final void a(@NonNull DownloadInfo downloadInfo, String str) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo, str}, this, f34054a, false, 23443, new Class[]{DownloadInfo.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo, str}, this, f34054a, false, 23443, new Class[]{DownloadInfo.class, String.class}, Void.TYPE);
            return;
        }
        b(downloadInfo);
    }

    public final void a(@NonNull DownloadInfo downloadInfo, BaseException baseException, String str) {
        final DownloadInfo downloadInfo2 = downloadInfo;
        if (PatchProxy.isSupport(new Object[]{downloadInfo2, baseException, str}, this, f34054a, false, 23444, new Class[]{DownloadInfo.class, BaseException.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo2, baseException, str}, this, f34054a, false, 23444, new Class[]{DownloadInfo.class, BaseException.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{downloadInfo2, baseException}, this, f34054a, false, 23446, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo2, baseException}, this, f34054a, false, 23446, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
        } else if (baseException == null || baseException.getErrorCode() == 1012) {
        } else {
            if (PatchProxy.isSupport(new Object[]{downloadInfo2}, this, f34054a, false, 23448, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo2}, this, f34054a, false, 23448, new Class[]{DownloadInfo.class}, Void.TYPE);
            } else if (!b().containsKey(downloadInfo.getUrl())) {
                b().put(downloadInfo.getUrl(), 1);
            } else {
                b().put(downloadInfo.getUrl(), Integer.valueOf(b().get(downloadInfo.getUrl()).intValue() + 1));
            }
            if (c(downloadInfo)) {
                com.ss.android.b.a.a.a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34058a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f34058a, false, 23452, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34058a, false, 23452, new Class[0], Void.TYPE);
                            return;
                        }
                        final Activity e2 = p.a().e();
                        if (e2 != null && !e2.isFinishing()) {
                            b.this.f34056b = true;
                            String title = downloadInfo2.getTitle();
                            a.C0185a a2 = new a.C0185a(e2).a(title);
                            Dialog a3 = a2.b(title + e2.getString(C0906R.string.a7h)).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    b.this.f34056b = false;
                                }
                            }).a((int) C0906R.string.cc2, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f34061a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f34061a, false, 23453, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f34061a, false, 23453, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    b.this.a(downloadInfo2, e2);
                                    b.this.f34056b = false;
                                }
                            }).a().a();
                            a3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                public final void onCancel(DialogInterface dialogInterface) {
                                    b.this.f34056b = false;
                                }
                            });
                            a3.setCancelable(false);
                            a3.show();
                        }
                    }
                });
            }
        }
    }
}
