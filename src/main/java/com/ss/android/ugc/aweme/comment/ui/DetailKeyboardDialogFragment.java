package com.ss.android.ugc.aweme.comment.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.d.b;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.utils.aj;
import com.ss.android.ugc.bytex.a.a.a;

public class DetailKeyboardDialogFragment extends KeyboardDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36497a;
    @BindView(2131497436)
    View tabDivider;

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f36497a, false, 27527, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36497a, false, 27527, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mEmojiView.isSelected()) {
            return 2130839125;
        } else {
            return 2130839124;
        }
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f36497a, false, 27528, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36497a, false, 27528, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mEmojiView.isSelected()) {
            return 2130839128;
        } else {
            return 2130839127;
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f36497a, false, 27525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36497a, false, 27525, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f36497a, false, 27529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36497a, false, 27529, new Class[0], Void.TYPE);
        } else {
            this.mEditText.setCursorVisible(false);
            this.mAtView.a();
            this.mEmojiView.a();
            this.mAtView.setSelected(false);
            this.mEmojiView.setSelected(false);
        }
        super.dismiss();
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f36497a, false, 27524, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f36497a, false, 27524, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setCanceledOnTouchOutside(false);
        this.mAtView.setListener(new FadeImageView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36498a;

            public final void a(ImageView imageView) {
                if (PatchProxy.isSupport(new Object[]{imageView}, this, f36498a, false, 27531, new Class[]{ImageView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageView}, this, f36498a, false, 27531, new Class[]{ImageView.class}, Void.TYPE);
                    return;
                }
                if (DetailKeyboardDialogFragment.this.getContext() != null && !DetailKeyboardDialogFragment.this.isDetached()) {
                    if (imageView.isSelected()) {
                        imageView.setImageDrawable(a.a(DetailKeyboardDialogFragment.this.getResources(), 2130839120));
                        return;
                    }
                    imageView.setImageDrawable(a.a(DetailKeyboardDialogFragment.this.getResources(), 2130839119));
                }
            }
        });
        this.mEmojiView.setListener(new FadeImageView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36500a;

            public final void a(ImageView imageView) {
                if (PatchProxy.isSupport(new Object[]{imageView}, this, f36500a, false, 27532, new Class[]{ImageView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageView}, this, f36500a, false, 27532, new Class[]{ImageView.class}, Void.TYPE);
                    return;
                }
                if (DetailKeyboardDialogFragment.this.getContext() != null && !DetailKeyboardDialogFragment.this.isDetached()) {
                    if (DetailKeyboardDialogFragment.this.k) {
                        imageView.setImageResource(DetailKeyboardDialogFragment.this.b());
                        return;
                    }
                    imageView.setImageResource(DetailKeyboardDialogFragment.this.a());
                }
            }
        });
        this.mPublishView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36502a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36502a, false, 27533, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36502a, false, 27533, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                aj.a(DetailKeyboardDialogFragment.this.getContext(), new b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f36504a;

                    public final void a() {
                    }

                    public final void a(boolean z) {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36504a, false, 27534, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36504a, false, 27534, new Class[]{Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        DetailKeyboardDialogFragment.this.c();
                    }
                });
            }
        });
    }

    public void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f36497a, false, 27526, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f36497a, false, 27526, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onShow(dialogInterface);
        if (PatchProxy.isSupport(new Object[0], this, f36497a, false, 27530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36497a, false, 27530, new Class[0], Void.TYPE);
            return;
        }
        this.mAtView.a();
        this.mEmojiView.a();
        this.mAtView.setSelected(true);
        this.mEmojiView.setSelected(true);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f36497a, false, 27523, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f36497a, false, 27523, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.o9, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }
}
