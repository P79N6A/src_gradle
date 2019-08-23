package com.ss.android.ugc.aweme.main.guide;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.c;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#J\u001a\u0010$\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/FollowTabBubbleGuideHelper;", "", "()V", "firstQuery", "", "lastFollowUid", "", "getLastFollowUid", "()Ljava/lang/String;", "lastShowTime", "", "getLastShowTime", "()J", "setLastShowTime", "(J)V", "mFollowTabBubbleGuideView", "Lcom/ss/android/ugc/aweme/main/FollowTabBubbleGuideView;", "shouldShowWhenBackMainPage", "getShouldShowWhenBackMainPage", "()Z", "setShouldShowWhenBackMainPage", "(Z)V", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setUser", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "showGuide", "", "fragment", "Lcom/ss/android/ugc/aweme/main/MainPageFragment;", "followTab", "Lcom/ss/android/ugc/aweme/main/base/MainTab;", "delay", "", "showGuideWhenBackMainPage", "Companion", "Holder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54808a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f54809f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.main.c f54810b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public User f54811c;

    /* renamed from: d  reason: collision with root package name */
    public long f54812d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f54813e;
    private boolean g = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/FollowTabBubbleGuideHelper$Companion;", "", "()V", "GUIDE_SHOW_GAP_TIME", "", "instance", "Lcom/ss/android/ugc/aweme/main/guide/FollowTabBubbleGuideHelper;", "getInstance", "()Lcom/ss/android/ugc/aweme/main/guide/FollowTabBubbleGuideHelper;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54814a;

        private a() {
        }

        @NotNull
        public final b a() {
            if (!PatchProxy.isSupport(new Object[0], this, f54814a, false, 58062, new Class[0], b.class)) {
                return C0632b.a();
            }
            return (b) PatchProxy.accessDispatch(new Object[0], this, f54814a, false, 58062, new Class[0], b.class);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/FollowTabBubbleGuideHelper$Holder;", "", "()V", "mInstance", "Lcom/ss/android/ugc/aweme/main/guide/FollowTabBubbleGuideHelper;", "getMInstance", "()Lcom/ss/android/ugc/aweme/main/guide/FollowTabBubbleGuideHelper;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.main.guide.b$b  reason: collision with other inner class name */
    static final class C0632b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0632b f54815a = new C0632b();
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private static final b f54816b = new b();

        private C0632b() {
        }

        @NotNull
        public static b a() {
            return f54816b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f54818b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.main.base.b f54819c;

        c(b bVar, com.ss.android.ugc.aweme.main.base.b bVar2) {
            this.f54818b = bVar;
            this.f54819c = bVar2;
        }

        public final void run() {
            boolean z;
            UrlModel urlModel;
            if (PatchProxy.isSupport(new Object[0], this, f54817a, false, 58063, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54817a, false, 58063, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.main.c cVar = this.f54818b.f54810b;
            if (cVar != null) {
                View view = this.f54819c;
                if (PatchProxy.isSupport(new Object[]{view}, cVar, com.ss.android.ugc.aweme.main.c.f54669a, false, 57044, new Class[]{View.class}, Boolean.TYPE)) {
                    com.ss.android.ugc.aweme.main.c cVar2 = cVar;
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, cVar2, com.ss.android.ugc.aweme.main.c.f54669a, false, 57044, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(view, "tabView");
                    if (PatchProxy.isSupport(new Object[]{view}, cVar, com.ss.android.ugc.aweme.main.c.f54669a, false, 57043, new Class[]{View.class}, Boolean.TYPE)) {
                        com.ss.android.ugc.aweme.main.c cVar3 = cVar;
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, cVar3, com.ss.android.ugc.aweme.main.c.f54669a, false, 57043, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    } else if (view == null || cVar.isShowing() || (((view instanceof com.ss.android.ugc.aweme.main.base.tab.a) && ((com.ss.android.ugc.aweme.main.base.tab.a) view).h) || com.ss.android.ugc.aweme.aj.b.b().b((Context) k.a(), "follow_tab_bubble_guide_time_shown", 0) >= com.ss.android.ugc.aweme.aj.b.b().b((Context) k.a(), "follow_tab_bubble_guide_time", 0))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        cVar.dismiss();
                    } else {
                        String b2 = com.ss.android.ugc.aweme.aj.b.b().b((Context) k.a(), "follow_tab_bubble_guide_word", cVar.g.getString(C0906R.string.afv));
                        TextView textView = cVar.f54670b;
                        if (textView != null) {
                            textView.setText(b2);
                        }
                        RemoteImageView remoteImageView = cVar.f54671c;
                        User user = b.f54809f.a().f54811c;
                        if (user != null) {
                            urlModel = user.getAvatarThumb();
                        } else {
                            urlModel = null;
                        }
                        com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel);
                        if (!cVar.isShowing() && !cVar.g.isFinishing()) {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            View contentView = cVar.getContentView();
                            if (contentView != null) {
                                contentView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                                contentView.measure(0, 0);
                                int measuredWidth = contentView.getMeasuredWidth();
                                int measuredHeight = contentView.getMeasuredHeight() + ((int) UIUtils.dip2Px(view.getContext(), 1.0f));
                                contentView.setVisibility(4);
                                cVar.f54673e = (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2);
                                cVar.f54674f = iArr[1] - measuredHeight;
                                cVar.showAtLocation(view, 0, cVar.f54673e, cVar.f54674f);
                                contentView.post(new c.h(cVar, contentView, view));
                                if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.main.c.f54669a, false, 57045, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.main.c.f54669a, false, 57045, new Class[0], Void.TYPE);
                                } else {
                                    int b3 = com.ss.android.ugc.aweme.aj.b.b().b((Context) k.a(), "follow_tab_bubble_guide_time_shown", 0) + 1;
                                    com.ss.android.ugc.aweme.aj.b.b().a((Context) k.a(), "follow_tab_bubble_guide_time_shown", b3);
                                    r.a("homepage_social_bubble", (Map) new d().a("notice_type", "message_bubble").a("action_type", "show").a("show_cnt", b3).f34114b);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Nullable
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f54808a, false, 58059, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f54808a, false, 58059, new Class[0], String.class);
        } else if (!this.g) {
            return "";
        } else {
            this.g = false;
            if (System.currentTimeMillis() - this.f54812d >= 60000) {
                return "";
            }
            User user = this.f54811c;
            if (user != null) {
                return user.getUid();
            }
            return null;
        }
    }

    public final void a(@Nullable MainPageFragment mainPageFragment, @Nullable com.ss.android.ugc.aweme.main.base.b bVar, int i) {
        com.ss.android.ugc.aweme.main.base.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{mainPageFragment, bVar2, Integer.valueOf(i)}, this, f54808a, false, 58060, new Class[]{MainPageFragment.class, com.ss.android.ugc.aweme.main.base.b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mainPageFragment, bVar2, Integer.valueOf(i)}, this, f54808a, false, 58060, new Class[]{MainPageFragment.class, com.ss.android.ugc.aweme.main.base.b.class, Integer.TYPE}, Void.TYPE);
        } else if (mainPageFragment != null && mainPageFragment.isViewValid() && bVar2 != null) {
            if (this.f54810b == null && mainPageFragment.getActivity() != null) {
                FragmentActivity activity = mainPageFragment.getActivity();
                if (activity != null) {
                    this.f54810b = new com.ss.android.ugc.aweme.main.c(activity);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            try {
                bVar.postDelayed(new c(this, bVar), (long) i);
            } catch (Exception unused) {
            }
        }
    }
}
