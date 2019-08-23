package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BattleTask extends Message<BattleTask, Builder> {
    public static final ProtoAdapter<BattleTask> ADAPTER = new ProtoAdapter_BattleTask();
    public static final Boolean DEFAULT_ENABLE_TASK = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean enable_task;

    public static final class Builder extends Message.Builder<BattleTask, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean enable_task;

        public final BattleTask build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11187, new Class[0], BattleTask.class)) {
                return new BattleTask(this.enable_task, super.buildUnknownFields());
            }
            return (BattleTask) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11187, new Class[0], BattleTask.class);
        }

        public final Builder enable_task(Boolean bool) {
            this.enable_task = bool;
            return this;
        }
    }

    static final class ProtoAdapter_BattleTask extends ProtoAdapter<BattleTask> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_BattleTask() {
            super(FieldEncoding.LENGTH_DELIMITED, BattleTask.class);
        }

        public final BattleTask decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11190, new Class[]{ProtoReader.class}, BattleTask.class)) {
                return (BattleTask) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11190, new Class[]{ProtoReader.class}, BattleTask.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                } else {
                    builder.enable_task((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                }
            }
        }

        public final int encodedSize(BattleTask battleTask) {
            BattleTask battleTask2 = battleTask;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{battleTask2}, this, changeQuickRedirect, false, 11188, new Class[]{BattleTask.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{battleTask2}, this, changeQuickRedirect, false, 11188, new Class[]{BattleTask.class}, Integer.TYPE)).intValue();
            }
            if (battleTask2.enable_task != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, battleTask2.enable_task);
            }
            return i + battleTask.unknownFields().size();
        }

        public final BattleTask redact(BattleTask battleTask) {
            if (PatchProxy.isSupport(new Object[]{battleTask}, this, changeQuickRedirect, false, 11191, new Class[]{BattleTask.class}, BattleTask.class)) {
                return (BattleTask) PatchProxy.accessDispatch(new Object[]{battleTask}, this, changeQuickRedirect, false, 11191, new Class[]{BattleTask.class}, BattleTask.class);
            }
            Builder newBuilder = battleTask.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, BattleTask battleTask) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BattleTask battleTask2 = battleTask;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, battleTask2}, this, changeQuickRedirect, false, 11189, new Class[]{ProtoWriter.class, BattleTask.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, battleTask2}, this, changeQuickRedirect, false, 11189, new Class[]{ProtoWriter.class, BattleTask.class}, Void.TYPE);
                return;
            }
            if (battleTask2.enable_task != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, battleTask2.enable_task);
            }
            protoWriter2.writeBytes(battleTask.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11183, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11183, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.enable_task = this.enable_task;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11185, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11185, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.enable_task != null) {
                i = this.enable_task.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11186, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11186, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.enable_task != null) {
            sb.append(", enable_task=");
            sb.append(this.enable_task);
        }
        StringBuilder replace = sb.replace(0, 2, "BattleTask{");
        replace.append('}');
        return replace.toString();
    }

    public BattleTask(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11184, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11184, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BattleTask)) {
                return false;
            }
            BattleTask battleTask = (BattleTask) obj;
            if (!unknownFields().equals(battleTask.unknownFields()) || !Internal.equals(this.enable_task, battleTask.enable_task)) {
                return false;
            }
            return true;
        }
    }

    public BattleTask(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_task = bool;
    }
}
