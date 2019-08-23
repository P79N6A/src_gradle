package com.crashlytics.android.answers;

public class ContentViewEvent extends PredefinedEvent<ContentViewEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "contentView";
    }

    public ContentViewEvent putContentId(String str) {
        this.predefinedAttributes.put("contentId", str);
        return this;
    }

    public ContentViewEvent putContentName(String str) {
        this.predefinedAttributes.put("contentName", str);
        return this;
    }

    public ContentViewEvent putContentType(String str) {
        this.predefinedAttributes.put("contentType", str);
        return this;
    }
}
