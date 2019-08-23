package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class PopupSetting extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("count")
    public int count;
    @SerializedName("id")
    public String id;
    @SerializedName("text")
    public PopupText popupText;
    @SerializedName("show_time")
    public int show_time;

    public static class ButtonActionStruct {
        public ButtonActionType actionType;
        public String target;
    }

    public enum ButtonActionType {
        ACTION_DEFAULT(1),
        ACTION_TOAST(2),
        ACTION_OPEN_URL(3),
        ACTION_CANCEL(4);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int value;

        private ButtonActionType(int i) {
            this.value = i;
        }
    }

    public static class ButtonStruct {
        @SerializedName("action")
        public ButtonActionStruct buttonActionStruct;
        @SerializedName("style")
        public StyleType style;
        @SerializedName("text")
        public String text;
    }

    public static class PopupText {
        @SerializedName("buttons")
        public List<ButtonStruct> buttons;
        @SerializedName("context")
        public String context;
        @SerializedName("image")
        public UrlStruct image;
        @SerializedName("title")
        public String title;
    }

    public enum ShowTime {
        CREATE_AWEME(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int value;

        private ShowTime(int i) {
            this.value = i;
        }
    }

    public enum StyleType {
        STYLE_ACTION(1),
        STYLE_NORMAL(2),
        STYLE_GREY(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int value;

        private StyleType(int i) {
            this.value = i;
        }
    }

    public static class UrlStruct {
        @SerializedName("height")
        public int height;
        @SerializedName("uri")
        public String uri;
        @SerializedName("url_key")
        public String url_key;
        @SerializedName("url_list")
        public String url_list;
        @SerializedName("width")
        public int width;
    }

    public String getPopupContent() {
        try {
            return this.popupText.context;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPopupTitle() {
        try {
            return this.popupText.title;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getNegativeActionUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72236, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72236, new Class[0], String.class);
        }
        try {
            return this.popupText.buttons.get(1).buttonActionStruct.target;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getNegativeButtonText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72235, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72235, new Class[0], String.class);
        }
        try {
            return this.popupText.buttons.get(1).text;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPositiveActionUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72234, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72234, new Class[0], String.class);
        }
        try {
            return this.popupText.buttons.get(0).buttonActionStruct.target;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPositiveButtonText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72233, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72233, new Class[0], String.class);
        }
        try {
            return this.popupText.buttons.get(0).text;
        } catch (Exception unused) {
            return null;
        }
    }
}
