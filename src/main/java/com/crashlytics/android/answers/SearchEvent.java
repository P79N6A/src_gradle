package com.crashlytics.android.answers;

public class SearchEvent extends PredefinedEvent<SearchEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "search";
    }

    public SearchEvent putQuery(String str) {
        this.predefinedAttributes.put("query", str);
        return this;
    }
}
