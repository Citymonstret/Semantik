/*
 *    _  __                     _
 *    | |/ /__   __ __ _  _ __  | |_  _   _  _ __ ___
 *    | ' / \ \ / // _` || '_ \ | __|| | | || '_ ` _ \
 *    | . \  \ V /| (_| || | | || |_ | |_| || | | | | |
 *    |_|\_\  \_/  \__,_||_| |_| \__| \__,_||_| |_| |_|
 *
 *    Copyright (C) 2017 Alexander Söderberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.kvantum.semantik.tuple;

import lombok.Getter;
import lombok.Setter;
import xyz.kvantum.semantik.util.Nullable;

@Getter
@Setter
@SuppressWarnings({ "WeakerAccess", "unused" })
public final class Tuple_1<T1> extends Tuple
{

    private T1 t1;

    public Tuple_1()
    {
    }

    public Tuple_1(@Nullable T1 t1)
    {
        this.t1 = t1;
    }

    @Override
    @SuppressWarnings("ALL")
    public <T> T get(final int n)
    {
        switch ( n + 1 )
        {
            case 1:
                return (T) this.t1;
            default:
                return null;
        }
    }

    @Override
    @SuppressWarnings("ALL")
    public void set(final int n, @Nullable final Object object)
    {
        switch ( n + 1 )
        {
            case 1:
                this.t1 = (T1) object;
            default:
                return;
        }
    }
}
