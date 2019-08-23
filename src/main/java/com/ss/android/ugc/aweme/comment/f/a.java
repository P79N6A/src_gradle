package com.ss.android.ugc.aweme.comment.f;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.ab;
import com.ss.android.ugc.aweme.video.o;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36440a;

    public static void a(String str, Aweme aweme, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str;
        Aweme aweme2 = aweme;
        int i2 = i;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        if (PatchProxy.isSupport(new Object[]{str9, aweme2, str2, Integer.valueOf(i), str10, str11, str12, str13, str14, str15}, null, f36440a, true, 27369, new Class[]{String.class, Aweme.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str9, aweme2, str2, Integer.valueOf(i), str10, str11, str12, str13, str14, str15}, null, f36440a, true, 27369, new Class[]{String.class, Aweme.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            d a2 = d.a();
            a2.a(com.ss.android.ugc.aweme.forward.e.a.a(str, aweme));
            a2.a(com.ss.android.ugc.aweme.forward.e.a.b(aweme, str2));
            a2.a("previous_page", str15);
            if (aweme.getStatistics() != null) {
                a2.a("outter_comment_cnt", String.valueOf(aweme.getStatistics().getCommentCount()));
            }
            if ("homepage_country".equals(str9) && aweme.getAuthor() != null) {
                a2.a("country_name", aweme.getAuthor().getRegion());
            }
            if (i2 != 0) {
                a2.a("is_long_item", i2);
            }
            if (!TextUtils.isEmpty(str4)) {
                a2.a("enter_method", str11);
            }
            if (!TextUtils.isEmpty(str3)) {
                a2.a("trigger_comment_id", str10);
            }
            if (aweme.getPoiStruct() != null) {
                a2.a("poi_id", aweme.getPoiStruct().poiId);
            }
            if (!TextUtils.isEmpty(str5)) {
                a2.a("playlist_type", str12);
            }
            if (!TextUtils.isEmpty(str7)) {
                a2.a(str13, str14);
            }
            a2.a("position", o.b().c());
            a2.a("impr_type", aa.s(aweme));
            if (aa.d(str)) {
                a2.a("log_pb", ai.a().a(aa.c(aweme)));
                a2.a("play_mode", AwemeAppData.p().ap ? "auto" : "normal");
                h.b(aweme2, "click_comment_button", a2);
                return;
            }
            h.a(aweme2, "click_comment_button", a2);
        }
    }

    public static void a(String str, String str2, long j) {
        String str3 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str3, new Long(j2)}, null, f36440a, true, 27370, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str3, new Long(j2)}, null, f36440a, true, 27370, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        r.a("close_comment", (Map) a(str, str2).a("duration", j2).f34114b);
        r.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName("comment_page").setExtValueString(str3).setValue(String.valueOf(j)));
        r.a(com.ss.android.ugc.aweme.base.utils.d.a(), "close_comment", "click_shadow", 0, 0);
    }

    public static void a(String str, Aweme aweme, String str2, String str3) {
        String str4 = str;
        Aweme aweme2 = aweme;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, aweme2, str5, str6}, null, f36440a, true, 27371, new Class[]{String.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str4, aweme2, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36440a, true, 27371, new Class[]{String.class, Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a(com.ss.android.ugc.aweme.forward.e.a.a(str, aweme)).a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, str6)).a("comment_category", str5);
        if ("homepage_country".equals(str4) && aweme.getAuthor() != null) {
            a2.a("country_name", aweme.getAuthor().getRegion());
        }
        r.a("enter_text", (Map) a2.f34114b);
    }

    public static void a(String str, Aweme aweme, long j, String str2) {
        String str3 = str;
        Aweme aweme2 = aweme;
        long j2 = j;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, aweme2, new Long(j2), str4}, null, f36440a, true, 27372, new Class[]{String.class, Aweme.class, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str3, aweme2, new Long(j2), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36440a, true, 27372, new Class[]{String.class, Aweme.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a(com.ss.android.ugc.aweme.forward.e.a.a(str, aweme)).a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, str4)).a("stay_time", j2);
        if ("homepage_country".equals(str3) && aweme.getAuthor() != null) {
            a2.a("country_name", aweme.getAuthor().getRegion());
        }
        r.a("close_text", (Map) a2.f34114b);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        String str6 = str2;
        String str7 = str4;
        String str8 = str5;
        if (PatchProxy.isSupport(new Object[]{str, str6, str3, str7, str8, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f36440a, true, 27376, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str6, str3, str7, str8, Byte.valueOf(z), Byte.valueOf(z2)}, null, f36440a, true, 27376, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str, str6, str3, str7, str8, Byte.valueOf(z), Byte.valueOf(z2), (byte) 0}, null, f36440a, true, 27377, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str6, str3, str7, str8, Byte.valueOf(z), Byte.valueOf(z2), (byte) 0}, null, f36440a, true, 27377, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if ("opus".equals(str6) || "collection".equals(str6)) {
            str6 = z ? "personal_homepage" : "others_homepage";
        }
        String str9 = str6;
        r.a(com.ss.android.ugc.aweme.base.utils.d.a(), str, str9, str3, 0, c.a().a("reply_uid", str8).a("reply_comment_id", str7).a("is_photo", Integer.valueOf(z2 ? 1 : 0)).a("is_retry", (Integer) 0).b());
    }

    public static void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f36440a, true, 27378, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f36440a, true, 27378, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        r.a(com.ss.android.ugc.aweme.base.utils.d.a(), "comment_at", str4, str5, str6);
    }

    public static void a(String str, int i, String str2, String str3, String str4) {
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str5, str6, str7}, null, f36440a, true, 27380, new Class[]{String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str5, str6, str7}, null, f36440a, true, 27380, new Class[]{String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (i == 2) {
            c a2 = c.a().a("group_id", str6).a("enter_from", str5).a("author_id", str7);
            r.a(com.ss.android.ugc.aweme.base.utils.d.a(), "emoji_shortcut_click", str2, str3, 0, a2.b());
            r.a("emoji_shortcut_click", (Map) d.a().a("enter_from", str5).a("group_id", str6).a("author_id", str7).f34114b);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, null, f36440a, true, 27381, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str7, str8}, null, f36440a, true, 27381, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        c a2 = c.a().a("return_method", str5).a("group_id", str7).a("enter_from", str6).a("author_id", str8);
        r.a(com.ss.android.ugc.aweme.base.utils.d.a(), "emoji_to_keyboard", str2, str3, 0, a2.b());
        r.a("emoji_to_keyboard", (Map) d.a().a("enter_from", str6).a("return_method", str5).a("group_id", str7).a("author_id", str8).f34114b);
    }

    public static void a(String str, Aweme aweme, String str2, String str3, String str4) {
        String str5 = str;
        Aweme aweme2 = aweme;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, aweme2, str6, str7, str8}, null, f36440a, true, 27384, new Class[]{String.class, Aweme.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, aweme2, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36440a, true, 27384, new Class[]{String.class, Aweme.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a(com.ss.android.ugc.aweme.forward.e.a.a(str, aweme)).a(com.ss.android.ugc.aweme.forward.e.a.a(aweme2, str5)).a("comment_id", str6).a("enter_method", str8).a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, str7));
        if ("homepage_country".equals(str5) && aweme.getAuthor() != null) {
            a2.a("country_name", aweme.getAuthor().getRegion());
        }
        r.a("report_comment", (Map) a2.f34114b);
    }

    public static void a(String str, String str2, String str3, Aweme aweme) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, aweme2}, null, f36440a, true, 27385, new Class[]{String.class, String.class, String.class, Aweme.class}, Void.TYPE)) {
            Object[] objArr = {str4, str5, str6, aweme2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36440a, true, 27385, new Class[]{String.class, String.class, String.class, Aweme.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a(com.ss.android.ugc.aweme.forward.e.a.a(str4, aweme2)).a("comment_id", str6).a("to_user_id", str5);
        r.a("copy_comment", (Map) a2.f34114b);
    }

    public static void a(String str, Aweme aweme, String str2, boolean z, String str3) {
        String str4 = str;
        Aweme aweme2 = aweme;
        String str5 = str2;
        boolean z2 = z;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, aweme2, str5, Byte.valueOf(z ? (byte) 1 : 0), str6}, null, f36440a, true, 27388, new Class[]{String.class, Aweme.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str4, aweme2, str5, Byte.valueOf(z), str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36440a, true, 27388, new Class[]{String.class, Aweme.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a().a(com.ss.android.ugc.aweme.forward.e.a.a(str, aweme)).a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, str6)).a("is_success", z2 ? 1 : 0);
        if ("homepage_country".equals(str4) && aweme.getAuthor() != null) {
            a2.a("country_name", aweme.getAuthor().getRegion());
        }
        if (z2) {
            a2.a("comment_id", str5);
        }
        if (aa.d(str)) {
            a2.a("log_pb", ai.a().a(aa.c(aweme)));
            r.a("like_comment", aa.a(a2.f34114b));
            return;
        }
        r.a("like_comment", (Map) a2.f34114b);
    }

    public static void a(String str, String str2, String str3, int i, String str4, int i2, long j, String str5) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, Integer.valueOf(i), str4, Integer.valueOf(i2), new Long(j2), str5}, null, f36440a, true, 27390, new Class[]{String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, Integer.valueOf(i), str4, Integer.valueOf(i2), new Long(j2), str5}, null, f36440a, true, 27390, new Class[]{String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(str, str2, str3, i, str4, i2, j, str5, 0);
    }

    public static void a(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, int i3) {
        String str6 = str3;
        String str7 = str4;
        long j2 = j;
        String str8 = str5;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{str, str2, str6, Integer.valueOf(i), str7, Integer.valueOf(i2), new Long(j2), str8, Integer.valueOf(i3)}, null, f36440a, true, 27391, new Class[]{String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str6, Integer.valueOf(i), str7, Integer.valueOf(i2), new Long(j2), str8, Integer.valueOf(i3)}, null, f36440a, true, 27391, new Class[]{String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a(com.ss.android.ugc.aweme.base.utils.d.a(), "comment_duration", str, str2, str3, c.a().a("duration", Long.valueOf(j)).b());
        d a2 = a(str, str2).a("parent_comment_id", str6).a("parent_position", i).a("duration", j2);
        if (!TextUtils.isEmpty(str4)) {
            a2.a("secondary_comment_id", str7).a("secondary_position", i2);
        }
        if (i4 != 0) {
            a2.a("is_long_item", i4);
        }
        if (aa.d(str)) {
            a2.a("log_pb", ai.a().a(str8));
            r.a("comment_duration", aa.a(a2.f34114b));
            return;
        }
        r.a("comment_duration", (Map) a2.f34114b);
    }

    public static String a(Comment comment) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{comment}, null, f36440a, true, 27397, new Class[]{Comment.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{comment}, null, f36440a, true, 27397, new Class[]{Comment.class}, String.class);
        } else if (comment == null) {
            return "original";
        } else {
            String replyId = comment.getReplyId();
            boolean isEmpty = CollectionUtils.isEmpty(comment.getReplyComments());
            if (comment.getCommentType() != 0) {
                z = false;
            }
            if (!z && !TextUtils.isEmpty(replyId) && !TextUtils.equals(replyId, PushConstants.PUSH_TYPE_NOTIFY)) {
                return "reply_to_reply";
            }
            if (z || isEmpty) {
                return "reply";
            }
            return "original";
        }
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f36440a, true, 27386, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f36440a, true, 27386, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a("enter_from", str2);
        a2.a("enter_method", "click_blank");
        r.a("close_comment_tab", (Map) a2.f34114b);
    }

    public static d a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f36440a, true, 27396, new Class[]{String.class, String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f36440a, true, 27396, new Class[]{String.class, String.class}, d.class);
        }
        d a2 = d.a();
        a2.a("enter_from", str3).a("group_id", str4);
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str4);
        if (b2 != null) {
            a2.a("author_id", b2.getAuthorUid());
        }
        return a2;
    }

    public static void b(String str, String str2, String str3) {
        String str4 = str3;
        if (PatchProxy.isSupport(new Object[]{str, str2, str4}, null, f36440a, true, 27393, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str4}, null, f36440a, true, 27393, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = a(str, str2);
        a2.a("parent_comment_id", str4);
        r.a("hide_all_reply", (Map) a2.f34114b);
    }

    public static void c(String str, String str2, String str3) {
        String str4 = str3;
        if (PatchProxy.isSupport(new Object[]{str, str2, str4}, null, f36440a, true, 27394, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str4}, null, f36440a, true, 27394, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = a(str, str2);
        a2.a("parent_comment_id", str4);
        r.a("show_more_reply", (Map) a2.f34114b);
    }

    public static void b(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, null, f36440a, true, 27395, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f36440a, true, 27395, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (AbTestManager.a().bZ()) {
            d a2 = a(str, str2);
            a2.a("enter_from", str5);
            a2.a("group_id", str6);
            a2.a("author_id", str7);
            a2.a("comment_id", str8);
            r.a("creator_like_comment_show", (Map) a2.f34114b);
        }
    }

    public static void a(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        if (PatchProxy.isSupport(new Object[]{aweme, str, str2, str3, str4, str5, str6, 0, str7}, null, f36440a, true, 27374, new Class[]{Aweme.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str, str2, str3, str4, str5, str6, 0, str7}, null, f36440a, true, 27374, new Class[]{Aweme.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(aweme, str, str2, str3, str4, str5, str6, 0, "", "", "", "", false);
    }

    public static void a(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, boolean z) {
        Aweme aweme2 = aweme;
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        if (PatchProxy.isSupport(new Object[]{aweme2, str11, str12, str13, str14, str15, str16, Integer.valueOf(i), str17, str18, str19, str20, Byte.valueOf(z ? (byte) 1 : 0)}, null, f36440a, true, 27375, new Class[]{Aweme.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str11, str12, str13, str14, str15, str16, Integer.valueOf(i), str17, str18, str19, str20, Byte.valueOf(z)}, null, f36440a, true, 27375, new Class[]{Aweme.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        new ab().c(str11).a(str12).b(str12).m(str17).f(aweme2).e(str13).l(str20).k(str19).i(str18).g(str14).h(str15).a(z).f(str16).a(i).e();
    }
}
