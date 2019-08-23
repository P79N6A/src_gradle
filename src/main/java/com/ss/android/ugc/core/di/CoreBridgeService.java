package com.ss.android.ugc.core.di;

import android.content.Context;
import com.ss.android.ugc.pluginapi.a;

public interface CoreBridgeService {
    Context context();

    a providePlugin();
}
