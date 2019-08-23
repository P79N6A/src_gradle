package com.ss.android.ugc.aweme.music.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class EditOriginMusicTitleActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56423a;

    /* renamed from: b  reason: collision with root package name */
    private EditOriginMusicTitleActivity f56424b;

    /* renamed from: c  reason: collision with root package name */
    private View f56425c;

    /* renamed from: d  reason: collision with root package name */
    private View f56426d;

    /* renamed from: e  reason: collision with root package name */
    private View f56427e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56423a, false, 60120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56423a, false, 60120, new Class[0], Void.TYPE);
            return;
        }
        EditOriginMusicTitleActivity editOriginMusicTitleActivity = this.f56424b;
        if (editOriginMusicTitleActivity != null) {
            this.f56424b = null;
            editOriginMusicTitleActivity.backBtn = null;
            editOriginMusicTitleActivity.doneBtn = null;
            editOriginMusicTitleActivity.musicTitleEdt = null;
            editOriginMusicTitleActivity.clearBtn = null;
            this.f56425c.setOnClickListener(null);
            this.f56425c = null;
            this.f56426d.setOnClickListener(null);
            this.f56426d = null;
            this.f56427e.setOnClickListener(null);
            this.f56427e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public EditOriginMusicTitleActivity_ViewBinding(final EditOriginMusicTitleActivity editOriginMusicTitleActivity, View view) {
        this.f56424b = editOriginMusicTitleActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "field 'backBtn' and method 'onViewClicked'");
        editOriginMusicTitleActivity.backBtn = (ImageView) Utils.castView(findRequiredView, C0906R.id.ix, "field 'backBtn'", ImageView.class);
        this.f56425c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56428a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56428a, false, 60121, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56428a, false, 60121, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                editOriginMusicTitleActivity.onViewClicked(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.a67, "field 'doneBtn' and method 'onViewClicked'");
        editOriginMusicTitleActivity.doneBtn = (Button) Utils.castView(findRequiredView2, C0906R.id.a67, "field 'doneBtn'", Button.class);
        this.f56426d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56431a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56431a, false, 60122, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56431a, false, 60122, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                editOriginMusicTitleActivity.onViewClicked(view2);
            }
        });
        editOriginMusicTitleActivity.musicTitleEdt = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.bow, "field 'musicTitleEdt'", EditText.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.t5, "field 'clearBtn' and method 'onViewClicked'");
        editOriginMusicTitleActivity.clearBtn = (ImageButton) Utils.castView(findRequiredView3, C0906R.id.t5, "field 'clearBtn'", ImageButton.class);
        this.f56427e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56434a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56434a, false, 60123, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56434a, false, 60123, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                editOriginMusicTitleActivity.onViewClicked(view2);
            }
        });
    }
}
