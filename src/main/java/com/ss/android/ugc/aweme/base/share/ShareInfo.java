package com.ss.android.ugc.aweme.base.share;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.i18n.c;
import java.io.Serializable;

@Keep
public class ShareInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bool_persist")
    public int boolPersist;
    @SerializedName("manage_goods_url")
    public String goodsManagerUrl;
    @SerializedName("goods_rec_url")
    public String goodsRecUrl;
    @SerializedName("share_image_url")
    public UrlModel imageUrls;
    @SerializedName("share_qrcode_url")
    public UrlModel qrCodeUrls;
    @SerializedName("share_desc")
    public String shareDesc;
    @SerializedName("share_link_desc")
    public String shareLinkDesc;
    @SerializedName("share_quote")
    public String shareQuote;
    @SerializedName("share_signature_desc")
    public String shareSignatureDesc;
    @SerializedName("share_signature_url")
    public String shareSignatureUrl;
    @SerializedName("share_title")
    public String shareTitle;
    @SerializedName("share_title_myself")
    public String shareTitleMyself;
    @SerializedName("share_title_other")
    public String shareTitleOther;
    @SerializedName("share_toutiao_desc")
    public String shareToutiaoDesc;
    @SerializedName("share_url")
    public String shareUrl;
    @SerializedName("share_weibo_desc")
    public String shareWeiboDesc;
    @SerializedName("whatsapp_desc")
    public String whatsappShareDesc;

    public int getBoolPersist() {
        return this.boolPersist;
    }

    public String getGoodsManagerUrl() {
        return this.goodsManagerUrl;
    }

    public String getGoodsRecUrl() {
        return this.goodsRecUrl;
    }

    public UrlModel getImageUrls() {
        return this.imageUrls;
    }

    public UrlModel getQrCodeUrls() {
        return this.qrCodeUrls;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getShareLinkDesc() {
        return this.shareLinkDesc;
    }

    public String getShareQuote() {
        return this.shareQuote;
    }

    public String getShareSignatureDesc() {
        return this.shareSignatureDesc;
    }

    public String getShareSignatureUrl() {
        return this.shareSignatureUrl;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareTitleMyself() {
        return this.shareTitleMyself;
    }

    public String getShareTitleOther() {
        return this.shareTitleOther;
    }

    public String getShareToutiaoDesc() {
        return this.shareToutiaoDesc;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getShareWeiboDesc() {
        return this.shareWeiboDesc;
    }

    public String getWhatsappShareDesc() {
        return this.whatsappShareDesc;
    }

    private String getShareAppName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24863, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24863, new Class[0], String.class);
        } else if (!c.a()) {
            return "aweme";
        } else {
            return a.b().f3305c;
        }
    }

    public void setBoolPersist(int i) {
        this.boolPersist = i;
    }

    public void setGoodsManagerUrl(String str) {
        this.goodsManagerUrl = str;
    }

    public void setGoodsRecUrl(String str) {
        this.goodsRecUrl = str;
    }

    public void setImageUrls(UrlModel urlModel) {
        this.imageUrls = urlModel;
    }

    public void setQrCodeUrls(UrlModel urlModel) {
        this.qrCodeUrls = urlModel;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareLinkDesc(String str) {
        this.shareLinkDesc = str;
    }

    public void setShareQuote(String str) {
        this.shareQuote = str;
    }

    public void setShareSignatureDesc(String str) {
        this.shareSignatureDesc = str;
    }

    public void setShareSignatureUrl(String str) {
        this.shareSignatureUrl = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareTitleOther(String str) {
        this.shareTitleOther = str;
    }

    public void setShareToutiaoDesc(String str) {
        this.shareToutiaoDesc = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setShareWeiboDesc(String str) {
        this.shareWeiboDesc = str;
    }

    public void setWhatsappShareDesc(String str) {
        this.whatsappShareDesc = str;
    }

    public void setShareTitleMyself(String str) {
        this.shareTitleMyself = this.shareTitleMyself;
    }

    public ShareInfo buildUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 24862, new Class[]{String.class}, ShareInfo.class)) {
            return (ShareInfo) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 24862, new Class[]{String.class}, ShareInfo.class);
        }
        if (!this.shareUrl.contains("utm_source")) {
            i iVar = new i(this.shareUrl);
            iVar.a("utm_source", str);
            iVar.a("utm_campaign", "client_share");
            iVar.a("utm_medium", "android");
            iVar.a("share_app_name", getShareAppName());
            iVar.a("iid", AppLog.getInstallId());
            this.shareUrl = iVar.a();
        } else {
            String str2 = this.shareUrl;
            this.shareUrl = str2.replaceAll("utm_source=\\w*_?\\w?", "utm_source=" + str);
        }
        return this;
    }
}
