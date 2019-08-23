package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.support.annotation.Keep;
import android.support.v4.app.FragmentActivity;

@Keep
public interface IMediaChosenResultProcessFactory {
    b create(FragmentActivity fragmentActivity, int i, long j);
}
