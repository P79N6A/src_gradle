package com.ss.android.ugc.aweme.cloudcontrol.a;

import com.bytedance.common.utility.android.ManifestData;
import com.google.common.a.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.callback.g;
import com.monitor.cloudmessage.entity.ConsumerResult;
import com.ss.android.h.a.a;
import com.ss.android.ugc.aweme.base.utils.d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/cloudcontrol/consumer/PatchConsumer;", "Lcom/monitor/cloudmessage/callback/IPatchConsumer;", "()V", "consumerResult", "Lcom/monitor/cloudmessage/entity/ConsumerResult;", "getConsumerResult", "handlePatchMessage", "", "url", "", "md5", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36215a;

    /* renamed from: b  reason: collision with root package name */
    private ConsumerResult f36216b;

    @NotNull
    public final ConsumerResult b() {
        if (PatchProxy.isSupport(new Object[0], this, f36215a, false, 27040, new Class[0], ConsumerResult.class)) {
            return (ConsumerResult) PatchProxy.accessDispatch(new Object[0], this, f36215a, false, 27040, new Class[0], ConsumerResult.class);
        }
        ConsumerResult consumerResult = this.f36216b;
        if (consumerResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consumerResult");
        }
        return consumerResult;
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f36215a, false, 27041, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f36215a, false, 27041, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            Method declaredMethod = a.a(d.a()).getClass().getDeclaredMethod("patch", new Class[]{List.class, Exception.class});
            Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "patchMethod");
            declaredMethod.setAccessible(true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.bytedance.ies.b.a.a(Integer.toString(ManifestData.getInt(d.a(), "UPDATE_VERSION_CODE")), str, str2));
            declaredMethod.invoke(a.a(d.a()), new Object[]{arrayList, null});
            declaredMethod.setAccessible(false);
            ConsumerResult build = ConsumerResult.build(true, null, null);
            Intrinsics.checkExpressionValueIsNotNull(build, "ConsumerResult.build(true, null, null)");
            this.f36216b = build;
        } catch (Exception e2) {
            ConsumerResult build2 = ConsumerResult.build(false, u.b(e2), null);
            Intrinsics.checkExpressionValueIsNotNull(build2, "ConsumerResult.build(fal…ckTraceAsString(e), null)");
            this.f36216b = build2;
        }
    }
}
