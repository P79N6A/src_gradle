package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/services/IBusinessGoodsService;", "", "clearCache", "", "getCurBusinessDraftModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/BusinessGoodsPublishModel;", "videoPath", "", "removeUserSetting", "saveBusinessGoodsInfo", "model", "mainservice_release"}, k = 1, mv = {1, 1, 15})
public interface IBusinessGoodsService {
    void clearCache();

    @NotNull
    BusinessGoodsPublishModel getCurBusinessDraftModel(@NotNull String str);

    void removeUserSetting(@NotNull String str);

    void saveBusinessGoodsInfo(@NotNull BusinessGoodsPublishModel businessGoodsPublishModel);
}
