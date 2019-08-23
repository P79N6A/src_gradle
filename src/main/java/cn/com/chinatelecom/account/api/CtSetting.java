package cn.com.chinatelecom.account.api;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class CtSetting {
    private int connTimeout;
    private int readTimeout;
    private int totalTimeout;

    public CtSetting(int i, int i2, int i3) {
        this.connTimeout = i;
        this.readTimeout = i2;
        this.totalTimeout = i3;
    }

    public static int getConnTimeout(CtSetting ctSetting) {
        return (ctSetting == null || ctSetting.connTimeout <= 0) ? PushConstants.WORK_RECEIVER_EVENTCORE_ERROR : ctSetting.connTimeout;
    }

    public static int getReadTimeout(CtSetting ctSetting) {
        return (ctSetting == null || ctSetting.readTimeout <= 0) ? PushConstants.WORK_RECEIVER_EVENTCORE_ERROR : ctSetting.readTimeout;
    }

    public static int getTotalTimeout(CtSetting ctSetting) {
        if (ctSetting == null || ctSetting.totalTimeout <= 0) {
            return 10000;
        }
        return ctSetting.totalTimeout;
    }

    public void setConnTimeout(int i) {
        this.connTimeout = i;
    }

    public void setReadTimeout(int i) {
        this.readTimeout = i;
    }

    public void setTotalTimeout(int i) {
        this.totalTimeout = i;
    }
}
