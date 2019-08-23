package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Keep;
import android.view.ViewGroup;
import java.util.Map;

@Keep
public interface IAVStoryProxyService {
    String detectIsFromEditOrStory(Context context);

    Map getTrickyMapByActivity(Context context);

    void startStoryEditActivity(Activity activity, Intent intent);

    void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, boolean z2, boolean z3);

    void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup);
}
