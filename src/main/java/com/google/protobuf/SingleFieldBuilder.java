package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.Builder;
import com.google.protobuf.MessageOrBuilder;

public class SingleFieldBuilder<MType extends GeneratedMessage, BType extends GeneratedMessage.Builder, IType extends MessageOrBuilder> implements GeneratedMessage.BuilderParent {
    private BType builder;
    private boolean isClean;
    private MType message;
    private GeneratedMessage.BuilderParent parent;

    public void dispose() {
        this.parent = null;
    }

    public void markDirty() {
        onChanged();
    }

    public MType build() {
        this.isClean = true;
        return getMessage();
    }

    public IType getMessageOrBuilder() {
        if (this.builder != null) {
            return this.builder;
        }
        return this.message;
    }

    private void onChanged() {
        if (this.builder != null) {
            this.message = null;
        }
        if (this.isClean && this.parent != null) {
            this.parent.markDirty();
            this.isClean = false;
        }
    }

    public BType getBuilder() {
        if (this.builder == null) {
            this.builder = (GeneratedMessage.Builder) this.message.newBuilderForType((GeneratedMessage.BuilderParent) this);
            this.builder.mergeFrom((Message) this.message);
            this.builder.markClean();
        }
        return this.builder;
    }

    public MType getMessage() {
        if (this.message == null) {
            this.message = (GeneratedMessage) this.builder.buildPartial();
        }
        return this.message;
    }

    public SingleFieldBuilder<MType, BType, IType> clear() {
        MType mtype;
        if (this.message != null) {
            mtype = this.message.getDefaultInstanceForType();
        } else {
            mtype = this.builder.getDefaultInstanceForType();
        }
        this.message = (GeneratedMessage) mtype;
        if (this.builder != null) {
            this.builder.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    public SingleFieldBuilder<MType, BType, IType> mergeFrom(MType mtype) {
        if (this.builder == null && this.message == this.message.getDefaultInstanceForType()) {
            this.message = mtype;
        } else {
            getBuilder().mergeFrom((Message) mtype);
        }
        onChanged();
        return this;
    }

    public SingleFieldBuilder<MType, BType, IType> setMessage(MType mtype) {
        if (mtype != null) {
            this.message = mtype;
            if (this.builder != null) {
                this.builder.dispose();
                this.builder = null;
            }
            onChanged();
            return this;
        }
        throw new NullPointerException();
    }

    public SingleFieldBuilder(MType mtype, GeneratedMessage.BuilderParent builderParent, boolean z) {
        if (mtype != null) {
            this.message = mtype;
            this.parent = builderParent;
            this.isClean = z;
            return;
        }
        throw new NullPointerException();
    }
}
