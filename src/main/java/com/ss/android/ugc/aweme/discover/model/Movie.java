package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR \u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR \u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR \u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR \u00107\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR \u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR \u0010=\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR \u0010@\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\"\u0010C\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\bD\u0010*\"\u0004\bE\u0010,¨\u0006F"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/Movie;", "Ljava/io/Serializable;", "()V", "actor", "", "getActor", "()Ljava/lang/String;", "setActor", "(Ljava/lang/String;)V", "challengeId", "getChallengeId", "setChallengeId", "director", "getDirector", "setDirector", "dtime", "getDtime", "setDtime", "img", "getImg", "setImg", "light_app_tickets_url", "getLight_app_tickets_url", "setLight_app_tickets_url", "light_app_url", "getLight_app_url", "setLight_app_url", "loc", "getLoc", "setLoc", "maoyan_score", "getMaoyan_score", "setMaoyan_score", "maoyan_score_url", "getMaoyan_score_url", "setMaoyan_score_url", "showurl", "getShowurl", "setShowurl", "stat", "", "getStat", "()Ljava/lang/Integer;", "setStat", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "summery", "getSummery", "setSummery", "tickets_url", "getTickets_url", "setTickets_url", "title", "getTitle", "setTitle", "tmaid", "getTmaid", "setTmaid", "type", "getType", "setType", "uptime", "getUptime", "setUptime", "url", "getUrl", "setUrl", "wish", "getWish", "setWish", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class Movie implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("actor")
    @Nullable
    private String actor;
    @SerializedName("challenge_id")
    @Nullable
    private String challengeId;
    @SerializedName("director")
    @Nullable
    private String director;
    @SerializedName("dtime")
    @Nullable
    private String dtime;
    @SerializedName("img")
    @Nullable
    private String img;
    @SerializedName("light_app_tickets_url")
    @Nullable
    private String light_app_tickets_url;
    @SerializedName("light_app_url")
    @Nullable
    private String light_app_url;
    @SerializedName("loc")
    @Nullable
    private String loc;
    @SerializedName("maoyan_score")
    @Nullable
    private String maoyan_score;
    @SerializedName("maoyan_score_url")
    @Nullable
    private String maoyan_score_url;
    @SerializedName("showurl")
    @Nullable
    private String showurl;
    @SerializedName("stat")
    @Nullable
    private Integer stat;
    @SerializedName("summery")
    @Nullable
    private String summery;
    @SerializedName("tickets_url")
    @Nullable
    private String tickets_url;
    @SerializedName("title")
    @Nullable
    private String title;
    @SerializedName("tmaid")
    @Nullable
    private String tmaid;
    @SerializedName("type")
    @Nullable
    private String type;
    @SerializedName("uptime")
    @Nullable
    private String uptime;
    @SerializedName("url")
    @Nullable
    private String url;
    @SerializedName("wish")
    @Nullable
    private Integer wish;

    @Nullable
    public final String getActor() {
        return this.actor;
    }

    @Nullable
    public final String getChallengeId() {
        return this.challengeId;
    }

    @Nullable
    public final String getDirector() {
        return this.director;
    }

    @Nullable
    public final String getDtime() {
        return this.dtime;
    }

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final String getLight_app_tickets_url() {
        return this.light_app_tickets_url;
    }

    @Nullable
    public final String getLight_app_url() {
        return this.light_app_url;
    }

    @Nullable
    public final String getLoc() {
        return this.loc;
    }

    @Nullable
    public final String getMaoyan_score() {
        return this.maoyan_score;
    }

    @Nullable
    public final String getMaoyan_score_url() {
        return this.maoyan_score_url;
    }

    @Nullable
    public final String getShowurl() {
        return this.showurl;
    }

    @Nullable
    public final Integer getStat() {
        return this.stat;
    }

    @Nullable
    public final String getSummery() {
        return this.summery;
    }

    @Nullable
    public final String getTickets_url() {
        return this.tickets_url;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTmaid() {
        return this.tmaid;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUptime() {
        return this.uptime;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWish() {
        return this.wish;
    }

    public final void setActor(@Nullable String str) {
        this.actor = str;
    }

    public final void setChallengeId(@Nullable String str) {
        this.challengeId = str;
    }

    public final void setDirector(@Nullable String str) {
        this.director = str;
    }

    public final void setDtime(@Nullable String str) {
        this.dtime = str;
    }

    public final void setImg(@Nullable String str) {
        this.img = str;
    }

    public final void setLight_app_tickets_url(@Nullable String str) {
        this.light_app_tickets_url = str;
    }

    public final void setLight_app_url(@Nullable String str) {
        this.light_app_url = str;
    }

    public final void setLoc(@Nullable String str) {
        this.loc = str;
    }

    public final void setMaoyan_score(@Nullable String str) {
        this.maoyan_score = str;
    }

    public final void setMaoyan_score_url(@Nullable String str) {
        this.maoyan_score_url = str;
    }

    public final void setShowurl(@Nullable String str) {
        this.showurl = str;
    }

    public final void setStat(@Nullable Integer num) {
        this.stat = num;
    }

    public final void setSummery(@Nullable String str) {
        this.summery = str;
    }

    public final void setTickets_url(@Nullable String str) {
        this.tickets_url = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTmaid(@Nullable String str) {
        this.tmaid = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUptime(@Nullable String str) {
        this.uptime = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setWish(@Nullable Integer num) {
        this.wish = num;
    }
}
