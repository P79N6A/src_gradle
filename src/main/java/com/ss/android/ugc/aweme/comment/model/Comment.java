package com.ss.android.ugc.aweme.comment.model;

import android.graphics.Paint;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.comment.g.a;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.eo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class Comment extends c implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String forwardTextPrefix = "";
    @SerializedName("aweme_id")
    @Deprecated
    String awemeId;
    @SerializedName("cid")
    String cid;
    @SerializedName("create_time")
    int createTime;
    @SerializedName("digg_count")
    int diggCount;
    private transient String fakeId = "";
    @SerializedName("forward_id")
    String forwardId;
    @SerializedName("is_author_digged")
    boolean isAuthorDigged;
    boolean isTranslated;
    @SerializedName("label_info")
    String labelInfo;
    @SerializedName("label_text")
    String labelText;
    @SerializedName("label_type")
    int labelType;
    private int mCommentType;
    private boolean mNeedHint;
    private String mReplyUsernameDesc;
    protected String mTimeDesc;
    private String mUserNamePrefix;
    private transient int offset;
    @SerializedName("relation_label")
    RelationDynamicLabel relationLabel;
    @SerializedName("reply_comment_total")
    int replyCommentTotal;
    @SerializedName("reply_comment")
    List<Comment> replyComments;
    @SerializedName("reply_id")
    String replyId;
    @SerializedName("reply_to_reply_id")
    String replyToReplyId;
    @SerializedName("reply_to_userid")
    String replyToUserId;
    @SerializedName("reply_to_username")
    String replyToUserName;
    @SerializedName("status")
    int status;
    @SerializedName("text")
    String text;
    @SerializedName("text_extra")
    List<TextExtraStruct> textExtra;
    @SerializedName("user")
    User user;
    @SerializedName("user_digged")
    int userDigged;

    public interface LabelType {
    }

    public class _lancet {
        public static ChangeQuickRedirect changeQuickRedirect;

        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_SetSpanLancet_setSpan(SpannableString spannableString, Object obj, int i, int i2, int i3) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{spannableString, obj2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, changeQuickRedirect, true, 27312, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{spannableString, obj2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, changeQuickRedirect, true, 27312, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i != i2 || !(obj2 instanceof ClickableSpan)) {
                int i4 = i3;
            } else if (i3 == 33) {
                try {
                    a.a(Log.getStackTraceString(new Throwable("setSpan")));
                } catch (Exception unused) {
                }
            }
            spannableString.setSpan(obj, i, i2, i3);
        }
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCommentType() {
        return this.mCommentType;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public int getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyCommentId() {
        return this.replyToReplyId;
    }

    public String getReplyToUserId() {
        return this.replyToUserId;
    }

    public String getReplyToUserName() {
        return this.replyToUserName;
    }

    public int getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public User getUser() {
        return this.user;
    }

    public int getUserDigged() {
        return this.userDigged;
    }

    public boolean isNeedHint() {
        return this.mNeedHint;
    }

    public boolean isTranslated() {
        return this.isTranslated;
    }

    public boolean isUserDigged() {
        if (this.userDigged == 1) {
            return true;
        }
        return false;
    }

    @NonNull
    public String getFakeId() {
        if (this.fakeId == null) {
            return "";
        }
        return this.fakeId;
    }

    private String createUserNamePrefix() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27303, new Class[0], String.class)) {
            return createUserNamePrefix(null, 0);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27303, new Class[0], String.class);
    }

    public String getDisplayText() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27296, new Class[0], String.class)) {
            return getDisplayText(true);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27296, new Class[0], String.class);
    }

    public boolean hasTextExtra() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27309, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27309, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (isSupportReplyComment() || !CollectionUtils.isEmpty(this.textExtra)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27295, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27295, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.cid != null) {
            i = this.cid.hashCode();
        }
        return i;
    }

    public static boolean isSupportReplyComment() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 27310, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 27310, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.g.a.a()) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71866, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71866, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 == null) {
                    z = false;
                } else {
                    z = d2.i18nReplyBuildingStyle;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public String getForwardText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27307, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27307, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.forwardId)) {
            return getText();
        } else {
            if (TextUtils.isEmpty(forwardTextPrefix)) {
                forwardTextPrefix = d.a().getString(C0906R.string.ahe) + " • ";
            }
            return forwardTextPrefix + getText();
        }
    }

    public String getTimeDesc() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27306, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27306, new Class[0], String.class);
        }
        if (TextUtils.isEmpty(this.mTimeDesc)) {
            this.mTimeDesc = eo.b(d.a(), ((long) getCreateTime()) * 1000).replaceAll("(.)", "$1⁠");
        }
        return this.mTimeDesc;
    }

    public boolean isAuthorDigged() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27293, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27293, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.isAuthorDigged) {
            String secUid = com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid();
            if (getUser() == null) {
                str = "";
            } else {
                str = getUser().getSecUid();
            }
            if (!TextUtils.equals(secUid, str)) {
                return true;
            }
        }
        return false;
    }

    public Comment clone() {
        AnonymousClass1 r1;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27311, new Class[0], Comment.class)) {
            return (Comment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27311, new Class[0], Comment.class);
        }
        Comment comment = new Comment();
        comment.cid = this.cid;
        comment.text = this.text;
        comment.awemeId = this.awemeId;
        comment.createTime = this.createTime;
        comment.diggCount = this.diggCount;
        comment.status = this.status;
        comment.user = this.user;
        comment.replyId = this.replyId;
        comment.userDigged = this.userDigged;
        if (this.replyComments != null) {
            ArrayList arrayList = new ArrayList(this.replyComments.size());
            for (Comment clone : this.replyComments) {
                arrayList.add(clone.clone());
            }
            comment.replyComments = arrayList;
        }
        if (this.textExtra != null) {
            ArrayList arrayList2 = new ArrayList(this.textExtra.size());
            for (TextExtraStruct clone2 : this.textExtra) {
                arrayList2.add(clone2.clone());
            }
            comment.textExtra = arrayList2;
        }
        comment.labelText = this.labelText;
        comment.labelType = this.labelType;
        if (this.relationLabel == null) {
            r1 = null;
        } else {
            r1 = new RelationDynamicLabel() {
                {
                    setNickname(Comment.this.relationLabel.getNickname());
                    setLabelInfo(Comment.this.relationLabel.getLabelInfo());
                    setUserId(Comment.this.relationLabel.getUserId());
                    setCount(Comment.this.relationLabel.getCount());
                }
            };
        }
        comment.relationLabel = r1;
        comment.forwardId = this.forwardId;
        comment.replyCommentTotal = this.replyCommentTotal;
        comment.replyToReplyId = this.replyToReplyId;
        comment.replyToUserName = this.replyToUserName;
        comment.replyToUserId = this.replyToUserId;
        comment.mCommentType = this.mCommentType;
        return comment;
    }

    public List<TextExtraStruct> getForwardTextExtra() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27308, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27308, new Class[0], List.class);
        } else if (TextUtils.isEmpty(this.forwardId)) {
            return getTextExtra();
        } else {
            if (TextUtils.isEmpty(forwardTextPrefix)) {
                forwardTextPrefix = d.a().getString(C0906R.string.ahe) + " • ";
            }
            if (CollectionUtils.isEmpty(getTextExtra())) {
                return getTextExtra();
            }
            ArrayList arrayList = new ArrayList(this.textExtra.size());
            int length = forwardTextPrefix.length();
            Parcel obtain = Parcel.obtain();
            for (TextExtraStruct next : getTextExtra()) {
                next.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                TextExtraStruct createFromParcel = TextExtraStruct.CREATOR.createFromParcel(obtain);
                createFromParcel.setStart(next.getStart() + length);
                createFromParcel.setEnd(next.getEnd() + length);
                createFromParcel.setUserId(next.getUserId());
                arrayList.add(createFromParcel);
            }
            obtain.recycle();
            return arrayList;
        }
    }

    public List<TextExtraStruct> getDispalyTextExtraForMoment() {
        ArrayList arrayList;
        int i;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27301, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27301, new Class[0], List.class);
        } else if (TextUtils.isEmpty(getText())) {
            return getTextExtra();
        } else {
            if (this.textExtra != null) {
                arrayList = new ArrayList(this.textExtra.size());
                for (TextExtraStruct clone : this.textExtra) {
                    arrayList.add(clone.clone());
                }
            } else {
                arrayList = new ArrayList();
            }
            if (!TextUtils.isEmpty(this.forwardId)) {
                if (TextUtils.isEmpty(forwardTextPrefix)) {
                    forwardTextPrefix = d.a().getString(C0906R.string.ahe) + " • ";
                }
                int length = forwardTextPrefix.length();
                for (TextExtraStruct next : arrayList) {
                    next.setStart(next.getStart() + length);
                    next.setEnd(next.getEnd() + length);
                    next.setUserId(next.getUserId());
                }
            }
            if (getUser() != null) {
                createUserNamePrefix();
                for (TextExtraStruct next2 : arrayList) {
                    next2.setStart(next2.getStart() + this.mUserNamePrefix.length());
                    next2.setEnd(next2.getEnd() + this.mUserNamePrefix.length());
                }
                int length2 = ae.c(getUser()).length() - this.offset;
                if (getLabelType() > 0) {
                    i = getLabelText().length() + length2;
                    TextExtraStruct textExtraStruct = new TextExtraStruct();
                    textExtraStruct.setType(65281);
                    textExtraStruct.setCustomSpan(new a.C0459a(getLabelType()));
                    textExtraStruct.setStart(length2);
                    textExtraStruct.setEnd(i);
                    arrayList.add(textExtraStruct);
                } else {
                    i = length2;
                }
                if (CollectionUtils.isEmpty(getReplyComments()) || getReplyComments().get(0) == null) {
                    str = "";
                } else {
                    str = getReplyComments().get(0).getUser().getUid();
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.replyToUserId;
                }
                if (!TextUtils.isEmpty(str)) {
                    TextExtraStruct textExtraStruct2 = new TextExtraStruct();
                    textExtraStruct2.setType(65282);
                    textExtraStruct2.setStart(i + 3);
                    textExtraStruct2.setEnd(this.mUserNamePrefix.length());
                    textExtraStruct2.setUserId(str);
                    textExtraStruct2.setBoldText(true);
                    textExtraStruct2.setColor(d.a().getResources().getColor(C0906R.color.hy));
                    arrayList.add(textExtraStruct2);
                } else {
                    length2 = this.mUserNamePrefix.length();
                }
                TextExtraStruct textExtraStruct3 = new TextExtraStruct();
                textExtraStruct3.setType(65282);
                textExtraStruct3.setStart(0);
                textExtraStruct3.setEnd(length2);
                textExtraStruct3.setUserId(getUser().getUid());
                textExtraStruct3.setBoldText(true);
                textExtraStruct3.setColor(d.a().getResources().getColor(C0906R.color.hy));
                arrayList.add(textExtraStruct3);
            }
            return arrayList;
        }
    }

    public List<TextExtraStruct> getDisplayTextExtraForIns() {
        ArrayList arrayList;
        int i;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27302, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27302, new Class[0], List.class);
        } else if (TextUtils.isEmpty(getText())) {
            return getTextExtra();
        } else {
            if (this.textExtra != null) {
                arrayList = new ArrayList(this.textExtra.size());
                for (TextExtraStruct clone : this.textExtra) {
                    arrayList.add(clone.clone());
                }
            } else {
                arrayList = new ArrayList();
            }
            if (!TextUtils.isEmpty(this.forwardId)) {
                if (TextUtils.isEmpty(forwardTextPrefix)) {
                    forwardTextPrefix = d.a().getString(C0906R.string.ahe) + " • ";
                }
                int length = forwardTextPrefix.length();
                for (TextExtraStruct next : arrayList) {
                    next.setStart(next.getStart() + length);
                    next.setEnd(next.getEnd() + length);
                    next.setUserId(next.getUserId());
                }
            }
            if (getUser() != null) {
                createUserNamePrefix();
                for (TextExtraStruct next2 : arrayList) {
                    next2.setStart(next2.getStart() + this.mUserNamePrefix.length() + 1);
                    next2.setEnd(next2.getEnd() + this.mUserNamePrefix.length() + 1);
                }
                int length2 = ae.d(getUser()).length() - this.offset;
                if (getLabelType() > 0) {
                    i = getLabelText().length() + length2;
                    TextExtraStruct textExtraStruct = new TextExtraStruct();
                    textExtraStruct.setType(65281);
                    textExtraStruct.setCustomSpan(new a.C0459a(getLabelType()));
                    textExtraStruct.setStart(length2);
                    textExtraStruct.setEnd(i);
                    arrayList.add(textExtraStruct);
                } else {
                    i = length2;
                }
                if (CollectionUtils.isEmpty(getReplyComments()) || getReplyComments().get(0) == null) {
                    str = "";
                } else {
                    str = getReplyComments().get(0).getUser().getUid();
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.replyToUserId;
                }
                if (!TextUtils.isEmpty(str)) {
                    TextExtraStruct textExtraStruct2 = new TextExtraStruct();
                    textExtraStruct2.setType(65282);
                    textExtraStruct2.setStart(i + 3);
                    textExtraStruct2.setEnd(this.mUserNamePrefix.length());
                    textExtraStruct2.setUserId(str);
                    textExtraStruct2.setBoldText(true);
                    textExtraStruct2.setColor(d.a().getResources().getColor(C0906R.color.hy));
                    arrayList.add(textExtraStruct2);
                } else {
                    length2 = this.mUserNamePrefix.length();
                }
                TextExtraStruct textExtraStruct3 = new TextExtraStruct();
                textExtraStruct3.setType(65282);
                textExtraStruct3.setStart(0);
                textExtraStruct3.setEnd(length2);
                textExtraStruct3.setUserId(getUser().getUid());
                textExtraStruct3.setBoldText(true);
                textExtraStruct3.setColor(d.a().getResources().getColor(C0906R.color.hy));
                arrayList.add(textExtraStruct3);
            }
            return arrayList;
        }
    }

    public List<TextExtraStruct> getDisplayTextExtra() {
        ArrayList arrayList;
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27298, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27298, new Class[0], List.class);
        } else if (!isSupportReplyComment()) {
            return getForwardTextExtra();
        } else {
            if (TextUtils.isEmpty(getText())) {
                return getTextExtra();
            }
            if (this.textExtra != null) {
                arrayList = new ArrayList(this.textExtra.size());
                for (TextExtraStruct clone : this.textExtra) {
                    arrayList.add(clone.clone());
                }
            } else {
                arrayList = new ArrayList();
            }
            String timeDesc = getTimeDesc();
            int length = getText().length() + 1;
            int length2 = getText().length() + timeDesc.length();
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            if ((com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof ForwardDetailActivity) || (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof OriginDetailActivity)) {
                i = d.a().getResources().getColor(C0906R.color.zx);
            } else {
                i = d.a().getResources().getColor(C0906R.color.a74);
            }
            textExtraStruct.setCustomSpan(new a.b(u.c(13.0d), i));
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(length2);
            arrayList.add(textExtraStruct);
            if (!TextUtils.isEmpty(this.forwardId)) {
                if (TextUtils.isEmpty(forwardTextPrefix)) {
                    forwardTextPrefix = d.a().getString(C0906R.string.ahe) + " • ";
                }
                int length3 = forwardTextPrefix.length();
                for (TextExtraStruct next : arrayList) {
                    next.setStart(next.getStart() + length3);
                    next.setEnd(next.getEnd() + length3);
                    next.setUserId(next.getUserId());
                }
            }
            if (!TextUtils.isEmpty(this.replyToUserName)) {
                if (TextUtils.isEmpty(this.mReplyUsernameDesc)) {
                    this.mReplyUsernameDesc = d.a().getString(C0906R.string.w4, new Object[]{this.replyToUserName});
                }
                int length4 = this.mReplyUsernameDesc.length();
                for (TextExtraStruct next2 : arrayList) {
                    next2.setStart(next2.getStart() + length4);
                    next2.setEnd(next2.getEnd() + length4);
                }
                TextExtraStruct textExtraStruct2 = new TextExtraStruct();
                textExtraStruct2.setType(65282);
                if ((com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof ForwardDetailActivity) || (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof OriginDetailActivity)) {
                    i2 = d.a().getResources().getColor(C0906R.color.zx);
                } else if (com.ss.android.g.a.a()) {
                    i2 = d.a().getResources().getColor(C0906R.color.any);
                } else {
                    i2 = d.a().getResources().getColor(C0906R.color.p_);
                }
                int indexOf = this.mReplyUsernameDesc.indexOf(this.replyToUserName);
                textExtraStruct2.setStart(indexOf);
                if (com.ss.android.g.a.a()) {
                    textExtraStruct2.setBoldText(true);
                }
                textExtraStruct2.setUserId(this.replyToUserId);
                textExtraStruct2.setColor(i2);
                textExtraStruct2.setEnd(indexOf + this.replyToUserName.length());
                arrayList.add(textExtraStruct2);
            }
            return arrayList;
        }
    }

    public void setAuthorDigged(boolean z) {
        this.isAuthorDigged = z;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCommentType(int i) {
        this.mCommentType = i;
    }

    public void setCreateTime(int i) {
        this.createTime = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setFakeId(String str) {
        this.fakeId = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setNeedHint(boolean z) {
        this.mNeedHint = z;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyCommentTotal(int i) {
        this.replyCommentTotal = i;
    }

    public void setReplyComments(List<Comment> list) {
        this.replyComments = list;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setReplyToUserId(String str) {
        this.replyToUserId = str;
    }

    public void setReplyToUserName(String str) {
        this.replyToUserName = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public void setUserDigged(int i) {
        this.userDigged = i;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 27294, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 27294, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return TextUtils.equals(this.cid, ((Comment) obj).cid);
        }
    }

    public String getDisplayText(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 27297, new Class[]{Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 27297, new Class[]{Boolean.TYPE}, String.class);
        } else if (!isSupportReplyComment()) {
            return getForwardText();
        } else {
            StringBuilder sb = new StringBuilder(getText());
            if (!TextUtils.isEmpty(this.forwardId)) {
                if (TextUtils.isEmpty(forwardTextPrefix)) {
                    forwardTextPrefix = d.a().getString(C0906R.string.ahe) + " • ";
                }
                sb.insert(0, forwardTextPrefix);
            }
            if (!TextUtils.isEmpty(this.replyToUserName)) {
                if (TextUtils.isEmpty(this.mReplyUsernameDesc)) {
                    this.mReplyUsernameDesc = d.a().getString(C0906R.string.w4, new Object[]{this.replyToUserName});
                }
                sb.insert(0, this.mReplyUsernameDesc);
            }
            if (z) {
                sb.append(" ");
                sb.append(getTimeDesc());
            }
            return sb.toString();
        }
    }

    public String getDisplayTextForIns(Paint paint, int i) {
        if (PatchProxy.isSupport(new Object[]{paint, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27300, new Class[]{Paint.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{paint, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27300, new Class[]{Paint.class, Integer.TYPE}, String.class);
        }
        return createUserNamePrefixForIns(paint, i) + "：" + getForwardText();
    }

    public String getDisplayTextForMoment(Paint paint, int i) {
        if (PatchProxy.isSupport(new Object[]{paint, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27299, new Class[]{Paint.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{paint, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27299, new Class[]{Paint.class, Integer.TYPE}, String.class);
        }
        return createUserNamePrefix(paint, i) + getForwardText();
    }

    private String createUserNamePrefix(Paint paint, int i) {
        String str;
        float f2;
        Paint paint2 = paint;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{paint2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27304, new Class[]{Paint.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{paint2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27304, new Class[]{Paint.class, Integer.TYPE}, String.class);
        }
        if (getUser() != null && TextUtils.isEmpty(this.mUserNamePrefix)) {
            String c2 = ae.c(getUser());
            if (CollectionUtils.isEmpty(getReplyComments()) || getReplyComments().get(0) == null) {
                str = "";
            } else {
                str = ae.c(getReplyComments().get(0).getUser());
            }
            if (TextUtils.isEmpty(str)) {
                str = this.replyToUserName;
            }
            if (paint2 != null && i2 > 0 && getLabelType() > 0 && !TextUtils.isEmpty(getLabelText())) {
                if (TextUtils.isEmpty(str)) {
                    f2 = paint2.measureText("：");
                } else {
                    f2 = 0.0f;
                }
                SpannableString spannableString = new SpannableString(getLabelText());
                a.C0459a aVar = new a.C0459a(getLabelType());
                _lancet.com_ss_android_ugc_aweme_lancet_SetSpanLancet_setSpan(spannableString, aVar, 0, getLabelText().length() - 1, 33);
                StaticLayout staticLayout = new StaticLayout(spannableString, aVar.a(paint2), 10000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                float lineWidth = staticLayout.getLineWidth(0);
                float f3 = (float) i2;
                if (paint2.measureText(c2) + lineWidth + f2 > f3) {
                    float measureText = paint2.measureText("...");
                    do {
                        c2 = c2.substring(0, c2.length() - 1);
                    } while (paint2.measureText(c2) + lineWidth + measureText + f2 > f3);
                    c2 = c2 + "...";
                    this.offset = ae.c(this.user).length() - c2.length();
                }
            }
            StringBuilder sb = new StringBuilder(c2);
            if (getLabelType() > 0) {
                sb.append(getLabelText());
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(" ");
                sb.append(d.a().getResources().getString(C0906R.string.bz7));
                sb.append(" ");
                sb.append(str);
            }
            sb.append("：");
            this.mUserNamePrefix = sb.toString();
        }
        return this.mUserNamePrefix;
    }

    private String createUserNamePrefixForIns(Paint paint, int i) {
        String str;
        float f2;
        Paint paint2 = paint;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{paint2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27305, new Class[]{Paint.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{paint2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27305, new Class[]{Paint.class, Integer.TYPE}, String.class);
        }
        if (getUser() != null && TextUtils.isEmpty(this.mUserNamePrefix)) {
            String d2 = ae.d(getUser());
            if (CollectionUtils.isEmpty(getReplyComments()) || getReplyComments().get(0) == null) {
                str = "";
            } else {
                str = ae.d(getReplyComments().get(0).getUser());
            }
            if (TextUtils.isEmpty(str)) {
                str = this.replyToUserName;
            }
            if (paint2 != null && i2 > 0 && getLabelType() > 0 && !TextUtils.isEmpty(getLabelText())) {
                if (TextUtils.isEmpty(str)) {
                    f2 = paint2.measureText("：");
                } else {
                    f2 = 0.0f;
                }
                SpannableString spannableString = new SpannableString(getLabelText());
                a.C0459a aVar = new a.C0459a(getLabelType());
                _lancet.com_ss_android_ugc_aweme_lancet_SetSpanLancet_setSpan(spannableString, aVar, 0, getLabelText().length() - 1, 33);
                StaticLayout staticLayout = new StaticLayout(spannableString, aVar.a(paint2), 10000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                float lineWidth = staticLayout.getLineWidth(0);
                float f3 = (float) i2;
                if (paint2.measureText(d2) + lineWidth + f2 > f3) {
                    float measureText = paint2.measureText("...");
                    do {
                        d2 = d2.substring(0, d2.length() - 1);
                    } while (paint2.measureText(d2) + lineWidth + measureText + f2 > f3);
                    d2 = d2 + "...";
                    this.offset = ae.d(this.user).length() - d2.length();
                }
            }
            StringBuilder sb = new StringBuilder(d2);
            if (getLabelType() > 0) {
                sb.append(getLabelText());
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(" ");
                sb.append(d.a().getResources().getString(C0906R.string.bz7));
                sb.append(" ");
                sb.append(str);
            }
            this.mUserNamePrefix = sb.toString();
        }
        return this.mUserNamePrefix;
    }
}
