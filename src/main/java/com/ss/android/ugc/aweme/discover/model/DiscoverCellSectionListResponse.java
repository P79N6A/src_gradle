package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoverCellSectionListResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "list", "", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverCellSection;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverCellSectionListResponse extends BaseResponse {
    @SerializedName("cell_sections")
    @Nullable
    public List<DiscoverCellSection> list;
}