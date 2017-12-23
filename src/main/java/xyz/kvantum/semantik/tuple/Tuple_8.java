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
public final class Tuple_8<T1, T2, T3, T4, T5, T6, T7, T8> extends Tuple
{

    private T1 t1;
    private T2 t2;
    private T3 t3;
    private T4 t4;
    private T5 t5;
    private T6 t6;
    private T7 t7;
    private T8 t8;

    public Tuple_8()
    {
    }

    public Tuple_8(@Nullable T1 t1)
    {
        this.t1 = t1;
    }

    public Tuple_8(@Nullable T1 t1, @Nullable T2 t2)
    {
        this.t1 = t1;
        this.t2 = t2;
    }

    public Tuple_8(@Nullable T1 t1, @Nullable T2 t2, @Nullable T3 t3)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public Tuple_8(@Nullable T1 t1, @Nullable T2 t2, @Nullable T3 t3, @Nullable T4 t4)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
    }

    public Tuple_8(@Nullable T1 t1, @Nullable T2 t2, @Nullable T3 t3, @Nullable T4 t4, @Nullable T5 t5)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
    }

    public Tuple_8(@Nullable T1 t1, @Nullable T2 t2, @Nullable T3 t3, @Nullable T4 t4, @Nullable T5 t5, @Nullable T6 t6)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
    }

    public Tuple_8(@Nullable T1 t1, @Nullable T2 t2, @Nullable T3 t3, @Nullable T4 t4, @Nullable T5 t5, @Nullable T6 t6, @Nullable T7 t7)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
    }

    public Tuple_8(@Nullable T1 t1, @Nullable T2 t2, @Nullable T3 t3, @Nullable T4 t4, @Nullable T5 t5, @Nullable T6 t6, @Nullable T7 t7, @Nullable T8 t8)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
        this.t8 = t8;
    }

    @Override
    @SuppressWarnings("ALL")
    public <T> T get(final int n)
    {
        switch ( n + 1 )
        {
            case 1:
                return (T) this.t1;
            case 2:
                return (T) this.t2;
            case 3:
                return (T) this.t3;
            case 4:
                return (T) this.t4;
            case 5:
                return (T) this.t5;
            case 6:
                return (T) this.t6;
            case 7:
                return (T) this.t7;
            case 8:
                return (T) this.t8;
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
            case 2:
                this.t2 = (T2) object;
            case 3:
                this.t3 = (T3) object;
            case 4:
                this.t4 = (T4) object;
            case 5:
                this.t5 = (T5) object;
            case 6:
                this.t6 = (T6) object;
            case 7:
                this.t7 = (T7) object;
            case 8:
                this.t8 = (T8) object;
            default:
                return;
        }
    }
}
