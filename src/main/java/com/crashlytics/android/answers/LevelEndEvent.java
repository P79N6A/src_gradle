package com.crashlytics.android.answers;

public class LevelEndEvent extends PredefinedEvent<LevelEndEvent> {
    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "levelEnd";
    }

    public LevelEndEvent putLevelName(String str) {
        this.predefinedAttributes.put("levelName", str);
        return this;
    }

    public LevelEndEvent putScore(Number number) {
        this.predefinedAttributes.put("score", number);
        return this;
    }

    public LevelEndEvent putSuccess(boolean z) {
        String str;
        AnswersAttributes answersAttributes = this.predefinedAttributes;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        answersAttributes.put("success", str);
        return this;
    }
}
