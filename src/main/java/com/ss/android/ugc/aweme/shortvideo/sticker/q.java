package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.z;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70183a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70184a;

        @NonNull
        public static List<EffectCategoryModel> a(@NonNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, null, f70184a, true, 78675, new Class[]{Context.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{context2}, null, f70184a, true, 78675, new Class[]{Context.class}, List.class);
            }
            ArrayList arrayList = new ArrayList();
            String[] stringArray = context.getResources().getStringArray(C0906R.array.i);
            if ((context2 instanceof AppCompatActivity) && ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) (AppCompatActivity) context2).get(ShortVideoContextViewModel.class)).k()) {
                stringArray = new String[]{"..."};
            }
            for (String str : stringArray) {
                EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
                effectCategoryModel.name = str;
                arrayList.add(effectCategoryModel);
            }
            return arrayList;
        }

        @NonNull
        public static EffectCategoryModel b(@NonNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, null, f70184a, true, 78676, new Class[]{Context.class}, EffectCategoryModel.class)) {
                return (EffectCategoryModel) PatchProxy.accessDispatch(new Object[]{context2}, null, f70184a, true, 78676, new Class[]{Context.class}, EffectCategoryModel.class);
            }
            EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
            effectCategoryModel.name = context2.getString(C0906R.string.cdz);
            effectCategoryModel.id = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            EffectCategoryIconsModel effectCategoryIconsModel = new EffectCategoryIconsModel();
            effectCategoryIconsModel.uri = "res:// /" + 2130839329;
            effectCategoryModel.icon = effectCategoryIconsModel;
            return effectCategoryModel;
        }
    }

    public static HashMap<String, Integer> a(List<ah> list) {
        List<ah> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f70183a, true, 78674, new Class[]{List.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{list2}, null, f70183a, true, 78674, new Class[]{List.class}, HashMap.class);
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (list2 == null) {
            return hashMap;
        }
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list2.get(i).f69295b.effect_id, Integer.valueOf(i));
        }
        return hashMap;
    }

    @NonNull
    public static FaceStickerBean a(@Nullable Effect effect) {
        List list;
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f70183a, true, 78673, new Class[]{Effect.class}, FaceStickerBean.class)) {
            return (FaceStickerBean) PatchProxy.accessDispatch(new Object[]{effect2}, null, f70183a, true, 78673, new Class[]{Effect.class}, FaceStickerBean.class);
        } else if (effect2 == null) {
            return FaceStickerBean.NONE;
        } else {
            FaceStickerBean faceStickerBean = new FaceStickerBean();
            faceStickerBean.setBusi(effect2.is_busi);
            faceStickerBean.setAdRawData(effect2.ad_raw_data);
            faceStickerBean.setFaceStickerCommerceBean((c) new Gson().fromJson(effect2.extra, c.class));
            faceStickerBean.setIconUrl(com.ss.android.ugc.aweme.effectplatform.a.a(effect2.icon_url));
            faceStickerBean.setFileUrl(com.ss.android.ugc.aweme.effectplatform.a.a(effect2.file_url));
            try {
                faceStickerBean.setStickerId(Long.parseLong(effect2.effect_id));
            } catch (NumberFormatException unused) {
                faceStickerBean.setStickerId(-1);
            }
            faceStickerBean.setPropSource(FaceStickerBean.sCurPropSource);
            faceStickerBean.setMusicIds(effect2.music);
            faceStickerBean.setName(effect2.name);
            faceStickerBean.setHint(effect2.hint);
            faceStickerBean.setHintIcon(com.ss.android.ugc.aweme.effectplatform.a.a(effect2.hint_icon));
            faceStickerBean.setLocalPath(effect2.unzipPath);
            if (effect2.types == null) {
                list = new ArrayList();
            } else {
                list = effect2.types;
            }
            faceStickerBean.setTypes(list);
            faceStickerBean.setTags(effect.getTags());
            faceStickerBean.setChildren(effect2.children);
            faceStickerBean.setEffectType(effect2.effect_type);
            faceStickerBean.setParentId(effect2.parent);
            faceStickerBean.setExtra(effect2.extra);
            faceStickerBean.setStickerPoi(new z(effect2.poi_id, effect2.is_poi));
            faceStickerBean.setSdkExtra(effect2.sdk_extra);
            return faceStickerBean;
        }
    }

    static boolean a(r rVar, Effect effect) {
        if (PatchProxy.isSupport(new Object[]{rVar, effect}, null, f70183a, true, 78672, new Class[]{r.class, Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rVar, effect}, null, f70183a, true, 78672, new Class[]{r.class, Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (rVar == null) {
            return true;
        } else {
            return rVar.a(effect);
        }
    }
}
