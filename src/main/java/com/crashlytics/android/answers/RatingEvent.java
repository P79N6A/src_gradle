package com.crashlytics.android.answers;

public class RatingEvent extends PredefinedEvent<RatingEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "rating";
    }

    public RatingEvent putContentId(String str) {
        this.predefinedAttributes.put("contentId", str);
        return this;
    }

    public RatingEvent putContentName(String str) {
        this.predefinedAttributes.put("contentName", str);
        return this;
    }

    public RatingEvent putContentType(String str) {
        this.predefinedAttributes.put("contentType", str);
        return this;
    }

    public RatingEvent putRating(int i) {
        this.predefinedAttributes.put("rating", (Number) Integer.valueOf(i));
        return this;
    }
}
