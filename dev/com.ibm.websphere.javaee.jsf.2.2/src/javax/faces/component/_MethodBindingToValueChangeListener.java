/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package javax.faces.component;

import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 * Converts a MethodBinding to a ValueChangeListener
 */
class _MethodBindingToValueChangeListener extends _MethodBindingToListener implements ValueChangeListener
{

    public _MethodBindingToValueChangeListener()
    {
        super();
    }

    public _MethodBindingToValueChangeListener(MethodBinding methodBinding)
    {
        super(methodBinding);
    }

    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException
    {
        invokeMethodBinding(event);
    }

}
