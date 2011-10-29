package jrds.caching;

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

/**
 * This serves as a placeholder in a double linked list. You can extend this to
 * add functionality. This allows you to remove in constant time from a linked
 * list.
 * <p>
 * It simply holds the payload and a reference to the items before and after it
 * in the list.
 */
abstract class LRUElementDescriptor<K,V>
{

    private final V payload;
    private final K key;

    /** Double Linked list references */
    public LRUElementDescriptor<K,V> prev;

    /** Double Linked list references */
    public LRUElementDescriptor<K,V> next;

    /**
     * @param payloadP
     */
    public LRUElementDescriptor(K key,  V payload )
    {
        this.payload = payload;
        this.key = key;
    }

    /**
     * @return the payload
     */
    V getPayload() {
        return payload;
    }

    /**
     * @return the key
     */
    K getKey() {
        return key;
    }

}
