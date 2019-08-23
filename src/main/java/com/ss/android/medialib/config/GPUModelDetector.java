package com.ss.android.medialib.config;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ttve.nativePort.b;

public class GPUModelDetector {

    /* renamed from: a  reason: collision with root package name */
    private static final GPUModelDetector f29644a = new GPUModelDetector();

    @Keep
    public enum ENvGpuModel {
        Unknown,
        Adreno,
        Mali,
        PowerVR,
        Intel,
        NVIDIA,
        Vivante,
        VideoCore;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Keep
    public enum ENvGpuSubModel {
        Unknown,
        Adreno,
        Mali,
        Mali_MP,
        Mali_T,
        PowerVR_SGX,
        PowerVR_SGX_MP,
        PowerVR_SGX_MP2,
        PowerVR_Rogue_Han,
        PowerVR_Rogue_Hood,
        PowerVR_Rogue_Marlowe,
        PowerVR_Rogue_G,
        Intel_HD_Graphics,
        NVIDIA_Tegra,
        NVIDIA_Tegra_X1,
        NVIDIA_AP,
        Vivante_GC,
        VideoCore_IV_HW;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static native String nativeGetGLVersion();

    public static native String nativeGetGPURenderer();

    private GPUModelDetector() {
    }

    static {
        b.a();
    }
}
