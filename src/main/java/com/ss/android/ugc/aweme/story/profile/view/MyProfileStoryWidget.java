package com.ss.android.ugc.aweme.story.profile.view;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.profile.model.c;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J,\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\u0012\u0010#\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010$\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\u000eH\u0016J\u0012\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0012\u0010,\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/LifecycleOwnerWidget;", "()V", "flNoStory", "Landroid/view/View;", "ivFirst", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "ivFirstContainer", "rlHasStory", "tvAllStoryCount", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "addStory", "", "bindCovers", "cover1", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "cover2", "cover3", "bindView", "getLayoutId", "", "initData", "initDataCenter", "initUser", "initView", "view", "observeCovers", "observeDeleteCovers", "observeDetailReturn", "observeStoryAddDelete", "observeStoryCount", "observeStoryPublish", "observeTempStory", "onBindView", "onClickAllStory", "onCreate", "onDetailReturn", "event", "Lcom/ss/android/ugc/aweme/story/detail/event/LifeFeedDetailEvent;", "onLogout", "kvData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "onRefreshUser", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MyProfileStoryWidget extends LifecycleOwnerWidget {
    public static ChangeQuickRedirect k;
    public DmtTextView l;
    public View m;
    public View n;
    public User o;
    private AnimatedImageView p;
    private View q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$initDataCenter$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "onChanged", "", "kvData", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73345b;

        a(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73345b = myProfileStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f73344a, false, 84986, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f73344a, false, 84986, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
                return;
            }
            MyProfileStoryWidget myProfileStoryWidget = this.f73345b;
            if (PatchProxy.isSupport(new Object[]{aVar}, myProfileStoryWidget, MyProfileStoryWidget.k, false, 84969, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
                MyProfileStoryWidget myProfileStoryWidget2 = myProfileStoryWidget;
                PatchProxy.accessDispatch(new Object[]{aVar}, myProfileStoryWidget2, MyProfileStoryWidget.k, false, 84969, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null && TextUtils.equals(aVar.f34376a, com.ss.android.ugc.aweme.profile.j.f61548a)) {
                Object a2 = aVar.a();
                if (a2 != null) {
                    User user = (User) a2;
                    myProfileStoryWidget.a(user);
                    com.ss.android.ugc.aweme.arch.widgets.base.b a3 = com.ss.android.ugc.aweme.story.base.a.a.a().a("ALL_STORY_COUNT", Integer.TYPE);
                    Intrinsics.checkExpressionValueIsNotNull(a3, "StoryLiveDataBus.get().w…Y_COUNT, Int::class.java)");
                    a3.setValue(Integer.valueOf(user.getUserStoryCount()));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$initDataCenter$2", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "onChanged", "", "kvData", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73347b;

        b(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73347b = myProfileStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f73346a, false, 84987, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f73346a, false, 84987, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
                return;
            }
            MyProfileStoryWidget myProfileStoryWidget = this.f73347b;
            if (PatchProxy.isSupport(new Object[]{aVar}, myProfileStoryWidget, MyProfileStoryWidget.k, false, 84970, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
                MyProfileStoryWidget myProfileStoryWidget2 = myProfileStoryWidget;
                PatchProxy.accessDispatch(new Object[]{aVar}, myProfileStoryWidget2, MyProfileStoryWidget.k, false, 84970, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null && TextUtils.equals(aVar.f34376a, com.ss.android.ugc.aweme.profile.j.f61549b)) {
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.profile.model.f> a2 = com.ss.android.ugc.aweme.story.base.a.a.a().a("TEMP_STORY", com.ss.android.ugc.aweme.story.profile.model.f.class);
                Intrinsics.checkExpressionValueIsNotNull(a2, "StoryLiveDataBus.get().w…Y, TempStory::class.java)");
                a2.setValue(new com.ss.android.ugc.aweme.story.profile.model.f());
                com.ss.android.ugc.aweme.arch.widgets.base.b a3 = com.ss.android.ugc.aweme.story.base.a.a.a().a("ALL_STORY_COUNT", Integer.TYPE);
                Intrinsics.checkExpressionValueIsNotNull(a3, "StoryLiveDataBus.get().w…Y_COUNT, Int::class.java)");
                a3.setValue(0);
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.profile.model.d> a4 = com.ss.android.ugc.aweme.story.base.a.a.a().a("TEMP_STORY_COVERS", com.ss.android.ugc.aweme.story.profile.model.d.class);
                Intrinsics.checkExpressionValueIsNotNull(a4, "StoryLiveDataBus.get().w… StoryCovers::class.java)");
                a4.setValue(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73349b;

        c(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73349b = myProfileStoryWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73348a, false, 84988, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73348a, false, 84988, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f73349b.f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73350a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73351b;

        d(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73351b = myProfileStoryWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73350a, false, 84989, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73350a, false, 84989, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f73351b.e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73353b;

        e(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73353b = myProfileStoryWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73352a, false, 84990, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73352a, false, 84990, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f73353b.e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73355b;

        f(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73355b = myProfileStoryWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73354a, false, 84991, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73354a, false, 84991, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f73355b.f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$observeCovers$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/profile/model/StoryCovers;", "onChanged", "", "it", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements Observer<com.ss.android.ugc.aweme.story.profile.model.d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73356a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73357b;

        g(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73357b = myProfileStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.profile.model.d dVar = (com.ss.android.ugc.aweme.story.profile.model.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f73356a, false, 84992, new Class[]{com.ss.android.ugc.aweme.story.profile.model.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f73356a, false, 84992, new Class[]{com.ss.android.ugc.aweme.story.profile.model.d.class}, Void.TYPE);
                return;
            }
            if (dVar != null) {
                List<UrlModel> list = dVar.f73302a;
                if (list.size() == 1) {
                    MyProfileStoryWidget.a(this.f73357b, list.get(0), null, null, 6);
                } else if (list.size() == 2) {
                    MyProfileStoryWidget.a(this.f73357b, list.get(0), list.get(1), null, 4);
                } else if (list.size() >= 3) {
                    this.f73357b.a(list.get(0), list.get(1), list.get(2));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$observeDeleteCovers$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/profile/model/StoryDeleteCovers;", "onChanged", "", "covers", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements Observer<com.ss.android.ugc.aweme.story.profile.model.e> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73359b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73360a;

            /* renamed from: b  reason: collision with root package name */
            public static final a f73361b = new a();

            a() {
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f73360a, false, 84994, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f73360a, false, 84994, new Class[0], Void.TYPE);
                    return;
                }
                ((IUserService) ServiceManager.get().getService(IUserService.class)).refreshUser();
            }
        }

        h(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73359b = myProfileStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.profile.model.e eVar = (com.ss.android.ugc.aweme.story.profile.model.e) obj;
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f73358a, false, 84993, new Class[]{com.ss.android.ugc.aweme.story.profile.model.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f73358a, false, 84993, new Class[]{com.ss.android.ugc.aweme.story.profile.model.e.class}, Void.TYPE);
                return;
            }
            if (eVar != null) {
                this.f73359b.f2711f.postDelayed(a.f73361b, 2000);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$observeDetailReturn$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/detail/event/LifeFeedDetailEvent;", "onChanged", "", "event", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i implements Observer<com.ss.android.ugc.aweme.story.detail.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73363b;

        i(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73363b = myProfileStoryWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
            if (r7 == null) goto L_0x00fe;
         */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x014a  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x015e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r18
                com.ss.android.ugc.aweme.story.detail.b.a r0 = (com.ss.android.ugc.aweme.story.detail.b.a) r0
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f73362a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.detail.b.a> r3 = com.ss.android.ugc.aweme.story.detail.b.a.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 84995(0x14c03, float:1.19103E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0038
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f73362a
                r13 = 0
                r14 = 84995(0x14c03, float:1.19103E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.detail.b.a> r0 = com.ss.android.ugc.aweme.story.detail.b.a.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0038:
                r2 = r17
                com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget r3 = r2.f73363b
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget.k
                r13 = 0
                r14 = 84975(0x14bef, float:1.19075E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.detail.b.a> r4 = com.ss.android.ugc.aweme.story.detail.b.a.class
                r15[r9] = r4
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r3
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                if (r4 == 0) goto L_0x006c
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget.k
                r13 = 0
                r14 = 84975(0x14bef, float:1.19075E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.detail.b.a> r0 = com.ss.android.ugc.aweme.story.detail.b.a.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r3
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x006c:
                if (r0 == 0) goto L_0x01a5
                r4 = 3
                int r5 = r0.f72378b
                if (r4 != r5) goto L_0x01a5
                com.ss.android.ugc.aweme.story.feed.model.a r4 = r0.f72377a
                if (r4 != 0) goto L_0x0079
                goto L_0x01a5
            L_0x0079:
                com.ss.android.ugc.aweme.story.feed.model.a r4 = r0.f72377a
                java.lang.String r5 = "event.mLifeFeed"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                java.util.List r4 = r4.getUserStoryList()
                int r5 = r4.size()
                if (r5 <= 0) goto L_0x009a
                java.lang.Object r4 = r4.get(r9)
                java.lang.String r5 = "userStoryList[0]"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                com.ss.android.ugc.aweme.story.api.model.UserStory r4 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r4
                java.util.List r4 = r4.getAwemeList()
                goto L_0x00a1
            L_0x009a:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.List r4 = (java.util.List) r4
            L_0x00a1:
                com.ss.android.ugc.aweme.story.api.model.f r0 = r0.f72380d
                r5 = 0
                if (r0 == 0) goto L_0x00a9
                java.lang.String r0 = r0.uid
                goto L_0x00aa
            L_0x00a9:
                r0 = r5
            L_0x00aa:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.framework.services.ServiceManager r6 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r7 = com.ss.android.ugc.aweme.framework.services.IUserService.class
                java.lang.Object r6 = r6.getService(r7)
                com.ss.android.ugc.aweme.framework.services.IUserService r6 = (com.ss.android.ugc.aweme.framework.services.IUserService) r6
                if (r6 == 0) goto L_0x00bf
                java.lang.String r6 = r6.getCurrentUserID()
                goto L_0x00c0
            L_0x00bf:
                r6 = r5
            L_0x00c0:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r0 = android.text.TextUtils.equals(r0, r6)
                if (r0 == 0) goto L_0x01a4
                if (r4 == 0) goto L_0x00d0
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x00dc
            L_0x00d0:
                org.greenrobot.eventbus.c r0 = org.greenrobot.eventbus.c.a()
                com.ss.android.ugc.aweme.story.api.a.a r6 = new com.ss.android.ugc.aweme.story.api.a.a
                r6.<init>()
                r0.d(r6)
            L_0x00dc:
                com.ss.android.ugc.aweme.story.base.a.a r0 = com.ss.android.ugc.aweme.story.base.a.a.a()
                java.lang.String r6 = "TEMP_STORY"
                java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.f> r7 = com.ss.android.ugc.aweme.story.profile.model.f.class
                com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.a(r6, r7)
                java.lang.String r6 = "StoryLiveDataBus.get().w…Y, TempStory::class.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r6)
                java.lang.Object r0 = r0.getValue()
                com.ss.android.ugc.aweme.story.profile.model.f r0 = (com.ss.android.ugc.aweme.story.profile.model.f) r0
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                if (r0 == 0) goto L_0x00fe
                java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r7 = r0.f73304a
                if (r7 != 0) goto L_0x0102
            L_0x00fe:
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0102:
                java.util.Iterator r7 = r7.iterator()
            L_0x0106:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0173
                java.lang.Object r8 = r7.next()
                com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r8 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r8
                if (r4 == 0) goto L_0x0166
                r10 = r4
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                boolean r11 = r10 instanceof java.util.Collection
                if (r11 == 0) goto L_0x0124
                r11 = r10
                java.util.Collection r11 = (java.util.Collection) r11
                boolean r11 = r11.isEmpty()
                if (r11 != 0) goto L_0x0160
            L_0x0124:
                java.util.Iterator r10 = r10.iterator()
            L_0x0128:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x0160
                java.lang.Object r11 = r10.next()
                com.ss.android.ugc.aweme.story.api.model.b r11 = (com.ss.android.ugc.aweme.story.api.model.b) r11
                if (r11 == 0) goto L_0x0141
                com.ss.android.ugc.aweme.story.api.model.LifeStory r11 = r11.getLifeStory()
                if (r11 == 0) goto L_0x0141
                java.lang.String r11 = r11.getStoryId()
                goto L_0x0142
            L_0x0141:
                r11 = r5
            L_0x0142:
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                com.ss.android.ugc.aweme.story.api.model.b r12 = r8.getAwemeWithComment()
                if (r12 == 0) goto L_0x0155
                com.ss.android.ugc.aweme.story.api.model.LifeStory r12 = r12.getLifeStory()
                if (r12 == 0) goto L_0x0155
                java.lang.String r12 = r12.getStoryId()
                goto L_0x0156
            L_0x0155:
                r12 = r5
            L_0x0156:
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                boolean r11 = android.text.TextUtils.equals(r11, r12)
                if (r11 == 0) goto L_0x0128
                r10 = 1
                goto L_0x0161
            L_0x0160:
                r10 = 0
            L_0x0161:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                goto L_0x0167
            L_0x0166:
                r10 = r5
            L_0x0167:
                java.lang.Boolean r11 = java.lang.Boolean.FALSE
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
                if (r10 == 0) goto L_0x0106
                r6.add(r8)
                goto L_0x0106
            L_0x0173:
                if (r0 == 0) goto L_0x017f
                java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r1 = r0.f73304a
                if (r1 == 0) goto L_0x017f
                r4 = r6
                java.util.Collection r4 = (java.util.Collection) r4
                r1.removeAll(r4)
            L_0x017f:
                boolean r1 = r6.isEmpty()
                if (r1 != 0) goto L_0x0199
                com.ss.android.ugc.aweme.story.base.a.a r1 = com.ss.android.ugc.aweme.story.base.a.a.a()
                java.lang.String r4 = "TEMP_STORY"
                java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.f> r5 = com.ss.android.ugc.aweme.story.profile.model.f.class
                com.ss.android.ugc.aweme.arch.widgets.base.b r1 = r1.a(r4, r5)
                java.lang.String r4 = "StoryLiveDataBus.get().w…Y, TempStory::class.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                r1.setValue(r0)
            L_0x0199:
                android.view.View r0 = r3.f2711f
                com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget$n r1 = com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget.n.f73371b
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r3 = 2000(0x7d0, double:9.88E-321)
                r0.postDelayed(r1, r3)
            L_0x01a4:
                return
            L_0x01a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget.i.onChanged(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$observeStoryAddDelete$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/profile/model/StoryAddDeleteStatus;", "onChanged", "", "status", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j implements Observer<com.ss.android.ugc.aweme.story.profile.model.c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73364a;

        j() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.profile.model.c cVar = (com.ss.android.ugc.aweme.story.profile.model.c) obj;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f73364a, false, 84996, new Class[]{com.ss.android.ugc.aweme.story.profile.model.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f73364a, false, 84996, new Class[]{com.ss.android.ugc.aweme.story.profile.model.c.class}, Void.TYPE);
                return;
            }
            if (cVar != null) {
                com.ss.android.ugc.aweme.arch.widgets.base.b a2 = com.ss.android.ugc.aweme.story.base.a.a.a().a("ALL_STORY_COUNT", Integer.TYPE);
                Intrinsics.checkExpressionValueIsNotNull(a2, "StoryLiveDataBus.get().w…Y_COUNT, Int::class.java)");
                Integer num = (Integer) a2.getValue();
                if (num == null) {
                    num = 0;
                }
                Intrinsics.checkExpressionValueIsNotNull(num, "StoryLiveDataBus.get().w…t::class.java).value ?: 0");
                int intValue = num.intValue();
                if (cVar.f73300a == c.a.a()) {
                    intValue += cVar.f73301b;
                } else if (cVar.f73300a == c.a.b()) {
                    intValue -= cVar.f73301b;
                }
                com.ss.android.ugc.aweme.arch.widgets.base.b a3 = com.ss.android.ugc.aweme.story.base.a.a.a().a("ALL_STORY_COUNT", Integer.TYPE);
                Intrinsics.checkExpressionValueIsNotNull(a3, "StoryLiveDataBus.get().w…Y_COUNT, Int::class.java)");
                a3.setValue(Integer.valueOf(intValue));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$observeStoryCount$1", "Landroid/arch/lifecycle/Observer;", "", "onChanged", "", "count", "(Ljava/lang/Integer;)V", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class k implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73366b;

        k(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73366b = myProfileStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f73365a, false, 84997, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f73365a, false, 84997, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num != null) {
                if (num.intValue() < 0) {
                    num = 0;
                }
                if (num.intValue() > 0) {
                    View view = this.f73366b.n;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.f73366b.m;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    DmtTextView dmtTextView = this.f73366b.l;
                    if (dmtTextView != null) {
                        Context context = this.f73366b.f2709d;
                        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                        dmtTextView.setText(context.getResources().getString(C0906R.string.k8));
                    }
                    return;
                }
                View view3 = this.f73366b.n;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                View view4 = this.f73366b.m;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$observeStoryPublish$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/api/StoryPublishState;", "onChanged", "", "storyPublishState", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l implements Observer<com.ss.android.ugc.aweme.story.api.j> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73367a;

        l() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
            if (r2 != true) goto L_0x00c7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r18
                com.ss.android.ugc.aweme.story.api.j r0 = (com.ss.android.ugc.aweme.story.api.j) r0
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f73367a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.j> r3 = com.ss.android.ugc.aweme.story.api.j.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 84998(0x14c06, float:1.19108E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0038
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f73367a
                r13 = 0
                r14 = 84998(0x14c06, float:1.19108E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.j> r0 = com.ss.android.ugc.aweme.story.api.j.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0038:
                if (r0 == 0) goto L_0x0187
                r2 = 4
                int r3 = r0.f71843e
                if (r2 != r3) goto L_0x0187
                com.ss.android.ugc.aweme.story.api.model.LifeStory r2 = r0.g
                if (r2 == 0) goto L_0x0187
                com.ss.android.ugc.aweme.story.api.model.LifeStory r2 = r0.g
                r3 = 0
                if (r2 == 0) goto L_0x0051
                long r4 = r2.getAuthorUserId()
                java.lang.String r2 = java.lang.String.valueOf(r4)
                goto L_0x0052
            L_0x0051:
                r2 = r3
            L_0x0052:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r5 = com.ss.android.ugc.aweme.framework.services.IUserService.class
                java.lang.Object r4 = r4.getService(r5)
                com.ss.android.ugc.aweme.framework.services.IUserService r4 = (com.ss.android.ugc.aweme.framework.services.IUserService) r4
                if (r4 == 0) goto L_0x0067
                java.lang.String r4 = r4.getCurrentUserID()
                goto L_0x0068
            L_0x0067:
                r4 = r3
            L_0x0068:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r2 = android.text.TextUtils.equals(r2, r4)
                if (r2 == 0) goto L_0x0187
                com.ss.android.ugc.aweme.story.base.a.a r2 = com.ss.android.ugc.aweme.story.base.a.a.a()
                java.lang.String r4 = "DELETE_STORY_COVERS"
                java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.e> r5 = com.ss.android.ugc.aweme.story.profile.model.e.class
                com.ss.android.ugc.aweme.arch.widgets.base.b r2 = r2.a(r4, r5)
                java.lang.String r4 = "StoryLiveDataBus.get().w…DeleteCovers::class.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
                java.lang.Object r2 = r2.getValue()
                com.ss.android.ugc.aweme.story.profile.model.e r2 = (com.ss.android.ugc.aweme.story.profile.model.e) r2
                if (r2 == 0) goto L_0x00c7
                java.util.List<java.lang.String> r2 = r2.f73303a
                if (r2 == 0) goto L_0x00c7
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                boolean r4 = r2 instanceof java.util.Collection
                if (r4 == 0) goto L_0x009c
                r4 = r2
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x00c2
            L_0x009c:
                java.util.Iterator r2 = r2.iterator()
            L_0x00a0:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x00c2
                java.lang.Object r4 = r2.next()
                java.lang.String r4 = (java.lang.String) r4
                com.ss.android.ugc.aweme.story.api.model.LifeStory r5 = r0.g
                if (r5 == 0) goto L_0x00b5
                java.lang.String r5 = r5.getStoryId()
                goto L_0x00b6
            L_0x00b5:
                r5 = r3
            L_0x00b6:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.equals(r5, r4)
                if (r4 == 0) goto L_0x00a0
                r2 = 1
                goto L_0x00c3
            L_0x00c2:
                r2 = 0
            L_0x00c3:
                if (r2 != r1) goto L_0x00c7
                goto L_0x0187
            L_0x00c7:
                com.ss.android.ugc.aweme.story.base.a.a r2 = com.ss.android.ugc.aweme.story.base.a.a.a()
                java.lang.String r4 = "TEMP_STORY"
                java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.f> r5 = com.ss.android.ugc.aweme.story.profile.model.f.class
                com.ss.android.ugc.aweme.arch.widgets.base.b r2 = r2.a(r4, r5)
                java.lang.String r4 = "StoryLiveDataBus.get().w…Y, TempStory::class.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
                java.lang.Object r2 = r2.getValue()
                com.ss.android.ugc.aweme.story.profile.model.f r2 = (com.ss.android.ugc.aweme.story.profile.model.f) r2
                if (r2 != 0) goto L_0x00e5
                com.ss.android.ugc.aweme.story.profile.model.f r2 = new com.ss.android.ugc.aweme.story.profile.model.f
                r2.<init>()
            L_0x00e5:
                com.ss.android.ugc.aweme.story.api.model.b r4 = new com.ss.android.ugc.aweme.story.api.model.b
                r4.<init>()
                com.ss.android.ugc.aweme.story.api.model.LifeStory r0 = r0.g
                r4.setLifeStory(r0)
                com.ss.android.ugc.aweme.story.api.model.LifeStory r0 = r4.getLifeStory()
                java.lang.String r5 = "item.lifeStory"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r5)
                java.lang.String r0 = r0.getStoryId()
                if (r0 == 0) goto L_0x0187
                java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r0 = r2.f73304a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r5 = r0 instanceof java.util.Collection
                if (r5 == 0) goto L_0x010f
                r5 = r0
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x0143
            L_0x010f:
                java.util.Iterator r0 = r0.iterator()
            L_0x0113:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x0143
                java.lang.Object r5 = r0.next()
                com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r5 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r5
                com.ss.android.ugc.aweme.story.api.model.b r5 = r5.getAwemeWithComment()
                if (r5 == 0) goto L_0x012a
                java.lang.String r5 = r5.getStoryId()
                goto L_0x012b
            L_0x012a:
                r5 = r3
            L_0x012b:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                com.ss.android.ugc.aweme.story.api.model.LifeStory r6 = r4.getLifeStory()
                java.lang.String r7 = "item.lifeStory"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)
                java.lang.String r6 = r6.getStoryId()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r5 = android.text.TextUtils.equals(r5, r6)
                if (r5 == 0) goto L_0x0113
                r9 = 1
            L_0x0143:
                if (r9 != 0) goto L_0x0187
                java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r0 = r2.f73304a
                com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r3 = new com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem
                long r5 = java.lang.System.currentTimeMillis()
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r7
                r3.<init>(r5, r4)
                r0.add(r3)
                com.ss.android.ugc.aweme.story.base.a.a r0 = com.ss.android.ugc.aweme.story.base.a.a.a()
                java.lang.String r3 = "TEMP_STORY"
                java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.f> r4 = com.ss.android.ugc.aweme.story.profile.model.f.class
                com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.a(r3, r4)
                java.lang.String r3 = "StoryLiveDataBus.get().w…Y, TempStory::class.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                r0.setValue(r2)
                com.ss.android.ugc.aweme.story.base.a.a r0 = com.ss.android.ugc.aweme.story.base.a.a.a()
                java.lang.String r2 = "STORY_ADD_DELETE_STATUS"
                java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.c> r3 = com.ss.android.ugc.aweme.story.profile.model.c.class
                com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.a(r2, r3)
                java.lang.String r2 = "StoryLiveDataBus.get().w…DeleteStatus::class.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                com.ss.android.ugc.aweme.story.profile.model.c r2 = new com.ss.android.ugc.aweme.story.profile.model.c
                int r3 = com.ss.android.ugc.aweme.story.profile.model.c.a.a()
                r2.<init>(r3, r1)
                r0.setValue(r2)
            L_0x0187:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget.l.onChanged(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/MyProfileStoryWidget$observeTempStory$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/profile/model/TempStory;", "onChanged", "", "t", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class m implements Observer<com.ss.android.ugc.aweme.story.profile.model.f> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyProfileStoryWidget f73369b;

        m(MyProfileStoryWidget myProfileStoryWidget) {
            this.f73369b = myProfileStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.profile.model.f fVar = (com.ss.android.ugc.aweme.story.profile.model.f) obj;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, f73368a, false, 84999, new Class[]{com.ss.android.ugc.aweme.story.profile.model.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, f73368a, false, 84999, new Class[]{com.ss.android.ugc.aweme.story.profile.model.f.class}, Void.TYPE);
                return;
            }
            this.f73369b.a(this.f73369b.o);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73370a;

        /* renamed from: b  reason: collision with root package name */
        public static final n f73371b = new n();

        n() {
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73370a, false, 85000, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73370a, false, 85000, new Class[0], Void.TYPE);
                return;
            }
            ((IUserService) ServiceManager.get().getService(IUserService.class)).refreshUser();
        }
    }

    public final int b() {
        return C0906R.layout.are;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84985, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84985, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("enter_from", "personal_homepage");
        intent.putExtra("enter_method", "click_plus");
        Activity c2 = c();
        if (c2 != null) {
            ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).launchRecord(c2, intent);
        }
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84966, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84968, new Class[0], Void.TYPE);
            return;
        }
        DataCenter dataCenter = this.g;
        if (dataCenter != null) {
            dataCenter.a(com.ss.android.ugc.aweme.profile.j.f61548a, (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new a<com.ss.android.ugc.aweme.arch.widgets.base.a>(this));
        }
        DataCenter dataCenter2 = this.g;
        if (dataCenter2 != null) {
            dataCenter2.b(com.ss.android.ugc.aweme.profile.j.f61549b, (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new b<com.ss.android.ugc.aweme.arch.widgets.base.a>(this));
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84972, new Class[0], Void.TYPE);
            return;
        }
        AllStoryActivity.a aVar = AllStoryActivity.f73307c;
        Activity c2 = c();
        Intrinsics.checkExpressionValueIsNotNull(c2, PushConstants.INTENT_ACTIVITY_NAME);
        User user = this.o;
        if (PatchProxy.isSupport(new Object[]{c2, user}, aVar, AllStoryActivity.a.f73311a, false, 84911, new Class[]{Activity.class, User.class}, Void.TYPE)) {
            AllStoryActivity.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{c2, user}, aVar2, AllStoryActivity.a.f73311a, false, 84911, new Class[]{Activity.class, User.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(c2, PushConstants.INTENT_ACTIVITY_NAME);
            Intent intent = new Intent(c2, AllStoryActivity.class);
            intent.putExtra(AllStoryActivity.f73306b, user);
            c2.startActivity(intent);
        }
        r.a("enter_story_album", (Map) new com.ss.android.ugc.aweme.story.base.b.a().a("enter_from", "personal_homepage").f71925b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010c, code lost:
        if (r0 != null) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.profile.model.User r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = k
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 84983(0x14bf7, float:1.19087E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = k
            r13 = 0
            r14 = 84983(0x14bf7, float:1.19087E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            com.ss.android.ugc.aweme.story.base.a.a r1 = com.ss.android.ugc.aweme.story.base.a.a.a()
            java.lang.String r2 = "TEMP_STORY"
            java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.f> r3 = com.ss.android.ugc.aweme.story.profile.model.f.class
            com.ss.android.ugc.aweme.arch.widgets.base.b r1 = r1.a(r2, r3)
            java.lang.String r2 = "StoryLiveDataBus.get().w…Y, TempStory::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object r1 = r1.getValue()
            com.ss.android.ugc.aweme.story.profile.model.f r1 = (com.ss.android.ugc.aweme.story.profile.model.f) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            if (r1 == 0) goto L_0x0057
            java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r3 = r1.f73304a
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            if (r3 == 0) goto L_0x0106
            java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r3 = r1.f73304a
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0106
            java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r1 = r1.f73304a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        L_0x0071:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r5 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r5
            com.ss.android.ugc.aweme.story.feed.c.g$a r6 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            com.ss.android.ugc.aweme.story.api.model.b r5 = r5.getAwemeWithComment()
            boolean r5 = r6.f((com.ss.android.ugc.aweme.story.api.model.b) r5)
            if (r5 == 0) goto L_0x0071
            r3.add(r4)
            goto L_0x0071
        L_0x008e:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r4)
            r1.<init>(r4)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r3 = r3.iterator()
        L_0x00a3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00fc
            java.lang.Object r4 = r3.next()
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r4 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r4
            com.ss.android.ugc.aweme.story.api.model.b r5 = r4.getAwemeWithComment()
            if (r5 == 0) goto L_0x00db
            int r5 = r5.getAwemeType()
            r6 = 15
            if (r5 != r6) goto L_0x00db
            com.ss.android.ugc.aweme.story.api.model.b r4 = r4.getAwemeWithComment()
            if (r4 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.story.api.model.LifeStory r4 = r4.getLifeStory()
            if (r4 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.feed.model.ImageInfo r4 = r4.getImageInfo()
            if (r4 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getLabelLarge()
            if (r4 != 0) goto L_0x00f8
        L_0x00d5:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r4.<init>()
            goto L_0x00f8
        L_0x00db:
            com.ss.android.ugc.aweme.story.api.model.b r4 = r4.getAwemeWithComment()
            if (r4 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.story.api.model.LifeStory r4 = r4.getLifeStory()
            if (r4 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.getVideo()
            if (r4 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getCover()
            if (r4 != 0) goto L_0x00f8
        L_0x00f3:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r4.<init>()
        L_0x00f8:
            r1.add(r4)
            goto L_0x00a3
        L_0x00fc:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
            kotlin.collections.CollectionsKt.reverse(r2)
        L_0x0106:
            if (r18 == 0) goto L_0x010f
            java.util.List r0 = r18.getLatestStoryCover()
            if (r0 == 0) goto L_0x010f
            goto L_0x0113
        L_0x010f:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0113:
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            com.ss.android.ugc.aweme.story.base.a.a r0 = com.ss.android.ugc.aweme.story.base.a.a.a()
            java.lang.String r1 = "TEMP_STORY_COVERS"
            java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.d> r3 = com.ss.android.ugc.aweme.story.profile.model.d.class
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.a(r1, r3)
            java.lang.String r1 = "StoryLiveDataBus.get().w… StoryCovers::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.story.profile.model.d r1 = new com.ss.android.ugc.aweme.story.profile.model.d
            r1.<init>(r2)
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.MyProfileStoryWidget.a(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void a(@Nullable View view) {
        View view2;
        View view3;
        DmtTextView dmtTextView;
        AnimatedImageView animatedImageView;
        View view4;
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 84967, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 84967, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 84971, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 84971, new Class[]{View.class}, Void.TYPE);
        } else {
            if (view != null) {
                View findViewById = view.findViewById(C0906R.id.af2);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new c(this));
                }
            }
            if (view != null) {
                View findViewById2 = view.findViewById(C0906R.id.af3);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new d(this));
                }
            }
            if (view != null) {
                View findViewById3 = view.findViewById(C0906R.id.cfz);
                if (findViewById3 != null) {
                    findViewById3.setOnClickListener(new e(this));
                }
            }
            if (view != null) {
                view2 = view.findViewById(C0906R.id.cfy);
            } else {
                view2 = null;
            }
            this.n = view2;
            if (view != null) {
                view3 = view.findViewById(C0906R.id.afx);
            } else {
                view3 = null;
            }
            this.m = view3;
            if (view != null) {
                dmtTextView = (DmtTextView) view.findViewById(C0906R.id.d92);
            } else {
                dmtTextView = null;
            }
            this.l = dmtTextView;
            if (view != null) {
                animatedImageView = (AnimatedImageView) view.findViewById(C0906R.id.b1a);
            } else {
                animatedImageView = null;
            }
            this.p = animatedImageView;
            if (view != null) {
                view4 = view.findViewById(C0906R.id.b1b);
            } else {
                view4 = null;
            }
            this.q = view4;
            View view5 = this.m;
            if (view5 != null) {
                view5.setOnClickListener(new f(this));
            }
            DmtTextView dmtTextView2 = this.l;
            if (dmtTextView2 != null) {
                dmtTextView2.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20595b);
            }
            DmtTextView dmtTextView3 = this.l;
            if (dmtTextView3 != null) {
                TextPaint paint = dmtTextView3.getPaint();
                if (paint != null) {
                    paint.setFakeBoldText(true);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84973, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84978, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.story.base.a.a.a().a("STORY_ADD_DELETE_STATUS", com.ss.android.ugc.aweme.story.profile.model.c.class).observe(this, new j());
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84979, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84979, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.story.base.a.a.a().a("ALL_STORY_COUNT", Integer.TYPE).observe(this, new k(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84981, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.story.base.a.a.a().a("TEMP_STORY_COVERS", com.ss.android.ugc.aweme.story.profile.model.d.class).observe(this, new g(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84982, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.story.base.a.a.a().a("TEMP_STORY", com.ss.android.ugc.aweme.story.profile.model.f.class).observe(this, new m(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84980, new Class[0], Void.TYPE);
        } else {
            ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).getPublishState().observe(this, new l());
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84976, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.story.base.a.a.a().a("DELETE_STORY_COVERS", com.ss.android.ugc.aweme.story.profile.model.e.class).observe(this, new h(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84974, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84974, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.story.base.a.a.a().a("KEY_LIFE_FEED", com.ss.android.ugc.aweme.story.detail.b.a.class).observe(this, new i(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84977, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84977, new Class[0], Void.TYPE);
            return;
        }
        Object a2 = this.g.a(com.ss.android.ugc.aweme.profile.j.f61548a);
        if (!(a2 instanceof User)) {
            a2 = null;
        }
        this.o = (User) a2;
        a(this.o);
        if (this.o != null) {
            com.ss.android.ugc.aweme.arch.widgets.base.b a3 = com.ss.android.ugc.aweme.story.base.a.a.a().a("ALL_STORY_COUNT", Integer.TYPE);
            Intrinsics.checkExpressionValueIsNotNull(a3, "StoryLiveDataBus.get().w…Y_COUNT, Int::class.java)");
            User user = this.o;
            if (user == null) {
                Intrinsics.throwNpe();
            }
            a3.setValue(Integer.valueOf(user.getUserStoryCount()));
        }
    }

    public final void a(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        String str;
        UrlModel urlModel4 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel4, urlModel2, urlModel3}, this, k, false, 84984, new Class[]{UrlModel.class, UrlModel.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel4, urlModel2, urlModel3}, this, k, false, 84984, new Class[]{UrlModel.class, UrlModel.class, UrlModel.class}, Void.TYPE);
            return;
        }
        if (urlModel4 != null) {
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || urlList.size() != 0) {
                List<String> urlList2 = urlModel.getUrlList();
                if (urlList2 != null) {
                    str = urlList2.get(0);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    com.ss.android.ugc.aweme.base.c.b(this.p, urlModel);
                }
            }
            AnimatedImageView animatedImageView = this.p;
            if (animatedImageView != null) {
                animatedImageView.setImageResource(C0906R.color.a0k);
            }
        }
    }

    static /* synthetic */ void a(MyProfileStoryWidget myProfileStoryWidget, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, int i2) {
        if ((i2 & 1) != 0) {
            urlModel = null;
        }
        if ((i2 & 2) != 0) {
            urlModel2 = null;
        }
        myProfileStoryWidget.a(urlModel, urlModel2, null);
    }
}
