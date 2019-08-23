package com.crashlytics.android.answers;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class ShareEvent extends PredefinedEvent<ShareEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "share";
    }

    public ShareEvent putContentId(String str) {
        this.predefinedAttributes.put("contentId", str);
        return this;
    }

    public ShareEvent putContentName(String str) {
        this.predefinedAttributes.put("contentName", str);
        return this;
    }

    public ShareEvent putContentType(String str) {
        this.predefinedAttributes.put("contentType", str);
        return this;
    }

    public ShareEvent putMethod(String str) {
        this.predefinedAttributes.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str);
        return this;
    }
}
