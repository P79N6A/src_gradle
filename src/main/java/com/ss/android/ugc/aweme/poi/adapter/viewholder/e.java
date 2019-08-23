package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.poi.e.c;
import com.ss.android.ugc.aweme.poi.model.r;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J>\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007J,\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fH\u0003J(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\"\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0007¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiOperatorUtil;", "", "()V", "checkQueueAvailability", "", "context", "Landroid/content/Context;", "poiCommodity", "Lcom/ss/android/ugc/aweme/poi/model/PoiCommodity;", "clickQueue", "", "enterFrom", "", "lat", "lng", "queueUrl", "getQueueUrl", "jumpToLogin", "enterMethod", "callback", "Lcom/ss/android/ugc/aweme/base/component/OnActivityResult;", "openBrowser", "url", "title", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59672a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f59673b = new e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/poi/adapter/viewholder/PoiOperatorUtil$clickQueue$1$1", "Lcom/ss/android/ugc/aweme/base/component/OnActivityResult;", "onResultCancelled", "", "data", "Landroid/os/Bundle;", "onResultOK", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f59675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f59676c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59677d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59678e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59679f;
        final /* synthetic */ String g;

        public final void a(@Nullable Bundle bundle) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f59674a, false, 64849, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59674a, false, 64849, new Class[0], Void.TYPE);
                return;
            }
            Context context = this.f59675b;
            String a2 = e.a(this.f59675b, this.f59678e, this.f59679f, this.g);
            String string = this.f59675b.getResources().getString(C0906R.string.bp8);
            Intrinsics.checkExpressionValueIsNotNull(string, "it.resources.getString(R.string.poi_queue)");
            e.a(context, a2, string);
        }

        a(Context context, r rVar, String str, String str2, String str3, String str4) {
            this.f59675b = context;
            this.f59676c = rVar;
            this.f59677d = str;
            this.f59678e = str2;
            this.f59679f = str3;
            this.g = str4;
        }
    }

    private e() {
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @NotNull String str, @NotNull String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f59672a, true, 64848, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f59672a, true, 64848, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.TITLE);
        if (context2 != null) {
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse(str));
            intent.putExtra(PushConstants.TITLE, str4);
            intent.putExtra("hide_nav_bar", false);
            intent.putExtra("hide_status_bar", false);
            intent.putExtra("bundle_user_webview_title", false);
            intent.putExtra("show_closeall_and_back", true);
            context2.startActivity(intent);
        }
    }

    @JvmStatic
    public static final String a(Context context, String str, String str2, String str3) {
        String str4 = str3;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str4}, null, f59672a, true, 64847, new Class[]{Context.class, String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str, str2, str4}, null, f59672a, true, 64847, new Class[]{Context.class, String.class, String.class, String.class}, String.class);
        }
        af a2 = af.a(context);
        Intrinsics.checkExpressionValueIsNotNull(a2, "LocationHelperCompat.getInstance(context)");
        com.ss.android.ugc.aweme.poi.a f2 = a2.f();
        String str5 = "";
        double[] dArr = new double[2];
        if (f2 != null && f2.isValid() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                dArr[0] = Double.parseDouble(str);
                dArr[1] = Double.parseDouble(str2);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            str5 = String.valueOf(c.a(dArr, new double[]{f2.latitude, f2.longitude}));
        }
        if (StringsKt.contains$default((CharSequence) str4, (CharSequence) "?", false, 2, (Object) null)) {
            return str4 + "&distance=" + str5;
        }
        return str4 + "?distance=" + str5;
    }
}
