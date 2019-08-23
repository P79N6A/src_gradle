package com.rocket.android.model;

import android.support.annotation.NonNull;

public final class ShareData {
    private int aid;
    private String cover_image;
    private String desc;
    private String groupId;
    private String link;
    private String schema;
    private String source;
    private int style;
    private String title;

    @NonNull
    public final int getAid() {
        return this.aid;
    }

    @NonNull
    public final String getCover_image() {
        return this.cover_image;
    }

    @NonNull
    public final String getDesc() {
        return this.desc;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    @NonNull
    public final String getLink() {
        return this.link;
    }

    public final String getSchema() {
        return this.schema;
    }

    @NonNull
    public final String getSource() {
        return this.source;
    }

    public final int getStyle() {
        return this.style;
    }

    @NonNull
    public final String getTitle() {
        return this.title;
    }

    public final void setAid(@NonNull int i) {
        this.aid = i;
    }

    public final void setCover_image(String str) {
        this.cover_image = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public ShareData(@NonNull String str, int i, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, String str6) {
        this.link = str;
        this.style = i;
        this.title = str2;
        this.cover_image = str3;
        this.desc = str4;
        this.source = str5;
        this.schema = str6;
    }

    public ShareData(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, String str6, @NonNull int i, String str7) {
        this.link = str;
        this.title = str2;
        this.cover_image = str3;
        this.desc = str4;
        this.source = str5;
        this.schema = str6;
        this.aid = i;
        this.groupId = str7;
    }

    public ShareData(@NonNull String str, int i, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, String str6, @NonNull int i2, String str7) {
        this.link = str;
        this.style = i;
        this.title = str2;
        this.cover_image = str3;
        this.desc = str4;
        this.source = str5;
        this.schema = str6;
        this.aid = i2;
        this.groupId = str7;
    }
}
