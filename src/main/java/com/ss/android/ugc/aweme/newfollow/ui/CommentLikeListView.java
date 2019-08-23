package com.ss.android.ugc.aweme.newfollow.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.List;
import java.util.Map;

public class CommentLikeListView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57183a;

    /* renamed from: b  reason: collision with root package name */
    protected AvatarWithBorderView[] f57184b = new AvatarWithBorderView[3];

    /* renamed from: c  reason: collision with root package name */
    protected List<User> f57185c;

    /* renamed from: d  reason: collision with root package name */
    protected String f57186d;

    /* renamed from: e  reason: collision with root package name */
    protected String f57187e;

    /* renamed from: f  reason: collision with root package name */
    protected String f57188f;
    protected a g;
    @BindView(2131495353)
    RelativeLayout mHeadViews;
    @BindView(2131495354)
    DmtTextView mTvContent;

    interface a {
        void a(int i);
    }

    public interface b {
        void a(View view, User user);
    }

    class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57192a;

        /* renamed from: c  reason: collision with root package name */
        private User f57194c;

        /* renamed from: d  reason: collision with root package name */
        private b f57195d;

        /* renamed from: e  reason: collision with root package name */
        private int f57196e;

        public final void onClick(@NonNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57192a, false, 61448, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57192a, false, 61448, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (!com.ss.android.ugc.aweme.c.a.a.a(view) && this.f57195d != null) {
                this.f57195d.a(view, this.f57194c);
            }
        }

        public final void updateDrawState(@NonNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f57192a, false, 61449, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f57192a, false, 61449, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setColor(this.f57196e);
            textPaint2.setUnderlineText(false);
            textPaint2.setFakeBoldText(true);
        }

        c(User user, b bVar, int i) {
            this.f57194c = user;
            this.f57195d = bVar;
            this.f57196e = i;
        }
    }

    public int getLayoutId() {
        return C0906R.layout.a45;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57183a, false, 61445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57183a, false, 61445, new Class[0], Void.TYPE);
            return;
        }
        for (int i = 0; i < 3; i++) {
            this.f57184b[i].setVisibility(8);
        }
    }

    public void setAuthorId(String str) {
        this.f57188f = str;
    }

    public void setAwemeId(String str) {
        this.f57187e = str;
    }

    public void setDiggCountCallback(a aVar) {
        this.g = aVar;
    }

    public void setEventType(String str) {
        this.f57186d = str;
    }

    public CommentLikeListView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f57183a, false, 61442, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f57183a, false, 61442, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        ButterKnife.bind((Object) this, inflate);
        this.f57184b[0] = (AvatarWithBorderView) inflate.findViewById(C0906R.id.bba);
        this.f57184b[1] = (AvatarWithBorderView) inflate.findViewById(C0906R.id.bbb);
        this.f57184b[2] = (AvatarWithBorderView) inflate.findViewById(C0906R.id.bbc);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57183a, false, 61444, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57183a, false, 61444, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this.f57185c, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(User user) {
        if (user.getUid() != null) {
            h.a().a((Activity) getContext(), j.a("aweme://user/profile/" + user.getUid()).a("enter_from", "homepage_follow").a("sec_user_id", user.getSecUid()).a());
            r.a("enter_personal_detail", (Map) d.a().a("enter_from", this.f57186d).a("to_user_id", user.getUid()).a("group_id", this.f57187e).a("author_id", this.f57188f).a("enter_method", "click_like_name").f34114b);
        }
    }

    public CommentLikeListView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public void a(List<User> list, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        List<User> list2 = list;
        int i3 = i;
        int i4 = 2;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i)}, this, f57183a, false, 61443, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i)}, this, f57183a, false, 61443, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
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
            sb.append(getContext().getString(C0906R.string.ag1, new Object[]{com.ss.android.ugc.aweme.i18n.b.a((long) i3)}));
            this.mTvContent.setTextColor(getContext().getResources().getColor(C0906R.color.bf));
            this.mTvContent.setText(sb.toString());
            return;
        }
        if (list.size() < i3) {
            sb.append(" " + getContext().getString(C0906R.string.ag2, new Object[]{com.ss.android.ugc.aweme.i18n.b.a((long) i3)}));
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
                com.ss.android.ugc.aweme.base.c.b(this.f57184b[i5], list2.get(i5).getAvatarThumb());
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
            spannableStringBuilder.setSpan(new c(user2, new b(this, user2), getContext().getResources().getColor(C0906R.color.hy)), i9, length, 17);
            if (length >= spannableStringBuilder.length()) {
                break;
            }
            i8++;
            i9 = length;
            i4 = 2;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(C0906R.color.bf));
        int length2 = spannableStringBuilder.toString().length();
        spannableStringBuilder.append(sb);
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.toString().length(), 33);
        if (i2 > 0) {
            spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard((int) UIUtils.dip2Px(getContext(), (float) (((i2 - 1) * 12) + 24)), 0), 0, spannableStringBuilder.length(), 17);
        }
        this.mTvContent.setText(spannableStringBuilder);
        this.mTvContent.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public CommentLikeListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public final int a(TextPaint textPaint, CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{textPaint, charSequence2, 2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57183a, false, 61446, new Class[]{TextPaint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{textPaint, charSequence2, 2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57183a, false, 61446, new Class[]{TextPaint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        final int[] iArr = {-1};
        if (staticLayout.getLineCount() >= 2) {
            final int lineStart = staticLayout.getLineStart(1);
            CharSequence subSequence = charSequence2.subSequence(lineStart, charSequence.length());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            AnonymousClass1 r5 = new TextUtils.EllipsizeCallback() {
                public final void ellipsized(int i, int i2) {
                    if (i2 - i <= 0) {
                        iArr[0] = -1;
                    } else {
                        iArr[0] = lineStart + i;
                    }
                }
            };
            TextUtils.ellipsize(subSequence, textPaint, (float) i2, truncateAt, false, r5);
        }
        return iArr[0];
    }
}
