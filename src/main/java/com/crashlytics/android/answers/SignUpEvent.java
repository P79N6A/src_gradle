package com.crashlytics.android.answers;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class SignUpEvent extends PredefinedEvent<SignUpEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "signUp";
    }

    public SignUpEvent putMethod(String str) {
        this.predefinedAttributes.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str);
        return this;
    }

    public SignUpEvent putSuccess(boolean z) {
        this.predefinedAttributes.put("success", Boolean.toString(z));
        return this;
    }
}
