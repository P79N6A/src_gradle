package com.ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.comment.g.a;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.ad.b;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.utils.eo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class c extends Comment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String aid;
    @SerializedName("avatar_icon")
    private UrlModel avatarIcon;
    @SerializedName("button_text")
    private String buttonText;
    @SerializedName("comment_info")
    private String commentInfo;
    @SerializedName("comment_nickname")
    private String commentNickName;
    @SerializedName("comment_time")
    private long commentTime;
    @SerializedName("show_button_number")
    private int showButtonNumber;
    @SerializedName("source")
    private String source;
    @SerializedName("title")
    private String title;

    public String getAid() {
        return this.aid;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getCommentInfo() {
        return this.commentInfo;
    }

    public String getCommentNickName() {
        return this.commentNickName;
    }

    public long getCommentTime() {
        return this.commentTime;
    }

    public int getShowButtonNumber() {
        return this.showButtonNumber;
    }

    public String getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDisplayText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31899, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31899, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder(getCommentInfo());
        sb.append(" [label]");
        if (isSupportReplyComment()) {
            sb.append(" ");
            sb.append(getTimeDesc());
        }
        return sb.toString();
    }

    public String getTimeDesc() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31898, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31898, new Class[0], String.class);
        }
        if (TextUtils.isEmpty(this.mTimeDesc)) {
            this.mTimeDesc = eo.b(d.a(), getCommentTime() * 1000).replaceAll("(.)", "$1⁠");
        }
        return this.mTimeDesc;
    }

    public List<TextExtraStruct> getDisplayTextExtra() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31900, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31900, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        int length = this.commentInfo.length() + 1;
        int i = length + 7;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(65281);
        textExtraStruct.setCustomSpan(new b(d.a(), 2130839562));
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        arrayList.add(textExtraStruct);
        if (isSupportReplyComment()) {
            int i2 = i + 1;
            int length2 = i + getTimeDesc().length();
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            textExtraStruct2.setCustomSpan(new a.b(u.a(13.0d), d.a().getResources().getColor(C0906R.color.i3)));
            textExtraStruct2.setStart(i2);
            textExtraStruct2.setEnd(length2);
            arrayList.add(textExtraStruct2);
        }
        return arrayList;
    }

    public c setAid(String str) {
        this.aid = str;
        return this;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCommentInfo(String str) {
        this.commentInfo = str;
    }

    public void setCommentNickName(String str) {
        this.commentNickName = str;
    }

    public void setCommentTime(long j) {
        this.commentTime = j;
    }

    public void setShowButtonNumber(int i) {
        this.showButtonNumber = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
