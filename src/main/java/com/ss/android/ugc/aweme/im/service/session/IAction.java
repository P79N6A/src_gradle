package com.ss.android.ugc.aweme.im.service.session;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IAction {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionType {
    }

    void a(Context context, a aVar, int i);
}
