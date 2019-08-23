package com.crashlytics.android.answers;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class LoginEvent extends PredefinedEvent<LoginEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "login";
    }

    public LoginEvent putMethod(String str) {
        this.predefinedAttributes.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str);
        return this;
    }

    public LoginEvent putSuccess(boolean z) {
        this.predefinedAttributes.put("success", Boolean.toString(z));
        return this;
    }
}
