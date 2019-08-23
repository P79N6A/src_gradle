package com.ss.android.ugc.aweme.account.loginsetting;

import android.support.annotation.Keep;
import java.util.List;

@Keep
public class ThirdBindSettingsResponse {
    public List<BindSetting> data;
    public int status_code;
    public String status_msg;

    @Keep
    public static class BindSetting {
        public int bind_platform;
        public int bind_switch;
        public String bind_toast;
    }
}
