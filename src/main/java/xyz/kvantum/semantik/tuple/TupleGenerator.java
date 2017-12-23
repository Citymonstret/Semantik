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

import xyz.kvantum.semantik.util.Nullable;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Class used to generate {@link Tuple tuples}
 *
 * @author Alexander Söderberg
 */
public final class TupleGenerator
{

    public static void main(@Nullable final String[] args)
    {
        for ( int i = 1; i <= 25; i++ )
        {
            createTuple( i );
        }
    }

    private static void createTuple(final int n)
    {
        final String newLine = System.lineSeparator();
        final StringBuilder builder = new StringBuilder();
        builder.append( "package xyz.kvantum.semantik.tuple;" ).append( newLine ).append( newLine );
        builder.append( "import lombok.Getter;" ).append( newLine );
        builder.append( "import lombok.Setter;" ).append( newLine );
        builder.append( "import xyz.kvantum.semantik.util.Nullable;" ).append( newLine ).append( newLine );
        builder.append( "@Getter" ).append( newLine );
        builder.append( "@Setter" ).append( newLine );
        builder.append( "@SuppressWarnings({ \"WeakerAccess\", \"unused\" })" ).append( newLine );
        builder.append( "public final class Tuple_" ).append( n ).append( "<" );
        for ( int i = 1; i <= n; i++ )
        {
            builder.append( "T" ).append( i );
            if ( i != n )
            {
                builder.append( ", " );
            }
        }
        builder.append( "> extends Tuple" ).append( newLine ).append( "{" ).append( newLine ).append( newLine );
        for ( int i = 1; i <= n; i++ )
        {
            builder.append( "\tprivate T" ).append( i ).append( " t" ).append( i ).append( ";" ).append( newLine );
        }
        builder.append( newLine );
        for ( int i = 0; i <= n; i++ )
        {
            builder.append( "\tpublic Tuple_" ).append( n ).append( "(" );
            if ( i != 0 )
            {
                for ( int j = 1; j <= i; j++ )
                {
                    builder.append( "@Nullable T" ).append( j ).append( " t" ).append( j );
                    if ( j != i )
                    {
                        builder.append( ", " );
                    }
                }
            }
            builder.append( ")" ).append( newLine ).append( "\t{" ).append( newLine );
            if ( i != 0 )
            {
                for ( int j = 1; j <= i; j++ )
                {
                    builder.append( "\t\tthis.t" ).append( j ).append( " = t" ).append( j ).append( ";" ).append( newLine );
                }
            }
            builder.append( "\t}" ).append( newLine ).append( newLine );
        }

        //
        // generate get(integer)
        //
        builder.append( "\t@Override" ).append( newLine );
        builder.append( "\t@SuppressWarnings(\"ALL\")" ).append( newLine );
        builder.append( "\tpublic <T> T get(final int n)" ).append( newLine ).append( "\t{" ).append( newLine );
        builder.append( "\t\tswitch(n + 1)" ).append( newLine ).append( "\t\t{" ).append( newLine );
        for ( int i = 1; i <= n; i++ )
        {
            builder.append( "\t\t\tcase " ).append( i ).append( ":" ).append( newLine );
            builder.append( "\t\t\t\treturn (T) this.t" ).append( i ).append( ";" ).append( newLine );
        }
        builder.append( "\t\t\tdefault:" ).append( newLine ).append( "\t\t\t\treturn null;" ).append( newLine );
        builder.append( "\t\t}" ).append( newLine ).append( "\t}" ).append( newLine ).append( newLine );

        //
        // generate set(integer, object)
        //
        builder.append( "\t@Override" ).append( newLine );
        builder.append( "\t@SuppressWarnings(\"ALL\")" ).append( newLine );
        builder.append( "\tpublic void set(final int n, @Nullable final Object object)" ).append( newLine )
                .append( "\t{" ).append( newLine );
        builder.append( "\t\tswitch(n + 1)" ).append( newLine ).append( "\t\t{" ).append( newLine );
        for ( int i = 1; i <= n; i++ )
        {
            builder.append( "\t\t\tcase " ).append( i ).append( ":" ).append( newLine );
            builder.append( "\t\t\t\tthis.t" ).append( i ).append( " = (T" ).append( i ).append( ") object;" )
                    .append( newLine );
        }
        builder.append( "\t\t\tdefault:" ).append( newLine ).append( "\t\t\t\treturn;" ).append( newLine );
        builder.append( "\t\t}" ).append( newLine ).append( "\t}" ).append( newLine );

        builder.append( "}" );
        final Path path = new File( "src/main/java/xyz/kvantum/semantik/tuple/Tuple_" + n + ".java" ).toPath();
        try
        {
            Files.write( path, builder.toString().getBytes( StandardCharsets.UTF_8 ), StandardOpenOption.WRITE,
                    StandardOpenOption.CREATE_NEW, StandardOpenOption.CREATE );
        } catch ( final IOException e )
        {
            e.printStackTrace();
        }
    }

}
