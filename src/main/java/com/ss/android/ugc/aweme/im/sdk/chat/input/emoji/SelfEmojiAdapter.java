package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.util.LinkedHashSet;
import java.util.List;

public class SelfEmojiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50535a;

    /* renamed from: b  reason: collision with root package name */
    public a f50536b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f50537c;

    /* renamed from: d  reason: collision with root package name */
    public LinkedHashSet<com.ss.android.ugc.aweme.im.sdk.resources.model.a> f50538d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> f50539e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f50540f;

    public interface a {
        void a();
    }

    public SelfEmojiAdapter() {
        if (PatchProxy.isSupport(new Object[0], this, f50535a, false, 50874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50535a, false, 50874, new Class[0], Void.TYPE);
            return;
        }
        this.f50540f = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50541a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f50541a, false, 50885, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f50541a, false, 50885, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (SelfEmojiAdapter.this.f50537c && (C0906R.id.b2e == view.getId() || C0906R.id.sc == view.getId())) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    com.ss.android.ugc.aweme.im.sdk.resources.model.a a2 = SelfEmojiAdapter.this.a(intValue);
                    if (SelfEmojiAdapter.this.f50538d.contains(a2)) {
                        SelfEmojiAdapter.this.f50538d.remove(a2);
                    } else {
                        SelfEmojiAdapter.this.f50538d.add(a2);
                    }
                    SelfEmojiAdapter.this.notifyItemChanged(intValue);
                    if (SelfEmojiAdapter.this.f50536b != null) {
                        SelfEmojiAdapter.this.f50536b.a();
                    }
                }
            }
        };
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f50535a, false, 50883, new Class[0], Integer.TYPE)) {
            return this.f50538d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50535a, false, 50883, new Class[0], Integer.TYPE)).intValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50535a, false, 50884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50535a, false, 50884, new Class[0], Void.TYPE);
            return;
        }
        this.f50538d.clear();
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f50535a, false, 50878, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50535a, false, 50878, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f50537c) {
            if (this.f50539e == null) {
                return 0;
            }
            return this.f50539e.size();
        } else if (this.f50539e == null) {
            return 1;
        } else {
            return this.f50539e.size() + 1;
        }
    }

    public final com.ss.android.ugc.aweme.im.sdk.resources.model.a a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50535a, false, 50877, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class)) {
            return this.f50539e.get(i);
        }
        return (com.ss.android.ugc.aweme.im.sdk.resources.model.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50535a, false, 50877, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class);
    }

    public int getItemViewType(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50535a, false, 50879, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50535a, false, 50879, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f50539e == null) {
            i2 = 0;
        } else {
            i2 = this.f50539e.size();
        }
        if (i == i2) {
            return 1;
        }
        return 0;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50535a, false, 50875, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50535a, false, 50875, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            SelfAddEmojiViewHolder selfAddEmojiViewHolder = new SelfAddEmojiViewHolder(viewGroup2);
            selfAddEmojiViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50543a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f50543a, false, 50886, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f50543a, false, 50886, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (SelfEmojiAdapter.this.f50539e == null || SelfEmojiAdapter.this.f50539e.size() < 79) {
                        Activity activity = (Activity) view.getContext();
                        if (PatchProxy.isSupport(new Object[]{activity}, null, h.f50581a, true, 50865, new Class[]{Activity.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity}, null, h.f50581a, true, 50865, new Class[]{Activity.class}, Void.TYPE);
                            return;
                        }
                        k.a().a(activity, new com.ss.android.ugc.aweme.base.a<Boolean>(activity) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f50586a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ Activity f50587b;

                            {
                                this.f50587b = r1;
                            }

                            public final /* synthetic */ void run(Object obj) {
                                Boolean bool = (Boolean) obj;
                                if (PatchProxy.isSupport(new Object[]{bool}, this, f50586a, false, 50868, new Class[]{Boolean.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bool}, this, f50586a, false, 50868, new Class[]{Boolean.class}, Void.TYPE);
                                    return;
                                }
                                if (bool.booleanValue()) {
                                    Intent intent = new Intent(this.f50587b, PhotoSelectActivity.class);
                                    intent.putExtra("album_action", 1);
                                    this.f50587b.startActivity(intent);
                                }
                            }
                        });
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.auf, 1).a();
                    z.a().a(false);
                }
            });
            return selfAddEmojiViewHolder;
        } else {
            return new SelfEmojiViewHolder(viewGroup2);
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f50535a, false, 50876, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f50535a, false, 50876, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof SelfEmojiViewHolder) {
            SelfEmojiViewHolder selfEmojiViewHolder = (SelfEmojiViewHolder) viewHolder2;
            if (!this.f50537c) {
                i2 = 0;
            } else if (this.f50538d.contains(a(i3))) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            selfEmojiViewHolder.f50548d = this.f50540f;
            com.ss.android.ugc.aweme.im.sdk.resources.model.a a2 = a(i3);
            if (PatchProxy.isSupport(new Object[]{a2, Integer.valueOf(i), Integer.valueOf(i2)}, selfEmojiViewHolder, SelfEmojiViewHolder.f50545a, false, 50890, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                SelfEmojiViewHolder selfEmojiViewHolder2 = selfEmojiViewHolder;
                PatchProxy.accessDispatch(new Object[]{a2, Integer.valueOf(i), Integer.valueOf(i2)}, selfEmojiViewHolder2, SelfEmojiViewHolder.f50545a, false, 50890, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i2 == 0) {
                selfEmojiViewHolder.f50547c.setVisibility(8);
            } else if (2 == i2) {
                selfEmojiViewHolder.f50547c.setVisibility(0);
                selfEmojiViewHolder.f50547c.setSelected(false);
            } else if (1 == i2) {
                selfEmojiViewHolder.f50547c.setVisibility(0);
                selfEmojiViewHolder.f50547c.setSelected(true);
            }
            selfEmojiViewHolder.f50547c.setOnClickListener(selfEmojiViewHolder.f50548d);
            selfEmojiViewHolder.f50546b.setOnClickListener(selfEmojiViewHolder.f50548d);
            selfEmojiViewHolder.f50546b.setTag(Integer.valueOf(i));
            selfEmojiViewHolder.f50547c.setTag(Integer.valueOf(i));
            c.b(selfEmojiViewHolder.f50546b, a2.getAnimateUrl());
        }
    }
}
