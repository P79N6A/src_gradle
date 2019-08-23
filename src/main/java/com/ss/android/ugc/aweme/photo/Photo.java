package com.ss.android.ugc.aweme.photo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Photo {

    @Retention(RetentionPolicy.SOURCE)
    public @interface From {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }
}
