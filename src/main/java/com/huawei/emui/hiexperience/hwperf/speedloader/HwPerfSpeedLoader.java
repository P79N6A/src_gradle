package com.huawei.emui.hiexperience.hwperf.speedloader;

import com.huawei.emui.hiexperience.hwperf.HwPerfBase;
import com.huawei.emui.hiexperience.hwperf.utils.HwPerfLog;

public class HwPerfSpeedLoader extends HwPerfBase {

    public interface HwPerfVelocityCallback {
        void HwPerfonVelocityDownToThreshold();

        void HwPerfonVelocityUpToThreshold();
    }

    public String HwPerfGetSystemRefVelocity() {
        HwPerfLog.i("API: HwPerfSpeedLoader HwPerfGetSystemRefVelocity");
        return "-1:-1:-1";
    }

    public void HwPerfSetThresholdVelocity(float f2) {
        HwPerfLog.i("API: HwPerfSpeedLoader HwPerfSetThresholdVelocity");
    }

    public boolean HwPerfSetSpeedLoaderListener(Object obj, HwPerfVelocityCallback hwPerfVelocityCallback) {
        HwPerfLog.i("API: HwPerfSpeedLoader HwPerfSetSpeedLoaderListener");
        return false;
    }
}
