package com.crashlytics.android.answers;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class InviteEvent extends PredefinedEvent<InviteEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "invite";
    }

    public InviteEvent putMethod(String str) {
        this.predefinedAttributes.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str);
        return this;
    }
}
