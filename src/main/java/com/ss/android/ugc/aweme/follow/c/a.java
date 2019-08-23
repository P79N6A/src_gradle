package com.ss.android.ugc.aweme.follow.c;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0004H\u0002J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004J\u0010\u0010+\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u0004H\u0002J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0004J\u001a\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u0004H\u0007J0\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H\u0002J\u0018\u00109\u001a\u00020/2\u0006\u00104\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u0004H\u0002J0\u0010;\u001a\u00020/2\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H\u0002J\u0006\u0010<\u001a\u00020/J\u0010\u0010=\u001a\u00020/2\u0006\u0010(\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/util/FollowFeedLogger;", "", "()V", "CHANNEL_FOLLOW_LIVE", "", "CHANNEL_FOLLOW_STORY", "CHANNEL_FOLLOW_VIDEO", "CHANNEL_FRIEND_STORY", "CHANNEL_FRIEND_VIDEO", "FOLLOW_FEED", "FOLLOW_SMART_FEED", "FRIEND_FEED", "followTabChannelCountArray", "Landroid/util/SparseArray;", "getFollowTabChannelCountArray", "()Landroid/util/SparseArray;", "isFollowFirstFetch", "", "isFriendFirstFetch", "lastLaunchType", "getLastLaunchType", "()I", "setLastLaunchType", "(I)V", "lastLongLinkAuthorId", "", "getLastLongLinkAuthorId", "()J", "setLastLongLinkAuthorId", "(J)V", "lastLongLinkItemId", "getLastLongLinkItemId", "setLastLongLinkItemId", "lastYellowDotRequestId", "", "getLastYellowDotRequestId", "()Ljava/lang/String;", "setLastYellowDotRequestId", "(Ljava/lang/String;)V", "checkFeedFetchState", "feedType", "getChannelCount", "channel", "getFollowFeedEnterFrom", "getLaunchType", "launchType", "handleFollowFeedLog", "", "data", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedList;", "listQueryType", "logFeedNoYellowDot", "feedLogId", "enterFrom", "yellowDotType", "isError", "isLive", "logNumBias", "bias", "logYellowDotNoFeed", "resetFetchState", "setFeedFetchState", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47756a;

    /* renamed from: b  reason: collision with root package name */
    public static int f47757b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static String f47758c = "";

    /* renamed from: d  reason: collision with root package name */
    public static long f47759d;

    /* renamed from: e  reason: collision with root package name */
    public static long f47760e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final SparseArray<Integer> f47761f = new SparseArray<>();
    public static boolean g = true;
    public static boolean h = true;
    public static final a i = new a();

    @NotNull
    public static String a(int i2) {
        switch (i2) {
            case 1:
                return "cold_launch";
            case 2:
                return "link_launch";
            case 4:
                return "refresh_launch";
            case 5:
                return "hot_launch";
            default:
                return "";
        }
    }

    private a() {
    }

    public static int a() {
        return f47757b;
    }

    @NotNull
    public static String b() {
        return f47758c;
    }

    public static long c() {
        return f47759d;
    }

    public static long d() {
        return f47760e;
    }

    public final int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47756a, false, 44754, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47756a, false, 44754, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Integer num = f47761f.get(i2, 0);
        Intrinsics.checkExpressionValueIsNotNull(num, "followTabChannelCountArray.get(channel, 0)");
        return num.intValue();
    }

    public final void a(String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f47756a, false, 44756, new Class[]{String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str4, str5, str6, Byte.valueOf(z), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f47756a, false, 44756, new Class[]{String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a("error_type", "yellow_dot_no_feed");
        a2.a("enter_from", str5);
        a2.a("yellow_dot_logid", f47758c);
        a2.a("feed_logid", str4);
        a2.a("yellow_dot_type", str6);
        a2.a("launch_type", a(f47757b));
        a2.a("is_error", z ? 1 : 0);
        if (!z2) {
            if (f47760e > 0) {
                a2.a("author_id", f47760e);
            }
            if (f47759d > 0) {
                a2.a("group_id", f47759d);
            }
        }
        r.a("homepage_follow_monitor", (Map) a2.f34114b);
    }

    public final void b(String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f47756a, false, 44757, new Class[]{String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str4, str5, str6, Byte.valueOf(z), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f47756a, false, 44757, new Class[]{String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a("error_type", "feed_no_yellow_dot");
        a2.a("enter_from", str5);
        a2.a("yellow_dot_logid", f47758c);
        a2.a("feed_logid", str4);
        a2.a("yellow_dot_type", str6);
        a2.a("launch_type", a(f47757b));
        a2.a("is_error", z ? 1 : 0);
        if (!z2) {
            if (f47760e > 0) {
                a2.a("author_id", f47760e);
            }
            if (f47759d > 0) {
                a2.a("group_id", f47759d);
            }
        }
        r.a("homepage_follow_monitor", (Map) a2.f34114b);
    }
}
