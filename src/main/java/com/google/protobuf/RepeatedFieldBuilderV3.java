package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessage.Builder;
import com.google.protobuf.MessageOrBuilder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RepeatedFieldBuilderV3<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> implements AbstractMessage.BuilderParent {
    private List<SingleFieldBuilderV3<MType, BType, IType>> builders;
    private BuilderExternalList<MType, BType, IType> externalBuilderList;
    private MessageExternalList<MType, BType, IType> externalMessageList;
    private MessageOrBuilderExternalList<MType, BType, IType> externalMessageOrBuilderList;
    private boolean isClean;
    private boolean isMessagesListMutable;
    private List<MType> messages;
    private AbstractMessage.BuilderParent parent;

    static class BuilderExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<BType> implements List<BType> {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        /* access modifiers changed from: package-private */
        public void incrementModCount() {
            this.modCount++;
        }

        public int size() {
            return this.builder.getCount();
        }

        BuilderExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        public BType get(int i) {
            return this.builder.getBuilder(i);
        }
    }

    static class MessageExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<MType> implements List<MType> {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        /* access modifiers changed from: package-private */
        public void incrementModCount() {
            this.modCount++;
        }

        public int size() {
            return this.builder.getCount();
        }

        MessageExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        public MType get(int i) {
            return this.builder.getMessage(i);
        }
    }

    static class MessageOrBuilderExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<IType> implements List<IType> {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        /* access modifiers changed from: package-private */
        public void incrementModCount() {
            this.modCount++;
        }

        public int size() {
            return this.builder.getCount();
        }

        MessageOrBuilderExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        public IType get(int i) {
            return this.builder.getMessageOrBuilder(i);
        }
    }

    public void dispose() {
        this.parent = null;
    }

    public void markDirty() {
        onChanged();
    }

    public int getCount() {
        return this.messages.size();
    }

    public boolean isEmpty() {
        return this.messages.isEmpty();
    }

    public List<BType> getBuilderList() {
        if (this.externalBuilderList == null) {
            this.externalBuilderList = new BuilderExternalList<>(this);
        }
        return this.externalBuilderList;
    }

    public List<MType> getMessageList() {
        if (this.externalMessageList == null) {
            this.externalMessageList = new MessageExternalList<>(this);
        }
        return this.externalMessageList;
    }

    public List<IType> getMessageOrBuilderList() {
        if (this.externalMessageOrBuilderList == null) {
            this.externalMessageOrBuilderList = new MessageOrBuilderExternalList<>(this);
        }
        return this.externalMessageOrBuilderList;
    }

    private void ensureMutableMessageList() {
        if (!this.isMessagesListMutable) {
            this.messages = new ArrayList(this.messages);
            this.isMessagesListMutable = true;
        }
    }

    private void incrementModCounts() {
        if (this.externalMessageList != null) {
            this.externalMessageList.incrementModCount();
        }
        if (this.externalBuilderList != null) {
            this.externalBuilderList.incrementModCount();
        }
        if (this.externalMessageOrBuilderList != null) {
            this.externalMessageOrBuilderList.incrementModCount();
        }
    }

    private void onChanged() {
        if (this.isClean && this.parent != null) {
            this.parent.markDirty();
            this.isClean = false;
        }
    }

    private void ensureBuilders() {
        if (this.builders == null) {
            this.builders = new ArrayList(this.messages.size());
            for (int i = 0; i < this.messages.size(); i++) {
                this.builders.add(null);
            }
        }
    }

    public void clear() {
        this.messages = Collections.emptyList();
        this.isMessagesListMutable = false;
        if (this.builders != null) {
            for (SingleFieldBuilderV3 next : this.builders) {
                if (next != null) {
                    next.dispose();
                }
            }
            this.builders = null;
        }
        onChanged();
        incrementModCounts();
    }

    public List<MType> build() {
        boolean z;
        this.isClean = true;
        if (!this.isMessagesListMutable && this.builders == null) {
            return this.messages;
        }
        if (!this.isMessagesListMutable) {
            int i = 0;
            while (true) {
                if (i >= this.messages.size()) {
                    z = true;
                    break;
                }
                Message message = (Message) this.messages.get(i);
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.builders.get(i);
                if (singleFieldBuilderV3 != null && singleFieldBuilderV3.build() != message) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return this.messages;
            }
        }
        ensureMutableMessageList();
        for (int i2 = 0; i2 < this.messages.size(); i2++) {
            this.messages.set(i2, getMessage(i2, true));
        }
        this.messages = Collections.unmodifiableList(this.messages);
        this.isMessagesListMutable = false;
        return this.messages;
    }

    public MType getMessage(int i) {
        return getMessage(i, false);
    }

    public void remove(int i) {
        ensureMutableMessageList();
        this.messages.remove(i);
        if (this.builders != null) {
            SingleFieldBuilderV3 remove = this.builders.remove(i);
            if (remove != null) {
                remove.dispose();
            }
        }
        onChanged();
        incrementModCounts();
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(MType mtype) {
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.add(mtype);
        if (this.builders != null) {
            this.builders.add(null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public BType getBuilder(int i) {
        ensureBuilders();
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.builders.get(i);
        if (singleFieldBuilderV3 == null) {
            SingleFieldBuilderV3 singleFieldBuilderV32 = new SingleFieldBuilderV3((AbstractMessage) this.messages.get(i), this, this.isClean);
            this.builders.set(i, singleFieldBuilderV32);
            singleFieldBuilderV3 = singleFieldBuilderV32;
        }
        return singleFieldBuilderV3.getBuilder();
    }

    public IType getMessageOrBuilder(int i) {
        if (this.builders == null) {
            return (MessageOrBuilder) this.messages.get(i);
        }
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.builders.get(i);
        if (singleFieldBuilderV3 == null) {
            return (MessageOrBuilder) this.messages.get(i);
        }
        return singleFieldBuilderV3.getMessageOrBuilder();
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> addAllMessages(Iterable<? extends MType> iterable) {
        Iterator<? extends MType> it2 = iterable.iterator();
        while (it2.hasNext()) {
            Internal.checkNotNull((AbstractMessage) it2.next());
        }
        int i = -1;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() == 0) {
                return this;
            }
            i = collection.size();
        }
        ensureMutableMessageList();
        if (i >= 0 && (this.messages instanceof ArrayList)) {
            ((ArrayList) this.messages).ensureCapacity(this.messages.size() + i);
        }
        Iterator<? extends MType> it3 = iterable.iterator();
        while (it3.hasNext()) {
            addMessage((AbstractMessage) it3.next());
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public BType addBuilder(MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3 singleFieldBuilderV3 = new SingleFieldBuilderV3(mtype, this, this.isClean);
        this.messages.add(null);
        this.builders.add(singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return singleFieldBuilderV3.getBuilder();
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(int i, MType mtype) {
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.add(i, mtype);
        if (this.builders != null) {
            this.builders.add(i, null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    private MType getMessage(int i, boolean z) {
        if (this.builders == null) {
            return (AbstractMessage) this.messages.get(i);
        }
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.builders.get(i);
        if (singleFieldBuilderV3 == null) {
            return (AbstractMessage) this.messages.get(i);
        }
        if (z) {
            return singleFieldBuilderV3.build();
        }
        return singleFieldBuilderV3.getMessage();
    }

    public BType addBuilder(int i, MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3 singleFieldBuilderV3 = new SingleFieldBuilderV3(mtype, this, this.isClean);
        this.messages.add(i, null);
        this.builders.add(i, singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return singleFieldBuilderV3.getBuilder();
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> setMessage(int i, MType mtype) {
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.set(i, mtype);
        if (this.builders != null) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.builders.set(i, null);
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
            }
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public RepeatedFieldBuilderV3(List<MType> list, boolean z, AbstractMessage.BuilderParent builderParent, boolean z2) {
        this.messages = list;
        this.isMessagesListMutable = z;
        this.parent = builderParent;
        this.isClean = z2;
    }
}
