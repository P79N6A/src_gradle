package com.ss.android.ugc.aweme.cloudcontrol.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.callback.h;
import com.monitor.cloudmessage.entity.ConsumerResult;
import com.ss.android.ugc.aweme.plugin.b.e;
import com.ss.android.ugc.aweme.plugin.b.f;
import com.ss.android.ugc.aweme.plugin.e.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J6\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/cloudcontrol/consumer/PluginConsumer;", "Lcom/monitor/cloudmessage/callback/IPluginConsumer;", "()V", "consumerResult", "Lcom/monitor/cloudmessage/entity/ConsumerResult;", "getConsumerResult", "handlePluginMessage", "", "packageName", "", "versionCode", "", "url", "md5", "wifionly", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36217a;

    /* renamed from: b  reason: collision with root package name */
    private ConsumerResult f36218b;

    @NotNull
    public final ConsumerResult b() {
        if (PatchProxy.isSupport(new Object[0], this, f36217a, false, 27042, new Class[0], ConsumerResult.class)) {
            return (ConsumerResult) PatchProxy.accessDispatch(new Object[0], this, f36217a, false, 27042, new Class[0], ConsumerResult.class);
        }
        ConsumerResult consumerResult = this.f36218b;
        if (consumerResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consumerResult");
        }
        return consumerResult;
    }

    public final void a(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, Integer.valueOf(i), str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36217a, false, 27043, new Class[]{String.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str4, Integer.valueOf(i), str5, str6, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f36217a, false, 27043, new Class[]{String.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        f.a(com.ss.android.ugc.aweme.base.utils.d.a()).a(new c.a().a(str4).a(i).b(str5).c(str6).a(z).d(e.c()).b(false).a(), e.a());
        ConsumerResult build = ConsumerResult.build(true, null, null);
        Intrinsics.checkExpressionValueIsNotNull(build, "ConsumerResult.build(true, null, null)");
        this.f36218b = build;
    }
}
