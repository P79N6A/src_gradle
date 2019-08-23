package com.ss.android.ugc.aweme.ag;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/router/ChallengeDetailCompatRouterOpen;", "Lcom/ss/android/ugc/aweme/router/RouterManager$IRouterOpen;", "()V", "createRedirectRouter", "Lcom/ss/android/ugc/aweme/router/IRouter;", "redirect", "", "url", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements h.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33238a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f33239b = new c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<String, Boolean> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(String str) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 70923, new Class[]{String.class}, Boolean.TYPE)) {
                return !Intrinsics.areEqual((Object) str2, (Object) "cid");
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 70923, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
    }

    private c() {
    }

    @NotNull
    public final String a(@Nullable String str) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f33238a, false, 70921, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f33238a, false, 70921, new Class[]{String.class}, String.class);
        } else if (str == null) {
            return "";
        } else {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("cid");
            CharSequence charSequence = queryParameter;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (z) {
                return "";
            }
            Uri.Builder buildUpon = Uri.parse("aweme://challenge/detail/" + queryParameter).buildUpon();
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Intrinsics.checkExpressionValueIsNotNull(queryParameterNames, "uri.queryParameterNames");
            for (String str2 : SequencesKt.filter(CollectionsKt.asSequence(queryParameterNames), a.INSTANCE)) {
                buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
            String builder = buildUpon.toString();
            Intrinsics.checkExpressionValueIsNotNull(builder, "clientUriBuilder.toString()");
            return builder;
        }
    }
}
