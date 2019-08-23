package com.ss.android.ugc.aweme.web;

import com.bytedance.ies.geckoclient.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/web/GeckoClientManager;", "", "()V", "map", "Ljava/util/HashMap;", "", "Lcom/bytedance/ies/geckoclient/GeckoClient;", "Lkotlin/collections/HashMap;", "getMap", "()Ljava/util/HashMap;", "getGeckoClient", "accessKey", "putGeckoClient", "", "geckoClient", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76625a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, f> f76626b = new HashMap<>();

    @Nullable
    public final f a(@Nullable String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76625a, false, 89853, new Class[]{String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{str2}, this, f76625a, false, 89853, new Class[]{String.class}, f.class);
        }
        CharSequence charSequence = str2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            return null;
        }
        return this.f76626b.get(str2);
    }

    public final void a(@NotNull String str, @NotNull f fVar) {
        String str2 = str;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{str2, fVar2}, this, f76625a, false, 89852, new Class[]{String.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, fVar2}, this, f76625a, false, 89852, new Class[]{String.class, f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "accessKey");
        Intrinsics.checkParameterIsNotNull(fVar2, "geckoClient");
        this.f76626b.put(str2, fVar2);
    }
}
