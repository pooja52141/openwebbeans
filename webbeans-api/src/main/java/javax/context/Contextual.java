/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package javax.context;

import javax.inject.CreationException;

/**
 * Each webbeans instance that is contained in the <code>Context</code>
 * must be defined as <code>Contextual</code>.
 * 
 * This interface defines the creating and destroying of the webbeans instances
 * that are contained in the its {@link Context} instance.
 * 
 * @param <T> type of the webbeans component
 * @see Context
 */
public interface Contextual<T>
{
    /**
     * Creates and returns a new instance of the webbeans component.
     * 
     * @param context new creational context instance
     * @return the new instance of the webbeans component
     * @throws CreationException if any exception occurs
     */
    public T create(CreationalContext<T> context);

    /**
     * Destroys the instance. Any destroy logic is encapsulated
     * in this method.
     * 
     * @param instance already created webbeans instance
     */
    public void destroy(T instance);
}
