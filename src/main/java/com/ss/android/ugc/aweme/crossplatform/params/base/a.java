package com.ss.android.ugc.aweme.crossplatform.params.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.crossplatform.params.b;
import com.ss.android.ugc.aweme.crossplatform.params.base.b;
import com.ss.android.ugc.aweme.crossplatform.params.c;
import com.ss.android.ugc.aweme.crossplatform.params.d;

public class a implements CrossPlatformConstants {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.params.a f40805a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public b f40806b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public c f40807c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public d f40808d;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.a$a  reason: collision with other inner class name */
    public static final class C0525a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40809a;

        @NonNull
        public static a a(Bundle bundle) {
            if (!PatchProxy.isSupport(new Object[]{bundle}, null, f40809a, true, 34308, new Class[]{Bundle.class}, a.class)) {
                return b.C0526b.a(bundle);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{bundle}, null, f40809a, true, 34308, new Class[]{Bundle.class}, a.class);
        }

        public static a a(Intent intent) {
            if (PatchProxy.isSupport(new Object[]{intent}, null, f40809a, true, 34309, new Class[]{Intent.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{intent}, null, f40809a, true, 34309, new Class[]{Intent.class}, a.class);
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            if (TextUtils.isEmpty(extras.getString(PushConstants.WEB_URL))) {
                if (intent.getData() != null && !TextUtils.isEmpty(intent.getData().toString())) {
                    extras.putString(PushConstants.WEB_URL, intent.getData().toString());
                }
                if (TextUtils.isEmpty(extras.getString(PushConstants.WEB_URL)) && !TextUtils.isEmpty(extras.getString("rn_schema"))) {
                    extras.putString(PushConstants.WEB_URL, extras.getString("rn_schema"));
                }
            }
            return b.C0526b.a(extras);
        }

        @NonNull
        public static a a(String str, String str2) {
            String str3 = str2;
            if (PatchProxy.isSupport(new Object[]{str, str3}, null, f40809a, true, 34307, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str3}, null, f40809a, true, 34307, new Class[]{String.class, String.class}, a.class);
            }
            Intent intent = new Intent();
            intent.putExtra("fallback_url", Uri.parse(Uri.parse(str).getQueryParameter(PushConstants.WEB_URL)).buildUpon().appendQueryParameter("reactId", str3).build().toString());
            if (Uri.parse(str).getQueryParameter("rn_schema") != null) {
                Uri parse = Uri.parse(Uri.parse(str).getQueryParameter("rn_schema"));
                intent.putExtra("channel_name", parse.getQueryParameter("channel_name"));
                intent.putExtra("bundle_name", parse.getQueryParameter("bundle_name"));
                intent.putExtra("module_name", parse.getQueryParameter("module_name"));
                intent.putExtra("force_h5", parse.getQueryParameter("force_h5"));
                intent.putExtra("dev", parse.getQueryParameter("dev"));
                intent.putExtra("rn_schema", parse.toString());
                intent.putExtra("dynamic", parse.getQueryParameter("dynamic"));
                intent.putExtra("bundle", parse.getQueryParameter("bundle"));
                intent.putExtra("channel", parse.getQueryParameter("channel"));
                intent.putExtra(PushConstants.WEB_URL, Uri.parse(str).getQueryParameter("rn_schema"));
            } else {
                intent.putExtra("force_h5", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            return a(intent);
        }
    }
}
