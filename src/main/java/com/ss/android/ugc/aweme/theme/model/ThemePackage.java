package com.ss.android.ugc.aweme.theme.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class ThemePackage {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action_digg")
    private UrlModel mActionDigg;
    @SerializedName("find")
    private UrlModel mFind;
    @SerializedName("find_click")
    private UrlModel mFindClick;
    @SerializedName("follow")
    private UrlModel mFollow;
    @SerializedName("follow_click")
    private UrlModel mFollowClick;
    @SerializedName("hollow_digg")
    private UrlModel mHollowDigg;
    @SerializedName("home")
    private UrlModel mHome;
    @SerializedName("home_click")
    private UrlModel mHomeCLick;
    @SerializedName("notice")
    private UrlModel mNotice;
    @SerializedName("notice_click")
    private UrlModel mNoticeClick;
    @SerializedName("person")
    private UrlModel mPerson;
    @SerializedName("person_click")
    private UrlModel mPersonClick;
    @SerializedName("shot")
    private UrlModel mShot;
    @SerializedName("shot_click")
    private UrlModel mShotCLick;
    @SerializedName("solid_digg")
    private UrlModel mSolidDigg;

    public UrlModel getActionDigg() {
        return this.mActionDigg;
    }

    public UrlModel getFind() {
        return this.mFind;
    }

    public UrlModel getFindClick() {
        return this.mFindClick;
    }

    public UrlModel getFollow() {
        return this.mFollow;
    }

    public UrlModel getFollowClick() {
        return this.mFollowClick;
    }

    public UrlModel getHollowDigg() {
        return this.mHollowDigg;
    }

    public UrlModel getHome() {
        return this.mHome;
    }

    public UrlModel getHomeCLick() {
        return this.mHomeCLick;
    }

    public UrlModel getNotice() {
        return this.mNotice;
    }

    public UrlModel getNoticeClick() {
        return this.mNoticeClick;
    }

    public UrlModel getPerson() {
        return this.mPerson;
    }

    public UrlModel getPersonClick() {
        return this.mPersonClick;
    }

    public UrlModel getShot() {
        return this.mShot;
    }

    public UrlModel getShotCLick() {
        return this.mShotCLick;
    }

    public UrlModel getSolidDigg() {
        return this.mSolidDigg;
    }

    public void setActionDigg(UrlModel urlModel) {
        this.mActionDigg = urlModel;
    }

    public void setFind(UrlModel urlModel) {
        this.mFind = urlModel;
    }

    public void setFindClick(UrlModel urlModel) {
        this.mFindClick = urlModel;
    }

    public void setFollow(UrlModel urlModel) {
        this.mFollow = urlModel;
    }

    public void setFollowClick(UrlModel urlModel) {
        this.mFollowClick = urlModel;
    }

    public void setHollowDigg(UrlModel urlModel) {
        this.mHollowDigg = urlModel;
    }

    public void setHome(UrlModel urlModel) {
        this.mHome = urlModel;
    }

    public void setHomeCLick(UrlModel urlModel) {
        this.mHomeCLick = urlModel;
    }

    public void setNotice(UrlModel urlModel) {
        this.mNotice = urlModel;
    }

    public void setNoticeClick(UrlModel urlModel) {
        this.mNoticeClick = urlModel;
    }

    public void setPerson(UrlModel urlModel) {
        this.mPerson = urlModel;
    }

    public void setPersonClick(UrlModel urlModel) {
        this.mPersonClick = urlModel;
    }

    public void setShot(UrlModel urlModel) {
        this.mShot = urlModel;
    }

    public void setShotCLick(UrlModel urlModel) {
        this.mShotCLick = urlModel;
    }

    public void setSolidDigg(UrlModel urlModel) {
        this.mSolidDigg = urlModel;
    }
}
