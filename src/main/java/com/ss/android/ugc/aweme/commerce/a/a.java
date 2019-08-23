package com.ss.android.ugc.aweme.commerce.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/cache/AwemeCache;", "", "()V", "awemeCache", "Ljava/util/HashMap;", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lkotlin/collections/HashMap;", "cacheAweme", "", "aweme", "getAwemeById", "awemeId", "getAwemeByIdWithAdInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36665a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Aweme> f36666b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a f36667c = new a();

    private a() {
    }

    @JvmStatic
    @Nullable
    public static final Aweme a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f36665a, true, 28012, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str2}, null, f36665a, true, 28012, new Class[]{String.class}, Aweme.class);
        } else if (str2 == null) {
            return null;
        } else {
            if (f36666b.get(str2) != null) {
                return f36666b.get(str2);
            }
            Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str2);
            if (b2 != null) {
                return b2;
            }
            return j.a().a(str2);
        }
    }

    @JvmStatic
    public static final void a(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f36665a, true, 28010, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f36665a, true, 28010, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null && !TextUtils.isEmpty(aweme.getAid())) {
            String aid = aweme.getAid();
            Intrinsics.checkExpressionValueIsNotNull(aid, "aid");
            f36666b.put(aid, aweme2);
        }
    }
}
