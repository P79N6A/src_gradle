package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.commercialize.a.a;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.ab;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39437a;

    /* renamed from: b  reason: collision with root package name */
    public static c f39438b;

    /* renamed from: c  reason: collision with root package name */
    public static String f39439c;
    private static volatile a o;

    /* renamed from: d  reason: collision with root package name */
    public boolean f39440d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39441e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f39442f = true;
    public String g;
    public String h;
    public boolean i = true;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m = true;
    public boolean n;

    public final void c() {
        this.h = null;
    }

    public final boolean a(String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        String str2 = str;
        boolean z5 = z;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f39437a, false, 31974, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f39437a, false, 31974, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (f() || e()) {
            return false;
        } else {
            Aweme c2 = c(str);
            if (c2 == null) {
                return false;
            }
            if (c.W(c2)) {
                g.b((Context) k.a(), c2, a("5", a.C0504a.f38456a));
                g.a((Context) k.a(), c2, false, z5);
                return false;
            } else if (!BaseListFragmentPanel.a(GlobalContext.getContext(), c2)) {
                g.R(k.a(), c2);
                g.a((Context) k.a(), c2, false, z5);
                return false;
            } else {
                if (!this.j) {
                    if (PatchProxy.isSupport(new Object[]{c2}, null, c.f39774a, true, 32311, new Class[]{Aweme.class}, Boolean.TYPE)) {
                        z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{c2}, null, c.f39774a, true, 32311, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        z4 = c.t(c2) && c2.getAwemeRawAd().getSplashInfo() != null && c2.getAwemeRawAd().getSplashInfo().isDisableHotStartShow();
                    }
                    if (z4) {
                        g.b((Context) k.a(), c2, a("7", g()));
                        g.a((Context) k.a(), c2, false, z5);
                        return false;
                    }
                }
                if (this.j && !this.k) {
                    g.b((Context) k.a(), c2, a(PushConstants.PUSH_TYPE_UPLOAD_LOG, g()));
                    g.a((Context) k.a(), c2, false, z5);
                    return false;
                } else if (!this.f39441e) {
                    g.b((Context) k.a(), c2, a(PushConstants.PUSH_TYPE_UPLOAD_LOG, g()));
                    g.a((Context) k.a(), c2, false, z5);
                    return false;
                } else if (!this.j && !this.n && !AwemeAppData.p().av) {
                    g.b((Context) k.a(), c2, a(PushConstants.PUSH_TYPE_UPLOAD_LOG, g()));
                    g.a((Context) k.a(), c2, false, z5);
                    return false;
                } else if (!this.f39442f) {
                    g.b((Context) k.a(), c2, a("6", a.C0504a.f38456a));
                    g.a((Context) k.a(), c2, false, z5);
                    return false;
                } else {
                    AwemeSplashInfo V = c.V(c2);
                    if (V == null) {
                        g.R(k.a(), c2);
                        g.a((Context) k.a(), c2, false, z5);
                        return false;
                    }
                    if (PatchProxy.isSupport(new Object[]{V}, this, f39437a, false, 31978, new Class[]{AwemeSplashInfo.class}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{V}, this, f39437a, false, 31978, new Class[]{AwemeSplashInfo.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        z2 = V.isInvalidAd();
                    }
                    if (z2) {
                        g.b((Context) k.a(), c2, a(PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION, a.C0504a.f38456a));
                        g.a((Context) k.a(), c2, false, z5);
                        return false;
                    }
                    if (PatchProxy.isSupport(new Object[]{c2}, this, f39437a, false, 31977, new Class[]{Aweme.class}, Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{c2}, this, f39437a, false, 31977, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        Video video = c2.getVideo();
                        if (video == null) {
                            g.R(k.a(), c2);
                        } else {
                            VideoUrlModel playAddr = video.getPlayAddr();
                            if (playAddr == null || CollectionUtils.isEmpty(playAddr.getUrlList())) {
                                g.R(k.a(), c2);
                            } else if (TextUtils.isEmpty(a(c2.getAid()))) {
                                g.b((Context) k.a(), c2, a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, a.C0504a.f38456a));
                            } else {
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                    if (!z3) {
                        g.a((Context) k.a(), c2, false, z5);
                        return false;
                    } else if (V.getHotShowType() != 1 || !this.f39440d) {
                        g.a((Context) k.a(), c2, true, z5);
                        if (z5) {
                            this.g = str2;
                            this.h = str2;
                        }
                        return true;
                    } else {
                        g.b((Context) k.a(), c2, a(PushConstants.PUSH_TYPE_UPLOAD_LOG, g()));
                        g.a((Context) k.a(), c2, false, z5);
                        return false;
                    }
                }
            }
        }
    }

    private a() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39437a, false, 31973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39437a, false, 31973, new Class[0], Void.TYPE);
            return;
        }
        d.a(!TextUtils.isEmpty(this.g));
        this.g = null;
    }

    public boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f39437a, false, 31983, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39437a, false, 31983, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (f39438b != null) {
            return f39438b.c();
        } else {
            return false;
        }
    }

    public boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f39437a, false, 31984, new Class[0], Boolean.TYPE)) {
            return TimeLockRuler.isTeenModeON();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39437a, false, 31984, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private String g() {
        if (PatchProxy.isSupport(new Object[0], this, f39437a, false, 31976, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f39437a, false, 31976, new Class[0], String.class);
        } else if (AwemeAppData.p().at) {
            return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            if (AwemeAppData.p().au) {
                return PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
            if (!this.f39441e || (!this.j && !this.n && !AwemeAppData.p().av)) {
                return "3";
            }
            if (this.f39440d) {
                return PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION;
            }
            if (!this.k) {
                return "5";
            }
            return a.C0504a.f38456a;
        }
    }

    public static a a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f39437a, true, 31965, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f39437a, true, 31965, new Class[0], a.class);
        }
        if (o == null) {
            synchronized (a.class) {
                if (o == null) {
                    k a2 = k.a();
                    if (PatchProxy.isSupport(new Object[]{a2}, null, f39437a, true, 31979, new Class[]{Context.class}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{a2}, null, f39437a, true, 31979, new Class[]{Context.class}, String.class);
                    } else {
                        str = Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + a2.getPackageName() + "/awemeSplashCache/";
                    }
                    f39439c = str;
                    f39438b = new c(f39439c);
                    o = new a();
                }
            }
        }
        return o;
    }

    public final void d() {
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f39437a, false, 31980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39437a, false, 31980, new Class[0], Void.TYPE);
            return;
        }
        if (f39438b != null) {
            c cVar = f39438b;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f39451a, false, 32003, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f39451a, false, 32003, new Class[0], Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], cVar, c.f39451a, false, 32004, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f39451a, false, 32004, new Class[0], Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], cVar, c.f39451a, false, 31997, new Class[0], Long.TYPE)) {
                    j2 = ((Long) PatchProxy.accessDispatch(new Object[0], cVar, c.f39451a, false, 31997, new Class[0], Long.TYPE)).longValue();
                } else {
                    if (cVar.f39456f == 0 && cVar.f39455d != null) {
                        cVar.f39456f = cVar.f39455d.getLong("awesome_splash_last_clean_time", 0);
                    }
                    j2 = cVar.f39456f;
                }
                if (j2 == 0 || System.currentTimeMillis() - j2 >= c.f39452b) {
                    if (PatchProxy.isSupport(new Object[0], cVar, c.f39451a, false, 31998, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cVar, c.f39451a, false, 31998, new Class[0], Void.TYPE);
                    } else if (cVar.f39455d != null) {
                        cVar.f39455d.edit().putLong("awesome_splash_last_clean_time", System.currentTimeMillis()).apply();
                    }
                    File[] listFiles = new File(c.f39454e).listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (file.exists() && file.isFile() && System.currentTimeMillis() - file.lastModified() >= c.f39453c && !cVar.c(file.getName())) {
                                file.delete();
                            }
                        }
                    }
                }
            }
            if (cVar.a() != null && cVar.a().size() != 0) {
                HashMap hashMap = new HashMap();
                boolean z = false;
                for (String str : cVar.a().keySet()) {
                    Aweme aweme = (Aweme) cVar.a().get(str);
                    if (aweme != null) {
                        if (!c.W(aweme)) {
                            hashMap.put(str, aweme);
                        } else if (cVar.d(aweme.getAid())) {
                            String aid = aweme.getAid();
                            String str2 = c.f39454e;
                            if (PatchProxy.isSupport(new Object[]{aid, str2}, cVar, c.f39451a, false, 32006, new Class[]{String.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{aid, str2}, cVar, c.f39451a, false, 32006, new Class[]{String.class, String.class}, Void.TYPE);
                            } else {
                                File file2 = new File(str2 + aid);
                                if (file2.exists() && file2.isFile()) {
                                    file2.delete();
                                }
                            }
                        }
                    }
                    z = true;
                }
                if (z) {
                    cVar.a().clear();
                    cVar.a().putAll(hashMap);
                    cVar.b();
                }
            }
        }
    }

    private Aweme c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f39437a, false, 31972, new Class[]{String.class}, Aweme.class)) {
            return f39438b.b(str2);
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[]{str2}, this, f39437a, false, 31972, new Class[]{String.class}, Aweme.class);
    }

    public final void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f39437a, false, 31981, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f39437a, false, 31981, new Class[]{Intent.class}, Void.TYPE);
        } else if (intent == null) {
            this.k = false;
        } else {
            this.k = ab.a(intent);
        }
    }

    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39437a, false, 31969, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f39437a, false, 31969, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            String str3 = f39439c + str2;
            if (new File(str3).exists()) {
                return str3;
            }
            return null;
        }
    }

    public final Long b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f39437a, false, 31970, new Class[]{String.class}, Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[]{str}, this, f39437a, false, 31970, new Class[]{String.class}, Long.class);
        } else if (str == null) {
            return null;
        } else {
            Aweme c2 = c(str);
            if (c.Q(c2) && c2.getAwemeRawAd().getSplashInfo().isDisableHotStartShow()) {
                return c2.getAwemeRawAd().getAdId();
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(List list, Context context) throws Exception {
        Context context2 = context;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, g.f39316a, true, 31657, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, g.f39316a, true, 31657, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            } else {
                g.b(context2, "download_video_count", aweme, g.f(context2, aweme, "raw ad download_video_count"));
            }
            a(context2, aweme);
            if (PatchProxy.isSupport(new Object[]{aweme}, null, am.f39706a, true, 32609, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, null, am.f39706a, true, 32609, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                am.a(aweme, null, null, false, 14);
            }
        }
        if (f39438b != null) {
            c cVar = f39438b;
            if (PatchProxy.isSupport(new Object[]{list}, cVar, c.f39451a, false, 32001, new Class[]{List.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{list}, cVar2, c.f39451a, false, 32001, new Class[]{List.class}, Void.TYPE);
            } else {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Aweme aweme2 = (Aweme) it3.next();
                    if (PatchProxy.isSupport(new Object[]{aweme2}, cVar, c.f39451a, false, 32002, new Class[]{Aweme.class}, Void.TYPE)) {
                        c cVar3 = cVar;
                        PatchProxy.accessDispatch(new Object[]{aweme2}, cVar3, c.f39451a, false, 32002, new Class[]{Aweme.class}, Void.TYPE);
                    } else if (aweme2 != null) {
                        AwemeStatus status = aweme2.getStatus();
                        status.setPrivateStatus(0);
                        status.setAllowComment(true);
                        status.setAllowShare(true);
                    }
                    String U = c.U(aweme2);
                    if (!TextUtils.isEmpty(U)) {
                        cVar.a().put(U, aweme2);
                    }
                }
                cVar.b();
            }
        }
        return null;
    }

    public final JSONObject a(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5}, this, f39437a, false, 31975, new Class[]{String.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str4, str5}, this, f39437a, false, 31975, new Class[]{String.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_show_fail_type", str4);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("ad_show_fail_type2_reason", str5);
            }
            try {
                if (this.m) {
                    str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str3 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                }
                jSONObject2.put("awemelaunch", str3);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public void a(Context context, Aweme aweme) {
        final Context context2 = context;
        final Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, this, f39437a, false, 31967, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, this, f39437a, false, 31967, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else if (c.W(aweme)) {
            g.e(context2, aweme2, "past_data");
        } else {
            AwemeSplashInfo V = c.V(aweme);
            if (V == null) {
                g.e(context2, aweme2, "splash_info_null");
                return;
            }
            int preloadType = V.getPreloadType();
            if (!m.a().c()) {
                g.e(context2, aweme2, "no_network");
            } else if (m.a().b() || preloadType != 1) {
                AnonymousClass1 r3 = new IDownloadListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f39443a;

                    public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    }

                    public final void onPause(DownloadInfo downloadInfo) {
                    }

                    public final void onProgress(DownloadInfo downloadInfo) {
                    }

                    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    public final void onCanceled(DownloadInfo downloadInfo) {
                        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f39443a, false, 31990, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f39443a, false, 31990, new Class[]{DownloadInfo.class}, Void.TYPE);
                            return;
                        }
                        Context context = context2;
                        Aweme aweme = aweme2;
                        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31666, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31666, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            return;
                        }
                        g.b(context, "download_video_cancel", aweme, g.f(context, aweme, "raw ad download cancel"));
                    }

                    public final void onFirstStart(DownloadInfo downloadInfo) {
                        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f39443a, false, 31991, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f39443a, false, 31991, new Class[]{DownloadInfo.class}, Void.TYPE);
                            return;
                        }
                        Context context = context2;
                        Aweme aweme = aweme2;
                        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31665, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31665, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            return;
                        }
                        g.b(context, "download_video_start_first_sdk", aweme, g.f(context, aweme, "raw ad download video first start sdk"));
                    }

                    public final void onPrepare(DownloadInfo downloadInfo) {
                        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f39443a, false, 31986, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f39443a, false, 31986, new Class[]{DownloadInfo.class}, Void.TYPE);
                            return;
                        }
                        Context context = context2;
                        Aweme aweme = aweme2;
                        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31664, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31664, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            return;
                        }
                        g.b(context, "download_video_prepare", aweme, g.f(context, aweme, "raw ad download video prepare"));
                    }

                    public final void onStart(DownloadInfo downloadInfo) {
                        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f39443a, false, 31987, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f39443a, false, 31987, new Class[]{DownloadInfo.class}, Void.TYPE);
                            return;
                        }
                        Context context = context2;
                        Aweme aweme = aweme2;
                        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31663, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31663, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            return;
                        }
                        g.b(context, "download_video_start_sdk", aweme, g.f(context, aweme, "raw ad download video start sdk"));
                    }

                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f39443a, false, 31988, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f39443a, false, 31988, new Class[]{DownloadInfo.class}, Void.TYPE);
                            return;
                        }
                        Context context = context2;
                        Aweme aweme = aweme2;
                        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31659, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31659, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            return;
                        }
                        g.b(context, "download_video_succeed", aweme, g.f(context, aweme, "raw ad download_video_succeed"));
                    }

                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        int i;
                        String str;
                        if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException}, this, f39443a, false, 31989, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException}, this, f39443a, false, 31989, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
                            return;
                        }
                        if (baseException == null) {
                            i = 0;
                        } else {
                            i = baseException.getErrorCode();
                        }
                        if (baseException == null) {
                            str = "";
                        } else {
                            str = baseException.getErrorMessage();
                        }
                        Context context = context2;
                        Aweme aweme = aweme2;
                        if (PatchProxy.isSupport(new Object[]{context, aweme, Integer.valueOf(i), str}, null, g.f39316a, true, 31660, new Class[]{Context.class, Aweme.class, Integer.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme, Integer.valueOf(i), str}, null, g.f39316a, true, 31660, new Class[]{Context.class, Aweme.class, Integer.TYPE, String.class}, Void.TYPE);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("failed_code", String.valueOf(i));
                            hashMap.put("failed_msg", str);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("ad_extra_data", new Gson().toJson((Object) hashMap));
                            g.b(context, "download_video_failed", aweme, g.a(context, aweme, "raw ad download_video_failed", false, (Map<String, String>) hashMap2));
                        }
                        if (i == 1034) {
                            File file = new File(a.f39439c + aweme2.getAid());
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                };
                VideoUrlModel playAddrH264 = aweme.getVideo().getPlayAddrH264();
                if (playAddrH264 == null) {
                    g.e(context2, aweme2, "video_url_model_null");
                    return;
                }
                playAddrH264.setSourceId(aweme.getAid());
                if (new File(f39439c + playAddrH264.getSourceId()).exists()) {
                    g.e(context2, aweme2, "video_exists");
                    return;
                }
                List<String> urlList = playAddrH264.getUrlList();
                if (CollectionUtils.isEmpty(urlList)) {
                    g.e(context2, aweme2, "video_url_list_null");
                    return;
                }
                String str = urlList.get(0);
                if (TextUtils.isEmpty(str)) {
                    g.e(context2, aweme2, "video_url_first_null");
                    return;
                }
                ArrayList arrayList = new ArrayList(urlList);
                arrayList.remove(str);
                int a2 = b.a(str, f39439c);
                if (Downloader.getInstance(context).isDownloading(a2)) {
                    g.e(context2, aweme2, "is_downloading");
                    return;
                }
                DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(a2);
                int i2 = 100;
                if (downloadInfo != null) {
                    i2 = downloadInfo.getStatus();
                }
                if (PatchProxy.isSupport(new Object[]{context2, aweme2, Integer.valueOf(i2)}, null, g.f39316a, true, 31662, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2, aweme2, Integer.valueOf(i2)}, null, g.f39316a, true, 31662, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("download_status", String.valueOf(i2));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("ad_extra_data", new Gson().toJson((Object) hashMap));
                    g.b(context2, "download_video_start", aweme2, g.a(context2, aweme2, "raw ad download video start", false, (Map<String, String>) hashMap2));
                }
                Downloader.with(context).url(str).backUpUrls(arrayList).savePath(f39439c).md5(playAddrH264.getFileHash()).name(aweme.getAid()).showNotification(false).mainThreadListener(r3).download();
            } else {
                g.e(context2, aweme2, "wifi_only");
            }
        }
    }
}
