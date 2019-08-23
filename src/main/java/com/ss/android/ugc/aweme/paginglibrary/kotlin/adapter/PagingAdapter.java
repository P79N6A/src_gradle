package com.ss.android.ugc.aweme.paginglibrary.kotlin.adapter;

import android.arch.paging.PagedListAdapter;
import android.support.v7.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000  *\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002:\u0001 B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH&J$\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rH&J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/adapter/PagingAdapter;", "T", "Landroid/arch/paging/PagedListAdapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "retryCallback", "Lkotlin/Function0;", "", "(Landroid/support/v7/util/DiffUtil$ItemCallback;Lkotlin/jvm/functions/Function0;)V", "networkState", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/NetworkState;", "getBasicItemViewType", "", "position", "getItemCount", "getItemViewType", "getTextColor", "hasExtraRow", "", "onBasicBindViewHolder", "holder", "payloads", "", "onBasicCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "onCreateViewHolder", "setNetworkState", "newNetworkState", "Companion", "paginglibrary_release"}, k = 1, mv = {1, 1, 10})
public abstract class PagingAdapter<T> extends PagedListAdapter<T, RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f58436a = new a((byte) 0);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/adapter/PagingAdapter$Companion;", "", "()V", "TYPE_FOOTER", "", "paginglibrary_release"}, k = 1, mv = {1, 1, 10})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
