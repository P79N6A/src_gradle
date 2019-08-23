package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.HollowTextView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.ui.am;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.u.p;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class TagLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34981a;
    private static final int h = u.a(5.0d);

    /* renamed from: b  reason: collision with root package name */
    public Aweme f34982b;

    /* renamed from: c  reason: collision with root package name */
    public HollowTextView f34983c;

    /* renamed from: d  reason: collision with root package name */
    private Context f34984d;

    /* renamed from: e  reason: collision with root package name */
    private String f34985e;

    /* renamed from: f  reason: collision with root package name */
    private MentionTextView f34986f;
    private List<Integer> g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f34990a = 7;

        /* renamed from: b  reason: collision with root package name */
        public final int f34991b;

        public a(int i, int i2) {
            this.f34991b = i2;
        }
    }

    public void a(List<AwemeLabelModel> list, a aVar) {
        List<AwemeLabelModel> list2 = list;
        a aVar2 = aVar;
        char c2 = 2;
        if (PatchProxy.isSupport(new Object[]{list2, aVar2}, this, f34981a, false, 25120, new Class[]{List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, aVar2}, this, f34981a, false, 25120, new Class[]{List.class, a.class}, Void.TYPE);
        } else if (list2 == null) {
            a(0, getChildCount());
        } else {
            a(list.size(), getChildCount());
            int i = 0;
            while (i < list.size()) {
                AwemeLabelModel awemeLabelModel = list2.get(i);
                if (awemeLabelModel != null && !this.g.contains(Integer.valueOf(awemeLabelModel.getLabelType()))) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) UIUtils.dip2Px(this.f34984d, (float) aVar2.f34991b));
                    if (i == 0) {
                        layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f34984d, 0.0f);
                    } else {
                        layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f34984d, (float) aVar2.f34990a);
                    }
                    View childAt = getChildAt(i);
                    if (awemeLabelModel != null) {
                        if (childAt == null) {
                            childAt = new RemoteImageView(this.f34984d);
                            addView(childAt, -1, layoutParams);
                        } else {
                            childAt.setLayoutParams(layoutParams);
                        }
                        if (childAt instanceof RemoteImageView) {
                            childAt.setVisibility(0);
                            childAt.setAlpha(1.0f);
                            RemoteImageView remoteImageView = (RemoteImageView) childAt;
                            UrlModel urlModels = awemeLabelModel.getUrlModels();
                            int labelType = awemeLabelModel.getLabelType();
                            Object[] objArr = new Object[3];
                            objArr[0] = remoteImageView;
                            objArr[1] = urlModels;
                            objArr[c2] = Integer.valueOf(labelType);
                            ChangeQuickRedirect changeQuickRedirect = f34981a;
                            Class[] clsArr = new Class[3];
                            clsArr[0] = RemoteImageView.class;
                            clsArr[1] = UrlModel.class;
                            clsArr[c2] = Integer.TYPE;
                            int i2 = labelType;
                            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 25122, clsArr, RemoteImageView.class)) {
                                RemoteImageView remoteImageView2 = (RemoteImageView) PatchProxy.accessDispatch(new Object[]{remoteImageView, urlModels, Integer.valueOf(i2)}, this, f34981a, false, 25122, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE}, RemoteImageView.class);
                            } else {
                                remoteImageView.setTag(Integer.valueOf(i2));
                                remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                                int i3 = i2;
                                if (i3 == 3) {
                                    int i4 = i3;
                                    if (PatchProxy.isSupport(new Object[]{urlModels, Integer.valueOf(i3), remoteImageView}, this, f34981a, false, 25124, new Class[]{UrlModel.class, Integer.TYPE, RemoteImageView.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{urlModels, Integer.valueOf(i4), remoteImageView}, this, f34981a, false, 25124, new Class[]{UrlModel.class, Integer.TYPE, RemoteImageView.class}, Void.TYPE);
                                    } else if ((this.f34982b == null || this.f34982b.getRate() != 0) && !com.ss.android.ugc.aweme.base.utils.a.a(this.f34985e, "homepage_hot")) {
                                        remoteImageView.setVisibility(8);
                                    } else {
                                        c.a(remoteImageView, urlModels, (ControllerListener<ImageInfo>) new am<ImageInfo>(remoteImageView, this.f34984d));
                                    }
                                } else {
                                    int i5 = i3;
                                    if (PatchProxy.isSupport(new Object[]{urlModels, Integer.valueOf(i5), remoteImageView}, this, f34981a, false, 25123, new Class[]{UrlModel.class, Integer.TYPE, RemoteImageView.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{urlModels, Integer.valueOf(i5), remoteImageView}, this, f34981a, false, 25123, new Class[]{UrlModel.class, Integer.TYPE, RemoteImageView.class}, Void.TYPE);
                                    } else {
                                        c.a(remoteImageView, urlModels, (ControllerListener<ImageInfo>) new am<ImageInfo>(remoteImageView, this.f34984d));
                                        setVisibility(0);
                                    }
                                }
                            }
                        } else {
                            removeView(childAt);
                            addView(new RemoteImageView(this.f34984d), i, layoutParams);
                        }
                        i++;
                        c2 = 2;
                    }
                }
                i++;
                c2 = 2;
            }
        }
    }

    public final void a(Aweme aweme, List<AwemeLabelModel> list, a aVar) {
        Aweme aweme2 = aweme;
        List<AwemeLabelModel> list2 = list;
        a aVar2 = aVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{aweme2, list2, aVar2}, this, f34981a, false, 25126, new Class[]{Aweme.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list2, aVar2}, this, f34981a, false, 25126, new Class[]{Aweme.class, List.class, a.class}, Void.TYPE);
            return;
        }
        this.f34982b = aweme2;
        a();
        a(list2, aVar2);
        a(aweme.getRelationLabel());
        if (getChildCount() <= 0) {
            i = 8;
        }
        setVisibility(i);
    }

    public void a(final RelationDynamicLabel relationDynamicLabel) {
        String str;
        boolean z = true;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{relationDynamicLabel}, this, f34981a, false, 25128, new Class[]{RelationDynamicLabel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{relationDynamicLabel}, this, f34981a, false, 25128, new Class[]{RelationDynamicLabel.class}, Void.TYPE);
        } else if (relationDynamicLabel != null && relationDynamicLabel.isValid()) {
            if (this.f34983c == null) {
                this.f34983c = d();
            }
            String b2 = com.ss.android.ugc.aweme.base.utils.a.b(relationDynamicLabel.getNickname());
            String labelInfo = relationDynamicLabel.getLabelInfo();
            if (getChildCount() <= 0) {
                z = false;
            }
            if (TextUtils.isEmpty(b2)) {
                str = com.ss.android.ugc.aweme.base.utils.a.a(labelInfo, 15, "…");
            } else {
                String a2 = com.ss.android.ugc.aweme.base.utils.a.a("@" + b2, (int) Math.ceil((double) (15.0f - com.ss.android.ugc.aweme.base.utils.a.a(labelInfo))));
                if (!TextUtils.isEmpty(a2)) {
                    a2 = a2 + " ";
                }
                str = a2 + labelInfo;
            }
            this.f34983c.setText(str);
            LinearLayout.LayoutParams c2 = c();
            if (z) {
                i = u.a(6.0d);
            }
            c2.leftMargin = i;
            this.f34983c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34987a;

                public final void onClick(View view) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f34987a, false, 25145, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f34987a, false, 25145, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    UserProfileActivity.a(TagLayout.this.getContext(), relationDynamicLabel.getUserId(), TagLayout.this.f34982b.getAuthor().getSecUid(), "like_banner");
                    r.onEvent(MobClick.obtain().setEventName("click").setLabelName("like_banner").setValue(TagLayout.this.f34982b.getAid()).setExtValueString(d.a().getCurUserId()));
                    MobClick value = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(relationDynamicLabel.getUserId());
                    com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a("group_id", TagLayout.this.f34982b.getAid()).a("enter_type", "normal_way");
                    TagLayout tagLayout = TagLayout.this;
                    Aweme aweme = TagLayout.this.f34982b;
                    if (PatchProxy.isSupport(new Object[]{aweme}, tagLayout, TagLayout.f34981a, false, 25144, new Class[]{Aweme.class}, String.class)) {
                        TagLayout tagLayout2 = tagLayout;
                        str = (String) PatchProxy.accessDispatch(new Object[]{aweme}, tagLayout2, TagLayout.f34981a, false, 25144, new Class[]{Aweme.class}, String.class);
                    } else {
                        JSONObject b2 = com.ss.android.ugc.aweme.feed.a.a().b(aweme, 0);
                        if (b2 != null) {
                            str = b2.optString("request_id");
                        } else {
                            str = "";
                        }
                    }
                    r.onEvent(value.setJsonObject(a2.a("request_id", str).a("enter_from", "homepage_hot").a("enter_mothod", "click_like_banner").b()));
                    new p().a(TagLayout.this.f34982b.getAid()).c("personal_homepage").b(TagLayout.this.f34982b.getAuthorUid()).e("homepage_hot").e();
                }
            });
            addView(this.f34983c, c2);
        }
    }

    private LinearLayout.LayoutParams c() {
        if (!PatchProxy.isSupport(new Object[0], this, f34981a, false, 25130, new Class[0], LinearLayout.LayoutParams.class)) {
            return new LinearLayout.LayoutParams(-2, -1);
        }
        return (LinearLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f34981a, false, 25130, new Class[0], LinearLayout.LayoutParams.class);
    }

    private RemoteImageView getPrivateTag() {
        if (PatchProxy.isSupport(new Object[0], this, f34981a, false, 25142, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, f34981a, false, 25142, new Class[0], RemoteImageView.class);
        }
        RemoteImageView a2 = a(1);
        if (a2 == null) {
            a2 = a(11);
        }
        return a2;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34981a, false, 25137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34981a, false, 25137, new Class[0], Void.TYPE);
            return;
        }
        if (this.f34983c != null) {
            removeView(this.f34983c);
        }
        if (this.f34986f != null) {
            removeView(this.f34986f);
        }
        setOnClickListener(null);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34981a, false, 25141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34981a, false, 25141, new Class[0], Void.TYPE);
            return;
        }
        RemoteImageView privateTag = getPrivateTag();
        if (privateTag != null) {
            privateTag.setVisibility(8);
        }
    }

    @NonNull
    private HollowTextView d() {
        if (PatchProxy.isSupport(new Object[0], this, f34981a, false, 25131, new Class[0], HollowTextView.class)) {
            return (HollowTextView) PatchProxy.accessDispatch(new Object[0], this, f34981a, false, 25131, new Class[0], HollowTextView.class);
        }
        HollowTextView.a aVar = new HollowTextView.a();
        aVar.f34948b = u.a(13.0d);
        aVar.f34949c = o.a(C0906R.color.a09);
        aVar.f34950d = u.a(4.0d);
        aVar.g = true;
        aVar.f34952f = true;
        aVar.h = true;
        aVar.f34951e = true;
        HollowTextView hollowTextView = new HollowTextView(getContext(), aVar);
        hollowTextView.setPadding(u.a(6.0d), 0, u.a(5.5d), 0);
        return hollowTextView;
    }

    public void setEventType(String str) {
        this.f34985e = str;
    }

    public TagLayout(Context context) {
        this(context, null);
    }

    private RemoteImageView a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34981a, false, 25125, new Class[]{Integer.TYPE}, RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34981a, false, 25125, new Class[]{Integer.TYPE}, RemoteImageView.class);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt instanceof RemoteImageView)) {
                int i3 = i;
            } else if (i == ((Integer) childAt.getTag()).intValue()) {
                return (RemoteImageView) childAt;
            }
        }
        return null;
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int a(String str, @ColorInt int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f34981a, false, 25140, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f34981a, false, 25140, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = Color.parseColor(str);
            } catch (Exception unused) {
            }
            return i2;
        }
        i2 = i;
        return i2;
    }

    private void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f34981a, false, 25121, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f34981a, false, 25121, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i < i2) {
            for (int i3 = i; i3 < i2; i3++) {
                removeView(getChildAt(i3));
            }
        }
    }

    public TagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34984d = context;
        this.g = new ArrayList();
    }

    private TextView a(TextView textView, AwemeTextLabelModel awemeTextLabelModel, ViewGroup.LayoutParams layoutParams) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, awemeTextLabelModel, layoutParams}, this, f34981a, false, 25139, new Class[]{TextView.class, AwemeTextLabelModel.class, ViewGroup.LayoutParams.class}, TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[]{textView2, awemeTextLabelModel, layoutParams}, this, f34981a, false, 25139, new Class[]{TextView.class, AwemeTextLabelModel.class, ViewGroup.LayoutParams.class}, TextView.class);
        }
        com.ss.android.ugc.aweme.commercialize.utils.o.a((View) textView, awemeTextLabelModel);
        textView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, (float) u.a(13.0d));
        textView.setTextColor(a(awemeTextLabelModel.getTextColor(), -1));
        textView.setGravity(16);
        textView.setBackgroundDrawable(v.a(a(awemeTextLabelModel.getBgColor(), ContextCompat.getColor(this.f34984d, C0906R.color.ry)), (float) u.a(4.0d)));
        textView.setPadding(h, 0, h, 0);
        textView.setSingleLine();
        textView.setVisibility(0);
        return textView2;
    }

    public final void b(Aweme aweme, List<AwemeLabelModel> list, a aVar) {
        Aweme aweme2 = aweme;
        List<AwemeLabelModel> list2 = list;
        a aVar2 = aVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{aweme2, list2, aVar2}, this, f34981a, false, 25134, new Class[]{Aweme.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list2, aVar2}, this, f34981a, false, 25134, new Class[]{Aweme.class, List.class, a.class}, Void.TYPE);
            return;
        }
        this.f34982b = aweme2;
        a();
        if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            a(list2, aVar2);
        } else {
            if (PatchProxy.isSupport(new Object[]{aweme2, aVar2}, this, f34981a, false, 25138, new Class[]{Aweme.class, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2, aVar2}, this, f34981a, false, 25138, new Class[]{Aweme.class, a.class}, Void.TYPE);
            } else if (aweme2 == null || aweme.getTextVideoLabels() == null) {
                a(0, getChildCount());
            } else {
                a(aweme.getTextVideoLabels().size(), getChildCount());
                for (int i2 = 0; i2 < aweme.getTextVideoLabels().size(); i2++) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) UIUtils.dip2Px(this.f34984d, (float) aVar2.f34991b));
                    if (i2 == 0) {
                        layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f34984d, 0.0f);
                    } else {
                        layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f34984d, (float) aVar2.f34990a);
                    }
                    layoutParams.rightMargin = (int) UIUtils.dip2Px(this.f34984d, 100.0f);
                    AwemeTextLabelModel awemeTextLabelModel = aweme.getTextVideoLabels().get(i2);
                    if (awemeTextLabelModel != null) {
                        View childAt = getChildAt(i2);
                        if (childAt == null) {
                            DmtTextView dmtTextView = new DmtTextView(getContext());
                            addView(dmtTextView, -1, layoutParams);
                            a((TextView) dmtTextView, awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                        } else if (childAt instanceof TextView) {
                            a((TextView) getChildAt(i2), awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                        } else {
                            removeView(childAt);
                            DmtTextView dmtTextView2 = new DmtTextView(getContext());
                            addView(dmtTextView2, i2, layoutParams);
                            a((TextView) dmtTextView2, awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                        }
                    }
                }
            }
        }
        if (getChildCount() <= 0) {
            i = 8;
        }
        setVisibility(i);
    }

    public final void a(Aweme aweme, String str, a aVar, View.OnClickListener onClickListener) {
        MentionTextView mentionTextView;
        Aweme aweme2 = aweme;
        String str2 = str;
        a aVar2 = aVar;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{aweme2, str2, aVar2, onClickListener2}, this, f34981a, false, 25136, new Class[]{Aweme.class, String.class, a.class, View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str2, aVar2, onClickListener2}, this, f34981a, false, 25136, new Class[]{Aweme.class, String.class, a.class, View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f34982b = aweme2;
        a();
        a((List<AwemeLabelModel>) null, aVar2);
        RelationDynamicLabel relationDynamicLabel = new RelationDynamicLabel();
        relationDynamicLabel.setLabelInfo(str2);
        if (PatchProxy.isSupport(new Object[]{relationDynamicLabel, onClickListener2}, this, f34981a, false, 25127, new Class[]{RelationDynamicLabel.class, View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{relationDynamicLabel, onClickListener2}, this, f34981a, false, 25127, new Class[]{RelationDynamicLabel.class, View.OnClickListener.class}, Void.TYPE);
        } else if (relationDynamicLabel.isValid()) {
            if (this.f34986f == null) {
                if (PatchProxy.isSupport(new Object[0], this, f34981a, false, 25132, new Class[0], MentionTextView.class)) {
                    mentionTextView = (MentionTextView) PatchProxy.accessDispatch(new Object[0], this, f34981a, false, 25132, new Class[0], MentionTextView.class);
                } else {
                    mentionTextView = new MentionTextView(this.f34984d);
                    mentionTextView.setTextSize(12.0f);
                    mentionTextView.setGravity(16);
                }
                this.f34986f = mentionTextView;
            }
            SpannableString a2 = com.ss.android.ugc.aweme.base.utils.a.a(this.f34984d, " [r]", (List<Position>) null);
            com.ss.android.ugc.aweme.feed.widget.d dVar = new com.ss.android.ugc.aweme.feed.widget.d(this.f34984d, C0906R.color.bz, relationDynamicLabel.getLabelInfo(), 2130839578);
            if (PatchProxy.isSupport(new Object[]{a2, dVar, 1, 4, 17}, null, d.f35001a, true, 25146, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {a2, dVar, 1, 4, 17};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, d.f35001a, true, 25146, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                a2.setSpan(dVar, 1, 4, 17);
            }
            this.f34986f.setText(a2);
            LinearLayout.LayoutParams c2 = c();
            c2.gravity = 16;
            setOnClickListener(onClickListener2);
            addView(this.f34986f, c2);
        }
        setVisibility(0);
    }
}
