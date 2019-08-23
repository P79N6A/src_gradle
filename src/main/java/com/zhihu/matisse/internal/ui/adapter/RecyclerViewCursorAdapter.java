package com.zhihu.matisse.internal.ui.adapter;

import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;

public abstract class RecyclerViewCursorAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: a  reason: collision with root package name */
    private int f82700a;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f82701c;

    /* access modifiers changed from: protected */
    public abstract int a(Cursor cursor);

    /* access modifiers changed from: protected */
    public abstract void a(VH vh, Cursor cursor);

    public int getItemCount() {
        if (c(this.f82701c)) {
            return this.f82701c.getCount();
        }
        return 0;
    }

    RecyclerViewCursorAdapter(Cursor cursor) {
        setHasStableIds(true);
        b(null);
    }

    private static boolean c(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return false;
        }
        return true;
    }

    public final void b(Cursor cursor) {
        if (cursor != this.f82701c) {
            if (cursor != null) {
                this.f82701c = cursor;
                this.f82700a = this.f82701c.getColumnIndexOrThrow("_id");
                notifyDataSetChanged();
                return;
            }
            notifyItemRangeRemoved(0, getItemCount());
            this.f82701c = null;
            this.f82700a = -1;
        }
    }

    public long getItemId(int i) {
        if (!c(this.f82701c)) {
            throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
        } else if (this.f82701c.moveToPosition(i)) {
            return this.f82701c.getLong(this.f82700a);
        } else {
            throw new IllegalStateException("Could not move cursor to position " + i + " when trying to get an item id");
        }
    }

    public int getItemViewType(int i) {
        if (this.f82701c.moveToPosition(i)) {
            return a(this.f82701c);
        }
        throw new IllegalStateException("Could not move cursor to position " + i + " when trying to get item view type.");
    }

    public void onBindViewHolder(VH vh, int i) {
        if (!c(this.f82701c)) {
            throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
        } else if (this.f82701c.moveToPosition(i)) {
            a(vh, this.f82701c);
        } else {
            throw new IllegalStateException("Could not move cursor to position " + i + " when trying to bind view holder");
        }
    }
}
