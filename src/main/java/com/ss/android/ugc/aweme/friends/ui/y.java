package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.c.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/FollowFeedRecommendHeadUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49480a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int f49481b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static String f49482c = "";

    /* renamed from: d  reason: collision with root package name */
    public static final a f49483d = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/FollowFeedRecommendHeadUtils$Companion;", "", "()V", "CODE_GET_CONTACTS_PERMISSION", "", "getCODE_GET_CONTACTS_PERMISSION", "()I", "mEnterFrom", "", "addFriendsMob", "", "type", "checkContactPermission", "", "activity", "Landroid/app/Activity;", "createFollowFeedEmptyHeadView", "Landroid/widget/LinearLayout;", "mTabType", "addFriendView", "Lcom/ss/android/ugc/aweme/profile/IThirdPartyView;", "createThirdPartyAddFriendView", "Lcom/ss/android/ugc/aweme/friends/ui/ThirdPartyAddFriendView;", "mobClickQQWechat", "platform", "enterFrom", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49484a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.friends.ui.y$a$a  reason: collision with other inner class name */
        public static final class C0587a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49485a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f49486b;

            public C0587a(Activity activity) {
                this.f49486b = activity;
            }

            public final void onClick(View view) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f49485a, false, 47282, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49485a, false, 47282, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                a aVar = y.f49483d;
                if (PatchProxy.isSupport(new Object[]{"mobile_contact"}, aVar, a.f49484a, false, 47280, new Class[]{String.class}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{"mobile_contact"}, aVar2, a.f49484a, false, 47280, new Class[]{String.class}, Void.TYPE);
                } else {
                    r.a("add_profile_friends", (Map) d.a().a("enter_from", "find_friends").a("account_type", "mobile_contact").f34114b);
                }
                a aVar3 = y.f49483d;
                Activity activity = this.f49486b;
                if (PatchProxy.isSupport(new Object[]{activity}, aVar3, a.f49484a, false, 47279, new Class[]{Activity.class}, Boolean.TYPE)) {
                    a aVar4 = aVar3;
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, aVar4, a.f49484a, false, 47279, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
                } else if (ContextCompat.checkSelfPermission(activity, "android.permission.READ_CONTACTS") != 0) {
                    ActivityCompat.requestPermissions(activity, new String[]{"android.permission.READ_CONTACTS"}, y.f49481b);
                    z = false;
                }
                if (z) {
                    this.f49486b.startActivity(ContactsActivity.a((Context) this.f49486b, y.f49482c, false));
                } else {
                    UIUtils.displayToast((Context) this.f49486b, (int) C0906R.string.eh);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        public static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49487a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f49488b;

            public b(Activity activity) {
                this.f49488b = activity;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49487a, false, 47283, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49487a, false, 47283, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    com.ss.android.ugc.aweme.share.invitefriends.b.a(0, this.f49488b, y.f49482c);
                    a aVar = y.f49483d;
                    String a2 = i.a(0);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "ShareRequestHelper.getPl…t.REQUEST_CHANNEL_WECHAT)");
                    aVar.a(a2, y.f49482c);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        public static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49489a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f49490b;

            public c(Activity activity) {
                this.f49490b = activity;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49489a, false, 47284, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49489a, false, 47284, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    com.ss.android.ugc.aweme.share.invitefriends.b.a(1, this.f49490b, y.f49482c);
                    a aVar = y.f49483d;
                    String a2 = i.a(1);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "ShareRequestHelper.getPl…quest.REQUEST_CHANNEL_QQ)");
                    aVar.a(a2, y.f49482c);
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f49484a, false, 47281, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f49484a, false, 47281, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            r.a("add_profile_friends", (Map) new d().a("enter_from", str4).a("account_type", str3).f34114b);
        }
    }
}
