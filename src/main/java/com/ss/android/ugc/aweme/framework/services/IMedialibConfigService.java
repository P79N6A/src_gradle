package com.ss.android.ugc.aweme.framework.services;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.filter.h;
import java.util.List;

public interface IMedialibConfigService {
    String getBeautyFacePath(int i);

    String getBeautyFacePath1_1(int i);

    @NonNull
    String getFaceReshapePath();

    String getFilterEnName(int i);

    String getFilterFileFolder(int i);

    String getFilterFilePath(int i);

    List<h> getFilterList();

    String getFilterName(int i);

    String getFilterPath(int i);

    String getFilterPngPath(int i);

    Uri getFilterThumbnailUri(int i);

    String getMusicEffectName(int i);

    String getMusicEffectPath(int i);

    String getMusicEffectPngPath(int i);

    String getSenseMeLic();

    String getStickerDir();

    boolean isOwnFaceDetectEnabled();

    void refreshFilterData();
}
