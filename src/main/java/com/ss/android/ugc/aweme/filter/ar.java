package com.ss.android.ugc.aweme.filter;

import android.net.Uri;
import java.util.List;

public interface ar {
    h getFilter(int i);

    @Deprecated
    String getFilterEnName(int i);

    @Deprecated
    String getFilterFilePath(int i);

    @Deprecated
    String getFilterFolder(int i);

    List<h> getFilterListData();

    @Deprecated
    String getFilterName(int i);

    @Deprecated
    Uri getThumbnailUri(int i);

    void refreshData();
}
