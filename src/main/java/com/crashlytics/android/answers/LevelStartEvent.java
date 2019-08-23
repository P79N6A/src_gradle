package com.crashlytics.android.answers;

public class LevelStartEvent extends PredefinedEvent<LevelStartEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "levelStart";
    }

    public LevelStartEvent putLevelName(String str) {
        this.predefinedAttributes.put("levelName", str);
        return this;
    }
}
