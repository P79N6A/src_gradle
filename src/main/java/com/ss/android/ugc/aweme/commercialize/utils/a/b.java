package com.ss.android.ugc.aweme.commercialize.utils.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.utils.a.a.c;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u001c\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/GPPage;", "", "()V", "GOOGLE_PLAY_MARKET_PKG", "", "GOOGLE_PLAY_MARKET_URL", "GOOGLE_PLAY_VIEW_PKG", "hasGP", "", "context", "Landroid/content/Context;", "isGpUri", "uri", "Landroid/net/Uri;", "openGpByMarketUri", "openGpByPackageName", "packageName", "openGpByUri", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39655a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f39656b = new b();

    private b() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f39655a, true, 32697, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f39655a, true, 32697, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context2) != 0) {
            return false;
        } else {
            return true;
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, null, f39655a, true, 32693, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri2}, null, f39655a, true, 32693, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(uri2, "uri");
        if (!g.a(uri)) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && uri2.getQueryParameter(PushConstants.WEB_URL) != null) {
            Uri parse = Uri.parse(uri2.getQueryParameter(PushConstants.WEB_URL));
            Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(uri.getQueryParameter(\"url\"))");
            if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                return true;
            }
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri2.getQueryParameter("id"))) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable Uri uri) {
        String str;
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, null, f39655a, true, 32694, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2}, null, f39655a, true, 32694, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            if (uri2 != null) {
                str = uri.getScheme();
            } else {
                str = null;
            }
            if ((!Intrinsics.areEqual((Object) str, (Object) "market")) || !a(context)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri2);
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            return g.a(context2, intent);
        }
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context, @Nullable Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, null, f39655a, true, 32696, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2}, null, f39655a, true, 32696, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || uri2 == null) {
            return false;
        } else {
            if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
                if (!a(context)) {
                    return false;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.google.android.gms");
                intent.setData(uri2);
                intent.addFlags(268435456);
                return g.a(context2, intent);
            } else if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri2.getQueryParameter("id")) || !a(context)) {
                return false;
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage("com.android.vending");
                intent2.setData(uri2);
                intent2.addFlags(268435456);
                return g.a(context2, intent2);
            }
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f39655a, true, 32695, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f39655a, true, 32695, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            if (!a(context)) {
                return c.a(context, str);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str2));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            return g.a(context2, intent);
        }
    }
}
