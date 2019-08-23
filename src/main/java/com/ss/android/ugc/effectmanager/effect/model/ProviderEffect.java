package com.ss.android.ugc.effectmanager.effect.model;

public class ProviderEffect {
    public String click_url;
    public String id;
    public String path;
    public StickerBean sticker;
    public StickerBean thumbnail_sticker;
    public String title;

    public class StickerBean {
        public String height;
        public String size;
        public String url;
        public String width;

        public String toString() {
            return "StickerBean{url='" + this.url + '\'' + ", width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", size='" + this.size + '\'' + '}';
        }

        public StickerBean() {
        }
    }

    public String toString() {
        return "StickerListBean{id='" + this.id + '\'' + ", title='" + this.title + '\'' + ", thumbnail_sticker=" + this.thumbnail_sticker + ", sticker=" + this.sticker + ", path='" + this.path + '\'' + '}';
    }
}
