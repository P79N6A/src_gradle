package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.b;

@Keep
public class CommandShareContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("cover_url")
    private UrlModel coverUrl;
    private boolean isSendMsg;
    @SerializedName("itemId")
    private String itemId;
    @SerializedName("title")
    private String title;

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSendMsg() {
        return this.isSendMsg;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51107, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51107, new Class[0], String.class);
        } else if (this.isSendMsg) {
            return GlobalContext.getContext().getString(C0906R.string.aq9);
        } else {
            return GlobalContext.getContext().getString(C0906R.string.aq8);
        }
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setSendMsg(boolean z) {
        this.isSendMsg = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public static CommandShareContent obtain(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, changeQuickRedirect, true, 51108, new Class[]{b.class}, CommandShareContent.class)) {
            return (CommandShareContent) PatchProxy.accessDispatch(new Object[]{bVar2}, null, changeQuickRedirect, true, 51108, new Class[]{b.class}, CommandShareContent.class);
        }
        CommandShareContent commandShareContent = new CommandShareContent();
        commandShareContent.setItemId(bVar2.f52866a);
        commandShareContent.setTitle(bVar2.f52868c);
        commandShareContent.setAuthorName(bVar2.f52870e);
        commandShareContent.setCoverUrl(bVar2.f52867b);
        return commandShareContent;
    }
}
