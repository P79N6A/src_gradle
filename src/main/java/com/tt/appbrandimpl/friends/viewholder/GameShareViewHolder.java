package com.tt.appbrandimpl.friends.viewholder;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.miniapp_api.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.utils.bg;
import com.tt.appbrandimpl.friends.ShareGameEvent;
import java.util.Map;

public class GameShareViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AvatarImageView avatarImageView;
    private Context context;
    private NiceWidthTextView followBtn;
    private boolean isRecommendFriends;
    private String mSecUid;
    private Map<String, Boolean> shareMaps = a.a().f55978c;
    private IShareService.ShareStruct shareStruct;
    private TextView txtDetail;
    private TextView txtName;
    private String uid;
    private IMUser user;
    private int userType;

    private void openProfile() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91933, new Class[0], Void.TYPE);
            return;
        }
        this.avatarImageView.setOnClickListener(new GameShareViewHolder$$Lambda$0(this));
        this.txtName.setOnClickListener(new GameShareViewHolder$$Lambda$1(this));
    }

    private void bindShareStatus() {
        Context context2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91935, new Class[0], Void.TYPE);
            return;
        }
        Boolean bool = this.shareMaps.get(this.uid);
        int i = C0906R.string.c63;
        if (bool != null) {
            this.followBtn.setSelected(bool.booleanValue());
            NiceWidthTextView niceWidthTextView = this.followBtn;
            if (bool.booleanValue()) {
                context2 = this.context;
                i = C0906R.string.ev;
            } else {
                context2 = this.context;
            }
            niceWidthTextView.setText(context2.getString(i));
            return;
        }
        this.followBtn.setSelected(false);
        this.followBtn.setText(this.context.getString(C0906R.string.c63));
    }

    private void initView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91936, new Class[0], Void.TYPE);
            return;
        }
        this.avatarImageView = (AvatarImageView) this.itemView.findViewById(C0906R.id.i4);
        this.txtName = (TextView) this.itemView.findViewById(C0906R.id.bps);
        this.txtDetail = (TextView) this.itemView.findViewById(C0906R.id.a49);
        this.followBtn = (NiceWidthTextView) this.itemView.findViewById(C0906R.id.o3);
        this.followBtn.setOnClickListener(this);
        openProfile();
    }

    private void updateFollowStatus() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91938, new Class[0], Void.TYPE);
        } else if (this.shareStruct != null && (this.context instanceof Activity) && !this.followBtn.isSelected()) {
            Activity activity = (Activity) this.context;
            d a2 = d.a();
            if (this.isRecommendFriends) {
                str = "recommend";
            } else {
                str = "friends";
            }
            r.a("show_mp_dialog", (Map) a2.a("share_type", str).f34114b);
            b.a().showShareDialog(activity, this.shareStruct, this.user, new GameShareViewHolder$$Lambda$2(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$openProfile$0$GameShareViewHolder(View view) {
        UserProfileActivity.a(this.context, this.uid, this.mSecUid, "share_game");
        r.a("enter_personal_detail", (Map) d.a().a("enter_from", "mp_share_page").a("to_user_id", this.uid).a("enter_method", "click_head").f34114b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$openProfile$1$GameShareViewHolder(View view) {
        UserProfileActivity.a(this.context, this.uid, this.mSecUid, "share_game");
        r.a("enter_personal_detail", (Map) d.a().a("enter_from", "mp_share_page").a("to_user_id", this.uid).a("enter_method", "click_name").f34114b);
    }

    private void setResult(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, changeQuickRedirect, false, 91939, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, changeQuickRedirect, false, 91939, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        bg.a(new ShareGameEvent(bool.booleanValue()));
    }

    public void bind(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, changeQuickRedirect, false, 91934, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser}, this, changeQuickRedirect, false, 91934, new Class[]{IMUser.class}, Void.TYPE);
            return;
        }
        UrlModel avatarThumb = iMUser.getAvatarThumb();
        this.uid = iMUser.getUid();
        bindShareStatus();
        this.user = iMUser;
        this.isRecommendFriends = false;
        if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
            c.a((RemoteImageView) this.avatarImageView, 2130839027);
        } else {
            c.b(this.avatarImageView, avatarThumb);
        }
        this.txtName.setText(iMUser.getDisplayName());
        if (this.userType == 1) {
            this.txtDetail.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$updateFollowStatus$2$GameShareViewHolder(Boolean bool) {
        String str;
        String str2;
        if (bool.booleanValue()) {
            com.bytedance.ies.dmt.ui.d.a.c(this.context, (int) C0906R.string.ain, 1).a();
            this.followBtn.setSelected(true);
            this.shareMaps.put(this.uid, Boolean.TRUE);
            this.followBtn.setText(this.context.getString(C0906R.string.ev));
            d a2 = d.a().a("final_status", "send");
            if (this.isRecommendFriends) {
                str2 = "recommend";
            } else {
                str2 = "friends";
            }
            r.a("click_mp_dialog", (Map) a2.a("share_type", str2).f34114b);
        } else {
            d a3 = d.a().a("final_status", "cancel");
            if (this.isRecommendFriends) {
                str = "recommend";
            } else {
                str = "friends";
            }
            r.a("click_mp_dialog", (Map) a3.a("share_type", str).f34114b);
        }
        setResult(bool);
    }

    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 91937, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 91937, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.o3) {
            d a2 = d.a();
            if (this.isRecommendFriends) {
                str = "recommend";
            } else {
                str = "friends";
            }
            r.a("click_mp_share_button", (Map) a2.a("share_type", str).f34114b);
            updateFollowStatus();
        }
    }

    public void bind(User user2) {
        if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 91932, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 91932, new Class[]{User.class}, Void.TYPE);
        } else if (user2 != null) {
            UrlModel avatarThumb = user2.getAvatarThumb();
            this.uid = user2.getUid();
            this.mSecUid = user2.getSecUid();
            bindShareStatus();
            this.user = IMUser.fromUser(user2);
            this.isRecommendFriends = true;
            if (avatarThumb == null || CollectionUtils.isEmpty(avatarThumb.getUrlList())) {
                c.a((RemoteImageView) this.avatarImageView, 2130839027);
            } else {
                c.b(this.avatarImageView, avatarThumb);
            }
            this.txtName.setText(user2.getNickname());
            if (this.userType == 3) {
                this.txtDetail.setVisibility(0);
                this.txtDetail.setText(user2.getRecommendReason());
            }
        }
    }

    public GameShareViewHolder(@NonNull View view, int i, IShareService.ShareStruct shareStruct2) {
        super(view);
        this.context = view.getContext();
        this.userType = i;
        this.shareStruct = shareStruct2;
        initView();
    }
}
