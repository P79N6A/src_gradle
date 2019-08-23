package com.ss.android.ugc.aweme.app.c.a;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.download.api.a;
import com.ss.android.download.api.b;
import com.ss.android.download.api.c.a;
import com.ss.android.download.api.config.d;
import com.ss.android.download.api.config.e;
import com.ss.android.download.api.config.f;
import com.ss.android.download.api.config.j;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.c.a;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.commercialize.log.c;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33988a;

    /* renamed from: b  reason: collision with root package name */
    public static JSONObject f33989b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f33990c = false;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f33991d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f33992e = Runtime.getRuntime().availableProcessors();

    /* renamed from: f  reason: collision with root package name */
    private static final int f33993f = Math.max(2, Math.min(f33992e - 1, 4));
    private static ExecutorService g = h.a(m.a(p.FIXED).a("downloader-db").a(f33993f).a());

    public static b b() {
        if (PatchProxy.isSupport(new Object[0], null, f33988a, true, 23370, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f33988a, true, 23370, new Class[0], b.class);
        }
        return a().f29059c;
    }

    public static com.ss.android.downloadlib.h a() {
        if (PatchProxy.isSupport(new Object[0], null, f33988a, true, 23368, new Class[0], com.ss.android.downloadlib.h.class)) {
            return (com.ss.android.downloadlib.h) PatchProxy.accessDispatch(new Object[0], null, f33988a, true, 23368, new Class[0], com.ss.android.downloadlib.h.class);
        }
        final k a2 = k.a();
        if (PatchProxy.isSupport(new Object[]{a2}, null, f33988a, true, 23371, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{a2}, null, f33988a, true, 23371, new Class[]{Context.class}, Void.TYPE);
        } else if (!f33991d) {
            synchronized (c.class) {
                if (!f33991d) {
                    if (PatchProxy.isSupport(new Object[]{a2}, null, f33988a, true, 23372, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{a2}, null, f33988a, true, 23372, new Class[]{Context.class}, Void.TYPE);
                    } else {
                        i a3 = i.a();
                        a a4 = com.ss.android.downloadlib.h.a((Context) a2).f29057a.a((f) new f() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33996a;

                            public final void a(@NonNull String[] strArr, @NonNull int[] iArr) {
                            }

                            public final boolean a(@Nullable Context context, @NonNull String str) {
                                if (PatchProxy.isSupport(new Object[]{context, str}, this, f33996a, false, 23395, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, f33996a, false, 23395, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                                } else if (context == null || ContextCompat.checkSelfPermission(context, str) != 0) {
                                    return false;
                                } else {
                                    return true;
                                }
                            }

                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.Object[]} */
                            /* JADX WARNING: Multi-variable type inference failed */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void a(@android.support.annotation.NonNull android.app.Activity r22, @android.support.annotation.NonNull java.lang.String[] r23, com.ss.android.download.api.config.l r24) {
                                /*
                                    r21 = this;
                                    r0 = r22
                                    r1 = r23
                                    r2 = r24
                                    r3 = 3
                                    java.lang.Object[] r4 = new java.lang.Object[r3]
                                    r11 = 0
                                    r4[r11] = r0
                                    r12 = 1
                                    r4[r12] = r1
                                    r13 = 2
                                    r4[r13] = r2
                                    com.meituan.robust.ChangeQuickRedirect r6 = f33996a
                                    java.lang.Class[] r9 = new java.lang.Class[r3]
                                    java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
                                    r9[r11] = r5
                                    java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
                                    r9[r12] = r5
                                    java.lang.Class<com.ss.android.download.api.config.l> r5 = com.ss.android.download.api.config.l.class
                                    r9[r13] = r5
                                    java.lang.Class r10 = java.lang.Void.TYPE
                                    r7 = 0
                                    r8 = 23396(0x5b64, float:3.2785E-41)
                                    r5 = r21
                                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                                    if (r4 == 0) goto L_0x0055
                                    java.lang.Object[] r14 = new java.lang.Object[r3]
                                    r14[r11] = r0
                                    r14[r12] = r1
                                    r14[r13] = r2
                                    com.meituan.robust.ChangeQuickRedirect r16 = f33996a
                                    r17 = 0
                                    r18 = 23396(0x5b64, float:3.2785E-41)
                                    java.lang.Class[] r0 = new java.lang.Class[r3]
                                    java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                                    r0[r11] = r1
                                    java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                    r0[r12] = r1
                                    java.lang.Class<com.ss.android.download.api.config.l> r1 = com.ss.android.download.api.config.l.class
                                    r0[r13] = r1
                                    java.lang.Class r20 = java.lang.Void.TYPE
                                    r15 = r21
                                    r19 = r0
                                    com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                                    return
                                L_0x0055:
                                    java.lang.Object[] r4 = new java.lang.Object[r3]
                                    r4[r11] = r0
                                    r4[r12] = r1
                                    r4[r13] = r2
                                    r5 = 0
                                    com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.app.c.a.c.f33988a
                                    r7 = 1
                                    r8 = 23373(0x5b4d, float:3.2753E-41)
                                    java.lang.Class[] r9 = new java.lang.Class[r3]
                                    java.lang.Class<android.app.Activity> r10 = android.app.Activity.class
                                    r9[r11] = r10
                                    java.lang.Class<java.lang.String[]> r10 = java.lang.String[].class
                                    r9[r12] = r10
                                    java.lang.Class<com.ss.android.download.api.config.l> r10 = com.ss.android.download.api.config.l.class
                                    r9[r13] = r10
                                    java.lang.Class r10 = java.lang.Void.TYPE
                                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                                    if (r4 == 0) goto L_0x009e
                                    java.lang.Object[] r14 = new java.lang.Object[r3]
                                    r14[r11] = r0
                                    r14[r12] = r1
                                    r14[r13] = r2
                                    r15 = 0
                                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.app.c.a.c.f33988a
                                    r17 = 1
                                    r18 = 23373(0x5b4d, float:3.2753E-41)
                                    java.lang.Class[] r0 = new java.lang.Class[r3]
                                    java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                                    r0[r11] = r1
                                    java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                    r0[r12] = r1
                                    java.lang.Class<com.ss.android.download.api.config.l> r1 = com.ss.android.download.api.config.l.class
                                    r0[r13] = r1
                                    java.lang.Class r20 = java.lang.Void.TYPE
                                    r19 = r0
                                    com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                                    return
                                L_0x009e:
                                    if (r0 == 0) goto L_0x00cd
                                    r3 = 0
                                    r4 = 1
                                L_0x00a2:
                                    int r5 = r1.length
                                    if (r3 >= r5) goto L_0x00b6
                                    r4 = r1[r11]
                                    int r4 = android.support.v4.content.ContextCompat.checkSelfPermission(r0, r4)
                                    if (r4 != 0) goto L_0x00af
                                    r4 = 1
                                    goto L_0x00b0
                                L_0x00af:
                                    r4 = 0
                                L_0x00b0:
                                    if (r4 != 0) goto L_0x00b3
                                    goto L_0x00b7
                                L_0x00b3:
                                    int r3 = r3 + 1
                                    goto L_0x00a2
                                L_0x00b6:
                                    r3 = 0
                                L_0x00b7:
                                    if (r2 == 0) goto L_0x00cd
                                    if (r4 == 0) goto L_0x00bf
                                    r24.a()
                                    return
                                L_0x00bf:
                                    java.lang.String[] r1 = new java.lang.String[r12]
                                    java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
                                    r1[r11] = r4
                                    com.ss.android.ugc.aweme.app.c.a.c$13 r4 = new com.ss.android.ugc.aweme.app.c.a.c$13
                                    r4.<init>(r0, r3, r2)
                                    com.ss.android.ugc.aweme.ac.b.a(r0, r1, r4)
                                L_0x00cd:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.a.c.AnonymousClass12.a(android.app.Activity, java.lang.String[], com.ss.android.download.api.config.l):void");
                            }
                        }).a((d) new d() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33995a;

                            public final void a(@NonNull com.ss.android.download.api.c.d dVar) {
                                long j;
                                long j2;
                                JSONObject jSONObject;
                                com.ss.android.download.api.c.d dVar2 = dVar;
                                if (PatchProxy.isSupport(new Object[]{dVar2}, this, f33995a, false, 23393, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dVar2}, this, f33995a, false, 23393, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE);
                                    return;
                                }
                                if (PatchProxy.isSupport(new Object[]{dVar2}, null, c.f33988a, true, 23375, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dVar2}, null, c.f33988a, true, 23375, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE);
                                    return;
                                }
                                if (dVar2.f28482d && TextUtils.equals(dVar2.f28481c, "click")) {
                                    Object obj = dVar2.k;
                                    AwemeRawAd awemeRawAd = null;
                                    if (obj instanceof AwemeRawAd) {
                                        awemeRawAd = (AwemeRawAd) obj;
                                    }
                                    if (awemeRawAd != null) {
                                        j = awemeRawAd.getCreativeId().longValue();
                                    } else {
                                        j = 0;
                                    }
                                    if (j == 0) {
                                        j = dVar2.f28483e;
                                    }
                                    if (awemeRawAd == null || awemeRawAd.getGroupId() == null) {
                                        j2 = dVar2.g;
                                    } else {
                                        j2 = awemeRawAd.getGroupId().longValue();
                                    }
                                    long j3 = j2;
                                    String str = dVar2.f28479a;
                                    String str2 = dVar2.f28480b;
                                    String valueOf = String.valueOf(j);
                                    String str3 = dVar2.f28484f;
                                    JSONObject jSONObject2 = dVar2.h;
                                    if (PatchProxy.isSupport(new Object[]{str, str2, valueOf, str3, new Long(j3), jSONObject2}, null, com.ss.android.ugc.aweme.commercialize.log.b.f39292a, true, 31446, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str, str2, valueOf, str3, new Long(j3), jSONObject2}, null, com.ss.android.ugc.aweme.commercialize.log.b.f39292a, true, 31446, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
                                    } else {
                                        if (jSONObject2 == null) {
                                            try {
                                                jSONObject = new JSONObject();
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            jSONObject = jSONObject2;
                                        }
                                        new c.a().b("realtime_ad").a("realtime_click").a(Long.parseLong(valueOf)).c(str3).b(j3).a(jSONObject).a().a();
                                        jSONObject.put("has_v3", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                        r.a(str, str2, "click", valueOf, j3, jSONObject);
                                    }
                                    c.a(dVar2, awemeRawAd);
                                }
                            }

                            public final void onEvent(@NonNull com.ss.android.download.api.c.d dVar) {
                                long j;
                                long j2;
                                JSONObject jSONObject;
                                com.ss.android.download.api.c.d dVar2 = dVar;
                                if (PatchProxy.isSupport(new Object[]{dVar2}, this, f33995a, false, 23394, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dVar2}, this, f33995a, false, 23394, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE);
                                    return;
                                }
                                if (PatchProxy.isSupport(new Object[]{dVar2}, null, c.f33988a, true, 23376, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dVar2}, null, c.f33988a, true, 23376, new Class[]{com.ss.android.download.api.c.d.class}, Void.TYPE);
                                } else if (dVar2.f28482d) {
                                    Object obj = dVar2.k;
                                    AwemeRawAd awemeRawAd = null;
                                    if (obj instanceof AwemeRawAd) {
                                        awemeRawAd = (AwemeRawAd) obj;
                                    }
                                    if (awemeRawAd != null) {
                                        j = awemeRawAd.getCreativeId().longValue();
                                    } else {
                                        j = 0;
                                    }
                                    if (j == 0) {
                                        j = dVar2.f28483e;
                                    }
                                    if (awemeRawAd == null || awemeRawAd.getGroupId() == null) {
                                        j2 = dVar2.g;
                                    } else {
                                        j2 = awemeRawAd.getGroupId().longValue();
                                    }
                                    if (TextUtils.equals("click", dVar2.f28481c)) {
                                        Context context = GlobalContext.getContext();
                                        String str = dVar2.f28480b;
                                        String str2 = dVar2.f28481c;
                                        String valueOf = String.valueOf(j);
                                        JSONObject jSONObject2 = dVar2.h;
                                        if (PatchProxy.isSupport(new Object[]{context, str, str2, valueOf, new Long(j2), jSONObject2}, null, g.f39316a, true, 31714, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{context, str, str2, valueOf, new Long(j2), jSONObject2}, null, g.f39316a, true, 31714, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
                                        } else {
                                            if (jSONObject2 == null) {
                                                jSONObject = new JSONObject();
                                            } else {
                                                jSONObject = jSONObject2;
                                            }
                                            g.a(context, str, str2, jSONObject, valueOf, j2);
                                        }
                                    } else {
                                        r.a(GlobalContext.getContext(), dVar2.f28480b, dVar2.f28481c, String.valueOf(j), j2, dVar2.h);
                                    }
                                    if (TextUtils.equals(dVar2.f28481c, "click")) {
                                        c.a(dVar2, awemeRawAd);
                                    }
                                } else {
                                    r.a(dVar2.f28479a, dVar2.f28480b, dVar2.f28481c, String.valueOf(dVar2.f28483e), dVar2.g, dVar2.h);
                                }
                            }
                        }).a((com.ss.android.download.api.config.h) new com.ss.android.download.api.config.h() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33994a;

                            public final Notification a(@NonNull NotificationCompat.Builder builder) {
                                if (!PatchProxy.isSupport(new Object[]{builder}, this, f33994a, false, 23392, new Class[]{NotificationCompat.Builder.class}, Notification.class)) {
                                    return builder.build();
                                }
                                return (Notification) PatchProxy.accessDispatch(new Object[]{builder}, this, f33994a, false, 23392, new Class[]{NotificationCompat.Builder.class}, Notification.class);
                            }

                            public final Dialog a(@NonNull com.ss.android.download.api.c.c cVar) {
                                com.ss.android.download.api.c.c cVar2 = cVar;
                                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f33994a, false, 23391, new Class[]{com.ss.android.download.api.c.c.class}, Dialog.class)) {
                                    return (Dialog) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f33994a, false, 23391, new Class[]{com.ss.android.download.api.c.c.class}, Dialog.class);
                                }
                                if (PatchProxy.isSupport(new Object[]{cVar2}, null, c.f33988a, true, 23378, new Class[]{com.ss.android.download.api.c.c.class}, Dialog.class)) {
                                    return (Dialog) PatchProxy.accessDispatch(new Object[]{cVar2}, null, c.f33988a, true, 23378, new Class[]{com.ss.android.download.api.c.c.class}, Dialog.class);
                                } else if (cVar2 == null) {
                                    return null;
                                } else {
                                    AlertDialog.Builder a2 = com.ss.android.a.a.a(cVar2.f28467a);
                                    a2.setTitle((CharSequence) cVar2.f28468b).setMessage((CharSequence) cVar2.f28469c).setPositiveButton((CharSequence) cVar2.f28470d, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(cVar2) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f34007a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ com.ss.android.download.api.c.c f34008b;

                                        {
                                            this.f34008b = r1;
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f34007a, false, 23385, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f34007a, false, 23385, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            if (this.f34008b.h != null) {
                                                this.f34008b.h.a(dialogInterface);
                                            }
                                        }
                                    }).setNegativeButton((CharSequence) cVar2.f28471e, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(cVar2) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f34005a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ com.ss.android.download.api.c.c f34006b;

                                        {
                                            this.f34006b = r1;
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f34005a, false, 23384, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f34005a, false, 23384, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            if (this.f34006b.h != null) {
                                                this.f34006b.h.b(dialogInterface);
                                            }
                                        }
                                    }).setOnCancelListener(new DialogInterface.OnCancelListener(cVar2) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f34003a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ com.ss.android.download.api.c.c f34004b;

                                        {
                                            this.f34004b = r1;
                                        }

                                        public final void onCancel(DialogInterface dialogInterface) {
                                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f34003a, false, 23383, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f34003a, false, 23383, new Class[]{DialogInterface.class}, Void.TYPE);
                                                return;
                                            }
                                            if (this.f34004b.h != null) {
                                                this.f34004b.h.c(dialogInterface);
                                            }
                                        }
                                    });
                                    if (cVar2.g != null) {
                                        a2.setIcon(cVar2.g);
                                    }
                                    AlertDialog show = a2.show();
                                    show.setCanceledOnTouchOutside(cVar2.f28472f);
                                    return show;
                                }
                            }

                            public final void a(@Nullable Context context, String str, Drawable drawable, int i) {
                                if (PatchProxy.isSupport(new Object[]{context, str, drawable, Integer.valueOf(i)}, this, f33994a, false, 23390, new Class[]{Context.class, String.class, Drawable.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{context, str, drawable, Integer.valueOf(i)}, this, f33994a, false, 23390, new Class[]{Context.class, String.class, Drawable.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                com.bytedance.ies.dmt.ui.d.a.c(context, str).a();
                            }
                        }).a((e) new e() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f34013a;

                            /* JADX WARNING: Code restructure failed: missing block: B:35:0x016e, code lost:
                                return;
                             */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void a(java.lang.String r24, java.lang.String r25, java.util.Map<java.lang.String, java.lang.Object> r26, com.ss.android.download.api.config.k r27) {
                                /*
                                    r23 = this;
                                    r0 = r24
                                    r1 = r25
                                    r3 = 4
                                    java.lang.Object[] r4 = new java.lang.Object[r3]
                                    r11 = 0
                                    r4[r11] = r0
                                    r12 = 1
                                    r4[r12] = r1
                                    r13 = 2
                                    r4[r13] = r26
                                    r14 = 0
                                    r15 = 3
                                    r4[r15] = r14
                                    com.meituan.robust.ChangeQuickRedirect r6 = f34013a
                                    java.lang.Class[] r9 = new java.lang.Class[r3]
                                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                                    r9[r11] = r5
                                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                                    r9[r12] = r5
                                    java.lang.Class<java.util.Map> r5 = java.util.Map.class
                                    r9[r13] = r5
                                    java.lang.Class<com.ss.android.download.api.config.k> r5 = com.ss.android.download.api.config.k.class
                                    r9[r15] = r5
                                    java.lang.Class r10 = java.lang.Void.TYPE
                                    r7 = 0
                                    r8 = 23389(0x5b5d, float:3.2775E-41)
                                    r5 = r23
                                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                                    if (r4 == 0) goto L_0x0063
                                    java.lang.Object[] r4 = new java.lang.Object[r3]
                                    r4[r11] = r0
                                    r4[r12] = r1
                                    r4[r13] = r26
                                    r4[r15] = r14
                                    com.meituan.robust.ChangeQuickRedirect r18 = f34013a
                                    r19 = 0
                                    r20 = 23389(0x5b5d, float:3.2775E-41)
                                    java.lang.Class[] r0 = new java.lang.Class[r3]
                                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                    r0[r11] = r1
                                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                    r0[r12] = r1
                                    java.lang.Class<java.util.Map> r1 = java.util.Map.class
                                    r0[r13] = r1
                                    java.lang.Class<com.ss.android.download.api.config.k> r1 = com.ss.android.download.api.config.k.class
                                    r0[r15] = r1
                                    java.lang.Class r22 = java.lang.Void.TYPE
                                    r16 = r4
                                    r17 = r23
                                    r21 = r0
                                    com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
                                    return
                                L_0x0063:
                                    r3 = -1
                                    int r4 = r24.hashCode()     // Catch:{ Throwable -> 0x016f }
                                    r5 = 70454(0x11336, float:9.8727E-41)
                                    if (r4 == r5) goto L_0x007d
                                    r5 = 2461856(0x2590a0, float:3.449795E-39)
                                    if (r4 == r5) goto L_0x0073
                                    goto L_0x0086
                                L_0x0073:
                                    java.lang.String r4 = "POST"
                                    boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x016f }
                                    if (r0 == 0) goto L_0x0086
                                    r3 = 1
                                    goto L_0x0086
                                L_0x007d:
                                    java.lang.String r4 = "GET"
                                    boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x016f }
                                    if (r0 == 0) goto L_0x0086
                                    r3 = 0
                                L_0x0086:
                                    switch(r3) {
                                        case 0: goto L_0x012c;
                                        case 1: goto L_0x008b;
                                        default: goto L_0x0089;
                                    }     // Catch:{ Throwable -> 0x016f }
                                L_0x0089:
                                    goto L_0x016e
                                L_0x008b:
                                    java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x016f }
                                    r4[r11] = r1     // Catch:{ Throwable -> 0x016f }
                                    r4[r12] = r26     // Catch:{ Throwable -> 0x016f }
                                    r4[r13] = r14     // Catch:{ Throwable -> 0x016f }
                                    r5 = 0
                                    com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.app.c.a.c.f33988a     // Catch:{ Throwable -> 0x016f }
                                    r7 = 1
                                    r8 = 23380(0x5b54, float:3.2762E-41)
                                    java.lang.Class[] r9 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                                    r9[r11] = r0     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<java.util.Map> r0 = java.util.Map.class
                                    r9[r12] = r0     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<com.ss.android.download.api.config.k> r0 = com.ss.android.download.api.config.k.class
                                    r9[r13] = r0     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x016f }
                                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x016f }
                                    if (r0 == 0) goto L_0x00d3
                                    java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x016f }
                                    r0[r11] = r1     // Catch:{ Throwable -> 0x016f }
                                    r0[r12] = r26     // Catch:{ Throwable -> 0x016f }
                                    r0[r13] = r14     // Catch:{ Throwable -> 0x016f }
                                    r2 = 0
                                    com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.app.c.a.c.f33988a     // Catch:{ Throwable -> 0x016f }
                                    r4 = 1
                                    r5 = 23380(0x5b54, float:3.2762E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                    r6[r11] = r1     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<java.util.Map> r1 = java.util.Map.class
                                    r6[r12] = r1     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<com.ss.android.download.api.config.k> r1 = com.ss.android.download.api.config.k.class
                                    r6[r13] = r1     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x016f }
                                    r1 = r0
                                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x016f }
                                    goto L_0x016f
                                L_0x00d3:
                                    java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x016f }
                                    r11.<init>()     // Catch:{ Throwable -> 0x016f }
                                    android.util.Pair r0 = com.bytedance.frameworks.baselib.network.http.util.UrlUtils.parseUrl(r1, r11)     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Object r1 = r0.first     // Catch:{ Throwable -> 0x016f }
                                    java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Object r0 = r0.second     // Catch:{ Throwable -> 0x016f }
                                    r10 = r0
                                    java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x016f }
                                    java.util.LinkedHashMap r12 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x016f }
                                    r12.<init>()     // Catch:{ Throwable -> 0x016f }
                                    if (r26 == 0) goto L_0x0116
                                    int r0 = r26.size()     // Catch:{ Throwable -> 0x016f }
                                    if (r0 <= 0) goto L_0x0116
                                    java.util.Set r0 = r26.entrySet()     // Catch:{ Throwable -> 0x016f }
                                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x016f }
                                L_0x00fa:
                                    boolean r2 = r0.hasNext()     // Catch:{ Throwable -> 0x016f }
                                    if (r2 == 0) goto L_0x0116
                                    java.lang.Object r2 = r0.next()     // Catch:{ Throwable -> 0x016f }
                                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Object r3 = r2.getKey()     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Object r2 = r2.getValue()     // Catch:{ Throwable -> 0x016f }
                                    java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x016f }
                                    r12.put(r3, r2)     // Catch:{ Throwable -> 0x016f }
                                    goto L_0x00fa
                                L_0x0116:
                                    java.lang.Class<com.bytedance.ttnet.INetworkApi> r0 = com.bytedance.ttnet.INetworkApi.class
                                    java.lang.Object r0 = com.bytedance.ttnet.utils.RetrofitUtils.createSsService(r1, r0)     // Catch:{ Throwable -> 0x016f }
                                    r8 = r0
                                    com.bytedance.ttnet.INetworkApi r8 = (com.bytedance.ttnet.INetworkApi) r8     // Catch:{ Throwable -> 0x016f }
                                    r9 = 40960(0xa000, float:5.7397E-41)
                                    r13 = 0
                                    r14 = 0
                                    com.bytedance.retrofit2.Call r0 = r8.doPost(r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x016f }
                                    r0.execute()     // Catch:{ Throwable -> 0x016f }
                                    goto L_0x016e
                                L_0x012c:
                                    java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x016f }
                                    r2[r11] = r1     // Catch:{ Throwable -> 0x016f }
                                    r2[r12] = r14     // Catch:{ Throwable -> 0x016f }
                                    r3 = 0
                                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.app.c.a.c.f33988a     // Catch:{ Throwable -> 0x016f }
                                    r5 = 1
                                    r6 = 23379(0x5b53, float:3.2761E-41)
                                    java.lang.Class[] r7 = new java.lang.Class[r13]     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                                    r7[r11] = r0     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<com.ss.android.download.api.config.k> r0 = com.ss.android.download.api.config.k.class
                                    r7[r12] = r0     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x016f }
                                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x016f }
                                    if (r0 == 0) goto L_0x0167
                                    java.lang.Object[] r0 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x016f }
                                    r0[r11] = r1     // Catch:{ Throwable -> 0x016f }
                                    r0[r12] = r14     // Catch:{ Throwable -> 0x016f }
                                    r2 = 0
                                    com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.app.c.a.c.f33988a     // Catch:{ Throwable -> 0x016f }
                                    r4 = 1
                                    r5 = 23379(0x5b53, float:3.2761E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                    r6[r11] = r1     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class<com.ss.android.download.api.config.k> r1 = com.ss.android.download.api.config.k.class
                                    r6[r12] = r1     // Catch:{ Throwable -> 0x016f }
                                    java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x016f }
                                    r1 = r0
                                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x016f }
                                    goto L_0x016e
                                L_0x0167:
                                    r0 = 40960(0xa000, float:5.7397E-41)
                                    com.ss.android.common.util.NetworkUtils.executeGet((int) r0, (java.lang.String) r1, (boolean) r11, (boolean) r12)     // Catch:{ Throwable -> 0x016f }
                                    goto L_0x016f
                                L_0x016e:
                                    return
                                L_0x016f:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.a.c.AnonymousClass9.a(java.lang.String, java.lang.String, java.util.Map, com.ss.android.download.api.config.k):void");
                            }
                        }).a((com.ss.android.download.api.config.b) new com.ss.android.download.api.config.b() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f34011a;

                            public final void a(@Nullable Activity activity, @NonNull com.ss.android.download.api.b.c cVar, @Nullable com.ss.android.download.api.b.a aVar, @Nullable com.ss.android.download.api.b.b bVar) {
                                if (PatchProxy.isSupport(new Object[]{activity, cVar, aVar, bVar}, this, f34011a, false, 23388, new Class[]{Activity.class, com.ss.android.download.api.b.c.class, com.ss.android.download.api.b.a.class, com.ss.android.download.api.b.b.class}, Void.TYPE)) {
                                    Object[] objArr = {activity, cVar, aVar, bVar};
                                    PatchProxy.accessDispatch(objArr, this, f34011a, false, 23388, new Class[]{Activity.class, com.ss.android.download.api.b.c.class, com.ss.android.download.api.b.a.class, com.ss.android.download.api.b.b.class}, Void.TYPE);
                                }
                            }
                        }).a((IAppDownloadMonitorListener) new a()).a((com.ss.android.download.api.config.g) new com.ss.android.download.api.config.g() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f34010a;

                            public final JSONObject a() {
                                if (PatchProxy.isSupport(new Object[0], this, f34010a, false, 23387, new Class[0], JSONObject.class)) {
                                    return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f34010a, false, 23387, new Class[0], JSONObject.class);
                                }
                                String str = (String) SharePrefCache.inst().getDownloadSdkConfig().c();
                                if (c.f33989b == null || !c.f33990c) {
                                    try {
                                        if (!TextUtils.isEmpty(str)) {
                                            c.f33989b = new JSONObject(str);
                                            c.f33990c = true;
                                        } else {
                                            c.f33989b = new JSONObject();
                                        }
                                        c.f33989b.put("download_completed_event_tag", "draw_ad");
                                        c.f33989b.put("landing_page_progressbar_visible", 1);
                                        c.f33989b.put("is_enable_show_retry_download_dialog", 1);
                                    } catch (JSONException unused) {
                                        c.f33989b = new JSONObject();
                                    }
                                }
                                return c.f33989b;
                            }
                        }).a((com.ss.android.download.api.config.a) new com.ss.android.download.api.config.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f34009a;

                            public final boolean a() {
                                if (!PatchProxy.isSupport(new Object[0], this, f34009a, false, 23386, new Class[0], Boolean.TYPE)) {
                                    return AwemeAppData.p().as;
                                }
                                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34009a, false, 23386, new Class[0], Boolean.TYPE)).booleanValue();
                            }
                        });
                        a.C0338a aVar = new a.C0338a();
                        aVar.f28457b = String.valueOf(a3.getAid());
                        aVar.f28456a = a3.getAppName();
                        aVar.f28458c = a3.getChannel();
                        aVar.f28459d = a3.getVersion();
                        aVar.f28460e = String.valueOf(a3.getVersionCode());
                        com.ss.android.download.api.a a5 = a4.a(aVar.a()).a((com.ss.android.download.api.config.i) new com.ss.android.download.api.config.i() {
                            public final String a() {
                                return "com.ss.android.ugc.aweme.fileprovider";
                            }
                        });
                        if (PatchProxy.isSupport(new Object[]{a5}, null, com.ss.android.ugc.aweme.app.c.a.f33979a, true, 23352, new Class[]{com.ss.android.download.api.a.class}, com.ss.android.download.api.a.class)) {
                            com.ss.android.download.api.a aVar2 = (com.ss.android.download.api.a) PatchProxy.accessDispatch(new Object[]{a5}, null, com.ss.android.ugc.aweme.app.c.a.f33979a, true, 23352, new Class[]{com.ss.android.download.api.a.class}, com.ss.android.download.api.a.class);
                        } else {
                            a5.a((j) new a.C0437a((byte) 0));
                        }
                        Downloader.init(new DownloaderBuilder(a2).httpService(new b()).ioThreadExecutorService(h.c()).dbThreadExecutorService(g));
                    }
                    f33991d = true;
                }
            }
        }
        return com.ss.android.downloadlib.h.a((Context) k.a());
    }

    static void a(@NonNull com.ss.android.download.api.c.d dVar, AwemeRawAd awemeRawAd) {
        com.ss.android.download.api.c.d dVar2 = dVar;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{dVar2, awemeRawAd2}, null, f33988a, true, 23377, new Class[]{com.ss.android.download.api.c.d.class, AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, awemeRawAd2}, null, f33988a, true, 23377, new Class[]{com.ss.android.download.api.c.d.class, AwemeRawAd.class}, Void.TYPE);
        } else if (awemeRawAd2 == null || !awemeRawAd.isClickTrackUrlListValid()) {
            g.a((g.a) null, (Collection<String>) dVar2.i, true);
        } else {
            g.a((g.a) new d(awemeRawAd2), (Collection<String>) awemeRawAd.getClickTrackUrlList().getUrlList(), true);
        }
    }
}
