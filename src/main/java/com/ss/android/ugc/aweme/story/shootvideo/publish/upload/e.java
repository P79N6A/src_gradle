package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.json.JSONArray;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73730a;

    static void a(cb cbVar, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        cb cbVar2 = cbVar;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{cbVar2, linkedHashMap2}, null, f73730a, true, 85466, new Class[]{cb.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cbVar2, linkedHashMap2}, null, f73730a, true, 85466, new Class[]{cb.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        if (Lists.notEmpty(cbVar2.texts)) {
            linkedHashMap2.put("image_text", new JSONArray(cbVar2.texts).toString());
        }
        if (!TextUtils.isEmpty(cbVar.getStickers())) {
            linkedHashMap2.put("stickers", cbVar.getStickers());
        }
        linkedHashMap2.put("original", String.valueOf(cbVar.getOriginal()));
        if (cbVar2.usePaint) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        linkedHashMap2.put("paint", str);
        if (cbVar2.socialModel != null) {
            linkedHashMap2.put("recommend", String.valueOf(cbVar2.socialModel.recommend));
            String friends = cbVar2.socialModel.getFriends();
            if (!TextUtils.isEmpty(friends)) {
                linkedHashMap2.put("im_user_id", friends);
            }
            String recUsers = cbVar2.socialModel.getRecUsers();
            if (!TextUtils.isEmpty(recUsers)) {
                linkedHashMap2.put("rec_user_id", recUsers);
            }
        }
        if (cbVar.hasInfoStickers()) {
            linkedHashMap2.put("info_stickers", cbVar2.infoStickerModel.getInfoStickerIds());
            linkedHashMap2.put("other_sticker", cbVar2.infoStickerModel.getOtherEffect());
        }
        if (!TextUtils.isEmpty(cbVar.getFilterName())) {
            linkedHashMap2.put("filter_name", cbVar.getFilterName());
        }
        if (!TextUtils.isEmpty(cbVar.getFilterIds())) {
            linkedHashMap2.put("filter_id_list", cbVar.getFilterIds());
        }
        linkedHashMap2.put("camera", String.valueOf(cbVar.getCamera()));
        linkedHashMap2.put("prettify", String.valueOf(cbVar.getPrettify()));
        if (!TextUtils.isEmpty(cbVar2.mShootWay)) {
            linkedHashMap2.put("shoot_way", cbVar2.mShootWay);
        }
        if (!TextUtils.isEmpty(cbVar2.mSmoothSkinLabels)) {
            linkedHashMap2.put("smooth", cbVar2.mSmoothSkinLabels);
        }
        if (!TextUtils.isEmpty(cbVar2.mReshapeLabels)) {
            linkedHashMap2.put("shape", cbVar2.mReshapeLabels);
        }
        if (!TextUtils.isEmpty(cbVar2.mEyesLabels)) {
            linkedHashMap2.put("eye", cbVar2.mEyesLabels);
        }
        linkedHashMap2.put("duration", String.valueOf(cbVar2.mVideoLength));
        if (!TextUtils.isEmpty(cbVar2.md5)) {
            linkedHashMap2.put("video_code", String.valueOf(cbVar2.md5));
        }
        if (cbVar2.storyFestivalModel != null) {
            linkedHashMap2.put("trans_result", String.valueOf(cbVar2.storyFestivalModel.getTransResult()));
            linkedHashMap2.put("use_activity_effect", String.valueOf(cbVar2.storyFestivalModel.getUseActivityEffect() ? 1 : 0));
        }
        if (cbVar.getAvetParameter() != null) {
            linkedHashMap2.put("background", cbVar.getAvetParameter().getStorySceneId());
            switch (cbVar.getAvetParameter().getShootMode()) {
                case 6:
                    str2 = "fanfu";
                    break;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    str2 = "jujiao";
                    break;
                default:
                    str2 = "normal";
                    break;
            }
            linkedHashMap2.put("record_mode", str2);
        }
        if (!TextUtils.isEmpty(cbVar2.mainBusinessData)) {
            Collection a2 = b.a(cbVar2.mainBusinessData, d.TRACK_PAGE_RECORD, d.TRACK_PAGE_EDIT);
            if (!CollectionUtils.isEmpty(a2)) {
                linkedHashMap2.put("interaction_stickers", a.D.getRetrofitFactoryGson().toJson((Object) a2));
            }
        }
    }
}
