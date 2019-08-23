package com.ss.android.ttve.monitor;

import android.support.annotation.Keep;
import java.util.regex.Pattern;

public final class GPUModelDetector {

    /* renamed from: a  reason: collision with root package name */
    static final GPUModelDetector f31230a = new GPUModelDetector();

    /* renamed from: b  reason: collision with root package name */
    ENvGpuModel f31231b;

    /* renamed from: c  reason: collision with root package name */
    ENvGpuSubModel f31232c;

    /* renamed from: d  reason: collision with root package name */
    int f31233d;

    @Keep
    public enum ENvGpuModel {
        Unknown,
        Adreno,
        Mali,
        PowerVR,
        Intel,
        NVIDIA,
        Vivante,
        VideoCore
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
        VideoCore_IV_HW
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public ENvGpuModel f31234a;

        /* renamed from: b  reason: collision with root package name */
        public ENvGpuSubModel f31235b;

        /* renamed from: c  reason: collision with root package name */
        public int f31236c;

        public a(ENvGpuModel eNvGpuModel, ENvGpuSubModel eNvGpuSubModel, int i) {
            this.f31234a = eNvGpuModel;
            this.f31235b = eNvGpuSubModel;
            this.f31236c = i;
        }
    }

    private GPUModelDetector() {
    }

    static int c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    static boolean a(String str) {
        if (Pattern.compile("-?[0-9]+.?[0-9]+").matcher(str).matches() || Pattern.compile("[0-9]+").matcher(str).matches()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String valueOf = String.valueOf(str.charAt(i));
            if (a(valueOf)) {
                sb.append(valueOf);
            }
        }
        return sb.toString();
    }
}
