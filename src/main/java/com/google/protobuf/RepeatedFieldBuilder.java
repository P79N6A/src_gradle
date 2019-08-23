package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.Builder;
import com.google.protobuf.MessageOrBuilder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RepeatedFieldBuilder<MType extends GeneratedMessage, BType extends GeneratedMessage.Builder, IType extends MessageOrBuilder> implements GeneratedMessage.BuilderParent {
    private List<SingleFieldBuilder<MType, BType, IType>> builders;
    private BuilderExternalList<MType, BType, IType> externalBuilderList;
    private MessageExternalList<MType, BType, IType> externalMessageList;
    private MessageOrBuilderExternalList<MType, BType, IType> externalMessageOrBuilderList;
    private boolean isClean;
    private boolean isMessagesListMutable;
    private List<MType> messages;
    private GeneratedMessage.BuilderParent parent;

    static class BuilderExternalList<MType extends GeneratedMessage, BType extends GeneratedMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<BType> implements List<BType> {
        RepeatedFieldBuilder<MType, BType, IType> builder;

        /* access modifiers changed from: package-private */
        public void incrementModCount() {
            this.modCount++;
        }

        public int size() {
            return this.builder.getCount();
        }

        BuilderExternalList(RepeatedFieldBuilder<MType, BType, IType> repeatedFieldBuilder) {
            this.builder = repeatedFieldBuilder;
        }

        public BType get(int i) {
            return this.builder.getBuilder(i);
        }
    }

    static class MessageExternalList<MType extends GeneratedMessage, BType extends GeneratedMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<MType> implements List<MType> {
        RepeatedFieldBuilder<MType, BType, IType> builder;

        /* access modifiers changed from: package-private */
        public void incrementModCount() {
            this.modCount++;
        }

        public int size() {
            return this.builder.getCount();
        }

        MessageExternalList(RepeatedFieldBuilder<MType, BType, IType> repeatedFieldBuilder) {
            this.builder = repeatedFieldBuilder;
        }

        public MType get(int i) {
            return this.builder.getMessage(i);
        }
    }

    static class MessageOrBuilderExternalList<MType extends GeneratedMessage, BType extends GeneratedMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<IType> implements List<IType> {
        RepeatedFieldBuilder<MType, BType, IType> builder;

        /* access modifiers changed from: package-private */
        public void incrementModCount() {
            this.modCount++;
        }

        public int size() {
            return this.builder.getCount();
        }

        MessageOrBuilderExternalList(RepeatedFieldBuilder<MType, BType, IType> repeatedFieldBuilder) {
            this.builder = repeatedFieldBuilder;
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
            for (SingleFieldBuilder next : this.builders) {
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
                SingleFieldBuilder singleFieldBuilder = this.builders.get(i);
                if (singleFieldBuilder != null && singleFieldBuilder.build() != message) {
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
            SingleFieldBuilder remove = this.builders.remove(i);
            if (remove != null) {
                remove.dispose();
            }
        }
        onChanged();
        incrementModCounts();
    }

    public BType getBuilder(int i) {
        ensureBuilders();
        SingleFieldBuilder singleFieldBuilder = this.builders.get(i);
        if (singleFieldBuilder == null) {
            SingleFieldBuilder singleFieldBuilder2 = new SingleFieldBuilder((GeneratedMessage) this.messages.get(i), this, this.isClean);
            this.builders.set(i, singleFieldBuilder2);
            singleFieldBuilder = singleFieldBuilder2;
        }
        return singleFieldBuilder.getBuilder();
    }

    public IType getMessageOrBuilder(int i) {
        if (this.builders == null) {
            return (MessageOrBuilder) this.messages.get(i);
        }
        SingleFieldBuilder singleFieldBuilder = this.builders.get(i);
        if (singleFieldBuilder == null) {
            return (MessageOrBuilder) this.messages.get(i);
        }
        return singleFieldBuilder.getMessageOrBuilder();
    }

    public RepeatedFieldBuilder<MType, BType, IType> addAllMessages(Iterable<? extends MType> iterable) {
        Iterator<? extends MType> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (((GeneratedMessage) it2.next()) == null) {
                throw new NullPointerException();
            }
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
            addMessage((GeneratedMessage) it3.next());
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public BType addBuilder(MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilder singleFieldBuilder = new SingleFieldBuilder(mtype, this, this.isClean);
        this.messages.add(null);
        this.builders.add(singleFieldBuilder);
        onChanged();
        incrementModCounts();
        return singleFieldBuilder.getBuilder();
    }

    public RepeatedFieldBuilder<MType, BType, IType> addMessage(MType mtype) {
        if (mtype != null) {
            ensureMutableMessageList();
            this.messages.add(mtype);
            if (this.builders != null) {
                this.builders.add(null);
            }
            onChanged();
            incrementModCounts();
            return this;
        }
        throw new NullPointerException();
    }

    private MType getMessage(int i, boolean z) {
        if (this.builders == null) {
            return (GeneratedMessage) this.messages.get(i);
        }
        SingleFieldBuilder singleFieldBuilder = this.builders.get(i);
        if (singleFieldBuilder == null) {
            return (GeneratedMessage) this.messages.get(i);
        }
        if (z) {
            return singleFieldBuilder.build();
        }
        return singleFieldBuilder.getMessage();
    }

    public BType addBuilder(int i, MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilder singleFieldBuilder = new SingleFieldBuilder(mtype, this, this.isClean);
        this.messages.add(i, null);
        this.builders.add(i, singleFieldBuilder);
        onChanged();
        incrementModCounts();
        return singleFieldBuilder.getBuilder();
    }

    public RepeatedFieldBuilder<MType, BType, IType> addMessage(int i, MType mtype) {
        if (mtype != null) {
            ensureMutableMessageList();
            this.messages.add(i, mtype);
            if (this.builders != null) {
                this.builders.add(i, null);
            }
            onChanged();
            incrementModCounts();
            return this;
        }
        throw new NullPointerException();
    }

    public RepeatedFieldBuilder<MType, BType, IType> setMessage(int i, MType mtype) {
        if (mtype != null) {
            ensureMutableMessageList();
            this.messages.set(i, mtype);
            if (this.builders != null) {
                SingleFieldBuilder singleFieldBuilder = this.builders.set(i, null);
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                }
            }
            onChanged();
            incrementModCounts();
            return this;
        }
        throw new NullPointerException();
    }

    public RepeatedFieldBuilder(List<MType> list, boolean z, GeneratedMessage.BuilderParent builderParent, boolean z2) {
        this.messages = list;
        this.isMessagesListMutable = z;
        this.parent = builderParent;
        this.isClean = z2;
    }
}
