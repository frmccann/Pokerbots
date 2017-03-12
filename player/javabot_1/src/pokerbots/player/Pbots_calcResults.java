/**
 * Copyright (C) 2012-2013 Owen Derby (ocderby@gmail.com)
 *
 * This file is part of pbots_calc.
 *
 * pbots_calc is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * pbots_calc is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * pbots_calc in a file in teh toplevel directory called "GPLv3".  If not, see
 * <http://www.gnu.org/licenses/>.
 */
package pokerbots.player;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration : pbots_calc.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("pbots_calc")
public class Pbots_calcResults extends StructObject {
	public Pbots_calcResults() {
		super();
	}
	public Pbots_calcResults(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	/// C type : double*
	@Field(0)
	public Pointer<Double > ev() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : double*
	@Field(0)
	public Pbots_calcResults ev(Pointer<Double > ev) {
		this.io.setPointerField(this, 0, ev);
		return this;
	}
	/// C type : char**
	@Field(1)
	public Pointer<Pointer<Byte > > hands() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : char**
	@Field(1)
	public Pbots_calcResults hands(Pointer<Pointer<Byte > > hands) {
		this.io.setPointerField(this, 1, hands);
		return this;
	}
	@Field(2)
	public int iters() {
		return this.io.getIntField(this, 2);
	}
	@Field(2)
	public Pbots_calcResults iters(int iters) {
		this.io.setIntField(this, 2, iters);
		return this;
	}
	@Field(3)
	public int size() {
		return this.io.getIntField(this, 3);
	}
	@Field(3)
	public Pbots_calcResults size(int size) {
		this.io.setIntField(this, 3, size);
		return this;
	}
	/// did we run Monte Carlo simulation?
	@Field(4)
	public int MC() {
		return this.io.getIntField(this, 4);
	}
	/// did we run Monte Carlo simulation?
	@Field(4)
	public Pbots_calcResults MC(int MC) {
		this.io.setIntField(this, 4, MC);
		return this;
	}
}
