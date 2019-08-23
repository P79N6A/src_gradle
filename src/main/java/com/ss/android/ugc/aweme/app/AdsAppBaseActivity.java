package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.message.a;
import com.ss.android.sdk.activity.SSActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.e;
import com.ss.android.ugc.aweme.base.e.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.im.f;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.services.MainServiceForPush;
import com.ss.android.ugc.aweme.util.k;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class AdsAppBaseActivity extends SSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f33643b;

    /* renamed from: a  reason: collision with root package name */
    private String f33644a;

    /* renamed from: c  reason: collision with root package name */
    protected e f33645c = new e();

    /* renamed from: d  reason: collision with root package name */
    protected Uri f33646d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f33647e = false;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f33648f = false;
    protected String g = null;
    private String h;
    private BaseAppData i;

    public abstract void a();

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f33643b, false, 22145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33643b, false, 22145, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        Logger.debug();
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f33643b, false, 22129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33643b, false, 22129, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        finish();
    }

    public Resources getResources() {
        if (PatchProxy.isSupport(new Object[0], this, f33643b, false, 22147, new Class[0], Resources.class)) {
            return (Resources) PatchProxy.accessDispatch(new Object[0], this, f33643b, false, 22147, new Class[0], Resources.class);
        } else if (d.a(this)) {
            return new d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        } else {
            return super.getResources();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.content.Intent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f33643b
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 22137(0x5679, float:3.102E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f33643b
            r5 = 0
            r6 = 22137(0x5679, float:3.102E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            com.bytedance.common.utility.Logger.debug()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f33643b
            r4 = 0
            r5 = 22138(0x567a, float:3.1022E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.content.Intent> r7 = android.content.Intent.class
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0053
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f33643b
            r5 = 0
            r6 = 22138(0x567a, float:3.1022E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.content.Intent> r8 = android.content.Intent.class
            r3 = r10
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.content.Intent r1 = (android.content.Intent) r1
            goto L_0x0101
        L_0x0053:
            java.lang.String r1 = r10.f33644a
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0066
            java.lang.String r1 = r10.getPackageName()
            android.content.Intent r2 = com.ss.android.common.util.ToolUtils.getLaunchIntentForPackage(r10, r1)
            goto L_0x0100
        L_0x0066:
            java.lang.String r1 = "profile"
            java.lang.String r3 = r10.f33644a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0100
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f33643b
            r6 = 0
            r7 = 22139(0x567b, float:3.1023E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<android.content.Intent> r9 = android.content.Intent.class
            r4 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x0096
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f33643b
            r6 = 0
            r7 = 22139(0x567b, float:3.1023E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<android.content.Intent> r9 = android.content.Intent.class
            r4 = r10
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            android.content.Intent r2 = (android.content.Intent) r2
            goto L_0x0100
        L_0x0096:
            android.net.Uri r1 = r10.f33646d
            if (r1 == 0) goto L_0x0100
            android.net.Uri r1 = r10.f33646d
            java.lang.String r3 = "uid"
            long r3 = r10.a((android.net.Uri) r1, (java.lang.String) r3)
            android.net.Uri r1 = r10.f33646d
            java.lang.String r5 = "wap_url"
            java.lang.String r1 = r1.getQueryParameter(r5)
            boolean r1 = com.ss.android.newmedia.e.a((java.lang.String) r1)
            if (r1 == 0) goto L_0x00c3
            android.net.Uri r1 = r10.f33646d
            java.lang.String r3 = "hide_bar"
            java.lang.String r1 = r1.getQueryParameter(r3)
            a((java.lang.String) r1)
            android.net.Uri r1 = r10.f33646d
            java.lang.String r3 = "back_button_style"
            r10.b(r1, r3)
            goto L_0x0100
        L_0x00c3:
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0100
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            boolean r1 = r1.isLogin()
            if (r1 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            long r5 = java.lang.Long.parseLong(r1)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0100
        L_0x00e3:
            java.lang.String r1 = "/activity"
            java.lang.String r3 = r10.h
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00f2
            java.lang.String r1 = r10.h
            com.bytedance.common.utility.StringUtils.isEmpty(r1)
        L_0x00f2:
            java.lang.String r1 = "/repin"
            java.lang.String r3 = r10.h
            r1.equals(r3)
            java.lang.String r1 = "/comments"
            java.lang.String r3 = r10.h
            r1.equals(r3)
        L_0x0100:
            r1 = r2
        L_0x0101:
            if (r1 != 0) goto L_0x0104
            return r0
        L_0x0104:
            boolean r2 = r10.f33648f
            r3 = 1
            if (r2 == 0) goto L_0x012e
            android.content.Intent r2 = r10.getIntent()
            if (r2 == 0) goto L_0x011a
            java.lang.String r4 = "rule_id"
            java.lang.String r2 = r2.getStringExtra(r4)
            java.lang.String r4 = "rule_id"
            r1.putExtra(r4, r2)
        L_0x011a:
            java.lang.String r2 = "from_notification"
            r1.putExtra(r2, r3)
            java.lang.String r2 = r10.g
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x012e
            java.lang.String r2 = "notification_source"
            java.lang.String r4 = r10.g
            r1.putExtra(r2, r4)
        L_0x012e:
            boolean r2 = r10.f33647e     // Catch:{ Exception -> 0x013b }
            if (r2 != 0) goto L_0x0137
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)     // Catch:{ Exception -> 0x013b }
        L_0x0137:
            r10.startActivity(r1)     // Catch:{ Exception -> 0x013b }
            return r3
        L_0x013b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.AdsAppBaseActivity.b():boolean");
    }

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f33643b, true, 22143, new Class[]{String.class}, Boolean.TYPE)) {
            return a(str2, false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f33643b, true, 22143, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f33643b, false, 22128, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f33643b, false, 22128, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        Logger.debug();
    }

    public final Uri a(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f33643b, false, 22146, new Class[]{Uri.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{uri}, this, f33643b, false, 22146, new Class[]{Uri.class}, Uri.class);
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", this.f33645c.f34120b).appendQueryParameter("page_source", this.f33645c.f34121c).appendQueryParameter("enter_to", this.f33645c.f34122d).appendQueryParameter("platform", this.f33645c.f34123e);
        if (!TextUtils.isEmpty(this.f33645c.f34122d)) {
            appendQueryParameter.appendQueryParameter("needlaunchlog", "true");
        }
        return appendQueryParameter.build();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        long j;
        JSONObject jSONObject;
        long j2;
        JSONObject jSONObject2;
        boolean z5 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33643b, false, 22127, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33643b, false, 22127, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Logger.debug();
        this.i = BaseAppData.a();
        Intent intent = getIntent();
        if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isStartWelcomeScreenActivity(this)) {
            if (intent == null) {
                if (!isFinishing()) {
                    finish();
                }
                return;
            }
            this.f33647e = a.a(intent, f.f34169c, false);
            Intent intent2 = getIntent();
            if (PatchProxy.isSupport(new Object[]{intent2}, this, f33643b, false, 22130, new Class[]{Intent.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2}, this, f33643b, false, 22130, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
            } else {
                String action = intent2.getAction();
                if (!StringUtils.isEmpty(action) && action.indexOf(f.f34170d) == 0) {
                    String stringExtra = intent2.getStringExtra(f.f34168b);
                    if (!StringUtils.isEmpty(stringExtra)) {
                        this.f33646d = Uri.parse(stringExtra);
                    }
                }
                if (this.f33646d == null) {
                    this.f33646d = intent2.getData();
                }
                if (this.f33646d == null) {
                    z = false;
                } else {
                    this.f33644a = this.f33646d.getHost();
                    this.h = this.f33646d.getPath();
                    z = true;
                }
            }
            if (!z) {
                if (!isFinishing()) {
                    finish();
                }
                k.a("", false, "abs uri==null");
            }
            this.f33648f = a.a(intent, "from_notification", false);
            AwemeAppData.p().aj = this.f33648f;
            if (this.f33648f) {
                this.g = c(this.f33646d, "source");
                if (PatchProxy.isSupport(new Object[]{intent}, this, f33643b, false, 22133, new Class[]{Intent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{intent}, this, f33643b, false, 22133, new Class[]{Intent.class}, Void.TYPE);
                } else {
                    try {
                        int a2 = a.a(intent, "msg_from", -1);
                        int a3 = a.a(intent, "msg_id", -1);
                        HashMap hashMap = (HashMap) intent.getSerializableExtra("log_data_extra_to_adsapp");
                        if (hashMap == null) {
                            hashMap = new HashMap();
                            if (this.f33646d != null) {
                                String c2 = c(this.f33646d, "push_id");
                                if (!TextUtils.isEmpty(c2)) {
                                    hashMap.put("rule_id", c2);
                                }
                                String c3 = c(this.f33646d, "gd_label");
                                if (!TextUtils.isEmpty(c3)) {
                                    hashMap.put("push_label", c3);
                                }
                                String host = this.f33646d.getHost();
                                String c4 = c(this.f33646d, "id");
                                if ("detail".equals(host) && !TextUtils.isEmpty(c4)) {
                                    hashMap.put("group_id", c(this.f33646d, "id"));
                                } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(this.f33646d.getLastPathSegment())) {
                                    hashMap.put("group_id", this.f33646d.getLastPathSegment());
                                }
                            }
                        }
                        HashMap hashMap2 = hashMap;
                        String stringExtra2 = intent.getStringExtra("post_back");
                        if (hashMap2 == null) {
                            str = "";
                        } else {
                            str = (String) hashMap2.get("rule_id");
                        }
                        String str2 = str;
                        if (TextUtils.isEmpty(intent.getStringExtra("rule_id"))) {
                            intent.putExtra("rule_id", str2);
                        }
                        String c5 = c(this.f33646d, "push_params");
                        if (!TextUtils.isEmpty(c5)) {
                            hashMap2.put("feed_batch_params", c5);
                        }
                        String c6 = c(this.f33646d, "gids");
                        if (!TextUtils.isEmpty(c6) && TextUtils.equals("aweme", this.f33644a)) {
                            if (c6.contains(",")) {
                                c6 = c6.substring(0, c6.indexOf(","));
                            }
                            hashMap2.put("group_id", c6);
                        }
                        switch (a2) {
                            case 1:
                                long j3 = (long) a3;
                                long j4 = j3;
                                com.ss.android.di.push.a.a().onEvent(this, "news_notify_view", j3, -1, new JSONObject[0]);
                                IPushApi a4 = com.ss.android.di.push.a.a();
                                if (TextUtils.isEmpty(str2)) {
                                    j = j4;
                                } else {
                                    j = Long.valueOf(str2).longValue();
                                }
                                if (hashMap2 == null) {
                                    jSONObject = null;
                                } else {
                                    jSONObject = new JSONObject(hashMap2);
                                }
                                a4.trackClickPush(this, j, true, stringExtra2, jSONObject);
                                break;
                            case 2:
                                long j5 = (long) a3;
                                long j6 = j5;
                                com.ss.android.di.push.a.a().onEvent(this, "news_notify_view", j5, -1, new JSONObject[0]);
                                IPushApi a5 = com.ss.android.di.push.a.a();
                                if (TextUtils.isEmpty(str2)) {
                                    j2 = j6;
                                } else {
                                    j2 = Long.valueOf(str2).longValue();
                                }
                                if (hashMap2 == null) {
                                    jSONObject2 = null;
                                } else {
                                    jSONObject2 = new JSONObject(hashMap2);
                                }
                                a5.trackClickPush(this, j2, false, stringExtra2, jSONObject2);
                                break;
                        }
                        int a6 = a.a(intent, "message_from", -1);
                        String stringExtra3 = intent.getStringExtra("message_extra");
                        if (a6 != -1 && !StringUtils.isEmpty(stringExtra3)) {
                            com.ss.android.di.push.a.a().trackPush(getApplicationContext(), a6, stringExtra3);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (this.f33646d != null) {
                MainServiceForPush.reportOpenUrl(this.f33646d.toString());
            }
            if (PatchProxy.isSupport(new Object[0], this, f33643b, false, 22131, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33643b, false, 22131, new Class[0], Void.TYPE);
            } else if (!this.f33648f && this.f33646d != null) {
                String queryParameter = this.f33646d.getQueryParameter("gd_label");
                String queryParameter2 = this.f33646d.getQueryParameter("params_url");
                String queryParameter3 = this.f33646d.getQueryParameter("utm_source");
                Intent intent3 = getIntent();
                if (intent3 == null || !intent3.hasExtra("al_applink_data")) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    this.f33645c.a("link_direct");
                    e eVar = this.f33645c;
                    if (PatchProxy.isSupport(new Object[]{"fb"}, eVar, e.f34119a, false, 23490, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{"fb"}, eVar, e.f34119a, false, 23490, new Class[]{String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull("fb", "value");
                        if (eVar.f34121c.length() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            eVar.f34121c = "fb";
                        }
                    }
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.f33645c.a(queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    e eVar2 = this.f33645c;
                    if (PatchProxy.isSupport(new Object[]{queryParameter3}, eVar2, e.f34119a, false, 23492, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{queryParameter3}, eVar2, e.f34119a, false, 23492, new Class[]{String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(queryParameter3, "<set-?>");
                        eVar2.f34123e = queryParameter3;
                    }
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.f33646d = a(this.f33646d, "params_url", URLDecoder.decode(queryParameter2));
                }
            }
            com.ss.android.sdk.a.a(this, this.l);
            if (PatchProxy.isSupport(new Object[0], this, f33643b, false, 22134, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33643b, false, 22134, new Class[0], Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f33643b, false, 22136, new Class[0], Boolean.TYPE)) {
                    z5 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33643b, false, 22136, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!TimeLockRuler.isTeenModeON()) {
                    z5 = false;
                } else if (!p.a().c()) {
                    startActivity(new Intent(this, MainActivity.class));
                }
                if (!z5) {
                    if (PatchProxy.isSupport(new Object[0], this, f33643b, false, 22135, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33643b, false, 22135, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z2 = f.a((Context) this, this.f33646d);
                    }
                    if (!z2 && !b()) {
                        a();
                    }
                }
            }
            Logger.debug();
        }
    }

    private long a(Uri uri, String str) {
        if (PatchProxy.isSupport(new Object[]{uri, str}, this, f33643b, false, 22140, new Class[]{Uri.class, String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{uri, str}, this, f33643b, false, 22140, new Class[]{Uri.class, String.class}, Long.TYPE)).longValue();
        }
        try {
            return Long.valueOf(uri.getQueryParameter(str)).longValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    private int b(Uri uri, String str) {
        if (PatchProxy.isSupport(new Object[]{uri, str}, this, f33643b, false, 22141, new Class[]{Uri.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri, str}, this, f33643b, false, 22141, new Class[]{Uri.class, String.class}, Integer.TYPE)).intValue();
        }
        try {
            return Integer.valueOf(uri.getQueryParameter(str)).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    private String c(Uri uri, String str) {
        if (PatchProxy.isSupport(new Object[]{uri, str}, this, f33643b, false, 22142, new Class[]{Uri.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{uri, str}, this, f33643b, false, 22142, new Class[]{Uri.class, String.class}, String.class);
        }
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 0}, null, f33643b, true, 22144, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, (byte) 0}, null, f33643b, true, 22144, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            return PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str2);
        }
    }

    private static Uri a(Uri uri, String str, String str2) {
        String str3;
        Uri uri2 = uri;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{uri2, str4, str2}, null, f33643b, true, 22132, new Class[]{Uri.class, String.class, String.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{uri2, str4, str2}, null, f33643b, true, 22132, new Class[]{Uri.class, String.class, String.class}, Uri.class);
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String next : queryParameterNames) {
            if (next.equals(str4)) {
                str3 = str2;
            } else {
                str3 = uri2.getQueryParameter(next);
            }
            clearQuery.appendQueryParameter(next, str3);
        }
        return clearQuery.build();
    }
}
