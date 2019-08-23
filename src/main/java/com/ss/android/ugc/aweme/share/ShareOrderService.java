package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;

@Keep
public interface ShareOrderService {
    void addShareRecord(String str);

    Drawable getFirstAvailableIcon(Activity activity);

    String[] getImageShareList();

    String[] getShareCardImgeList();

    String[] getShareGifImageList();

    String[] getUrlShareList();

    String[] getUrlShareList(boolean z);

    String[] getUrlShareList(boolean z, boolean z2);

    String[] getVideoShareList();
}
