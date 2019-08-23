package com.ss.android.ugc.aweme.feed.adapter;

import android.view.Surface;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IFeedPlayerView extends a {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeedPlayerContentType {
    }

    void A();

    void a_(Aweme aweme);

    void d(int i);

    void f(boolean z);

    int q();

    boolean v();

    Surface w();

    View x();

    com.ss.android.ugc.aweme.video.f.a y();

    void z();
}
