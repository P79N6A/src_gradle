package com.ss.android.ugc.aweme.profile.ui.header;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.api.b.a;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.story.api.j;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WBQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010C\u001a\u00020DH\u0002J\u0014\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002J\u0010\u0010H\u001a\u0002072\b\u0010I\u001a\u0004\u0018\u00010.J\u000e\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020\u001cJ\b\u0010L\u001a\u00020DH\u0002J\b\u0010M\u001a\u00020DH\u0016J\b\u0010N\u001a\u00020DH\u0016J\u0010\u0010O\u001a\u00020D2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020D2\u0006\u0010I\u001a\u00020.H\u0016J\u0018\u0010S\u001a\u00020D2\u0006\u0010K\u001a\u00020\u001c2\b\b\u0002\u0010T\u001a\u00020\u001cJ\b\u0010U\u001a\u00020DH\u0002J\u0010\u0010V\u001a\u00020D2\u0006\u0010K\u001a\u00020\u001cH\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001aR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@04¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006X"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/header/StoryAvatar;", "Lcom/ss/android/ugc/aweme/profile/ui/header/IStoryAvatar;", "mContext", "Landroid/content/Context;", "mLifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "mProfileView", "Lcom/ss/android/ugc/aweme/profile/presenter/IProfileView;", "mHeaderImage", "Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;", "mStoryCircleView", "Lcom/ss/android/ugc/aweme/feed/ui/StoryCircleView;", "mAvatarLoadingViewRead", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "mAvatarLoadingViewUnRead", "mStoryFailLabel", "Landroid/widget/ImageView;", "absCommonHeaderLayout", "Lcom/ss/android/ugc/aweme/profile/ui/header/AbsCommonHeaderLayout;", "(Landroid/content/Context;Landroid/arch/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/aweme/profile/presenter/IProfileView;Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;Lcom/ss/android/ugc/aweme/feed/ui/StoryCircleView;Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;Landroid/widget/ImageView;Lcom/ss/android/ugc/aweme/profile/ui/header/AbsCommonHeaderLayout;)V", "value", "", "headStatus", "getHeadStatus", "()I", "setHeadStatus", "(I)V", "isPublishFailed", "", "mAvatarOpenRequest", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest;", "getMContext", "()Landroid/content/Context;", "getMHeaderImage", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;", "mStoryRingService", "Lcom/ss/android/ugc/aweme/story/api/IStoryRingService;", "getMStoryRingService", "()Lcom/ss/android/ugc/aweme/story/api/IStoryRingService;", "setMStoryRingService", "(Lcom/ss/android/ugc/aweme/story/api/IStoryRingService;)V", "mTimeOutHandler", "Landroid/os/Handler;", "mTimeOutRunnable", "Ljava/lang/Runnable;", "mUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getMUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setMUser", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "mUserStoryReadStateObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/api/userstory/UserStoryReadState;", "publishingItem", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "getPublishingItem", "()Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "setPublishingItem", "(Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;)V", "status", "getStatus", "setStatus", "storyPublishObserver", "Lcom/ss/android/ugc/aweme/story/api/StoryPublishState;", "getStoryPublishObserver", "()Landroid/arch/lifecycle/Observer;", "addPublishItem", "", "appendPublishStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "userStory", "buildUploadStory", "user", "hideLoading", "isRead", "observeStoryData", "onDestroyView", "onStoryPublish", "openStoryDetail", "params", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "setUser", "showLoading", "loop", "showPublishError", "showStoryCircle", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class aw implements ar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62872a;
    public static final a n = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public h f62873b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.api.b.a f62874c;

    /* renamed from: d  reason: collision with root package name */
    public int f62875d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.api.model.b f62876e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public User f62877f;
    @NotNull
    public final Observer<j> g;
    public boolean h;
    @NotNull
    public final Context i;
    public n j;
    @NotNull
    public final AvatarWithBorderView k;
    public final ImageView l;
    public final a m;
    private Observer<com.ss.android.ugc.aweme.story.api.b.d> o;
    private final Handler p;
    private final Runnable q;
    private final LifecycleOwner r;
    private final StoryCircleView s;
    private final AnimationImageView t;
    private final AnimationImageView u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/header/StoryAvatar$Companion;", "", "()V", "OPEN_STORY_TIME_OUT_LIMIT", "", "STORY_ITEM_UPLOAD_FEED", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62878a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aw f62879b;

        b(aw awVar) {
            this.f62879b = awVar;
        }

        public final void run() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f62878a, false, 69646, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f62878a, false, 69646, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.api.b.a aVar = this.f62879b.f62874c;
            if (!(aVar == null || this.f62879b.f62874c == null || aVar.a() != a.d.IN_PROGRESS)) {
                aVar.c();
                aw awVar = this.f62879b;
                if (this.f62879b.b() == 3) {
                    z = true;
                }
                awVar.b(z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "userStoryReadState", "Lcom/ss/android/ugc/aweme/story/api/userstory/UserStoryReadState;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<com.ss.android.ugc.aweme.story.api.b.d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aw f62881b;

        c(aw awVar) {
            this.f62881b = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            com.ss.android.ugc.aweme.story.api.b.d dVar = (com.ss.android.ugc.aweme.story.api.b.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f62880a, false, 69647, new Class[]{com.ss.android.ugc.aweme.story.api.b.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f62880a, false, 69647, new Class[]{com.ss.android.ugc.aweme.story.api.b.d.class}, Void.TYPE);
                return;
            }
            if (!(this.f62881b.f62877f == null || dVar == null)) {
                User user = this.f62881b.f62877f;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, dVar.f71831a) && this.f62881b.b() == 2 && dVar.f71832b) {
                    User user2 = this.f62881b.f62877f;
                    if (user2 != null) {
                        user2.setHasStory(true);
                    }
                    User user3 = this.f62881b.f62877f;
                    if (user3 != null) {
                        user3.setHasUnreadStory(false);
                    }
                    n nVar = this.f62881b.j;
                    if (nVar != null) {
                        nVar.b(false, true, false);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/profile/ui/header/StoryAvatar$openStoryDetail$1", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$OnPreloadListener;", "onFail", "", "errorType", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$ErrorType;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aw f62883b;

        public final void a() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f62882a, false, 69648, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f62882a, false, 69648, new Class[0], Void.TYPE);
                return;
            }
            aw awVar = this.f62883b;
            if (this.f62883b.b() == 3) {
                z = true;
            }
            awVar.b(z);
        }

        d(aw awVar) {
            this.f62883b = awVar;
        }

        public final void a(@NotNull a.b bVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f62882a, false, 69649, new Class[]{a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f62882a, false, 69649, new Class[]{a.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "errorType");
            aw awVar = this.f62883b;
            if (this.f62883b.b() != 3) {
                z = false;
            }
            awVar.b(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/profile/ui/header/StoryAvatar$openStoryDetail$2", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$AvatarOpenRequestInterceptor;", "processOpenData", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "userStory", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements a.C0747a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aw f62885b;

        e(aw awVar) {
            this.f62885b = awVar;
        }

        @Nullable
        public final UserStory a(@Nullable UserStory userStory) {
            UserStory userStory2;
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f62884a, false, 69650, new Class[]{UserStory.class}, UserStory.class)) {
                return (UserStory) PatchProxy.accessDispatch(new Object[]{userStory}, this, f62884a, false, 69650, new Class[]{UserStory.class}, UserStory.class);
            }
            aw awVar = this.f62885b;
            if (PatchProxy.isSupport(new Object[]{userStory}, awVar, aw.f62872a, false, 69637, new Class[]{UserStory.class}, UserStory.class)) {
                return (UserStory) PatchProxy.accessDispatch(new Object[]{userStory}, awVar, aw.f62872a, false, 69637, new Class[]{UserStory.class}, UserStory.class);
            } else if (awVar.f62876e == null) {
                return userStory;
            } else {
                if (userStory == null) {
                    userStory2 = new UserStory();
                    userStory2.setAwemeList(new ArrayList());
                } else {
                    userStory2 = userStory;
                }
                userStory2.getAwemeList().add(awVar.f62876e);
                userStory2.setTotalCount(userStory2.getTotalCount() + 1);
                userStory2.setReadFlag(0);
                return userStory2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/profile/ui/header/StoryAvatar$showLoading$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnimationImageView f62887b;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationStart(@Nullable Animator animator) {
        }

        f(AnimationImageView animationImageView) {
            this.f62887b = animationImageView;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f62886a, false, 69651, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f62886a, false, 69651, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f62887b.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "storyPublishState", "Lcom/ss/android/ugc/aweme/story/api/StoryPublishState;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<j> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aw f62889b;

        g(aw awVar) {
            this.f62889b = awVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            j jVar = (j) obj;
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f62888a, false, 69652, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f62888a, false, 69652, new Class[]{j.class}, Void.TYPE);
                return;
            }
            Boolean bool = null;
            if (jVar != null) {
                num = Integer.valueOf(jVar.f71843e);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 4) {
                this.f62889b.f62876e = null;
                this.f62889b.h = false;
                User user = this.f62889b.f62877f;
                if (user != null) {
                    user.setHasStory(true);
                }
                User user2 = this.f62889b.f62877f;
                if (user2 != null) {
                    user2.setHasUnreadStory(true);
                }
                n nVar = this.f62889b.j;
                if (nVar != null) {
                    nVar.b(false, true, true);
                }
                this.f62889b.a(false);
                ImageView imageView = this.f62889b.l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                User user3 = this.f62889b.f62877f;
                if (user3 != null) {
                    user3.setHasUnreadStory(true);
                }
                this.f62889b.m.setHeadStatus(2);
            } else if (num != null && num.intValue() == 3) {
                this.f62889b.b(false);
                this.f62889b.c();
                this.f62889b.h = true;
            } else {
                if (num != null && num.intValue() == 1) {
                    if (this.f62889b.f62876e == null) {
                        this.f62889b.i();
                    }
                } else if (num != null && num.intValue() == 5) {
                    this.f62889b.f62876e = null;
                    this.f62889b.h = false;
                    ImageView imageView2 = this.f62889b.l;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    User user4 = this.f62889b.f62877f;
                    if (user4 != null) {
                        bool = user4.isHasUnreadStory();
                    }
                    if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                        this.f62889b.m.setHeadStatus(2);
                        return;
                    }
                    this.f62889b.m.setHeadStatus(0);
                }
            }
        }
    }

    public final int b() {
        return this.f62875d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62872a, false, 69643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62872a, false, 69643, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.api.b.d> b2 = ((i) ServiceManager.get().getService(i.class)).b();
            Observer<com.ss.android.ugc.aweme.story.api.b.d> observer = this.o;
            if (observer == null) {
                Intrinsics.throwNpe();
            }
            b2.removeObserver(observer);
        }
        com.ss.android.ugc.aweme.story.api.b.a aVar = this.f62874c;
        if (aVar != null) {
            aVar.a((a.C0747a) null);
        }
        this.j = null;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f62872a, false, 69642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62872a, false, 69642, new Class[0], Void.TYPE);
            return;
        }
        this.s.setVisibility(0);
        this.s.a(this.i.getResources().getColor(C0906R.color.ho), this.i.getResources().getColor(C0906R.color.ho));
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final void i() {
        com.ss.android.ugc.aweme.story.api.model.b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f62872a, false, 69644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62872a, false, 69644, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f62872a, false, 69635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62872a, false, 69635, new Class[0], Void.TYPE);
        } else {
            Object service = ServiceManager.get().getService(IUserService.class);
            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…IUserService::class.java)");
            User currentUser = ((IUserService) service).getCurrentUser();
            if (PatchProxy.isSupport(new Object[]{currentUser}, this, f62872a, false, 69645, new Class[]{User.class}, com.ss.android.ugc.aweme.story.api.model.b.class)) {
                bVar = (com.ss.android.ugc.aweme.story.api.model.b) PatchProxy.accessDispatch(new Object[]{currentUser}, this, f62872a, false, 69645, new Class[]{User.class}, com.ss.android.ugc.aweme.story.api.model.b.class);
            } else {
                bVar = new com.ss.android.ugc.aweme.story.api.model.b();
                bVar.setRead(false);
                LifeStory lifeStory = new LifeStory();
                lifeStory.setAuthor(currentUser);
                lifeStory.setAwemeType(10000);
                bVar.setLifeStory(lifeStory);
            }
            this.f62876e = bVar;
            this.m.setHeadStatus(4);
        }
        n nVar = this.j;
        if (nVar != null) {
            nVar.b(false, true, true);
        }
        a(false);
        a(false, true);
    }

    public final void a(int i2) {
        this.f62875d = i2;
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62872a, false, 69638, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62872a, false, 69638, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.t.cancelAnimation();
        this.t.setVisibility(8);
        this.u.cancelAnimation();
        this.u.setVisibility(8);
        a(z);
    }

    public final void a(@NotNull User user) {
        MutableLiveData<j> mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{user}, this, f62872a, false, 69641, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f62872a, false, 69641, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        this.f62877f = user;
        if (ex.g(this.f62877f)) {
            IAVStoryService iAVStoryService = (IAVStoryService) ServiceManager.get().getService(IAVStoryService.class);
            if (iAVStoryService != null) {
                mutableLiveData = iAVStoryService.getPublishState();
            } else {
                mutableLiveData = null;
            }
            if (mutableLiveData != null) {
                mutableLiveData.observe(this.r, this.g);
            }
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.story.api.model.f fVar) {
        boolean z;
        a.d dVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f62872a, false, 69636, new Class[]{com.ss.android.ugc.aweme.story.api.model.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f62872a, false, 69636, new Class[]{com.ss.android.ugc.aweme.story.api.model.f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar, "params");
        h hVar = this.f62873b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStoryRingService");
        }
        if (hVar != null) {
            if (this.f62874c != null) {
                com.ss.android.ugc.aweme.story.api.b.a aVar = this.f62874c;
                if (aVar != null) {
                    dVar = aVar.a();
                } else {
                    dVar = null;
                }
                if (dVar == a.d.IN_PROGRESS) {
                    return;
                }
            }
            this.p.removeCallbacks(this.q);
            h hVar2 = this.f62873b;
            if (hVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStoryRingService");
            }
            this.f62874c = hVar2.a(this.i, fVar, this.k, new d(this));
            if (ex.g(this.f62877f)) {
                com.ss.android.ugc.aweme.story.api.b.a aVar2 = this.f62874c;
                if (aVar2 != null) {
                    aVar2.a((a.C0747a) new e(this));
                }
            }
            com.ss.android.ugc.aweme.story.api.b.a aVar3 = this.f62874c;
            if (aVar3 != null) {
                if (b() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                aVar3.a(z);
            }
            com.ss.android.ugc.aweme.story.api.b.a aVar4 = this.f62874c;
            if (aVar4 != null) {
                aVar4.b();
            }
            if (b() == 3) {
                z2 = true;
            }
            a(z2, true);
            this.p.postDelayed(this.q, 6000);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62872a, false, 69640, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62872a, false, 69640, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.h) {
            c();
        } else {
            this.s.setVisibility(0);
            if (z) {
                this.s.setColor(Color.parseColor("#cfcfcf"));
                this.s.setStrokeWidth((int) UIUtils.dip2Px(this.i, 1.0f));
                return;
            }
            this.s.a(Color.parseColor("#10dff9"), Color.parseColor("#0bb8f0"));
            this.s.setStrokeWidth((int) UIUtils.dip2Px(this.i, 2.0f));
        }
    }

    private void a(boolean z, boolean z2) {
        AnimationImageView animationImageView;
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f62872a, false, 69639, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f62872a, false, 69639, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            animationImageView = this.t;
        } else {
            animationImageView = this.u;
        }
        if (animationImageView.isAnimating()) {
            animationImageView.cancelAnimation();
        }
        if (this.h) {
            str = "story_upload_fail_lottie.json";
        } else if (z) {
            str = "story_profile_loading_readed_lottie.json";
        } else {
            str = "story_profile_loading_unread_lottie.json";
        }
        animationImageView.setAnimation(str);
        animationImageView.playAnimation();
        animationImageView.loop(z2);
        animationImageView.setVisibility(0);
        if (!z2) {
            animationImageView.addAnimatorListener(new f(animationImageView));
        }
        this.s.setVisibility(8);
    }

    public aw(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner, @Nullable n nVar, @NotNull AvatarWithBorderView avatarWithBorderView, @NotNull StoryCircleView storyCircleView, @NotNull AnimationImageView animationImageView, @NotNull AnimationImageView animationImageView2, @Nullable ImageView imageView, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "mLifecycleOwner");
        Intrinsics.checkParameterIsNotNull(avatarWithBorderView, "mHeaderImage");
        Intrinsics.checkParameterIsNotNull(storyCircleView, "mStoryCircleView");
        Intrinsics.checkParameterIsNotNull(animationImageView, "mAvatarLoadingViewRead");
        Intrinsics.checkParameterIsNotNull(animationImageView2, "mAvatarLoadingViewUnRead");
        Intrinsics.checkParameterIsNotNull(aVar, "absCommonHeaderLayout");
        this.i = context;
        this.r = lifecycleOwner;
        this.j = nVar;
        this.k = avatarWithBorderView;
        this.s = storyCircleView;
        this.t = animationImageView;
        this.u = animationImageView2;
        this.l = imageView;
        this.m = aVar;
        if (!com.ss.android.g.a.a()) {
            Object service = ServiceManager.get().getService(h.class);
            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…yRingService::class.java)");
            this.f62873b = (h) service;
            if (PatchProxy.isSupport(new Object[0], this, f62872a, false, 69634, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f62872a, false, 69634, new Class[0], Void.TYPE);
            } else {
                if (this.o == null) {
                    this.o = new c(this);
                }
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.api.b.d> b2 = ((i) ServiceManager.get().getService(i.class)).b();
                LifecycleOwner lifecycleOwner2 = this.r;
                Observer<com.ss.android.ugc.aweme.story.api.b.d> observer = this.o;
                if (observer == null) {
                    Intrinsics.throwNpe();
                }
                b2.observe(lifecycleOwner2, observer);
            }
        }
        this.p = new Handler(Looper.getMainLooper());
        this.q = new b(this);
        this.g = new g(this);
    }
}
