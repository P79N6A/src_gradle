package com.ss.android.ugc.aweme.qrcode.c;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/qrcode/model/ScanGuideInfo;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "desc", "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "icon", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getIcon", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setIcon", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "targetIdList", "", "getTargetIdList", "()Ljava/util/List;", "setTargetIdList", "(Ljava/util/List;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends BaseResponse {
    @SerializedName("icon")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public UrlModel f63375a;
    @SerializedName("desc")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f63376b;
    @SerializedName("target_ids")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public List<String> f63377c;
}
