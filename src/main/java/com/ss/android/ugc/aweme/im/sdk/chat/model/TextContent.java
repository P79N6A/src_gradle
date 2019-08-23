package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

@Keep
public class TextContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("type")
    private int heartType;
    boolean isDefault;
    @SerializedName("text")
    String text;

    public int getHeartType() {
        return this.heartType;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51210, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51210, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "text";
        shareStruct.shareText = getText();
        return shareStruct;
    }

    public boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51206, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51206, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.text)) {
            z = true;
        }
        return z;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51207, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51207, new Class[0], String.class);
        } else if (this.heartType == 1 || this.heartType == 2) {
            return GlobalContext.getContext().getString(C0906R.string.azz);
        } else {
            return getText();
        }
    }

    public String getText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51205, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51205, new Class[0], String.class);
        } else if (this.heartType == 1 || this.heartType == 2) {
            return GlobalContext.getContext().getString(C0906R.string.azz);
        } else {
            return this.text;
        }
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setHeartType(int i) {
        this.heartType = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public static TextContent obtain(TextContent textContent) {
        TextContent textContent2 = textContent;
        if (PatchProxy.isSupport(new Object[]{textContent2}, null, changeQuickRedirect, true, 51209, new Class[]{TextContent.class}, TextContent.class)) {
            return (TextContent) PatchProxy.accessDispatch(new Object[]{textContent2}, null, changeQuickRedirect, true, 51209, new Class[]{TextContent.class}, TextContent.class);
        }
        TextContent textContent3 = new TextContent();
        textContent3.setText(textContent.getText());
        textContent3.setType(700);
        textContent3.prevId = textContent2.prevId;
        textContent3.rootId = textContent2.rootId;
        return textContent3;
    }

    public static TextContent obtain(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 51208, new Class[]{String.class}, TextContent.class)) {
            return (TextContent) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 51208, new Class[]{String.class}, TextContent.class);
        }
        TextContent textContent = new TextContent();
        textContent.setText(str2);
        textContent.setType(700);
        return textContent;
    }
}
