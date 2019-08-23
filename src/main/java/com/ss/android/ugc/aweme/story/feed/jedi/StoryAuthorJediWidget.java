package com.ss.android.ugc.aweme.story.feed.jedi;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0006H\u0014J\b\u0010+\u001a\u00020$H\u0016J\b\u0010,\u001a\u00020$H\u0016J\u0010\u0010-\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010\u0014J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\"J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0002R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryAuthorJediWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;", "mFragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "avatar", "Landroid/view/View;", "getAvatar", "()Landroid/view/View;", "isMeetMode", "", "()Z", "isOfficialMode", "mAuthorContainer", "Landroid/widget/LinearLayout;", "mAuthorName", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mAvatarView", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "mAwemeWithComment", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "mFollowStatus", "mIvClose", "Landroid/widget/ImageView;", "mProfileService", "Lcom/ss/android/ugc/aweme/story/api/IProfileService;", "mPublishTime", "mRecommendIcon", "mRecommendReason", "mStoryChangeCallback", "Lcom/ss/android/ugc/aweme/story/feed/viewmodel/StoryChange$OnStoryChangeCallback;", "mUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "mUserStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "gotoProfilePage", "", "initAuthorInfo", "initFollowStatus", "initRecommend", "onAwemeChanged", "onBindView", "view", "onCreate", "onDestroy", "onPageSelected", "item", "onStoryChanged", "userStory", "setFollowStatus", "toStatus", "", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryAuthorJediWidget extends Widget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72526a;
    public static final a t = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    AvatarImageView f72527b;
    DmtTextView k;
    DmtTextView l;
    public DmtTextView m;
    ImageView n;
    public com.ss.android.ugc.aweme.story.api.model.b o;
    public UserStory p;
    public User q;
    public com.ss.android.ugc.aweme.story.api.d r;
    public final Fragment s;
    private LinearLayout u;
    private DmtTextView v;
    private ImageView w;
    private StoryChange.a x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryAuthorJediWidget$Companion;", "", "()V", "STATUS_FOLLOW", "", "STATUS_UNFOLLOW", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryAuthorJediWidget f72529b;

        b(StoryAuthorJediWidget storyAuthorJediWidget) {
            this.f72529b = storyAuthorJediWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f72528a, false, 83262, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72528a, false, 83262, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f72529b.i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryAuthorJediWidget f72531b;

        c(StoryAuthorJediWidget storyAuthorJediWidget) {
            this.f72531b = storyAuthorJediWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f72530a, false, 83263, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72530a, false, 83263, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f72531b.i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryAuthorJediWidget f72533b;

        d(StoryAuthorJediWidget storyAuthorJediWidget) {
            this.f72533b = storyAuthorJediWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f72532a, false, 83264, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72532a, false, 83264, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.arch.widgets.base.b a2 = com.ss.android.ugc.aweme.story.base.a.a.a().a("dismiss_sticker_pop_up_window", Boolean.TYPE);
            Intrinsics.checkExpressionValueIsNotNull(a2, "StoryLiveDataBus.get()\n …DOW, Boolean::class.java)");
            a2.setValue(Boolean.TRUE);
            Activity c2 = this.f72533b.c();
            if (c2 != null) {
                com.ss.android.ugc.aweme.arch.widgets.base.b<String> a3 = ChangeUserModeViewModel.a((FragmentActivity) c2);
                Intrinsics.checkExpressionValueIsNotNull(a3, "ChangeUserModeViewModel.…vity as FragmentActivity)");
                a3.setValue("click_close");
                Activity c3 = this.f72533b.c();
                if (c3 != null) {
                    ((FragmentActivity) c3).supportFinishAfterTransition();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryAuthorJediWidget f72535b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f72536c;

        e(StoryAuthorJediWidget storyAuthorJediWidget, User user) {
            this.f72535b = storyAuthorJediWidget;
            this.f72536c = user;
        }

        public final void onClick(View view) {
            final int i = 0;
            if (PatchProxy.isSupport(new Object[]{view}, this, f72534a, false, 83265, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72534a, false, 83265, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f72536c.getFollowStatus() == 0) {
                i = 1;
            }
            User a2 = com.ss.android.ugc.aweme.story.base.utils.g.f71954c.a();
            if (a2 != null) {
                String uid = this.f72536c.getUid();
                com.ss.android.ugc.aweme.story.api.d dVar = this.f72535b.r;
                if (dVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(uid, "uid");
                    dVar.a(uid, i, (com.ss.android.ugc.aweme.story.api.a<Integer>) new com.ss.android.ugc.aweme.story.api.a<Integer>(this) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f72537a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ e f72538b;

                        public final /* synthetic */ void a(Object obj) {
                            ((Number) obj).intValue();
                        }

                        public final void a(@NotNull String str) {
                            int i = 1;
                            if (PatchProxy.isSupport(new Object[]{str}, this, f72537a, false, 83266, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, this, f72537a, false, 83266, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            Intrinsics.checkParameterIsNotNull(str, NotifyType.SOUND);
                            com.bytedance.ies.dmt.ui.d.a.b(this.f72538b.f72535b.f2709d, "请求出错").a();
                            StoryAuthorJediWidget storyAuthorJediWidget = this.f72538b.f72535b;
                            if (i != 0) {
                                i = 0;
                            }
                            storyAuthorJediWidget.a(i);
                        }

                        {
                            this.f72538b = r1;
                        }
                    });
                }
                this.f72535b.a(i);
                if (i == 1) {
                    String str = "homepage_hot";
                    try {
                        Fragment fragment = this.f72535b.s;
                        if (fragment != null) {
                            String str2 = ((StoryFeedJediFragment) fragment).h().eventType;
                            Intrinsics.checkExpressionValueIsNotNull(str2, "(mFragment as StoryFeedJ…ragment).params.eventType");
                            str = str2;
                            com.ss.android.ugc.aweme.story.api.model.b bVar = this.f72535b.o;
                            if (bVar != null) {
                                com.ss.android.ugc.aweme.story.metrics.e f2 = new com.ss.android.ugc.aweme.story.metrics.e().a("homepage_story").b(str).c("follow_button").d("follow_button").e(a2.getUid()).f(uid);
                                LifeStory lifeStory = bVar.getLifeStory();
                                Intrinsics.checkExpressionValueIsNotNull(lifeStory, "it.lifeStory");
                                f2.g(lifeStory.getStoryId()).a(bVar.getLogPb()).post();
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment");
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "s", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryAuthorJediWidget f72541b;

        f(StoryAuthorJediWidget storyAuthorJediWidget) {
            this.f72541b = storyAuthorJediWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{str}, this, f72540a, false, 83267, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72540a, false, 83267, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                StoryAuthorJediWidget.a(this.f72541b).setVisibility(0);
                StoryAuthorJediWidget.a(this.f72541b).setText(Html.fromHtml(str));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/StoryAuthorJediWidget$onCreate$1", "Lcom/ss/android/ugc/aweme/story/feed/viewmodel/StoryChange$OnStoryChangeCallback;", "onStoryChange", "", "model", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g extends StoryChange.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryAuthorJediWidget f72543b;

        g(StoryAuthorJediWidget storyAuthorJediWidget) {
            this.f72543b = storyAuthorJediWidget;
        }

        public final void a(@Nullable com.ss.android.ugc.aweme.story.api.model.b bVar) {
            User user;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f72542a, false, 83268, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f72542a, false, 83268, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
            } else if (this.f72543b.c() != null && this.f72543b.p != null && bVar != null) {
                Activity c2 = this.f72543b.c();
                if (c2 != null) {
                    UserStory c3 = StoryChange.c((FragmentActivity) c2);
                    String str = null;
                    if (c3 != null) {
                        user = c3.getUser();
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        CharSequence uid = user.getUid();
                        User user2 = this.f72543b.q;
                        if (user2 != null) {
                            str = user2.getUid();
                        }
                        if (TextUtils.equals(uid, str)) {
                            this.f72543b.o = bVar;
                            this.f72543b.h();
                        }
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72526a, false, 83248, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72526a, false, 83248, new Class[0], Boolean.TYPE)).booleanValue();
        }
        UserStory userStory = this.p;
        if (userStory != null) {
            if (userStory.getFriendType() != 4) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public final boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72526a, false, 83249, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72526a, false, 83249, new Class[0], Boolean.TYPE)).booleanValue();
        }
        UserStory userStory = this.p;
        if (userStory != null) {
            if (userStory.getFriendType() != 2) {
                return false;
            }
            z = true;
        }
        return z;
    }

    @Nullable
    public final View g() {
        if (PatchProxy.isSupport(new Object[0], this, f72526a, false, 83250, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f72526a, false, 83250, new Class[0], View.class);
        }
        AvatarImageView avatarImageView = this.f72527b;
        if (avatarImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarView");
        }
        return avatarImageView;
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f72526a, false, 83253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72526a, false, 83253, new Class[0], Void.TYPE);
            return;
        }
        Activity c2 = c();
        if (c2 != null) {
            StoryChange.a((FragmentActivity) c2, this.x);
            super.onDestroy();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f72526a, false, 83251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72526a, false, 83251, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.x = new g(this);
        Activity c2 = c();
        if (c2 != null) {
            StoryChange.a((FragmentActivity) c2, a(), this.x);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f72526a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 83260(0x1453c, float:1.16672E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f72526a
            r5 = 0
            r6 = 83260(0x1453c, float:1.16672E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r1 = r9.e()
            r2 = 8
            if (r1 == 0) goto L_0x00ba
            boolean r1 = r9.f()
            if (r1 == 0) goto L_0x0035
            goto L_0x00ba
        L_0x0035:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.m
            if (r1 != 0) goto L_0x003e
            java.lang.String r3 = "mRecommendReason"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x003e:
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r9.w
            if (r1 != 0) goto L_0x004a
            java.lang.String r3 = "mRecommendIcon"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x004a:
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.story.api.model.b r0 = r9.o
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r0.getReason()
            if (r0 != 0) goto L_0x0059
        L_0x0057:
            java.lang.String r0 = ""
        L_0x0059:
            com.ss.android.ugc.aweme.story.feed.viewmodel.a r1 = com.ss.android.ugc.aweme.story.feed.viewmodel.a.a()
            com.ss.android.ugc.aweme.profile.model.User r3 = r9.q
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = r3.getUid()
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            com.ss.android.ugc.aweme.arch.widgets.base.b r1 = r1.a(r3)
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0080
            java.lang.String r0 = "nextLiveData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0083
        L_0x0080:
            r1.postValue(r0)
        L_0x0083:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009f
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r9.m
            if (r2 != 0) goto L_0x0095
            java.lang.String r3 = "mRecommendReason"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0095:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            goto L_0x00ab
        L_0x009f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.m
            if (r0 != 0) goto L_0x00a8
            java.lang.String r3 = "mRecommendReason"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00a8:
            r0.setVisibility(r2)
        L_0x00ab:
            android.arch.lifecycle.LifecycleOwner r0 = r9.a()
            com.ss.android.ugc.aweme.story.feed.jedi.StoryAuthorJediWidget$f r2 = new com.ss.android.ugc.aweme.story.feed.jedi.StoryAuthorJediWidget$f
            r2.<init>(r9)
            android.arch.lifecycle.Observer r2 = (android.arch.lifecycle.Observer) r2
            r1.observe(r0, r2)
            return
        L_0x00ba:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.m
            if (r0 != 0) goto L_0x00c3
            java.lang.String r1 = "mRecommendReason"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00c3:
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r9.w
            if (r0 != 0) goto L_0x00cf
            java.lang.String r1 = "mRecommendIcon"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00cf:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.jedi.StoryAuthorJediWidget.j():void");
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f72526a, false, 83256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72526a, false, 83256, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.api.model.b bVar = this.o;
        if (bVar != null) {
            if (f()) {
                DmtTextView dmtTextView = this.v;
                if (dmtTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPublishTime");
                }
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.v;
                if (dmtTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPublishTime");
                }
                dmtTextView2.setVisibility(0);
                LifeStory lifeStory = bVar.getLifeStory();
                Intrinsics.checkExpressionValueIsNotNull(lifeStory, "aweme.lifeStory");
                long createTime = lifeStory.getCreateTime() * 1000;
                if (createTime <= 0) {
                    createTime = System.currentTimeMillis();
                }
                DmtTextView dmtTextView3 = this.v;
                if (dmtTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPublishTime");
                }
                Context context = this.f2709d;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                dmtTextView3.setText(com.ss.android.ugc.aweme.story.feed.c.b.a(context.getResources(), createTime));
            }
            j();
        }
    }

    public final void i() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f72526a, false, 83258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72526a, false, 83258, new Class[0], Void.TYPE);
        } else if (!f()) {
            com.ss.android.ugc.aweme.story.api.model.b bVar = this.o;
            if (bVar != null) {
                com.ss.android.ugc.aweme.story.metrics.c b2 = new com.ss.android.ugc.aweme.story.metrics.c().b("homepage_story");
                LifeStory lifeStory = bVar.getLifeStory();
                Intrinsics.checkExpressionValueIsNotNull(lifeStory, "it.lifeStory");
                com.ss.android.ugc.aweme.story.metrics.c d2 = b2.d(lifeStory.getStoryId());
                User user = this.q;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                d2.c(str).a("click_head").a(bVar.getLogPb()).post();
            }
            com.ss.android.ugc.aweme.story.api.d dVar = this.r;
            if (dVar != null) {
                User user2 = this.q;
                if (user2 != null && !TextUtils.isEmpty(user2.getUid())) {
                    Activity c2 = c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, PushConstants.INTENT_ACTIVITY_NAME);
                    String uid = user2.getUid();
                    Intrinsics.checkExpressionValueIsNotNull(uid, "it.uid");
                    String secUid = user2.getSecUid();
                    Intrinsics.checkExpressionValueIsNotNull(secUid, "it.secUid");
                    dVar.a((Context) c2, uid, secUid);
                }
            }
        }
    }

    public StoryAuthorJediWidget(@NotNull Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "mFragment");
        this.s = fragment;
    }

    public static final /* synthetic */ DmtTextView a(StoryAuthorJediWidget storyAuthorJediWidget) {
        DmtTextView dmtTextView = storyAuthorJediWidget.m;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendReason");
        }
        return dmtTextView;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72526a, false, 83261, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72526a, false, 83261, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 0) {
            DmtTextView dmtTextView = this.l;
            if (dmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
            }
            dmtTextView.setBackgroundResource(2130837786);
            DmtTextView dmtTextView2 = this.l;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
            }
            dmtTextView2.setText("关注");
            DmtTextView dmtTextView3 = this.l;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
            }
            Context context = this.f2709d;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            dmtTextView3.setTextColor(context.getResources().getColor(C0906R.color.hs));
        } else {
            DmtTextView dmtTextView4 = this.l;
            if (dmtTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
            }
            dmtTextView4.setBackgroundResource(2130837730);
            DmtTextView dmtTextView5 = this.l;
            if (dmtTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
            }
            dmtTextView5.setText("已关注");
            DmtTextView dmtTextView6 = this.l;
            if (dmtTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
            }
            Context context2 = this.f2709d;
            Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
            dmtTextView6.setTextColor(context2.getResources().getColor(C0906R.color.ao4));
        }
        User user = this.q;
        if (user != null) {
            user.setFollowStatus(i);
        }
    }

    public final void a(@NotNull View view) {
        View view2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f72526a, false, 83254, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72526a, false, 83254, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view);
        LayoutInflater from = LayoutInflater.from(this.f2709d);
        if (!(view instanceof ViewGroup)) {
            view2 = null;
        } else {
            view2 = view;
        }
        from.inflate(C0906R.layout.asr, (ViewGroup) view2);
        this.u = (LinearLayout) view.findViewById(C0906R.id.gv);
        View findViewById = view.findViewById(C0906R.id.ih);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.avatar_view)");
        this.f72527b = (AvatarImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.gw);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.author_name)");
        this.k = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.c8w);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.publish_time)");
        this.v = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.ah5);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.follow_status)");
        this.l = (DmtTextView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.cb9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.recommend_icon)");
        this.w = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(C0906R.id.cbc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.recommend_reason)");
        this.m = (DmtTextView) findViewById6;
        View findViewById7 = view.findViewById(C0906R.id.azy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById(R.id.iv_close)");
        this.n = (ImageView) findViewById7;
        DmtTextView dmtTextView = this.k;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAuthorName");
        }
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(dmtTextView);
        ImageView imageView = this.n;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
        }
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(imageView);
        DmtTextView dmtTextView2 = this.l;
        if (dmtTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
        }
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(dmtTextView2);
        this.r = (com.ss.android.ugc.aweme.story.api.d) ServiceManager.get().getService(com.ss.android.ugc.aweme.story.api.d.class);
    }
}
