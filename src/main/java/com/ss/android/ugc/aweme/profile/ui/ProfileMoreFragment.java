package com.ss.android.ugc.aweme.profile.ui;

import a.i;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.a.f;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.api.RemarkApi;
import com.ss.android.ugc.aweme.profile.d.x;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class ProfileMoreFragment extends AmeBaseFragment implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3803a;

    /* renamed from: b  reason: collision with root package name */
    User f3804b;

    /* renamed from: c  reason: collision with root package name */
    RemarkApi f3805c;

    /* renamed from: d  reason: collision with root package name */
    FollowViewModel f3806d;

    /* renamed from: e  reason: collision with root package name */
    private String f3807e;

    /* renamed from: f  reason: collision with root package name */
    private String f3808f;
    private String g;
    private String h;
    private String i;
    private int j;
    private List<Aweme> k;
    private WeakHandler l;
    @BindView(2131493169)
    protected AvatarImageView mAvatarIv;
    @BindView(2131493213)
    protected View mBackBtn;
    @BindView(2131493304)
    protected CommonItemView mBlock;
    @BindView(2131493306)
    protected CommonItemView mBlockStory;
    @BindView(2131496694)
    protected CommonItemView mRemarkName;
    @BindView(2131496695)
    protected View mRemarkNameUnderline;
    @BindView(2131496698)
    protected CommonItemView mRemoveFollower;
    @BindView(2131496699)
    protected View mRemoveFollowerUnderline;
    @BindView(2131497038)
    protected RemoteImageView mSendMsgImage;
    @BindView(2131497613)
    protected ButtonTitleBar mTitleBar;
    @BindView(2131497075)
    protected View shareView;

    public boolean isRegisterEventBus() {
        return true;
    }

    private boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3803a, false, 68856, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3803a, false, 68856, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a()) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() throws Exception {
        this.f3804b.setFollowerStatus(0);
        if (this.f3804b.getFollowStatus() == 2) {
            this.f3804b.setFollowStatus(1);
        }
        b();
        c();
        com.ss.android.ugc.aweme.base.livedata.a.a().a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f3804b);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3803a, false, 68858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3803a, false, 68858, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3803a, false, 68854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3803a, false, 68854, new Class[0], Void.TYPE);
        } else if (!((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().c()).booleanValue() || this.f3804b.getFollowerStatus() != 1) {
            this.mRemoveFollower.setVisibility(8);
        } else {
            this.mRemoveFollower.setVisibility(0);
        }
    }

    private void c() {
        int i2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3803a, false, 68855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3803a, false, 68855, new Class[0], Void.TYPE);
        } else if (d()) {
            if (this.mRemoveFollower.getVisibility() == 0) {
                this.mRemoveFollowerUnderline.setVisibility(0);
            } else {
                this.mRemoveFollowerUnderline.setVisibility(8);
            }
            this.mBlockStory.setVisibility(0);
            StoryBlockInfo storyBlockInfo = this.f3804b.getStoryBlockInfo();
            if (storyBlockInfo != null) {
                z = storyBlockInfo.isBlock();
            }
            CommonItemView commonItemView = this.mBlockStory;
            Resources resources = getResources();
            if (z) {
                i2 = C0906R.string.dn9;
            } else {
                i2 = C0906R.string.nw;
            }
            commonItemView.setLeftText(resources.getString(i2));
        } else {
            this.mBlockStory.setVisibility(8);
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3803a, false, 68865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3803a, false, 68865, new Class[0], Void.TYPE);
        } else if (this.j == 0 || this.j == 4 || !TextUtils.isEmpty(this.f3804b.getEnterpriseVerifyReason())) {
            this.mRemarkName.setVisibility(8);
            this.mRemarkNameUnderline.findViewById(C0906R.id.cd9).setVisibility(8);
        } else if (TextUtils.isEmpty(this.f3804b.getRemarkName())) {
            this.mRemarkName.setRightText(getString(C0906R.string.ti));
        } else {
            this.mRemarkName.setRightText(this.f3804b.getRemarkName());
        }
    }

    @Subscribe
    public void onEvent(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3803a, false, 68866, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3803a, false, 68866, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(AllStoryActivity.f73306b, gVar2.itemType)) {
            dv.a(getActivity(), this.mTitleBar, gVar2);
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f3803a, false, 68857, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f3803a, false, 68857, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (isViewValid()) {
            if ((!ex.a(this.f3804b, false) || followStatus.followStatus != 1) && TextUtils.equals(followStatus.userId, this.f3804b.getUid())) {
                this.j = followStatus.followStatus;
                e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) throws Exception {
        if (iVar.d() || iVar.c()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c16).a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) iVar.e();
            if (commitRemarkNameResponse.isOK()) {
                this.f3804b.setRemarkName(((CommitRemarkNameResponse) iVar.e()).remarkName);
                b.a().updateIMUser(b.a(this.f3804b));
                this.mRemarkName.setRightText(this.f3804b.getRemarkName());
                com.ss.android.ugc.aweme.base.livedata.a.a().a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f3804b);
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.byy).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), commitRemarkNameResponse.statusMsg).a();
            }
        }
        return null;
    }

    public void handleMsg(Message message) {
        boolean z;
        byte b2;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f3803a, false, 68867, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f3803a, false, 68867, new Class[]{Message.class}, Void.TYPE);
        } else if (getActivity() != null && !getActivity().isFinishing()) {
            int i2 = message2.what;
            Object obj = message2.obj;
            if (i2 == 31 || i2 == 32) {
                if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
                } else if (obj instanceof Exception) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.bga).a();
                } else if (obj instanceof BlockStruct) {
                    int i3 = ((BlockStruct) obj).blockStatus;
                    if (i3 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 == 32) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(b2)}, this, f3803a, false, 68863, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(b2)}, this, f3803a, false, 68863, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                    } else {
                        if (b2 != 0) {
                            StoryBlockInfo storyBlockInfo = this.f3804b.getStoryBlockInfo();
                            if (storyBlockInfo == null) {
                                storyBlockInfo = new StoryBlockInfo();
                                this.f3804b.setStoryBlockInfo(storyBlockInfo);
                            }
                            storyBlockInfo.setBlock(z);
                        } else {
                            this.f3804b.setBlock(z);
                        }
                        com.ss.android.ugc.aweme.base.livedata.a.a().a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f3804b);
                    }
                    if (i2 != 32) {
                        this.f3804b.setRemarkName("");
                        if (this.j != 0) {
                            this.j = 0;
                            bg.a(new FollowStatus(this.f3804b.getUid(), this.j));
                        }
                        bg.a(new f(i3));
                    } else if (z) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.nv).a();
                        this.mBlockStory.setLeftText(getResources().getString(C0906R.string.dn9));
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.dn8).a();
                        this.mBlockStory.setLeftText(getResources().getString(C0906R.string.nw));
                    }
                }
            }
        }
    }

    @OnClick({2131493213, 2131496694, 2131496708, 2131493304, 2131497038, 2131497075, 2131496698, 2131493306})
    public void onClick(View view) {
        boolean z;
        boolean z2;
        MultilineInputFragment multilineInputFragment;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3803a, false, 68859, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3803a, false, 68859, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.ix) {
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        } else if (view.getId() == C0906R.id.cd8) {
            if (getActivity() != null) {
                FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                beginTransaction.setCustomAnimations(C0906R.anim.cz, C0906R.anim.d8, C0906R.anim.cx, C0906R.anim.da);
                String remarkName = this.f3804b.getRemarkName();
                String uid = this.f3804b.getUid();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.a_t), Integer.valueOf(C0906R.string.byx), Integer.valueOf(C0906R.string.bnd), 20, remarkName, uid}, null, MultilineInputFragment.f61908a, true, 68134, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, MultilineInputFragment.class)) {
                    multilineInputFragment = (MultilineInputFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.a_t), Integer.valueOf(C0906R.string.byx), Integer.valueOf(C0906R.string.bnd), 20, remarkName, uid}, null, MultilineInputFragment.f61908a, true, 68134, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, MultilineInputFragment.class);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("titleId", C0906R.string.a_t);
                    bundle.putInt("inputTypeNameId", C0906R.string.byx);
                    bundle.putInt("inputHintId", C0906R.string.bnd);
                    bundle.putInt("inputMaxLength", 20);
                    bundle.putString("defaultInputText", remarkName);
                    bundle.putString("userId", uid);
                    MultilineInputFragment multilineInputFragment2 = new MultilineInputFragment();
                    multilineInputFragment2.setArguments(bundle);
                    multilineInputFragment = multilineInputFragment2;
                }
                beginTransaction.add((int) C0906R.id.aic, (Fragment) multilineInputFragment);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
            }
        } else if (view.getId() == C0906R.id.cdl) {
            if (!d.a().isLogin()) {
                e.a((Fragment) this, this.f3807e, "report");
            } else if (this.f3804b != null) {
                ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), AllStoryActivity.f73306b, this.f3804b.getUid(), this.f3804b.getUid(), null);
            }
        } else if (view.getId() == C0906R.id.ll || view.getId() == C0906R.id.lo) {
            if (view.getId() == C0906R.id.lo) {
                z = true;
            } else {
                z = false;
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3803a, false, 68860, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3803a, false, 68860, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                if (this.f3804b != null) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f3803a, false, 68864, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3803a, false, 68864, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
                    } else if (z) {
                        StoryBlockInfo storyBlockInfo = this.f3804b.getStoryBlockInfo();
                        if (storyBlockInfo == null) {
                            z2 = false;
                        } else {
                            z2 = storyBlockInfo.isBlock();
                        }
                    } else {
                        z2 = this.f3804b.isBlock();
                    }
                    if (z2) {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f3803a, false, 68862, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3803a, false, 68862, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else {
                            BlockApi.a(this.l, this.f3804b.getUid(), 0, z ? 1 : 0);
                            com.ss.android.ugc.aweme.im.f.a("others_homepage", this.f3804b.getUid());
                            if (!z) {
                                this.mBlock.setLeftText(getResources().getString(C0906R.string.nj));
                            }
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f3803a, false, 68861, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3803a, false, 68861, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else {
                            dd ddVar = new dd(this, z, z);
                            if (z) {
                                new a.C0185a(getContext()).a((int) C0906R.string.nt).b(getString(C0906R.string.ns, this.f3804b.getNickname())).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) ddVar).a((int) C0906R.string.nu, (DialogInterface.OnClickListener) ddVar).a().a();
                            } else {
                                if (this.f3804b.getFollowStatus() != 2) {
                                    z3 = false;
                                }
                                b.a().wrapperSyncXBlockWithDialog(getContext(), z3, ddVar);
                            }
                            com.ss.android.ugc.aweme.im.f.a("others_homepage", this.f3804b.getUid(), "");
                        }
                    }
                }
            }
        } else if (view.getId() == C0906R.id.cnw) {
            if (this.f3804b != null) {
                com.ss.android.ugc.aweme.im.f.a(this.f3804b.getUid());
                com.ss.android.ugc.aweme.im.f.a(this.f3804b.getUid(), this.f3808f, this.f3807e, this.g, "click_stranger_chat_button");
                b.a().wrapperChatWithSyncXAlert(getActivity(), b.a(this.f3804b), 3);
            }
        } else if (view.getId() == C0906R.id.cp3) {
            if (this.f3804b != null) {
                GeneralPermission generalPermission = this.f3804b.getGeneralPermission();
                if (generalPermission == null || generalPermission.getShareToast() != 1) {
                    x.a((Activity) getActivity(), this.f3804b, this.h, this.k);
                } else {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.l0).a();
                }
            }
        } else if (view.getId() == C0906R.id.cdb) {
            r.a("click_remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").f34114b);
            Dialog b2 = new a.C0185a(getContext()).a((int) C0906R.string.bz3).b((int) C0906R.string.bz2).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.bz1, (DialogInterface.OnClickListener) new dc(this)).a().b();
            if (b2.findViewById(C0906R.id.dhn) instanceof TextView) {
                ((TextView) b2.findViewById(C0906R.id.dhn)).setTextColor(getResources().getColor(C0906R.color.ho));
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f3803a, false, 68852, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f3803a, false, 68852, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.l = new WeakHandler(this);
        this.f3804b = (User) getArguments().getSerializable(AllStoryActivity.f73306b);
        this.f3807e = getArguments().getString("enter_from");
        this.f3808f = getArguments().getString("aweme_id");
        this.g = getArguments().getString("request_id");
        this.h = getArguments().getString("from");
        this.i = getArguments().getString("profile_from");
        this.j = getArguments().getInt("follow_status");
        this.k = (List) getArguments().getSerializable("aweme_list");
        if (this.f3804b != null && this.f3804b.isSecret()) {
            this.shareView.setVisibility(8);
        }
        this.mTitleBar.setTitle((int) C0906R.string.bc_);
        if (!com.ss.android.g.a.a()) {
            this.mBackBtn.setContentDescription(getString(C0906R.string.kj));
        }
        c.b(this.mAvatarIv, ex.c(this.f3804b));
        FragmentActivity activity = getActivity();
        AvatarImageView avatarImageView = this.mAvatarIv;
        User user = this.f3804b;
        if (PatchProxy.isSupport(new Object[]{activity, avatarImageView, user}, null, ex.f75854a, true, 88678, new Class[]{Context.class, ImageView.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, avatarImageView, user}, null, ex.f75854a, true, 88678, new Class[]{Context.class, ImageView.class, User.class}, Void.TYPE);
        } else if (!(avatarImageView == null || user == null)) {
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                avatarImageView.setContentDescription(activity.getResources().getString(C0906R.string.bc, new Object[]{user.getRemarkName()}));
            } else if (!TextUtils.isEmpty(user.getNickname())) {
                avatarImageView.setContentDescription(activity.getResources().getString(C0906R.string.bc, new Object[]{user.getNickname()}));
            }
        }
        ((TextView) view2.findViewById(C0906R.id.bqo)).setText(this.f3804b.getNickname());
        ((TextView) view2.findViewById(C0906R.id.dpp)).setText(getString(C0906R.string.c8j) + ex.b(this.f3804b));
        e();
        if (!b.b()) {
            this.mSendMsgImage.setVisibility(8);
        } else if (!com.ss.android.g.a.a()) {
            b.a().wrapperSendMessageSyncXIcon(this.mSendMsgImage, 3);
            com.ss.android.ugc.aweme.im.f.c("click_stranger_chat_button");
        }
        if (this.f3804b.isBlock()) {
            this.mBlock.setLeftText(getResources().getString(C0906R.string.dn6));
        }
        com.ss.android.ugc.aweme.base.livedata.a.a().a("aweme.main.profile.multi_line_input.remark_name", String.class).observe(this, new db(this));
        b();
        c();
        if (PatchProxy.isSupport(new Object[0], this, f3803a, false, 68853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3803a, false, 68853, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            this.shareView.setContentDescription(getResources().getString(C0906R.string.c6k));
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3803a, false, 68851, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pr, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3803a, false, 68851, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, boolean z, DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        if (i3 == -2 || i3 != -1) {
            com.ss.android.ugc.aweme.im.f.a("cancel", this.f3804b.getUid(), "others_homepage");
        } else {
            BlockApi.a(this.l, this.f3804b.getUid(), 1, i2);
            com.ss.android.ugc.aweme.im.f.a("success", this.f3804b.getUid(), "others_homepage");
            if (TextUtils.equals(this.i, "chat")) {
                com.ss.android.ugc.aweme.im.f.b(this.f3804b.getUid());
            }
            if (!z) {
                this.mBlock.setLeftText(getResources().getString(C0906R.string.dn6));
            }
        }
    }
}
