package com.ss.android.ugc.aweme.commerce.service.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/UrlUtils;", "", "()V", "getCopyActionEnabledAction", "", "url", "safelyAddQueryParams", "key", "value", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38044a;

    /* renamed from: b  reason: collision with root package name */
    public static final n f38045b = new n();

    private n() {
    }

    @NotNull
    public final String a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38044a, false, 30036, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f38044a, false, 30036, new Class[]{String.class}, String.class);
        } else if (str == null) {
            return "";
        } else {
            return a(a(str, "show_more_button", PushConstants.PUSH_TYPE_THROUGH_MESSAGE), "copy_link_action", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
    }

    @NotNull
    public final String a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f38044a, false, 30035, new Class[]{String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f38044a, false, 30035, new Class[]{String.class, String.class, String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str5, "key");
        Intrinsics.checkParameterIsNotNull(str6, "value");
        i iVar = new i(str4);
        iVar.a(str5, str6);
        String a2 = iVar.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "builder.build()");
        return a2;
    }
}
