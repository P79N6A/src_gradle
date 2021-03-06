package com.facebook.react.modules.fresco;

import android.support.annotation.Nullable;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.a.a.a;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

@ReactModule(name = "FrescoModule")
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, ModuleDataCleaner.Cleanable {
    private static boolean sHasBeenInitialized;
    private final boolean mClearOnDestroy;
    @Nullable
    private ImagePipelineConfig mConfig;

    public String getName() {
        return "FrescoModule";
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        Fresco.getImagePipeline().clearCaches();
    }

    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            Fresco.getImagePipeline().clearMemoryCaches();
        }
    }

    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            Fresco.initialize(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            FLog.w("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, null);
    }

    private static ImagePipelineConfig getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).build();
    }

    public static ImagePipelineConfig.Builder getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new SystraceRequestListener());
        OkHttpClient createClient = OkHttpClientProvider.createClient();
        ((CookieJarContainer) createClient.cookieJar()).setCookieJar(new JavaNetCookieJar(new ForwardingCookieHandler(reactContext)));
        return a.newBuilder(reactContext.getApplicationContext(), createClient).setNetworkFetcher(new ReactOkHttpNetworkFetcher(createClient)).setDownsampleEnabled(false).setRequestListeners(hashSet);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, @Nullable ImagePipelineConfig imagePipelineConfig) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = imagePipelineConfig;
    }
}
