package com.ss.android.ugc.aweme.framework.b;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.LifecycleState;
import java.util.List;

public interface a {
    View a(Context context);

    List<ReactPackage> a();

    List<NativeModule> a(ReactApplicationContext reactApplicationContext);

    void a(String str);

    void a(String str, boolean z);

    boolean b();

    boolean c();

    boolean d();

    ImageDecodeOptions e();

    ImagePipelineConfig f();

    LifecycleState g();

    @Nullable
    String h();

    String i();
}
