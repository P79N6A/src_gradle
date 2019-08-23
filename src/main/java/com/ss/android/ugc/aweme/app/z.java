package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.ss.android.ugc.aweme.commercialize.loft.LoftActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.share.command.CommandObserver;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.live.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u00042\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands;", "Lcom/ss/android/ugc/aweme/app/AdsCommands;", "()V", "CommerceCommand", "Companion", "CouponCommand", "FeedCommand", "ForwardDetailCommand", "FriendRecommendCommand", "FriendTabCommand", "FusionFuelSDKCommand", "HandleUrlCommand", "LiveCommand", "LoftCommand", "MicroappCommand", "NotificationDetaiCommand", "PushRNCommand", "RNCommand", "RankingListCommand", "SearchResultCommand", "ShowCaseH5Command", "UserProfileCommand2", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class z extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final b f34309d = new b((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$CommerceCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34310a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34310a, false, 22467, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34310a, false, 22467, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (!Intrinsics.areEqual((Object) str3, (Object) "goods") || TextUtils.isEmpty(str4)) {
                return false;
            }
            return true;
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34310a, false, 22468, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34310a, false, 22468, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            if (StringsKt.startsWith$default(str5, "/shop/", false, 2, null)) {
                com.ss.android.ugc.aweme.commerce.a.a(activity, uri2.getQueryParameter("uid"), uri2.getQueryParameter(c.f33976b), uri2.getQueryParameter("entrance_location"), uri2.getQueryParameter("enter_from"), uri2.getQueryParameter("enter_method"));
            } else if (StringsKt.startsWith$default(str5, "/seeding/", false, 2, null)) {
                String queryParameter = uri2.getQueryParameter("promotion_id");
                String queryParameter2 = uri2.getQueryParameter("product_id");
                String queryParameter3 = uri2.getQueryParameter("target_uid");
                String queryParameter4 = uri2.getQueryParameter("item_id");
                String queryParameter5 = uri2.getQueryParameter("source_page");
                String queryParameter6 = uri2.getQueryParameter("enter_method");
                String queryParameter7 = uri2.getQueryParameter("play_id");
                com.ss.android.ugc.aweme.commerce.a.a(activity, queryParameter, queryParameter2, queryParameter3, uri2.getQueryParameter("sec_target_uid"), queryParameter4, queryParameter5, queryParameter6, queryParameter7);
            } else if (StringsKt.startsWith$default(str5, "/ordershare/", false, 2, null)) {
                String queryParameter8 = uri2.getQueryParameter("promotion_id");
                String queryParameter9 = uri2.getQueryParameter("target_uid");
                String queryParameter10 = uri2.getQueryParameter("product_id");
                String queryParameter11 = uri2.getQueryParameter("item_id");
                String queryParameter12 = uri2.getQueryParameter("source_page");
                String queryParameter13 = uri2.getQueryParameter("enter_method");
                com.ss.android.ugc.aweme.commerce.a.a(activity, queryParameter8, queryParameter10, queryParameter9, uri2.getQueryParameter("sec_target_uid"), queryParameter11, queryParameter12, queryParameter13);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$Companion;", "", "()V", "getCommandList", "", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34311a;

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$CouponCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34312a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34312a, false, 22470, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34312a, false, 22470, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) "coupon", (Object) str3);
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34312a, false, 22471, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34312a, false, 22471, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Intent intent = null;
            if (TextUtils.isEmpty(str5)) {
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (a2.isLogin()) {
                    intent = new Intent(activity2, CouponListActivity.class);
                } else {
                    intent = new Intent(activity2, MainActivity.class);
                }
            } else if (StringsKt.startsWith$default(str5, "/detail", false, 2, null)) {
                try {
                    String queryParameter = uri2.getQueryParameter("coupon_id");
                    if (queryParameter == null) {
                        Intrinsics.throwNpe();
                    }
                    Integer valueOf = Integer.valueOf(queryParameter);
                    Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(uri.getQ…UPON_DETAIL_COUPON_ID)!!)");
                    i = valueOf.intValue();
                } catch (Exception unused) {
                }
                String queryParameter2 = uri2.getQueryParameter("code_id");
                intent = new Intent(activity2, CouponDetailActivity.class);
                intent.putExtra("coupon_id", String.valueOf(i));
                intent.putExtra("code_id", queryParameter2);
            }
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$FeedCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34313a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34313a, false, 22472, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34313a, false, 22472, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "feed");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34313a, false, 22473, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34313a, false, 22473, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            if (!TextUtils.isEmpty(str5) && StringsKt.startsWith$default(str5, "/sms_invite/", false, 2, null)) {
                String queryParameter = uri2.getQueryParameter("code");
                if (CommandObserver.b() == null) {
                    CommandObserver.a();
                }
                if (CommandObserver.a(queryParameter)) {
                    CommandObserver.b().b(queryParameter);
                }
            }
            Intent intent = new Intent(activity2, MainActivity.class);
            try {
                int parseInt = Integer.parseInt(uri2.getQueryParameter("tab"));
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    d.f34105a.a("homepage_hot", uri2, z2);
                } else if (parseInt == 2) {
                    d.f34105a.a("homepage_fresh", uri2, z2);
                }
            } catch (Exception unused) {
            }
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$ForwardDetailCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34314a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34314a, false, 22476, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34314a, false, 22476, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "repost_detail";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34314a, false, 22474, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34314a, false, 22474, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return StringsKt.startsWith$default(str3 + str4, "forward/detail/", false, 2, null);
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            String str4;
            Intent intent;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str5, str6, str7, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34314a, false, 22475, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str5, str6, str7, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34314a, false, 22475, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str5, "host");
            Intrinsics.checkParameterIsNotNull(str6, "path");
            Intrinsics.checkParameterIsNotNull(str7, "fromTokenType");
            if (!TextUtils.isEmpty(str7)) {
                str4 = str7;
            } else {
                str4 = "web";
            }
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.aD()) {
                intent = new Intent(activity2, DetailActivity.class);
                intent.putExtra("refer", str4);
                intent.putExtra("id", uri.getLastPathSegment());
                intent.putExtra("video_from", "from_forward_push");
            } else {
                intent = new Intent(activity2, ForwardDetailActivity.class);
                intent.putExtra("forward_id", uri.getLastPathSegment());
                intent.putExtra("refer", str4);
            }
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$FriendRecommendCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34315a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34315a, false, 22477, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34315a, false, 22477, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (!StringsKt.startsWith$default(str3 + str4, "im/friendRecommend", false, 2, null)) {
                if (StringsKt.startsWith$default(str3 + str4, "im/officialChat", false, 2, null)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34315a, false, 22478, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34315a, false, 22478, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            if (StringsKt.startsWith$default(str5, "/friendRecommend", false, 2, null)) {
                Intent intent = new Intent(activity2, NotificationDetailActivity.class);
                intent.putExtra("from_where", 11);
                d.f34105a.a("friend_recommend", uri2, z2);
                return intent;
            } else if (!StringsKt.startsWith$default(str5, "/officialChat", false, 2, null)) {
                return null;
            } else {
                Intent intent2 = new Intent(activity2, NotificationDetailActivity.class);
                intent2.putExtra("from_where", 5);
                intent2.putExtra("enter_from", "push");
                d.f34105a.a("official_message", uri2, z2);
                com.ss.android.ugc.aweme.common.r.a("enter_official_message", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "push").a("inner_message_type", "poi_puscene").f34114b);
                return intent2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$FriendTabCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34316a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34316a, false, 22479, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34316a, false, 22479, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) "friendtab", (Object) str3);
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            int i;
            String str4;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str5, str6, str7, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34316a, false, 22480, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str5, str6, str7, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34316a, false, 22480, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str5, "host");
            Intrinsics.checkParameterIsNotNull(str6, "path");
            Intrinsics.checkParameterIsNotNull(str7, "fromTokenType");
            String queryParameter = uri2.getQueryParameter("user_id");
            c.f33977c.a(queryParameter, uri2);
            try {
                String queryParameter2 = uri2.getQueryParameter("is_friend");
                if (queryParameter2 == null) {
                    Intrinsics.throwNpe();
                }
                Integer valueOf = Integer.valueOf(queryParameter2);
                Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(uri.getQ…Parameter(\"is_friend\")!!)");
                i = valueOf.intValue();
            } catch (Exception unused) {
                i = 1;
            }
            if (j.a().f34192c || MainPageExperimentHelper.h()) {
                Intent intent = new Intent(activity2, MainActivity.class);
                intent.putExtra("extra_story_push", true);
                if (MainPageExperimentHelper.h()) {
                    str4 = "FOLLOW";
                } else {
                    str4 = "HOME";
                }
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", str4);
                intent.putExtra("extra_story_insert_uid", queryParameter);
                intent.putExtra("extra_story_is_friend", i);
                j a2 = j.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AppLifeCircleCacheManager.getInstance()");
                a2.f34192c = false;
                return intent;
            }
            com.ss.android.ugc.aweme.story.api.model.f fVar = new com.ss.android.ugc.aweme.story.api.model.f();
            fVar.detailType = 7;
            fVar.uid = queryParameter;
            fVar.isSelf = false;
            return ((com.ss.android.ugc.aweme.story.api.i) ServiceManager.get().getService(com.ss.android.ugc.aweme.story.api.i.class)).a(activity2, fVar, (UserStory) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$FusionFuelSDKCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34317a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34317a, false, 22481, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34317a, false, 22481, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return TextUtils.equals(str3, "fusion_fuel");
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34317a, false, 22482, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34317a, false, 22482, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            com.ss.android.ugc.aweme.rocket.f.a(activity2, uri2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$HandleUrlCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34318a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34318a, false, 22483, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34318a, false, 22483, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) "notification", (Object) str3) || Intrinsics.areEqual((Object) "chat", (Object) str3)) {
                return true;
            }
            return false;
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34318a, false, 22484, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34318a, false, 22484, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            return com.ss.android.ugc.aweme.app.e.d.a().a(activity2, uri2, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$LiveCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34319a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34319a, false, 22487, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34319a, false, 22487, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "live";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34319a, false, 22485, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34319a, false, 22485, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "live");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            long j;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34319a, false, 22486, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z)}, this, f34319a, false, 22486, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            String queryParameter = uri2.getQueryParameter("userId");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = uri2.getQueryParameter("user_id");
            }
            c.f33977c.a(queryParameter, uri2);
            String queryParameter2 = uri2.getQueryParameter("liveId");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = uri2.getQueryParameter("room_id");
            }
            String queryParameter3 = uri2.getQueryParameter("from");
            if (TextUtils.isEmpty(queryParameter3)) {
                queryParameter3 = uri2.getQueryParameter("gd_label");
            }
            String queryParameter4 = uri2.getQueryParameter("tab_index");
            try {
                j = Long.parseLong(queryParameter2);
            } catch (NumberFormatException unused) {
                j = 0;
            }
            User user = new User();
            user.setUid(queryParameter);
            user.roomId = j;
            Context context = activity2;
            if (!NetworkUtils.isNetworkAvailable(context)) {
                return new Intent(context, MainActivity.class);
            }
            AwemeAppData.p().ao = true;
            if (!TextUtils.isEmpty(queryParameter)) {
                ae aeVar = new ae(context);
                aeVar.a(queryParameter3, str6, j);
                aeVar.a(queryParameter, queryParameter4);
            } else {
                CharSequence charSequence = queryParameter3;
                if (!TextUtils.equals(charSequence, f.f34167a) && !TextUtils.equals(charSequence, "jsbridge")) {
                    com.ss.android.ugc.aweme.story.live.b.a(context, 1, user.getRequestId(), user.getUid(), user.roomId);
                }
                if (!com.ss.android.g.a.a() && !TextUtils.isEmpty(str6)) {
                    com.ss.android.ugc.aweme.common.r.a("live_play", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str6).a("anchor_id", queryParameter).f34114b);
                }
                com.ss.android.ugc.aweme.story.live.c.a().a(new c.a(context, user).a(queryParameter4).b("push").a(4).c("push"));
            }
            d.f34105a.a("live", uri2, z);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$LoftCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class k extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34320a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34320a, false, 22488, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34320a, false, 22488, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return StringsKt.startsWith$default(str3 + str4, "discover/loft", false, 2, null);
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34320a, false, 22489, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34320a, false, 22489, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            String queryParameter = uri2.getQueryParameter("activity_id");
            CharSequence charSequence = queryParameter;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                LoftActivity.a(activity2, queryParameter, uri2.getQueryParameter("start_color"), uri2.getQueryParameter("end_color"), uri.toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$MicroappCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34321a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34321a, false, 22490, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34321a, false, 22490, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) "microapp", (Object) str3) || Intrinsics.areEqual((Object) "microgame", (Object) str3)) {
                return true;
            }
            return false;
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            String str;
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34321a, false, 22491, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34321a, false, 22491, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            CharSequence queryParameter = uri2.getQueryParameter("schema_from");
            if (TextUtils.equals(queryParameter, "splash")) {
                str = "025001";
            } else if (TextUtils.equals(queryParameter, "qr_code")) {
                str = "021002";
            } else if (TextUtils.equals(queryParameter, "ad_link")) {
                str = "025003";
            } else {
                str = "";
            }
            String queryParameter2 = uri2.getQueryParameter("position");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(activity2, uri.toString(), new b.a().b("schema").c(str).a(queryParameter2).e(f.f34168b).a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$NotificationDetaiCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class m extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34322a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34322a, false, 22492, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34322a, false, 22492, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return StringsKt.startsWith$default(str3 + str4, "oneday/message", false, 2, null);
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34322a, false, 22493, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34322a, false, 22493, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Intent intent = new Intent(activity2, NotificationDetailActivity.class);
            intent.putExtra("from_where", 13);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$PushRNCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class n extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34323a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34323a, false, 22494, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34323a, false, 22494, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) "push_reactnative", (Object) str3);
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34323a, false, 22495, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34323a, false, 22495, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            String uri3 = uri.toString();
            Intrinsics.checkExpressionValueIsNotNull(uri3, "uri.toString()");
            String uri4 = com.ss.android.ugc.aweme.music.util.f.a(StringsKt.replace$default(StringsKt.replace$default(uri3, "snssdk1128", "aweme", false, 4, (Object) null), "push_reactnative", f.f34167a, false, 4, (Object) null)).a().toString();
            Intrinsics.checkExpressionValueIsNotNull(uri4, "SchemeHelper.parseRnSche…ceUrl).build().toString()");
            com.ss.android.ugc.aweme.ag.h.a().a(uri4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$RNCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class o extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34324a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34324a, false, 22496, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34324a, false, 22496, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "reactnative");
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34324a, false, 22497, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34324a, false, 22497, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            String uri3 = uri.toString();
            Intrinsics.checkExpressionValueIsNotNull(uri3, "uri.toString()");
            a2.a(StringsKt.replace$default(uri3, "snssdk1128", "aweme", false, 4, (Object) null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$RankingListCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class p extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34325a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34325a, false, 22500, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34325a, false, 22500, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            String queryParameter = uri2.getQueryParameter("type");
            if (queryParameter != null) {
                if (queryParameter.length() != 0) {
                    z = false;
                }
                if (!z) {
                    switch (Integer.parseInt(queryParameter)) {
                        case 0:
                            return "hot_search_board";
                        case 1:
                            return "hot_search_video_board";
                        case 2:
                            return "music_leaderboard";
                        case 3:
                            return "politic_board";
                        case 4:
                            return "star_board";
                        default:
                            return "hot_search_board";
                    }
                }
            }
            return "hot_search_board";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34325a, false, 22498, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34325a, false, 22498, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3 + str4, (Object) "search/trending");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34325a, false, 22499, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34325a, false, 22499, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Intent intent = new Intent(activity2, RankingListActivity.class);
            String queryParameter = uri2.getQueryParameter("type");
            if (!TextUtils.isEmpty(queryParameter)) {
                intent.putExtra("type", queryParameter);
            }
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$SearchResultCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class q extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34326a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34326a, false, 22501, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34326a, false, 22501, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) str3, (Object) "search") || (StringsKt.contains$default((CharSequence) str3, (CharSequence) "hot", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str4, (CharSequence) "spot", false, 2, (Object) null))) {
                return true;
            }
            return false;
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34326a, false, 22502, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34326a, false, 22502, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            String queryParameter = uri2.getQueryParameter("keyword");
            String queryParameter2 = uri2.getQueryParameter("display_keyword");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = uri2.getQueryParameter("displayKeyword");
            }
            String queryParameter3 = uri2.getQueryParameter("from");
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            SearchResultParam searchResultParam = new SearchResultParam();
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = queryParameter;
            }
            SearchResultParam realSearchWord = searchResultParam.setKeyword(queryParameter2).setRealSearchWord(queryParameter);
            if (TextUtils.isEmpty(queryParameter3)) {
                queryParameter3 = "push";
            }
            SearchResultParam searchFrom = realSearchWord.setEnterFrom(queryParameter3).setSearchFrom(7);
            if (!TextUtils.equals(str4, "hot") || !com.ss.android.ugc.aweme.discover.helper.b.e()) {
                Intent intent = new Intent(activity2, SearchResultActivity.class);
                intent.putExtra("searchParam", searchFrom);
                return intent;
            }
            Intrinsics.checkExpressionValueIsNotNull(searchFrom, "param");
            return HotSpotDetailActivity.i.b(activity2, searchFrom);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$ShowCaseH5Command;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class r extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34327a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34327a, false, 22503, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34327a, false, 22503, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "showcaseh5");
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34327a, false, 22504, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34327a, false, 22504, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            com.ss.android.ugc.aweme.commercialize.utils.g.d((Context) activity2, uri.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/DouyinAdsCommands$UserProfileCommand2;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "scheme", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class s extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34328a;

        public final boolean a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f34328a, false, 22505, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f34328a, false, 22505, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str4, "scheme");
            Intrinsics.checkParameterIsNotNull(str5, "host");
            Intrinsics.checkParameterIsNotNull(str6, "path");
            if (e.f34155e.a(str4)) {
                if (StringsKt.startsWith$default(str5 + str6, "user/detail/", false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34328a, false, 22506, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34328a, false, 22506, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            String lastPathSegment = uri.getLastPathSegment();
            Intent intent = new Intent(activity2, UserProfileActivity.class);
            intent.putExtra("uid", lastPathSegment);
            if (!TextUtils.isEmpty(str6)) {
                intent.putExtra("enter_from", str6);
            }
            intent.putExtra("sec_user_id", c.f33977c.a(lastPathSegment, uri2));
            return intent;
        }
    }
}
