package com.bumptech.glide;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import com.dylanvann.fastimage1.FastImageGlideModule;
import com.dylanvann.fastimage1.b;
import java.util.Collections;
import java.util.Set;

public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final FastImageGlideModule appGlideModule = new FastImageGlideModule();

    @NonNull
    public final Set<Class<?>> getExcludedModuleClasses() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final GeneratedRequestManagerFactory getRequestManagerFactory() {
        return new GeneratedRequestManagerFactory();
    }

    public final boolean isManifestParsingEnabled() {
        return this.appGlideModule.isManifestParsingEnabled();
    }

    GeneratedAppGlideModuleImpl() {
    }

    public final void applyOptions(@NonNull Context context, @NonNull GlideBuilder glideBuilder) {
        this.appGlideModule.applyOptions(context, glideBuilder);
    }

    public final void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        new OkHttpLibraryGlideModule().registerComponents(context, glide, registry);
        new b().registerComponents(context, glide, registry);
        this.appGlideModule.registerComponents(context, glide, registry);
    }
}
