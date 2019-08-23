package com.ss.android.ugc.effectmanager.effect.model;

import java.util.List;

public class ProviderEffectModel {
    public int cursor;
    public boolean has_more;
    public String search_tips;
    public List<ProviderEffect> sticker_list;

    public String toString() {
        return "ProviderEffectModel{search_tips='" + this.search_tips + '\'' + ", cursor=" + this.cursor + ", has_more=" + this.has_more + '}';
    }
}
