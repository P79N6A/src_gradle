package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.f.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class c extends b<com.ss.android.ugc.aweme.discover.mixfeed.c, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42571a;

    /* renamed from: b  reason: collision with root package name */
    public SearchMixFeedFragment f42572b;
    private SearchStateViewModel s;
    private String t;

    public final /* bridge */ /* synthetic */ Fragment c() {
        return this.f42572b;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f42571a, false, 36850, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f42571a, false, 36850, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((e) this.f2979f).isViewValid()) {
            if (((e) this.f2979f).a((SearchApiResult) ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).getData(), exc)) {
                ((e) this.f2979f).b(false);
                return;
            }
            super.a(exc);
            a.a((Context) r(), (Throwable) exc);
        }
    }

    /* renamed from: d */
    public final com.ss.android.ugc.aweme.discover.mixfeed.c i() {
        return (com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e;
    }

    public String getEventType() {
        if (!PatchProxy.isSupport(new Object[0], this, f42571a, false, 36859, new Class[0], String.class)) {
            return this.f42572b.i();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f42571a, false, 36859, new Class[0], String.class);
    }

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f42571a, false, 36849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42571a, false, 36849, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2978e != null && this.f2979f != null && ((e) this.f2979f).isViewValid()) {
            ((e) this.f2979f).b(false);
            e eVar = (e) this.f2979f;
            SearchPreventSuicide e2 = ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).e();
            if (PatchProxy.isSupport(new Object[]{e2}, eVar, e.f42575a, false, 36872, new Class[]{SearchPreventSuicide.class}, Void.TYPE)) {
                e eVar2 = eVar;
                PatchProxy.accessDispatch(new Object[]{e2}, eVar2, e.f42575a, false, 36872, new Class[]{SearchPreventSuicide.class}, Void.TYPE);
            } else if (e2 != null) {
                bg.a(e2);
            }
            e eVar3 = (e) this.f2979f;
            SearchApiResult searchApiResult = (SearchApiResult) ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).getData();
            if (PatchProxy.isSupport(new Object[]{searchApiResult}, eVar3, e.f42575a, false, 36874, new Class[]{SearchApiResult.class}, Void.TYPE)) {
                e eVar4 = eVar3;
                PatchProxy.accessDispatch(new Object[]{searchApiResult}, eVar4, e.f42575a, false, 36874, new Class[]{SearchApiResult.class}, Void.TYPE);
            } else if (eVar3.f42577c != null) {
                eVar3.f42577c.a(searchApiResult);
            }
            int i = ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    e eVar5 = (e) this.f2979f;
                    List items = ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).getItems();
                    if (((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).isHasMore() && !((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).isNewDataEmpty()) {
                        z = true;
                    }
                    eVar5.b(items, z);
                }
            } else if (((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).isDataEmpty()) {
                ((e) this.f2979f).a((SearchApiResult) ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).getData(), (Exception) null);
            } else {
                this.f42572b.b(((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).f42551b);
                ((e) this.f2979f).f42578d = ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).f42552c;
                ((e) this.f2979f).a(((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).d());
                ((e) this.f2979f).a(((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).getItems(), ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).isHasMore());
            }
        }
    }

    public final void a(int i) {
        if (this.f2978e != null) {
            ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).f42717e = i;
        }
    }

    c(SearchMixFeedFragment searchMixFeedFragment) {
        this.f42572b = searchMixFeedFragment;
        this.s = (SearchStateViewModel) ViewModelProviders.of(searchMixFeedFragment.getActivity()).get(SearchStateViewModel.class);
        this.s.searchState.observe(searchMixFeedFragment, new SearchStateViewModel.SearchObserver().setListener(new d(this)));
    }

    public final String a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42571a, false, 36851, new Class[]{Boolean.TYPE}, String.class)) {
            return this.f42572b.i();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42571a, false, 36851, new Class[]{Boolean.TYPE}, String.class);
    }

    public final void d(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f42571a, false, 36848, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f42571a, false, 36848, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.t = str;
        if (this.f2978e != null) {
            ((com.ss.android.ugc.aweme.discover.mixfeed.c) this.f2978e).a(this.t);
        }
    }

    public final void b(com.ss.android.ugc.aweme.newfollow.e.a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f42571a, false, 36858, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f42571a, false, 36858, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.g.a.b(a(true), aVar, ((e) this.f2979f).f42576b, i + 1);
    }

    public final void a(com.ss.android.ugc.aweme.newfollow.e.a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f42571a, false, 36857, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f42571a, false, 36857, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(r(), aVar, a(true))) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(a(true), aVar, ((e) this.f2979f).f42576b, i + 1);
        }
    }

    public final void a(View view, View view2, Aweme aweme) {
        Aweme aweme2;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme}, this, f42571a, false, 36852, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme}, this, f42571a, false, 36852, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(view, view2, aweme)) {
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            k.a(((e) this.f2979f).b(aweme.getAid()), ((e) this.f2979f).f42576b, 3, aweme.getRequestId(), aweme2.getMusic(), "click_search_result_video");
        }
    }

    public final void b(View view, View view2, Aweme aweme) {
        Aweme aweme2;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme}, this, f42571a, false, 36853, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme}, this, f42571a, false, 36853, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.b(view, view2, aweme)) {
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            k.a(((e) this.f2979f).b(aweme.getAid()), ((e) this.f2979f).f42576b, 3, aweme.getRequestId(), aweme2.getMusic(), "click_search_result_video");
        }
    }

    public final void a(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f42571a, false, 36855, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f42571a, false, 36855, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(aweme2, user2, (Activity) this.f42572b.getActivity(), this.f42572b.i())) {
            k.b(((e) this.f2979f).b(aweme.getAid()), ((e) this.f2979f).f42576b, 3, aweme.getRequestId(), user.getUid(), "click_search_result_video");
        }
    }

    public final void a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme) {
        View view3 = view;
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        View view4 = view2;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view3, textExtraStruct2, view4, aweme2}, this, f42571a, false, 36854, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, textExtraStruct2, view4, aweme2}, this, f42571a, false, 36854, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(view3, textExtraStruct2, view4, aweme2, this.f42572b.i())) {
            if (textExtraStruct.getType() == 1) {
                k.c(((e) this.f2979f).b(aweme.getAid()), ((e) this.f2979f).f42576b, 3, aweme.getRequestId(), textExtraStruct.getCid(), "click_search_result_video");
                return;
            }
            k.b(((e) this.f2979f).b(aweme.getAid()), ((e) this.f2979f).f42576b, 3, aweme.getRequestId(), textExtraStruct.getUserId(), "video_at");
        }
    }

    public final void b(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f42571a, false, 36856, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f42571a, false, 36856, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.b(aweme2, user2, this.f42572b.getActivity(), this.f42572b.i())) {
            k.b(((e) this.f2979f).b(aweme.getAid()), ((e) this.f2979f).f42576b, 3, aweme.getRequestId(), user.getUid(), "click_search_result_video");
        }
    }
}
