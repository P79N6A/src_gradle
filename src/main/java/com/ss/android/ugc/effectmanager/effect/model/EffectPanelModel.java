package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

public class EffectPanelModel {
    public UrlModel icon;
    public String id;
    public List<String> tags;
    public String tags_updated_at;
    public String text;

    public EffectPanelModel() {
        if (this.icon == null) {
            this.icon = new UrlModel();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public boolean checkValued() {
        if (this.icon == null) {
            this.icon = new UrlModel();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        return true;
    }

    public EffectPanelModel(String str, UrlModel urlModel, List<String> list, String str2) {
        this.text = str;
        this.icon = urlModel;
        this.tags = list;
        this.tags_updated_at = str2;
    }
}
