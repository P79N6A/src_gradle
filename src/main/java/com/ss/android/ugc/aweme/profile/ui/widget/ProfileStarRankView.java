package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.hotsearch.d.g;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class ProfileStarRankView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63055a;

    /* renamed from: b  reason: collision with root package name */
    List<AvatarWithBorderView> f63056b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f63057c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f63058d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f63059e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f63060f;
    private DmtTextView g;
    private DmtTextView h;
    private ImageView i;
    private AvatarWithBorderView j;
    private AvatarWithBorderView k;
    private AvatarWithBorderView l;

    public ViewGroup getHitRankView() {
        return this.f63059e;
    }

    public ViewGroup getStarRankView() {
        return this.f63058d;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63055a, false, 69786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63055a, false, 69786, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.ard, this, true);
        this.f63057c = (RemoteImageView) findViewById(C0906R.id.az5);
        this.f63058d = (LinearLayout) findViewById(C0906R.id.bi4);
        this.f63059e = (LinearLayout) findViewById(C0906R.id.bgu);
        this.f63060f = (DmtTextView) findViewById(C0906R.id.dje);
        this.g = (DmtTextView) findViewById(C0906R.id.dcu);
        this.h = (DmtTextView) findViewById(C0906R.id.djf);
        this.i = (ImageView) findViewById(C0906R.id.b5a);
        this.j = (AvatarWithBorderView) findViewById(C0906R.id.b21);
        this.k = (AvatarWithBorderView) findViewById(C0906R.id.b22);
        this.l = (AvatarWithBorderView) findViewById(C0906R.id.b23);
        this.f63056b.add(this.j);
        this.f63056b.add(this.k);
        this.f63056b.add(this.l);
        for (AvatarWithBorderView next : this.f63056b) {
            next.setBorderColor(C0906R.color.yo);
            next.setBorderWidth(1);
        }
    }

    public ProfileStarRankView(Context context) {
        this(context, null);
    }

    public void setBackgroundImage(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63055a, false, 69789, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63055a, false, 69789, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            c.a(this.f63057c, str2);
        }
    }

    public void setHitRankPeopleNumber(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63055a, false, 69788, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63055a, false, 69788, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.setText(getResources().getString(C0906R.string.amc, new Object[]{b.a((long) i2)}));
    }

    public void setHitRankUsers(List<User> list) {
        List<User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f63055a, false, 69790, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f63055a, false, 69790, new Class[]{List.class}, Void.TYPE);
        } else if (list2 != null) {
            int min = Math.min(list.size(), 3);
            for (int i2 = 0; i2 < min; i2++) {
                User user = list2.get(i2);
                if (user != null) {
                    c.b(this.f63056b.get(i2), user.getAvatarThumb());
                }
            }
        }
    }

    public void setRank(int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63055a, false, 69787, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63055a, false, 69787, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 > 0) {
            if (i2 <= 30) {
                str = i2;
                this.i.setImageResource(g.f49735a[i2 - 1]);
                this.i.setVisibility(0);
                this.h.setVisibility(8);
            } else {
                str = "30+";
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" T");
                spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.commercialize.ad.b(getContext(), 2130838880), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                this.h.setText(spannableStringBuilder);
                this.h.setVisibility(0);
                this.i.setVisibility(8);
            }
            this.f63060f.setText(getResources().getString(C0906R.string.cdd, new Object[]{str}));
        }
    }

    public ProfileStarRankView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63056b = new ArrayList();
        a();
    }
}
