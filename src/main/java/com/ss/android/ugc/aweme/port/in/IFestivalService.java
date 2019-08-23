package com.ss.android.ugc.aweme.port.in;

import android.support.annotation.Keep;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

@Keep
public interface IFestivalService {
    String getWaterPicDir();

    void setTextForChallengeDesc(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z);
}
