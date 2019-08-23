package com.ss.android.ugc.aweme.shortvideo.k;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\tH\u0002J \u0010\u0014\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/router/AVRouterIntentParse;", "", "()V", "RECORD_ORIGIN_JSBRIDGE", "", "RECORD_ORIGIN_SYSTEM", "ROUTE_HOST_OPEN_RECORD", "ROUTE_HOST_STUDIO", "createColdStartIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "fromPushIntent", "uri", "Landroid/net/Uri;", "parser", "routeUri", "resolveOpenRecordRouteUri", "", "intent", "resolveRouteUri", "resolveStudioRouteUri", "resolveSystemCall", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68274a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f68275b = new a();

    private a() {
    }

    public final void a(Activity activity, Intent intent, Uri uri) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        Uri uri2 = uri;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2, uri2}, this, f68274a, false, 78479, new Class[]{Activity.class, Intent.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2, uri2}, this, f68274a, false, 78479, new Class[]{Activity.class, Intent.class, Uri.class}, Void.TYPE);
            return;
        }
        String queryParameter = uri2.getQueryParameter("from");
        CharSequence charSequence = queryParameter;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (z) {
            queryParameter = "schema";
        }
        if (TextUtils.equals(uri2.getQueryParameter("enter_from"), "draw_ad")) {
            intent2.putExtra("shoot_way", "ad_direct_shoot");
        } else {
            intent2.putExtra("shoot_way", queryParameter);
        }
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -891901482) {
                if (hashCode == 305667899 && host.equals("openRecord")) {
                    a(activity2, uri2, intent2);
                }
            } else if (host.equals("studio")) {
                a(uri2, intent2);
            }
        }
    }

    private final Intent a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f68274a, false, 78483, new Class[]{Activity.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity}, this, f68274a, false, 78483, new Class[]{Activity.class}, Intent.class);
        }
        Intent intent = new Intent();
        if (com.ss.android.g.a.a()) {
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
        } else {
            intent.setClass(activity, MainActivity.class);
        }
        intent.putExtra("enter_record_from_other_platform", true);
        return intent;
    }

    private final void a(Activity activity, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity, intent2}, this, f68274a, false, 78481, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, intent2}, this, f68274a, false, 78481, new Class[]{Activity.class, Intent.class}, Void.TYPE);
            return;
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        Intrinsics.checkExpressionValueIsNotNull(iAVService, "service");
        if (iAVService.isRecording() || iAVService.getPublishService().inPublishPage(activity)) {
            Object service = ServiceManager.get().getService(IAVService.class);
            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
            intent2.setClass(activity, ((IAVService) service).getRecordPermissionActivity());
            intent2.putExtra("enter_record_directly_from_system", true);
            return;
        }
        intent2.putExtra("shoot_way", "other_platform_camera");
        intent2.putExtra("show_no_splash_ad", true);
        AwemeAppData.p().ao = true;
    }

    private final void a(Uri uri, Intent intent) {
        Uri uri2 = uri;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{uri2, intent2}, this, f68274a, false, 78482, new Class[]{Uri.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2, intent2}, this, f68274a, false, 78482, new Class[]{Uri.class, Intent.class}, Void.TYPE);
            return;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String next : queryParameterNames) {
                String queryParameter = uri2.getQueryParameter(next);
                if (next != null) {
                    int hashCode = next.hashCode();
                    if (hashCode != -1195408547) {
                        if (hashCode == -818786127 && next.equals("enter_from")) {
                            intent2.putExtra("enter_from", queryParameter);
                        }
                    } else if (next.equals("sticker_id")) {
                        intent2.putExtra("sticker_id", queryParameter);
                        intent2.putExtra("use_preset_sticker_at_first", true);
                    }
                }
            }
        }
    }

    @Nullable
    public final Intent a(@NotNull Activity activity, @NotNull Uri uri) {
        Intent a2;
        Activity activity2 = activity;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{activity2, uri2}, this, f68274a, false, 78477, new Class[]{Activity.class, Uri.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, uri2}, this, f68274a, false, 78477, new Class[]{Activity.class, Uri.class}, Intent.class);
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(uri2, "routeUri");
        p a3 = p.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeRuntime.inst()");
        boolean c2 = a3.c();
        if (c2) {
            Object service = ServiceManager.get().getService(IAVService.class);
            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
            a2 = new Intent(activity2, ((IAVService) service).getRecordPermissionActivity());
        } else {
            a2 = a(activity);
        }
        Intent intent = a2;
        a(activity2, intent, uri2);
        if (c2) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
            IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
            Intrinsics.checkExpressionValueIsNotNull(publishService, "ServiceManager.get().get…ss.java).publishService()");
            publishService.setCurMusic(null);
        }
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.app.Activity r22, android.net.Uri r23, android.content.Intent r24) {
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
            com.meituan.robust.ChangeQuickRedirect r6 = f68274a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r9[r11] = r5
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            r9[r12] = r5
            java.lang.Class<android.content.Intent> r5 = android.content.Intent.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r7 = 0
            r8 = 78480(0x13290, float:1.09974E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0057
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f68274a
            r17 = 0
            r18 = 78480(0x13290, float:1.09974E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r0[r12] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r21
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0057:
            java.lang.String r3 = r23.getPath()
            java.lang.String r4 = "recordParam"
            java.lang.String r4 = r1.getQueryParameter(r4)
            java.lang.String r5 = "recordOrigin"
            java.lang.String r5 = r1.getQueryParameter(r5)
            java.lang.String r6 = "uid"
            java.lang.String r6 = r1.getQueryParameter(r6)
            java.lang.String r7 = "nickname"
            java.lang.String r7 = r1.getQueryParameter(r7)
            r8 = r3
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x008f
            java.lang.String r8 = "path"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r8)
            java.lang.String r8 = "/detail/"
            r9 = 0
            boolean r3 = kotlin.text.StringsKt.startsWith$default(r3, r8, r11, r13, r9)
            if (r3 == 0) goto L_0x008f
            java.lang.String r3 = r23.getLastPathSegment()
            goto L_0x0095
        L_0x008f:
            java.lang.String r3 = "id"
            java.lang.String r3 = r1.getQueryParameter(r3)
        L_0x0095:
            if (r5 != 0) goto L_0x009a
        L_0x0097:
            r1 = r21
            goto L_0x00f3
        L_0x009a:
            int r8 = r5.hashCode()
            r9 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            if (r8 == r9) goto L_0x00e6
            r0 = 1036042802(0x3dc0c232, float:0.0941204)
            if (r8 == r0) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            java.lang.String r0 = "jsBridge"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = "from"
            java.lang.String r0 = r1.getQueryParameter(r0)
            java.lang.String r1 = "dou_plus"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = "dou_plus"
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            java.lang.String r5 = "shoot"
            com.ss.android.ugc.aweme.app.d.d r8 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r9 = "shoot_way"
            com.ss.android.ugc.aweme.app.d.d r0 = r8.a((java.lang.String) r9, (java.lang.String) r0)
            java.lang.String r8 = "creation_id"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r8, (java.lang.String) r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r5, (java.util.Map) r0)
            goto L_0x0097
        L_0x00e6:
            java.lang.String r1 = "system"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0097
            r1 = r21
            r1.a((android.app.Activity) r0, (android.content.Intent) r2)
        L_0x00f3:
            if (r4 != 0) goto L_0x00f7
            goto L_0x017f
        L_0x00f7:
            int r0 = r4.hashCode()
            switch(r0) {
                case -2090378579: goto L_0x016d;
                case -1890252483: goto L_0x015f;
                case 104263205: goto L_0x0151;
                case 1158383506: goto L_0x010e;
                case 1402633315: goto L_0x0100;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            goto L_0x017f
        L_0x0100:
            java.lang.String r0 = "challenge"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "challenge_id"
            r2.putExtra(r0, r3)
            goto L_0x017f
        L_0x010e:
            java.lang.String r0 = "donation"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "donation_id"
            r2.putExtra(r0, r3)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            java.lang.String r4 = "christmas_h5"
            java.lang.String r5 = "donation_id"
            r2.putExtra(r5, r3)
            java.lang.String r3 = "shoot_way"
            r2.putExtra(r3, r4)
            java.lang.String r3 = "creation_id"
            r2.putExtra(r3, r0)
            java.lang.String r3 = "shoot"
            com.ss.android.ugc.aweme.app.d.d r5 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r8 = "shoot_way"
            com.ss.android.ugc.aweme.app.d.d r4 = r5.a((java.lang.String) r8, (java.lang.String) r4)
            java.lang.String r5 = "creation_id"
            com.ss.android.ugc.aweme.app.d.d r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r3, (java.util.Map) r0)
            goto L_0x017f
        L_0x0151:
            java.lang.String r0 = "music"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "music_id"
            r2.putExtra(r0, r3)
            goto L_0x017f
        L_0x015f:
            java.lang.String r0 = "sticker"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "sticker_id"
            r2.putExtra(r0, r3)
            goto L_0x017f
        L_0x016d:
            java.lang.String r0 = "withStickerPanel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "sticker_pannel_show"
            r2.putExtra(r0, r12)
            java.lang.String r0 = "system_camera_stickers"
            com.ss.android.ugc.aweme.base.utils.l.a(r0)
        L_0x017f:
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x019b
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "extra_mention_uid"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "extra_mention_user_name"
            r2.putExtra(r0, r7)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.k.a.a(android.app.Activity, android.net.Uri, android.content.Intent):void");
    }
}
