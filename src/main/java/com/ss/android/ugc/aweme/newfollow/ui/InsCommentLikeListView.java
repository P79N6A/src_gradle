package com.ss.android.ugc.aweme.newfollow.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.newfollow.ui.CommentLikeListView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.List;
import java.util.Map;

public class InsCommentLikeListView extends CommentLikeListView {
    public static ChangeQuickRedirect h;

    public int getLayoutId() {
        return C0906R.layout.a59;
    }

    public InsCommentLikeListView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(User user) {
        if (user.getUid() != null) {
            h.a().a((Activity) getContext(), j.a("aweme://user/profile/" + user.getUid()).a("sec_user_id", user.getSecUid()).a("enter_from", "homepage_follow").a());
            r.a("enter_personal_detail", (Map) d.a().a("enter_from", this.f57186d).a("to_user_id", user.getUid()).a("group_id", this.f57187e).a("author_id", this.f57188f).a("enter_method", "click_like_name").f34114b);
        }
    }

    public InsCommentLikeListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(List<User> list, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        List<User> list2 = list;
        int i3 = i;
        int i4 = 2;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i)}, this, h, false, 61664, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i)}, this, h, false, 61664, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f57185c = list2;
        if (this.g != null) {
            this.g.a(i3);
        }
        if (i3 <= 0) {
            setVisibility(8);
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        StringBuilder sb = new StringBuilder();
        if (CollectionUtils.isEmpty(list)) {
            a();
            sb.append(getContext().getString(C0906R.string.ag1, new Object[]{b.a((long) i3)}));
            this.mTvContent.setText(sb.toString());
            return;
        }
        if (list.size() < i3) {
            sb.append(" " + getContext().getString(C0906R.string.ag2, new Object[]{b.a((long) i3)}));
        } else {
            sb.append(" " + getContext().getString(C0906R.string.ag0));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list.size() > 3) {
            i2 = 3;
        } else {
            i2 = list.size();
        }
        for (int i5 = 0; i5 < 3; i5++) {
            if (i5 < i2) {
                this.f57184b[i5].setVisibility(0);
                this.f57184b[i5].setBorderColor(C0906R.color.p1);
                c.b(this.f57184b[i5], list2.get(i5).getAvatarThumb());
            } else {
                this.f57184b[i5].setVisibility(8);
            }
        }
        TextPaint paint = this.mTvContent.getPaint();
        int paddingLeft = this.mTvContent.getPaddingLeft();
        int paddingRight = this.mTvContent.getPaddingRight();
        float measureText = paint.measureText(String.valueOf(sb)) + (paint.getTextSize() * 3.0f);
        int i6 = 56;
        if (AbTestManager.a().aB() == 2) {
            i6 = 98;
        }
        int screenWidth = (int) ((((((float) UIUtils.getScreenWidth(getContext())) - UIUtils.dip2Px(getContext(), (float) i6)) - ((float) paddingLeft)) - ((float) paddingRight)) - measureText);
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < i2; i7++) {
            User user = list2.get(i7);
            if (TextUtils.isEmpty(user.getRemarkName())) {
                str2 = user.getNickname();
            } else {
                str2 = user.getRemarkName();
            }
            sb2.append(str2);
            if (i7 < i2 - 1) {
                str3 = "、";
            } else {
                str3 = "";
            }
            sb2.append(str3);
        }
        int a2 = a(paint, sb2.toString(), 2, screenWidth, (int) (((float) screenWidth) + measureText));
        if (a2 != -1) {
            spannableStringBuilder.append(((String) sb2.subSequence(0, a2)) + "...");
        } else {
            spannableStringBuilder.append(sb2.toString());
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i2) {
            User user2 = list2.get(i8);
            if (TextUtils.isEmpty(user2.getRemarkName())) {
                str = user2.getNickname();
            } else {
                str = user2.getRemarkName();
            }
            int length = str.length() + i9 + i4;
            if (length > spannableStringBuilder.length()) {
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(new CommentLikeListView.c(user2, new l(this, user2), getContext().getResources().getColor(C0906R.color.zr)), i9, length, 17);
            if (length >= spannableStringBuilder.length()) {
                break;
            }
            i8++;
            i9 = length;
            i4 = 2;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(C0906R.color.zr));
        int length2 = spannableStringBuilder.toString().length();
        spannableStringBuilder.append(sb);
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.toString().length(), 33);
        if (i2 > 0) {
            spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard((int) UIUtils.dip2Px(getContext(), (float) (((i2 - 1) * 12) + 24)), 0), 0, spannableStringBuilder.length(), 17);
        }
        this.mTvContent.setText(spannableStringBuilder);
        this.mTvContent.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public InsCommentLikeListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
