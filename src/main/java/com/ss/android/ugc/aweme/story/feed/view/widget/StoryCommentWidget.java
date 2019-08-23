package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.api.model.d;
import com.ss.android.ugc.aweme.story.api.model.g;
import com.ss.android.ugc.aweme.story.comment.api.CommentApi;
import com.ss.android.ugc.aweme.story.feed.view.ui.comment.StoryFeedCommentContainer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

public class StoryCommentWidget extends BaseFeedBottomWidget implements StoryFeedCommentContainer.a {
    public static ChangeQuickRedirect p;
    private View q;
    private StoryFeedCommentContainer r;

    public final boolean a(boolean z) {
        return !z;
    }

    public final boolean b(boolean z) {
        return !z;
    }

    public final int i() {
        return C0906R.layout.at1;
    }

    public final void ah_() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84324, new Class[0], Void.TYPE);
            return;
        }
        this.f4154b.getLifeStory();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84316, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("story_comment_add", (Observer<a>) this);
        this.g.a("story_comment_delete", (Observer<a>) this);
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84319, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84319, new Class[0], Void.TYPE);
            return;
        }
        d commentHasMore = this.f4154b.getCommentHasMore();
        if (commentHasMore != null) {
            List<g> list = commentHasMore.f71849a;
            if (!CollectionUtils.isEmpty(list)) {
                this.r.a(list, commentHasMore.f71850b);
                this.q.setVisibility(0);
                return;
            }
        }
        this.r.a();
        this.q.setVisibility(8);
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, p, false, 84318, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, p, false, 84318, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        m();
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 84317, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 84317, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.q = view.findViewById(C0906R.id.a5w);
        this.r = (StoryFeedCommentContainer) view.findViewById(C0906R.id.v3);
        this.r.setCommentClickListener(this);
    }

    public final void b(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, p, false, 84327, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, p, false, 84327, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (gVar2 != null) {
            d commentHasMore = this.f4154b.getCommentHasMore();
            if (commentHasMore != null && !CollectionUtils.isEmpty(commentHasMore.f71849a) && commentHasMore.f71849a.remove(gVar2)) {
                m();
            }
            return;
        }
    }

    /* renamed from: a */
    public final void onChanged(@Nullable a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, p, false, 84325, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, p, false, 84325, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f34376a;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 294575735) {
                if (hashCode == 1174685717 && str.equals("story_comment_delete")) {
                    c2 = 1;
                }
            } else if (str.equals("story_comment_add")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    g gVar = (g) aVar.a();
                    if (PatchProxy.isSupport(new Object[]{gVar}, this, p, false, 84326, new Class[]{g.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{gVar}, this, p, false, 84326, new Class[]{g.class}, Void.TYPE);
                        break;
                    } else {
                        if (gVar != null) {
                            d commentHasMore = this.f4154b.getCommentHasMore();
                            if (commentHasMore == null) {
                                commentHasMore = new d();
                                this.f4154b.setCommentHasMore(commentHasMore);
                            }
                            List<g> list = commentHasMore.f71849a;
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.add(0, gVar);
                            commentHasMore.f71849a = list;
                            m();
                        }
                        return;
                    }
                case 1:
                    b((g) aVar.a());
                    break;
            }
        }
    }

    public final void a(final g gVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, p, false, 84320, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, p, false, 84320, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{gVar}, this, p, false, 84323, new Class[]{g.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{gVar}, this, p, false, 84323, new Class[]{g.class}, Boolean.TYPE)).booleanValue();
        } else {
            User a2 = com.ss.android.ugc.aweme.story.base.utils.g.a();
            if (a2 != null) {
                User user = gVar.f71853c;
                if (!(gVar == null || user == null || !TextUtils.equals(user.getUid(), a2.getUid()))) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[]{gVar}, this, p, false, 84321, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, p, false, 84321, new Class[]{g.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(this.f2709d);
            aVar.a((CharSequence[]) new String[]{"删除"}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72927a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72927a, false, 84328, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72927a, false, 84328, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    dialogInterface.dismiss();
                    if (i == 0) {
                        StoryCommentWidget storyCommentWidget = StoryCommentWidget.this;
                        g gVar = gVar;
                        if (PatchProxy.isSupport(new Object[]{gVar}, storyCommentWidget, StoryCommentWidget.p, false, 84322, new Class[]{g.class}, Void.TYPE)) {
                            StoryCommentWidget storyCommentWidget2 = storyCommentWidget;
                            PatchProxy.accessDispatch(new Object[]{gVar}, storyCommentWidget2, StoryCommentWidget.p, false, 84322, new Class[]{g.class}, Void.TYPE);
                            return;
                        }
                        CommentApi.a(gVar.f71851a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((io.reactivex.Observer<? super T>) new io.reactivex.Observer<BaseResponse>(gVar) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f72930a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ g f72931b;

                            public final void onComplete() {
                            }

                            public final void onSubscribe(Disposable disposable) {
                            }

                            public final /* synthetic */ void onNext(Object obj) {
                                BaseResponse baseResponse = (BaseResponse) obj;
                                if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f72930a, false, 84329, new Class[]{BaseResponse.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f72930a, false, 84329, new Class[]{BaseResponse.class}, Void.TYPE);
                                    return;
                                }
                                StoryCommentWidget.this.b(this.f72931b);
                            }

                            public final void onError(Throwable th) {
                                if (PatchProxy.isSupport(new Object[]{th}, this, f72930a, false, 84330, new Class[]{Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{th}, this, f72930a, false, 84330, new Class[]{Throwable.class}, Void.TYPE);
                                    return;
                                }
                                com.bytedance.ies.dmt.ui.d.a.b((Context) StoryCommentWidget.this.c(), th.getMessage()).a();
                            }

                            {
                                this.f72931b = r2;
                            }
                        });
                    }
                }
            });
            aVar.b();
        }
    }
}
