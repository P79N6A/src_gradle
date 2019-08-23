package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.a.b.m;
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.api.e;
import com.ss.android.ugc.aweme.story.api.f;
import com.ss.android.ugc.aweme.story.api.g;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.i;
import com.ss.android.ugc.aweme.story.comment.view.CommentActivity;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.b.a;
import com.ss.android.ugc.aweme.story.feed.b.b;
import com.ss.android.ugc.aweme.story.feed.view.ui.VisitorQueueView;
import com.ss.android.ugc.aweme.story.feed.view.ui.comment.StoryReplyDialog;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.metrics.k;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;

public class StoryCommentInputWidget extends BaseFeedBottomWidget implements TextWatcher, a.C0030a, b.a {
    public static ChangeQuickRedirect p;
    private FrameLayout A;
    private View B;
    public a q;
    public b r;
    public DmtTextView s;
    public boolean t;
    public boolean u;
    private VisitorQueueView v;
    private ImageView w;
    private LinearLayout x;
    private DmtTextView y;
    private RemoteImageView z;

    public void afterTextChanged(Editable editable) {
    }

    public final boolean b(boolean z2) {
        return !z2;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final int i() {
        return C0906R.layout.ass;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        c(true);
        com.ss.android.ugc.aweme.story.base.a.a.a().a("dismiss_sticker_pop_up_window", Boolean.class).setValue(Boolean.TRUE);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        d(false);
        com.ss.android.ugc.aweme.story.base.a.a.a().a("dismiss_sticker_pop_up_window", Boolean.class).setValue(Boolean.TRUE);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84267, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.q = new a(this);
        this.r = new b(this);
        c.a().a((Object) this);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84298, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.q.f72465b = null;
        c.a().c(this);
    }

    private boolean r() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84279, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, p, false, 84279, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f4154b == null) {
            return false;
        } else {
            f fVar = (f) ServiceManager.get().getService(f.class);
            if (!k() && this.f4154b.getLifeStory().isCmtSwt() && fVar != null && fVar.b()) {
                z2 = true;
            }
            return z2;
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84292, new Class[0], Void.TYPE);
            return;
        }
        f fVar = (f) ServiceManager.get().getService(f.class);
        if (!this.f4154b.getLifeStory().isCmtSwt() || (fVar != null && !fVar.b())) {
            this.A.setVisibility(4);
            this.A.setClickable(false);
            this.B.setVisibility(4);
            return;
        }
        this.A.setVisibility(0);
        this.A.setClickable(true);
        this.B.setVisibility(0);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84277, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        if (l()) {
            g();
        } else if (k()) {
            c(false);
        } else {
            d(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84286, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84286, new Class[0], Void.TYPE);
            return;
        }
        if (k()) {
            i = (int) UIUtils.dip2Px(this.f2709d, 6.0f);
        } else {
            i = (int) UIUtils.dip2Px(this.f2709d, 12.0f);
        }
        this.f2711f.setPadding(this.f2711f.getPaddingLeft(), this.f2711f.getPaddingTop(), this.f2711f.getPaddingRight(), i);
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84283, new Class[0], Void.TYPE);
            return;
        }
        g gVar = (g) ServiceManager.get().getService(g.class);
        if (gVar == null) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f2709d, "保存失败").a();
            if (this.m != null) {
                this.m.m();
                this.t = false;
            }
            return;
        }
        gVar.a(this.f2709d, this.f4154b.getLifeStory(), new com.ss.android.ugc.aweme.story.api.a<String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72923a;

            public final /* synthetic */ void a(Object obj) {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f72923a, false, 84313, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f72923a, false, 84313, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                StoryCommentInputWidget.this.g();
                StoryCommentInputWidget.this.t = false;
            }

            public final void a(@NotNull String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f72923a, false, 84314, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f72923a, false, 84314, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                StoryCommentInputWidget.this.g();
                StoryCommentInputWidget.this.t = false;
            }
        });
        k kVar = new k();
        kVar.f73200b = "self";
        kVar.f73201c = com.ss.android.ugc.aweme.story.feed.c.g.a(this.f4154b);
        kVar.f73202d = this.f4154b.getLifeStory().getGroupId();
        kVar.g = this.f4154b.getLogPb();
        kVar.f73204f = "homepage_story";
        kVar.f73203e = "click_download_icon";
        kVar.post();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84280, new Class[0], Void.TYPE);
        } else {
            if (k()) {
                r.a("click_more_button", (Map) new com.ss.android.ugc.aweme.story.base.b.a().a("enter_from", "homepage_story").a("author_id", com.ss.android.ugc.aweme.story.feed.c.g.a(this.f4154b)).a("group_id", this.f4154b.getLifeStory().getGroupId()).f71925b);
            }
            Resources resources = this.f2709d.getResources();
            if (k()) {
                i = C0906R.array.a0;
            } else {
                i = C0906R.array.z;
            }
            String[] stringArray = resources.getStringArray(i);
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(this.f2709d);
            aVar.a((CharSequence[]) stringArray, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72915a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72915a, false, 84309, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72915a, false, 84309, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    dialogInterface.dismiss();
                    switch (i) {
                        case 0:
                            if (StoryCommentInputWidget.this.k()) {
                                StoryCommentInputWidget storyCommentInputWidget = StoryCommentInputWidget.this;
                                if (PatchProxy.isSupport(new Object[0], storyCommentInputWidget, StoryCommentInputWidget.p, false, 84282, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], storyCommentInputWidget, StoryCommentInputWidget.p, false, 84282, new Class[0], Void.TYPE);
                                    break;
                                } else {
                                    d dVar = (d) ServiceManager.get().getService(d.class);
                                    if (dVar != null) {
                                        dVar.a(storyCommentInputWidget.f2709d, d.a.f71834a, d.a.f71835b, 0, false);
                                    }
                                    return;
                                }
                            } else {
                                ((e) ServiceManager.get().getService(e.class)).a(StoryCommentInputWidget.this.c(), "story", StoryCommentInputWidget.this.f4154b.getStoryId(), com.ss.android.ugc.aweme.story.feed.c.g.a(StoryCommentInputWidget.this.f4154b), Boolean.FALSE);
                                return;
                            }
                        case 1:
                            StoryCommentInputWidget.this.t = true;
                            StoryCommentInputWidget.this.m();
                            return;
                        case 2:
                            StoryCommentInputWidget storyCommentInputWidget2 = StoryCommentInputWidget.this;
                            if (!PatchProxy.isSupport(new Object[0], storyCommentInputWidget2, StoryCommentInputWidget.p, false, 84281, new Class[0], Void.TYPE)) {
                                storyCommentInputWidget2.u = true;
                                new a.C0185a(storyCommentInputWidget2.f2709d).b(storyCommentInputWidget2.f2709d.getResources().getString(C0906R.string.a10)).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f72921a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72921a, false, 84312, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72921a, false, 84312, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        StoryCommentInputWidget.this.u = false;
                                        StoryCommentInputWidget.this.g();
                                    }
                                }).a("确认", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f72919a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        String str;
                                        Single single;
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72919a, false, 84311, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72919a, false, 84311, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        com.ss.android.ugc.aweme.story.feed.b.a aVar = StoryCommentInputWidget.this.q;
                                        String storyId = StoryCommentInputWidget.this.f4154b.getStoryId();
                                        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.story.feed.c.g.f72502a, true, 83707, new Class[0], String.class)) {
                                            str = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.story.feed.c.g.f72502a, true, 83707, new Class[0], String.class);
                                        } else {
                                            str = com.ss.android.ugc.aweme.story.feed.c.g.f72503b.a();
                                        }
                                        if (PatchProxy.isSupport(new Object[]{storyId, str}, aVar, com.ss.android.ugc.aweme.story.feed.b.a.f72464a, false, 83612, new Class[]{String.class, String.class}, Void.TYPE)) {
                                            com.ss.android.ugc.aweme.story.feed.b.a aVar2 = aVar;
                                            PatchProxy.accessDispatch(new Object[]{storyId, str}, aVar2, com.ss.android.ugc.aweme.story.feed.b.a.f72464a, false, 83612, new Class[]{String.class, String.class}, Void.TYPE);
                                        } else {
                                            Intrinsics.checkParameterIsNotNull(storyId, "storyId");
                                            Intrinsics.checkParameterIsNotNull(str, "uid");
                                            m a2 = com.ss.android.ugc.aweme.story.a.a.a();
                                            if (PatchProxy.isSupport(new Object[]{storyId, str}, a2, m.f71822a, false, 85076, new Class[]{String.class, String.class}, Single.class)) {
                                                m mVar = a2;
                                                single = (Single) PatchProxy.accessDispatch(new Object[]{storyId, str}, mVar, m.f71822a, false, 85076, new Class[]{String.class, String.class}, Single.class);
                                            } else {
                                                Intrinsics.checkParameterIsNotNull(storyId, "storyId");
                                                Intrinsics.checkParameterIsNotNull(str, "userId");
                                                single = Single.fromObservable(a2.f71823b.a(new com.ss.android.ugc.aweme.story.a.b.b(storyId, str)));
                                                Intrinsics.checkExpressionValueIsNotNull(single, "Single.fromObservable(st…eParam(storyId, userId)))");
                                            }
                                            single.toObservable().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new a.b<Object>(aVar));
                                        }
                                        r.a("delete", (Map) new com.ss.android.ugc.aweme.story.base.b.a().a("enter_from", "homepage_story").a("group_id", StoryCommentInputWidget.this.f4154b.getLifeStory().getGroupId()).f71925b);
                                    }
                                }).a().a().setOnCancelListener(new DialogInterface.OnCancelListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f72917a;

                                    public final void onCancel(DialogInterface dialogInterface) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f72917a, false, 84310, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f72917a, false, 84310, new Class[]{DialogInterface.class}, Void.TYPE);
                                            return;
                                        }
                                        StoryCommentInputWidget.this.u = false;
                                        StoryCommentInputWidget.this.g();
                                    }
                                });
                                break;
                            } else {
                                PatchProxy.accessDispatch(new Object[0], storyCommentInputWidget2, StoryCommentInputWidget.p, false, 84281, new Class[0], Void.TYPE);
                                return;
                            }
                    }
                }
            });
            aVar.a((DialogInterface.OnDismissListener) new l(this));
            aVar.b();
            h();
        }
        com.ss.android.ugc.aweme.story.base.a.a.a().a("dismiss_sticker_pop_up_window", Boolean.class).setValue(Boolean.TRUE);
    }

    private void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, p, false, 84278, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, p, false, 84278, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!r()) {
            g();
        } else {
            StoryReplyDialog a2 = StoryReplyDialog.a(this.s.getText().toString(), this.f4154b, z2);
            a2.a((TextWatcher) this);
            a2.g = new k(this);
            a2.show(d().getFragmentManager(), "comment_dialog");
            h();
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, p, false, 84297, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, p, false, 84297, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.base.utils.d.a(c(), (Exception) th);
        g();
        this.u = false;
    }

    @Subscribe
    public void onViewerCountChange(com.ss.android.ugc.aweme.story.comment.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, p, false, 84268, new Class[]{com.ss.android.ugc.aweme.story.comment.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, p, false, 84268, new Class[]{com.ss.android.ugc.aweme.story.comment.b.b.class}, Void.TYPE);
        } else if (k()) {
            HashMap<String, i> hashMap = bVar.f72147a;
            if (hashMap != null && !hashMap.isEmpty() && this.f4154b != null && this.f4154b.getLifeStory() != null && this.v != null) {
                i iVar = hashMap.get(this.f4154b.getLifeStory().getStoryId());
                if (iVar != null) {
                    this.f4154b.setViewUserList(iVar);
                    this.v.a(iVar.f71861a, 3, iVar.f71862b);
                }
            }
        }
    }

    private void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, p, false, 84271, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, p, false, 84271, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        StoryDetailActivity storyDetailActivity = (StoryDetailActivity) c();
        if (PatchProxy.isSupport(new Object[0], storyDetailActivity, StoryDetailActivity.f72443c, false, 83197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], storyDetailActivity, StoryDetailActivity.f72443c, false, 83197, new Class[0], Void.TYPE);
        } else {
            storyDetailActivity.h = true;
            if (storyDetailActivity.f72445e != null) {
                com.ss.android.ugc.aweme.story.detail.f.a().f72430b = storyDetailActivity.f72445e;
            }
        }
        LifeStory lifeStory = this.f4154b.getLifeStory();
        com.ss.android.ugc.aweme.story.api.model.f b2 = ((StoryDetailActivity) c()).b();
        if (b2 != null) {
            CommentActivity.a(c(), lifeStory.getStoryId(), com.ss.android.ugc.aweme.story.feed.c.g.a(this.f4154b), b2.detailType, z2);
        }
    }

    public final void a(BaseResponse baseResponse) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, p, false, 84295, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, p, false, 84295, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        String a2 = com.ss.android.ugc.aweme.story.feed.c.g.a(this.f4154b);
        UserStory c2 = StoryChange.c((FragmentActivity) c());
        if (c2 != null) {
            List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = c2.getAwemeList();
            if (awemeList != null) {
                com.ss.android.ugc.aweme.story.api.model.b bVar = this.f4154b;
                if (PatchProxy.isSupport(new Object[]{awemeList, bVar}, this, p, false, 84296, new Class[]{List.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{awemeList, bVar}, this, p, false, 84296, new Class[]{List.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (!CollectionUtils.isEmpty(awemeList) && bVar != null) {
                        Iterator<com.ss.android.ugc.aweme.story.api.model.b> it2 = awemeList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            com.ss.android.ugc.aweme.story.api.model.b next = it2.next();
                            if (com.ss.android.ugc.aweme.story.feed.c.g.a(next, bVar)) {
                                awemeList.remove(next);
                                break;
                            }
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    c2.setTotalCount(c2.getTotalCount() - 1);
                }
                this.l.a(this.f4154b);
                if (this.l.getCount() <= 0) {
                    com.ss.android.ugc.aweme.story.base.a.a.a().a("key_delete_user").setValue(a2);
                }
                com.bytedance.ies.dmt.ui.d.a.b((Context) c(), (int) C0906R.string.a4t).a();
                this.u = false;
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.story.api.model.b bVar) {
        List list;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, p, false, 84293, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, p, false, 84293, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        if (!(this.k == null || this.k.getUser() == null)) {
            com.ss.android.ugc.aweme.arch.widgets.base.b a2 = com.ss.android.ugc.aweme.story.feed.viewmodel.b.a().a(com.ss.android.ugc.aweme.story.feed.c.g.a(this.k));
            a2.a(a(), new android.arch.lifecycle.Observer<String>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72925a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    String str = (String) obj;
                    if (PatchProxy.isSupport(new Object[]{str}, this, f72925a, false, 84315, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f72925a, false, 84315, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.arch.widgets.base.b a2 = com.ss.android.ugc.aweme.story.feed.viewmodel.b.a().a(com.ss.android.ugc.aweme.story.feed.c.g.a(StoryCommentInputWidget.this.k));
                    if (!TextUtils.isEmpty((CharSequence) a2.getValue())) {
                        StoryCommentInputWidget.this.s.setText((CharSequence) a2.getValue());
                    } else {
                        StoryCommentInputWidget.this.s.setText("");
                    }
                }
            }, false);
            if (!TextUtils.isEmpty((CharSequence) a2.getValue())) {
                this.s.setText((CharSequence) a2.getValue());
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84284, new Class[0], Void.TYPE);
        } else if (this.f4154b != null && this.f4154b.getLifeStory() != null) {
            if (j()) {
                if (PatchProxy.isSupport(new Object[0], this, p, false, 84291, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, p, false, 84291, new Class[0], Void.TYPE);
                } else {
                    n();
                    this.v.setVisibility(8);
                    this.A.setVisibility(0);
                    this.x.setVisibility(0);
                    s();
                }
            } else if (k()) {
                if (PatchProxy.isSupport(new Object[0], this, p, false, 84285, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, p, false, 84285, new Class[0], Void.TYPE);
                } else {
                    n();
                    this.v.setVisibility(0);
                    this.A.setVisibility(8);
                    this.x.setVisibility(8);
                    if (this.f4154b != null) {
                        i viewUserList = this.f4154b.getViewUserList();
                        VisitorQueueView visitorQueueView = this.v;
                        if (viewUserList == null) {
                            list = new ArrayList();
                        } else {
                            list = viewUserList.f71861a;
                        }
                        if (viewUserList != null) {
                            i = viewUserList.f71862b;
                        }
                        visitorQueueView.a(list, 3, i);
                    }
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], this, p, false, 84290, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, p, false, 84290, new Class[0], Void.TYPE);
                    return;
                }
                n();
                this.v.setVisibility(8);
                this.A.setVisibility(0);
                this.x.setVisibility(8);
                s();
            }
        }
    }

    public final void a(View view) {
        boolean z2;
        String str;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 84269, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 84269, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 84270, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 84270, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.v = (VisitorQueueView) view.findViewById(C0906R.id.dv6);
        this.w = (ImageView) view.findViewById(C0906R.id.bni);
        this.s = (DmtTextView) view.findViewById(C0906R.id.auw);
        this.x = (LinearLayout) view.findViewById(C0906R.id.lm);
        this.y = (DmtTextView) view.findViewById(C0906R.id.lo);
        this.z = (RemoteImageView) view.findViewById(C0906R.id.aur);
        this.A = (FrameLayout) view.findViewById(C0906R.id.auq);
        this.B = view.findViewById(C0906R.id.bau);
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84273, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, p, false, 84273, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            f fVar = (f) ServiceManager.get().getService(f.class);
            if (fVar == null) {
                z2 = false;
            } else {
                z2 = fVar.d();
            }
        }
        if (z2) {
            DmtTextView dmtTextView = this.s;
            if (PatchProxy.isSupport(new Object[0], this, p, false, 84275, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, p, false, 84275, new Class[0], String.class);
            } else {
                f fVar2 = (f) ServiceManager.get().getService(f.class);
                if (fVar2 == null || TextUtils.isEmpty(fVar2.g())) {
                    str = this.s.getResources().getString(C0906R.string.cft);
                } else {
                    str = fVar2.g();
                }
            }
            dmtTextView.setHint(str);
            RemoteImageView remoteImageView = this.z;
            if (PatchProxy.isSupport(new Object[]{remoteImageView}, this, p, false, 84276, new Class[]{RemoteImageView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{remoteImageView}, this, p, false, 84276, new Class[]{RemoteImageView.class}, Void.TYPE);
            } else {
                f fVar3 = (f) ServiceManager.get().getService(f.class);
                if (fVar3 == null || fVar3.f() == null) {
                    com.ss.android.ugc.aweme.base.c.a(remoteImageView, 2130837738);
                } else {
                    com.ss.android.ugc.aweme.base.c.b(remoteImageView, fVar3.f());
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, p, false, 84274, new Class[0], Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, p, false, 84274, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                f fVar4 = (f) ServiceManager.get().getService(f.class);
                if (fVar4 != null) {
                    z3 = fVar4.e();
                }
            }
            if (z3) {
                com.ss.android.ugc.aweme.base.c.a(this.z, 2130837738);
                this.s.setHint(this.s.getResources().getString(C0906R.string.cfs));
            } else {
                com.ss.android.ugc.aweme.base.c.a(this.z, 2130837739);
                this.s.setHint(this.s.getResources().getString(C0906R.string.cfs));
            }
        }
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.A);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.w);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.v);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.y);
        this.w.setOnClickListener(new f(this));
        this.A.setOnClickListener(new g(this));
        this.v.setOnClickListener(new h(this));
        this.y.setOnClickListener(new i(this));
        this.f2711f.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72909a;

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f72909a, false, 84306, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f72909a, false, 84306, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                StoryCommentInputWidget storyCommentInputWidget = StoryCommentInputWidget.this;
                if (PatchProxy.isSupport(new Object[0], storyCommentInputWidget, StoryCommentInputWidget.p, false, 84287, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyCommentInputWidget, StoryCommentInputWidget.p, false, 84287, new Class[0], Void.TYPE);
                    return;
                }
                storyCommentInputWidget.n();
            }
        });
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, p, false, 84294, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, p, false, 84294, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s.setText(charSequence);
        com.ss.android.ugc.aweme.story.feed.viewmodel.b.a().a(com.ss.android.ugc.aweme.story.feed.c.g.a(this.k)).postValue(charSequence.toString());
    }
}
