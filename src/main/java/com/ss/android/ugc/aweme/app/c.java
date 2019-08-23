package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.ui.DiscoverActivity;
import com.ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import com.ss.android.ugc.aweme.music.ui.MusicListActivity;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0016\u0018\u0000 \u00072\u00020\u0001:\u001e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u0005¢\u0006\u0002\u0010\u0002¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands;", "", "()V", "AddFriendCommand", "BindPhoneCommand", "ChallengeCommand", "Command", "Companion", "ContactsCommand", "DetailCommand", "DetailHostCommand", "DetailListCommand", "DiscoverCommand", "FeedBackInputCommand", "FeedbackRecordCommand", "FollowFeedCommand", "HotLiveCommand", "ImFansCommand", "ItemCommand", "LoginCommand", "MusicCommand", "MusicListCommand", "MyProfileCommand", "POICommand", "ProfileCommand", "ProfileEditCommand", "RecordCommand", "StickersCommand", "UserProfileCommand", "UserProfileCommand1", "VerifyCommand", "VideoDetailCommand", "WebViewCommand", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33975a = null;
    @NotNull
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final String f33976b = f33976b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f33977c = new e((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$AddFriendCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33978a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f33978a, false, 22149, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f33978a, false, 22149, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3 + str4, (Object) "user/find_friends");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f33978a, false, 22150, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f33978a, false, 22150, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            String queryParameter = uri2.getQueryParameter("inviteType");
            String queryParameter2 = uri2.getQueryParameter("puid");
            String a2 = c.f33977c.a(queryParameter2, uri2);
            Integer valueOf = Integer.valueOf(queryParameter);
            Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(inviteType)");
            Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(activity2, 0, valueOf.intValue(), "", "push");
            if (com.ss.android.g.a.a()) {
                addFriendsActivityIntent.putExtra("bundle_puid", queryParameter2);
                addFriendsActivityIntent.putExtra("bundle_sec_puid", a2);
            } else {
                addFriendsActivityIntent.putExtra("bundle_recommend_user_type", queryParameter2);
            }
            return addFriendsActivityIntent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$UserProfileCommand1;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class aa extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34016a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34016a, false, 22219, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34016a, false, 22219, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "others_homepage";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34016a, false, 22217, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34016a, false, 22217, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) str3 + str4, (Object) "user/profile") || (com.ss.android.g.a.a() && Intrinsics.areEqual((Object) str3, (Object) "profile"))) {
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
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34016a, false, 22218, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34016a, false, 22218, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            String queryParameter = uri2.getQueryParameter("id");
            if (queryParameter == null) {
                queryParameter = uri2.getQueryParameter("uid");
            }
            String queryParameter2 = uri2.getQueryParameter("unique_id");
            String a2 = c.f33977c.a(queryParameter, uri2);
            Intent intent = new Intent(activity2, UserProfileActivity.class);
            intent.putExtra("uid", queryParameter);
            intent.putExtra("sec_user_id", a2);
            intent.putExtra("unique_id", queryParameter2);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$VerifyCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ab extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34017a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34017a, false, 22220, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34017a, false, 22220, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "verify");
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34017a, false, 22221, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34017a, false, 22221, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            bg.a(new com.ss.android.ugc.aweme.verify.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$VideoDetailCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ac extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34018a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34018a, false, 22224, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34018a, false, 22224, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "detail";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34018a, false, 22222, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34018a, false, 22222, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3 + str4, (Object) "user/video");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34018a, false, 22223, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34018a, false, 22223, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Intent intent = new Intent(activity2, DetailActivity.class);
            intent.putExtra("enter_from", "push");
            intent.putExtra("refer", "push");
            intent.putExtra("id", uri2.getQueryParameter("id"));
            intent.putExtra("cid", uri2.getQueryParameter("commentId"));
            d.f34105a.a("detail", uri2, z);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$WebViewCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "forceHideMoreUri", "handleUri", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ad extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34019a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34019a, false, 22226, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34019a, false, 22226, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) f.f34167a);
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34019a, false, 22228, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34019a, false, 22228, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryOpenPolarisPage(activity2, uri.toString()) && !TextUtils.isEmpty(uri2.getQueryParameter("rn_schema"))) {
                String uri3 = uri.toString();
                Intrinsics.checkExpressionValueIsNotNull(uri3, "uri.toString()");
                String uri4 = com.ss.android.ugc.aweme.music.util.f.a(StringsKt.replace$default(uri3, e.f34155e.b(), "aweme", false, 4, (Object) null)).a().toString();
                Intrinsics.checkExpressionValueIsNotNull(uri4, "SchemeHelper.parseRnSche…mpUrl).build().toString()");
                com.ss.android.ugc.aweme.ag.h.a().a(uri4);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0143, code lost:
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r2, (java.lang.CharSequence) "referral", false, 2, (java.lang.Object) null) != false) goto L_0x0147;
         */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(@org.jetbrains.annotations.NotNull android.app.Activity r29, @org.jetbrains.annotations.NotNull android.net.Uri r30, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull java.lang.String r33, boolean r34) {
            /*
                r28 = this;
                r0 = r29
                r1 = r30
                r2 = r31
                r3 = r32
                r4 = r33
                r5 = r34
                r6 = 6
                java.lang.Object[] r7 = new java.lang.Object[r6]
                r14 = 0
                r7[r14] = r0
                r15 = 1
                r7[r15] = r1
                r13 = 2
                r7[r13] = r2
                r16 = 3
                r7[r16] = r3
                r17 = 4
                r7[r17] = r4
                java.lang.Byte r8 = java.lang.Byte.valueOf(r34)
                r18 = 5
                r7[r18] = r8
                com.meituan.robust.ChangeQuickRedirect r9 = f34019a
                java.lang.Class[] r12 = new java.lang.Class[r6]
                java.lang.Class<android.app.Activity> r8 = android.app.Activity.class
                r12[r14] = r8
                java.lang.Class<android.net.Uri> r8 = android.net.Uri.class
                r12[r15] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r12[r13] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r12[r16] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r12[r17] = r8
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r12[r18] = r8
                java.lang.Class<android.content.Intent> r19 = android.content.Intent.class
                r10 = 0
                r11 = 22227(0x56d3, float:3.1147E-41)
                r8 = r28
                r13 = r19
                boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
                if (r7 == 0) goto L_0x0095
                java.lang.Object[] r7 = new java.lang.Object[r6]
                r7[r14] = r0
                r7[r15] = r1
                r8 = 2
                r7[r8] = r2
                r7[r16] = r3
                r7[r17] = r4
                java.lang.Byte r0 = java.lang.Byte.valueOf(r34)
                r7[r18] = r0
                com.meituan.robust.ChangeQuickRedirect r23 = f34019a
                r24 = 0
                r25 = 22227(0x56d3, float:3.1147E-41)
                java.lang.Class[] r0 = new java.lang.Class[r6]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r0[r14] = r1
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r0[r15] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r8] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r16] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r17] = r1
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r0[r18] = r1
                java.lang.Class<android.content.Intent> r27 = android.content.Intent.class
                r21 = r7
                r22 = r28
                r26 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
                android.content.Intent r0 = (android.content.Intent) r0
                return r0
            L_0x0095:
                r8 = 2
                java.lang.String r6 = "activity"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r6)
                java.lang.String r6 = "uri"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r6)
                java.lang.String r6 = "host"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r6)
                java.lang.String r2 = "path"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r2)
                java.lang.String r2 = "fromTokenType"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r2)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r3 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
                java.lang.Object r2 = r2.getService(r3)
                com.ss.android.ugc.aweme.bridgeservice.IBridgeService r2 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r2
                java.lang.String r3 = r30.toString()
                boolean r2 = r2.judgeIsPolarisUrl(r3)
                r3 = 0
                if (r2 == 0) goto L_0x00c7
                return r3
            L_0x00c7:
                java.lang.String r2 = "rn_schema"
                java.lang.String r2 = r1.getQueryParameter(r2)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x00d6
                return r3
            L_0x00d6:
                com.ss.android.ugc.aweme.app.f$a r2 = com.ss.android.ugc.aweme.app.f.f34171e
                android.content.Context r0 = (android.content.Context) r0
                android.content.Intent r0 = r2.a((android.content.Context) r0, (android.net.Uri) r1)
                if (r5 == 0) goto L_0x0159
                java.lang.Object[] r2 = new java.lang.Object[r15]
                r2[r14] = r1
                com.meituan.robust.ChangeQuickRedirect r18 = f34019a
                r19 = 0
                r20 = 22225(0x56d1, float:3.1144E-41)
                java.lang.Class[] r4 = new java.lang.Class[r15]
                java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
                r4[r14] = r6
                java.lang.Class r22 = java.lang.Boolean.TYPE
                r16 = r2
                r17 = r28
                r21 = r4
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
                if (r2 == 0) goto L_0x0122
                java.lang.Object[] r2 = new java.lang.Object[r15]
                r2[r14] = r1
                com.meituan.robust.ChangeQuickRedirect r18 = f34019a
                r19 = 0
                r20 = 22225(0x56d1, float:3.1144E-41)
                java.lang.Class[] r3 = new java.lang.Class[r15]
                java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
                r3[r14] = r4
                java.lang.Class r22 = java.lang.Boolean.TYPE
                r16 = r2
                r17 = r28
                r21 = r3
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r15 = r2
                goto L_0x0147
            L_0x0122:
                if (r1 == 0) goto L_0x012b
                java.lang.String r2 = "url"
                java.lang.String r2 = r1.getQueryParameter(r2)
                goto L_0x012c
            L_0x012b:
                r2 = r3
            L_0x012c:
                if (r2 == 0) goto L_0x0146
                java.lang.String r2 = "url"
                java.lang.String r2 = r1.getQueryParameter(r2)
                if (r2 != 0) goto L_0x0139
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0139:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.String r4 = "referral"
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r2, (java.lang.CharSequence) r4, (boolean) r14, (int) r8, (java.lang.Object) r3)
                if (r2 == 0) goto L_0x0146
                goto L_0x0147
            L_0x0146:
                r15 = 0
            L_0x0147:
                if (r15 != 0) goto L_0x0150
                if (r0 == 0) goto L_0x0150
                java.lang.String r2 = "hide_more"
                r0.putExtra(r2, r14)
            L_0x0150:
                if (r0 == 0) goto L_0x0159
                java.lang.String r2 = "enter_from"
                java.lang.String r3 = "notification"
                r0.putExtra(r2, r3)
            L_0x0159:
                com.ss.android.ugc.aweme.app.d$a r2 = com.ss.android.ugc.aweme.app.d.f34105a
                java.lang.String r3 = "h5"
                r2.a(r3, r1, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.ad.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$BindPhoneCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "handleUri", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34020a;

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34020a, false, 22153, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34020a, false, 22153, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            return null;
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34020a, false, 22151, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34020a, false, 22151, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) str3, (Object) "mobile") || Intrinsics.areEqual((Object) str3, (Object) "bind_phone")) {
                return true;
            }
            return false;
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34020a, false, 22152, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34020a, false, 22152, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            com.ss.android.ugc.aweme.account.c.c().bindMobile(activity2, "", null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$ChallengeCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.app.c$c  reason: collision with other inner class name */
    public static final class C0439c extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34046a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34046a, false, 22156, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34046a, false, 22156, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "challenge_detail";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34046a, false, 22154, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34046a, false, 22154, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "challenge");
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0129  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(@org.jetbrains.annotations.NotNull android.app.Activity r27, @org.jetbrains.annotations.NotNull android.net.Uri r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, boolean r32) {
            /*
                r26 = this;
                r0 = r27
                r1 = r28
                r2 = r29
                r3 = r30
                r4 = r31
                r5 = 6
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r13 = 0
                r6[r13] = r0
                r14 = 1
                r6[r14] = r1
                r15 = 2
                r6[r15] = r2
                r16 = 3
                r6[r16] = r3
                r17 = 4
                r6[r17] = r4
                java.lang.Byte r7 = java.lang.Byte.valueOf(r32)
                r18 = 5
                r6[r18] = r7
                com.meituan.robust.ChangeQuickRedirect r8 = f34046a
                java.lang.Class[] r11 = new java.lang.Class[r5]
                java.lang.Class<android.app.Activity> r7 = android.app.Activity.class
                r11[r13] = r7
                java.lang.Class<android.net.Uri> r7 = android.net.Uri.class
                r11[r14] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r15] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r16] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r17] = r7
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r11[r18] = r7
                java.lang.Class<android.content.Intent> r12 = android.content.Intent.class
                r9 = 0
                r10 = 22155(0x568b, float:3.1046E-41)
                r7 = r26
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
                if (r6 == 0) goto L_0x0090
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r6[r13] = r0
                r6[r14] = r1
                r6[r15] = r2
                r6[r16] = r3
                r6[r17] = r4
                java.lang.Byte r0 = java.lang.Byte.valueOf(r32)
                r6[r18] = r0
                com.meituan.robust.ChangeQuickRedirect r21 = f34046a
                r22 = 0
                r23 = 22155(0x568b, float:3.1046E-41)
                java.lang.Class[] r0 = new java.lang.Class[r5]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r0[r13] = r1
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r0[r14] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r15] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r16] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r17] = r1
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r0[r18] = r1
                java.lang.Class<android.content.Intent> r25 = android.content.Intent.class
                r19 = r6
                r20 = r26
                r24 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
                android.content.Intent r0 = (android.content.Intent) r0
                return r0
            L_0x0090:
                java.lang.String r5 = "activity"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
                java.lang.String r5 = "uri"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
                java.lang.String r5 = "host"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r5)
                java.lang.String r2 = "path"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r2)
                java.lang.String r2 = "fromTokenType"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r2)
                java.lang.String r2 = "is_commerce"
                java.lang.String r2 = r1.getQueryParameter(r2)
                java.lang.String r5 = "show_tab"
                java.lang.String r5 = r1.getQueryParameter(r5)
                if (r5 == 0) goto L_0x00c2
                java.lang.Integer r5 = kotlin.text.StringsKt.toIntOrNull(r5)
                if (r5 == 0) goto L_0x00c2
                int r5 = r5.intValue()
                goto L_0x00c3
            L_0x00c2:
                r5 = 0
            L_0x00c3:
                int r5 = r5 - r14
                r6 = r2
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                java.lang.String r7 = "1"
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r6 = android.text.TextUtils.equals(r6, r7)
                if (r6 != 0) goto L_0x00d9
                java.lang.String r6 = "true"
                boolean r2 = kotlin.text.StringsKt.equals(r6, r2, r14)
                if (r2 == 0) goto L_0x00e2
            L_0x00d9:
                java.lang.String r2 = "id"
                java.lang.String r2 = r1.getQueryParameter(r2)
                com.ss.android.ugc.aweme.commercialize.utils.r.a((java.lang.String) r2)
            L_0x00e2:
                java.lang.String r2 = "group"
                java.lang.String r2 = r1.getQueryParameter(r2)
                r6 = r3
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                r7 = 0
                if (r6 != 0) goto L_0x00fb
                java.lang.String r6 = "/detail/"
                boolean r3 = kotlin.text.StringsKt.startsWith$default(r3, r6, r13, r15, r7)
                if (r3 == 0) goto L_0x00fb
                r13 = 1
            L_0x00fb:
                java.lang.String r3 = "0"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
                if (r2 != 0) goto L_0x0107
                if (r13 == 0) goto L_0x0106
                goto L_0x0107
            L_0x0106:
                return r7
            L_0x0107:
                if (r13 == 0) goto L_0x010e
                java.lang.String r2 = r28.getLastPathSegment()
                goto L_0x0114
            L_0x010e:
                java.lang.String r2 = "id"
                java.lang.String r2 = r1.getQueryParameter(r2)
            L_0x0114:
                com.ss.android.ugc.aweme.commercialize.utils.r.a(r1, r2)
                android.content.Intent r3 = new android.content.Intent
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity> r6 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity.class
                r3.<init>(r0, r6)
                java.lang.String r0 = "id"
                if (r13 == 0) goto L_0x0129
                java.lang.String r6 = r28.getLastPathSegment()
                goto L_0x012f
            L_0x0129:
                java.lang.String r6 = "id"
                java.lang.String r6 = r1.getQueryParameter(r6)
            L_0x012f:
                r3.putExtra(r0, r6)
                java.lang.String r0 = "from_token"
                r3.putExtra(r0, r4)
                java.lang.String r0 = "show_tab_index"
                r3.putExtra(r0, r5)
                java.lang.String r0 = "cid"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)     // Catch:{ NumberFormatException -> 0x0145 }
                java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0145 }
                goto L_0x014a
            L_0x0145:
                java.lang.String r0 = "extra_challenge_is_hashtag"
                r3.putExtra(r0, r14)
            L_0x014a:
                com.ss.android.ugc.aweme.app.d$a r0 = com.ss.android.ugc.aweme.app.d.f34105a
                java.lang.String r2 = "challenge_detail"
                r4 = r32
                r0.a(r2, r1, r4)
                boolean r0 = com.ss.android.g.a.a()
                if (r0 != 0) goto L_0x016e
                if (r13 == 0) goto L_0x016e
                java.lang.String r0 = r28.getLastPathSegment()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "1610938614632477"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x016e
                com.ss.android.ugc.aweme.j.a.a.a()
            L_0x016e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.C0439c.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016JB\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "prelogin", "enterTo", "handleUri", "", "match", "scheme", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static abstract class d {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f34066b;

        @Nullable
        public Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34066b, false, 22159, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34066b, false, 22159, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            return null;
        }

        @NotNull
        public String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34066b, false, 22162, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34066b, false, 22162, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "";
        }

        public void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34066b, false, 22161, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34066b, false, 22161, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
        }

        public boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34066b, false, 22157, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34066b, false, 22157, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return false;
        }

        public boolean a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f34066b, false, 22158, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f34066b, false, 22158, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str4, "scheme");
            Intrinsics.checkParameterIsNotNull(str5, "host");
            Intrinsics.checkParameterIsNotNull(str6, "path");
            return a(str5, str6);
        }

        @Nullable
        public Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34066b, false, 22160, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z), Byte.valueOf(z2)}, this, f34066b, false, 22160, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            return a(activity, uri, str, str2, str3, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$Companion;", "", "()V", "SEC_UID", "", "getCommandList", "", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "mobDiscovery", "", "uri", "Landroid/net/Uri;", "intent", "Landroid/content/Intent;", "fromNotification", "", "syncSecuid", "uid", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34073a;

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }

        @JvmStatic
        @Nullable
        public final String a(@Nullable String str, @Nullable Uri uri) {
            String str2;
            String str3 = str;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{str3, uri2}, this, f34073a, false, 22164, new Class[]{String.class, Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str3, uri2}, this, f34073a, false, 22164, new Class[]{String.class, Uri.class}, String.class);
            }
            if (uri2 != null) {
                str2 = uri2.getQueryParameter(c.f33976b);
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
                dr.a().a(str3, str2);
            }
            return str2;
        }

        public final void a(@NotNull Uri uri, @NotNull Intent intent, boolean z) {
            Uri uri2 = uri;
            Intent intent2 = intent;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{uri2, intent2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34073a, false, 22165, new Class[]{Uri.class, Intent.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{uri2, intent2, Byte.valueOf(z)}, this, f34073a, false, 22165, new Class[]{Uri.class, Intent.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(intent2, "intent");
            try {
                int parseInt = Integer.parseInt(uri2.getQueryParameter("tab"));
                intent2.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    d.f34105a.a("discovery", uri2, z2);
                    return;
                }
                if (parseInt == 5) {
                    d.f34105a.a("follow", uri2, z2);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$ContactsCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34077a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34077a, false, 22166, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34077a, false, 22166, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) str3 + str4, (Object) "user/addressbook/list") || (com.ss.android.g.a.b() && (Intrinsics.areEqual((Object) str3, (Object) "friendRecommend") || Intrinsics.areEqual((Object) str3, (Object) "newFriendRecommend")))) {
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
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34077a, false, 22167, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34077a, false, 22167, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            return ContactsActivity.a((Context) activity2, (String) null, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$DetailCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "clickPushVideoAt", "", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34081a;

        /* renamed from: c  reason: collision with root package name */
        private final String f34082c = "click_push_videoat";

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34081a, false, 22170, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34081a, false, 22170, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "detail";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34081a, false, 22168, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34081a, false, 22168, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (!StringsKt.startsWith$default(str3 + str4, "aweme/detail/", false, 2, null)) {
                if (StringsKt.startsWith$default(str3 + str4, "tuwen/detail/", false, 2, null)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Intent intent;
            boolean z2;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            boolean z3 = z;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34081a, false, 22169, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z)}, this, f34081a, false, 22169, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            String queryParameter = uri2.getQueryParameter("gd_label");
            if (!com.ss.android.g.a.a() && TextUtils.equals(queryParameter, this.f34082c)) {
                intent = new Intent(activity2, NotificationDetailActivity.class);
                intent.putExtra("from_where", 2);
            } else if (!com.ss.android.g.a.a() && MainPageExperimentHelper.n() && activity.isTaskRoot() && TextUtils.equals(queryParameter, "click_push_newvideo")) {
                intent = new Intent(activity2, MainActivity.class);
                String queryParameter2 = uri2.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter2)) {
                    queryParameter2 = "web";
                }
                intent.putExtra("id", uri.getLastPathSegment());
                intent.putExtra("refer", queryParameter2);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                intent.putExtra("tab", 0);
            } else if (!com.ss.android.g.a.c() || !TextUtils.equals(queryParameter, this.f34082c)) {
                Context context = activity2;
                Intent intent2 = new Intent(context, DetailActivity.class);
                String queryParameter3 = uri2.getQueryParameter("label");
                String queryParameter4 = uri2.getQueryParameter("from");
                if (TextUtils.isEmpty(queryParameter3)) {
                    queryParameter3 = "web";
                }
                intent2.putExtra("refer", queryParameter3);
                intent2.putExtra("id", uri.getLastPathSegment());
                CharSequence queryParameter5 = uri2.getQueryParameter("is_friend");
                if (TextUtils.isEmpty(queryParameter5) || !TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, queryParameter5)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && z3) {
                    AbTestManager a2 = AbTestManager.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                    if (a2.d() != null) {
                        AbTestManager a3 = AbTestManager.a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                        AbTestModel d2 = a3.d();
                        Intrinsics.checkExpressionValueIsNotNull(d2, "AbTestManager.getInstance().abTestSettingModel");
                        if (d2.getUsePushStyle() && (!Intrinsics.areEqual((Object) "tuwen", (Object) str4))) {
                            j a4 = j.a();
                            Intrinsics.checkExpressionValueIsNotNull(a4, "AppLifeCircleCacheManager.getInstance()");
                            if (a4.f34191b || activity.isTaskRoot()) {
                                intent = new Intent(context, MainActivity.class);
                                intent.putExtra("id", uri.getLastPathSegment());
                                intent.putExtra("extra_story_is_friend", 0);
                            }
                        }
                    }
                }
                Intent intent3 = new Intent(context, DetailActivity.class);
                String queryParameter6 = uri2.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter6)) {
                    queryParameter6 = "web";
                }
                if (TextUtils.isEmpty(str6)) {
                    str6 = queryParameter6;
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    str6 = "mp_page";
                }
                intent3.putExtra("from_micro_app", queryParameter4);
                intent3.putExtra("from_adsapp_activity", true);
                intent3.putExtra("refer", str6);
                intent3.putExtra("id", uri.getLastPathSegment());
                intent3.putExtra("from_uid", uri2.getQueryParameter("from_uid"));
                if (z2) {
                    j a5 = j.a();
                    Intrinsics.checkExpressionValueIsNotNull(a5, "AppLifeCircleCacheManager.getInstance()");
                    if (a5.f34191b) {
                        intent3.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FOLLOW");
                        intent3.putExtra("extra_story_is_friend", 1);
                    }
                }
                intent = intent3;
            } else {
                intent = new Intent(activity2, NotificationDetailActivity.class);
                intent.putExtra("from_where", 2);
            }
            d.f34105a.a("detail", uri2, z3);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$DetailHostCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34083a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34083a, false, 22171, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34083a, false, 22171, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "detail");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            String str4;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str5, str6, str7, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34083a, false, 22172, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str5, str6, str7, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34083a, false, 22172, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str5, "host");
            Intrinsics.checkParameterIsNotNull(str6, "path");
            Intrinsics.checkParameterIsNotNull(str7, "fromTokenType");
            Intent intent = new Intent(activity2, DetailActivity.class);
            if (!TextUtils.isEmpty(str7)) {
                str4 = str7;
            } else {
                str4 = "web";
            }
            intent.putExtra("refer", str4);
            intent.putExtra("from_token", str7);
            intent.putExtra("id", uri2.getQueryParameter("id"));
            d.f34105a.a("detail", uri2, z);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$DetailListCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34084a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34084a, false, 22173, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34084a, false, 22173, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (!Intrinsics.areEqual((Object) str3 + str4, (Object) "aweme/detail_list")) {
                if (Intrinsics.areEqual((Object) str3 + str4, (Object) "tuwen/detail_list")) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0146  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(@org.jetbrains.annotations.NotNull android.app.Activity r27, @org.jetbrains.annotations.NotNull android.net.Uri r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, boolean r32) {
            /*
                r26 = this;
                r0 = r27
                r1 = r28
                r2 = r29
                r3 = r30
                r4 = r31
                r5 = 6
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r13 = 0
                r6[r13] = r0
                r14 = 1
                r6[r14] = r1
                r15 = 2
                r6[r15] = r2
                r16 = 3
                r6[r16] = r3
                r17 = 4
                r6[r17] = r4
                java.lang.Byte r7 = java.lang.Byte.valueOf(r32)
                r18 = 5
                r6[r18] = r7
                com.meituan.robust.ChangeQuickRedirect r8 = f34084a
                java.lang.Class[] r11 = new java.lang.Class[r5]
                java.lang.Class<android.app.Activity> r7 = android.app.Activity.class
                r11[r13] = r7
                java.lang.Class<android.net.Uri> r7 = android.net.Uri.class
                r11[r14] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r15] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r16] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r17] = r7
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r11[r18] = r7
                java.lang.Class<android.content.Intent> r12 = android.content.Intent.class
                r9 = 0
                r10 = 22174(0x569e, float:3.1072E-41)
                r7 = r26
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
                if (r6 == 0) goto L_0x0090
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r6[r13] = r0
                r6[r14] = r1
                r6[r15] = r2
                r6[r16] = r3
                r6[r17] = r4
                java.lang.Byte r0 = java.lang.Byte.valueOf(r32)
                r6[r18] = r0
                com.meituan.robust.ChangeQuickRedirect r21 = f34084a
                r22 = 0
                r23 = 22174(0x569e, float:3.1072E-41)
                java.lang.Class[] r0 = new java.lang.Class[r5]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r0[r13] = r1
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r0[r14] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r15] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r16] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r17] = r1
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r0[r18] = r1
                java.lang.Class<android.content.Intent> r25 = android.content.Intent.class
                r19 = r6
                r20 = r26
                r24 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
                android.content.Intent r0 = (android.content.Intent) r0
                return r0
            L_0x0090:
                java.lang.String r5 = "activity"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
                java.lang.String r5 = "uri"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
                java.lang.String r5 = "host"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r5)
                java.lang.String r5 = "path"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r5)
                java.lang.String r3 = "fromTokenType"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r3)
                java.lang.String r3 = "label"
                java.lang.String r3 = r1.getQueryParameter(r3)
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 == 0) goto L_0x00ba
                java.lang.String r3 = "web"
            L_0x00ba:
                java.lang.String r5 = "gids"
                java.lang.String r5 = r1.getQueryParameter(r5)
                java.lang.String r6 = "push_params"
                java.lang.String r6 = r1.getQueryParameter(r6)
                java.lang.String r7 = "tuwen"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
                r2 = r2 ^ r14
                if (r2 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.app.j r2 = com.ss.android.ugc.aweme.app.j.a()
                java.lang.String r7 = "AppLifeCircleCacheManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r7)
                boolean r2 = r2.f34191b
                if (r2 != 0) goto L_0x00e2
                boolean r2 = r27.isTaskRoot()
                if (r2 == 0) goto L_0x00ec
            L_0x00e2:
                android.content.Intent r2 = new android.content.Intent
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.main.MainActivity> r3 = com.ss.android.ugc.aweme.main.MainActivity.class
                r2.<init>(r0, r3)
                goto L_0x0114
            L_0x00ec:
                android.content.Intent r2 = new android.content.Intent
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r7 = com.ss.android.ugc.aweme.detail.ui.DetailActivity.class
                r2.<init>(r0, r7)
                r0 = r4
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x00ff
                r3 = r4
            L_0x00ff:
                java.lang.String r0 = "from_adsapp_activity"
                r2.putExtra(r0, r14)
                java.lang.String r0 = "refer"
                r2.putExtra(r0, r3)
                java.lang.String r0 = "from_uid"
                java.lang.String r3 = "from_uid"
                java.lang.String r3 = r1.getQueryParameter(r3)
                r2.putExtra(r0, r3)
            L_0x0114:
                r0 = r5
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r3 = android.text.TextUtils.isEmpty(r0)
                if (r3 != 0) goto L_0x013d
                java.lang.String r3 = "from"
                java.lang.String r3 = r1.getQueryParameter(r3)
                r4 = r3
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 != 0) goto L_0x0138
                java.lang.String r4 = "from_micro_app"
                r2.putExtra(r4, r3)
                java.lang.String r3 = "refer"
                java.lang.String r4 = "mp_page"
                r2.putExtra(r3, r4)
            L_0x0138:
                java.lang.String r3 = "ids"
                r2.putExtra(r3, r5)
            L_0x013d:
                r3 = r6
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L_0x014b
                java.lang.String r4 = "push_params"
                r2.putExtra(r4, r6)
            L_0x014b:
                java.lang.String r4 = "push_id"
                r1.getQueryParameter(r4)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0166
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x0166
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0166 }
                r0.<init>(r6)     // Catch:{ JSONException -> 0x0166 }
                java.lang.String r3 = "gids"
                r0.getString(r3)     // Catch:{ JSONException -> 0x0166 }
            L_0x0166:
                com.ss.android.ugc.aweme.app.d$a r0 = com.ss.android.ugc.aweme.app.d.f34105a
                java.lang.String r3 = "detail"
                r4 = r32
                r0.a(r3, r1, r4)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.i.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$DiscoverCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34085a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34085a, false, 22175, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34085a, false, 22175, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) "discovery", (Object) str3);
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34085a, false, 22176, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34085a, false, 22176, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            if (com.ss.android.g.a.a()) {
                Intent intent = new Intent(activity2, MainActivity.class);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FOLLOW");
                c.f33977c.a(uri2, intent, z2);
                return intent;
            }
            Intent intent2 = new Intent(activity2, DiscoverActivity.class);
            c.f33977c.a(uri2, intent2, z2);
            return intent2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$FeedBackInputCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class k extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34086a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34086a, false, 22177, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34086a, false, 22177, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "feedback_input");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34086a, false, 22178, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34086a, false, 22178, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Object service = ServiceManager.get().getService(IBridgeService.class);
            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ridgeService::class.java)");
            Intent intent = new Intent(activity2, ((IBridgeService) service).getSubmitFeedbackActivity());
            String queryParameter = uri2.getQueryParameter("feedback_id");
            String queryParameter2 = uri2.getQueryParameter("enter_from");
            String queryParameter3 = uri2.getQueryParameter("img_url");
            if (!TextUtils.isEmpty(queryParameter)) {
                intent.putExtra("feedback_id", queryParameter);
                intent.putExtra("enter_from", queryParameter2);
            }
            intent.putExtra("img_url", queryParameter3);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$FeedbackRecordCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34087a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34087a, false, 22179, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34087a, false, 22179, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "feedback_record");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34087a, false, 22180, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34087a, false, 22180, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            return new Intent(activity2, FeedbackActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$FollowFeedCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class m extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34088a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34088a, false, 22181, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34088a, false, 22181, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) "modern_feed", (Object) str3);
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34088a, false, 22182, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34088a, false, 22182, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Intent intent = new Intent(activity2, MainActivity.class);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FOLLOW");
            c.f33977c.a(uri2, intent, z);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$HotLiveCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class n extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34089a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34089a, false, 22183, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34089a, false, 22183, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return StringsKt.startsWith$default(str3 + str4, "hotlive/feed", false, 2, null);
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34089a, false, 22184, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34089a, false, 22184, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Bundle bundle = new Bundle();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (!CollectionUtils.isEmpty(queryParameterNames)) {
                for (String next : queryParameterNames) {
                    bundle.putString(next, uri2.getQueryParameter(next));
                }
            }
            com.ss.android.ugc.aweme.story.live.c.a().a(activity2, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$ImFansCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class o extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34090a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34090a, false, 22185, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34090a, false, 22185, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3 + str4, (Object) "user/imfans");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34090a, false, 22186, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34090a, false, 22186, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Intent intent = new Intent(activity2, NotificationDetailActivity.class);
            intent.putExtra("from_where", 0);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$ItemCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class p extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34091a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34091a, false, 22189, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34091a, false, 22189, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "detail";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34091a, false, 22187, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34091a, false, 22187, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) str3, (Object) "item") || (com.ss.android.g.a.b() && Intrinsics.areEqual((Object) str3, (Object) "musical"))) {
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
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34091a, false, 22188, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34091a, false, 22188, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            Intent intent = new Intent(activity2, DetailActivity.class);
            intent.putExtra("refer", "web");
            intent.putExtra("id", uri2.getQueryParameter("id"));
            d.f34105a.a("detail", uri2, z);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$LoginCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "handleUri", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "fromNotification", "", "match", "host", "", "path", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class q extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34092a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34092a, false, 22190, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34092a, false, 22190, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "login");
        }

        public final void a(@NotNull Activity activity, @NotNull Uri uri, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34092a, false, 22191, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34092a, false, 22191, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (!a2.isLogin()) {
                p a3 = p.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeRuntime.inst()");
                if (a3.c()) {
                    activity2.startActivity(new Intent(activity2, PushLoginActivity.class));
                    return;
                }
                Context context = activity2;
                activity2.startActivities(new Intent[]{new Intent(context, MainActivity.class), new Intent(context, PushLoginActivity.class)});
                return;
            }
            activity2.startActivity(new Intent(activity2, MainActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$MusicCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class r extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34093a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34093a, false, 22194, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34093a, false, 22194, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "music_detail";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34093a, false, 22192, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34093a, false, 22192, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (Intrinsics.areEqual((Object) str3, (Object) "music") || (com.ss.android.g.a.b() && Intrinsics.areEqual((Object) str3, (Object) "song"))) {
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
            boolean z2 = z;
            boolean z3 = false;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34093a, false, 22193, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z)}, this, f34093a, false, 22193, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            if (!Intrinsics.areEqual((Object) str4, (Object) "song") || !com.ss.android.g.a.b()) {
                String queryParameter = uri2.getQueryParameter("group");
                if (!TextUtils.isEmpty(str5) && StringsKt.startsWith$default(str5, "/detail/", false, 2, null)) {
                    z3 = true;
                }
                if (!Intrinsics.areEqual((Object) PushConstants.PUSH_TYPE_NOTIFY, (Object) queryParameter) && !z3) {
                    return null;
                }
                Intent intent = new Intent(activity2, MusicDetailActivity.class);
                String queryParameter2 = uri2.getQueryParameter("id");
                if (TextUtils.isEmpty(queryParameter2)) {
                    queryParameter2 = uri.getLastPathSegment();
                }
                if (Intrinsics.areEqual((Object) "detail", (Object) queryParameter2) || Intrinsics.areEqual((Object) PushConstants.PUSH_TYPE_NOTIFY, (Object) queryParameter2)) {
                    queryParameter2 = null;
                }
                intent.putExtra("id", queryParameter2);
                intent.putExtra("from_token", str6);
                intent.putExtra("partnerName", uri2.getQueryParameter("partnerName"));
                intent.putExtra("partnerMusicId", uri2.getQueryParameter("partnerMusicId"));
                d.f34105a.a("music_detail", uri2, z2);
                return intent;
            }
            Intent intent2 = new Intent(activity2, MusicDetailActivity.class);
            intent2.putExtra("id", uri2.getQueryParameter("trackId"));
            d.f34105a.a("music_detail", uri2, z2);
            return intent2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$MusicListCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class s extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34094a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34094a, false, 22195, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34094a, false, 22195, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "collection");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34094a, false, 22196, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34094a, false, 22196, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            if (!Intrinsics.areEqual((Object) PushConstants.PUSH_TYPE_NOTIFY, (Object) uri2.getQueryParameter("group"))) {
                return null;
            }
            Intent intent = new Intent(activity2, MusicListActivity.class);
            intent.putExtra("mc_id", uri2.getQueryParameter("id"));
            intent.putExtra("title_name", uri2.getQueryParameter("collection_name"));
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$MyProfileCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "prelogin", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class t extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34095a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34095a, false, 22199, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34095a, false, 22199, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "personal_homepage";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34095a, false, 22197, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34095a, false, 22197, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (!Intrinsics.areEqual((Object) "mine", (Object) str3)) {
                if (Intrinsics.areEqual((Object) str3 + str4, (Object) "user/homepage")) {
                    return true;
                }
                return false;
            }
            return true;
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
            Intent intent;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34095a, false, 22198, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z), Byte.valueOf(z2)}, this, f34095a, false, 22198, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (a2.isLogin() || z2) {
                Intent intent2 = new Intent(activity2, MainActivity.class);
                intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                d.f34105a.a("mine", uri2, z);
                intent = intent2;
            } else {
                intent = new Intent(activity2, MainActivity.class);
            }
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$POICommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class u extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34096a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34096a, false, 22202, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34096a, false, 22202, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "poi_page";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34096a, false, 22200, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34096a, false, 22200, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "poi");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            String str4;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str5, str6, str7, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34096a, false, 22201, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str5, str6, str7, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34096a, false, 22201, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str5, "host");
            Intrinsics.checkParameterIsNotNull(str6, "path");
            Intrinsics.checkParameterIsNotNull(str7, "fromTokenType");
            if (com.ss.android.g.a.a()) {
                String queryParameter = uri2.getQueryParameter("id");
                Intent intent = new Intent(activity2, PoiDetailActivity.class);
                intent.putExtra("poi_bundle", new l.a().c(queryParameter).a());
                return intent;
            } else if (!com.ss.android.ugc.aweme.poi.e.p.b()) {
                return null;
            } else {
                String queryParameter2 = uri2.getQueryParameter("id");
                String queryParameter3 = uri2.getQueryParameter("attached_activity_id");
                String queryParameter4 = uri2.getQueryParameter("enter_from");
                String queryParameter5 = uri2.getQueryParameter("to_user_id");
                String queryParameter6 = uri2.getQueryParameter("from_user_id");
                String queryParameter7 = uri2.getQueryParameter("coupon_id");
                String queryParameter8 = uri2.getQueryParameter("enter_method");
                if (queryParameter8 == null) {
                    queryParameter8 = "";
                }
                Intent intent2 = new Intent(activity2, PoiDetailActivity.class);
                l.a l = new l.a().c(queryParameter2).g("").d(queryParameter3).e(queryParameter7).a(queryParameter5).b(queryParameter6).l(queryParameter8);
                if (z) {
                    str4 = "push";
                } else if (TextUtils.isEmpty(queryParameter4)) {
                    str4 = str7;
                } else {
                    str4 = queryParameter4;
                }
                intent2.putExtra("poi_bundle", l.i(str4).a());
                return intent2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$ProfileCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class v extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34097a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34097a, false, 22205, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34097a, false, 22205, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "others_homepage";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34097a, false, 22203, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34097a, false, 22203, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "profile");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34097a, false, 22204, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34097a, false, 22204, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            d.f34105a.a("personal_homepage", uri2, z);
            Intent intent = new Intent(activity2, UserProfileActivity.class);
            intent.putExtra("uid", uri2.getQueryParameter("id"));
            intent.putExtra("sec_user_id", c.f33977c.a(uri2.getQueryParameter("id"), uri2));
            intent.putExtra("poi_id", uri2.getQueryParameter("poi_id"));
            intent.putExtra("enter_from", uri2.getQueryParameter("enter_from"));
            if (!com.ss.android.g.a.a()) {
                String stringExtra = activity.getIntent().getStringExtra("token_request_id");
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(str6)) {
                    ((com.ss.android.ugc.aweme.u.q) new com.ss.android.ugc.aweme.u.q().b(str6).a("click_button")).k(uri.getLastPathSegment()).l(stringExtra).e();
                }
            }
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$ProfileEditCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class w extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34098a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34098a, false, 22206, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34098a, false, 22206, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "profileEdit");
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34098a, false, 22207, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34098a, false, 22207, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            return new Intent(activity2, ProfileEditActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$RecordCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "match", "tryMobTileServiceLaunchEvent", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class x extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34099a;

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34099a, false, 22208, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34099a, false, 22208, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            if (!Intrinsics.areEqual((Object) str3, (Object) "openRecord")) {
                if (!StringsKt.startsWith$default(str3 + str4, "studio/task/create", false, 2, null)) {
                    if (StringsKt.startsWith$default(str3 + str4, "studio/create", false, 2, null)) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.content.Intent} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(@org.jetbrains.annotations.NotNull android.app.Activity r27, @org.jetbrains.annotations.NotNull android.net.Uri r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, boolean r32) {
            /*
                r26 = this;
                r0 = r27
                r1 = r28
                r2 = r29
                r3 = r30
                r4 = r31
                r5 = 6
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r13 = 0
                r6[r13] = r0
                r14 = 1
                r6[r14] = r1
                r15 = 2
                r6[r15] = r2
                r16 = 3
                r6[r16] = r3
                r17 = 4
                r6[r17] = r4
                java.lang.Byte r7 = java.lang.Byte.valueOf(r32)
                r18 = 5
                r6[r18] = r7
                com.meituan.robust.ChangeQuickRedirect r8 = f34099a
                java.lang.Class[] r11 = new java.lang.Class[r5]
                java.lang.Class<android.app.Activity> r7 = android.app.Activity.class
                r11[r13] = r7
                java.lang.Class<android.net.Uri> r7 = android.net.Uri.class
                r11[r14] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r15] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r16] = r7
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r17] = r7
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r11[r18] = r7
                java.lang.Class<android.content.Intent> r12 = android.content.Intent.class
                r9 = 0
                r10 = 22209(0x56c1, float:3.1121E-41)
                r7 = r26
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
                if (r6 == 0) goto L_0x0090
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r6[r13] = r0
                r6[r14] = r1
                r6[r15] = r2
                r6[r16] = r3
                r6[r17] = r4
                java.lang.Byte r0 = java.lang.Byte.valueOf(r32)
                r6[r18] = r0
                com.meituan.robust.ChangeQuickRedirect r21 = f34099a
                r22 = 0
                r23 = 22209(0x56c1, float:3.1121E-41)
                java.lang.Class[] r0 = new java.lang.Class[r5]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r0[r13] = r1
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r0[r14] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r15] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r16] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r17] = r1
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r0[r18] = r1
                java.lang.Class<android.content.Intent> r25 = android.content.Intent.class
                r19 = r6
                r20 = r26
                r24 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
                android.content.Intent r0 = (android.content.Intent) r0
                return r0
            L_0x0090:
                java.lang.String r5 = "activity"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
                java.lang.String r5 = "uri"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
                java.lang.String r5 = "host"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r5)
                java.lang.String r2 = "path"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r2)
                java.lang.String r2 = "fromTokenType"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r2)
                java.lang.Object[] r3 = new java.lang.Object[r14]
                r3[r13] = r0
                com.meituan.robust.ChangeQuickRedirect r5 = f34099a
                r6 = 0
                r7 = 22210(0x56c2, float:3.1123E-41)
                java.lang.Class[] r8 = new java.lang.Class[r14]
                java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                r8[r13] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                r4 = r26
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r2 == 0) goto L_0x00d9
                java.lang.Object[] r3 = new java.lang.Object[r14]
                r3[r13] = r0
                com.meituan.robust.ChangeQuickRedirect r5 = f34099a
                r6 = 0
                r7 = 22210(0x56c2, float:3.1123E-41)
                java.lang.Class[] r8 = new java.lang.Class[r14]
                java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                r8[r13] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                r4 = r26
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x0109
            L_0x00d9:
                android.content.Intent r2 = r27.getIntent()
                java.lang.String r3 = "from_tile_service"
                boolean r2 = r2.getBooleanExtra(r3, r13)
                if (r2 == 0) goto L_0x0109
                java.lang.String r2 = "launch_from_notificationbar"
                com.ss.android.ugc.aweme.app.d.d r3 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r4 = "launch_method"
                java.lang.String r5 = "click_shoot_notificationbar"
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "is_cold_launch"
                com.ss.android.ugc.aweme.app.j r5 = com.ss.android.ugc.aweme.app.j.a()
                java.lang.String r6 = "AppLifeCircleCacheManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                boolean r5 = r5.f34192c
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (int) r5)
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
            L_0x0109:
                if (r32 == 0) goto L_0x0200
                com.ss.android.ugc.aweme.shortvideo.k.a r9 = com.ss.android.ugc.aweme.shortvideo.k.a.f68275b
                java.lang.Object[] r2 = new java.lang.Object[r15]
                r2[r13] = r0
                r2[r14] = r1
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.k.a.f68274a
                r5 = 0
                r6 = 78478(0x1328e, float:1.09971E-40)
                java.lang.Class[] r7 = new java.lang.Class[r15]
                java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
                r7[r13] = r3
                java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
                r7[r14] = r3
                java.lang.Class<android.content.Intent> r8 = android.content.Intent.class
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                r3 = 0
                if (r2 == 0) goto L_0x0155
                java.lang.Object[] r2 = new java.lang.Object[r15]
                r2[r13] = r0
                r2[r14] = r1
                com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.k.a.f68274a
                r4 = 0
                r5 = 78478(0x1328e, float:1.09971E-40)
                java.lang.Class[] r6 = new java.lang.Class[r15]
                java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
                r6[r13] = r0
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                r6[r14] = r0
                java.lang.Class<android.content.Intent> r7 = android.content.Intent.class
                r0 = r2
                r1 = r9
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                r3 = r0
                android.content.Intent r3 = (android.content.Intent) r3
                goto L_0x01ef
            L_0x0155:
                java.lang.String r2 = "activity"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                java.lang.String r2 = "uri"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r4 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r2 = r2.getService(r4)
                com.ss.android.ugc.aweme.services.IAVService r2 = (com.ss.android.ugc.aweme.services.IAVService) r2
                com.ss.android.ugc.aweme.services.video.IAVPublishService r2 = r2.publishService()
                r2.removeChallenges()
                com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r4 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r2 = r2.getService(r4)
                com.ss.android.ugc.aweme.services.IAVService r2 = (com.ss.android.ugc.aweme.services.IAVService) r2
                com.ss.android.ugc.aweme.services.video.IAVPublishService r2 = r2.publishService()
                java.lang.String r4 = "ServiceManager.get().get…ss.java).publishService()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
                r2.setCurMusic(r3)
                android.content.Intent r2 = new android.content.Intent
                r4 = r0
                android.content.Context r4 = (android.content.Context) r4
                com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r6 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r5 = r5.getService(r6)
                java.lang.String r6 = "ServiceManager.get().get…e(IAVService::class.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                com.ss.android.ugc.aweme.services.IAVService r5 = (com.ss.android.ugc.aweme.services.IAVService) r5
                java.lang.Class r5 = r5.getRecordPermissionActivity()
                r2.<init>(r4, r5)
                r9.a((android.app.Activity) r0, (android.content.Intent) r2, (android.net.Uri) r1)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r5 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r1 = r1.getService(r5)
                com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
                boolean r1 = r1.needLoginBeforeRecord()
                if (r1 == 0) goto L_0x01ee
                com.ss.android.ugc.aweme.app.p r1 = com.ss.android.ugc.aweme.app.p.a()
                java.lang.String r5 = "AwemeRuntime.inst()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                boolean r1 = r1.c()
                android.content.Intent r5 = new android.content.Intent
                java.lang.Class<com.ss.android.ugc.aweme.app.PushLoginActivity> r6 = com.ss.android.ugc.aweme.app.PushLoginActivity.class
                r5.<init>(r4, r6)
                java.lang.String r6 = "next_step"
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                r5.putExtra(r6, r2)
                if (r1 == 0) goto L_0x01dd
                r0.startActivity(r5)
                goto L_0x01ef
            L_0x01dd:
                android.content.Intent[] r1 = new android.content.Intent[r15]
                android.content.Intent r2 = new android.content.Intent
                java.lang.Class<com.ss.android.ugc.aweme.main.MainActivity> r6 = com.ss.android.ugc.aweme.main.MainActivity.class
                r2.<init>(r4, r6)
                r1[r13] = r2
                r1[r14] = r5
                r0.startActivities(r1)
                goto L_0x01ef
            L_0x01ee:
                r3 = r2
            L_0x01ef:
                if (r3 == 0) goto L_0x01ff
                java.lang.String r0 = "shoot_way"
                java.lang.String r1 = "push"
                r3.putExtra(r0, r1)
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = "push"
                r3.putExtra(r0, r1)
            L_0x01ff:
                return r3
            L_0x0200:
                com.ss.android.ugc.aweme.shortvideo.k.a r2 = com.ss.android.ugc.aweme.shortvideo.k.a.f68275b
                android.content.Intent r0 = r2.a((android.app.Activity) r0, (android.net.Uri) r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.x.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$StickersCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class y extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34100a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34100a, false, 22213, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34100a, false, 22213, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "prop_detail";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34100a, false, 22211, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34100a, false, 22211, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return Intrinsics.areEqual((Object) str3, (Object) "stickers");
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0149  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(@org.jetbrains.annotations.NotNull android.app.Activity r28, @org.jetbrains.annotations.NotNull android.net.Uri r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32, boolean r33) {
            /*
                r27 = this;
                r0 = r28
                r1 = r29
                r2 = r30
                r3 = r31
                r4 = r32
                r5 = r33
                r6 = 6
                java.lang.Object[] r7 = new java.lang.Object[r6]
                r14 = 0
                r7[r14] = r0
                r15 = 1
                r7[r15] = r1
                r13 = 2
                r7[r13] = r2
                r16 = 3
                r7[r16] = r3
                r17 = 4
                r7[r17] = r4
                java.lang.Byte r8 = java.lang.Byte.valueOf(r33)
                r18 = 5
                r7[r18] = r8
                com.meituan.robust.ChangeQuickRedirect r9 = f34100a
                java.lang.Class[] r12 = new java.lang.Class[r6]
                java.lang.Class<android.app.Activity> r8 = android.app.Activity.class
                r12[r14] = r8
                java.lang.Class<android.net.Uri> r8 = android.net.Uri.class
                r12[r15] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r12[r13] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r12[r16] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r12[r17] = r8
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r12[r18] = r8
                java.lang.Class<android.content.Intent> r19 = android.content.Intent.class
                r10 = 0
                r11 = 22212(0x56c4, float:3.1126E-41)
                r8 = r27
                r13 = r19
                boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
                if (r7 == 0) goto L_0x0095
                java.lang.Object[] r7 = new java.lang.Object[r6]
                r7[r14] = r0
                r7[r15] = r1
                r8 = 2
                r7[r8] = r2
                r7[r16] = r3
                r7[r17] = r4
                java.lang.Byte r0 = java.lang.Byte.valueOf(r33)
                r7[r18] = r0
                com.meituan.robust.ChangeQuickRedirect r22 = f34100a
                r23 = 0
                r24 = 22212(0x56c4, float:3.1126E-41)
                java.lang.Class[] r0 = new java.lang.Class[r6]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r0[r14] = r1
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r0[r15] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r8] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r16] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r17] = r1
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r0[r18] = r1
                java.lang.Class<android.content.Intent> r26 = android.content.Intent.class
                r20 = r7
                r21 = r27
                r25 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
                android.content.Intent r0 = (android.content.Intent) r0
                return r0
            L_0x0095:
                r8 = 2
                java.lang.String r6 = "activity"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r6)
                java.lang.String r6 = "uri"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r6)
                java.lang.String r6 = "host"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r6)
                java.lang.String r2 = "path"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r2)
                java.lang.String r2 = "fromTokenType"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r2)
                boolean r2 = com.ss.android.g.a.a()
                r6 = 0
                if (r2 == 0) goto L_0x016a
                r2 = r3
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x00c9
                java.lang.String r2 = "/detail/"
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r3, r2, r14, r8, r6)
                if (r2 == 0) goto L_0x00c9
                r2 = 1
                goto L_0x00ca
            L_0x00c9:
                r2 = 0
            L_0x00ca:
                if (r2 == 0) goto L_0x0169
                java.lang.String r2 = r29.getLastPathSegment()
                r3 = r2
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L_0x0151
                if (r2 != 0) goto L_0x00de
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00de:
                java.lang.String r2 = ","
                kotlin.text.Regex r4 = new kotlin.text.Regex
                r4.<init>((java.lang.String) r2)
                java.util.List r2 = r4.split(r3, r14)
                boolean r3 = r2.isEmpty()
                if (r3 != 0) goto L_0x011c
                int r3 = r2.size()
                java.util.ListIterator r3 = r2.listIterator(r3)
            L_0x00f7:
                boolean r4 = r3.hasPrevious()
                if (r4 == 0) goto L_0x011c
                java.lang.Object r4 = r3.previous()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                int r4 = r4.length()
                if (r4 != 0) goto L_0x010d
                r4 = 1
                goto L_0x010e
            L_0x010d:
                r4 = 0
            L_0x010e:
                if (r4 != 0) goto L_0x00f7
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                int r3 = r3.nextIndex()
                int r3 = r3 + r15
                java.util.List r2 = kotlin.collections.CollectionsKt.take(r2, r3)
                goto L_0x0120
            L_0x011c:
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0120:
                java.util.Collection r2 = (java.util.Collection) r2
                if (r2 == 0) goto L_0x0149
                java.lang.String[] r3 = new java.lang.String[r14]
                java.lang.Object[] r2 = r2.toArray(r3)
                if (r2 == 0) goto L_0x0141
                java.lang.String[] r2 = (java.lang.String[]) r2
                int r3 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
                java.lang.String[] r2 = (java.lang.String[]) r2
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r2)
                goto L_0x0151
            L_0x0141:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)
                throw r0
            L_0x0149:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.util.Collection<T>"
                r0.<init>(r1)
                throw r0
            L_0x0151:
                android.content.Intent r2 = new android.content.Intent
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity> r3 = com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.class
                r2.<init>(r0, r3)
                java.lang.String r0 = "extra_stickers"
                java.io.Serializable r6 = (java.io.Serializable) r6
                r2.putExtra(r0, r6)
                com.ss.android.ugc.aweme.app.d$a r0 = com.ss.android.ugc.aweme.app.d.f34105a
                java.lang.String r3 = "prop_detail"
                r0.a(r3, r1, r5)
                return r2
            L_0x0169:
                return r6
            L_0x016a:
                android.content.Intent r2 = new android.content.Intent
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity> r3 = com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.class
                r2.<init>(r0, r3)
                java.lang.String r0 = "id"
                java.lang.String r0 = r1.getQueryParameter(r0)
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x0186
                java.lang.String r0 = r29.getLastPathSegment()
            L_0x0186:
                java.lang.String r3 = "detail"
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
                if (r3 != 0) goto L_0x0196
                java.lang.String r3 = "0"
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
                if (r3 == 0) goto L_0x0197
            L_0x0196:
                r0 = r6
            L_0x0197:
                if (r0 == 0) goto L_0x01b4
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r3.add(r0)
                java.lang.String r0 = "extra_stickers"
                java.io.Serializable r3 = (java.io.Serializable) r3
                r2.putExtra(r0, r3)
                java.lang.String r0 = "from_token"
                r2.putExtra(r0, r4)
                com.ss.android.ugc.aweme.app.d$a r0 = com.ss.android.ugc.aweme.app.d.f34105a
                java.lang.String r3 = "prop_page"
                r0.a(r3, r1, r5)
            L_0x01b4:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.c.y.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsCommands$UserProfileCommand;", "Lcom/ss/android/ugc/aweme/app/AdsCommands$Command;", "()V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "host", "", "path", "fromTokenType", "fromNotification", "", "enterTo", "match", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class z extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34101a;

        @NotNull
        public final String a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f34101a, false, 22216, new Class[]{Uri.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f34101a, false, 22216, new Class[]{Uri.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return "others_homepage";
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34101a, false, 22214, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34101a, false, 22214, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "host");
            Intrinsics.checkParameterIsNotNull(str4, "path");
            return StringsKt.startsWith$default(str3 + str4, "user/profile/", false, 2, null);
        }

        @Nullable
        public final Intent a(@NotNull Activity activity, @NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{activity2, uri2, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34101a, false, 22215, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class)) {
                Object[] objArr = {activity2, uri2, str4, str5, str6, Byte.valueOf(z)};
                return (Intent) PatchProxy.accessDispatch(objArr, this, f34101a, false, 22215, new Class[]{Activity.class, Uri.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            Intrinsics.checkParameterIsNotNull(str4, "host");
            Intrinsics.checkParameterIsNotNull(str5, "path");
            Intrinsics.checkParameterIsNotNull(str6, "fromTokenType");
            String queryParameter = uri2.getQueryParameter("gd_label");
            String lastPathSegment = uri.getLastPathSegment();
            String a2 = c.f33977c.a(lastPathSegment, uri2);
            if (TextUtils.equals(queryParameter, "click_push_fr")) {
                com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "push").a("enter_method", "click_push").a("to_user_id", lastPathSegment).f34114b);
            }
            IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            if (TextUtils.equals(lastPathSegment, a3.getCurUserId())) {
                d.f34105a.a("personal_homepage", uri2, z2);
            } else {
                d.f34105a.a("others_homepage", uri2, z2);
            }
            Intent intent = new Intent(activity2, UserProfileActivity.class);
            String queryParameter2 = uri2.getQueryParameter("from");
            intent.putExtra("uid", lastPathSegment);
            intent.putExtra("sec_user_id", a2);
            intent.putExtra("type", uri2.getQueryParameter("type"));
            intent.putExtra("source_aid", uri2.getQueryParameter("source_aid"));
            intent.putExtra("from_micro_app", queryParameter2);
            if (!com.ss.android.g.a.a()) {
                intent.putExtra("enter_from", uri2.getQueryParameter("enter_from"));
                if (TextUtils.equals(uri2.getQueryParameter("profile_type"), PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                    intent.putExtra("profile_enterprise_type", 1);
                }
                String stringExtra = activity.getIntent().getStringExtra("token_request_id");
                if (TextUtils.isEmpty(stringExtra)) {
                    IAccountUserService a4 = com.ss.android.ugc.aweme.account.d.a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "AccountUserProxyService.get()");
                    if (a4.isLogin() || !Intrinsics.areEqual((Object) "click_push_follow_approve", (Object) queryParameter)) {
                        return intent;
                    }
                    return al.f33763b.a(activity2, intent);
                } else if (!TextUtils.isEmpty(str6)) {
                    ((com.ss.android.ugc.aweme.u.q) new com.ss.android.ugc.aweme.u.q().b(str6).a("click_button")).k(uri.getLastPathSegment()).l(stringExtra).e();
                }
            }
            IAccountUserService a5 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a5, "AccountUserProxyService.get()");
            if (a5.isLogin() || !Intrinsics.areEqual((Object) "click_push_follow_approve", (Object) queryParameter)) {
                return intent;
            }
            return al.f33763b.a(activity2, intent);
        }
    }

    @JvmStatic
    @Nullable
    public static final String a(@Nullable String str, @Nullable Uri uri) {
        String str2 = str;
        Uri uri2 = uri;
        if (!PatchProxy.isSupport(new Object[]{str2, uri2}, null, f33975a, true, 22148, new Class[]{String.class, Uri.class}, String.class)) {
            return f33977c.a(str2, uri2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2, uri2}, null, f33975a, true, 22148, new Class[]{String.class, Uri.class}, String.class);
    }
}
