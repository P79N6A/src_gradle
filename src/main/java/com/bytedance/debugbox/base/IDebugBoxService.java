package com.bytedance.debugbox.base;

import android.app.Activity;
import android.app.Application;
import android.support.annotation.Keep;
import com.krypton.annotation.OutService;

@Keep
@OutService
public interface IDebugBoxService {
    void disableFloating();

    void forceShowFloatingButton(Activity activity);

    void initialize(Application application, a aVar);
}
