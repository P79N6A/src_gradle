package com.ss.android.ugc.aweme.music.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/music/util/SchemeHelper;", "", "()V", "getQueryParameters", "Ljava/util/HashMap;", "", "url", "parseRnSchema", "Lcom/ss/android/ugc/aweme/music/util/SchemeHelper$RnSchemaBuilder;", "uriString", "RnSchemaBuilder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56804a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f56805b = new f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/music/util/SchemeHelper$RnSchemaBuilder;", "", "paramsMap", "Ljava/util/HashMap;", "", "uriBuilder", "Landroid/net/Uri$Builder;", "(Ljava/util/HashMap;Landroid/net/Uri$Builder;)V", "appendQueryParameter", "key", "value", "build", "Landroid/net/Uri;", "params", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56806a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, String> f56807b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri.Builder f56808c;

        @NotNull
        public final Uri a() {
            if (PatchProxy.isSupport(new Object[0], this, f56806a, false, 60636, new Class[0], Uri.class)) {
                return (Uri) PatchProxy.accessDispatch(new Object[0], this, f56806a, false, 60636, new Class[0], Uri.class);
            }
            for (Map.Entry entry : this.f56807b.entrySet()) {
                this.f56808c.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri build = this.f56808c.build();
            Intrinsics.checkExpressionValueIsNotNull(build, "uriBuilder.build()");
            return build;
        }

        public a(@NotNull HashMap<String, String> hashMap, @NotNull Uri.Builder builder) {
            Intrinsics.checkParameterIsNotNull(hashMap, "paramsMap");
            Intrinsics.checkParameterIsNotNull(builder, "uriBuilder");
            this.f56807b = hashMap;
            this.f56808c = builder;
        }

        @NotNull
        public final a a(@NotNull String str, @NotNull String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f56806a, false, 60634, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f56806a, false, 60634, new Class[]{String.class, String.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "value");
            if (!TextUtils.isEmpty(this.f56807b.get("rn_schema"))) {
                String uri = Uri.parse(this.f56807b.get("rn_schema")).buildUpon().appendQueryParameter(str, str2).build().toString();
                Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(rnScheme).buil…              .toString()");
                this.f56807b.put("rn_schema", uri);
            }
            if (!TextUtils.isEmpty(this.f56807b.get(PushConstants.WEB_URL))) {
                String uri2 = Uri.parse(this.f56807b.get(PushConstants.WEB_URL)).buildUpon().appendQueryParameter(str, str2).build().toString();
                Intrinsics.checkExpressionValueIsNotNull(uri2, "Uri.parse(urlParam).buil…              .toString()");
                this.f56807b.put(PushConstants.WEB_URL, uri2);
            }
            return this;
        }
    }

    private f() {
    }

    @JvmStatic
    @NotNull
    public static final a a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f56804a, true, 60632, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, f56804a, true, 60632, new Class[]{String.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "uriString");
        HashMap<String, String> b2 = f56805b.b(str2);
        Uri.Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        Intrinsics.checkExpressionValueIsNotNull(clearQuery, "uriBuilder");
        return new a(b2, clearQuery);
    }

    private final HashMap<String, String> b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56804a, false, 60633, new Class[]{String.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{str}, this, f56804a, false, 60633, new Class[]{String.class}, HashMap.class);
        } else if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        } else {
            Uri parse = Uri.parse(str);
            HashMap<String, String> hashMap = new HashMap<>();
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            for (String next : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(next);
                if (!TextUtils.isEmpty(queryParameter)) {
                    Map map = hashMap;
                    Intrinsics.checkExpressionValueIsNotNull(next, "queryName");
                    if (queryParameter == null) {
                        Intrinsics.throwNpe();
                    }
                    map.put(next, queryParameter);
                }
            }
            return hashMap;
        }
    }
}
