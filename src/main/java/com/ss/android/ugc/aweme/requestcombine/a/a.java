package com.ss.android.ugc.aweme.requestcombine.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/request/ColdLaunchRequest;", "", "()V", "mRequestName", "", "getMRequestName", "()Ljava/lang/String;", "responseModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "getResponseModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "setResponseModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;)V", "getParams", "", "context", "Landroid/content/Context;", "onFail", "", "transaction", "Lcom/ss/android/ugc/aweme/lego/Lego$RequestTransaction;", "onSuccess", "", "settingsModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63569a;

    @Nullable
    public abstract String a();

    @Nullable
    public Map<String, String> a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f63569a, false, 70778, new Class[]{Context.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{context2}, this, f63569a, false, 70778, new Class[]{Context.class}, Map.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return null;
    }

    public abstract void a(@NotNull a.d dVar);

    public abstract boolean a(@Nullable SettingCombineModel settingCombineModel);

    @Nullable
    public abstract BaseCombineMode b();
}
