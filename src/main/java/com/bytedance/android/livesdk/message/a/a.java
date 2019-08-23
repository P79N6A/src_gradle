package com.bytedance.android.livesdk.message.a;

import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.base.model.user.k;
import com.bytedance.android.live.base.model.user.m;
import com.bytedance.android.livesdk.message.model.bk;
import com.bytedance.android.livesdk.message.proto.Common;
import com.bytedance.android.livesdk.message.proto.FlexImageStruct;
import com.bytedance.android.livesdk.message.proto.GiftMessage;
import com.bytedance.android.livesdk.message.proto.Image;
import com.bytedance.android.livesdk.message.proto.Text;
import com.bytedance.android.livesdk.message.proto.TextFormat;
import com.bytedance.android.livesdk.message.proto.TextPiece;
import com.bytedance.android.livesdk.message.proto.TextPieceGift;
import com.bytedance.android.livesdk.message.proto.TextPieceHeart;
import com.bytedance.android.livesdk.message.proto.TextPiecePatternRef;
import com.bytedance.android.livesdk.message.proto.User;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.android.livesdkapi.h.c;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.android.livesdkapi.h.f;
import com.bytedance.android.livesdkapi.h.g;
import com.bytedance.android.livesdkapi.h.h;
import com.bytedance.android.livesdkapi.h.i;
import com.bytedance.android.livesdkapi.h.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16388a;

    private static k a(User.UserAttr userAttr) {
        User.UserAttr userAttr2 = userAttr;
        if (PatchProxy.isSupport(new Object[]{userAttr2}, null, f16388a, true, 10962, new Class[]{User.UserAttr.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{userAttr2}, null, f16388a, true, 10962, new Class[]{User.UserAttr.class}, k.class);
        } else if (userAttr2 == null) {
            return null;
        } else {
            k kVar = new k();
            kVar.f7774c = ((Boolean) Wire.get(userAttr2.is_admin, Boolean.FALSE)).booleanValue();
            kVar.f7773b = ((Boolean) Wire.get(userAttr2.is_muted, Boolean.FALSE)).booleanValue();
            kVar.f7775d = ((Boolean) Wire.get(userAttr2.is_super_admin, Boolean.FALSE)).booleanValue();
            return kVar;
        }
    }

    private static d a(User.Border border) {
        User.Border border2 = border;
        if (PatchProxy.isSupport(new Object[]{border2}, null, f16388a, true, 10963, new Class[]{User.Border.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{border2}, null, f16388a, true, 10963, new Class[]{User.Border.class}, d.class);
        } else if (border2 == null) {
            return null;
        } else {
            d dVar = new d();
            dVar.f7750b = a(border2.icon);
            return dVar;
        }
    }

    private static m a(User.PayGrade payGrade) {
        User.PayGrade payGrade2 = payGrade;
        if (PatchProxy.isSupport(new Object[]{payGrade2}, null, f16388a, true, 10969, new Class[]{User.PayGrade.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{payGrade2}, null, f16388a, true, 10969, new Class[]{User.PayGrade.class}, m.class);
        } else if (payGrade2 == null) {
            return null;
        } else {
            m mVar = new m();
            mVar.j = a(payGrade2.im_icon);
            mVar.k = a(payGrade2.im_icon_with_level);
            mVar.o = (int) ((Long) Wire.get(payGrade2.level, 0L)).longValue();
            mVar.m = a(payGrade2.live_icon);
            mVar.n = a(payGrade2.new_live_icon);
            mVar.l = a(payGrade2.new_im_icon_with_level);
            return mVar;
        }
    }

    public static b a(Common common) {
        Common common2 = common;
        if (PatchProxy.isSupport(new Object[]{common2}, null, f16388a, true, 10970, new Class[]{Common.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{common2}, null, f16388a, true, 10970, new Class[]{Common.class}, b.class);
        } else if (common2 == null) {
            return null;
        } else {
            b bVar = new b();
            bVar.f18775b = ((Long) Wire.get(common2.create_time, 0L)).longValue();
            bVar.f18779f = common2.describe;
            bVar.f18777d = ((Long) Wire.get(common2.msg_id, 0L)).longValue();
            bVar.f18778e = common2.method;
            bVar.i = ((Integer) Wire.get(common2.monitor, 0)).intValue();
            bVar.f18776c = ((Long) Wire.get(common2.room_id, 0L)).longValue();
            bVar.g = ((Boolean) Wire.get(common2.is_show_msg, Boolean.FALSE)).booleanValue();
            bVar.j = a(common2.display_text);
            return bVar;
        }
    }

    public static e a(Text text) {
        Text text2 = text;
        if (PatchProxy.isSupport(new Object[]{text2}, null, f16388a, true, 10971, new Class[]{Text.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{text2}, null, f16388a, true, 10971, new Class[]{Text.class}, e.class);
        } else if (text2 == null) {
            return null;
        } else {
            e eVar = new e();
            eVar.f18782a = text2.key;
            eVar.f18783b = text2.default_pattern;
            eVar.f18784c = a(text2.default_format);
            if (text2.pieces != null && text2.pieces.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (TextPiece next : text2.pieces) {
                    g gVar = new g();
                    gVar.f18790b = a(next.format);
                    gVar.f18789a = ((Integer) Wire.get(next.type, 0)).intValue();
                    if (next.user_value != null) {
                        com.bytedance.android.livesdkapi.h.k kVar = new com.bytedance.android.livesdkapi.h.k();
                        kVar.f18800a = a(next.user_value.user);
                        kVar.f18801b = ((Boolean) Wire.get(next.user_value.with_colon, Boolean.FALSE)).booleanValue();
                        gVar.f18792d = kVar;
                    } else if (next.gift_value != null) {
                        gVar.f18793e = a(next.gift_value);
                    } else if (next.heart_value != null) {
                        gVar.f18794f = a(next.heart_value);
                    } else if (next.pattern_ref_value != null) {
                        gVar.g = a(next.pattern_ref_value);
                    } else {
                        gVar.f18791c = (String) Wire.get(next.string_value, "");
                    }
                    arrayList.add(gVar);
                }
                eVar.f18785d = arrayList;
            }
            return eVar;
        }
    }

    private static i a(TextPieceHeart textPieceHeart) {
        TextPieceHeart textPieceHeart2 = textPieceHeart;
        if (PatchProxy.isSupport(new Object[]{textPieceHeart2}, null, f16388a, true, 10972, new Class[]{TextPieceHeart.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{textPieceHeart2}, null, f16388a, true, 10972, new Class[]{TextPieceHeart.class}, i.class);
        } else if (textPieceHeart2 == null) {
            return null;
        } else {
            i iVar = new i();
            iVar.f18797a = textPieceHeart2.color;
            return iVar;
        }
    }

    private static h a(TextPieceGift textPieceGift) {
        TextPieceGift textPieceGift2 = textPieceGift;
        if (PatchProxy.isSupport(new Object[]{textPieceGift2}, null, f16388a, true, 10973, new Class[]{TextPieceGift.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{textPieceGift2}, null, f16388a, true, 10973, new Class[]{TextPieceGift.class}, h.class);
        } else if (textPieceGift2 == null) {
            return null;
        } else {
            h hVar = new h();
            hVar.f18795a = ((Long) Wire.get(textPieceGift2.gift_id, 0L)).longValue();
            if (textPieceGift2.name_ref != null) {
                c cVar = new c();
                cVar.f18781b = textPieceGift2.name_ref.default_pattern;
                cVar.f18780a = textPieceGift2.name_ref.key;
                hVar.f18796b = cVar;
            }
            return hVar;
        }
    }

    private static j a(TextPiecePatternRef textPiecePatternRef) {
        TextPiecePatternRef textPiecePatternRef2 = textPiecePatternRef;
        if (PatchProxy.isSupport(new Object[]{textPiecePatternRef2}, null, f16388a, true, 10974, new Class[]{TextPiecePatternRef.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{textPiecePatternRef2}, null, f16388a, true, 10974, new Class[]{TextPiecePatternRef.class}, j.class);
        } else if (textPiecePatternRef2 == null) {
            return null;
        } else {
            j jVar = new j();
            jVar.f18799b = textPiecePatternRef2.default_pattern;
            jVar.f18798a = textPiecePatternRef2.key;
            return jVar;
        }
    }

    private static f a(TextFormat textFormat) {
        TextFormat textFormat2 = textFormat;
        if (PatchProxy.isSupport(new Object[]{textFormat2}, null, f16388a, true, 10975, new Class[]{TextFormat.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{textFormat2}, null, f16388a, true, 10975, new Class[]{TextFormat.class}, f.class);
        } else if (textFormat2 == null) {
            return null;
        } else {
            f fVar = new f();
            fVar.f18786a = textFormat2.color;
            fVar.f18787b = ((Boolean) Wire.get(textFormat2.italic, Boolean.FALSE)).booleanValue();
            fVar.f18788c = ((Integer) Wire.get(textFormat2.weight, 0)).intValue();
            return fVar;
        }
    }

    public static bk.a a(GiftMessage.TextEffect.Detail detail) {
        GiftMessage.TextEffect.Detail detail2 = detail;
        if (PatchProxy.isSupport(new Object[]{detail2}, null, f16388a, true, 10980, new Class[]{GiftMessage.TextEffect.Detail.class}, bk.a.class)) {
            return (bk.a) PatchProxy.accessDispatch(new Object[]{detail2}, null, f16388a, true, 10980, new Class[]{GiftMessage.TextEffect.Detail.class}, bk.a.class);
        } else if (detail2 == null) {
            return null;
        } else {
            bk.a aVar = new bk.a();
            aVar.f16581a = a(detail2.text);
            aVar.f16582b = ((Integer) Wire.get(detail2.text_font_size, 0)).intValue();
            aVar.f16583c = a(detail2.background);
            aVar.f16584d = (long) ((Integer) Wire.get(detail2.start, 0)).intValue();
            aVar.f16585e = (long) ((Integer) Wire.get(detail2.duration, 0)).intValue();
            aVar.f16586f = ((Integer) Wire.get(detail2.x, 0)).intValue();
            aVar.g = ((Integer) Wire.get(detail2.y, 0)).intValue();
            aVar.h = ((Integer) Wire.get(detail2.width, 0)).intValue();
            aVar.i = ((Integer) Wire.get(detail2.height, 0)).intValue();
            aVar.m = (String) Wire.get(detail2.shadow_color, "");
            aVar.j = ((Integer) Wire.get(detail2.shadow_dx, 0)).intValue();
            aVar.k = ((Integer) Wire.get(detail2.shadow_dy, 0)).intValue();
            aVar.l = ((Integer) Wire.get(detail2.shadow_radius, 0)).intValue();
            aVar.n = (String) Wire.get(detail2.stroke_color, "");
            aVar.o = ((Integer) Wire.get(detail2.stroke_width, 0)).intValue();
            return aVar;
        }
    }

    public static ImageModel a(FlexImageStruct flexImageStruct) {
        FlexImageStruct flexImageStruct2 = flexImageStruct;
        if (PatchProxy.isSupport(new Object[]{flexImageStruct2}, null, f16388a, true, 10967, new Class[]{FlexImageStruct.class}, ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[]{flexImageStruct2}, null, f16388a, true, 10967, new Class[]{FlexImageStruct.class}, ImageModel.class);
        } else if (flexImageStruct2 == null) {
            return null;
        } else {
            return new ImageModel(flexImageStruct2.uri, flexImageStruct2.url_list);
        }
    }

    private static FansClubMember a(User.FansClub fansClub) {
        User.FansClub fansClub2 = fansClub;
        if (PatchProxy.isSupport(new Object[]{fansClub2}, null, f16388a, true, 10976, new Class[]{User.FansClub.class}, FansClubMember.class)) {
            return (FansClubMember) PatchProxy.accessDispatch(new Object[]{fansClub2}, null, f16388a, true, 10976, new Class[]{User.FansClub.class}, FansClubMember.class);
        }
        HashMap hashMap = null;
        if (fansClub2 == null) {
            return null;
        }
        FansClubMember fansClubMember = new FansClubMember();
        fansClubMember.setData(a(fansClub2.data));
        if (fansClub2.prefer_data != null && !fansClub2.prefer_data.isEmpty()) {
            for (Integer next : fansClub2.prefer_data.keySet()) {
                FansClubData a2 = a(fansClub2.prefer_data.get(next));
                if (a2 != null) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(next, a2);
                }
            }
        }
        fansClubMember.setPreferData(hashMap);
        return fansClubMember;
    }

    public static ImageModel a(Image image) {
        Image image2 = image;
        if (PatchProxy.isSupport(new Object[]{image2}, null, f16388a, true, 10965, new Class[]{Image.class}, ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[]{image2}, null, f16388a, true, 10965, new Class[]{Image.class}, ImageModel.class);
        } else if (image2 == null) {
            return null;
        } else {
            return new ImageModel(image2.uri, image2.url_list, image2.open_web_url);
        }
    }

    private static FansClubData a(User.FansClub.FansClubData fansClubData) {
        User.FansClub.FansClubData fansClubData2 = fansClubData;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{fansClubData2}, null, f16388a, true, 10977, new Class[]{User.FansClub.FansClubData.class}, FansClubData.class)) {
            return (FansClubData) PatchProxy.accessDispatch(new Object[]{fansClubData2}, null, f16388a, true, 10977, new Class[]{User.FansClub.FansClubData.class}, FansClubData.class);
        }
        FansClubData fansClubData3 = null;
        if (fansClubData2 != null) {
            fansClubData3 = new FansClubData();
            fansClubData3.level = ((Integer) Wire.get(fansClubData2.level, 0)).intValue();
            fansClubData3.availableGiftIds = fansClubData2.available_gift_ids;
            fansClubData3.badge = new FansClubData.UserBadge();
            if (!(fansClubData2.badge == null || fansClubData2.badge.icons == null)) {
                fansClubData3.badge.icons = new HashMap();
                for (Integer next : fansClubData2.badge.icons.keySet()) {
                    ImageModel a2 = a(fansClubData2.badge.icons.get(next));
                    if (a2 != null) {
                        fansClubData3.badge.icons.put(next, a2);
                    }
                }
                fansClubData3.badge.title = fansClubData2.badge.title;
            }
            fansClubData3.clubName = fansClubData2.club_name;
            if (fansClubData2.user_fans_club_status != null) {
                i = fansClubData2.user_fans_club_status.getValue();
            }
            fansClubData3.userFansClubStatus = i;
        }
        return fansClubData3;
    }

    public static com.bytedance.android.live.base.model.user.User a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f16388a, true, 10961, new Class[]{User.class}, com.bytedance.android.live.base.model.user.User.class)) {
            return (com.bytedance.android.live.base.model.user.User) PatchProxy.accessDispatch(new Object[]{user2}, null, f16388a, true, 10961, new Class[]{User.class}, com.bytedance.android.live.base.model.user.User.class);
        } else if (user2 == null) {
            return null;
        } else {
            com.bytedance.android.live.base.model.user.User user3 = new com.bytedance.android.live.base.model.user.User();
            user3.setId(((Long) Wire.get(user2.id, 0L)).longValue());
            user3.setNickName(user2.nickname);
            user3.setShortId(((Long) Wire.get(user2.short_id, 0L)).longValue());
            user3.displayId = (String) Wire.get(user2.display_id, "");
            user3.setLevel(((Integer) Wire.get(user2.level, 0)).intValue());
            user3.setGender(((Integer) Wire.get(user2.gender, 0)).intValue());
            user3.setVerified(((Boolean) Wire.get(user2.verified, Boolean.FALSE)).booleanValue());
            user3.setAvatarThumb(a(user2.avatar_thumb));
            user3.setUserHonor(a(user2.pay_grade));
            if (user2.real_time_icons != null && user2.real_time_icons.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (Image a2 : user2.real_time_icons) {
                    arrayList.add(a(a2));
                }
                user3.setUserBadges(arrayList);
            }
            long longValue = ((Long) Wire.get(user2.top_vip_no, 0L)).longValue();
            if (user2.new_real_time_icons != null && user2.new_real_time_icons.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (Image a3 : user2.new_real_time_icons) {
                    arrayList2.add(a(a3));
                }
                user3.setNewUserBadges(arrayList2);
            }
            user3.setBorder(a(user2.border));
            user3.setTopVipNo((int) longValue);
            user3.setFansClub(a(user2.fans_club));
            user3.setSpecialId(user2.special_id);
            user3.setAvatarBorder(a(user2.avatar_border));
            user3.setMedal(a(user2.medal));
            user3.setUserAttr(a(user2.user_attr));
            user3.setUserRole(((Integer) Wire.get(user2.user_role, 0)).intValue());
            return user3;
        }
    }
}
