package com.jozufozu.flywheel.backend.gl.buffer;

import java.nio.ByteBuffer;

import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;

public class MappedGlBuffer extends GlBuffer {

	protected final GlBufferUsage usage;

	public MappedGlBuffer(GlBufferType type) {
		this(type, GlBufferUsage.STATIC_DRAW);
	}

	public MappedGlBuffer(GlBufferType type, GlBufferUsage usage) {
		super(type);
		this.usage = usage;
	}

	public void alloc(long size) {
		GL15.glBufferData(type.glEnum, size, usage.glEnum);
	}

	public void upload(ByteBuffer directBuffer) {
		GL15.glBufferData(type.glEnum, directBuffer, usage.glEnum);
	}

	public MappedBuffer getBuffer(int offset, int length) {
		return new MappedBufferRange(this, offset, length, GL30.GL_MAP_WRITE_BIT);
	}
}
