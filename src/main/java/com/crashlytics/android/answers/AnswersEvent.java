package com.crashlytics.android.answers;

import com.crashlytics.android.answers.AnswersEvent;
import io.fabric.sdk.android.c;
import java.util.Map;

public abstract class AnswersEvent<T extends AnswersEvent> {
    final AnswersAttributes customAttributes = new AnswersAttributes(this.validator);
    final AnswersEventValidator validator = new AnswersEventValidator(20, 100, c.b());

    /* access modifiers changed from: package-private */
    public Map<String, Object> getCustomAttributes() {
        return this.customAttributes.attributes;
    }

    public T putCustomAttribute(String str, Number number) {
        this.customAttributes.put(str, number);
        return this;
    }

    public T putCustomAttribute(String str, String str2) {
        this.customAttributes.put(str, str2);
        return this;
    }
}
