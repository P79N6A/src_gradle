package com.ss.android.ugc.effectmanager.effect.model;

import java.util.List;

public class CategoryEffectModel {
    public String category_key;
    public List<Effect> collection;
    public int cursor;
    public List<Effect> effects;
    public boolean has_more;
    public int sorting_position;
    public String version;

    public void setSortingPosition(int i) {
        this.sorting_position = this.sorting_position;
    }
}
