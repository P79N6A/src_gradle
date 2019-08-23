package com.ss.android.ugc.aweme.commercialize.utils;

import a.i;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.utils.a.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.a.b;
import com.ss.android.ugc.aweme.commercialize.utils.a.c;
import com.ss.android.ugc.aweme.commercialize.utils.a.d;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.text.StringsKt;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39783a;

    public interface a {
        void a(boolean z);
    }

    public static boolean a(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, f39783a, true, 32329, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str}, null, f39783a, true, 32329, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            return b.b(context2, Uri.parse(str));
        }
    }

    public static boolean a(Context context, Aweme aweme) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, f39783a, true, 32332, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, f39783a, true, 32332, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        } else {
            return b(context2, aweme.getAwemeRawAd().getPackageName());
        }
    }

    public static boolean a(Uri uri) {
        if (!PatchProxy.isSupport(new Object[]{uri}, null, f39783a, true, 32334, new Class[]{Uri.class}, Boolean.TYPE)) {
            return uri != null && (TextUtils.equals("http", uri.getScheme()) || TextUtils.equals("https", uri.getScheme()));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, null, f39783a, true, 32334, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
    }

    private static boolean a(Context context, Aweme aweme, boolean z) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, (byte) 0}, null, f39783a, true, 32336, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme2, (byte) 0}, null, f39783a, true, 32336, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (aweme2 == null || !aweme.isAd()) {
            return false;
        } else {
            return a(context2, aweme.getAwemeRawAd().getOpenUrl(), aweme2, false);
        }
    }

    public static boolean a(Context context, String str, Aweme aweme, boolean z) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{context2, str2, aweme2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39783a, true, 32337, new Class[]{Context.class, String.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)) {
            return a(context2, str2, aweme2, z, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, aweme2, Byte.valueOf(z)}, null, f39783a, true, 32337, new Class[]{Context.class, String.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, String str, Aweme aweme, boolean z, boolean z2) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f39783a, true, 32338, new Class[]{Context.class, String.class, Aweme.class, Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, Byte.valueOf(z), Byte.valueOf(z2)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32338, new Class[]{Context.class, String.class, Aweme.class, Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || aweme2 == null || !aweme.isAd() || TextUtils.isEmpty(str)) {
            return false;
        } else {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getScheme())) {
                return false;
            }
            Uri build = parse.buildUpon().appendQueryParameter("source_aid", aweme.getAid()).build();
            if (d(build.getScheme().toLowerCase())) {
                d.a(str);
                f.f34171e.a(context2, str2, null);
                return true;
            } else if (z) {
                return false;
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(build);
                if (!ToolUtils.isInstalledApp(context2, intent)) {
                    return false;
                }
                if (str2.contains("__back_url__")) {
                    str2 = str2.replace("__back_url__", Uri.encode("snssdk1128://adx"));
                    intent.setData(Uri.parse(str2));
                    i.a((Callable<TResult>) new h<TResult>(aweme2));
                }
                intent.putExtra(f.f34168b, str2);
                intent.addFlags(268435456);
                if (!a(context2, intent)) {
                    return false;
                }
                boolean X = c.X(aweme);
                if (z2 && !X) {
                    com.ss.android.ugc.aweme.commercialize.log.g.f(context2, aweme2);
                    a((a) new i(context2, aweme2));
                }
                return true;
            }
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39783a, true, 32340, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, Byte.valueOf(z)}, null, f39783a, true, 32340, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (TextUtils.isEmpty(scheme)) {
                return false;
            }
            if (d(scheme.toLowerCase())) {
                d.a(str);
                f.f34171e.a(context2, str2, null);
                return true;
            } else if (com.ss.android.ugc.aweme.qrcode.e.b.c(str)) {
                h.a().a(str2);
                return true;
            } else if (z) {
                return false;
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!ToolUtils.isInstalledApp(context2, intent)) {
                    return false;
                }
                intent.putExtra(f.f34168b, str2);
                return a(context2, intent);
            }
        }
    }

    public static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f39783a, true, 32341, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f39783a, true, 32341, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            return d(Uri.parse(str).getScheme()) || com.ss.android.ugc.aweme.qrcode.e.b.c(str);
        }
    }

    public static boolean a(Context context, Aweme aweme, String str, String str2) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str3, str4}, null, f39783a, true, 32346, new Class[]{Context.class, Aweme.class, String.class, String.class}, Boolean.TYPE)) {
            Object[] objArr = {context2, aweme2, str3, str4};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32346, new Class[]{Context.class, Aweme.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme2 == null || (aweme.isAd() && aweme.getAwemeRawAd().isUseOrdinaryWeb())) {
            z = true;
        }
        return a(context2, aweme2, str3, str4, z);
    }

    private static boolean a(Context context, Aweme aweme, String str, String str2, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{context, aweme, str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39783a, true, 32347, new Class[]{Context.class, Aweme.class, String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return a(context, aweme, str, str2, z, true);
        }
        Object[] objArr = {context, aweme, str, str2, Byte.valueOf(z)};
        return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32347, new Class[]{Context.class, Aweme.class, String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    private static boolean a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{context, aweme, str, str2, Byte.valueOf(z ? (byte) 1 : 0), (byte) 1}, null, f39783a, true, 32348, new Class[]{Context.class, Aweme.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return a(context, aweme, str, str2, z, true, 1);
        }
        Object[] objArr = {context, aweme, str, str2, Byte.valueOf(z), (byte) 1};
        return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32348, new Class[]{Context.class, Aweme.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2, int i) {
        if (!PatchProxy.isSupport(new Object[]{context, aweme, str, str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i)}, null, f39783a, true, 32349, new Class[]{Context.class, Aweme.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.commercialize.utils.a.a.a.a(context, aweme, str, str2, z, z2, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme, str, str2, Byte.valueOf(z), Byte.valueOf(z2), Integer.valueOf(i)}, null, f39783a, true, 32349, new Class[]{Context.class, Aweme.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f39783a, true, 32351, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)) {
            return a(context2, str3, str4, false, (Map<String, String>) null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f39783a, true, 32351, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, String str, String str2, boolean z, Map<String, String> map) {
        if (!PatchProxy.isSupport(new Object[]{context, str, str2, Byte.valueOf(z ? (byte) 1 : 0), null}, null, f39783a, true, 32352, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class}, Boolean.TYPE)) {
            return a(context, str, str2, z, (Map<String, String>) null, true);
        }
        Object[] objArr = {context, str, str2, Byte.valueOf(z), null};
        return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32352, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{context, str, str2, Byte.valueOf(z ? (byte) 1 : 0), map, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f39783a, true, 32353, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class, Boolean.TYPE}, Boolean.TYPE)) {
            return a(context, str, str2, z, map, z2, (a.C0516a) null);
        }
        Object[] objArr = {context, str, str2, Byte.valueOf(z), map, Byte.valueOf(z2)};
        return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32353, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, a.C0516a aVar) {
        if (!PatchProxy.isSupport(new Object[]{context, str, str2, Byte.valueOf(z ? (byte) 1 : 0), map, Byte.valueOf(z2 ? (byte) 1 : 0), aVar}, null, f39783a, true, 32354, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class, Boolean.TYPE, a.C0516a.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.commercialize.utils.a.a.a.a(context, str, str2, z, map, z2, aVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, str2, Byte.valueOf(z), map, Byte.valueOf(z2), aVar}, null, f39783a, true, 32354, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class, Boolean.TYPE, a.C0516a.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, String str, Aweme aweme, int i) {
        if (!PatchProxy.isSupport(new Object[]{context, str, aweme, Integer.valueOf(i)}, null, f39783a, true, 32358, new Class[]{Context.class, String.class, Aweme.class, Integer.TYPE}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.commercialize.utils.a.a.b.a(context, str, aweme, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, aweme, Integer.valueOf(i)}, null, f39783a, true, 32358, new Class[]{Context.class, String.class, Aweme.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        if (r6.equals("counsel") != false) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r25, com.ss.android.ugc.aweme.feed.model.Aweme r26, com.ss.android.ugc.aweme.commercialize.feed.e r27, @com.ss.android.ugc.aweme.app.constants.Constants.AdClickFrom int r28, @android.support.annotation.NonNull com.ss.android.ugc.aweme.commercialize.c.b r29) {
        /*
            r0 = r25
            r1 = r26
            r3 = r28
            r4 = r29
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r13 = 0
            r6[r13] = r0
            r14 = 1
            r6[r14] = r1
            r15 = 2
            r6[r15] = r27
            java.lang.Integer r7 = java.lang.Integer.valueOf(r28)
            r16 = 3
            r6[r16] = r7
            r12 = 4
            r6[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r8 = f39783a
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r11[r13] = r7
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r7 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r11[r14] = r7
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.feed.e> r7 = com.ss.android.ugc.aweme.commercialize.feed.e.class
            r11[r15] = r7
            java.lang.Class r7 = java.lang.Integer.TYPE
            r11[r16] = r7
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.c.b> r7 = com.ss.android.ugc.aweme.commercialize.c.b.class
            r11[r12] = r7
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r7 = 0
            r9 = 1
            r10 = 32359(0x7e67, float:4.5345E-41)
            r12 = r17
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0085
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r13] = r0
            r6[r14] = r1
            r6[r15] = r27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r6[r16] = r0
            r7 = 4
            r6[r7] = r4
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = f39783a
            r21 = 1
            r22 = 32359(0x7e67, float:4.5345E-41)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.feed.e> r1 = com.ss.android.ugc.aweme.commercialize.feed.e.class
            r0[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r16] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.c.b> r1 = com.ss.android.ugc.aweme.commercialize.c.b.class
            r0[r7] = r1
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r6
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0085:
            r7 = 4
            if (r0 != 0) goto L_0x0089
            return r13
        L_0x0089:
            if (r1 != 0) goto L_0x008c
            return r13
        L_0x008c:
            boolean r6 = r26.isAd()
            if (r6 != 0) goto L_0x0093
            return r13
        L_0x0093:
            if (r27 != 0) goto L_0x009b
            com.ss.android.ugc.aweme.commercialize.feed.e r2 = new com.ss.android.ugc.aweme.commercialize.feed.e
            r2.<init>()
            goto L_0x009d
        L_0x009b:
            r2 = r27
        L_0x009d:
            r2.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            boolean r6 = r2.a()
            if (r6 != 0) goto L_0x00a7
            return r13
        L_0x00a7:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r26.getAwemeRawAd()
            java.lang.String r6 = r6.getType()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L_0x00b6
            return r13
        L_0x00b6:
            boolean r8 = com.ss.android.g.a.a()
            if (r8 == 0) goto L_0x00c4
            java.lang.String r8 = "app"
            boolean r8 = android.text.TextUtils.equals(r6, r8)
            if (r8 != 0) goto L_0x00d3
        L_0x00c4:
            if (r3 == r14) goto L_0x016e
            r8 = 18
            if (r3 == r8) goto L_0x016e
            if (r3 == r7) goto L_0x016e
            if (r3 == r5) goto L_0x016e
            r8 = 7
            if (r3 != r8) goto L_0x00d3
            goto L_0x016e
        L_0x00d3:
            r8 = 11
            if (r3 == r8) goto L_0x0169
            r8 = 14
            if (r3 == r8) goto L_0x0169
            r8 = 12
            if (r3 == r8) goto L_0x0169
            r8 = 13
            if (r3 == r8) goto L_0x0169
            r8 = 15
            if (r3 == r8) goto L_0x0169
            r8 = 20
            if (r3 == r8) goto L_0x0169
            r8 = 19
            if (r3 == r8) goto L_0x0169
            r8 = 21
            if (r3 != r8) goto L_0x00f5
            goto L_0x0169
        L_0x00f5:
            r8 = -1
            int r9 = r6.hashCode()
            switch(r9) {
                case -1354573786: goto L_0x0139;
                case 96801: goto L_0x012f;
                case 117588: goto L_0x0125;
                case 3083120: goto L_0x011b;
                case 3148996: goto L_0x0111;
                case 957829685: goto L_0x0108;
                case 1893962841: goto L_0x00fe;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x0143
        L_0x00fe:
            java.lang.String r5 = "redpacket"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0143
            r5 = 4
            goto L_0x0144
        L_0x0108:
            java.lang.String r7 = "counsel"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0111:
            java.lang.String r5 = "form"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0143
            r5 = 3
            goto L_0x0144
        L_0x011b:
            java.lang.String r5 = "dial"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0143
            r5 = 2
            goto L_0x0144
        L_0x0125:
            java.lang.String r5 = "web"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0143
            r5 = 0
            goto L_0x0144
        L_0x012f:
            java.lang.String r5 = "app"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0143
            r5 = 1
            goto L_0x0144
        L_0x0139:
            java.lang.String r5 = "coupon"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0143
            r5 = 6
            goto L_0x0144
        L_0x0143:
            r5 = -1
        L_0x0144:
            switch(r5) {
                case 0: goto L_0x0164;
                case 1: goto L_0x0160;
                case 2: goto L_0x015c;
                case 3: goto L_0x0157;
                case 4: goto L_0x0152;
                case 5: goto L_0x014d;
                case 6: goto L_0x0148;
                default: goto L_0x0147;
            }
        L_0x0147:
            return r13
        L_0x0148:
            boolean r0 = c(r0, r1, r2, r3)
            return r0
        L_0x014d:
            boolean r0 = a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (com.ss.android.ugc.aweme.commercialize.feed.e) r2, (int) r3)
            return r0
        L_0x0152:
            boolean r0 = f(r0, r1, r2, r3)
            return r0
        L_0x0157:
            boolean r0 = e(r0, r1, r2, r3)
            return r0
        L_0x015c:
            d(r0, r1, r2, r3)
            return r13
        L_0x0160:
            b(r0, r1, r2, r3, r4)
            return r13
        L_0x0164:
            boolean r0 = b(r0, r1, r2, r3)
            return r0
        L_0x0169:
            boolean r0 = b(r0, r1, r2, r3)
            return r0
        L_0x016e:
            boolean r0 = b(r0, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.g.a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.feed.e, int, com.ss.android.ugc.aweme.commercialize.c.b):boolean");
    }

    private static boolean a(@NonNull Context context, @NonNull Aweme aweme, @NonNull e eVar, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, eVar, Integer.valueOf(i)}, null, f39783a, true, 32360, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme2, eVar, Integer.valueOf(i)}, null, f39783a, true, 32360, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        eVar.a(i);
        return aweme.isAd() && a(context2, aweme2, aweme.getAwemeRawAd().getConsultUrl(), aweme.getAwemeRawAd().getWebTitle(), true);
    }

    static final /* synthetic */ Object a(Aweme aweme) throws Exception {
        try {
            com.ss.android.ugc.aweme.commercialize.h.a().f38876a = aweme;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        return null;
    }

    public static boolean a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f39783a, true, 32331, new Class[]{Context.class}, Boolean.TYPE)) {
            return b.a(context);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f39783a, true, 32331, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    public static void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f39783a, true, 32339, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f39783a, true, 32339, new Class[]{a.class}, Void.TYPE);
            return;
        }
        i.a(5000).a((a.g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(aVar2));
    }

    public static boolean c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f39783a, true, 32344, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f39783a, true, 32344, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null) {
                return false;
            }
            String lowerCase = parse.getScheme().toLowerCase();
            if (TextUtils.isEmpty(lowerCase) || d(lowerCase)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            return ToolUtils.isInstalledApp((Context) k.a(), intent);
        }
    }

    private static boolean d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f39783a, true, 32342, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f39783a, true, 32342, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            String lowerCase = str.toLowerCase();
            if (TextUtils.equals(com.ss.android.ugc.aweme.app.e.f34152b, lowerCase) || TextUtils.equals(com.ss.android.ugc.aweme.app.e.f34154d, lowerCase)) {
                return true;
            }
            return false;
        }
    }

    public static boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f39783a, true, 32343, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f39783a, true, 32343, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null) {
                return false;
            }
            String lowerCase = parse.getScheme().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                return false;
            }
            if (d(lowerCase)) {
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            return ToolUtils.isInstalledApp((Context) k.a(), intent);
        }
    }

    public static boolean b(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39783a, true, 32335, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return a(context2, aweme2, false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39783a, true, 32335, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    public static void c(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39783a, true, 32345, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39783a, true, 32345, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        a(context2, aweme2, (String) null, (String) null);
    }

    public static void d(Context context, Aweme aweme) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, f39783a, true, 32356, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, f39783a, true, 32356, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else if (context2 != null && aweme != null && aweme.getAwemeRawAd() != null) {
            String phoneNumber = aweme.getAwemeRawAd().getPhoneNumber();
            if (!TextUtils.isEmpty(phoneNumber)) {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + phoneNumber));
                intent.setFlags(268435456);
                a(context2, intent);
            }
        }
    }

    public static void e(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39783a, true, 32372, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39783a, true, 32372, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else if (c.Q(aweme)) {
            com.ss.android.ugc.aweme.commercialize.log.g.Q(context, aweme);
            com.ss.android.ugc.aweme.commercialize.log.g.d(context, aweme);
            if (!c.P(aweme).getSplashInfo().isEnableSplashOpen()) {
                a(context2, aweme2, (String) null, (String) null);
            } else if (!b(context, aweme)) {
                a(context2, aweme2, (String) null, (String) null);
            }
        }
    }

    private static void f(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39783a, true, 32355, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39783a, true, 32355, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null && aweme.isAd() && !a(context2, aweme.getAwemeRawAd().getRedOpenUrl(), aweme2, true)) {
            a(context2, aweme2, aweme.getAwemeRawAd().getRedUrl(), (String) null, aweme.getAwemeRawAd().isUseOrdinaryWeb());
        }
    }

    public static boolean c(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, f39783a, true, 32350, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str}, null, f39783a, true, 32350, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || TextUtils.isEmpty(str)) {
            return false;
        } else {
            return a(context2, new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str))));
        }
    }

    public static void d(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, f39783a, true, 32375, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str}, null, f39783a, true, 32375, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, com.ss.android.ugc.aweme.commercialize.utils.a.a.d.f39653a, true, 32716, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str}, null, com.ss.android.ugc.aweme.commercialize.utils.a.a.d.f39653a, true, 32716, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (context2 != null && str != null) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse(parse.getQueryParameter(PushConstants.WEB_URL)));
            String queryParameter = parse.getQueryParameter("immersive_mode");
            if (queryParameter != null) {
                Integer intOrNull = StringsKt.toIntOrNull(queryParameter);
                if (intOrNull != null && intOrNull.intValue() == 1) {
                    intent.putExtra("use_ordinary_web", false);
                }
            }
            a(context2, intent);
        }
    }

    public static boolean b(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f39783a, true, 32333, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, null, f39783a, true, 32333, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a()) {
            return false;
        } else {
            return b.a(context, str);
        }
    }

    public static boolean a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, null, f39783a, true, 32374, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, intent2}, null, f39783a, true, 32374, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || intent2 == null) {
            return false;
        } else {
            if (!(context2 instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException | SecurityException e2) {
                Crashlytics.log("ad start activity failed");
                Crashlytics.logException(e2);
                return false;
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6}, null, f39783a, true, 32368, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39783a, true, 32368, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!a(context2, str5, false)) {
            a(context2, str4, str6);
        }
    }

    private static boolean c(@NonNull Context context, @NonNull Aweme aweme, @NonNull e eVar, int i) {
        Aweme aweme2 = aweme;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, aweme2, eVar, Integer.valueOf(i)}, null, f39783a, true, 32362, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {context, aweme2, eVar, Integer.valueOf(i)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32362, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        boolean a2 = eVar.a(i);
        if ((i2 == 2 || i2 == 6 || i2 == 3 || i2 == 8) && c.a(c.n(aweme))) {
            bg.a(new com.ss.android.ugc.aweme.commercialize.b.d(aweme2, i2));
            if (i2 == 6) {
                return true;
            }
            return false;
        } else if (a2 && !eVar.c()) {
            d.a(context);
            return true;
        } else if (b(context, aweme) || com.ss.android.ugc.aweme.miniapp.l.b.a(context, aweme)) {
            return false;
        } else {
            c(context, aweme);
            return false;
        }
    }

    private static void d(@NonNull Context context, @NonNull Aweme aweme, @NonNull e eVar, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, eVar, Integer.valueOf(i)}, null, f39783a, true, 32363, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, eVar, Integer.valueOf(i)}, null, f39783a, true, 32363, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        eVar.a(i);
        if (TextUtils.isEmpty(aweme.getAwemeRawAd().getPhoneKey()) || !(context2 instanceof Activity)) {
            d(context, aweme);
            return;
        }
        af.a().a((Activity) context2, aweme2, com.ss.android.ugc.aweme.commercialize.log.g.a(i));
    }

    private static boolean e(@NonNull Context context, @NonNull Aweme aweme, @NonNull e eVar, int i) {
        Aweme aweme2 = aweme;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, aweme2, eVar, Integer.valueOf(i)}, null, f39783a, true, 32365, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {context, aweme2, eVar, Integer.valueOf(i)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f39783a, true, 32365, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        eVar.a(i);
        if (i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
            bg.a(new com.ss.android.ugc.aweme.commercialize.b.e(aweme2, i2));
            return true;
        } else if ((eVar.c() && b(context, aweme)) || com.ss.android.ugc.aweme.miniapp.l.b.a(context, aweme)) {
            return false;
        } else {
            c(context, aweme);
            return false;
        }
    }

    private static boolean f(@NonNull Context context, @NonNull Aweme aweme, @NonNull e eVar, int i) {
        if (PatchProxy.isSupport(new Object[]{context, aweme, eVar, Integer.valueOf(i)}, null, f39783a, true, 32366, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme, eVar, Integer.valueOf(i)}, null, f39783a, true, 32366, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        eVar.a(i);
        f(context, aweme);
        return false;
    }

    public static void a(Context context, j jVar, Aweme aweme, boolean z) {
        Context context2 = context;
        j jVar2 = jVar;
        Aweme aweme2 = aweme;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{context2, jVar2, aweme2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39783a, true, 32369, new Class[]{Context.class, j.class, Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, jVar2, aweme2, Byte.valueOf(z)}, null, f39783a, true, 32369, new Class[]{Context.class, j.class, Aweme.class, Boolean.TYPE}, Void.TYPE);
        } else if (context2 != null && jVar2 != null) {
            String str = jVar2.openUrl;
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            if (!TextUtils.isEmpty(jVar2.openUrl) && iMiniAppService.isAppBrandSchema(str)) {
                String str2 = str + "&schema_from=ad_link";
                if (z2) {
                    str = str2 + "&position=comment_page";
                } else {
                    str = str2 + "&position=in_video_tag";
                }
            }
            if (a(context2, str, false)) {
                com.ss.android.ugc.aweme.commercialize.log.g.a("open_url_app", context2, jVar2, aweme2, z2);
                a((a) new k(context2, jVar2, aweme2, z2));
            } else if (!com.ss.android.g.a.a() || !TextUtils.equals(jVar2.type, PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
                long j = 0;
                try {
                    j = Long.parseLong(jVar2.creativeId);
                } catch (Exception unused) {
                }
                String str3 = null;
                if (aweme.getAwemeRawAd() != null) {
                    str3 = aweme.getAwemeRawAd().getDownloadUrl();
                }
                com.ss.android.ugc.aweme.commercialize.utils.a.a.a.a(context, jVar2.webUrl, jVar2.webTitle, false, (Map<String, String>) null, true, new a.C0516a(Long.valueOf(j), jVar2.logExtra, str3, jVar2.type));
                com.ss.android.ugc.aweme.commercialize.log.g.a("open_url_h5", context2, jVar2, aweme2, z2);
            } else {
                b(context2, jVar2.packageName);
                com.ss.android.ugc.aweme.commercialize.log.g.a("open_url_app", context2, jVar2, aweme2, z2);
            }
        }
    }

    private static boolean b(@NonNull Context context, @NonNull Aweme aweme, @NonNull e eVar, int i) {
        if (PatchProxy.isSupport(new Object[]{context, aweme, eVar, Integer.valueOf(i)}, null, f39783a, true, 32361, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme, eVar, Integer.valueOf(i)}, null, f39783a, true, 32361, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (eVar.a(i) && !eVar.c()) {
            d.a(context);
            return true;
        } else if (c.a(context, aweme) || b(context, aweme) || com.ss.android.ugc.aweme.miniapp.l.b.a(context, aweme)) {
            return false;
        } else {
            c(context, aweme);
            return false;
        }
    }

    public static boolean a(Activity activity, Aweme aweme, FragmentManager fragmentManager, int i) {
        Activity activity2 = activity;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{activity2, aweme2, fragmentManager, Integer.valueOf(i)}, null, f39783a, true, 32357, new Class[]{Activity.class, Aweme.class, FragmentManager.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, aweme2, fragmentManager, Integer.valueOf(i)}, null, f39783a, true, 32357, new Class[]{Activity.class, Aweme.class, FragmentManager.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (aweme2 == null || !aweme.isAd()) {
            return false;
        } else {
            return a((Context) activity2, aweme.getAwemeRawAd().getFormUrl(), aweme2, i);
        }
    }

    private static void b(@NonNull Context context, @NonNull Aweme aweme, @NonNull e eVar, int i, com.ss.android.ugc.aweme.commercialize.c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{context, aweme, eVar, Integer.valueOf(i), bVar}, null, f39783a, true, 32364, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE, com.ss.android.ugc.aweme.commercialize.c.b.class}, Void.TYPE)) {
            Object[] objArr = {context, aweme, eVar, Integer.valueOf(i), bVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39783a, true, 32364, new Class[]{Context.class, Aweme.class, e.class, Integer.TYPE, com.ss.android.ugc.aweme.commercialize.c.b.class}, Void.TYPE);
            return;
        }
        eVar.a(i);
        if (eVar.c() && b(context, aweme)) {
            return;
        }
        if (com.ss.android.g.a.a()) {
            a(context, aweme);
        } else {
            bVar.a();
        }
    }
}
