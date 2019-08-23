package com.ss.android.ugc.aweme.im.service.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class IMUser extends IMContact {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String avatarStr;
    @SerializedName("avatar_thumb")
    private UrlModel avatarThumb;
    private long checkedUnreadStoryMillis;
    @SerializedName("commerce_user_level")
    private int commerceUserLevel;
    @SerializedName("contact_name")
    private String contactName;
    private String contactNameInitial;
    private String contactNamePinyin;
    @SerializedName("custom_verify")
    private String customVerify;
    @SerializedName("enterprise_verify_reason")
    private String enterpriseVerifyReason;
    @SerializedName("follow_status")
    private int followStatus;
    private boolean hasUnreadStory;
    private String initialLetter;
    private boolean isBlock;
    @SerializedName("nickname")
    private String nickName;
    private String nickNameInitial;
    private String nickNamePinyin;
    private String remarkInitial;
    @SerializedName("remark_name")
    private String remarkName;
    private String remarkPinyin;
    private int searchType;
    @SerializedName("sec_uid")
    private String secUid;
    @SerializedName("short_id")
    private String shortId;
    @SerializedName("signature")
    private String signature;
    private String sortWeight;
    @SerializedName("uid")
    private String uid;
    @SerializedName("unique_id")
    private String uniqueId = "";
    @SerializedName("verification_type")
    private int verificationType;
    @SerializedName("weibo_verify")
    private String weiboVerify;
    private boolean withCommerceEntry;

    public String getAvatarStr() {
        return this.avatarStr;
    }

    public long getCheckedUnreadStoryMillis() {
        return this.checkedUnreadStoryMillis;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactNameInitial() {
        return this.contactNameInitial;
    }

    public String getContactNamePinyin() {
        return this.contactNamePinyin;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public String getInitialLetter() {
        return this.initialLetter;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getNickNameInitial() {
        return this.nickNameInitial;
    }

    public String getNickNamePinyin() {
        return this.nickNamePinyin;
    }

    public String getRemarkInitial() {
        return this.remarkInitial;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public String getRemarkPinyin() {
        return this.remarkPinyin;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getShortId() {
        return this.shortId;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSortWeight() {
        return this.sortWeight;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public String getWeiboVerify() {
        return this.weiboVerify;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isHasUnreadStory() {
        return this.hasUnreadStory;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public UrlModel getDisplayAvatar() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54425, new Class[0], UrlModel.class)) {
            return getAvatarThumb();
        }
        return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54425, new Class[0], UrlModel.class);
    }

    public String getDisplayId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54423, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54423, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.uniqueId)) {
            return this.shortId;
        } else {
            return this.uniqueId;
        }
    }

    public String getDisplayName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54424, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54424, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.remarkName)) {
            return this.nickName;
        } else {
            return this.remarkName;
        }
    }

    public int getFollowStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54422, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54422, new Class[0], Integer.TYPE)).intValue();
        } else if (isSelf(this.uid)) {
            return 2;
        } else {
            return this.followStatus;
        }
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54432, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54432, new Class[0], Integer.TYPE)).intValue();
        }
        if (getUid() != null) {
            i = getUid().hashCode();
        }
        return i;
    }

    public UrlModel getAvatarThumb() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54420, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54420, new Class[0], UrlModel.class);
        }
        if (this.avatarThumb == null && !TextUtils.isEmpty(this.avatarStr)) {
            try {
                this.avatarThumb = (UrlModel) new Gson().fromJson(this.avatarStr, UrlModel.class);
            } catch (Exception unused) {
            }
        }
        return this.avatarThumb;
    }

    public IMUser clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54427, new Class[0], IMUser.class)) {
            return (IMUser) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54427, new Class[0], IMUser.class);
        }
        IMUser iMUser = new IMUser();
        iMUser.uid = this.uid;
        iMUser.secUid = this.secUid;
        iMUser.nickName = this.nickName;
        iMUser.signature = this.signature;
        iMUser.avatarThumb = this.avatarThumb;
        iMUser.followStatus = this.followStatus;
        iMUser.relationListItemType = this.relationListItemType;
        iMUser.uniqueId = this.uniqueId;
        iMUser.shortId = this.shortId;
        iMUser.weiboVerify = this.weiboVerify;
        iMUser.customVerify = this.customVerify;
        iMUser.enterpriseVerifyReason = this.enterpriseVerifyReason;
        iMUser.verificationType = this.verificationType;
        iMUser.remarkName = this.remarkName;
        iMUser.avatarStr = this.avatarStr;
        iMUser.initialLetter = this.initialLetter;
        iMUser.sortWeight = this.sortWeight;
        iMUser.remarkPinyin = this.remarkPinyin;
        iMUser.remarkInitial = this.remarkInitial;
        iMUser.nickNamePinyin = this.nickNamePinyin;
        iMUser.nickNameInitial = this.nickNameInitial;
        iMUser.isBlock = this.isBlock;
        iMUser.commerceUserLevel = this.commerceUserLevel;
        iMUser.withCommerceEntry = this.withCommerceEntry;
        iMUser.hasUnreadStory = this.hasUnreadStory;
        iMUser.checkedUnreadStoryMillis = this.checkedUnreadStoryMillis;
        iMUser.contactName = this.contactName;
        iMUser.contactNamePinyin = this.contactNamePinyin;
        iMUser.contactNameInitial = this.contactNameInitial;
        return iMUser;
    }

    @NonNull
    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54430, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54430, new Class[0], String.class);
        }
        return "IMUser{uid='" + this.uid + '\'' + ", secUid='" + this.secUid + '\'' + ", nickName='" + this.nickName + '\'' + ", signature='" + this.signature + '\'' + ", avatarThumb=" + this.avatarThumb + '\'' + ", followStatus=" + this.followStatus + '\'' + ", uniqueId='" + this.uniqueId + '\'' + ", shortId='" + this.shortId + '\'' + ", weiboVerify='" + this.weiboVerify + '\'' + ", customVerify='" + this.customVerify + '\'' + ", enterpriseVerifyReason='" + this.enterpriseVerifyReason + '\'' + ", verificationType=" + this.verificationType + '\'' + ", remarkName='" + this.remarkName + '\'' + ", commerceUserLevel=" + this.commerceUserLevel + '\'' + ", withCommerceEntry=" + this.withCommerceEntry + '\'' + ", relationListItemType=" + this.relationListItemType + '\'' + ", avatarStr='" + this.avatarStr + '\'' + ", sortWeight='" + this.sortWeight + '\'' + ", initialLetter='" + this.initialLetter + '\'' + ", remarkPinyin='" + this.remarkPinyin + '\'' + ", remarkInitial='" + this.remarkInitial + '\'' + ", nickNamePinyin='" + this.nickNamePinyin + '\'' + ", nickNameInitial='" + this.nickNameInitial + '\'' + ", searchType=" + this.searchType + '\'' + ", isBlock=" + this.isBlock + '\'' + ", hasUnreadStory=" + this.hasUnreadStory + '\'' + ", checkedUnreadStoryMillis=" + this.checkedUnreadStoryMillis + '\'' + ", contactName=" + this.contactName + '\'' + ", nickNamePinyin=" + this.nickNamePinyin + '\'' + ", contactNameInitial=" + this.contactNameInitial + '\'' + '}';
    }

    public void setAvatarStr(String str) {
        this.avatarStr = str;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setCheckedUnreadStoryMillis(long j) {
        this.checkedUnreadStoryMillis = j;
    }

    public void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactNameInitial(String str) {
        this.contactNameInitial = str;
    }

    public void setContactNamePinyin(String str) {
        this.contactNamePinyin = str;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setHasUnreadStory(boolean z) {
        this.hasUnreadStory = z;
    }

    public void setInitialLetter(String str) {
        this.initialLetter = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNickNameInitial(String str) {
        this.nickNameInitial = str;
    }

    public void setNickNamePinyin(String str) {
        this.nickNamePinyin = str;
    }

    public void setRemarkInitial(String str) {
        this.remarkInitial = str;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRemarkPinyin(String str) {
        this.remarkPinyin = str;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSortWeight(String str) {
        this.sortWeight = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setVerificationType(int i) {
        this.verificationType = i;
    }

    public void setWeiboVerify(String str) {
        this.weiboVerify = str;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }

    public static boolean isInvalidUser(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 54434, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 54434, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return true;
        } else {
            try {
                if (Long.parseLong(str) <= 0) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    private boolean isSelf(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 54433, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 54433, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            return TextUtils.equals(iUserService.getCurrentUserID(), str2);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 54431(0xd49f, float:7.6274E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 54431(0xd49f, float:7.6274E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            r2 = r17
            if (r2 != r0) goto L_0x0042
            return r1
        L_0x0042:
            boolean r3 = r0 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
            if (r3 != 0) goto L_0x0047
            return r9
        L_0x0047:
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r3 = r17.getUid()
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = r17.getUid()
            java.lang.String r0 = r0.getUid()
            boolean r0 = r1.equals(r0)
            return r0
        L_0x005c:
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x0063
            return r1
        L_0x0063:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.model.IMUser.equals(java.lang.Object):boolean");
    }

    public void setAvatarThumb(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, changeQuickRedirect, false, 54421, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, changeQuickRedirect, false, 54421, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        this.avatarThumb = urlModel;
        try {
            this.avatarStr = new Gson().toJson((Object) urlModel);
        } catch (Exception unused) {
        }
    }

    public static IMUser fromUser(User user) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{user}, null, changeQuickRedirect, true, 54428, new Class[]{User.class}, IMUser.class)) {
            return (IMUser) PatchProxy.accessDispatch(new Object[]{user}, null, changeQuickRedirect, true, 54428, new Class[]{User.class}, IMUser.class);
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(user.getUid());
        iMUser.setSecUid(user.getSecUid());
        iMUser.setNickName(user.getNickname());
        iMUser.setSignature(user.getSignature());
        iMUser.setAvatarThumb(user.getAvatarThumb());
        iMUser.setFollowStatus(user.getFollowStatus());
        iMUser.setUniqueId(user.getUniqueId());
        iMUser.setShortId(user.getShortId());
        iMUser.setWeiboVerify(user.getWeiboVerify());
        iMUser.setCustomVerify(user.getCustomVerify());
        iMUser.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        iMUser.setVerificationType(user.getVerificationType());
        iMUser.setRemarkName(user.getRemarkName());
        iMUser.setBlock(user.isBlock());
        iMUser.setCommerceUserLevel(user.getCommerceUserLevel());
        iMUser.setWithCommerceEntry(user.isWithCommerceEntry());
        if (user.isHasUnreadStory() != null) {
            z = user.isHasUnreadStory().booleanValue();
        }
        iMUser.setHasUnreadStory(z);
        iMUser.setCheckedUnreadStoryMillis(0);
        return iMUser;
    }

    public static User toUser(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, null, changeQuickRedirect, true, 54429, new Class[]{IMUser.class}, User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[]{iMUser}, null, changeQuickRedirect, true, 54429, new Class[]{IMUser.class}, User.class);
        }
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setSecUid(iMUser.getSecUid());
        user.setNickname(iMUser.getNickName());
        user.setSignature(iMUser.getSignature());
        user.setAvatarThumb(iMUser.getAvatarThumb());
        user.setFollowStatus(iMUser.getFollowStatus());
        user.setUniqueId(iMUser.getUniqueId());
        user.setShortId(iMUser.getShortId());
        user.setWeiboVerify(iMUser.getWeiboVerify());
        user.setCustomVerify(iMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        user.setVerificationType(iMUser.getVerificationType());
        user.setRemarkName(iMUser.getRemarkName());
        user.setBlock(iMUser.isBlock());
        user.setCommerceUserLevel(iMUser.getCommerceUserLevel());
        user.setWithCommerceEntry(iMUser.isWithCommerceEntry());
        user.setHasUnreadStory(iMUser.isHasUnreadStory());
        return user;
    }

    public void copy(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, changeQuickRedirect, false, 54426, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser}, this, changeQuickRedirect, false, 54426, new Class[]{IMUser.class}, Void.TYPE);
            return;
        }
        setUid(iMUser.getUid());
        setSecUid(iMUser.getSecUid());
        setNickName(iMUser.getNickName());
        setSignature(iMUser.getSignature());
        setAvatarThumb(iMUser.getAvatarThumb());
        setFollowStatus(iMUser.getFollowStatus());
        setUniqueId(iMUser.getUniqueId());
        setShortId(iMUser.getShortId());
        setWeiboVerify(iMUser.getWeiboVerify());
        setCustomVerify(iMUser.getCustomVerify());
        setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        setVerificationType(iMUser.getVerificationType());
        setRemarkName(iMUser.getRemarkName());
        setBlock(iMUser.isBlock());
        setCommerceUserLevel(iMUser.getCommerceUserLevel());
        setWithCommerceEntry(iMUser.isWithCommerceEntry());
        setHasUnreadStory(iMUser.isHasUnreadStory());
        setCheckedUnreadStoryMillis(0);
    }
}
