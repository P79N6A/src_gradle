package com.ss.android.ugc.aweme.following.ui.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.ColorInt;
import android.support.annotation.UiThread;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.ah;
import com.taobao.android.dexposed.ClassUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class FollowingSearchAdapter extends BaseAdapter<IMUser> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48110a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f48111b = "FollowingSearchAdapter";

    /* renamed from: c  reason: collision with root package name */
    public String f48112c = "";

    class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48113a;

        /* renamed from: b  reason: collision with root package name */
        a f48114b;
        @BindView(2131495017)
        View editRemark;
        @BindView(2131494950)
        AvatarImageWithVerify ivAvatar;
        @BindView(2131498265)
        TextView txtDesc;
        @BindView(2131498269)
        FollowUserBtn txtFollow;
        @BindView(2131498296)
        TextView txtUserName;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f48114b = new a(this.txtFollow, new a.c(FollowingSearchAdapter.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48116a;

                public final void a(int i, User user) {
                    String str;
                    String str2;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user}, this, f48116a, false, 45136, new Class[]{Integer.TYPE, User.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user}, this, f48116a, false, 45136, new Class[]{Integer.TYPE, User.class}, Void.TYPE);
                        return;
                    }
                    super.a(i, user);
                    if (i2 == 1) {
                        str = "follow";
                    } else {
                        str = "follow_cancel";
                    }
                    s c2 = new s(str).f("others_homepage").b("common_relation").c("follow_button");
                    if (i2 == 1) {
                        str2 = "1007";
                    } else {
                        str2 = "1036";
                    }
                    c2.a(str2).h(user.getUid()).e();
                }
            });
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48122a;

        /* renamed from: b  reason: collision with root package name */
        private ViewHolder f48123b;

        @CallSuper
        public void unbind() {
            if (PatchProxy.isSupport(new Object[0], this, f48122a, false, 45138, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48122a, false, 45138, new Class[0], Void.TYPE);
                return;
            }
            ViewHolder viewHolder = this.f48123b;
            if (viewHolder != null) {
                this.f48123b = null;
                viewHolder.ivAvatar = null;
                viewHolder.txtUserName = null;
                viewHolder.txtDesc = null;
                viewHolder.txtFollow = null;
                viewHolder.editRemark = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f48123b = viewHolder;
            viewHolder.ivAvatar = (AvatarImageWithVerify) Utils.findRequiredViewAsType(view, C0906R.id.ayr, "field 'ivAvatar'", AvatarImageWithVerify.class);
            viewHolder.txtUserName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dnq, "field 'txtUserName'", TextView.class);
            viewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dmv, "field 'txtDesc'", TextView.class);
            viewHolder.txtFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, C0906R.id.dmz, "field 'txtFollow'", FollowUserBtn.class);
            viewHolder.editRemark = Utils.findRequiredView(view, C0906R.id.b0u, "field 'editRemark'");
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f48110a, false, 45128, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f48110a, false, 45128, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f48110a, false, 45129, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f48110a, false, 45129, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48110a, false, 45127, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48110a, false, 45127, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uy, viewGroup2, false));
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48110a, false, 45126, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48110a, false, 45126, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        IMUser iMUser = (IMUser) this.mItems.get(i);
        if (PatchProxy.isSupport(new Object[]{iMUser}, viewHolder2, ViewHolder.f48113a, false, 45134, new Class[]{IMUser.class}, Void.TYPE)) {
            ViewHolder viewHolder3 = viewHolder2;
            PatchProxy.accessDispatch(new Object[]{iMUser}, viewHolder3, ViewHolder.f48113a, false, 45134, new Class[]{IMUser.class}, Void.TYPE);
            return;
        }
        User user = IMUser.toUser(iMUser);
        if (user.getFollowStatus() == 2) {
            user.setFollowerStatus(1);
        }
        viewHolder2.itemView.setOnClickListener(new View.OnClickListener(user) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48119a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f48120b;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48119a, false, 45137, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48119a, false, 45137, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                UserProfileActivity.b(ViewHolder.this.itemView.getContext(), this.f48120b, "following");
                new q().k(this.f48120b.getUid()).b("following").i("personal_homepage").h("1044").e();
            }

            {
                this.f48120b = r2;
            }
        });
        viewHolder2.ivAvatar.setData(user);
        FollowingSearchAdapter.this.a(viewHolder2.txtUserName, iMUser, FollowingSearchAdapter.this.f48112c);
        FollowingSearchAdapter.this.b(viewHolder2.txtDesc, iMUser, FollowingSearchAdapter.this.f48112c);
        viewHolder2.f48114b.f47851d = new i(viewHolder2, iMUser);
        viewHolder2.f48114b.a(user);
    }

    public final void b(TextView textView, IMUser iMUser, String str) {
        TextView textView2 = textView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{textView2, iMUser, str2}, this, f48110a, false, 45131, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, iMUser, str2}, this, f48110a, false, 45131, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 5) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 3) {
            if (!TextUtils.isEmpty(iMUser.getRemarkName())) {
                a(textView, GlobalContext.getContext().getResources().getString(C0906R.string.agc, new Object[]{iMUser.getNickName()}), ah.a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str2), 3);
                textView.setVisibility(0);
                return;
            } else if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 1) {
            String displayId = iMUser.getDisplayId();
            String a2 = ah.a(displayId, ah.c(displayId).toLowerCase(), ah.b(displayId), str2);
            a(textView, GlobalContext.getContext().getResources().getString(C0906R.string.ao6) + displayId, a2, 4);
            textView.setVisibility(0);
            return;
        } else if (iMUser.getSearchType() == 2) {
            a(textView, GlobalContext.getContext().getResources().getString(C0906R.string.aqe, new Object[]{iMUser.getContactName()}), ah.a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str2), 6);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public final void a(TextView textView, IMUser iMUser, String str) {
        TextView textView2 = textView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{textView2, iMUser, str2}, this, f48110a, false, 45130, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, iMUser, str2}, this, f48110a, false, 45130, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            textView2.setText(iMUser.getDisplayName());
        } else {
            if (com.ss.android.g.a.a()) {
                String nickName = iMUser.getNickName();
                if (!TextUtils.isEmpty(nickName) && !nickName.contains(str2)) {
                    str2 = str.toLowerCase();
                    int indexOf = nickName.toLowerCase().indexOf(str2);
                    if (indexOf != -1) {
                        str2 = nickName.substring(indexOf, Math.min(str2.length() + indexOf, nickName.length()));
                    }
                }
            } else if (iMUser.getSearchType() == 5) {
                str2 = ah.a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str2);
            } else if (iMUser.getSearchType() == 3) {
                str2 = ah.a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str2);
            }
            a(textView2, iMUser.getDisplayName(), str2, 0);
        }
    }

    private void a(TextView textView, String str, String str2, int i) {
        TextView textView2 = textView;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{textView2, str3, str4, Integer.valueOf(i)}, this, f48110a, false, 45132, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, str3, str4, Integer.valueOf(i)}, this, f48110a, false, 45132, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        textView2.setText(a(ContextCompat.getColor(textView.getContext(), C0906R.color.ami), str3, str4, i));
    }

    private SpannableString a(@ColorInt int i, String str, String str2, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4, Integer.valueOf(i2)}, this, f48110a, false, 45133, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4, Integer.valueOf(i2)}, this, f48110a, false, 45133, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, SpannableString.class);
        }
        if (str4.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            str4 = str4.replace(ClassUtils.PACKAGE_SEPARATOR, "\\.");
        }
        SpannableString spannableString = new SpannableString(str3);
        try {
            Matcher matcher = Pattern.compile(str4).matcher(spannableString);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (start >= i2) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
                    if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(start), Integer.valueOf(end), 33}, null, j.f48153a, true, 45139, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(start), Integer.valueOf(end), 33}, null, j.f48153a, true, 45139, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        spannableString.setSpan(foregroundColorSpan, start, end, 33);
                    }
                }
            }
            return spannableString;
        } catch (PatternSyntaxException unused) {
            return spannableString;
        }
    }
}
