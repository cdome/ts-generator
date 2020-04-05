/*
 * Copyright 2017 Alicia Boya García
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

package me.ntrrgc.tsGenerator

import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.KType

/**
 * A TypeScript generator comment generator.
 *
 * Allows to customize how typescript structures (interfaces, methods, properties) are documented when transformed from
 * Kotlin to TypeScript.
 */
interface CommentGenerator {


    /**
     * Returns the property comment that will be included in the
     * definition.
     *
     * If it returns null, no comment will we attached to the given property
     *
     * @param property The actual property of the class.
     * @param klass Class the property comes from.
     */
    fun generatePropertyComment(property: KProperty<*>, klass: KClass<*>): String? {
        return null
    }

}