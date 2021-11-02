/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.throwable;

/**
 * @author tiezhu
 * @since 2021/4/28 4:16 下午
 */
public class FlinkxSqlParseException extends FlinkxRuntimeException {

    private static final long serialVersionUID = 140340324748507369L;

    public FlinkxSqlParseException(String sql) {

        super(String.format("Parse SQL fail! Current SQL : \n%s", sql));
    }

    public FlinkxSqlParseException(Throwable cause) {
        super(cause);
    }

    public FlinkxSqlParseException(String sql, Throwable cause) {
        super(String.format("Parse SQL fail! Current SQL : \n%s", sql), cause);
    }
}
