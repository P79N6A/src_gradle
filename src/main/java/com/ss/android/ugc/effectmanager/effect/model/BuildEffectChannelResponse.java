package com.ss.android.ugc.effectmanager.effect.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildEffectChannelResponse {
    private String mFileDirectory;
    private boolean mIsCache;
    private String mPanel;

    private void fillEffectPath(List<Effect> list) {
        if (list != null && !list.isEmpty()) {
            for (Effect next : list) {
                next.zipPath = this.mFileDirectory + File.separator + next.id + ".zip";
                StringBuilder sb = new StringBuilder();
                sb.append(this.mFileDirectory);
                sb.append(File.separator);
                sb.append(next.id);
                next.unzipPath = sb.toString();
            }
        }
    }

    public EffectChannelResponse buildChannelResponse(EffectChannelModel effectChannelModel) {
        System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Effect next : effectChannelModel.effects) {
            hashMap.put(next.effect_id, next);
        }
        for (Effect next2 : effectChannelModel.collection) {
            hashMap2.put(next2.effect_id, next2);
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse();
        effectChannelResponse.panel = this.mPanel;
        effectChannelResponse.version = effectChannelModel.version;
        effectChannelResponse.allCategoryEffects = effectChannelModel.effects;
        effectChannelResponse.collections = effectChannelModel.collection;
        effectChannelResponse.urlPrefix = effectChannelModel.url_prefix;
        effectChannelResponse.categoryResponseList = initCategory(effectChannelModel, hashMap);
        getChildEffect(effectChannelModel.effects, hashMap2);
        effectChannelResponse.setPanelModel(effectChannelModel.panel);
        effectChannelResponse.frontEffect = getEffect(effectChannelModel.front_effect_id, hashMap);
        effectChannelResponse.rearEffect = getEffect(effectChannelModel.rear_effect_id, hashMap);
        if (!this.mIsCache) {
            fillEffectPath(effectChannelModel.effects);
            fillEffectPath(effectChannelModel.collection);
        }
        return effectChannelResponse;
    }

    private Effect getEffect(String str, Map<String, Effect> map) {
        return map.get(str);
    }

    private List<Effect> getCategoryAllEffects(EffectCategoryModel effectCategoryModel, Map<String, Effect> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : effectCategoryModel.effects) {
            Effect effect = map.get(str);
            if (effect != null) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    private void getChildEffect(List<Effect> list, Map<String, Effect> map) {
        for (Effect next : list) {
            if (next.effect_type == 1) {
                ArrayList arrayList = new ArrayList();
                for (String str : next.children) {
                    Effect effect = map.get(str);
                    if (effect != null) {
                        arrayList.add(effect);
                    }
                }
                next.childEffects = arrayList;
            }
        }
    }

    private List<EffectCategoryResponse> initCategory(EffectChannelModel effectChannelModel, Map<String, Effect> map) {
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.category.isEmpty()) {
            for (EffectCategoryModel next : effectChannelModel.category) {
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
                effectCategoryResponse.id = next.id;
                effectCategoryResponse.name = next.name;
                effectCategoryResponse.key = next.key;
                if (!next.icon.url_list.isEmpty()) {
                    effectCategoryResponse.icon_normal_url = next.icon.url_list.get(0);
                }
                if (!next.icon_selected.url_list.isEmpty()) {
                    effectCategoryResponse.icon_selected_url = next.icon_selected.url_list.get(0);
                }
                effectCategoryResponse.totalEffects = getCategoryAllEffects(next, map);
                effectCategoryResponse.tags = next.tags;
                effectCategoryResponse.tagsUpdateTime = next.tags_updated_at;
                effectCategoryResponse.collectionEffect = effectChannelModel.collection;
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    public BuildEffectChannelResponse(String str, String str2, boolean z) {
        this.mPanel = str;
        this.mFileDirectory = str2;
        this.mIsCache = z;
    }
}
