package com.ss.android.ugc.aweme.face2face;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.face2face.net.f;
import com.ss.android.ugc.aweme.face2face.ui.Face2FaceFollowTextView;

public class Face2FaceFriendDialogFragment extends BottomSheetDialogFragment implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43895a;

    /* renamed from: b  reason: collision with root package name */
    private f f43896b;

    @SuppressLint({"useChinaStyleVersion"})
    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43895a, false, 39095, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43895a, false, 39095, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(0, C0906R.style.fn);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43895a, false, 39099, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43895a, false, 39099, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.abo) {
            dismiss();
        } else if (view.getId() == C0906R.id.abl) {
            Face2Face.a(getContext(), this.f43896b.getUser().getUid(), this.f43896b.getUser().getSecUid());
        } else {
            if (view.getId() == C0906R.id.dpn) {
                Face2Face.a(getContext(), this.f43896b.getUser().getUid(), this.f43896b.getUser().getSecUid());
            }
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43895a, false, 39096, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f43895a, false, 39096, new Class[]{Bundle.class}, Dialog.class);
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(bundle);
        View inflate = View.inflate(getContext(), C0906R.layout.iv, null);
        if (PatchProxy.isSupport(new Object[0], this, f43895a, false, 39097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43895a, false, 39097, new Class[0], Void.TYPE);
        } else {
            this.f43896b = (f) getArguments().getSerializable("face_to_face_user");
        }
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f43895a, false, 39098, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f43895a, false, 39098, new Class[]{View.class}, Void.TYPE);
        } else {
            ((TextView) ViewCompat.requireViewById(inflate, C0906R.id.dq5)).setText(this.f43896b.getUser().getNickname());
            AvatarWithBorderView avatarWithBorderView = (AvatarWithBorderView) ViewCompat.requireViewById(inflate, C0906R.id.dpn);
            c.b(avatarWithBorderView, this.f43896b.getUser().getAvatarMedium());
            avatarWithBorderView.setOnClickListener(this);
            ViewCompat.requireViewById(inflate, C0906R.id.abo).setOnClickListener(this);
            ViewCompat.requireViewById(inflate, C0906R.id.abl).setOnClickListener(this);
            Face2Face.a(getActivity(), this, this.f43896b.getUser(), (Face2FaceFollowTextView) ViewCompat.requireViewById(inflate, C0906R.id.abk));
        }
        bottomSheetDialog.setContentView(inflate);
        ImmersionBar.with((DialogFragment) this, (Dialog) bottomSheetDialog).transparentBar();
        return bottomSheetDialog;
    }
}
