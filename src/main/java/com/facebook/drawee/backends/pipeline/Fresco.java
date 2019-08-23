package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.e.b;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import javax.annotation.Nullable;

public class Fresco {
    private static final Class<?> TAG = Fresco.class;
    private static PipelineDraweeControllerBuilderSupplier sDraweeControllerBuilderSupplier;
    private static volatile boolean sIsInitialized;

    private Fresco() {
    }

    public static PipelineDraweeControllerBuilderSupplier getDraweeControllerBuilderSupplier() {
        return sDraweeControllerBuilderSupplier;
    }

    public static boolean hasBeenInitialized() {
        return sIsInitialized;
    }

    public static ImagePipelineFactory getImagePipelineFactory() {
        return ImagePipelineFactory.getInstance();
    }

    public static PipelineDraweeControllerBuilder newDraweeControllerBuilder() {
        return sDraweeControllerBuilderSupplier.get();
    }

    public static ImagePipeline getImagePipeline() {
        return getImagePipelineFactory().getImagePipeline();
    }

    public static void shutDown() {
        sDraweeControllerBuilderSupplier = null;
        SimpleDraweeView.shutDown();
        ImagePipelineFactory.shutDown();
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, @Nullable ImagePipelineConfig imagePipelineConfig) {
        initialize(context, imagePipelineConfig, null);
    }

    private static void initializeDrawee(Context context, @Nullable b bVar) {
        if (b.isTracing()) {
            b.beginSection("Fresco.initializeDrawee");
        }
        PipelineDraweeControllerBuilderSupplier pipelineDraweeControllerBuilderSupplier = new PipelineDraweeControllerBuilderSupplier(context, bVar);
        sDraweeControllerBuilderSupplier = pipelineDraweeControllerBuilderSupplier;
        SimpleDraweeView.initialize(pipelineDraweeControllerBuilderSupplier);
        if (b.isTracing()) {
            b.endSection();
        }
    }

    public static void initialize(Context context, @Nullable ImagePipelineConfig imagePipelineConfig, @Nullable b bVar) {
        if (b.isTracing()) {
            b.beginSection("Fresco#initialize");
        }
        if (sIsInitialized) {
            FLog.w(TAG, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            sIsInitialized = true;
        }
        try {
            if (b.isTracing()) {
                b.beginSection("Fresco.initialize->SoLoader.init");
            }
            SoLoader.init(context, 0);
            com.facebook.imageutils.b.a(true);
            if (b.isTracing()) {
                b.endSection();
            }
        } catch (IOException e2) {
            com.facebook.imageutils.b.a(false);
            FLog.w(TAG, (Throwable) e2, "Could not initialize SoLoader", new Object[0]);
            if (b.isTracing()) {
                b.endSection();
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (imagePipelineConfig == null) {
            ImagePipelineFactory.initialize(applicationContext);
        } else {
            ImagePipelineFactory.initialize(imagePipelineConfig);
        }
        initializeDrawee(applicationContext, bVar);
        if (b.isTracing()) {
            b.endSection();
        }
    }
}
