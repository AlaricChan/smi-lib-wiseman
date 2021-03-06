/*
 * Copyright 2005 Sun Microsystems, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id: FilteringNotSupportedFault.java,v 1.2 2006/05/01 23:32:22 akhilarora Exp $
 */

package com.sun.ws.management.eventing;

import com.sun.ws.management.soap.SenderFault;
import javax.xml.namespace.QName;
import org.w3c.dom.Node;

public class FilteringNotSupportedFault extends SenderFault {
    
    public static final QName FILTERING_NOT_SUPPORTED = 
            new QName(Eventing.NS_URI, "FilteringNotSupported", Eventing.NS_PREFIX);
    public static final String FILTERING_NOT_SUPPORTED_REASON =
            "Filtering over the event source is not supported.";
    
    public FilteringNotSupportedFault(final Node... details) {
        super(Eventing.FAULT_ACTION_URI, FILTERING_NOT_SUPPORTED,
                FILTERING_NOT_SUPPORTED_REASON, details);
    }
}
