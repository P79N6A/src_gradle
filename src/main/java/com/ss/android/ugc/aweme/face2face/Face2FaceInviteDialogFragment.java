package com.ss.android.ugc.aweme.face2face;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.util.concurrent.q;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.face2face.net.Face2FaceApi;
import com.ss.android.ugc.aweme.face2face.net.b;
import com.ss.android.ugc.aweme.face2face.ui.d;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceCommonNetViewModel;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public class Face2FaceInviteDialogFragment extends AppCompatDialogFragment implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43897a;

    /* renamed from: b  reason: collision with root package name */
    public b f43898b;

    /* renamed from: c  reason: collision with root package name */
    public DialogInterface.OnDismissListener f43899c;

    @SuppressLint({"useChinaStyleVersion"})
    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43897a, false, 39105, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43897a, false, 39105, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(0, C0906R.style.fm);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f43897a, false, 39110, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f43897a, false, 39110, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.f43899c != null) {
            this.f43899c.onDismiss(dialogInterface);
        }
    }

    public void onClick(View view) {
        q<BaseResponse> qVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f43897a, false, 39109, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43897a, false, 39109, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (getActivity() != null) {
            if (view.getId() == C0906R.id.abo) {
                Face2FaceCommonNetViewModel face2FaceCommonNetViewModel = (Face2FaceCommonNetViewModel) ViewModelProviders.of(getActivity()).get(Face2FaceCommonNetViewModel.class);
                String str = this.f43898b.getFroInviteUser().uId;
                if (PatchProxy.isSupport(new Object[]{str}, null, Face2FaceApi.f43950a, true, 39132, new Class[]{String.class}, q.class)) {
                    qVar = (q) PatchProxy.accessDispatch(new Object[]{str}, null, Face2FaceApi.f43950a, true, 39132, new Class[]{String.class}, q.class);
                } else {
                    qVar = ((Face2FaceApi.RealApi) Face2FaceApi.f43951b.create(Face2FaceApi.RealApi.class)).unAcceptFollowUser(str);
                }
                face2FaceCommonNetViewModel.a(qVar).observe(this, new m(this));
                dismiss();
                return;
            }
            if (view.getId() == C0906R.id.dpn) {
                Face2Face.a(getActivity(), this.f43898b.getFroInviteUser().uId, this.f43898b.getFroInviteUser().mSecUid);
            }
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43897a, false, 39106, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f43897a, false, 39106, new Class[]{Bundle.class}, Dialog.class);
        }
        AppCompatDialog appCompatDialog = (AppCompatDialog) super.onCreateDialog(bundle);
        View inflate = View.inflate(getContext(), C0906R.layout.iw, null);
        if (PatchProxy.isSupport(new Object[0], this, f43897a, false, 39108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43897a, false, 39108, new Class[0], Void.TYPE);
        } else {
            this.f43898b = (b) getArguments().getSerializable("face_to_face_user");
        }
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f43897a, false, 39107, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f43897a, false, 39107, new Class[]{View.class}, Void.TYPE);
        } else {
            ((TextView) inflate.findViewById(C0906R.id.dq5)).setText(this.f43898b.getFroInviteUser().nickName);
            AvatarWithBorderView avatarWithBorderView = (AvatarWithBorderView) inflate.findViewById(C0906R.id.dpn);
            c.b(avatarWithBorderView, this.f43898b.getFroInviteUser().avatarMedium);
            ViewCompat.requireViewById(inflate, C0906R.id.abo).setOnClickListener(this);
            avatarWithBorderView.setOnClickListener(this);
            d dVar = new d((FollowUserBtn) ViewCompat.requireViewById(inflate, C0906R.id.abm), new d.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43900a;

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43900a, false, 39112, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43900a, false, 39112, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.a(i);
                    if ((i == 1 || i == 2) && Face2FaceInviteDialogFragment.this.getActivity() != null) {
                        if (Face2FaceInviteDialogFragment.this.f43898b.getFroInviteUser().followStatus == 0) {
                            r.a("follow", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("event_type", "spring_festival").a("enter_from", "face_to_face").a("to_user_id", Face2FaceInviteDialogFragment.this.f43898b.getFroInviteUser().uId).a("enter_method", "face_to_face_follow_back").a("relation_type", "in_app").f34114b);
                        }
                        Face2FaceInviteDialogFragment.this.dismiss();
                        r.a("note_invite_success", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("event_type", "spring_festival").a("enter_from", "face_to_face").a("to_user_id", Face2FaceInviteDialogFragment.this.f43898b.getFroInviteUser().uId).f34114b);
                    }
                }
            });
            User user = new User();
            user.setUid(this.f43898b.getFroInviteUser().uId);
            dVar.a(user);
        }
        appCompatDialog.setContentView(inflate);
        appCompatDialog.setCanceledOnTouchOutside(false);
        ImmersionBar.with((DialogFragment) this, (Dialog) appCompatDialog).transparentBar();
        return appCompatDialog;
    }
}
