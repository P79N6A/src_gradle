package com.ss.android.ugc.aweme.im.sdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.o;
import com.bytedance.im.core.proto.GroupRole;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommandShareContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommonRedEnvelopeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCouponContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodWindowContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StickerEmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoRedEnvelopeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoRedEnvelopeNewYearContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoUpdateTipsContent;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.HashMap;
import java.util.Map;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52467a;

    /* renamed from: b  reason: collision with root package name */
    private static long f52468b;

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f52467a, true, 53658, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f52467a, true, 53658, new Class[0], Integer.TYPE)).intValue();
        }
        if (m.a()) {
            return 6000;
        }
        return 500;
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f52467a, true, 53662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f52467a, true, 53662, new Class[0], Void.TYPE);
            return;
        }
        c.a();
        if (c.a(m.a() ^ true ? 1 : 0) && SystemClock.uptimeMillis() - f52468b > 10000) {
            f52468b = SystemClock.uptimeMillis();
            c.a().b(4);
        }
    }

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f52467a, true, 53663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f52467a, true, 53663, new Class[0], Void.TYPE);
            return;
        }
        c.a();
        if (c.a(m.a() ^ true ? 1 : 0) && SystemClock.uptimeMillis() - f52468b > 2000) {
            f52468b = SystemClock.uptimeMillis();
            c.a().b(3);
        }
    }

    public static void d() {
        if (PatchProxy.isSupport(new Object[0], null, f52467a, true, 53664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f52467a, true, 53664, new Class[0], Void.TYPE);
            return;
        }
        c.a();
        if (c.a(m.a() ^ true ? 1 : 0) && SystemClock.uptimeMillis() - f52468b > 5000) {
            f52468b = SystemClock.uptimeMillis();
            c.a().e();
        }
    }

    public static void b(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, null, f52467a, true, 53653, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, null, f52467a, true, 53653, new Class[]{n.class}, Void.TYPE);
        } else if (nVar != null) {
            o.d(nVar);
        }
    }

    public static void c(n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, null, f52467a, true, 53654, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, null, f52467a, true, 53654, new Class[]{n.class}, Void.TYPE);
            return;
        }
        a(nVar2, null);
    }

    public static void a(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, null, f52467a, true, 53652, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, null, f52467a, true, 53652, new Class[]{n.class}, Void.TYPE);
            return;
        }
        if (nVar != null) {
            o.e(nVar);
        }
    }

    public static long d(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, null, f52467a, true, 53656, new Class[]{n.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{nVar}, null, f52467a, true, 53656, new Class[]{n.class}, Long.TYPE)).longValue();
        } else if (nVar == null) {
            return -1;
        } else {
            try {
                return Long.valueOf(nVar.getExt().get("old_client_message_id")).longValue();
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public static boolean e(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, null, f52467a, true, 53659, new Class[]{n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, null, f52467a, true, 53659, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
        }
        Map<String, String> ext = nVar.getExt();
        if (ext == null || !ext.containsKey("source_aid")) {
            return false;
        }
        return TextUtils.equals(ext.get("source_aid"), "1349");
    }

    public static boolean f(n nVar) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{nVar}, null, f52467a, true, 53660, new Class[]{n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, null, f52467a, true, 53660, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
        } else if (nVar == null) {
            return false;
        } else {
            if (nVar.getMsgType() == 1002) {
                try {
                    if (((SayHelloContent) m.content(nVar)).getType() == 100200) {
                        z = true;
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
            return z;
        }
    }

    public static String h(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, null, f52467a, true, 53667, new Class[]{n.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{nVar}, null, f52467a, true, 53667, new Class[]{n.class}, String.class);
        }
        String str = "";
        int msgType = nVar.getMsgType();
        if (msgType != 2) {
            if (msgType == 5) {
                BaseContent content = m.content(nVar);
                if (content.getType() == 501) {
                    str = "favoriate_emoji";
                } else if (content.getType() == 502) {
                    str = "giphy";
                } else {
                    str = "emoji";
                }
            } else if (msgType == 7) {
                str = "text";
            } else if (msgType == 17) {
                str = "audio";
            } else if (msgType != 27) {
                if (msgType == 30) {
                    str = "video";
                }
            }
            return str;
        }
        str = "pic";
        return str;
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52467a, true, 53657, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f52467a, true, 53657, new Class[]{String.class}, String.class);
        }
        String str3 = "";
        if (TextUtils.equals(str2, "aweme")) {
            str3 = "video";
        } else if (TextUtils.equals(str2, "pic")) {
            str3 = "pic";
        } else if (TextUtils.equals(str2, "gif")) {
            str3 = "gif";
        } else if (TextUtils.equals(str2, "text")) {
            str3 = "text";
        } else if (TextUtils.equals(str2, "music")) {
            str3 = "music_card";
        } else if (TextUtils.equals(str2, "poi")) {
            str3 = "poi_card";
        } else if (TextUtils.equals(str2, "challenge")) {
            str3 = "tag_card";
        } else if (TextUtils.equals(str2, "ranking")) {
            str3 = "hot_search_card";
        } else if (TextUtils.equals(str2, "game")) {
            str3 = "game";
        } else if (TextUtils.equals(str2, AllStoryActivity.f73306b)) {
            str3 = "profile";
        } else if (TextUtils.equals(str2, "live")) {
            str3 = "live";
        } else if (TextUtils.equals(str2, "web")) {
            str3 = f.f34167a;
        } else if (TextUtils.equals(str2, "coupon")) {
            str3 = "poi_coupon";
        }
        return str3;
    }

    public static boolean g(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, null, f52467a, true, 53666, new Class[]{n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, null, f52467a, true, 53666, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
        }
        if (nVar.getConversationType() == d.a.f20887b && nVar.isRecalled() && nVar.getExt() != null && nVar.getExt().containsKey("s:recall_role")) {
            String str = nVar.getExt().get("s:recall_role");
            if (!TextUtils.isEmpty(str)) {
                int intValue = Integer.valueOf(str).intValue();
                if (intValue == GroupRole.OWNER.getValue() || intValue == GroupRole.MANAGER.getValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int a(BaseContent baseContent) {
        String str;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{baseContent2}, null, f52467a, true, 53651, new Class[]{BaseContent.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{baseContent2}, null, f52467a, true, 53651, new Class[]{BaseContent.class}, Integer.TYPE)).intValue();
        } else if (baseContent2 instanceof TextContent) {
            return 7;
        } else {
            if (baseContent2 instanceof SystemContent) {
                return 1;
            }
            if (baseContent2 instanceof SharePictureContent) {
                return 12;
            }
            if (baseContent2 instanceof ShareMusicContent) {
                return 22;
            }
            if (baseContent2 instanceof ShareAwemeContent) {
                return 8;
            }
            if (baseContent2 instanceof CommandShareContent) {
                return 13;
            }
            if (baseContent2 instanceof StoryPictureContent) {
                return 27;
            }
            if (baseContent2 instanceof OnlyPictureContent) {
                return 2;
            }
            if (baseContent2 instanceof EmojiContent) {
                if (baseContent2 instanceof StickerEmojiContent) {
                    return 51;
                }
                return 5;
            } else if (baseContent2 instanceof VideoUpdateTipsContent) {
                return 14;
            } else {
                if (baseContent2 instanceof CommentContent) {
                    return 16;
                }
                if (baseContent2 instanceof AudioContent) {
                    return 17;
                }
                if (baseContent2 instanceof SharePoiContent) {
                    return 20;
                }
                if (baseContent2 instanceof ShareCouponContent) {
                    return 28;
                }
                if (baseContent2 instanceof ShareRankingListContent) {
                    if (baseContent.getType() == 2301) {
                        return 23;
                    }
                    return 18;
                } else if (baseContent2 instanceof ShareChallengeContent) {
                    return 19;
                } else {
                    if (baseContent2 instanceof ShareMiniAppContent) {
                        return 24;
                    }
                    if (baseContent2 instanceof ShareLiveContent) {
                        return 21;
                    }
                    if (baseContent2 instanceof ShareUserContent) {
                        return 25;
                    }
                    if (baseContent2 instanceof ShareWebContent) {
                        return 26;
                    }
                    if (baseContent2 instanceof StoryVideoContent) {
                        return 30;
                    }
                    if (baseContent2 instanceof StoryReplyContent) {
                        return 32;
                    }
                    if (baseContent2 instanceof CommonRedEnvelopeContent) {
                        return 35;
                    }
                    if (baseContent2 instanceof VideoRedEnvelopeContent) {
                        return 36;
                    }
                    if (baseContent2 instanceof VideoRedEnvelopeNewYearContent) {
                        return 38;
                    }
                    if (baseContent2 instanceof SelfStoryReplyContent) {
                        return 53;
                    }
                    if (baseContent2 instanceof ShareGoodContent) {
                        return 61;
                    }
                    if (baseContent2 instanceof ShareGoodWindowContent) {
                        return 62;
                    }
                    if (baseContent2 instanceof EPlatformCardContent) {
                        return 70;
                    }
                    if (baseContent2 instanceof GroupInviteContent) {
                        return 58;
                    }
                    if (baseContent2 instanceof GroupNoticeContent) {
                        return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
                    }
                    if (!a.a().f3373c.f52860a) {
                        HashMap hashMap = new HashMap();
                        if (baseContent2 != null) {
                            try {
                                str = l.a(baseContent);
                            } catch (Exception e2) {
                                hashMap.put("error", e2.getMessage());
                            }
                        } else {
                            str = "";
                        }
                        hashMap.put("error", str);
                        d.a("error_msg_content", hashMap);
                        return -1;
                    }
                    throw new IllegalArgumentException("Message Type is NONE!!!");
                }
            }
        }
    }

    public static void a(n nVar, b<n> bVar) {
        String str;
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2, bVar}, null, f52467a, true, 53655, new Class[]{n.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2, bVar}, null, f52467a, true, 53655, new Class[]{n.class, b.class}, Void.TYPE);
        } else if (nVar2 != null) {
            Map<String, String> ext = nVar.getExt();
            if (!ext.containsKey("old_client_message_id")) {
                ext.put("old_client_message_id", String.valueOf(f.a()));
            }
            if (d.a(String.valueOf(e.a(nVar.getConversationId())))) {
                if (7 == nVar.getMsgType()) {
                    str = "message";
                } else if (5 == nVar.getMsgType() || 2 == nVar.getMsgType()) {
                    str = "chat_pic";
                } else {
                    str = "insite_share";
                }
                z.a().a(str);
                nVar2.setMsgStatus(2);
            }
            o.a(nVar, bVar);
        }
    }
}
