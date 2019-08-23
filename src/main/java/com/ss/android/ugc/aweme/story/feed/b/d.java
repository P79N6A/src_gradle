package com.ss.android.ugc.aweme.story.feed.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import io.reactivex.disposables.CompositeDisposable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72472a;

    /* renamed from: b  reason: collision with root package name */
    public a f72473b;

    /* renamed from: c  reason: collision with root package name */
    public CompositeDisposable f72474c = new CompositeDisposable();

    public interface a {
        void a();

        void a(Exception exc);

        void b(UserStory userStory);
    }

    public d(a aVar) {
        this.f72473b = aVar;
    }
}
