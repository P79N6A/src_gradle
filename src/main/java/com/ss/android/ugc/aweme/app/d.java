package com.ss.android.ugc.aweme.app;

import android.app.Application;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.u.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsMob;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34105a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsMob$Companion;", "", "()V", "mobLaunchMob", "", "land_position", "", "uri", "Landroid/net/Uri;", "fromNotification", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34106a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@Nullable String str, @Nullable Uri uri, boolean z) {
            String str2;
            String str3 = str;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{str3, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34106a, false, 22229, new Class[]{String.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, uri2, Byte.valueOf(z)}, this, f34106a, false, 22229, new Class[]{String.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (uri2 != null) {
                str2 = uri2.getQueryParameter("gd_label");
            } else {
                str2 = null;
            }
            String str4 = str2;
            if (z) {
                String str5 = "";
                if (uri2 != null) {
                    str5 = uri2.getQueryParameter("push_id");
                } else {
                    str3 = "";
                }
                b b2 = b.b();
                Application a2 = com.ss.android.ugc.aweme.framework.e.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AppProvider.getApp()");
                long d2 = b2.d(a2.getApplicationContext(), "red_point_count");
                u a3 = new u().a(str4);
                j a4 = j.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "AppLifeCircleCacheManager.getInstance()");
                u e2 = a3.f(Integer.toString(a4.f34192c ? 1 : 0)).e(Long.toString(d2));
                if (str3 == null) {
                    str3 = "";
                }
                u c2 = e2.c(str3);
                if (str5 == null) {
                    str5 = "";
                }
                c2.b(str5).e();
                j a5 = j.a();
                Intrinsics.checkExpressionValueIsNotNull(a5, "AppLifeCircleCacheManager.getInstance()");
                a5.f34192c = false;
                return;
            }
            j a6 = j.a();
            Intrinsics.checkExpressionValueIsNotNull(a6, "AppLifeCircleCacheManager.getInstance()");
            a6.f34192c = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("land_position", str3);
                r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName(str4).setJsonObject(jSONObject));
            } catch (Exception unused) {
            }
        }
    }
}
