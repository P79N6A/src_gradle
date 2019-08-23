package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commercialize/log/RawURLGetter$adUserAgent$2$1", "Lcom/ss/android/ugc/aweme/lego/LegoTask;", "run", "", "context", "Landroid/content/Context;", "type", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RawURLGetter$adUserAgent$2$1 implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ Lazy $newUa;
    final /* synthetic */ KProperty $newUa$metadata;
    final /* synthetic */ SharedPreferences $sp;

    @NotNull
    public final f type() {
        return f.IDLE;
    }

    public final void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 31850, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 31850, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        a.a("AD_USER_AGENT_KEY");
        this.$sp.edit().putString("ad_user_agent_sp", (String) this.$newUa.getValue()).apply();
    }

    RawURLGetter$adUserAgent$2$1(SharedPreferences sharedPreferences, Lazy lazy, KProperty kProperty) {
        this.$sp = sharedPreferences;
        this.$newUa = lazy;
        this.$newUa$metadata = kProperty;
    }
}
