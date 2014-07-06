/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */

package org.apache.bcel.classfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.bcel.Constants;

/**
 * This class represents a MethodParameters attribute.
 * 
 * @see <a href="http://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.24">The class File Format : The MethodParameters Attribute</a>
 * @since 6.0
 */
public class MethodParameters extends Attribute {

    private static final long serialVersionUID = 2500272580422360140L;

    private MethodParameter[] parameters = new MethodParameter[0];

    MethodParameters(int name_index, int length, DataInputStream file, ConstantPool constant_pool) throws IOException {
        super(Constants.ATTR_METHOD_PARAMETERS, name_index, length, constant_pool);
        System.out.println("new MethodParameters");

        int parameters_count = file.readUnsignedShort();
        parameters = new MethodParameter[parameters_count];
        for (int i = 0; i < parameters_count; i++) {
            parameters[i] = new MethodParameter(file);
        }
    }

    public MethodParameter[] getParameters() {
        return parameters;
    }

    public void setParameters(MethodParameter[] parameters) {
        this.parameters = parameters;
    }

    @Override
    public void accept(Visitor v) {
        v.visitMethodParameters(this);
    }

    @Override
    public Attribute copy(ConstantPool _constant_pool) {
        MethodParameters c = (MethodParameters) clone();
        c.parameters = new MethodParameter[parameters.length];

        for (int i = 0; i < parameters.length; i++) {
            c.parameters[i] = parameters[i].copy();
        }
        c.constant_pool = _constant_pool;
        return c;
    }

    /**
     * Dump method parameters attribute to file stream in binary format.
     *
     * @param file Output file stream
     * @throws IOException
     */
    @Override
       public void dump(DataOutputStream file) throws IOException {
           super.dump(file);
           file.writeByte(parameters.length);
        for (MethodParameter parameter : parameters) {
            parameter.dump(file);
        }
    }
}
