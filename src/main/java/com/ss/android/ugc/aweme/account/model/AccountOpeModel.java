package com.ss.android.ugc.aweme.account.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MediatorLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/model/AccountOpeModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "backOpe", "Landroid/arch/lifecycle/MediatorLiveData;", "Lcom/ss/android/ugc/aweme/account/model/AccountBackOpe;", "mobileFinishOpe", "Lcom/ss/android/ugc/aweme/account/model/BindMobileFinishOpe;", "getBackOpe", "getBindMobileResult", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class AccountOpeModel extends AndroidViewModel {

    /* renamed from: a  reason: collision with root package name */
    public final MediatorLiveData<a> f32738a = new MediatorLiveData<>();

    /* renamed from: b  reason: collision with root package name */
    public final MediatorLiveData<b> f32739b = new MediatorLiveData<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountOpeModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
    }
}
