package com.ss.android.ugc.aweme.commercialize.utils.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J$\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J$\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/AppPage;", "", "()V", "HTTP_URL", "", "hasAppByHttp", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "hasAppWithoutHttp", "openAppByHttpUri", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "openAppWithoutHttpUri", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39627a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f39628b = new a();

    private a() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context, uri2}, null, f39627a, true, 32691, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, uri2}, null, f39627a, true, 32691, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || uri2 == null || !g.a(uri)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri2);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities, "m.queryIntentActivities(…nager.MATCH_DEFAULT_ONLY)");
            Iterable<ResolveInfo> iterable = queryIntentActivities;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ResolveInfo resolveInfo : iterable) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
            List list = (List) arrayList;
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("http://"));
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent2, 65536);
            Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities2, "m.queryIntentActivities(…nager.MATCH_DEFAULT_ONLY)");
            Iterable<ResolveInfo> iterable2 = queryIntentActivities2;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (ResolveInfo resolveInfo2 : iterable2) {
                arrayList2.add(resolveInfo2.activityInfo.packageName);
            }
            if (!CollectionsKt.subtract(list, (List) arrayList2).isEmpty()) {
                return true;
            }
            return false;
        }
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context, @Nullable Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context, uri2}, null, f39627a, true, 32692, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, uri2}, null, f39627a, true, 32692, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || uri2 == null || g.a(uri)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri2);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities, "m.queryIntentActivities(…nager.MATCH_DEFAULT_ONLY)");
            Iterable<ResolveInfo> iterable = queryIntentActivities;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ResolveInfo resolveInfo : iterable) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
            if (!((List) arrayList).isEmpty()) {
                return true;
            }
            return false;
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable Uri uri, @NotNull Aweme aweme) {
        Context context2 = context;
        Uri uri2 = uri;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, aweme2}, null, f39627a, true, 32689, new Class[]{Context.class, Uri.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2, aweme2}, null, f39627a, true, 32689, new Class[]{Context.class, Uri.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        if (context2 == null || uri2 == null || !a(context, uri)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri2);
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities, "m.queryIntentActivities(…nager.MATCH_DEFAULT_ONLY)");
        Iterable<ResolveInfo> iterable = queryIntentActivities;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ResolveInfo resolveInfo : iterable) {
            arrayList.add(resolveInfo.activityInfo.packageName);
        }
        List list = (List) arrayList;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("http://"));
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent2, 65536);
        Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities2, "m.queryIntentActivities(…nager.MATCH_DEFAULT_ONLY)");
        Iterable<ResolveInfo> iterable2 = queryIntentActivities2;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (ResolveInfo resolveInfo2 : iterable2) {
            arrayList2.add(resolveInfo2.activityInfo.packageName);
        }
        Set subtract = CollectionsKt.subtract(list, (List) arrayList2);
        if (!(!subtract.isEmpty())) {
            subtract = null;
        }
        if (subtract == null) {
            return false;
        }
        intent.setPackage((String) CollectionsKt.toList(subtract).get(0));
        intent.addFlags(268435456);
        return g.a(context2, intent);
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context, @Nullable Uri uri, @NotNull Aweme aweme) {
        Context context2 = context;
        Uri uri2 = uri;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, aweme2}, null, f39627a, true, 32690, new Class[]{Context.class, Uri.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2, aweme2}, null, f39627a, true, 32690, new Class[]{Context.class, Uri.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        if (context2 == null || uri2 == null || !b(context, uri)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri2);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities, "m.queryIntentActivities(…nager.MATCH_DEFAULT_ONLY)");
        Iterable<ResolveInfo> iterable = queryIntentActivities;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ResolveInfo resolveInfo : iterable) {
            arrayList.add(resolveInfo.activityInfo.packageName);
        }
        List list = (List) arrayList;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return false;
        }
        intent.setPackage((String) CollectionsKt.toList(list).get(0));
        intent.addFlags(268435456);
        return g.a(context2, intent);
    }
}
