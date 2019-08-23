package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.feed.f.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IFeedViewHolder {

    @Retention(RetentionPolicy.SOURCE)
    public @interface HolderPauseMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HolderResumeMode {
    }

    Aweme B();

    boolean C();

    void a(int i);

    void a(ad adVar);

    void a(Aweme aweme, boolean z);

    void a(Aweme aweme, boolean z, int i);

    void a(g gVar);

    void a(String str, String str2);

    void a(boolean z);

    void b(int i);

    void b(Aweme aweme);

    int c();

    void c(int i);

    Aweme d();

    void d(boolean z);

    void e();

    void e(boolean z);

    void f();

    void f(@NonNull String str);

    void g();

    void h();

    void i();

    void j();

    IFeedPlayerView k();

    com.ss.android.ugc.playerkit.videoview.g m();

    void o();

    void p();

    CommerceVideoDelegate r();

    void s();

    p t();

    void t_();

    boolean u();
}
