package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.common.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public class PublishPermissionFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70536a;
    @StringRes

    /* renamed from: b  reason: collision with root package name */
    int f70537b;
    @StringRes

    /* renamed from: c  reason: collision with root package name */
    int f70538c;

    /* renamed from: d  reason: collision with root package name */
    int f70539d;

    /* renamed from: e  reason: collision with root package name */
    private int f70540e;
    @BindDrawable(2131296435)
    Drawable mImgNormal;
    @BindView(2131493491)
    ImageView mImgPermissionFriend;
    @BindView(2131493495)
    ImageView mImgPermissionOpen;
    @BindView(2131493496)
    ImageView mImgPermissionPrivate;
    @BindDrawable(2131296756)
    Drawable mImgSelected;
    @BindString(2132083200)
    String mTitle;
    @BindView(2131493863)
    TextView mTvPermissionOpen;
    @BindView(2131493864)
    TextView mTvPermissionOpenText;
    @BindView(2131493366)
    LinearLayout permissionFriendLayout;
    @BindView(2131493367)
    LinearLayout permissionOpenLayout;
    @BindView(2131493368)
    LinearLayout permissionPrivateLayout;

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70536a, false, 80300, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70536a, false, 80300, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f70536a, false, 80302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70536a, false, 80302, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f70536a, false, 80301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70536a, false, 80301, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70536a, false, 80303, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70536a, false, 80303, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70536a, false, 80295, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70536a, false, 80295, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra.PERMISSION", this.f70539d);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    private void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70536a, false, 80291, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70536a, false, 80291, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70539d = i;
        a(this.f70539d);
        a();
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f70536a, false, 80292, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f70536a, false, 80292, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f70539d = arguments.getInt("extra.PERMISSION");
        this.f70538c = arguments.getInt("extra.Private.DESCRIPTION");
        this.f70537b = arguments.getInt("extra.Friend.DESCRIPTION");
        this.f70540e = arguments.getInt("extra.TYPE");
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131493367, 2131493366, 2131493368})
    public void onClick(View view) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f70536a, false, 80288, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70536a, false, 80288, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.b9m) {
            b(0);
        } else if (id == C0906R.id.b9l) {
            if (PatchProxy.isSupport(new Object[0], this, f70536a, false, 80299, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70536a, false, 80299, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = a.L.a(e.a.PublishPermissionDialogFriend);
                if (z2) {
                    a.L.a(e.a.PublishPermissionDialogFriend, false);
                }
            }
            if (z2) {
                a(2, this.f70537b);
            } else {
                b(2);
            }
        } else {
            if (id == C0906R.id.b9n) {
                if (PatchProxy.isSupport(new Object[0], this, f70536a, false, 80298, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70536a, false, 80298, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z = a.L.a(e.a.PublishPermissionDialogPrivate);
                    if (z) {
                        a.L.a(e.a.PublishPermissionDialogPrivate, false);
                    }
                }
                if (z) {
                    a(1, this.f70538c);
                    return;
                }
                b(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70536a, false, 80289, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70536a, false, 80289, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.mImgPermissionOpen;
        if (i == 0) {
            drawable = this.mImgSelected;
        } else {
            drawable = this.mImgNormal;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView2 = this.mImgPermissionFriend;
        if (i == 2) {
            drawable2 = this.mImgSelected;
        } else {
            drawable2 = this.mImgNormal;
        }
        imageView2.setImageDrawable(drawable2);
        ImageView imageView3 = this.mImgPermissionPrivate;
        if (i == 1) {
            drawable3 = this.mImgSelected;
        } else {
            drawable3 = this.mImgNormal;
        }
        imageView3.setImageDrawable(drawable3);
    }

    private void a(int i, @StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70536a, false, 80296, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70536a, false, 80296, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i, getContext().getString(i2));
    }

    private void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f70536a, false, 80297, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f70536a, false, 80297, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a.C0185a aVar = new a.C0185a(getContext());
        aVar.b(str2);
        aVar.a((int) C0906R.string.a5c, (DialogInterface.OnClickListener) new v(this, i));
        aVar.a().a();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f70536a, false, 80294, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f70536a, false, 80294, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        this.permissionOpenLayout.setBackground(c.e(getContext()));
        this.permissionFriendLayout.setBackground(c.e(getContext()));
        this.permissionPrivateLayout.setBackground(c.e(getContext()));
        a(this.f70539d);
        if (PatchProxy.isSupport(new Object[0], this, f70536a, false, 80290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70536a, false, 80290, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.model.e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
        if (com.ss.android.g.a.a() && e2 != null && e2.d()) {
            this.mTvPermissionOpen.setText(C0906R.string.bsx);
            this.mTvPermissionOpenText.setText(C0906R.string.bsy);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f70536a, false, 80293, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pt, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f70536a, false, 80293, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
