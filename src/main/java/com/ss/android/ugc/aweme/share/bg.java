package com.ss.android.ugc.aweme.share;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgBubble;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00103\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u00104\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u00106\u001a\u00020&2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u00107\u001a\u000205H\u0002J\u0006\u00108\u001a\u000205J\u0006\u00109\u001a\u000205R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/share/NinePatchIconBubbleManager;", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "setting", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UgAwemeActivitySetting;", "anchor", "Landroid/view/View;", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UgAwemeActivitySetting;Landroid/view/View;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "getAnchor", "()Landroid/view/View;", "bubbleText", "", "getBubbleText", "()Ljava/lang/String;", "setBubbleText", "(Ljava/lang/String;)V", "dismissDelay", "", "getDismissDelay", "()I", "setDismissDelay", "(I)V", "fissionPopup", "Lcom/ss/android/ugc/aweme/main/bubble/NinePatchIconBubble;", "getFissionPopup", "()Lcom/ss/android/ugc/aweme/main/bubble/NinePatchIconBubble;", "setFissionPopup", "(Lcom/ss/android/ugc/aweme/main/bubble/NinePatchIconBubble;)V", "imageUrl", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UrlModel;", "getImageUrl", "()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UrlModel;", "setImageUrl", "(Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UrlModel;)V", "privacyPolicyDialogShowed", "", "getPrivacyPolicyDialogShowed", "()Z", "setPrivacyPolicyDialogShowed", "(Z)V", "getSetting", "()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UgAwemeActivitySetting;", "stateViewModel", "Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;", "getStateViewModel", "()Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;", "setStateViewModel", "(Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;)V", "judgePopupFromSetting", "observeFeedPanelState", "", "shouldShowFissionPopupWindow", "showFissionPopupWindow", "tryDismissPopup", "tryShowPopup", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64763a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public FeedPanelStateViewModel f64764b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f64765c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public UrlModel f64766d;

    /* renamed from: e  reason: collision with root package name */
    public int f64767e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.main.a.c f64768f;
    public boolean g;
    @NotNull
    public final FragmentActivity h;
    @Nullable
    public final UgAwemeActivitySetting i;
    @NotNull
    public final View j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aBoolean", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bg f64770b;

        a(bg bgVar) {
            this.f64770b = bgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f64769a, false, 73117, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f64769a, false, 73117, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null && bool.booleanValue()) {
                this.f64770b.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aBoolean", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bg f64772b;

        b(bg bgVar) {
            this.f64772b = bgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f64771a, false, 73118, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f64771a, false, 73118, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null && bool.booleanValue()) {
                this.f64772b.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aBoolean", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bg f64774b;

        c(bg bgVar) {
            this.f64774b = bgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f64773a, false, 73119, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f64773a, false, 73119, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null && bool.booleanValue()) {
                this.f64774b.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aBoolean", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bg f64776b;

        d(bg bgVar) {
            this.f64776b = bgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f64775a, false, 73120, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f64775a, false, 73120, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null && bool.booleanValue()) {
                this.f64776b.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "ppds", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bg f64778b;

        e(bg bgVar) {
            this.f64778b = bgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f64777a, false, 73121, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f64777a, false, 73121, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null && bool.booleanValue()) {
                this.f64778b.g = true;
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64763a, false, 73112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64763a, false, 73112, new Class[0], Void.TYPE);
            return;
        }
        if (this.f64768f != null) {
            com.ss.android.ugc.aweme.main.a.c cVar = this.f64768f;
            if (cVar != null) {
                cVar.dismiss();
            }
        }
    }

    private final boolean b(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (PatchProxy.isSupport(new Object[]{ugAwemeActivitySetting}, this, f64763a, false, 73114, new Class[]{UgAwemeActivitySetting.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{ugAwemeActivitySetting}, this, f64763a, false, 73114, new Class[]{UgAwemeActivitySetting.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            UgProfileTabGuide profileTabGuide = ugAwemeActivitySetting.getProfileTabGuide();
            Intrinsics.checkExpressionValueIsNotNull(profileTabGuide, "profileTabGuide");
            UgBubble bubble = profileTabGuide.getBubble();
            Intrinsics.checkExpressionValueIsNotNull(bubble, "profileTabGuide.bubble");
            this.f64765c = bubble.getText();
            if (!TextUtils.isEmpty(this.f64765c)) {
                return true;
            }
            return false;
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    public final boolean a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{ugAwemeActivitySetting}, this, f64763a, false, 73115, new Class[]{UgAwemeActivitySetting.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{ugAwemeActivitySetting}, this, f64763a, false, 73115, new Class[]{UgAwemeActivitySetting.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f64768f != null) {
            return false;
        } else {
            Boolean bool = (Boolean) this.f64764b.f65311b.getValue();
            Boolean bool2 = (Boolean) this.f64764b.f65312c.getValue();
            Boolean bool3 = (Boolean) this.f64764b.f65313d.getValue();
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                return false;
            }
            if ((bool3 != null && bool3.booleanValue()) || this.g || this.h == null || ugAwemeActivitySetting == null || !b(ugAwemeActivitySetting)) {
                return false;
            }
            com.ss.android.ugc.aweme.main.guide.a a2 = com.ss.android.ugc.aweme.main.guide.a.h.a();
            Context context = this.h;
            if (PatchProxy.isSupport(new Object[]{context}, a2, com.ss.android.ugc.aweme.main.guide.a.f54799a, false, 58051, new Class[]{Context.class}, Boolean.TYPE)) {
                com.ss.android.ugc.aweme.main.guide.a aVar = a2;
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, aVar, com.ss.android.ugc.aweme.main.guide.a.f54799a, false, 58051, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                Intrinsics.checkParameterIsNotNull(context, "context");
                z = a2.a(context).getBoolean(com.ss.android.ugc.aweme.main.guide.a.g, false);
            }
            if (z || ((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(this.h, bm.class)).x(false)) {
                return false;
            }
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    return false;
                }
                Boolean a3 = z.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "Feed0VVManager.isFirstInstallAndFirstLaunch()");
                if (a3.booleanValue()) {
                    return false;
                }
                UgProfileTabGuide profileTabGuide = ugAwemeActivitySetting.getProfileTabGuide();
                Intrinsics.checkExpressionValueIsNotNull(profileTabGuide, "profileTabGuide");
                UgBubble bubble = profileTabGuide.getBubble();
                Intrinsics.checkExpressionValueIsNotNull(bubble, "profileTabGuide.bubble");
                String text = bubble.getText();
                if (TextUtils.isEmpty(text)) {
                    return false;
                }
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                if (!(b2.a() instanceof MainActivity)) {
                    return false;
                }
                this.f64765c = text;
                try {
                    UgProfileTabGuide profileTabGuide2 = ugAwemeActivitySetting.getProfileTabGuide();
                    Intrinsics.checkExpressionValueIsNotNull(profileTabGuide2, "setting.profileTabGuide");
                    UgBubble bubble2 = profileTabGuide2.getBubble();
                    Intrinsics.checkExpressionValueIsNotNull(bubble2, "setting.profileTabGuide.bubble");
                    this.f64766d = bubble2.getResourceUrl();
                } catch (Exception unused) {
                }
                return true;
            } catch (com.bytedance.ies.a unused2) {
                return false;
            }
        }
    }

    public bg(@NotNull FragmentActivity fragmentActivity, @Nullable UgAwemeActivitySetting ugAwemeActivitySetting, @NotNull View view) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        this.h = fragmentActivity;
        this.i = ugAwemeActivitySetting;
        this.j = view;
        ViewModel viewModel = ViewModelProviders.of(this.h).get(FeedPanelStateViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f64764b = (FeedPanelStateViewModel) viewModel;
        FragmentActivity fragmentActivity2 = this.h;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f64763a, false, 73113, new Class[]{FragmentActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f64763a, false, 73113, new Class[]{FragmentActivity.class}, Void.TYPE);
        } else {
            FeedPanelStateViewModel feedPanelStateViewModel = this.f64764b;
            MutableLiveData<Boolean> mutableLiveData5 = null;
            if (feedPanelStateViewModel != null) {
                mutableLiveData = feedPanelStateViewModel.f65311b;
            } else {
                mutableLiveData = null;
            }
            LifecycleOwner lifecycleOwner = fragmentActivity2;
            mutableLiveData.observe(lifecycleOwner, new a(this));
            FeedPanelStateViewModel feedPanelStateViewModel2 = this.f64764b;
            if (feedPanelStateViewModel2 != null) {
                mutableLiveData2 = feedPanelStateViewModel2.f65310a;
            } else {
                mutableLiveData2 = null;
            }
            mutableLiveData2.observe(lifecycleOwner, new b(this));
            FeedPanelStateViewModel feedPanelStateViewModel3 = this.f64764b;
            if (feedPanelStateViewModel3 != null) {
                mutableLiveData3 = feedPanelStateViewModel3.f65312c;
            } else {
                mutableLiveData3 = null;
            }
            mutableLiveData3.observe(lifecycleOwner, new c(this));
            FeedPanelStateViewModel feedPanelStateViewModel4 = this.f64764b;
            if (feedPanelStateViewModel4 != null) {
                mutableLiveData4 = feedPanelStateViewModel4.f65313d;
            } else {
                mutableLiveData4 = null;
            }
            mutableLiveData4.observe(lifecycleOwner, new d(this));
            FeedPanelStateViewModel feedPanelStateViewModel5 = this.f64764b;
            (feedPanelStateViewModel5 != null ? feedPanelStateViewModel5.f65314e : mutableLiveData5).observe(lifecycleOwner, new e(this));
        }
        this.f64765c = "";
        this.f64767e = 5000;
    }
}
