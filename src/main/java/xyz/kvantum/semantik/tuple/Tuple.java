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

/**
 * A simple tuple representation
 */
public abstract class Tuple
{

    /**
     * Constructor to keep instantiation limited to package
     */
    Tuple()
    {
    }

    /**
     * Get an object. Indexed from 0 to (n-1)
     *
     * @param n   Object Index
     * @param <T> Object Type (Object will be casted, may result
     *            in {@link ClassCastException}
     * @return Object, or Null
     */
    public abstract <T> T get(final int n);

    /**
     * Get an object. Indexed from 0 to (n-1)
     *
     * @param n      Object Index
     * @param object (Object will be casted, may result
     *               in {@link ClassCastException}
     */
    public abstract void set(final int n, final Object object);

}
