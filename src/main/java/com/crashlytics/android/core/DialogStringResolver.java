package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.f.o;

public class DialogStringResolver {
    private final Context context;
    private final o promptData;

    public String getAlwaysSendButtonTitle() {
        return resourceOrFallbackValue("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.promptData.g);
    }

    public String getCancelButtonTitle() {
        return resourceOrFallbackValue("com.crashlytics.CrashSubmissionCancelTitle", this.promptData.f83340e);
    }

    public String getMessage() {
        return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptMessage", this.promptData.f83337b);
    }

    public String getSendButtonTitle() {
        return resourceOrFallbackValue("com.crashlytics.CrashSubmissionSendTitle", this.promptData.f83338c);
    }

    public String getTitle() {
        return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptTitle", this.promptData.f83336a);
    }

    private boolean isNullOrEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public DialogStringResolver(Context context2, o oVar) {
        this.context = context2;
        this.promptData = oVar;
    }

    private String stringOrFallback(String str, String str2) {
        if (isNullOrEmpty(str)) {
            return str2;
        }
        return str;
    }

    private String resourceOrFallbackValue(String str, String str2) {
        return stringOrFallback(i.c(this.context, str), str2);
    }
}
