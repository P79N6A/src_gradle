package com.ss.android.ugc.aweme.qrcode.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.model.i;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/qrcode/model/ScanMaterialResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "Ljava/io/Serializable;", "()V", "easterEgg", "Lcom/ss/android/ugc/aweme/commercialize/model/EasterEggInfo;", "getEasterEgg", "()Lcom/ss/android/ugc/aweme/commercialize/model/EasterEggInfo;", "setEasterEgg", "(Lcom/ss/android/ugc/aweme/commercialize/model/EasterEggInfo;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("easter_egg")
    @Nullable
    private i easterEgg;

    @Nullable
    public final i getEasterEgg() {
        return this.easterEgg;
    }

    public final void setEasterEgg(@Nullable i iVar) {
        this.easterEgg = iVar;
    }
}
